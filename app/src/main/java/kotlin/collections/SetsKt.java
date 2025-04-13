package kotlin.collections;

import com.yandex.mobile.ads.C4632R;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class SetsKt extends SetsKt___SetsKt {
    @NotNull
    /* renamed from: a */
    public static LinkedHashSet m32074a(@NotNull Object... elements) {
        Intrinsics.m32179h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(elements.length));
        ArraysKt___ArraysKt.m31982f(elements, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: b */
    public static Set m32075b(@NotNull Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(objArr.length));
        ArraysKt___ArraysKt.m31982f(objArr, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: c */
    public static Set m32076c(@NotNull Set set) {
        int size = set.size();
        return size != 0 ? size != 1 ? set : m32079f(set.iterator().next()) : EmptySet.f63146b;
    }

    @NotNull
    /* renamed from: d */
    public static Set m32077d(@NotNull Set set, @NotNull Iterable elements) {
        Intrinsics.m32179h(set, "<this>");
        Intrinsics.m32179h(elements, "elements");
        Integer valueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt.m32020g(linkedHashSet, elements);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: e */
    public static Set m32078e(@NotNull Set set, Object obj) {
        Intrinsics.m32179h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m32062g(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: f */
    public static Set m32079f(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.m32178g(singleton, "singleton(element)");
        return singleton;
    }

    @NotNull
    /* renamed from: g */
    public static Set m32080g(@NotNull Object... objArr) {
        return objArr.length > 0 ? ArraysKt.m31955e0(objArr) : EmptySet.f63146b;
    }
}
