package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.C5280jd;
import com.yandex.mobile.ads.impl.C5427m6;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.InterfaceC5538oh;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.f90;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.k60;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ug1;
import com.yandex.mobile.ads.impl.xz0;
import java.util.ArrayList;
import java.util.Iterator;

@MainThread
/* renamed from: com.yandex.mobile.ads.banner.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4639g extends RelativeLayout {

    /* renamed from: a */
    @NonNull
    private final f90 f47643a;

    /* renamed from: b */
    @NonNull
    private final h90 f47644b;

    /* renamed from: c */
    @NonNull
    private final C4637e f47645c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4640h f47646d;

    /* renamed from: e */
    @NonNull
    private final ArrayList f47647e;

    /* renamed from: f */
    private int f47648f;

    /* renamed from: g */
    private int f47649g;

    public AbstractC4639g(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m21787a(int i2) {
        n60.m26811d(k60.m26036a("onVisibilityChanged(), visibility = ", i2), new Object[0]);
        if (C5427m6.m26579a((InterfaceC5538oh) this.f47645c)) {
            return;
        }
        Iterator it = this.f47647e.iterator();
        while (it.hasNext()) {
            ((ug1) it.next()).mo21795a(i2);
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract C4637e mo21747a(@NonNull Context context, @NonNull C4636d c4636d, @NonNull C5724s3 c5724s3);

    public void addVisibilityChangeListener(@NonNull ug1 ug1Var) {
        this.f47647e.add(ug1Var);
    }

    public void destroy() {
        this.f47644b.m25094a();
        this.f47643a.m24372a();
        this.f47647e.clear();
        if (C5427m6.m26579a((InterfaceC5538oh) this.f47645c)) {
            return;
        }
        this.f47645c.m21782x();
    }

    public AdSize getAdSize() {
        this.f47644b.m25094a();
        SizeInfo m25867a = C5280jd.m25867a(this.f47645c);
        if (m25867a != null) {
            return new AdSize(m25867a.m21919e(), m25867a.m21915c(), m25867a.m21917d());
        }
        return null;
    }

    public int getHeightMeasureSpec() {
        return this.f47649g;
    }

    @NonNull
    public VideoController getVideoController() {
        this.f47644b.m25094a();
        return this.f47645c.m21784z();
    }

    public int getWidthMeasureSpec() {
        return this.f47648f;
    }

    public void loadAd(@NonNull AdRequest adRequest) {
        this.f47644b.m25094a();
        this.f47643a.m24373a(new RunnableC0207a(this, adRequest, 15));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder m26356a = l60.m26356a("onAttachedToWindow(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        InterfaceC4640h interfaceC4640h = this.f47646d;
        getContext();
        interfaceC4640h.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!C5427m6.m26579a((InterfaceC5538oh) this.f47645c)) {
            setVisibility(this.f47645c.m21781w() ? 0 : 8);
        }
        n60.m26811d("Ad view configuration is changed: %s", configuration.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder m26356a = l60.m26356a("onDetachedFromWindow(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        InterfaceC4640h interfaceC4640h = this.f47646d;
        getContext();
        interfaceC4640h.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f47648f = i2;
        this.f47649g = i3;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        boolean z = false;
        n60.m26811d("onVisibilityChanged(), changedView = %s,viewVisibility = %s", view, Integer.valueOf(i2));
        cz0 m29824a = xz0.m29823b().m29824a(getContext());
        if (m29824a != null && m29824a.m23573L()) {
            z = true;
        }
        if (!z) {
            m21787a(i2);
        } else if (this == view) {
            m21787a(i2);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        n60.m26811d("onWindowVisibilityChanged(), windowVisibility = %s, this.getVisibility = %s", Integer.valueOf(i2), Integer.valueOf(getVisibility()));
        m21787a((i2 == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public void removeVisibilityChangeListener(@NonNull ug1 ug1Var) {
        this.f47647e.remove(ug1Var);
    }

    public void setAdSize(@NonNull AdSize adSize) {
        this.f47644b.m25094a();
        SizeInfo m21785a = adSize.m21785a();
        if (C5280jd.m25869b(m21785a)) {
            m21785a = C5280jd.m25868a(m21785a);
        }
        this.f47645c.m28605a(m21785a);
    }

    public void setAdUnitId(@Nullable String str) {
        this.f47644b.m25094a();
        this.f47645c.m28609a(str);
    }

    public void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        this.f47644b.m25094a();
        this.f47645c.m21776a(bannerAdEventListener);
    }

    public void setShouldOpenLinksInApp(boolean z) {
        this.f47644b.m25094a();
        this.f47645c.m28610a(z);
    }

    public AbstractC4639g(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC4639g(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f47643a = new f90();
        h90 h90Var = new h90(context);
        this.f47644b = h90Var;
        h90Var.m25094a();
        this.f47647e = new ArrayList();
        C5724s3 c5724s3 = new C5724s3();
        C4636d c4636d = new C4636d(context, c5724s3);
        C4637e mo21747a = mo21747a(context, c4636d, c5724s3);
        this.f47645c = mo21747a;
        c4636d.m21768a(mo21747a.m28616d());
        InterfaceC4640h m21786a = m21786a();
        this.f47646d = m21786a;
        m21786a.mo21790a(context, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21789a(AdRequest adRequest) {
        this.f47645c.mo26773b(adRequest);
    }

    @NonNull
    /* renamed from: a */
    private InterfaceC4640h m21786a() {
        return C4641i.m21791a(this, this.f47645c);
    }
}
