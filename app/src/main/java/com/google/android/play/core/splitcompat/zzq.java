package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzq implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Set f20214b;

    /* renamed from: c */
    public final /* synthetic */ SplitCompat f20215c;

    public zzq(SplitCompat splitCompat, Set set) {
        this.f20215c = splitCompat;
        this.f20214b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SplitCompat splitCompat = this.f20215c;
            Set<String> set = this.f20214b;
            AtomicReference<SplitCompat> atomicReference = SplitCompat.f20186e;
            splitCompat.m10936a(set);
        } catch (Exception e2) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e2);
        }
    }
}
