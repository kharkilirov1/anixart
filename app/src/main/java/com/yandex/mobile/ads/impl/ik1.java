package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4635c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ik1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    @NotNull
    private final AbstractC4639g f51329a;

    /* renamed from: b */
    @NotNull
    private final C5101g2 f51330b;

    /* renamed from: c */
    @NotNull
    private final C4635c f51331c;

    /* renamed from: d */
    @NotNull
    private final g90 f51332d;

    /* renamed from: e */
    @NotNull
    private final m60 f51333e;

    /* renamed from: f */
    @NotNull
    private final RunnableC5237a f51334f;

    /* renamed from: com.yandex.mobile.ads.impl.ik1$a */
    public static final class RunnableC5237a implements Runnable {

        /* renamed from: b */
        @NotNull
        private final AbstractC4639g f51335b;

        public RunnableC5237a(@NotNull AbstractC4639g adView) {
            Intrinsics.m32179h(adView, "adView");
            this.f51335b = adView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hg1.m25195a(this.f51335b, false);
        }
    }

    public ik1(@NotNull Context context, @NotNull AbstractC4639g adView, @NotNull C5101g2 adConfiguration, @NotNull C4635c contentController, @NotNull g90 mainThreadHandler, @NotNull m60 sizeInfoController, @NotNull RunnableC5237a removePreviousBannerRunnable) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adView, "adView");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(contentController, "contentController");
        Intrinsics.m32179h(mainThreadHandler, "mainThreadHandler");
        Intrinsics.m32179h(sizeInfoController, "sizeInfoController");
        Intrinsics.m32179h(removePreviousBannerRunnable, "removePreviousBannerRunnable");
        this.f51329a = adView;
        this.f51330b = adConfiguration;
        this.f51331c = contentController;
        this.f51332d = mainThreadHandler;
        this.f51333e = sizeInfoController;
        this.f51334f = removePreviousBannerRunnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        n60.m26811d("onPreDraw(), clazz = " + this, new Object[0]);
        this.f51331c.m24329l();
        this.f51333e.m26582a(this.f51330b, this.f51329a);
        this.f51332d.m24829a(this.f51334f);
        return true;
    }

    public /* synthetic */ ik1(Context context, AbstractC4639g abstractC4639g, C5101g2 c5101g2, C4635c c4635c) {
        this(context, abstractC4639g, c5101g2, c4635c, new g90(), new m60(context), new RunnableC5237a(abstractC4639g));
    }
}
