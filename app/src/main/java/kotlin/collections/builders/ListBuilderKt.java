package kotlin.collections.builders;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ListBuilderKt {
    @NotNull
    /* renamed from: a */
    public static final <E> E[] m32091a(int i2) {
        if (i2 >= 0) {
            return (E[]) new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @NotNull
    /* renamed from: b */
    public static final <T> T[] m32092b(@NotNull T[] tArr, int i2) {
        Intrinsics.m32179h(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i2);
        Intrinsics.m32178g(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    /* renamed from: c */
    public static final <E> void m32093c(@NotNull E[] eArr, int i2) {
        Intrinsics.m32179h(eArr, "<this>");
        eArr[i2] = null;
    }

    /* renamed from: d */
    public static final <E> void m32094d(@NotNull E[] eArr, int i2, int i3) {
        Intrinsics.m32179h(eArr, "<this>");
        while (i2 < i3) {
            m32093c(eArr, i2);
            i2++;
        }
    }
}
