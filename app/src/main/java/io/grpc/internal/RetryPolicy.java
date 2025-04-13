package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes3.dex */
final class RetryPolicy {

    /* renamed from: a */
    public final int f59068a;

    /* renamed from: b */
    public final long f59069b;

    /* renamed from: c */
    public final long f59070c;

    /* renamed from: d */
    public final double f59071d;

    /* renamed from: e */
    @Nullable
    public final Long f59072e;

    /* renamed from: f */
    public final Set<Status.Code> f59073f;

    public boolean equals(Object obj) {
        if (!(obj instanceof RetryPolicy)) {
            return false;
        }
        RetryPolicy retryPolicy = (RetryPolicy) obj;
        return this.f59068a == retryPolicy.f59068a && this.f59069b == retryPolicy.f59069b && this.f59070c == retryPolicy.f59070c && Double.compare(this.f59071d, retryPolicy.f59071d) == 0 && Objects.m11173a(this.f59072e, retryPolicy.f59072e) && Objects.m11173a(this.f59073f, retryPolicy.f59073f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f59068a), Long.valueOf(this.f59069b), Long.valueOf(this.f59070c), Double.valueOf(this.f59071d), this.f59072e, this.f59073f});
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11168b("maxAttempts", this.f59068a);
        m11166b.m11169c("initialBackoffNanos", this.f59069b);
        m11166b.m11169c("maxBackoffNanos", this.f59070c);
        m11166b.m11167a("backoffMultiplier", this.f59071d);
        m11166b.m11171e("perAttemptRecvTimeoutNanos", this.f59072e);
        m11166b.m11171e("retryableStatusCodes", this.f59073f);
        return m11166b.toString();
    }
}
