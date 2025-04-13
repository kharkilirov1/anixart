package com.google.android.play.core.missingsplits;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import com.google.android.play.core.internal.zzag;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb implements MissingSplitsManager {

    /* renamed from: e */
    public static final zzag f20173e = new zzag("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f20174a;

    /* renamed from: b */
    public final Runtime f20175b;

    /* renamed from: c */
    public final zza f20176c;

    /* renamed from: d */
    public final AtomicReference<Boolean> f20177d;

    public zzb(Context context, Runtime runtime, zza zzaVar, AtomicReference<Boolean> atomicReference) {
        this.f20174a = context;
        this.f20175b = runtime;
        this.f20176c = zzaVar;
        this.f20177d = atomicReference;
    }

    @TargetApi
    /* renamed from: a */
    public final List<ActivityManager.AppTask> m10932a() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f20174a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }
}
