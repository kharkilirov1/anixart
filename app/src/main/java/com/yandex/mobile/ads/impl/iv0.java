package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class iv0 {

    /* renamed from: com.yandex.mobile.ads.impl.iv0$a */
    public static class RunnableC5250a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final sl0 f51443b;

        /* renamed from: c */
        @NonNull
        private final lv0 f51444c;

        public RunnableC5250a(@NonNull sl0 sl0Var, @NonNull lv0 lv0Var) {
            this.f51443b = sl0Var;
            this.f51444c = lv0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f51443b.m28321c().setVisibility(4);
            this.f51444c.m26538a().setVisibility(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.iv0$b */
    public static class RunnableC5251b implements Runnable {

        /* renamed from: b */
        @NonNull
        private final lv0 f51445b;

        /* renamed from: c */
        @NonNull
        private final Bitmap f51446c;

        public RunnableC5251b(@NonNull lv0 lv0Var, @NonNull Bitmap bitmap) {
            this.f51445b = lv0Var;
            this.f51446c = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f51445b.setBackground(new BitmapDrawable(this.f51445b.getResources(), this.f51446c));
            this.f51445b.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m25737a(@NonNull sl0 sl0Var, @NonNull lv0 lv0Var, @NonNull Bitmap bitmap) {
        lv0Var.setAlpha(0.0f);
        lv0Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new RunnableC5251b(lv0Var, bitmap)).withEndAction(new RunnableC5250a(sl0Var, lv0Var)).start();
    }
}
