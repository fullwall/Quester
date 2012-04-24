package net.citizensnpcs.quester;

import org.bukkit.command.CommandSender;

public interface QuestDescriptor {
    String getName();

    void describe(CommandSender sender);
}
