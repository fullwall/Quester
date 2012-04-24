package net.citizensnpcs.quester;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class QuestRegistry {
    private final Map<String, QuestDescriptor> quests = Maps.newHashMap();
    private final Set<QuestSource> sources = Sets.newHashSet();

    public QuestDescriptor find(String name) {
        return quests.get(name);
    }

    public void registerQuestSource(QuestSource source) {
        sources.add(source);
    }

    public void load() {
        quests.clear();
        for (QuestSource source : sources) {
            for (QuestDescriptor descriptor : source.loadDescriptors()) {
                quests.put(descriptor.getName(), descriptor);
            }
        }
    }
}
