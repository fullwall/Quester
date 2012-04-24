package net.citizensnpcs.quester.preconditions;

import net.citizensnpcs.quester.QuestContext;

public interface Precondition {
    boolean accepts(QuestContext ctx);
}
