package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ReadOnlyClassToSerializerMap {
    private final Bucket[] _buckets;
    private final int _mask;
    private final int _size;

    public static final class Bucket {
        public final Class<?> _class;
        public final boolean _isTyped;
        public final JavaType _type;
        public final Bucket next;
        public final JsonSerializer<Object> value;

        public Bucket(Bucket bucket, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.next = bucket;
            this.value = jsonSerializer;
            this._isTyped = typeKey.isTyped();
            this._class = typeKey.getRawType();
            this._type = typeKey.getType();
        }

        public boolean matchesTyped(Class<?> cls) {
            return this._class == cls && this._isTyped;
        }

        public boolean matchesUntyped(Class<?> cls) {
            return this._class == cls && !this._isTyped;
        }

        public boolean matchesTyped(JavaType javaType) {
            return this._isTyped && javaType.equals(this._type);
        }

        public boolean matchesUntyped(JavaType javaType) {
            return !this._isTyped && javaType.equals(this._type);
        }
    }

    public ReadOnlyClassToSerializerMap(Map<TypeKey, JsonSerializer<Object>> map) {
        int findSize = findSize(map.size());
        this._size = findSize;
        this._mask = findSize - 1;
        Bucket[] bucketArr = new Bucket[findSize];
        for (Map.Entry<TypeKey, JsonSerializer<Object>> entry : map.entrySet()) {
            TypeKey key = entry.getKey();
            int hashCode = key.hashCode() & this._mask;
            bucketArr[hashCode] = new Bucket(bucketArr[hashCode], key, entry.getValue());
        }
        this._buckets = bucketArr;
    }

    private static final int findSize(int i2) {
        int i3 = 8;
        while (i3 < (i2 <= 64 ? i2 + i2 : i2 + (i2 >> 2))) {
            i3 += i3;
        }
        return i3;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap<TypeKey, JsonSerializer<Object>> hashMap) {
        return new ReadOnlyClassToSerializerMap(hashMap);
    }

    public int size() {
        return this._size;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.typedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesTyped(javaType)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesTyped(javaType));
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(javaType) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesUntyped(javaType)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesUntyped(javaType));
        return bucket.value;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.typedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesTyped(cls)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesTyped(cls));
        return bucket.value;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        Bucket bucket = this._buckets[TypeKey.untypedHash(cls) & this._mask];
        if (bucket == null) {
            return null;
        }
        if (bucket.matchesUntyped(cls)) {
            return bucket.value;
        }
        do {
            bucket = bucket.next;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.matchesUntyped(cls));
        return bucket.value;
    }
}
