package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Semaphore.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SemaphoreSegment extends Segment<SemaphoreSegment> {

    /* renamed from: e */
    @NotNull
    public /* synthetic */ AtomicReferenceArray f68448e;

    public SemaphoreSegment(long j2, @Nullable SemaphoreSegment semaphoreSegment, int i2) {
        super(j2, semaphoreSegment, i2);
        this.f68448e = new AtomicReferenceArray(SemaphoreKt.f68443f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* renamed from: h */
    public int mo34326h() {
        return SemaphoreKt.f68443f;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SemaphoreSegment[id=");
        m24u.append(this.f68301c);
        m24u.append(", hashCode=");
        m24u.append(hashCode());
        m24u.append(']');
        return m24u.toString();
    }
}
