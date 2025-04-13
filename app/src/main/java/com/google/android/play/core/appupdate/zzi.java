package com.google.android.play.core.appupdate;

import com.google.android.play.core.internal.zzcs;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzi implements zzcs<AppUpdateManager> {

    /* renamed from: a */
    public final zzcs<zzf> f19617a;

    public zzi(zzcs<zzf> zzcsVar) {
        this.f19617a = zzcsVar;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final AppUpdateManager mo10658u() {
        zzf mo10658u = this.f19617a.mo10658u();
        Objects.requireNonNull(mo10658u, "Cannot return null from a non-@Nullable @Provides method");
        return mo10658u;
    }
}
