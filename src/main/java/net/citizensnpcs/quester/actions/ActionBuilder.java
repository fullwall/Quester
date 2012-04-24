package net.citizensnpcs.quester.actions;

import net.citizensnpcs.api.util.DataKey;

public interface ActionBuilder {
    Action parse(String input);

    Action parse(DataKey input);
}
