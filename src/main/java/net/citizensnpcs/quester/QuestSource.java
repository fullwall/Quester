package net.citizensnpcs.quester;

import java.util.Collection;

public interface QuestSource {
    public Collection<QuestDescriptor> loadDescriptors();
}
