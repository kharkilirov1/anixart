package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.LoadBalancer;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes3.dex */
public abstract class InternalConfigSelector {

    public static final class Result {

        /* renamed from: a */
        public final Status f58172a;

        /* renamed from: b */
        public final Object f58173b;

        /* renamed from: c */
        @Nullable
        public ClientInterceptor f58174c;

        public static final class Builder {

            /* renamed from: a */
            public Object f58175a;

            public Builder() {
            }

            public Builder(C62981 c62981) {
            }
        }

        public Result(Status status, Object obj, ClientInterceptor clientInterceptor, C62981 c62981) {
            Preconditions.m11187k(status, "status");
            this.f58172a = status;
            this.f58173b = obj;
            this.f58174c = null;
        }
    }

    /* renamed from: a */
    public abstract Result mo30877a(LoadBalancer.PickSubchannelArgs pickSubchannelArgs);
}
