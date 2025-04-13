package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: Maps.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    /* renamed from: b */
    public static final <K, V> void m32071b(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.f63055b, (Object) pair.f63056c);
        }
    }

    @NotNull
    /* renamed from: c */
    public static final <K, V, M extends Map<? super K, ? super V>> M m32072c(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m2) {
        for (Pair<? extends K, ? extends V> pair : iterable) {
            m2.put(pair.f63055b, pair.f63056c);
        }
        return m2;
    }
}
