package com.google.android.play.core.splitinstall;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzw implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SplitInstallSessionState f20296b;

    /* renamed from: c */
    public final /* synthetic */ int f20297c;

    /* renamed from: d */
    public final /* synthetic */ int f20298d;

    /* renamed from: e */
    public final /* synthetic */ zzx f20299e;

    public zzw(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, int i2, int i3) {
        this.f20299e = zzxVar;
        this.f20296b = splitInstallSessionState;
        this.f20297c = i2;
        this.f20298d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.f20299e;
        SplitInstallSessionState splitInstallSessionState = this.f20296b;
        zzxVar.m10996g(new zza(splitInstallSessionState.mo10965g(), this.f20297c, this.f20298d, splitInstallSessionState.mo10960a(), splitInstallSessionState.mo10967i(), splitInstallSessionState.mo10969k(), splitInstallSessionState.mo10968j(), splitInstallSessionState.mo10964f(), splitInstallSessionState.mo10970l()));
    }
}
