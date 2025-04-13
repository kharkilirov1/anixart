package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.vx */
/* loaded from: classes3.dex */
public final class C5945vx {

    /* renamed from: a */
    @NonNull
    private final Context f55895a;

    /* renamed from: b */
    @NonNull
    private final vu0 f55896b = new vu0();

    /* renamed from: c */
    @NonNull
    private final C6110z7 f55897c = new C6110z7();

    public C5945vx(@NonNull Context context) {
        this.f55895a = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    @Nullable
    /* renamed from: a */
    public final C6061y7 m29283a() {
        try {
            Objects.requireNonNull(this.f55896b);
            if (AdvertisingIdClient.class == 0) {
                return null;
            }
            vu0 vu0Var = this.f55896b;
            Object[] objArr = {this.f55895a};
            Objects.requireNonNull(vu0Var);
            Object m29276a = vu0.m29276a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (m29276a == null) {
                return null;
            }
            String str = (String) vu0.m29279a(m29276a, "getId", new Object[0]);
            Boolean bool = (Boolean) vu0.m29279a(m29276a, "isLimitAdTrackingEnabled", new Object[0]);
            Objects.requireNonNull(this.f55897c);
            if (bool == null || str == null) {
                return null;
            }
            return new C6061y7(str, bool.booleanValue());
        } catch (Throwable th) {
            n60.m26808a(th, "Exception during advertising info receiving from GMS client API", new Object[0]);
            return null;
        }
    }
}
