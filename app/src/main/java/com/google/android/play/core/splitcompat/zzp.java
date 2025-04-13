package com.google.android.play.core.splitcompat;

import android.util.Log;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzp implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SplitCompat f20213b;

    public zzp(SplitCompat splitCompat) {
        this.f20213b = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f20213b.f20187a.m10948d();
        } catch (Exception e2) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e2);
        }
    }
}
