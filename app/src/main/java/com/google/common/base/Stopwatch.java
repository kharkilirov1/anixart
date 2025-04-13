package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@GwtCompatible
/* loaded from: classes.dex */
public final class Stopwatch {

    /* renamed from: a */
    public boolean f20596a;

    /* renamed from: b */
    public long f20597b;

    /* renamed from: c */
    public long f20598c;

    /* renamed from: com.google.common.base.Stopwatch$1 */
    public static /* synthetic */ class C15771 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20599a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f20599a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20599a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20599a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20599a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20599a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20599a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20599a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a */
    public long m11213a(TimeUnit timeUnit) {
        return timeUnit.convert(m11214b(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public final long m11214b() {
        return this.f20596a ? (Ticker.f20608a.mo11226a() - this.f20598c) + this.f20597b : this.f20597b;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public Stopwatch m11215c() {
        this.f20597b = 0L;
        this.f20596a = false;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public Stopwatch m11216d() {
        Preconditions.m11192p(!this.f20596a, "This stopwatch is already running.");
        this.f20596a = true;
        this.f20598c = Ticker.f20608a.mo11226a();
        return this;
    }

    public String toString() {
        String str;
        long m11214b = m11214b();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(m11214b, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = m11214b / timeUnit2.convert(1L, timeUnit);
        PatternCompiler patternCompiler = Platform.f20534a;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(convert));
        switch (C15771.f20599a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return C0576a.m4115n(str.length() + C0576a.m4106e(format, 1), format, " ", str);
    }
}
