package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.h6 */
/* loaded from: classes2.dex */
public class C3994h6 {

    /* renamed from: a */
    private boolean f45256a;

    /* renamed from: b */
    @NonNull
    private Set<Integer> f45257b;

    /* renamed from: c */
    private int f45258c;

    /* renamed from: d */
    private int f45259d;

    public C3994h6() {
        this(false, 0, 0, new HashSet());
    }

    /* renamed from: a */
    public void m19998a() {
        this.f45257b = new HashSet();
        this.f45259d = 0;
    }

    @NonNull
    /* renamed from: b */
    public Set<Integer> m20001b() {
        return this.f45257b;
    }

    /* renamed from: c */
    public int m20003c() {
        return this.f45259d;
    }

    /* renamed from: d */
    public int m20004d() {
        return this.f45258c;
    }

    /* renamed from: e */
    public boolean m20005e() {
        return this.f45256a;
    }

    public C3994h6(boolean z, int i2, int i3, @NonNull Set<Integer> set) {
        this.f45256a = z;
        this.f45257b = set;
        this.f45258c = i2;
        this.f45259d = i3;
    }

    /* renamed from: b */
    public void m20002b(int i2) {
        this.f45258c = i2;
        this.f45259d = 0;
    }

    /* renamed from: a */
    public void m20000a(boolean z) {
        this.f45256a = z;
    }

    /* renamed from: a */
    public void m19999a(int i2) {
        this.f45257b.add(Integer.valueOf(i2));
        this.f45259d++;
    }
}
