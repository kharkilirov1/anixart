package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzaw implements com.google.android.play.core.splitinstall.zzh {

    /* renamed from: a */
    public final Context f20124a;

    /* renamed from: b */
    public final com.google.android.play.core.splitcompat.zze f20125b;

    /* renamed from: c */
    public final zzay f20126c;

    /* renamed from: d */
    public final Executor f20127d;

    public zzaw(Context context, Executor executor, zzay zzayVar, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitcompat.zzr zzrVar) {
        this.f20124a = context;
        this.f20125b = zzeVar;
        this.f20126c = zzayVar;
        this.f20127d = executor;
    }

    @Override // com.google.android.play.core.splitinstall.zzh
    /* renamed from: a */
    public final void mo10845a(List<Intent> list, com.google.android.play.core.splitinstall.zzf zzfVar) {
        if (!(SplitCompat.f20186e.get() != null)) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f20127d.execute(new zzav(this, list, zzfVar));
    }
}
