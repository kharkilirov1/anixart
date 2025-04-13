package com.yandex.metrica.impl.p023ob;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Mm */
/* loaded from: classes2.dex */
public class C3479Mm {

    /* renamed from: a */
    @NonNull
    private final C3504Nm f43448a;

    public C3479Mm() {
        this(new C3504Nm());
    }

    /* renamed from: a */
    public long m18599a(long j2, @NonNull TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j2);
        Objects.requireNonNull(this.f43448a);
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    /* renamed from: b */
    public long m18600b(long j2, @NonNull TimeUnit timeUnit) {
        if (j2 == 0) {
            return 0L;
        }
        return this.f43448a.mo18644b() - timeUnit.toSeconds(j2);
    }

    /* renamed from: c */
    public long m18601c(long j2, @NonNull TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        Objects.requireNonNull(this.f43448a);
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j2));
    }

    @VisibleForTesting
    public C3479Mm(@NonNull C3504Nm c3504Nm) {
        this.f43448a = c3504Nm;
    }
}
