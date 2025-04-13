package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import com.yandex.div.core.DivViewFacade;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mp */
/* loaded from: classes3.dex */
public final class C5454mp {

    /* renamed from: a */
    @NotNull
    private final C5689rh f52771a;

    /* renamed from: b */
    @NotNull
    private final HashMap f52772b;

    public C5454mp(@NotNull C5689rh mainClickConnector) {
        Intrinsics.m32179h(mainClickConnector, "mainClickConnector");
        this.f52771a = mainClickConnector;
        this.f52772b = new HashMap();
    }

    /* renamed from: a */
    public final void m26752a(int i2, @NotNull C5689rh clickConnector) {
        Intrinsics.m32179h(clickConnector, "clickConnector");
        this.f52772b.put(Integer.valueOf(i2), clickConnector);
    }

    /* renamed from: a */
    public final void m26753a(@NotNull Uri uri, @NotNull DivViewFacade view) {
        Intrinsics.m32179h(uri, "uri");
        Intrinsics.m32179h(view, "view");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            Integer m33910j0 = queryParameter2 != null ? StringsKt.m33910j0(queryParameter2) : null;
            if (m33910j0 == null) {
                C5689rh c5689rh = this.f52771a;
                View view2 = view.getView();
                Intrinsics.m32178g(view2, "view.view");
                c5689rh.m27922a(view2, queryParameter);
                return;
            }
            C5689rh c5689rh2 = (C5689rh) this.f52772b.get(m33910j0);
            if (c5689rh2 != null) {
                View view3 = view.getView();
                Intrinsics.m32178g(view3, "view.view");
                c5689rh2.m27922a(view3, queryParameter);
            }
        }
    }
}
