package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.u9 */
/* loaded from: classes3.dex */
public final class C5849u9 {
    /* renamed from: a */
    public static void m28914a() throws d60 {
        try {
            String libraryVersion = YandexMetrica.getLibraryVersion();
            Intrinsics.m32178g(libraryVersion, "try {\n            Yandex…CA_INTEGRATION)\n        }");
            if (new C5963w9(libraryVersion).compareTo(new C5963w9("4.0.0")) < 0) {
                throw new d60("Incorrect AppMetrica Version. Minimum supported AppMetrica SDK Version is 4.0.0. Please, check your AppMetrica integration.");
            }
        } catch (NoClassDefFoundError unused) {
            throw new d60("Incorrect AppMetrica Integration. Minimum supported AppMetrica SDK Version is 4.0.0. Please, check your AppMetrica integration.");
        }
    }
}
