package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadSafeHeap.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface ThreadSafeHeapNode {
    /* renamed from: a */
    void mo34052a(@Nullable ThreadSafeHeap<?> threadSafeHeap);

    @Nullable
    /* renamed from: b */
    ThreadSafeHeap<?> mo34053b();

    /* renamed from: e */
    void mo34054e(int i2);

    /* renamed from: h */
    int mo34055h();
}
