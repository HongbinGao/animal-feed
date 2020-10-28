package com.animal.feed.utils;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Utils --- gson
 *
 * @author wangyp
 * @since 22 June 2020
 */
public class GsonUtils {

    private static final Map<String, Gson> GSON_UTIL_MAP = new HashMap<>();

    private static final String KEY_TO_JSON = "to_json_source";

    private static final String KEY_PARSE_JSON = "parse_json";

    /**
     * to json
     *
     * @param source Object
     * @return json
     */
    public static String toJson(Object source) {
        GSON_UTIL_MAP.putIfAbsent(KEY_TO_JSON, new Gson());
        return GSON_UTIL_MAP.get(KEY_TO_JSON).toJson(source);
    }

    /**
     * parse Object
     *
     * @param json  json
     * @param clazz class
     * @param <T>   <T>
     * @return Object
     */
    public static <T> T parseJson(String json, Class<T> clazz) {
        GSON_UTIL_MAP.putIfAbsent(KEY_PARSE_JSON, new Gson());
        return GSON_UTIL_MAP.get(KEY_TO_JSON).fromJson(json, clazz);
    }

}
