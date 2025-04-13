package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    public static final CoroutineContext m34010a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean m34011b = m34011b(coroutineContext);
        boolean m34011b2 = m34011b(coroutineContext2);
        if (!m34011b && !m34011b2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f63224b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.Element element) {
                CoroutineContext coroutineContext5 = coroutineContext4;
                CoroutineContext.Element element2 = element;
                if (!(element2 instanceof CopyableThreadContextElement)) {
                    return coroutineContext5.plus(element2);
                }
                CoroutineContext.Element element3 = objectRef.f63351b.get(element2.getKey());
                if (element3 != null) {
                    Ref.ObjectRef<CoroutineContext> objectRef2 = objectRef;
                    objectRef2.f63351b = objectRef2.f63351b.minusKey(element2.getKey());
                    return coroutineContext5.plus(((CopyableThreadContextElement) element2).m34009i(element3));
                }
                CopyableThreadContextElement copyableThreadContextElement = (CopyableThreadContextElement) element2;
                if (z) {
                    copyableThreadContextElement = copyableThreadContextElement.m34008A();
                }
                return coroutineContext5.plus(copyableThreadContextElement);
            }
        });
        if (m34011b2) {
            objectRef.f63351b = ((CoroutineContext) objectRef.f63351b).fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // kotlin.jvm.functions.Function2
                public CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.Element element) {
                    CoroutineContext coroutineContext5 = coroutineContext4;
                    CoroutineContext.Element element2 = element;
                    return element2 instanceof CopyableThreadContextElement ? coroutineContext5.plus(((CopyableThreadContextElement) element2).m34008A()) : coroutineContext5.plus(element2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.f63351b);
    }

    /* renamed from: b */
    public static final boolean m34011b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2<Boolean, CoroutineContext.Element, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @Override // kotlin.jvm.functions.Function2
            public Boolean invoke(Boolean bool, CoroutineContext.Element element) {
                return Boolean.valueOf(bool.booleanValue() || (element instanceof CopyableThreadContextElement));
            }
        })).booleanValue();
    }

    @ExperimentalCoroutinesApi
    @NotNull
    /* renamed from: c */
    public static final CoroutineContext m34012c(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext m34010a = m34010a(coroutineScope.getF68244b(), coroutineContext, true);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        if (m34010a == coroutineDispatcher) {
            return m34010a;
        }
        int i2 = ContinuationInterceptor.f63221G1;
        return m34010a.get(ContinuationInterceptor.Key.f63222b) == null ? m34010a.plus(coroutineDispatcher) : m34010a;
    }

    @Nullable
    /* renamed from: d */
    public static final UndispatchedCoroutine<?> m34013d(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        UndispatchedCoroutine<?> undispatchedCoroutine = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (!(coroutineContext.get(UndispatchedMarker.f67067b) != null)) {
            return null;
        }
        CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
        while (true) {
            if ((coroutineStackFrame instanceof DispatchedCoroutine) || (coroutineStackFrame = coroutineStackFrame.mo32119h()) == null) {
                break;
            }
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                undispatchedCoroutine = (UndispatchedCoroutine) coroutineStackFrame;
                break;
            }
        }
        if (undispatchedCoroutine != null) {
            undispatchedCoroutine.f67066e.set(new Pair<>(coroutineContext, obj));
        }
        return undispatchedCoroutine;
    }
}
