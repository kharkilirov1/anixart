package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Collections.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    @NotNull
    /* renamed from: c */
    public static final <T, A extends Appendable> A m32052c(@NotNull Iterable<? extends T> iterable, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i2, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.m32179h(iterable, "<this>");
        Intrinsics.m32179h(buffer, "buffer");
        Intrinsics.m32179h(separator, "separator");
        Intrinsics.m32179h(prefix, "prefix");
        Intrinsics.m32179h(postfix, "postfix");
        Intrinsics.m32179h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t : iterable) {
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
    /* renamed from: d */
    public static final <T, C extends Collection<? super T>> C m32053d(@NotNull Iterable<? extends T> iterable, @NotNull C c2) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    @NotNull
    /* renamed from: e */
    public static final <T> HashSet<T> m32054e(@NotNull Iterable<? extends T> iterable) {
        HashSet<T> hashSet = new HashSet<>(MapsKt.m32062g(CollectionsKt.m32032m(iterable, 12)));
        m32053d(iterable, hashSet);
        return hashSet;
    }

    @NotNull
    /* renamed from: f */
    public static final <T> List<T> m32055f(@NotNull Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return CollectionsKt.m32031l0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m32053d(iterable, arrayList);
        return arrayList;
    }
}
