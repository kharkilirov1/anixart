package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class AppUpdateOptions {

    /* compiled from: com.google.android.play:core@@1.10.2 */
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract AppUpdateOptions mo10656a();
    }

    @NonNull
    /* renamed from: c */
    public static AppUpdateOptions m10652c(@AppUpdateType int i2) {
        zzu zzuVar = new zzu();
        zzuVar.f19641a = Integer.valueOf(i2);
        zzuVar.f19642b = Boolean.FALSE;
        return zzuVar.mo10656a();
    }

    @NonNull
    /* renamed from: d */
    public static Builder m10653d(@AppUpdateType int i2) {
        zzu zzuVar = new zzu();
        zzuVar.f19641a = Integer.valueOf(i2);
        zzuVar.f19642b = Boolean.FALSE;
        return zzuVar;
    }

    /* renamed from: a */
    public abstract boolean mo10654a();

    @AppUpdateType
    /* renamed from: b */
    public abstract int mo10655b();
}
