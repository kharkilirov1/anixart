package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzfk<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final zzfk f16118c;

    /* renamed from: b */
    public boolean f16119b;

    static {
        zzfk zzfkVar = new zzfk();
        f16118c = zzfkVar;
        zzfkVar.f16119b = false;
    }

    public zzfk() {
        this.f16119b = true;
    }

    /* renamed from: a */
    public static int m8428a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzes) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzev.f16107a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    /* renamed from: b */
    public final void m8429b() {
        if (!this.f16119b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8429b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i2 += m8428a(entry.getValue()) ^ m8428a(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        m8429b();
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m8429b();
        for (K k2 : map.keySet()) {
            Charset charset = zzev.f16107a;
            Objects.requireNonNull(k2);
            Objects.requireNonNull(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m8429b();
        return (V) super.remove(obj);
    }

    public zzfk(Map<K, V> map) {
        super(map);
        this.f16119b = true;
    }
}
