package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.gd0;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.mediation.banner.e */
/* loaded from: classes3.dex */
final class C6159e extends gd0 {
    public C6159e(@NonNull C5101g2 c5101g2) {
        super(c5101g2);
    }

    @Override // com.yandex.mobile.ads.impl.gd0
    @NonNull
    /* renamed from: a */
    public final HashMap mo24843a(@NonNull Context context) {
        HashMap mo24843a = super.mo24843a(context);
        SizeInfo m24792n = this.f50549a.m24792n();
        if (m24792n != null) {
            mo24843a.put("width", Integer.valueOf(m24792n.m21916c(context)));
            mo24843a.put("height", Integer.valueOf(m24792n.m21913a(context)));
        }
        return mo24843a;
    }
}
