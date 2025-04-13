package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wk */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC5976wk implements View.OnClickListener {

    /* renamed from: a */
    @NotNull
    private final lg0 f56152a;

    /* renamed from: b */
    @Nullable
    private final ig0 f56153b;

    /* renamed from: com.yandex.mobile.ads.impl.wk$a */
    public static final class a extends AbstractViewOnClickListenerC5976wk {

        /* renamed from: c */
        @NotNull
        private final sg0 f56154c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull sg0 multiBannerSwiper, @NotNull lg0 multiBannerEventTracker, @Nullable ig0 ig0Var) {
            super(multiBannerEventTracker, ig0Var, 0);
            Intrinsics.m32179h(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.m32179h(multiBannerEventTracker, "multiBannerEventTracker");
            this.f56154c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractViewOnClickListenerC5976wk, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f56154c.m28247b();
            super.onClick(view);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wk$b */
    public static final class b extends AbstractViewOnClickListenerC5976wk {

        /* renamed from: c */
        @NotNull
        private final sg0 f56155c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull sg0 multiBannerSwiper, @NotNull lg0 multiBannerEventTracker, @Nullable ig0 ig0Var) {
            super(multiBannerEventTracker, ig0Var, 0);
            Intrinsics.m32179h(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.m32179h(multiBannerEventTracker, "multiBannerEventTracker");
            this.f56155c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractViewOnClickListenerC5976wk, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f56155c.m28246a();
            super.onClick(view);
        }
    }

    private AbstractViewOnClickListenerC5976wk(lg0 lg0Var, ig0 ig0Var) {
        this.f56152a = lg0Var;
        this.f56153b = ig0Var;
    }

    public /* synthetic */ AbstractViewOnClickListenerC5976wk(lg0 lg0Var, ig0 ig0Var, int i2) {
        this(lg0Var, ig0Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        ig0 ig0Var = this.f56153b;
        if (ig0Var != null) {
            ig0Var.m25533a();
        }
        this.f56152a.m26450b();
    }
}
