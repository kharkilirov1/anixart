package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.AbstractC5368kz;
import p000a.C0000a;

@SuppressLint
/* renamed from: com.yandex.mobile.ads.impl.kd */
/* loaded from: classes3.dex */
public final class C5333kd extends AbstractC5368kz {

    /* renamed from: n */
    @NonNull
    private final SizeInfo f51949n;

    /* renamed from: o */
    @Nullable
    private SizeInfo f51950o;

    /* renamed from: p */
    private boolean f51951p;

    /* renamed from: q */
    @VisibleForTesting
    public final int f51952q;

    /* renamed from: r */
    @VisibleForTesting
    public int f51953r;

    public C5333kd(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull C5101g2 c5101g2, @NonNull SizeInfo sizeInfo) throws Throwable {
        super(context, adResponse, c5101g2);
        this.f51951p = true;
        this.f51949n = sizeInfo;
        if (m26111l()) {
            this.f51952q = sizeInfo.m21916c(context);
            this.f51953r = sizeInfo.m21913a(context);
        } else {
            this.f51952q = adResponse.m21828r() == 0 ? sizeInfo.m21916c(context) : adResponse.m21828r();
            this.f51953r = adResponse.m21814d();
        }
        m26106a(this.f51952q, this.f51953r);
    }

    /* renamed from: a */
    private void m26106a(int i2, int i3) {
        this.f51950o = new SizeInfo(i2, i3, this.f51949n.m21917d());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5368kz
    /* renamed from: b */
    public final void mo26107b(int i2, String str) {
        if (this.f52193k.m21814d() != 0) {
            i2 = this.f52193k.m21814d();
        }
        this.f51953r = i2;
        super.mo26107b(i2, str);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5368kz, com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.AbstractC5179he
    /* renamed from: c */
    public final String mo25134c() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f52193k.m21812M()) {
            int i2 = this.f51952q;
            String str3 = li1.f52422a;
            str = C0000a.m8e("<body style='width:", i2, "px;'>");
        } else {
            str = "";
        }
        sb.append(str);
        Context context = getContext();
        int m21916c = this.f51949n.m21916c(context);
        int m21913a = this.f51949n.m21913a(context);
        if (m26111l()) {
            String str4 = li1.f52422a;
            str2 = C0000a.m10g("\n<style>ytag.container { width:", m21916c, "px; height:", m21913a, "px; }</style>\n");
        }
        sb.append(str2);
        sb.append(super.mo25134c());
        return sb.toString();
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    /* renamed from: h */
    public final void mo26109h() {
        if (this.f51951p) {
            m26106a(this.f51952q, this.f51953r);
            boolean z = C5526o6.m27006a(getContext(), this.f51950o, this.f51949n) || this.f52193k.m21806G();
            InterfaceC5719rz interfaceC5719rz = this.f56895f;
            if (interfaceC5719rz != null) {
                if (z) {
                    interfaceC5719rz.mo23255a(this, m26303i());
                } else {
                    Context context = getContext();
                    int m21916c = this.f51949n.m21916c(context);
                    int m21913a = this.f51949n.m21913a(context);
                    SizeInfo sizeInfo = this.f51950o;
                    int m21919e = sizeInfo != null ? sizeInfo.m21919e() : 0;
                    SizeInfo sizeInfo2 = this.f51950o;
                    C5563p2 m26995a = AbstractC5524o4.m26995a(m21916c, m21913a, m21919e, sizeInfo2 != null ? sizeInfo2.m21915c() : 0, tg1.m28658c(context), tg1.m28656b(context));
                    e60.m24034a(m26995a.m27145b(), new Object[0]);
                    this.f56895f.mo23253a(m26995a);
                }
            }
            this.f51951p = false;
        }
    }

    @Nullable
    /* renamed from: k */
    public final SizeInfo m26110k() {
        return this.f51950o;
    }

    @VisibleForTesting
    /* renamed from: l */
    public final boolean m26111l() {
        Context context = getContext();
        return m26304j() && this.f52193k.m21828r() == 0 && this.f52193k.m21814d() == 0 && this.f51949n.m21916c(context) > 0 && this.f51949n.m21913a(context) > 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5368kz
    @SuppressLint
    /* renamed from: c */
    public final void mo26108c(@NonNull Context context) {
        addJavascriptInterface(new AbstractC5368kz.a(context), "AdPerformActionsJSI");
    }
}
