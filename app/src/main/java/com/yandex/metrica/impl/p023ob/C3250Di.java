package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Di */
/* loaded from: classes2.dex */
public class C3250Di {

    /* renamed from: a */
    public final long f42742a;

    /* renamed from: b */
    public final long f42743b;

    /* renamed from: c */
    public final long f42744c;

    /* renamed from: d */
    public final long f42745d;

    public C3250Di(long j2, long j3, long j4, long j5) {
        this.f42742a = j2;
        this.f42743b = j3;
        this.f42744c = j4;
        this.f42745d = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3250Di.class != obj.getClass()) {
            return false;
        }
        C3250Di c3250Di = (C3250Di) obj;
        return this.f42742a == c3250Di.f42742a && this.f42743b == c3250Di.f42743b && this.f42744c == c3250Di.f42744c && this.f42745d == c3250Di.f42745d;
    }

    public int hashCode() {
        long j2 = this.f42742a;
        long j3 = this.f42743b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f42744c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f42745d;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SdkFingerprintingConfig{minCollectingInterval=");
        m24u.append(this.f42742a);
        m24u.append(", minFirstCollectingDelay=");
        m24u.append(this.f42743b);
        m24u.append(", minCollectingDelayAfterLaunch=");
        m24u.append(this.f42744c);
        m24u.append(", minRequestRetryInterval=");
        m24u.append(this.f42745d);
        m24u.append('}');
        return m24u.toString();
    }
}
