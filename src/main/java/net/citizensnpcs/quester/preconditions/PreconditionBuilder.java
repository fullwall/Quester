package net.citizensnpcs.quester.preconditions;

import net.citizensnpcs.api.util.DataKey;

public interface PreconditionBuilder {
    Precondition parse(String input);

    Precondition parse(DataKey input);
}
