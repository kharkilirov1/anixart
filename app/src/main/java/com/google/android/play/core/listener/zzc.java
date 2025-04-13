package com.google.android.play.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzag;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzc<StateT> {

    /* renamed from: a */
    public final zzag f20162a;

    /* renamed from: b */
    public final IntentFilter f20163b;

    /* renamed from: c */
    public final Context f20164c;

    /* renamed from: d */
    public final Set<StateUpdatedListener<StateT>> f20165d = new HashSet();

    /* renamed from: e */
    @Nullable
    public zzb f20166e = null;

    /* renamed from: f */
    public volatile boolean f20167f = false;

    public zzc(zzag zzagVar, IntentFilter intentFilter, Context context) {
        this.f20162a = zzagVar;
        this.f20163b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f20164c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public abstract void mo10657a(Context context, Intent intent);

    /* renamed from: b */
    public final void m10926b() {
        zzb zzbVar;
        if ((this.f20167f || !this.f20165d.isEmpty()) && this.f20166e == null) {
            zzb zzbVar2 = new zzb(this);
            this.f20166e = zzbVar2;
            this.f20164c.registerReceiver(zzbVar2, this.f20163b);
        }
        if (this.f20167f || !this.f20165d.isEmpty() || (zzbVar = this.f20166e) == null) {
            return;
        }
        this.f20164c.unregisterReceiver(zzbVar);
        this.f20166e = null;
    }

    /* renamed from: c */
    public final synchronized void m10927c(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f20162a.m10837d("registerListener", new Object[0]);
        Objects.requireNonNull(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.f20165d.add(stateUpdatedListener);
        m10926b();
    }

    /* renamed from: d */
    public final synchronized void m10928d(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f20162a.m10837d("unregisterListener", new Object[0]);
        Objects.requireNonNull(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.f20165d.remove(stateUpdatedListener);
        m10926b();
    }

    /* renamed from: e */
    public final synchronized void m10929e(StateT statet) {
        Iterator it = new HashSet(this.f20165d).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).mo10687a(statet);
        }
    }
}
