package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzaaw extends LinkedHashMap {

    /* renamed from: c */
    public static final zzaaw f16286c;

    /* renamed from: b */
    public boolean f16287b;

    static {
        zzaaw zzaawVar = new zzaaw();
        f16286c = zzaawVar;
        zzaawVar.f16287b = false;
    }

    public zzaaw() {
        this.f16287b = true;
    }

    /* renamed from: a */
    public static zzaaw m8605a() {
        return f16286c;
    }

    /* renamed from: c */
    public static int m8606c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof zzzz) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = zzaad.f16259a;
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
    public final zzaaw m8607b() {
        return isEmpty() ? new zzaaw() : new zzaaw(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m8608d();
        super.clear();
    }

    /* renamed from: d */
    public final void m8608d() {
        if (!this.f16287b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
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
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
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
        for (Map.Entry entry : entrySet()) {
            i2 += m8606c(entry.getValue()) ^ m8606c(entry.getKey());
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m8608d();
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m8608d();
        for (Object obj : map.keySet()) {
            Charset charset = zzaad.f16259a;
            Objects.requireNonNull(obj);
            Objects.requireNonNull(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m8608d();
        return super.remove(obj);
    }

    public zzaaw(Map map) {
        super(map);
        this.f16287b = true;
    }
}
