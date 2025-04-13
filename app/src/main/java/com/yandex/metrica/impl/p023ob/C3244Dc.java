package com.yandex.metrica.impl.p023ob;

import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Dc */
/* loaded from: classes2.dex */
public class C3244Dc {

    /* renamed from: a */
    public final long f42710a;

    /* renamed from: b */
    public final long f42711b;

    public C3244Dc(long j2, long j3) {
        this.f42710a = j2;
        this.f42711b = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3244Dc.class != obj.getClass()) {
            return false;
        }
        C3244Dc c3244Dc = (C3244Dc) obj;
        return this.f42710a == c3244Dc.f42710a && this.f42711b == c3244Dc.f42711b;
    }

    public int hashCode() {
        long j2 = this.f42710a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.f42711b;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ForcedCollectingArguments{durationSeconds=");
        m24u.append(this.f42710a);
        m24u.append(", intervalSeconds=");
        m24u.append(this.f42711b);
        m24u.append('}');
        return m24u.toString();
    }
}
