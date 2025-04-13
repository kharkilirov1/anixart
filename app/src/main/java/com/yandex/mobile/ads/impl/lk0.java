package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
public final class lk0 {

    /* renamed from: a */
    @NonNull
    private final ox0 f52433a;

    /* renamed from: b */
    @Nullable
    private final InterfaceC4942cw f52434b;

    /* renamed from: c */
    @Nullable
    private View f52435c;

    /* renamed from: com.yandex.mobile.ads.impl.lk0$a */
    public class C5402a implements qs0 {
        private C5402a() {
        }

        @Override // com.yandex.mobile.ads.impl.qs0
        /* renamed from: a */
        public final void mo26485a() {
            if (lk0.this.f52435c != null) {
                lk0.this.f52435c.setVisibility(8);
            }
        }

        public /* synthetic */ C5402a(lk0 lk0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.qs0
        /* renamed from: a */
        public final void mo26486a(long j2, long j3) {
            if (lk0.this.f52435c != null) {
                lk0.this.f52433a.m27129a(lk0.this.f52435c, j2, j3);
            }
        }
    }

    public lk0(@NonNull AdResponse<?> adResponse, @NonNull o61 o61Var, @NonNull zj0 zj0Var) {
        this.f52434b = px0.m27579a(adResponse, new C5402a(this, 0), zj0Var);
        this.f52433a = new ox0(o61Var);
    }

    /* renamed from: c */
    public final void m26484c() {
        InterfaceC4942cw interfaceC4942cw = this.f52434b;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.resume();
        }
    }

    /* renamed from: a */
    public final void m26482a(@Nullable View view) {
        this.f52435c = view;
        InterfaceC4942cw interfaceC4942cw = this.f52434b;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.start();
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void m26483b() {
        InterfaceC4942cw interfaceC4942cw = this.f52434b;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.pause();
        }
    }

    /* renamed from: a */
    public final void m26481a() {
        this.f52435c = null;
        InterfaceC4942cw interfaceC4942cw = this.f52434b;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.invalidate();
        }
    }
}
