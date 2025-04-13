package com.google.android.gms.stats;

import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@ThreadSafe
@KeepForSdk
/* loaded from: classes.dex */
public class WakeLock {

    /* renamed from: o */
    public static final long f17219o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: p */
    public static volatile ScheduledExecutorService f17220p = null;

    /* renamed from: q */
    public static final Object f17221q = new Object();

    /* renamed from: r */
    public static volatile zzd f17222r = new zzb();

    /* renamed from: a */
    public final Object f17223a;

    /* renamed from: b */
    @GuardedBy
    public final PowerManager.WakeLock f17224b;

    /* renamed from: c */
    @GuardedBy
    public int f17225c;

    /* renamed from: d */
    @GuardedBy
    public Future<?> f17226d;

    /* renamed from: e */
    @GuardedBy
    public long f17227e;

    /* renamed from: f */
    @GuardedBy
    public final Set<zze> f17228f;

    /* renamed from: g */
    @GuardedBy
    public boolean f17229g;

    /* renamed from: h */
    @GuardedBy
    public int f17230h;

    /* renamed from: i */
    @GuardedBy
    public com.google.android.gms.internal.stats.zzb f17231i;

    /* renamed from: j */
    public Clock f17232j;

    /* renamed from: k */
    public final String f17233k;

    /* renamed from: l */
    @GuardedBy
    public final Map<String, zzc> f17234l;

    /* renamed from: m */
    public AtomicInteger f17235m;

    /* renamed from: n */
    public final ScheduledExecutorService f17236n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WakeLock(@androidx.annotation.NonNull android.content.Context r7, int r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.<init>(android.content.Context, int, java.lang.String):void");
    }

    @KeepForSdk
    /* renamed from: a */
    public void m9690a(long j2) {
        this.f17235m.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f17219o), 1L);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.f17223a) {
            if (!m9691b()) {
                this.f17231i = com.google.android.gms.internal.stats.zzb.f17181b;
                this.f17224b.acquire();
                this.f17232j.mo8238a();
            }
            this.f17225c++;
            this.f17230h++;
            if (this.f17229g) {
                TextUtils.isEmpty(null);
            }
            zzc zzcVar = this.f17234l.get(null);
            if (zzcVar == null) {
                zzcVar = new zzc(null);
                this.f17234l.put(null, zzcVar);
            }
            zzcVar.f17238a++;
            long mo8238a = this.f17232j.mo8238a();
            long j3 = Long.MAX_VALUE - mo8238a > max ? mo8238a + max : Long.MAX_VALUE;
            if (j3 > this.f17227e) {
                this.f17227e = j3;
                Future<?> future = this.f17226d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f17226d = this.f17236n.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock wakeLock = WakeLock.this;
                        synchronized (wakeLock.f17223a) {
                            if (wakeLock.m9691b()) {
                                Log.e("WakeLock", String.valueOf(wakeLock.f17233k).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                                wakeLock.m9693d();
                                if (wakeLock.m9691b()) {
                                    wakeLock.f17225c = 1;
                                    wakeLock.m9694e(0);
                                }
                            }
                        }
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean m9691b() {
        boolean z;
        synchronized (this.f17223a) {
            z = this.f17225c > 0;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public void m9692c() {
        if (this.f17235m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f17233k).concat(" release without a matched acquire!"));
        }
        synchronized (this.f17223a) {
            if (this.f17229g) {
                TextUtils.isEmpty(null);
            }
            if (this.f17234l.containsKey(null)) {
                zzc zzcVar = this.f17234l.get(null);
                if (zzcVar != null) {
                    int i2 = zzcVar.f17238a - 1;
                    zzcVar.f17238a = i2;
                    if (i2 == 0) {
                        this.f17234l.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f17233k).concat(" counter does not exist"));
            }
            m9694e(0);
        }
    }

    @GuardedBy
    /* renamed from: d */
    public final void m9693d() {
        if (this.f17228f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f17228f);
        this.f17228f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* renamed from: e */
    public final void m9694e(int i2) {
        synchronized (this.f17223a) {
            if (m9691b()) {
                if (this.f17229g) {
                    int i3 = this.f17225c - 1;
                    this.f17225c = i3;
                    if (i3 > 0) {
                        return;
                    }
                } else {
                    this.f17225c = 0;
                }
                m9693d();
                Iterator<zzc> it = this.f17234l.values().iterator();
                while (it.hasNext()) {
                    it.next().f17238a = 0;
                }
                this.f17234l.clear();
                Future<?> future = this.f17226d;
                if (future != null) {
                    future.cancel(false);
                    this.f17226d = null;
                    this.f17227e = 0L;
                }
                this.f17230h = 0;
                try {
                    if (this.f17224b.isHeld()) {
                        try {
                            this.f17224b.release();
                            if (this.f17231i != null) {
                                this.f17231i = null;
                            }
                        } catch (RuntimeException e2) {
                            if (!e2.getClass().equals(RuntimeException.class)) {
                                throw e2;
                            }
                            Log.e("WakeLock", String.valueOf(this.f17233k).concat(" failed to release!"), e2);
                            if (this.f17231i != null) {
                                this.f17231i = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f17233k).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.f17231i != null) {
                        this.f17231i = null;
                    }
                    throw th;
                }
            }
        }
    }
}
