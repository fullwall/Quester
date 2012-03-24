package net.apunch.quester;

import org.bukkit.entity.Player;

import net.citizensnpcs.api.npc.NPC;

/**
 * Represents a Quest.
 */
public class Quest {
    private final Quester quester;
    private final Player player;
    private final String name;
    private final QuestConversation conversation;

    private boolean active;

    public Quest(String name, NPC npc, Player player, QuestConversation conversation) {
        this.name = name;
        if (!npc.getCharacter().getName().equals("quester"))
            throw new IllegalArgumentException("NPC must be a quester.");
        this.quester = (Quester) npc.getCharacter();
        this.player = player;
        this.conversation = conversation;
    }

    public String getName() {
        return name;
    }

    public void end() {
        if (active)
            quester.endQuest(name);
        // Notify the conversation to attempt to execute the next prompt
        conversation.next(player);
    }

    public void start() {
        if (!active)
            quester.addToQueue(this);
    }
}