package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.IParamsCallback;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.BrittleContainsOptimizationKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Oi */
/* loaded from: classes2.dex */
public final class C3525Oi {

    /* renamed from: a */
    private static final Set<String> f43575a = SetsKt.m32080g(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid");

    /* renamed from: b */
    @NotNull
    private static InterfaceC3529Om f43576b = new C3504Nm();

    /* renamed from: c */
    @NotNull
    private static C4266ri f43577c = new C4266ri();

    @JvmStatic
    /* renamed from: a */
    public static final boolean m18682a(long j2) {
        return f43576b.mo18644b() > j2;
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m18686b(@NotNull C3575Qi c3575Qi) {
        if (!c3575Qi.m18823D()) {
            if (!(f43576b.mo18644b() > c3575Qi.m18822C() + ((long) c3575Qi.m18834O().m19166a()))) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m18683a(@NotNull C3575Qi c3575Qi) {
        return m18685a(c3575Qi.m18841V()) && m18685a(c3575Qi.m18851i()) && m18685a(c3575Qi.m18853k());
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m18685a(@Nullable String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @JvmStatic
    /* renamed from: a */
    public static final boolean m18684a(@NotNull C3575Qi c3575Qi, @Nullable Collection<String> collection, @Nullable Map<String, String> map, @NotNull Function0<C3556Q> function0) {
        boolean z;
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (String str : collection) {
                switch (str.hashCode()) {
                    case -220514361:
                        if (str.equals("yandex_mobile_metrica_device_id")) {
                            z = m18685a(c3575Qi.m18851i());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    case 299713912:
                        if (str.equals("appmetrica_device_id_hash")) {
                            z = m18685a(c3575Qi.m18853k());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    case 530390881:
                        if (str.equals("yandex_mobile_metrica_report_ad_url")) {
                            z = m18685a(c3575Qi.m18826G());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    case 538565458:
                        if (str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)) {
                            z = f43577c.m20665a(map, c3575Qi, function0.invoke());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    case 1541938616:
                        if (str.equals("yandex_mobile_metrica_uuid")) {
                            z = m18685a(c3575Qi.m18841V());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    case 1630523545:
                        if (str.equals("yandex_mobile_metrica_get_ad_url")) {
                            z = m18685a(c3575Qi.m18859q());
                            break;
                        }
                        z = !m18686b(c3575Qi);
                        break;
                    default:
                        z = !m18686b(c3575Qi);
                        break;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final Collection<String> m18681a(@NotNull Collection<String> collection) {
        Set<String> other = f43575a;
        Intrinsics.m32179h(collection, "<this>");
        Intrinsics.m32179h(other, "other");
        Set m32033m0 = CollectionsKt.m32033m0(collection);
        TypeIntrinsics.m32212a(m32033m0).retainAll(BrittleContainsOptimizationKt.m31985c(other, m32033m0));
        return m32033m0;
    }
}
