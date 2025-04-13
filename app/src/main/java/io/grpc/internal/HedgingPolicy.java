package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes3.dex */
final class HedgingPolicy {

    /* renamed from: a */
    public final int f58707a;

    /* renamed from: b */
    public final long f58708b;

    /* renamed from: c */
    public final Set<Status.Code> f58709c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HedgingPolicy.class != obj.getClass()) {
            return false;
        }
        HedgingPolicy hedgingPolicy = (HedgingPolicy) obj;
        return this.f58707a == hedgingPolicy.f58707a && this.f58708b == hedgingPolicy.f58708b && Objects.m11173a(this.f58709c, hedgingPolicy.f58709c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58707a), Long.valueOf(this.f58708b), this.f58709c});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11168b("maxAttempts", this.f58707a);
        m11166b.m11169c("hedgingDelayNanos", this.f58708b);
        m11166b.m11171e("nonFatalStatusCodes", this.f58709c);
        return m11166b.toString();
    }
}
