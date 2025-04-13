package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/ArraysKt")
/* loaded from: classes3.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    /* renamed from: c */
    public static final int m31979c(@NotNull char[] cArr, char c2) {
        Intrinsics.m32179h(cArr, "<this>");
        int length = cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2 == cArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m31980d(@NotNull boolean[] zArr, boolean z) {
        Intrinsics.m32179h(zArr, "<this>");
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (z == zArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @NotNull
    /* renamed from: e */
    public static final <T, A extends Appendable> A m31981e(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i2, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.m32179h(tArr, "<this>");
        Intrinsics.m32179h(buffer, "buffer");
        Intrinsics.m32179h(separator, "separator");
        Intrinsics.m32179h(prefix, "prefix");
        Intrinsics.m32179h(postfix, "postfix");
        Intrinsics.m32179h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t : tArr) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            StringsKt.m33915o(buffer, t, function1);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    /* renamed from: f */
    public static final <T, C extends Collection<? super T>> C m31982f(@NotNull T[] tArr, @NotNull C c2) {
        for (T t : tArr) {
            c2.add(t);
        }
        return c2;
    }
}
