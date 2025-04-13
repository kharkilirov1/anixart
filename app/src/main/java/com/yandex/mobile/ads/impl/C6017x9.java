package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x9 */
/* loaded from: classes3.dex */
public final class C6017x9 {
    @Nullable
    /* renamed from: a */
    public static String m29700a() {
        try {
            return YandexMetrica.getLibraryVersion();
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            return null;
        }
    }
}
