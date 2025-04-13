package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lazy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: b */
    public final T f63050b;

    public InitializedLazyImpl(T t) {
        this.f63050b = t;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.f63050b;
    }

    @NotNull
    public String toString() {
        return String.valueOf(this.f63050b);
    }
}
