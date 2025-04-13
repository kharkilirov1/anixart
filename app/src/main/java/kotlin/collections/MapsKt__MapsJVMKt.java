package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapsJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
class MapsKt__MapsJVMKt extends MapsKt__MapWithDefaultKt {
    @NotNull
    /* renamed from: a */
    public static final <K, V> Map<K, V> m32070a(@NotNull Map<? extends K, ? extends V> map) {
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.m32178g(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
