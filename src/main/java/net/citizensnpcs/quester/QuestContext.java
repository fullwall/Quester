package net.citizensnpcs.quester;

import java.util.Map;

import org.apache.commons.lang.Validate;

import com.google.common.collect.Maps;

public class QuestContext {
    private final Map<String, Object> context = Maps.newHashMap();

    public void set(String key, Object value) {
        Validate.notNull(key, "key cannot be null");
        if (key.contains("."))
            throw new IllegalArgumentException("key cannot contain '.'");
        if (!(value instanceof Number) || !(value instanceof String))
            return;
        context.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) context.get(key);
    }
}
