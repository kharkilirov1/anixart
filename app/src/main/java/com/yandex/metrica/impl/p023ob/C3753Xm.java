package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressLint
/* renamed from: com.yandex.metrica.impl.ob.Xm */
/* loaded from: classes2.dex */
public class C3753Xm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f44521a;

    /* renamed from: b */
    private int f44522b;

    /* renamed from: c */
    private int f44523c;

    /* renamed from: d */
    private int f44524d;

    /* renamed from: e */
    private int f44525e;

    /* renamed from: f */
    private int f44526f;

    /* renamed from: g */
    private int f44527g;

    public C3753Xm(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f44523c = i2;
        this.f44521a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private int m19405b(K k2, V v) {
        int length = C3509O2.m18658c(((C3751Xk) k2).f44519b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k2 + "=" + v);
    }

    /* renamed from: a */
    public final synchronized V m19406a(K k2) {
        V v = this.f44521a.get(k2);
        if (v != null) {
            this.f44526f++;
            return v;
        }
        this.f44527g++;
        return null;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f44526f;
        i3 = this.f44527g + i2;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f44523c), Integer.valueOf(this.f44526f), Integer.valueOf(this.f44527g), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }

    /* renamed from: a */
    public final synchronized V m19407a(K k2, V v) {
        V put;
        this.f44524d++;
        this.f44522b += m19405b(k2, v);
        put = this.f44521a.put(k2, v);
        if (put != null) {
            this.f44522b -= m19405b(k2, put);
        }
        m19404a(this.f44523c);
        return put;
    }

    /* renamed from: a */
    private void m19404a(int i2) {
        Map.Entry<K, V> next;
        while (this.f44522b > i2 && !this.f44521a.isEmpty() && (next = this.f44521a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f44521a.remove(key);
            this.f44522b -= m19405b(key, value);
            this.f44525e++;
        }
        if (this.f44522b < 0 || (this.f44521a.isEmpty() && this.f44522b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized void m19408a() {
        m19404a(-1);
    }
}
