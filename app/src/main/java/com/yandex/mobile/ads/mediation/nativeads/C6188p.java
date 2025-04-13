package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C5733sa;
import com.yandex.mobile.ads.impl.C6066ya;
import com.yandex.mobile.ads.impl.InterfaceC6019xa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.p */
/* loaded from: classes3.dex */
final class C6188p {

    /* renamed from: a */
    @NonNull
    private final C6173a f57563a;

    /* renamed from: b */
    @NonNull
    private final C6176d f57564b;

    /* renamed from: c */
    @NonNull
    private final C5733sa f57565c;

    /* renamed from: d */
    @NonNull
    private final C6066ya f57566d;

    public C6188p(@NonNull Context context) {
        C6173a c6173a = new C6173a(context, new C6175c());
        this.f57563a = c6173a;
        this.f57564b = new C6176d(c6173a);
        this.f57565c = new C5733sa();
        this.f57566d = new C6066ya();
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m30435a(@NonNull MediatedNativeAdAssets mediatedNativeAdAssets, @NonNull Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m30434a(mediatedNativeAdAssets.getAge(), "age"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getBody(), "body"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getCallToAction(), "call_to_action"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getDomain(), "domain"));
        arrayList.add(m30434a(this.f57563a.m30420a(map, mediatedNativeAdAssets.getFavicon()), "favicon"));
        arrayList.add(m30434a(this.f57563a.m30420a(map, mediatedNativeAdAssets.getIcon()), "icon"));
        arrayList.add(m30434a(this.f57564b.m30422a(map, mediatedNativeAdAssets.getImage(), mediatedNativeAdAssets.getMedia()), "media"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getPrice(), "price"));
        arrayList.add(m30434a(String.valueOf(mediatedNativeAdAssets.getRating()), "rating"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getReviewCount(), "review_count"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getSponsored(), "sponsored"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getTitle(), "title"));
        arrayList.add(m30434a(mediatedNativeAdAssets.getWarning(), "warning"));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5276ja c5276ja = (C5276ja) it.next();
            if (c5276ja != null) {
                arrayList2.add(c5276ja);
            }
        }
        return arrayList2;
    }

    @Nullable
    /* renamed from: a */
    private C5276ja m30434a(@Nullable Object obj, @NonNull String str) {
        Objects.requireNonNull(this.f57566d);
        InterfaceC6019xa m29881a = C6066ya.m29881a(str);
        if (obj == null || !m29881a.mo26351a(obj)) {
            return null;
        }
        Objects.requireNonNull(this.f57565c);
        return C5733sa.m28135a(str).mo22364a(obj, str);
    }
}
