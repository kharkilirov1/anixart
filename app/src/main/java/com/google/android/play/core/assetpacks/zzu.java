package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzu implements com.google.android.play.core.internal.zzcs<Context> {

    /* renamed from: a */
    public final zzp f20075a;

    public zzu(zzp zzpVar) {
        this.f20075a = zzpVar;
    }

    /* renamed from: a */
    public final Context m10820a() {
        Context context = this.f20075a.f20068a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final Context mo10658u() {
        Context context = this.f20075a.f20068a;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }
}
