package kotlin.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineContextImpl.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalStdlibApi
/* loaded from: classes3.dex */
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.Key<E> {

    /* renamed from: b */
    @NotNull
    public final Function1<CoroutineContext.Element, E> f63216b;

    /* renamed from: c */
    @NotNull
    public final CoroutineContext.Key<?> f63217c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$Key<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public AbstractCoroutineContextKey(@NotNull CoroutineContext.Key<B> baseKey, @NotNull Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.m32179h(baseKey, "baseKey");
        Intrinsics.m32179h(safeCast, "safeCast");
        this.f63216b = safeCast;
        this.f63217c = baseKey instanceof AbstractCoroutineContextKey ? (CoroutineContext.Key<B>) ((AbstractCoroutineContextKey) baseKey).f63217c : baseKey;
    }
}
