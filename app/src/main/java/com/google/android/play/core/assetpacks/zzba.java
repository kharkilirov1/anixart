package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzba implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zzbb f19718b;

    /* renamed from: c */
    public final /* synthetic */ AssetPackState f19719c;

    public /* synthetic */ zzba(zzbb zzbbVar, AssetPackState assetPackState) {
        this.f19718b = zzbbVar;
        this.f19719c = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19718b.m10929e(this.f19719c);
    }
}
