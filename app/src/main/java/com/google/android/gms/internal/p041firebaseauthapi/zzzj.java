package com.google.android.gms.internal.p041firebaseauthapi;

import okhttp3.internal.http2.Settings;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzj {

    /* renamed from: a */
    public final Object f17148a;

    /* renamed from: b */
    public final int f17149b;

    public zzzj(Object obj, int i2) {
        this.f17148a = obj;
        this.f17149b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzj)) {
            return false;
        }
        zzzj zzzjVar = (zzzj) obj;
        return this.f17148a == zzzjVar.f17148a && this.f17149b == zzzjVar.f17149b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f17148a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f17149b;
    }
}
