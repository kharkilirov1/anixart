package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;

/* loaded from: classes3.dex */
public final class TransportTracer {

    /* renamed from: h */
    public static final Factory f59167h = new Factory(TimeProvider.f59164a);

    /* renamed from: b */
    public long f59169b;

    /* renamed from: c */
    public long f59170c;

    /* renamed from: d */
    public long f59171d;

    /* renamed from: e */
    public long f59172e;

    /* renamed from: f */
    public long f59173f;

    /* renamed from: g */
    public final LongCounter f59174g = LongCounterFactory.m31137a();

    /* renamed from: a */
    public final TimeProvider f59168a = TimeProvider.f59164a;

    public static final class Factory {

        /* renamed from: a */
        public final TimeProvider f59175a;

        @VisibleForTesting
        public Factory(TimeProvider timeProvider) {
            this.f59175a = timeProvider;
        }
    }

    public interface FlowControlReader {
    }

    public static final class FlowControlWindows {
    }

    /* renamed from: a */
    public void m31208a(boolean z) {
        if (z) {
            this.f59170c++;
        } else {
            this.f59171d++;
        }
    }
}
