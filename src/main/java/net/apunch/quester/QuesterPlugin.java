package net.apunch.quester;

import java.util.logging.Level;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.character.CharacterFactory;

import org.bukkit.plugin.java.JavaPlugin;

public class QuesterPlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, " v" + getDescription().getVersion() + " disabled.");
    }

    @Override
    public void onEnable() {
        CitizensAPI.getCharacterManager().registerCharacter(new CharacterFactory(Quester.class).withName("quester"));

        getLogger().log(Level.INFO, " v" + getDescription().getVersion() + " enabled.");
    }
}