package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class AppUpdateInfo {

    /* renamed from: a */
    @UpdateAvailability
    public final int f19590a;

    /* renamed from: b */
    @InstallStatus
    public final int f19591b;

    /* renamed from: c */
    public final long f19592c;

    /* renamed from: d */
    public final long f19593d;

    /* renamed from: e */
    @Nullable
    public final PendingIntent f19594e;

    /* renamed from: f */
    @Nullable
    public final PendingIntent f19595f;

    /* renamed from: g */
    @Nullable
    public final PendingIntent f19596g;

    /* renamed from: h */
    @Nullable
    public final PendingIntent f19597h;

    /* renamed from: i */
    public boolean f19598i = false;

    public AppUpdateInfo(@NonNull String str, int i2, @UpdateAvailability int i3, @InstallStatus int i4, @Nullable Integer num, int i5, long j2, long j3, long j4, long j5, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        this.f19590a = i3;
        this.f19591b = i4;
        this.f19592c = j4;
        this.f19593d = j5;
        this.f19594e = pendingIntent;
        this.f19595f = pendingIntent2;
        this.f19596g = pendingIntent3;
        this.f19597h = pendingIntent4;
    }

    /* renamed from: b */
    public static AppUpdateInfo m10643b(@NonNull String str, int i2, @UpdateAvailability int i3, @InstallStatus int i4, @Nullable Integer num, int i5, long j2, long j3, long j4, long j5, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        return new AppUpdateInfo(str, i2, i3, i4, num, i5, j2, j3, j4, j5, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    @Nullable
    /* renamed from: a */
    public final PendingIntent m10644a(AppUpdateOptions appUpdateOptions) {
        if (appUpdateOptions.mo10655b() == 0) {
            PendingIntent pendingIntent = this.f19595f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m10645c(appUpdateOptions)) {
                return this.f19597h;
            }
            return null;
        }
        if (appUpdateOptions.mo10655b() == 1) {
            PendingIntent pendingIntent2 = this.f19594e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m10645c(appUpdateOptions)) {
                return this.f19596g;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m10645c(AppUpdateOptions appUpdateOptions) {
        return appUpdateOptions.mo10654a() && this.f19592c <= this.f19593d;
    }
}
