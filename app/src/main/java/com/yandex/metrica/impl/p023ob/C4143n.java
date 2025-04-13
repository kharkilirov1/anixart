package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.billing_interface.C3121g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.n */
/* loaded from: classes2.dex */
public final class C4143n {

    /* renamed from: a */
    @NotNull
    public static final C4143n f45964a = new C4143n();

    private C4143n() {
    }

    /* renamed from: a */
    public static void m20406a(C4143n c4143n, Map history, Map newBillingInfo, String type, InterfaceC4273s billingInfoManager, C3121g c3121g, int i2) {
        C3121g systemTimeProvider = (i2 & 16) != 0 ? new C3121g() : null;
        Intrinsics.m32179h(history, "history");
        Intrinsics.m32179h(newBillingInfo, "newBillingInfo");
        Intrinsics.m32179h(type, "type");
        Intrinsics.m32179h(billingInfoManager, "billingInfoManager");
        Intrinsics.m32179h(systemTimeProvider, "systemTimeProvider");
        long currentTimeMillis = System.currentTimeMillis();
        for (C3115a c3115a : history.values()) {
            if (newBillingInfo.containsKey(c3115a.f42393b)) {
                c3115a.f42396e = currentTimeMillis;
            } else {
                C3115a mo20069a = billingInfoManager.mo20069a(c3115a.f42393b);
                if (mo20069a != null) {
                    c3115a.f42396e = mo20069a.f42396e;
                }
            }
        }
        billingInfoManager.mo20070a((Map<String, C3115a>) history);
        if (billingInfoManager.mo20071a() || !Intrinsics.m32174c("inapp", type)) {
            return;
        }
        billingInfoManager.mo20072b();
    }
}
