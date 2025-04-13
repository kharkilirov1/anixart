package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.gpllibrary.C3127a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Hc */
/* loaded from: classes2.dex */
public class C3344Hc {

    /* renamed from: a */
    @NonNull
    public final C3127a.b f43052a;

    /* renamed from: b */
    public final long f43053b;

    /* renamed from: c */
    public final long f43054c;

    public C3344Hc(@NonNull C3127a.b bVar, long j2, long j3) {
        this.f43052a = bVar;
        this.f43053b = j2;
        this.f43054c = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3344Hc.class != obj.getClass()) {
            return false;
        }
        C3344Hc c3344Hc = (C3344Hc) obj;
        return this.f43053b == c3344Hc.f43053b && this.f43054c == c3344Hc.f43054c && this.f43052a == c3344Hc.f43052a;
    }

    public int hashCode() {
        int hashCode = this.f43052a.hashCode() * 31;
        long j2 = this.f43053b;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f43054c;
        return i2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("GplArguments{priority=");
        m24u.append(this.f43052a);
        m24u.append(", durationSeconds=");
        m24u.append(this.f43053b);
        m24u.append(", intervalSeconds=");
        m24u.append(this.f43054c);
        m24u.append('}');
        return m24u.toString();
    }
}
