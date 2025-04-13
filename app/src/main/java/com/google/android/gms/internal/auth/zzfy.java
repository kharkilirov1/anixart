package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfy {

    /* renamed from: c */
    public static final zzfy f16140c = new zzfy();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, zzgb<?>> f16142b = new ConcurrentHashMap();

    /* renamed from: a */
    public final zzgc f16141a = new zzfi();

    /* renamed from: a */
    public final <T> zzgb<T> m8469a(Class<T> cls) {
        Charset charset = zzev.f16107a;
        Objects.requireNonNull(cls, "messageType");
        zzgb<T> zzgbVar = (zzgb) this.f16142b.get(cls);
        if (zzgbVar == null) {
            zzgbVar = this.f16141a.mo8427a(cls);
            Objects.requireNonNull(zzgbVar, "schema");
            zzgb<T> zzgbVar2 = (zzgb) this.f16142b.putIfAbsent(cls, zzgbVar);
            if (zzgbVar2 != null) {
                return zzgbVar2;
            }
        }
        return zzgbVar;
    }
}
