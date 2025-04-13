package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationImpl.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    /* renamed from: c */
    @Nullable
    public final CoroutineContext f63244c;

    /* renamed from: d */
    @Nullable
    public transient Continuation<Object> f63245d;

    public ContinuationImpl(@Nullable Continuation<Object> continuation, @Nullable CoroutineContext coroutineContext) {
        super(continuation);
        this.f63244c = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext mo31876g() {
        CoroutineContext coroutineContext = this.f63244c;
        Intrinsics.m32176e(coroutineContext);
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* renamed from: o */
    public void mo32124o() {
        Continuation<?> continuation = this.f63245d;
        if (continuation != null && continuation != this) {
            CoroutineContext mo31876g = mo31876g();
            int i2 = ContinuationInterceptor.f63221G1;
            CoroutineContext.Element element = mo31876g.get(ContinuationInterceptor.Key.f63222b);
            Intrinsics.m32176e(element);
            ((ContinuationInterceptor) element).mo32112c(continuation);
        }
        this.f63245d = CompletedContinuation.f63243b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(@Nullable Continuation<Object> continuation) {
        super(continuation);
        CoroutineContext mo31876g = continuation != null ? continuation.mo31876g() : null;
        this.f63244c = mo31876g;
    }
}
