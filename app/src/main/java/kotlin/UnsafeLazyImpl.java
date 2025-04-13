package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lazy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    @Nullable
    public Function0<? extends T> f63089b;

    /* renamed from: c */
    @Nullable
    public Object f63090c = UNINITIALIZED_VALUE.f63083a;

    public UnsafeLazyImpl(@NotNull Function0<? extends T> function0) {
        this.f63089b = function0;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.f63090c == UNINITIALIZED_VALUE.f63083a) {
            Function0<? extends T> function0 = this.f63089b;
            Intrinsics.m32176e(function0);
            this.f63090c = function0.invoke();
            this.f63089b = null;
        }
        return (T) this.f63090c;
    }

    @NotNull
    public String toString() {
        return this.f63090c != UNINITIALIZED_VALUE.f63083a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
