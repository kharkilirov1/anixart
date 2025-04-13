package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k80 {

    /* renamed from: a */
    @NotNull
    private final Context f51887a;

    /* renamed from: b */
    @NotNull
    private final C5101g2 f51888b;

    /* renamed from: c */
    @NotNull
    private final C5849u9 f51889c;

    /* renamed from: d */
    @NotNull
    private final te0 f51890d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public k80(@NotNull Context context, @NotNull C5101g2 adConfiguration) {
        this(context, adConfiguration, 0);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
    }

    @JvmOverloads
    public k80(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull C5849u9 appMetricaIntegrationValidator, @NotNull te0 mobileAdsIntegrationValidator) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(appMetricaIntegrationValidator, "appMetricaIntegrationValidator");
        Intrinsics.m32179h(mobileAdsIntegrationValidator, "mobileAdsIntegrationValidator");
        this.f51887a = context;
        this.f51888b = adConfiguration;
        this.f51889c = appMetricaIntegrationValidator;
        this.f51890d = mobileAdsIntegrationValidator;
    }

    /* renamed from: a */
    private final List<C5563p2> m26068a() {
        C5563p2 m26996a;
        C5563p2 m26996a2;
        C5563p2[] c5563p2Arr = new C5563p2[4];
        try {
            Objects.requireNonNull(this.f51889c);
            C5849u9.m28914a();
            m26996a = null;
        } catch (d60 e2) {
            m26996a = AbstractC5524o4.m26996a(e2.getMessage());
        }
        c5563p2Arr[0] = m26996a;
        try {
            this.f51890d.m28643a(this.f51887a);
            m26996a2 = null;
        } catch (d60 e3) {
            m26996a2 = AbstractC5524o4.m26996a(e3.getMessage());
        }
        c5563p2Arr[1] = m26996a2;
        c5563p2Arr[2] = this.f51888b.m24779c() == null ? AbstractC5524o4.f53164p : null;
        c5563p2Arr[3] = this.f51888b.m24765a() == null ? AbstractC5524o4.f53162n : null;
        return CollectionsKt.m31996I(c5563p2Arr);
    }

    @Nullable
    /* renamed from: b */
    public final C5563p2 m26069b() {
        List m32002O = CollectionsKt.m32002O(m26068a(), CollectionsKt.m31995H(this.f51888b.m24792n() == null ? AbstractC5524o4.f53165q : null));
        String m24033a = this.f51888b.m24775b().m24033a();
        Intrinsics.m32178g(m24033a, "adConfiguration.adType.typeName");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32002O, 10));
        Iterator it = m32002O.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5563p2) it.next()).m27145b());
        }
        C5667r2.m27824a(m24033a, arrayList);
        return (C5563p2) CollectionsKt.m32046w(m32002O);
    }

    @Nullable
    /* renamed from: c */
    public final C5563p2 m26070c() {
        return (C5563p2) CollectionsKt.m32046w(m26068a());
    }

    public /* synthetic */ k80(Context context, C5101g2 c5101g2, int i2) {
        this(context, c5101g2, new C5849u9(), te0.f55096e.m28644a());
    }
}
