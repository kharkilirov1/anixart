package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzs implements com.google.android.play.core.internal.zzcs<AssetPackManager> {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzcs<zzl> f20070a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzcs<Context> f20071b;

    public zzs(com.google.android.play.core.internal.zzcs<zzl> zzcsVar, com.google.android.play.core.internal.zzcs<Context> zzcsVar2) {
        this.f20070a = zzcsVar;
        this.f20071b = zzcsVar2;
    }

    @Override // com.google.android.play.core.internal.zzcs
    /* renamed from: u */
    public final AssetPackManager mo10658u() {
        zzl mo10658u = this.f20070a.mo10658u();
        Context m10820a = ((zzu) this.f20071b).m10820a();
        zzl zzlVar = mo10658u;
        com.google.android.play.core.internal.zzcd.m10886a(m10820a.getPackageManager(), new ComponentName(m10820a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        com.google.android.play.core.internal.zzcd.m10886a(m10820a.getPackageManager(), new ComponentName(m10820a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        Objects.requireNonNull(zzlVar, "Cannot return null from a non-@Nullable @Provides method");
        return zzlVar;
    }
}
