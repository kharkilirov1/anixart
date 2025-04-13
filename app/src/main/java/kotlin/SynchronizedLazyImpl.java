package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    @Nullable
    public Function0<? extends T> f63065b;

    /* renamed from: c */
    @Nullable
    public volatile Object f63066c = UNINITIALIZED_VALUE.f63083a;

    /* renamed from: d */
    @NotNull
    public final Object f63067d = this;

    public SynchronizedLazyImpl(Function0 function0, Object obj, int i2) {
        this.f63065b = function0;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t;
        T t2 = (T) this.f63066c;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f63083a;
        if (t2 != uninitialized_value) {
            return t2;
        }
        synchronized (this.f63067d) {
            t = (T) this.f63066c;
            if (t == uninitialized_value) {
                Function0<? extends T> function0 = this.f63065b;
                Intrinsics.m32176e(function0);
                t = function0.invoke();
                this.f63066c = t;
                this.f63065b = null;
            }
        }
        return t;
    }

    @NotNull
    public String toString() {
        return this.f63066c != UNINITIALIZED_VALUE.f63083a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
