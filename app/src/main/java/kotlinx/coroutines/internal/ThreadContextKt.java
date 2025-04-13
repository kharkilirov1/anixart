package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ThreadContextKt {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final Symbol f68306a = new Symbol("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> f68307b = new Function2<Object, CoroutineContext.Element, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, CoroutineContext.Element element) {
            CoroutineContext.Element element2 = element;
            if (!(element2 instanceof ThreadContextElement)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? element2 : Integer.valueOf(intValue + 1);
        }
    };

    /* renamed from: c */
    @NotNull
    public static final Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>> f68308c = new Function2<ThreadContextElement<?>, CoroutineContext.Element, ThreadContextElement<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        public ThreadContextElement<?> invoke(ThreadContextElement<?> threadContextElement, CoroutineContext.Element element) {
            ThreadContextElement<?> threadContextElement2 = threadContextElement;
            CoroutineContext.Element element2 = element;
            if (threadContextElement2 != null) {
                return threadContextElement2;
            }
            if (element2 instanceof ThreadContextElement) {
                return (ThreadContextElement) element2;
            }
            return null;
        }
    };

    /* renamed from: d */
    @NotNull
    public static final Function2<ThreadState, CoroutineContext.Element, ThreadState> f68309d = new Function2<ThreadState, CoroutineContext.Element, ThreadState>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        public ThreadState invoke(ThreadState threadState, CoroutineContext.Element element) {
            ThreadState threadState2 = threadState;
            CoroutineContext.Element element2 = element;
            if (element2 instanceof ThreadContextElement) {
                ThreadContextElement<Object> threadContextElement = (ThreadContextElement) element2;
                Object mo34018R = threadContextElement.mo34018R(threadState2.f68314a);
                Object[] objArr = threadState2.f68315b;
                int i2 = threadState2.f68317d;
                objArr[i2] = mo34018R;
                ThreadContextElement<Object>[] threadContextElementArr = threadState2.f68316c;
                threadState2.f68317d = i2 + 1;
                threadContextElementArr[i2] = threadContextElement;
            }
            return threadState2;
        }
    };

    /* renamed from: a */
    public static final void m34336a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f68306a) {
            return;
        }
        if (!(obj instanceof ThreadState)) {
            Object fold = coroutineContext.fold(null, f68308c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) fold).mo34017B(coroutineContext, obj);
            return;
        }
        ThreadState threadState = (ThreadState) obj;
        int length = threadState.f68316c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            ThreadContextElement<Object> threadContextElement = threadState.f68316c[length];
            Intrinsics.m32176e(threadContextElement);
            threadContextElement.mo34017B(coroutineContext, threadState.f68315b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public static final Object m34337b(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f68307b);
        Intrinsics.m32176e(fold);
        return fold;
    }

    @Nullable
    /* renamed from: c */
    public static final Object m34338c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m34337b(coroutineContext);
        }
        return obj == 0 ? f68306a : obj instanceof Integer ? coroutineContext.fold(new ThreadState(coroutineContext, ((Number) obj).intValue()), f68309d) : ((ThreadContextElement) obj).mo34018R(coroutineContext);
    }
}
