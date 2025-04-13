package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ui */
/* loaded from: classes2.dex */
public class C3674Ui {

    /* renamed from: a */
    public final long f44187a;

    public C3674Ui(long j2) {
        this.f44187a = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3674Ui.class == obj.getClass() && this.f44187a == ((C3674Ui) obj).f44187a;
    }

    public int hashCode() {
        long j2 = this.f44187a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("StatSending{disabledReportingInterval=");
        m24u.append(this.f44187a);
        m24u.append('}');
        return m24u.toString();
    }
}
