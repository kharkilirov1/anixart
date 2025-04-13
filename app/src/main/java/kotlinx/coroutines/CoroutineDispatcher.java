package kotlinx.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "Key", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b */
    @NotNull
    public static final Key f66963b = new Key(null);

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key.f63222b);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    /* renamed from: c */
    public final void mo32112c(@NotNull Continuation<?> continuation) {
        ((DispatchedContinuation) continuation).m34278n();
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    @NotNull
    /* renamed from: e */
    public final <T> Continuation<T> mo32113e(@NotNull Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.m32179h(key, "key");
        if (!(key instanceof AbstractCoroutineContextKey)) {
            if (ContinuationInterceptor.Key.f63222b == key) {
                return this;
            }
            return null;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key<?> key2 = getKey();
        Intrinsics.m32179h(key2, "key");
        if (!(key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f63217c == key2)) {
            return null;
        }
        E e2 = (E) abstractCoroutineContextKey.f63216b.invoke(this);
        if (e2 instanceof CoroutineContext.Element) {
            return e2;
        }
        return null;
    }

    /* renamed from: m */
    public abstract void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable);

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.m32179h(key, "key");
        if (key instanceof AbstractCoroutineContextKey) {
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext.Key<?> key2 = getKey();
            Intrinsics.m32179h(key2, "key");
            if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.f63217c == key2) && ((CoroutineContext.Element) abstractCoroutineContextKey.f63216b.invoke(this)) != null) {
                return EmptyCoroutineContext.f63224b;
            }
        } else if (ContinuationInterceptor.Key.f63222b == key) {
            return EmptyCoroutineContext.f63224b;
        }
        return this;
    }

    @InternalCoroutinesApi
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        mo3221m(coroutineContext, runnable);
    }

    /* renamed from: q */
    public boolean mo3222q(@NotNull CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined);
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.m34023b(this);
    }

    /* compiled from: CoroutineDispatcher.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    @ExperimentalStdlibApi
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$Key$1 */
        public static final class C67731 extends Lambda implements Function1<CoroutineContext.Element, CoroutineDispatcher> {

            /* renamed from: b */
            public static final C67731 f66964b = new C67731();

            public C67731() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public CoroutineDispatcher invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element2;
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Key() {
            super(ContinuationInterceptor.Key.f63222b, C67731.f66964b);
            int i2 = ContinuationInterceptor.f63221G1;
        }

        public Key(DefaultConstructorMarker defaultConstructorMarker) {
            super(ContinuationInterceptor.Key.f63222b, C67731.f66964b);
        }
    }
}
