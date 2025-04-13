package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.billing_interface.a */
/* loaded from: classes2.dex */
public class C3115a {

    /* renamed from: a */
    @NonNull
    public final EnumC3119e f42392a;

    /* renamed from: b */
    @NonNull
    public final String f42393b;

    /* renamed from: c */
    @NonNull
    public final String f42394c;

    /* renamed from: d */
    public final long f42395d;

    /* renamed from: e */
    public long f42396e;

    public C3115a(@NonNull EnumC3119e enumC3119e, @NonNull String str, @NonNull String str2, long j2, long j3) {
        this.f42392a = enumC3119e;
        this.f42393b = str;
        this.f42394c = str2;
        this.f42395d = j2;
        this.f42396e = j3;
    }

    @NonNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("BillingInfo{type=");
        m24u.append(this.f42392a);
        m24u.append("sku='");
        m24u.append(this.f42393b);
        m24u.append("'purchaseToken='");
        m24u.append(this.f42394c);
        m24u.append("'purchaseTime=");
        m24u.append(this.f42395d);
        m24u.append("sendTime=");
        return C0000a.m19p(m24u, this.f42396e, "}");
    }
}
