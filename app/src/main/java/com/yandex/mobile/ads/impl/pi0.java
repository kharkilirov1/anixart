package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.sv0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pi0 extends AbstractC5912vd<qi0> {

    /* renamed from: c */
    @NonNull
    private final ti0 f53561c = new ti0();

    @Override // com.yandex.mobile.ads.impl.AbstractC5912vd
    @NonNull
    /* renamed from: a */
    public final HashMap mo27333a(@NonNull C5101g2 c5101g2) {
        HashMap mo27333a = super.mo27333a(c5101g2);
        mo27333a.put("image_loading_automatically", Boolean.valueOf(c5101g2.m24795q()));
        String[] m24789k = c5101g2.m24789k();
        if (m24789k != null && m24789k.length > 0) {
            mo27333a.put("image_sizes", c5101g2.m24789k());
        }
        return mo27333a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.AbstractC5912vd
    @NonNull
    /* renamed from: a */
    public final HashMap mo27332a(int i2, @NonNull C5101g2 c5101g2, @Nullable tw0 tw0Var) {
        sv0.EnumC5765c enumC5765c;
        T t;
        T t2;
        HashMap mo27332a = super.mo27332a(i2, c5101g2, tw0Var);
        if (204 == i2) {
            enumC5765c = sv0.EnumC5765c.f54862d;
        } else if (tw0Var != null && (t = tw0Var.f55247a) != 0 && i2 == 200) {
            AdResponse adResponse = (AdResponse) t;
            Objects.requireNonNull(this.f53561c);
            enumC5765c = null;
            qi0 qi0Var = (qi0) adResponse.m21801B();
            if (qi0Var != null) {
                enumC5765c = (sv0.EnumC5765c) qi0Var.m27738e().get("status");
            } else if (adResponse.m21836z() == null) {
                enumC5765c = sv0.EnumC5765c.f54861c;
            }
        } else {
            enumC5765c = sv0.EnumC5765c.f54861c;
        }
        if (enumC5765c != null) {
            mo27332a.put("status", enumC5765c.m28362a());
        }
        if (tw0Var != null && (t2 = tw0Var.f55247a) != 0) {
            ArrayList m28668a = this.f53561c.m28668a((AdResponse) t2);
            if (!m28668a.isEmpty()) {
                mo27332a.put("image_sizes", m28668a.toArray(new String[m28668a.size()]));
            }
            AdResponse adResponse2 = (AdResponse) tw0Var.f55247a;
            Objects.requireNonNull(this.f53561c);
            ArrayList m28667c = ti0.m28667c(adResponse2);
            if (!m28667c.isEmpty()) {
                mo27332a.put("native_ad_types", m28667c.toArray(new String[m28667c.size()]));
            }
        }
        return mo27332a;
    }
}
