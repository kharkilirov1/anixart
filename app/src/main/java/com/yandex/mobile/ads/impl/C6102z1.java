package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.parser.vmap.configurator.AdBreakParameters;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.z1 */
/* loaded from: classes3.dex */
public final class C6102z1 {
    /* renamed from: a */
    public static void m30033a(@NonNull ArrayList arrayList, @NonNull AdBreakParameters adBreakParameters) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C5519o1) it.next()).m26978a(adBreakParameters);
        }
    }
}
