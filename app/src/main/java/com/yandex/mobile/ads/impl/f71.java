package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.m20;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class f71 extends AbstractC6147zy implements m20.InterfaceC5423a, InterfaceC4832b0 {

    /* renamed from: e */
    @NonNull
    private final Context f50135e;

    /* renamed from: f */
    @NonNull
    private final AdResponse<?> f50136f;

    /* renamed from: g */
    @NonNull
    private final an0 f50137g;

    /* renamed from: h */
    @NonNull
    private final InterfaceC5674r6 f50138h;

    /* renamed from: i */
    @NonNull
    private final l20 f50139i;

    /* renamed from: j */
    @NonNull
    private final m20 f50140j;

    /* renamed from: k */
    @NonNull
    private final C4786a0 f50141k;

    /* renamed from: l */
    @NonNull
    private final zu0 f50142l;

    /* renamed from: com.yandex.mobile.ads.impl.f71$a */
    public class C5061a implements h71 {
        public C5061a() {
        }

        @Override // com.yandex.mobile.ads.impl.h71
        @NonNull
        /* renamed from: a */
        public final aa1 mo24330a(int i2) {
            return new aa1(f71.m24324b(f71.this) ? aa1.EnumC4801a.f48463l : !f71.this.mo21754k() ? aa1.EnumC4801a.f48465n : !f71.this.mo21753j() ? aa1.EnumC4801a.f48460i : aa1.EnumC4801a.f48453b, new C5472n4());
        }

        @Override // com.yandex.mobile.ads.impl.h71
        @NonNull
        /* renamed from: b */
        public final aa1 mo24331b(int i2) {
            return new aa1(f71.this.m27311d() ? aa1.EnumC4801a.f48454c : f71.m24324b(f71.this) ? aa1.EnumC4801a.f48463l : !f71.this.mo21754k() ? aa1.EnumC4801a.f48465n : (f71.this.mo21752a(i2) && f71.this.mo21753j()) ? aa1.EnumC4801a.f48453b : aa1.EnumC4801a.f48460i, new C5472n4());
        }
    }

    public f71(@NonNull Context context, @NonNull InterfaceC5674r6 interfaceC5674r6, @NonNull AdResponse<String> adResponse, @NonNull C5101g2 c5101g2) {
        super(context, adResponse);
        C5061a c5061a = new C5061a();
        this.f50135e = context;
        this.f50136f = adResponse;
        this.f50138h = interfaceC5674r6;
        C5211i3 c5211i3 = new C5211i3(new C4830az(adResponse));
        p20 p20Var = new p20(context, c5101g2);
        l20 l20Var = new l20();
        this.f50139i = l20Var;
        this.f50140j = n20.m26790a(context, this, p20Var, c5211i3, l20Var);
        an0 m22876a = bn0.m22876a(context, c5101g2, p20Var, c5061a, C5427m6.m26576a(this));
        this.f50137g = m22876a;
        m22876a.mo22552a(l20Var);
        l20Var.m26323a(new zm0(m22876a));
        this.f50141k = new C4786a0(context, c5101g2, this);
        this.f50142l = new zu0(context, new C5425m4(context, interfaceC5674r6, new C5050ez()), adResponse, c5101g2, c5211i3, l20Var, null, adResponse.m21820j());
    }

    @Override // com.yandex.mobile.ads.impl.yp0.InterfaceC6087a
    /* renamed from: a */
    public final void mo21796a(@NonNull Intent intent) {
        StringBuilder m26356a = l60.m26356a("onPhoneStateChanged(), intent.getAction = ");
        m26356a.append(intent.getAction());
        m26356a.append(", isAdVisible = ");
        m26356a.append(this.f50138h.mo21750b());
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f50137g.mo22550a(intent, this.f50138h.mo21750b());
    }

    /* renamed from: a */
    public abstract boolean mo21752a(int i2);

    /* renamed from: b */
    public final void m24326b(int i2) {
        n60.m26811d(k60.m26036a("onVisibilityChanged(), visibility = ", i2), new Object[0]);
        cz0 m29824a = xz0.m29823b().m29824a(this.f50135e);
        if (m29824a != null && m29824a.m23573L()) {
            if (i2 == 0) {
                this.f50137g.mo22553b();
            } else {
                this.f50137g.mo22549a();
            }
        } else if (this.f50138h.mo21750b()) {
            this.f50137g.mo22553b();
        } else {
            this.f50137g.mo22549a();
        }
        n60.m26811d("View's ground is changed for controller <%s>, mode: %d", getClass().toString(), Integer.valueOf(i2));
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC6147zy
    /* renamed from: g */
    public final void mo24327g() {
        n60.m26811d("cleanOut(), clazz = " + this, new Object[0]);
        super.mo24327g();
        this.f50137g.mo22549a();
        this.f50142l.m30304c();
    }

    @NonNull
    /* renamed from: i */
    public final l20 m24328i() {
        return this.f50139i;
    }

    /* renamed from: j */
    public abstract boolean mo21753j();

    /* renamed from: k */
    public abstract boolean mo21754k();

    /* renamed from: l */
    public final synchronized void m24329l() {
        n60.m26811d("trackAdOnDisplayed(), clazz = " + this, new Object[0]);
        this.f50137g.mo22553b();
        this.f50142l.m30303b();
    }

    public void onReceiveResult(int i2, @Nullable Bundle bundle) {
        n60.m26811d(k60.m26036a("onReceiveResult(), resultCode = ", i2), new Object[0]);
        if (i2 == 14) {
            this.f50139i.mo26329d();
        }
        if (i2 == 15) {
            this.f50139i.mo26325b();
            return;
        }
        switch (i2) {
            case 6:
                onLeftApplication();
                this.f50141k.m22344f();
                break;
            case 7:
                onLeftApplication();
                this.f50141k.m22342d();
                break;
            case 8:
                this.f50141k.m22343e();
                break;
            case 9:
                n60.m26811d("onAdOpenUrl()", new Object[0]);
                this.f50141k.m22337a();
                this.f50139i.mo26321a();
                break;
        }
    }

    /* renamed from: a */
    public final void m24325a(@Nullable Map<String, String> map) {
        n60.m26811d("startHtmlAdTracking(), clazz = " + this, new Object[0]);
        ArrayList m26577a = C5427m6.m26577a(this.f50136f, map);
        this.f50140j.m26559a(m26577a, this.f50136f.m21835y());
        this.f50137g.mo22551a(this.f50136f, m26577a);
        this.f50141k.m22338a(this.f50136f.m21834x());
        m24329l();
    }

    /* renamed from: b */
    public static boolean m24324b(f71 f71Var) {
        return !f71Var.f50138h.mo21750b();
    }
}
