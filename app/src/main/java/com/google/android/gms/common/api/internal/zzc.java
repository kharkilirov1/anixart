package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzc implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LifecycleCallback f15612b;

    /* renamed from: c */
    public final /* synthetic */ String f15613c;

    /* renamed from: d */
    public final /* synthetic */ zzd f15614d;

    public zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f15614d = zzdVar;
        this.f15612b = lifecycleCallback;
        this.f15613c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f15614d;
        if (zzdVar.f15617c > 0) {
            LifecycleCallback lifecycleCallback = this.f15612b;
            Bundle bundle = zzdVar.f15618d;
            lifecycleCallback.mo7997e(bundle != null ? bundle.getBundle(this.f15613c) : null);
        }
        if (this.f15614d.f15617c >= 2) {
            this.f15612b.mo8001i();
        }
        if (this.f15614d.f15617c >= 3) {
            this.f15612b.mo7999g();
        }
        if (this.f15614d.f15617c >= 4) {
            this.f15612b.mo8002j();
        }
        if (this.f15614d.f15617c >= 5) {
            this.f15612b.mo7998f();
        }
    }
}
