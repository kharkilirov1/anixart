package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gu */
/* loaded from: classes3.dex */
public final class C5146gu implements k40 {

    /* renamed from: e */
    private static final int f50733e = C4632R.drawable.yandex_ads_internal_instream_adtune_control_v2;

    /* renamed from: a */
    @Nullable
    private final C5276ja<?> f50734a;

    /* renamed from: b */
    @NotNull
    private final C5480na f50735b;

    /* renamed from: c */
    @NotNull
    private final tf1 f50736c;

    /* renamed from: d */
    @NotNull
    private final C5380l7 f50737d;

    public C5146gu(@Nullable C5276ja<?> c5276ja, @NotNull C5480na assetClickConfigurator, @NotNull tf1 videoTracker, @NotNull mo0 openUrlHandler, @NotNull n30 instreamAdEventController) {
        Intrinsics.m32179h(assetClickConfigurator, "assetClickConfigurator");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(openUrlHandler, "openUrlHandler");
        Intrinsics.m32179h(instreamAdEventController, "instreamAdEventController");
        this.f50734a = c5276ja;
        this.f50735b = assetClickConfigurator;
        this.f50736c = videoTracker;
        this.f50737d = new C5380l7(instreamAdEventController, openUrlHandler);
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Object obj;
        a80 m25823a;
        List<AbstractC5419m> m22400a;
        Object obj2;
        Intrinsics.m32179h(uiElements, "uiElements");
        ImageView m28936h = uiElements.m28936h();
        if (m28936h != null) {
            m28936h.setImageDrawable(ContextCompat.m1671d(m28936h.getContext(), f50733e));
            m28936h.setVisibility(0);
            C5276ja<?> c5276ja = this.f50734a;
            if (c5276ja == null || (m25823a = c5276ja.m25823a()) == null || (m22400a = m25823a.m22400a()) == null) {
                obj = null;
            } else {
                Iterator<T> it = m22400a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (Intrinsics.m32174c(((AbstractC5419m) obj2).m26547a(), "adtune")) {
                            break;
                        }
                    }
                }
                obj = (AbstractC5419m) obj2;
            }
            C4958d7 c4958d7 = obj instanceof C4958d7 ? (C4958d7) obj : null;
            if (c4958d7 == null) {
                this.f50735b.m26825a(m28936h, this.f50734a);
                return;
            }
            Context context = m28936h.getContext();
            Intrinsics.m32178g(context, "feedbackView.context");
            m28936h.setOnClickListener(new ViewOnClickListenerC5092fu(c4958d7, this.f50737d, this.f50736c, new le1(context)));
        }
    }
}
