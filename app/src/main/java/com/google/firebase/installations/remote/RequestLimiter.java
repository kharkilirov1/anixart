package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class RequestLimiter {

    /* renamed from: d */
    public static final long f23212d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f23213e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final Utils f23214a = Utils.m12578c();

    /* renamed from: b */
    @GuardedBy
    public long f23215b;

    /* renamed from: c */
    @GuardedBy
    public int f23216c;

    /* renamed from: a */
    public synchronized boolean m12629a() {
        boolean z;
        if (this.f23216c != 0) {
            z = this.f23214a.m12579a() > this.f23215b;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized void m12630b(int i2) {
        long min;
        boolean z = false;
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            synchronized (this) {
                this.f23216c = 0;
            }
            return;
        }
        this.f23216c++;
        synchronized (this) {
            if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
                z = true;
            }
            if (z) {
                double pow = Math.pow(2.0d, this.f23216c);
                Objects.requireNonNull(this.f23214a);
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f23213e);
            } else {
                min = f23212d;
            }
            this.f23215b = this.f23214a.m12579a() + min;
        }
        return;
    }
}
