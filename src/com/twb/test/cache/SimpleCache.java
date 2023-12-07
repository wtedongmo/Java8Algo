package com.twb.test.cache;

public interface SimpleCache {

    void add(String key, Object value, long periodInMillis);
    void add(String key, Object value);

    void remove(String key);

    Object get(String key);

    void clear();

    long size();
}
