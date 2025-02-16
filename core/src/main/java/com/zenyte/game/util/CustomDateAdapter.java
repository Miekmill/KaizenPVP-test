package com.zenyte.game.util;

import com.google.gson.*;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateAdapter implements JsonDeserializer<Date> {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMM d, yyyy, h:mm:ss a");

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String dateString = json.getAsString();
        try {
            return DATE_FORMAT.parse(dateString);
        } catch (Exception e) {
            // If parsing fails, return null or handle it as needed
            return null;
        }
    }
}
