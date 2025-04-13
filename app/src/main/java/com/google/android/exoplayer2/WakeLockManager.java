package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class WakeLockManager {

    /* renamed from: a */
    @Nullable
    public final PowerManager f10088a;

    /* renamed from: b */
    @Nullable
    public PowerManager.WakeLock f10089b;

    /* renamed from: c */
    public boolean f10090c;

    /* renamed from: d */
    public boolean f10091d;

    public WakeLockManager(Context context) {
        this.f10088a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint
    /* renamed from: a */
    public final void m6009a() {
        PowerManager.WakeLock wakeLock = this.f10089b;
        if (wakeLock == null) {
            return;
        }
        if (this.f10090c && this.f10091d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
