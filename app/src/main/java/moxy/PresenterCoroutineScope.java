package moxy;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PresenterScope.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m31884d2 = {"Lmoxy/PresenterCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lmoxy/OnDestroyListener;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "onDestroy", "", "moxy-ktx"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PresenterCoroutineScope implements CoroutineScope, OnDestroyListener {
    private final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.m34020b();

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF68244b() {
        return this.$$delegate_0.getF68244b();
    }

    @Override // moxy.OnDestroyListener
    public void onDestroy() {
        JobKt.m34070b(getF68244b(), null);
    }
}
