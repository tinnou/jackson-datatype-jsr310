package com.fasterxml.jackson.datatype.jsr310.deser.key;

import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.DeserializationContext;

public class OffsetTimeKeyDeserializer extends Jsr310KeyDeserializer {

    public static final OffsetTimeKeyDeserializer INSTANCE = new OffsetTimeKeyDeserializer();

    private OffsetTimeKeyDeserializer() {
        // singleton
    }

    @Override
    protected OffsetTime deserialize(String key, DeserializationContext ctxt) {
        return OffsetTime.parse(key, DateTimeFormatter.ISO_OFFSET_TIME);
    }

}
