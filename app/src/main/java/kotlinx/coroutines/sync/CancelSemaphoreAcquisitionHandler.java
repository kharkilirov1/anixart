package kotlinx.coroutines.sync;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Semaphore.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/CancelSemaphoreAcquisitionHandler;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class CancelSemaphoreAcquisitionHandler extends CancelHandler {

    /* renamed from: b */
    @NotNull
    public final SemaphoreSegment f68397b;

    /* renamed from: c */
    public final int f68398c;

    public CancelSemaphoreAcquisitionHandler(@NotNull SemaphoreSegment semaphoreSegment, int i2) {
        this.f68397b = semaphoreSegment;
        this.f68398c = i2;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo33959a(@Nullable Throwable th) {
        SemaphoreSegment semaphoreSegment = this.f68397b;
        int i2 = this.f68398c;
        Objects.requireNonNull(semaphoreSegment);
        semaphoreSegment.f68448e.set(i2, SemaphoreKt.f68442e);
        if (Segment.f68300d.incrementAndGet(semaphoreSegment) != semaphoreSegment.mo34326h() || semaphoreSegment.m34272d()) {
            return;
        }
        semaphoreSegment.m34273e();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33959a(th);
        return Unit.f63088a;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CancelSemaphoreAcquisitionHandler[");
        m24u.append(this.f68397b);
        m24u.append(", ");
        return C0000a.m17n(m24u, this.f68398c, ']');
    }
}
