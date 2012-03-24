package net.apunch.quester;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.conversations.Conversation;
import org.bukkit.entity.Player;

/**
 * Handles conversations between the quester and the player.
 */
public class QuestConversation {
    private final List<Conversation> conversations = new ArrayList<Conversation>();
    private int current = 0;

    public void next(Player player) {
        conversations.get(++current).begin();
    }
}