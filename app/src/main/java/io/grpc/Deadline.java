package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Deadline implements Comparable<Deadline> {

    /* renamed from: e */
    public static final SystemTicker f58121e = new SystemTicker(null);

    /* renamed from: f */
    public static final long f58122f;

    /* renamed from: g */
    public static final long f58123g;

    /* renamed from: h */
    public static final long f58124h;

    /* renamed from: b */
    public final Ticker f58125b;

    /* renamed from: c */
    public final long f58126c;

    /* renamed from: d */
    public volatile boolean f58127d;

    public static class SystemTicker extends Ticker {
        public SystemTicker() {
        }

        @Override // io.grpc.Deadline.Ticker
        /* renamed from: a */
        public long mo30856a() {
            return System.nanoTime();
        }

        public SystemTicker(C62951 c62951) {
        }
    }

    public static abstract class Ticker {
        /* renamed from: a */
        public abstract long mo30856a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f58122f = nanos;
        f58123g = -nanos;
        f58124h = TimeUnit.SECONDS.toNanos(1L);
    }

    public Deadline(Ticker ticker, long j2, boolean z) {
        long mo30856a = ticker.mo30856a();
        this.f58125b = ticker;
        long min = Math.min(f58122f, Math.max(f58123g, j2));
        this.f58126c = mo30856a + min;
        this.f58127d = z && min <= 0;
    }

    /* renamed from: a */
    public static <T> T m30851a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public final void m30852b(Deadline deadline) {
        if (this.f58125b == deadline.f58125b) {
            return;
        }
        StringBuilder m24u = C0000a.m24u("Tickers (");
        m24u.append(this.f58125b);
        m24u.append(" and ");
        m24u.append(deadline.f58125b);
        m24u.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(m24u.toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(Deadline deadline) {
        m30852b(deadline);
        long j2 = this.f58126c - deadline.f58126c;
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    /* renamed from: d */
    public boolean m30854d() {
        if (!this.f58127d) {
            if (this.f58126c - this.f58125b.mo30856a() > 0) {
                return false;
            }
            this.f58127d = true;
        }
        return true;
    }

    /* renamed from: e */
    public long m30855e(TimeUnit timeUnit) {
        long mo30856a = this.f58125b.mo30856a();
        if (!this.f58127d && this.f58126c - mo30856a <= 0) {
            this.f58127d = true;
        }
        return timeUnit.convert(this.f58126c - mo30856a, TimeUnit.NANOSECONDS);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Deadline)) {
            return false;
        }
        Deadline deadline = (Deadline) obj;
        Ticker ticker = this.f58125b;
        if (ticker != null ? ticker == deadline.f58125b : deadline.f58125b == null) {
            return this.f58126c == deadline.f58126c;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f58125b, Long.valueOf(this.f58126c)).hashCode();
    }

    public String toString() {
        long m30855e = m30855e(TimeUnit.NANOSECONDS);
        long abs = Math.abs(m30855e);
        long j2 = f58124h;
        long j3 = abs / j2;
        long abs2 = Math.abs(m30855e) % j2;
        StringBuilder sb = new StringBuilder();
        if (m30855e < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f58125b != f58121e) {
            StringBuilder m24u = C0000a.m24u(" (ticker=");
            m24u.append(this.f58125b);
            m24u.append(")");
            sb.append(m24u.toString());
        }
        return sb.toString();
    }
}
