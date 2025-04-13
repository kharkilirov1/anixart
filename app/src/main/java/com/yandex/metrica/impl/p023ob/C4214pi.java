package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.pi */
/* loaded from: classes2.dex */
public class C4214pi {

    /* renamed from: a */
    public final long f46203a;

    /* renamed from: b */
    public final long f46204b;

    /* renamed from: c */
    public final long f46205c;

    /* renamed from: d */
    public final long f46206d;

    public C4214pi(long j2, long j3, long j4, long j5) {
        this.f46203a = j2;
        this.f46204b = j3;
        this.f46205c = j4;
        this.f46206d = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4214pi.class != obj.getClass()) {
            return false;
        }
        C4214pi c4214pi = (C4214pi) obj;
        return this.f46203a == c4214pi.f46203a && this.f46204b == c4214pi.f46204b && this.f46205c == c4214pi.f46205c && this.f46206d == c4214pi.f46206d;
    }

    public int hashCode() {
        long j2 = this.f46203a;
        long j3 = this.f46204b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f46205c;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f46206d;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("CacheControl{cellsAroundTtl=");
        m24u.append(this.f46203a);
        m24u.append(", wifiNetworksTtl=");
        m24u.append(this.f46204b);
        m24u.append(", lastKnownLocationTtl=");
        m24u.append(this.f46205c);
        m24u.append(", netInterfacesTtl=");
        m24u.append(this.f46206d);
        m24u.append('}');
        return m24u.toString();
    }
}
