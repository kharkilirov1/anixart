package com.yandex.mobile.ads.core.identifiers.p024ad.huawei;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C6061y7;
import com.yandex.mobile.ads.impl.C6110z7;
import com.yandex.mobile.ads.impl.n60;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.huawei.c */
/* loaded from: classes2.dex */
final class C4666c {

    /* renamed from: a */
    @NonNull
    private final C6110z7 f47813a = new C6110z7();

    @Nullable
    /* renamed from: a */
    public final C6061y7 m21976a(@NonNull ServiceConnectionC4665b serviceConnectionC4665b) {
        try {
            OpenDeviceIdentifierService m21975a = serviceConnectionC4665b.m21975a();
            if (m21975a == null) {
                return null;
            }
            String oaid = m21975a.getOaid();
            Boolean valueOf = Boolean.valueOf(m21975a.isOaidTrackLimited());
            Objects.requireNonNull(this.f47813a);
            if (valueOf == null || oaid == null) {
                return null;
            }
            return new C6061y7(oaid, valueOf.booleanValue());
        } catch (Exception e2) {
            n60.m26808a(e2, "Exception during advertising info reading from Huawei ads service", new Object[0]);
            return null;
        }
    }
}
