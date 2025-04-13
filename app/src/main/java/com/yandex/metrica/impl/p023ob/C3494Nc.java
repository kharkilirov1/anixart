package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Nc */
/* loaded from: classes2.dex */
public class C3494Nc {

    /* renamed from: a */
    public final long f43465a;

    /* renamed from: b */
    public final long f43466b;

    public C3494Nc(long j2, long j3) {
        this.f43465a = j2;
        this.f43466b = j3;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("IntervalRange{minInterval=");
        m24u.append(this.f43465a);
        m24u.append(", maxInterval=");
        m24u.append(this.f43466b);
        m24u.append('}');
        return m24u.toString();
    }
}
