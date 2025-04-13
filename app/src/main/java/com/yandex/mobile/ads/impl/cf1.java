package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cf1 {

    /* renamed from: a */
    @NonNull
    private final ul0 f49222a;

    /* renamed from: b */
    @NonNull
    private final hs0 f49223b;

    /* renamed from: com.yandex.mobile.ads.impl.cf1$a */
    public static final class RunnableC4919a implements Runnable {

        /* renamed from: b */
        @NonNull
        private final sl0 f49224b;

        /* renamed from: c */
        @NonNull
        private final ul0 f49225c;

        public RunnableC4919a(@NonNull sl0 sl0Var, @NonNull ul0 ul0Var) {
            this.f49224b = sl0Var;
            this.f49225c = ul0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f49225c.m29041a(this.f49224b.m28319a().m27939a());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.cf1$b */
    public static final class RunnableC4920b implements Runnable {

        /* renamed from: b */
        @NonNull
        private final sl0 f49226b;

        /* renamed from: c */
        @NonNull
        private final hs0 f49227c;

        public RunnableC4920b(@NonNull sl0 sl0Var, @NonNull hs0 hs0Var) {
            this.f49226b = sl0Var;
            this.f49227c = hs0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            te1 m28320b = this.f49226b.m28320b();
            Objects.requireNonNull(this.f49227c);
            m28320b.m28645a().setVisibility(8);
            this.f49226b.m28321c().setVisibility(0);
        }
    }

    public cf1(@NonNull ul0 ul0Var, @NonNull hs0 hs0Var) {
        this.f49222a = ul0Var;
        this.f49223b = hs0Var;
    }

    /* renamed from: a */
    public final void m23248a(@NonNull sl0 sl0Var) {
        TextureView m28321c = sl0Var.m28321c();
        m28321c.setAlpha(0.0f);
        m28321c.animate().setDuration(500L).alpha(1.0f).withStartAction(new RunnableC4920b(sl0Var, this.f49223b)).withEndAction(new RunnableC4919a(sl0Var, this.f49222a)).start();
    }
}
