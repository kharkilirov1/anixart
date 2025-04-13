package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Select.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectInstance;", "R", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface SelectInstance<R> {
    /* renamed from: C */
    void mo34387C(@NotNull DisposableHandle disposableHandle);

    @Nullable
    /* renamed from: b */
    Object mo34392b(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp);

    /* renamed from: e */
    boolean mo34393e();

    /* renamed from: o */
    boolean mo34394o();

    @NotNull
    /* renamed from: p */
    Continuation<R> mo34395p();

    /* renamed from: y */
    void mo34396y(@NotNull Throwable th);

    @Nullable
    /* renamed from: z */
    Object mo34397z(@NotNull AtomicDesc atomicDesc);
}
