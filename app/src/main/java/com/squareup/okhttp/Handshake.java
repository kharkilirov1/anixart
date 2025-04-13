package com.squareup.okhttp;

import androidx.room.util.C0576a;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: a */
    public final String f24846a;

    /* renamed from: b */
    public final List<Certificate> f24847b;

    /* renamed from: c */
    public final List<Certificate> f24848c;

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return this.f24846a.equals(handshake.f24846a) && this.f24847b.equals(handshake.f24847b) && this.f24848c.equals(handshake.f24848c);
    }

    public int hashCode() {
        return this.f24848c.hashCode() + ((this.f24847b.hashCode() + C0576a.m4107f(this.f24846a, 527, 31)) * 31);
    }
}
