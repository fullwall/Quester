package net.apunch.quester;

import java.util.ArrayList;
import java.util.List;

import net.citizensnpcs.api.exception.NPCLoadException;
import net.citizensnpcs.api.npc.character.Character;
import net.citizensnpcs.api.util.DataKey;

/**
 * Represents a Quester NPC character.
 */
public class Quester extends Character {
    private final List<Quest> quests = new ArrayList<Quest>();

    @Override
    public void load(DataKey key) throws NPCLoadException {
    }

    @Override
    public void save(DataKey key) {
    }

    public void addToQueue(Quest quest) {
        quests.add(quest);
    }

    public void endQuest(String name) {
        if (hasQuest(name))
            quests.remove(name);
    }

    public boolean hasQuest(String name) {
        for (Quest quest : quests)
            if (quest.getName().equals(name))
                return true;

        return false;
    }
}