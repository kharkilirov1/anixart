package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zza implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LifecycleCallback f15605b;

    /* renamed from: c */
    public final /* synthetic */ String f15606c;

    /* renamed from: d */
    public final /* synthetic */ zzb f15607d;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f15607d = zzbVar;
        this.f15605b = lifecycleCallback;
        this.f15606c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.f15607d;
        if (zzbVar.f15610c > 0) {
            LifecycleCallback lifecycleCallback = this.f15605b;
            Bundle bundle = zzbVar.f15611d;
            lifecycleCallback.mo7997e(bundle != null ? bundle.getBundle(this.f15606c) : null);
        }
        if (this.f15607d.f15610c >= 2) {
            this.f15605b.mo8001i();
        }
        if (this.f15607d.f15610c >= 3) {
            this.f15605b.mo7999g();
        }
        if (this.f15607d.f15610c >= 4) {
            this.f15605b.mo8002j();
        }
        if (this.f15607d.f15610c >= 5) {
            this.f15605b.mo7998f();
        }
    }
}
