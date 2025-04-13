package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InlineList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@JvmInline
/* loaded from: classes3.dex */
public final class InlineList<E> {
    @NotNull
    /* renamed from: a */
    public static final Object m34283a(Object obj, E e2) {
        if (obj == null) {
            return e2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InlineList)) {
            return false;
        }
        Objects.requireNonNull((InlineList) obj);
        return Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "InlineList(holder=null)";
    }
}
