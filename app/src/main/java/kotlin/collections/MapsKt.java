package kotlin.collections;

import com.yandex.mobile.ads.C4632R;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class MapsKt extends MapsKt___MapsKt {
    @SinceKotlin
    /* renamed from: e */
    public static Object m32060e(@NotNull Map map, Object obj) {
        if (map instanceof MapWithDefault) {
            return ((MapWithDefault) map).mo32058e(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    @NotNull
    /* renamed from: f */
    public static HashMap m32061f(@NotNull Pair... pairArr) {
        HashMap hashMap = new HashMap(m32062g(pairArr.length));
        MapsKt__MapsKt.m32071b(hashMap, pairArr);
        return hashMap;
    }

    @PublishedApi
    /* renamed from: g */
    public static int m32062g(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    /* renamed from: h */
    public static Map m32063h(@NotNull Pair pair) {
        Intrinsics.m32179h(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f63055b, pair.f63056c);
        Intrinsics.m32178g(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @NotNull
    /* renamed from: i */
    public static Map m32064i(@NotNull Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.f63145b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g(pairArr.length));
        MapsKt__MapsKt.m32071b(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: j */
    public static Map m32065j(@NotNull Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g(pairArr.length));
        MapsKt__MapsKt.m32071b(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: k */
    public static Map m32066k(@NotNull Map map, @NotNull Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: l */
    public static Map m32067l(@NotNull Iterable iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyMap.f63145b;
        }
        if (size == 1) {
            return m32063h((Pair) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g(collection.size()));
        MapsKt__MapsKt.m32072c(iterable, linkedHashMap);
        return linkedHashMap;
    }

    @SinceKotlin
    @NotNull
    /* renamed from: m */
    public static Map m32068m(@NotNull Map map) {
        Intrinsics.m32179h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m32069n(map) : MapsKt__MapsJVMKt.m32070a(map) : EmptyMap.f63145b;
    }

    @SinceKotlin
    @NotNull
    /* renamed from: n */
    public static Map m32069n(@NotNull Map map) {
        Intrinsics.m32179h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
