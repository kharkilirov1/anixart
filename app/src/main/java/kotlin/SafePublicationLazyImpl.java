package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\tR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m31884d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "c", "Ljava/lang/Object;", "_value", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: d */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f63062d = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "c");

    /* renamed from: b */
    @Nullable
    public volatile Function0<? extends T> f63063b;

    /* renamed from: c, reason: from kotlin metadata */
    @Nullable
    public volatile Object _value = UNINITIALIZED_VALUE.f63083a;

    /* compiled from: LazyJVM.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001Rd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public SafePublicationLazyImpl(@NotNull Function0<? extends T> function0) {
        this.f63063b = function0;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        boolean z;
        T t = (T) this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f63083a;
        if (t != uninitialized_value) {
            return t;
        }
        Function0<? extends T> function0 = this.f63063b;
        if (function0 != null) {
            T invoke = function0.invoke();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f63062d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, uninitialized_value, invoke)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != uninitialized_value) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f63063b = null;
                return invoke;
            }
        }
        return (T) this._value;
    }

    @NotNull
    public String toString() {
        return this._value != UNINITIALIZED_VALUE.f63083a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
