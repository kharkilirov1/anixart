package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Element", "Key", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: a */
        public static CoroutineContext m32114a(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext context) {
            Intrinsics.m32179h(context, "context");
            return context == EmptyCoroutineContext.f63224b ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2<CoroutineContext, Element, CoroutineContext>() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // kotlin.jvm.functions.Function2
                public CoroutineContext invoke(CoroutineContext coroutineContext2, CoroutineContext.Element element) {
                    CombinedContext combinedContext;
                    CoroutineContext acc = coroutineContext2;
                    CoroutineContext.Element element2 = element;
                    Intrinsics.m32179h(acc, "acc");
                    Intrinsics.m32179h(element2, "element");
                    CoroutineContext minusKey = acc.minusKey(element2.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f63224b;
                    if (minusKey == emptyCoroutineContext) {
                        return element2;
                    }
                    int i2 = ContinuationInterceptor.f63221G1;
                    ContinuationInterceptor.Key key = ContinuationInterceptor.Key.f63222b;
                    ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
                    if (continuationInterceptor == null) {
                        combinedContext = new CombinedContext(minusKey, element2);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(key);
                        if (minusKey2 == emptyCoroutineContext) {
                            return new CombinedContext(element2, continuationInterceptor);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, element2), continuationInterceptor);
                    }
                    return combinedContext;
                }
            });
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Element extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
        public static final class DefaultImpls {
            /* renamed from: a */
            public static <R> R m32115a(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.m32179h(operation, "operation");
                return operation.invoke(r, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* renamed from: b */
            public static <E extends Element> E m32116b(@NotNull Element element, @NotNull Key<E> key) {
                Intrinsics.m32179h(key, "key");
                if (Intrinsics.m32174c(element.getKey(), key)) {
                    return element;
                }
                return null;
            }

            @NotNull
            /* renamed from: c */
            public static CoroutineContext m32117c(@NotNull Element element, @NotNull Key<?> key) {
                Intrinsics.m32179h(key, "key");
                return Intrinsics.m32174c(element.getKey(), key) ? EmptyCoroutineContext.f63224b : element;
            }

            @NotNull
            /* renamed from: d */
            public static CoroutineContext m32118d(@NotNull Element element, @NotNull CoroutineContext context) {
                Intrinsics.m32179h(context, "context");
                return DefaultImpls.m32114a(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        @Nullable
        <E extends Element> E get(@NotNull Key<E> key);

        @NotNull
        Key<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Key<E extends Element> {
    }

    <R> R fold(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    @Nullable
    <E extends Element> E get(@NotNull Key<E> key);

    @NotNull
    CoroutineContext minusKey(@NotNull Key<?> key);

    @NotNull
    CoroutineContext plus(@NotNull CoroutineContext coroutineContext);
}
