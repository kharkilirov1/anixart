package com.google.protobuf;

import com.google.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c */
    public static final MapFieldLite f24269c;

    /* renamed from: b */
    public boolean f24270b;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f24269c = mapFieldLite;
        mapFieldLite.f24270b = false;
    }

    public MapFieldLite() {
        this.f24270b = true;
    }

    /* renamed from: a */
    public static int m13490a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Internal.EnumLite) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = Internal.f24210a;
        int length = bArr.length;
        int i2 = length;
        for (int i3 = 0; i3 < 0 + length; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: b */
    public final void m13491b() {
        if (!this.f24270b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public MapFieldLite<K, V> m13492c() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m13491b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto Lc
        La:
            r7 = 1
            goto L5b
        Lc:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L18
        L16:
            r7 = 0
            goto L5b
        L18:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i2 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i2 += m13490a(entry.getValue()) ^ m13490a(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        m13491b();
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(k2);
        Objects.requireNonNull(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m13491b();
        for (K k2 : map.keySet()) {
            Charset charset = Internal.f24210a;
            Objects.requireNonNull(k2);
            Objects.requireNonNull(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m13491b();
        return (V) super.remove(obj);
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
        this.f24270b = true;
    }
}
