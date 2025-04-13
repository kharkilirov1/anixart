package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.C2925a;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivData;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.hp */
/* loaded from: classes3.dex */
public final class C5195hp {
    @Nullable
    /* renamed from: a */
    public static DivData m25353a(@NonNull C5600pp c5600pp) {
        try {
            JSONObject m27359a = c5600pp.m27359a();
            JSONObject m27362d = c5600pp.m27362d();
            int i2 = ParsingErrorLogger.f34317a;
            DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(C2925a.f34331c);
            if (m27362d != null) {
                divParsingEnvironment.m17529c(m27362d);
            }
            return DivData.f35444h.m17609a(divParsingEnvironment, m27359a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
