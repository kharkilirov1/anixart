package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.tasks.Task;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public interface AppUpdateManager {
    @NonNull
    /* renamed from: a */
    Task<Void> mo10646a();

    @NonNull
    /* renamed from: b */
    Task<AppUpdateInfo> mo10647b();

    /* renamed from: c */
    void mo10648c(@NonNull InstallStateUpdatedListener installStateUpdatedListener);

    /* renamed from: d */
    boolean mo10649d(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i2, @NonNull Activity activity, int i3) throws IntentSender.SendIntentException;

    /* renamed from: e */
    void mo10650e(@NonNull InstallStateUpdatedListener installStateUpdatedListener);
}
