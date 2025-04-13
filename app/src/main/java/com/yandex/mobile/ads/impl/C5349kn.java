package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.kn */
/* loaded from: classes3.dex */
public final class C5349kn {

    /* renamed from: c */
    public static final C5349kn f52038c = new C5349kn(Collections.emptyMap());

    /* renamed from: a */
    private int f52039a;

    /* renamed from: b */
    private final Map<String, byte[]> f52040b;

    public C5349kn() {
        this(Collections.emptyMap());
    }

    /* renamed from: a */
    public final C5349kn m26169a(C5643qk c5643qk) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f52040b);
        List<String> m27746b = c5643qk.m27746b();
        boolean z = false;
        for (int i2 = 0; i2 < m27746b.size(); i2++) {
            hashMap.remove(m27746b.get(i2));
        }
        for (Map.Entry<String, Object> entry : c5643qk.m27745a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bArr = ((String) value).getBytes(C5285jh.f51608c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value;
            }
            hashMap.put(key, bArr);
        }
        Map<String, byte[]> map = this.f52040b;
        if (map.size() == hashMap.size()) {
            Iterator<Map.Entry<String, byte[]>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Map.Entry<String, byte[]> next = it.next();
                if (!Arrays.equals(next.getValue(), (byte[]) hashMap.get(next.getKey()))) {
                    break;
                }
            }
        }
        return z ? this : new C5349kn(hashMap);
    }

    /* renamed from: b */
    public final long m26171b() {
        byte[] bArr = this.f52040b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    @Nullable
    /* renamed from: c */
    public final String m26172c() {
        byte[] bArr = this.f52040b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, C5285jh.f51608c);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5349kn.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f52040b;
        Map<String, byte[]> map2 = ((C5349kn) obj).f52040b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f52039a == 0) {
            int i2 = 0;
            for (Map.Entry<String, byte[]> entry : this.f52040b.entrySet()) {
                i2 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f52039a = i2;
        }
        return this.f52039a;
    }

    public C5349kn(Map<String, byte[]> map) {
        this.f52040b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Set<Map.Entry<String, byte[]>> m26170a() {
        return this.f52040b.entrySet();
    }
}
