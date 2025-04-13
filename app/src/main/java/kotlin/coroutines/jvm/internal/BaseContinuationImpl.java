package kotlin.coroutines.jvm.internal;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ModuleNameRetriever;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ContinuationImpl.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class BaseContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {

    /* renamed from: b */
    @Nullable
    public final Continuation<Object> f63242b;

    public BaseContinuationImpl(@Nullable Continuation<Object> continuation) {
        this.f63242b = continuation;
    }

    @NotNull
    /* renamed from: a */
    public Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32179h(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<Object> continuation = this.f63242b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public final void mo31877j(@NotNull Object obj) {
        Continuation continuation = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) continuation;
            Continuation continuation2 = baseContinuationImpl.f63242b;
            Intrinsics.m32176e(continuation2);
            try {
                obj = baseContinuationImpl.mo2379m(obj);
                if (obj == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = ResultKt.m31891a(th);
            }
            baseContinuationImpl.mo32124o();
            if (!(continuation2 instanceof BaseContinuationImpl)) {
                continuation2.mo31877j(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    @NotNull
    /* renamed from: l */
    public Continuation<Unit> mo32123l(@NotNull Continuation<?> completion) {
        Intrinsics.m32179h(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    /* renamed from: m */
    public abstract Object mo2379m(@NotNull Object obj);

    /* renamed from: o */
    public void mo32124o() {
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        int i2;
        String str;
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str2 = null;
        if (debugMetadata == null) {
            return null;
        }
        int m32129v = debugMetadata.m32129v();
        if (m32129v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + m32129v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? debugMetadata.m32127l()[i2] : -1;
        ModuleNameRetriever.Cache cache = ModuleNameRetriever.f63247b;
        if (cache == null) {
            try {
                ModuleNameRetriever.Cache cache2 = new ModuleNameRetriever.Cache(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                ModuleNameRetriever.f63247b = cache2;
                cache = cache2;
            } catch (Exception unused2) {
                cache = ModuleNameRetriever.f63246a;
                ModuleNameRetriever.f63247b = cache;
            }
        }
        if (cache != ModuleNameRetriever.f63246a) {
            Method method = cache.f63248a;
            Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (invoke != null) {
                Method method2 = cache.f63249b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                if (invoke2 != null) {
                    Method method3 = cache.f63250c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = debugMetadata.m32125c();
        } else {
            str = str2 + JsonPointer.SEPARATOR + debugMetadata.m32125c();
        }
        return new StackTraceElement(str, debugMetadata.m32128m(), debugMetadata.m32126f(), i3);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Continuation at ");
        Object mo32120s = mo32120s();
        if (mo32120s == null) {
            mo32120s = getClass().getName();
        }
        m24u.append(mo32120s);
        return m24u.toString();
    }
}
