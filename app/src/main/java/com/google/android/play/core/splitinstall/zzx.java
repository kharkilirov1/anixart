package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzx extends com.google.android.play.core.listener.zzc<SplitInstallSessionState> {

    /* renamed from: j */
    @Nullable
    public static zzx f20300j;

    /* renamed from: g */
    public final Handler f20301g;

    /* renamed from: h */
    public final zzg f20302h;

    /* renamed from: i */
    public final Set<SplitInstallStateUpdatedListener> f20303i;

    @VisibleForTesting
    public zzx(Context context, zzg zzgVar) {
        super(new com.google.android.play.core.internal.zzag("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f20301g = new Handler(Looper.getMainLooper());
        this.f20303i = new LinkedHashSet();
        this.f20302h = zzgVar;
    }

    /* renamed from: f */
    public static synchronized zzx m10995f(Context context) {
        zzx zzxVar;
        synchronized (zzx.class) {
            if (f20300j == null) {
                f20300j = new zzx(context, zzo.f20286b);
            }
            zzxVar = f20300j;
        }
        return zzxVar;
    }

    @Override // com.google.android.play.core.listener.zzc
    /* renamed from: a */
    public final void mo10657a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState m10959m = SplitInstallSessionState.m10959m(bundleExtra);
        this.f20162a.m10834a("ListenerRegistryBroadcastReceiver.onReceive: %s", m10959m);
        zzh mo10992u = this.f20302h.mo10992u();
        zza zzaVar = (zza) m10959m;
        if (zzaVar.f20268b != 3 || mo10992u == null) {
            m10996g(m10959m);
        } else {
            mo10992u.mo10845a(zzaVar.f20275i, new zzv(this, m10959m, intent, context));
        }
    }

    /* renamed from: g */
    public final synchronized void m10996g(SplitInstallSessionState splitInstallSessionState) {
        Iterator it = new LinkedHashSet(this.f20303i).iterator();
        while (it.hasNext()) {
            ((SplitInstallStateUpdatedListener) it.next()).mo10687a(splitInstallSessionState);
        }
        m10929e(splitInstallSessionState);
    }
}
