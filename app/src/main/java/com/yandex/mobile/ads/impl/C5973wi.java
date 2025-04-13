package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.wi */
/* loaded from: classes3.dex */
public final class C5973wi<V extends ViewGroup> implements InterfaceC5651qo<V>, InterfaceC5665r0 {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f56128a;

    /* renamed from: b */
    @NonNull
    private final qh0 f56129b;

    /* renamed from: c */
    @NonNull
    private final C5612q0 f56130c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5187hi f56131d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC5541ok f56132e;

    /* renamed from: f */
    @Nullable
    private InterfaceC5338ki f56133f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC5449mm f56134g;

    /* renamed from: com.yandex.mobile.ads.impl.wi$a */
    public static class a implements View.OnClickListener {

        /* renamed from: a */
        @NonNull
        private final InterfaceC5541ok f56135a;

        /* renamed from: b */
        @NonNull
        private final InterfaceC5449mm f56136b;

        public a(@NonNull InterfaceC5541ok interfaceC5541ok, @NonNull InterfaceC5449mm interfaceC5449mm) {
            this.f56135a = interfaceC5541ok;
            this.f56136b = interfaceC5449mm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f56135a.mo27088c();
            this.f56136b.mo26690a(EnumC5404lm.f52452b);
        }
    }

    public C5973wi(@NonNull AdResponse adResponse, @NonNull C5612q0 c5612q0, @NonNull ah1 ah1Var, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull qh0 qh0Var, @NonNull C5502nm c5502nm) {
        this.f56128a = adResponse;
        this.f56130c = c5612q0;
        this.f56131d = ah1Var;
        this.f56132e = interfaceC5541ok;
        this.f56129b = qh0Var;
        this.f56134g = c5502nm;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: a */
    public final void mo22712a(@NonNull V v) {
        View mo27723b = this.f56129b.mo27723b(v);
        ProgressBar mo27722a = this.f56129b.mo27722a(v);
        if (mo27723b == null) {
            this.f56132e.mo27088c();
            return;
        }
        this.f56130c.m27587a(this);
        cz0 m29824a = xz0.m29823b().m29824a(mo27723b.getContext());
        boolean z = false;
        boolean z2 = m29824a != null && m29824a.m23585X();
        if ("divkit".equals(this.f56128a.m21833w()) && z2) {
            z = true;
        }
        if (!z) {
            mo27723b.setOnClickListener(new a(this.f56132e, this.f56134g));
        }
        Long m21831u = this.f56128a.m21831u();
        long longValue = m21831u != null ? m21831u.longValue() : 0L;
        InterfaceC5338ki ks0Var = mo27722a != null ? new ks0(mo27723b, mo27722a, new C5197hr(), new C5691ri(), this.f56134g, longValue) : new C5295jn(mo27723b, this.f56131d, this.f56134g, longValue);
        this.f56133f = ks0Var;
        ks0Var.mo25883c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
    /* renamed from: b */
    public final void mo22945b() {
        InterfaceC5338ki interfaceC5338ki = this.f56133f;
        if (interfaceC5338ki != null) {
            interfaceC5338ki.mo25882b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5651qo
    /* renamed from: c */
    public final void mo22713c() {
        this.f56130c.m27589b(this);
        InterfaceC5338ki interfaceC5338ki = this.f56133f;
        if (interfaceC5338ki != null) {
            interfaceC5338ki.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5665r0
    /* renamed from: a */
    public final void mo22944a() {
        InterfaceC5338ki interfaceC5338ki = this.f56133f;
        if (interfaceC5338ki != null) {
            interfaceC5338ki.mo25880a();
        }
    }
}
