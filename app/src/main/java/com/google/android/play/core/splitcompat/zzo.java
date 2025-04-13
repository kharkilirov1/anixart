package com.google.android.play.core.splitcompat;

import android.content.Context;
import com.google.android.play.core.splitinstall.zzx;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzo implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f20212b;

    public zzo(Context context) {
        this.f20212b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx m10995f = zzx.m10995f(this.f20212b);
        synchronized (m10995f) {
            m10995f.f20167f = true;
            m10995f.m10926b();
        }
    }
}
