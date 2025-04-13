package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.lh */
/* loaded from: classes2.dex */
public class C4109lh implements InterfaceC4161nh<C3974gc> {
    /* renamed from: a */
    public void m20389a(@NonNull Uri.Builder builder, @NonNull C3974gc c3974gc) {
        m20388a(builder, "adv_id", "limit_ad_tracking", c3974gc.m19958a().f44822a);
        m20388a(builder, "oaid", "limit_oaid_tracking", c3974gc.m19959b().f44822a);
        m20388a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", c3974gc.m19960c().f44822a);
    }

    /* renamed from: a */
    private void m20388a(@NonNull Uri.Builder builder, @NonNull String str, @NonNull String str2, @Nullable C3818ac c3818ac) {
        String str3 = "";
        if (c3818ac == null) {
            builder.appendQueryParameter(str, "");
            builder.appendQueryParameter(str2, "");
            return;
        }
        builder.appendQueryParameter(str, C3509O2.m18657b(c3818ac.f44734b));
        Boolean bool = c3818ac.f44735c;
        if (bool != null) {
            str3 = bool.booleanValue() ? "1" : "0";
        }
        builder.appendQueryParameter(str2, str3);
    }
}
