package kotlin.coroutines;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Serialized", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: b */
    @NotNull
    public final CoroutineContext f63218b;

    /* renamed from: c */
    @NotNull
    public final CoroutineContext.Element f63219c;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Serialized implements Serializable {

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Companion {
        }
    }

    public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.m32179h(left, "left");
        Intrinsics.m32179h(element, "element");
        this.f63218b = left;
        this.f63219c = element;
    }

    /* renamed from: d */
    public final int m32111d() {
        int i2 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f63218b;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.m32111d() != m32111d()) {
                return false;
            }
            Objects.requireNonNull(combinedContext);
            CombinedContext combinedContext2 = this;
            while (true) {
                CoroutineContext.Element element = combinedContext2.f63219c;
                if (!Intrinsics.m32174c(combinedContext.get(element.getKey()), element)) {
                    z = false;
                    break;
                }
                CoroutineContext coroutineContext = combinedContext2.f63218b;
                if (!(coroutineContext instanceof CombinedContext)) {
                    Intrinsics.m32177f(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                    z = Intrinsics.m32174c(combinedContext.get(element2.getKey()), element2);
                    break;
                }
                combinedContext2 = (CombinedContext) coroutineContext;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.m32179h(operation, "operation");
        return operation.invoke((Object) this.f63218b.fold(r, operation), this.f63219c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.m32179h(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e2 = (E) combinedContext.f63219c.get(key);
            if (e2 != null) {
                return e2;
            }
            CoroutineContext coroutineContext = combinedContext.f63218b;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f63219c.hashCode() + this.f63218b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.m32179h(key, "key");
        if (this.f63219c.get(key) != null) {
            return this.f63218b;
        }
        CoroutineContext minusKey = this.f63218b.minusKey(key);
        return minusKey == this.f63218b ? this : minusKey == EmptyCoroutineContext.f63224b ? this.f63219c : new CombinedContext(minusKey, this.f63219c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m32114a(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return C0576a.m4118q(C0321a.m2872a('['), (String) fold("", new Function2<String, CoroutineContext.Element, String>() { // from class: kotlin.coroutines.CombinedContext$toString$1
            @Override // kotlin.jvm.functions.Function2
            public String invoke(String str, CoroutineContext.Element element) {
                String acc = str;
                CoroutineContext.Element element2 = element;
                Intrinsics.m32179h(acc, "acc");
                Intrinsics.m32179h(element2, "element");
                if (acc.length() == 0) {
                    return element2.toString();
                }
                return acc + ", " + element2;
            }
        }), ']');
    }
}
