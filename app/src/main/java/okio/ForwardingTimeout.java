package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ForwardingTimeout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class ForwardingTimeout extends Timeout {

    /* renamed from: a */
    @NotNull
    public Timeout f68760a;

    public ForwardingTimeout(@NotNull Timeout delegate) {
        Intrinsics.m32179h(delegate, "delegate");
        this.f68760a = delegate;
    }

    @NotNull
    /* renamed from: a */
    public final ForwardingTimeout m34594a(@NotNull Timeout delegate) {
        Intrinsics.m32179h(delegate, "delegate");
        this.f68760a = delegate;
        return this;
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearDeadline() {
        return this.f68760a.clearDeadline();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout clearTimeout() {
        return this.f68760a.clearTimeout();
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.f68760a.deadlineNanoTime();
    }

    @Override // okio.Timeout
    /* renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.f68760a.getHasDeadline();
    }

    @Override // okio.Timeout
    public void throwIfReached() throws IOException {
        this.f68760a.throwIfReached();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout timeout(long j2, @NotNull TimeUnit unit) {
        Intrinsics.m32179h(unit, "unit");
        return this.f68760a.timeout(j2, unit);
    }

    @Override // okio.Timeout
    /* renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.f68760a.getTimeoutNanos();
    }

    @Override // okio.Timeout
    @NotNull
    public Timeout deadlineNanoTime(long j2) {
        return this.f68760a.deadlineNanoTime(j2);
    }
}
