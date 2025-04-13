package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzas<T extends IInterface> {

    /* renamed from: o */
    public static final Map<String, Handler> f20106o = new HashMap();

    /* renamed from: a */
    public final Context f20107a;

    /* renamed from: b */
    public final zzag f20108b;

    /* renamed from: c */
    public final String f20109c;

    /* renamed from: g */
    public boolean f20113g;

    /* renamed from: h */
    public final Intent f20114h;

    /* renamed from: i */
    public final zzan<T> f20115i;

    /* renamed from: m */
    @Nullable
    public ServiceConnection f20119m;

    /* renamed from: n */
    @Nullable
    public T f20120n;

    /* renamed from: d */
    public final List<zzah> f20110d = new ArrayList();

    /* renamed from: e */
    @GuardedBy
    public final Set<com.google.android.play.core.tasks.zzi<?>> f20111e = new HashSet();

    /* renamed from: f */
    public final Object f20112f = new Object();

    /* renamed from: k */
    public final IBinder.DeathRecipient f20117k = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.internal.zzai
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzas zzasVar = zzas.this;
            zzasVar.f20108b.m10837d("reportBinderDeath", new Object[0]);
            zzam zzamVar = zzasVar.f20116j.get();
            if (zzamVar != null) {
                zzasVar.f20108b.m10837d("calling onBinderDied", new Object[0]);
                zzamVar.m10840u();
            } else {
                zzasVar.f20108b.m10837d("%s : Binder has died.", zzasVar.f20109c);
                for (zzah zzahVar : zzasVar.f20110d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(zzasVar.f20109c).concat(" : Binder has died."));
                    com.google.android.play.core.tasks.zzi<?> zziVar = zzahVar.f20095b;
                    if (zziVar != null) {
                        zziVar.m11014c(remoteException);
                    }
                }
                zzasVar.f20110d.clear();
            }
            zzasVar.m10844d();
        }
    };

    /* renamed from: l */
    @GuardedBy
    public final AtomicInteger f20118l = new AtomicInteger(0);

    /* renamed from: j */
    public final WeakReference<zzam> f20116j = new WeakReference<>(null);

    public zzas(Context context, zzag zzagVar, String str, Intent intent, zzan<T> zzanVar, @Nullable zzam zzamVar) {
        this.f20107a = context;
        this.f20108b = zzagVar;
        this.f20109c = str;
        this.f20114h = intent;
        this.f20115i = zzanVar;
    }

    /* renamed from: a */
    public final Handler m10841a() {
        Handler handler;
        Map<String, Handler> map = f20106o;
        synchronized (map) {
            try {
                if (!((HashMap) map).containsKey(this.f20109c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f20109c, 10);
                    handlerThread.start();
                    ((HashMap) map).put(this.f20109c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) ((HashMap) map).get(this.f20109c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: b */
    public final void m10842b(zzah zzahVar, @Nullable final com.google.android.play.core.tasks.zzi<?> zziVar) {
        synchronized (this.f20112f) {
            this.f20111e.add(zziVar);
            zziVar.f20324a.mo10997a(new OnCompleteListener() { // from class: com.google.android.play.core.internal.zzaj
                @Override // com.google.android.play.core.tasks.OnCompleteListener
                /* renamed from: a */
                public final void mo10839a(Task task) {
                    zzas zzasVar = zzas.this;
                    com.google.android.play.core.tasks.zzi zziVar2 = zziVar;
                    synchronized (zzasVar.f20112f) {
                        zzasVar.f20111e.remove(zziVar2);
                    }
                }
            });
        }
        synchronized (this.f20112f) {
            if (this.f20118l.getAndIncrement() > 0) {
                this.f20108b.m10834a("Already connected to the service.", new Object[0]);
            }
        }
        m10841a().post(new zzak(this, zzahVar.f20095b, zzahVar));
    }

    /* renamed from: c */
    public final void m10843c(com.google.android.play.core.tasks.zzi<?> zziVar) {
        synchronized (this.f20112f) {
            this.f20111e.remove(zziVar);
        }
        synchronized (this.f20112f) {
            if (this.f20118l.decrementAndGet() > 0) {
                this.f20108b.m10837d("Leaving the connection open for other ongoing calls.", new Object[0]);
            } else {
                m10841a().post(new zzal(this));
            }
        }
    }

    /* renamed from: d */
    public final void m10844d() {
        synchronized (this.f20112f) {
            Iterator<com.google.android.play.core.tasks.zzi<?>> it = this.f20111e.iterator();
            while (it.hasNext()) {
                it.next().m11014c(new RemoteException(String.valueOf(this.f20109c).concat(" : Binder has died.")));
            }
            this.f20111e.clear();
        }
    }
}
