package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public abstract class ClientStreamTracer extends StreamTracer {

    public static abstract class Factory {
        /* renamed from: a */
        public ClientStreamTracer mo30823a(StreamInfo streamInfo, Metadata metadata) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @ExperimentalApi
    public static final class StreamInfo {

        /* renamed from: a */
        public final CallOptions f58081a;

        /* renamed from: b */
        public final int f58082b;

        /* renamed from: c */
        public final boolean f58083c;

        public static final class Builder {

            /* renamed from: a */
            public CallOptions f58084a = CallOptions.f58058k;

            /* renamed from: b */
            public int f58085b;

            /* renamed from: c */
            public boolean f58086c;
        }

        public StreamInfo(CallOptions callOptions, int i2, boolean z) {
            Preconditions.m11187k(callOptions, "callOptions");
            this.f58081a = callOptions;
            this.f58082b = i2;
            this.f58083c = z;
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("callOptions", this.f58081a);
            m11166b.m11168b("previousAttempts", this.f58082b);
            m11166b.m11170d("isTransparentRetry", this.f58083c);
            return m11166b.toString();
        }
    }

    /* renamed from: j */
    public void mo30820j() {
    }

    /* renamed from: k */
    public void mo30821k(Metadata metadata) {
    }

    /* renamed from: l */
    public void mo30822l() {
    }
}
