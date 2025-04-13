package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BrittleContainsOptimization.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class BrittleContainsOptimizationKt {
    @NotNull
    /* renamed from: a */
    public static final <T> Collection<T> m31983a(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> Collection<T> m31984b(@NotNull T[] tArr) {
        Intrinsics.m32179h(null, "<this>");
        throw null;
    }

    @NotNull
    /* renamed from: c */
    public static final <T> Collection<T> m31985c(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return CollectionSystemProperties.f63138a ? CollectionsKt___CollectionsKt.m32054e(iterable) : CollectionsKt.m32027j0(iterable);
        }
        if (((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return m31986d(collection) ? CollectionsKt___CollectionsKt.m32054e(iterable) : collection;
    }

    /* renamed from: d */
    public static final <T> boolean m31986d(Collection<? extends T> collection) {
        return CollectionSystemProperties.f63138a && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
