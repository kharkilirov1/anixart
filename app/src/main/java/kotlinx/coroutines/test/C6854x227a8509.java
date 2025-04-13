package kotlinx.coroutines.test;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, m31884d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.test.TestCoroutineContext$special$$inlined$CoroutineExceptionHandler$1 */
/* loaded from: classes3.dex */
public final class C6854x227a8509 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* renamed from: b */
    public final /* synthetic */ TestCoroutineContext f68457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6854x227a8509(CoroutineExceptionHandler.Key key, TestCoroutineContext testCoroutineContext) {
        super(key);
        this.f68457b = testCoroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        this.f68457b.f68450c.add(th);
    }
}
