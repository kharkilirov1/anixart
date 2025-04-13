package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.jn */
/* loaded from: classes3.dex */
public final class C5295jn implements InterfaceC5338ki {

    /* renamed from: a */
    @NonNull
    private final View f51654a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5187hi f51655b;

    /* renamed from: c */
    @NonNull
    private final lp0 f51656c = new lp0(true);

    /* renamed from: d */
    @NonNull
    private final InterfaceC5449mm f51657d;

    /* renamed from: e */
    private final long f51658e;

    /* renamed from: com.yandex.mobile.ads.impl.jn$a */
    public static class a implements mp0 {

        /* renamed from: a */
        @NonNull
        private final WeakReference<View> f51659a;

        /* renamed from: b */
        @NonNull
        private final InterfaceC5187hi f51660b;

        /* renamed from: c */
        @NonNull
        private final InterfaceC5449mm f51661c;

        public a(@NonNull View view, @NonNull InterfaceC5187hi interfaceC5187hi, @NonNull InterfaceC5449mm interfaceC5449mm) {
            this.f51659a = new WeakReference<>(view);
            this.f51660b = interfaceC5187hi;
            this.f51661c = interfaceC5449mm;
        }

        @Override // com.yandex.mobile.ads.impl.mp0
        /* renamed from: a */
        public final void mo24218a() {
            View view = this.f51659a.get();
            if (view != null) {
                this.f51660b.mo22526b(view);
                this.f51661c.mo26690a(EnumC5404lm.f52454d);
            }
        }
    }

    public C5295jn(@NonNull View view, @NonNull InterfaceC5187hi interfaceC5187hi, @NonNull InterfaceC5449mm interfaceC5449mm, long j2) {
        this.f51654a = view;
        this.f51658e = j2;
        this.f51655b = interfaceC5187hi;
        this.f51657d = interfaceC5449mm;
        interfaceC5187hi.mo22525a(view);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25880a() {
        this.f51656c.m26517d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: a */
    public final void mo25881a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: b */
    public final void mo25882b() {
        this.f51656c.m26516b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    /* renamed from: c */
    public final void mo25883c() {
        this.f51656c.m26514a(this.f51658e, new a(this.f51654a, this.f51655b, this.f51657d));
        this.f51657d.mo26690a(EnumC5404lm.f52453c);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    @NonNull
    /* renamed from: d */
    public final View mo25884d() {
        return this.f51654a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5338ki
    public final void invalidate() {
        this.f51656c.m26513a();
    }
}
