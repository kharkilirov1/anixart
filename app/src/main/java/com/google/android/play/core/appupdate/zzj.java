package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.internal.zzcs;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzj implements zzcs<Context> {

    /* renamed from: a */
    public final zzh f19618a;

    public zzj(zzh zzhVar) {
        this.f19618a = zzhVar;
    }

    /* renamed from: a */
    public final Context m10660a() {
        Context context = this.f19618a.f19616a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final Context mo10658u() {
        Context context = this.f19618a.f19616a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
