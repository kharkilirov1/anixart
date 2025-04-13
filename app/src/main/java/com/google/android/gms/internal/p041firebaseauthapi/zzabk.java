package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabk {

    /* renamed from: c */
    public static final zzabk f16313c = new zzabk();

    /* renamed from: b */
    public final ConcurrentMap f16315b = new ConcurrentHashMap();

    /* renamed from: a */
    public final zzabp f16314a = new zzaau();

    /* renamed from: a */
    public final zzabo m8674a(Class cls) {
        Charset charset = zzaad.f16259a;
        Objects.requireNonNull(cls, "messageType");
        zzabo zzaboVar = (zzabo) this.f16315b.get(cls);
        if (zzaboVar == null) {
            zzaboVar = this.f16314a.mo8604a(cls);
            Objects.requireNonNull(zzaboVar, "schema");
            zzabo zzaboVar2 = (zzabo) this.f16315b.putIfAbsent(cls, zzaboVar);
            if (zzaboVar2 != null) {
                return zzaboVar2;
            }
        }
        return zzaboVar;
    }
}
