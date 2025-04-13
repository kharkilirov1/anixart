package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.List;

/* loaded from: classes3.dex */
public final class m20 implements q20, ue0, oe1, gv0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5423a f52562a;

    /* renamed from: b */
    @NonNull
    private final o20 f52563b;

    /* renamed from: c */
    @NonNull
    private final C5211i3 f52564c;

    /* renamed from: d */
    @NonNull
    private final Context f52565d;

    /* renamed from: e */
    @Nullable
    private List<v01> f52566e;

    /* renamed from: f */
    @Nullable
    private AdImpressionData f52567f;

    /* renamed from: com.yandex.mobile.ads.impl.m20$a */
    public interface InterfaceC5423a {
        /* renamed from: a */
        void mo21751a(@Nullable AdImpressionData adImpressionData);
    }

    public m20(@NonNull Context context, @NonNull InterfaceC5423a interfaceC5423a, @NonNull p20 p20Var, @NonNull C5211i3 c5211i3) {
        this.f52565d = context.getApplicationContext();
        this.f52562a = interfaceC5423a;
        this.f52564c = c5211i3;
        this.f52563b = new o20(p20Var);
    }

    /* renamed from: a */
    public final void m26559a(@NonNull List<v01> list, @Nullable AdImpressionData adImpressionData) {
        this.f52566e = list;
        this.f52567f = adImpressionData;
        this.f52563b.m26985a();
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: b */
    public final void mo26325b() {
        if (m26558a()) {
            return;
        }
        this.f52563b.m26987c();
        cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
        if (m29824a == null || m29824a.m23616y()) {
            this.f52564c.m25430a();
            this.f52562a.mo21751a(this.f52567f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oe1
    /* renamed from: c */
    public final void mo26327c() {
        if (m26558a()) {
            return;
        }
        this.f52563b.m26986b();
        cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
        if (m29824a == null || m29824a.m23616y()) {
            return;
        }
        this.f52564c.m25430a();
        this.f52562a.mo21751a(this.f52567f);
    }

    @Override // com.yandex.mobile.ads.impl.ue0
    /* renamed from: d */
    public final void mo26329d() {
        if (m26558a()) {
            return;
        }
        this.f52563b.m26986b();
        cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
        if (m29824a == null || m29824a.m23616y()) {
            return;
        }
        this.f52564c.m25430a();
        this.f52562a.mo21751a(this.f52567f);
    }

    @Override // com.yandex.mobile.ads.impl.gv0
    /* renamed from: e */
    public final void mo24988e() {
        if (m26558a()) {
            cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
            if (m29824a == null || m29824a.m23616y()) {
                return;
            }
            this.f52564c.m25430a();
            this.f52562a.mo21751a(this.f52567f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q20
    /* renamed from: f */
    public final void mo26330f() {
        if (m26558a()) {
            cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
            if (m29824a == null || m29824a.m23616y()) {
                this.f52564c.m25430a();
                this.f52562a.mo21751a(this.f52567f);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.oe1
    /* renamed from: g */
    public final void mo26331g() {
        if (m26558a()) {
            return;
        }
        this.f52563b.m26987c();
        cz0 m29824a = xz0.m29823b().m29824a(this.f52565d);
        if (m29824a == null || m29824a.m23616y()) {
            this.f52564c.m25430a();
            this.f52562a.mo21751a(this.f52567f);
        }
    }

    /* renamed from: a */
    private boolean m26558a() {
        List<v01> list = this.f52566e;
        return (list == null || list.isEmpty()) ? false : true;
    }
}
