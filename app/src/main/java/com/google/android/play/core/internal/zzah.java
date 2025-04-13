package com.google.android.play.core.internal;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzah implements Runnable {

    /* renamed from: b */
    @Nullable
    public final com.google.android.play.core.tasks.zzi<?> f20095b;

    public zzah() {
        this.f20095b = null;
    }

    public zzah(@Nullable com.google.android.play.core.tasks.zzi<?> zziVar) {
        this.f20095b = zziVar;
    }

    /* renamed from: a */
    public abstract void mo10662a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo10662a();
        } catch (Exception e2) {
            com.google.android.play.core.tasks.zzi<?> zziVar = this.f20095b;
            if (zziVar != null) {
                zziVar.m11014c(e2);
            }
        }
    }
}
