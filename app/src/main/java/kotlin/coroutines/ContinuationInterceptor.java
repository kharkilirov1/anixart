package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContinuationInterceptor.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface ContinuationInterceptor extends CoroutineContext.Element {

    /* renamed from: G1 */
    public static final /* synthetic */ int f63221G1 = 0;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Key implements CoroutineContext.Key<ContinuationInterceptor> {

        /* renamed from: b */
        public static final /* synthetic */ Key f63222b = new Key();
    }

    /* renamed from: c */
    void mo32112c(@NotNull Continuation<?> continuation);

    @NotNull
    /* renamed from: e */
    <T> Continuation<T> mo32113e(@NotNull Continuation<? super T> continuation);
}
