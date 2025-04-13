package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Stopwatch;
import java.util.Locale;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class RateLimiter {

    /* renamed from: a */
    @NullableDecl
    public volatile Object f22211a;

    public static abstract class SleepingStopwatch {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1 */
        class C20191 extends SleepingStopwatch {
            public C20191() {
                new Stopwatch().m11216d();
            }
        }
    }

    /* renamed from: a */
    public abstract double mo12206a();

    public String toString() {
        double mo12206a;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        Object obj = this.f22211a;
        if (obj == null) {
            synchronized (this) {
                obj = this.f22211a;
                if (obj == null) {
                    obj = new Object();
                    this.f22211a = obj;
                }
            }
        }
        synchronized (obj) {
            mo12206a = mo12206a();
        }
        objArr[0] = Double.valueOf(mo12206a);
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", objArr);
    }
}
