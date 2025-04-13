package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dg0 {
    @MainThread
    @NotNull
    /* renamed from: a */
    public static yf0 m23880a(@NotNull Context context, @NotNull ka0 media, @NotNull l20 impressionEventsObservable, @NotNull bm0 nativeWebViewController) throws mi1 {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(media, "media");
        Intrinsics.m32179h(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.m32179h(nativeWebViewController, "nativeWebViewController");
        yf0 m24593b = fg0.f50259c.m24595a(context).m24593b(media);
        if (m24593b == null) {
            m24593b = new yf0(context);
        }
        nf0 m29937i = m24593b.m29937i();
        m29937i.m26881a(impressionEventsObservable);
        m29937i.m26882a((ve0) nativeWebViewController);
        m29937i.m26880a((ko0) nativeWebViewController);
        return m24593b;
    }
}
