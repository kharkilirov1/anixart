package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.internal.zzag;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzb extends com.google.android.play.core.listener.zzc<InstallState> {
    public zzb(Context context) {
        super(new zzag("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // com.google.android.play.core.listener.zzc
    /* renamed from: a */
    public final void mo10657a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f20162a.m10834a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f20162a.m10834a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f20162a.m10834a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        InstallState m10824f = InstallState.m10824f(intent, this.f20162a);
        this.f20162a.m10834a("ListenerRegistryBroadcastReceiver.onReceive: %s", m10824f);
        m10929e(m10824f);
    }
}
