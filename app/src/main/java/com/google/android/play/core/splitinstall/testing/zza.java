package com.google.android.play.core.splitinstall.testing;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza extends zzs {

    /* renamed from: a */
    public Integer f20231a;

    /* renamed from: b */
    public Map<String, Integer> f20232b;

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    /* renamed from: a */
    public final zzs mo10976a(int i2) {
        this.f20231a = Integer.valueOf(i2);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    /* renamed from: b */
    public final zzs mo10977b(Map<String, Integer> map) {
        Objects.requireNonNull(map, "Null splitInstallErrorCodeByModule");
        this.f20232b = map;
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    /* renamed from: c */
    public final zzt mo10978c() {
        Map<String, Integer> map = this.f20232b;
        if (map != null) {
            return new zzc(this.f20231a, map);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzs
    /* renamed from: d */
    public final Map<String, Integer> mo10979d() {
        Map<String, Integer> map = this.f20232b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
