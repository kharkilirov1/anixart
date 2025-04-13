package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ye */
/* loaded from: classes2.dex */
public class C4444ye {

    /* renamed from: a */
    private final String f47001a;

    /* renamed from: b */
    private final String f47002b;

    public C4444ye(String str) {
        this(str, null);
    }

    /* renamed from: a */
    public String m21201a() {
        return this.f47002b;
    }

    /* renamed from: b */
    public String m21203b() {
        return this.f47001a;
    }

    public C4444ye(String str, String str2) {
        this.f47001a = str;
        this.f47002b = m21202a(str2);
    }

    /* renamed from: a */
    public final String m21202a(String str) {
        return str != null ? C0000a.m20q(new StringBuilder(), this.f47001a, str) : this.f47001a;
    }
}
