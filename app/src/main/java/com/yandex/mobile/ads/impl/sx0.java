package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class sx0<V extends ViewGroup> implements InterfaceC5651qo<V> {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f54871a;

    /* renamed from: b */
    @NonNull
    private final zj0 f54872b;

    /* renamed from: c */
    @NonNull
    private final qh0 f54873c;

    /* renamed from: d */
    @NonNull
    private final C5612q0 f54874d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC5541ok f54875e;

    /* renamed from: f */
    @NonNull
    private final C5592pi f54876f = new C5592pi();

    /* renamed from: g */
    @Nullable
    private InterfaceC4942cw f54877g;

    /* renamed from: h */
    @Nullable
    private sx0<V>.C5769b f54878h;

    /* renamed from: com.yandex.mobile.ads.impl.sx0$a */
    public static class ViewOnClickListenerC5768a implements View.OnClickListener {

        /* renamed from: a */
        @NonNull
        private final InterfaceC5541ok f54879a;

        public ViewOnClickListenerC5768a(@NonNull InterfaceC5541ok interfaceC5541ok) {
            this.f54879a = interfaceC5541ok;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f54879a.mo27088c();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sx0$b */
    public class C5769b implements InterfaceC5665r0 {
        private C5769b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: a */
        public final void mo22944a() {
            if (sx0.this.f54877g != null) {
                sx0.this.f54877g.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
        /* renamed from: b */
        public final void mo22945b() {
            if (sx0.this.f54877g != null) {
                sx0.this.f54877g.pause();
            }
        }

        public /* synthetic */ C5769b(sx0 sx0Var, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sx0$c */
    public static class C5770c implements InterfaceC5748si {

        /* renamed from: a */
        private final WeakReference<View> f54881a;

        public C5770c(@NonNull View view) {
            this.f54881a = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5748si
        /* renamed from: a */
        public final void mo28252a() {
            View view = this.f54881a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public sx0(@NonNull AdResponse adResponse, @NonNull C5612q0 c5612q0, @NonNull rx0 rx0Var, @NonNull sh0 sh0Var, @NonNull zj0 zj0Var) {
        this.f54871a = adResponse;
        this.f54872b = zj0Var;
        this.f54874d = c5612q0;
        this.f54875e = rx0Var;
        this.f54873c = sh0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        sx0<V>.C5769b c5769b = this.f54878h;
        if (c5769b != null) {
            this.f54874d.m27589b(c5769b);
        }
        InterfaceC4942cw interfaceC4942cw = this.f54877g;
        if (interfaceC4942cw != null) {
            interfaceC4942cw.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        View mo27723b = this.f54873c.mo27723b(v);
        if (mo27723b == null) {
            this.f54875e.mo27088c();
            return;
        }
        int i2 = 0;
        sx0<V>.C5769b c5769b = new C5769b(this, i2);
        this.f54878h = c5769b;
        this.f54874d.m27587a(c5769b);
        cz0 m29824a = xz0.m29823b().m29824a(mo27723b.getContext());
        boolean z = m29824a != null && m29824a.m23585X();
        if ("divkit".equals(this.f54871a.m21833w()) && z) {
            i2 = 1;
        }
        if ((i2 ^ 1) != 0) {
            mo27723b.setOnClickListener(new ViewOnClickListenerC5768a(this.f54875e));
        }
        mo27723b.setVisibility(8);
        C5770c c5770c = new C5770c(mo27723b);
        C5592pi c5592pi = this.f54876f;
        AdResponse<?> adResponse = this.f54871a;
        zj0 zj0Var = this.f54872b;
        Objects.requireNonNull(c5592pi);
        InterfaceC4942cw m27331a = C5592pi.m27331a(adResponse, c5770c, zj0Var);
        this.f54877g = m27331a;
        m27331a.start();
    }
}
