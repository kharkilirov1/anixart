package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.rq0;
import java.util.List;

/* loaded from: classes3.dex */
public final class if1 implements rq0.InterfaceC5706b {

    /* renamed from: a */
    @Nullable
    private m11 f51288a;

    /* renamed from: b */
    @Nullable
    private m11 f51289b;

    /* renamed from: c */
    @Nullable
    private TextureView f51290c;

    /* renamed from: d */
    @Nullable
    private int f51291d;

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23438a() {
        up1.m29069a(this);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23439a(int i2) {
        up1.m29070b(this, i2);
    }

    /* renamed from: a */
    public final void m25531a(@Nullable TextureView textureView) {
        this.f51290c = textureView;
        if (this.f51291d == 0 || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        this.f51290c.setTransform(matrix);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23443a(Metadata metadata) {
        up1.m29071c(this, metadata);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23444a(C5043es c5043es) {
        up1.m29072d(this, c5043es);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23446a(nq0 nq0Var) {
        up1.m29074f(this, nq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23447a(pb0 pb0Var, int i2) {
        up1.m29075g(this, pb0Var, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23451a(rq0.C5705a c5705a) {
        up1.m29076h(this, c5705a);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23452a(rq0.C5707c c5707c, rq0.C5707c c5707c2, int i2) {
        up1.m29077i(this, c5707c, c5707c2, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23454a(sb0 sb0Var) {
        up1.m29078j(this, sb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23455a(t71 t71Var) {
        up1.m29079k(this, t71Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23457a(C5871ul c5871ul) {
        up1.m29080l(this, c5871ul);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23458a(C5875uo c5875uo) {
        up1.m29081m(this, c5875uo);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public /* synthetic */ void mo23464a(boolean z, int i2) {
        up1.m29082n(this, z, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: b */
    public /* synthetic */ void mo23465b() {
        up1.m29083o(this);
    }

    /* renamed from: b */
    public final void m25532b(@Nullable int i2) {
        this.f51291d = i2;
        if (i2 == 0 || this.f51290c == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        this.f51290c.setTransform(matrix);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: b */
    public /* synthetic */ void mo23468b(C5043es c5043es) {
        up1.m29084p(this, c5043es);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: c */
    public /* synthetic */ void mo23474c() {
        up1.m29085q(this);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onCues(List list) {
        up1.m29086r(this, list);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        up1.m29087s(this, z);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        up1.m29088t(this, z);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i2) {
        up1.m29089u(this, z, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onPlaybackStateChanged(int i2) {
        up1.m29090v(this, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        up1.m29091w(this, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        up1.m29092x(this, z, i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onRenderedFirstFrame() {
        up1.m29093y(this);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        up1.m29094z(this, z);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onSurfaceSizeChanged(int i2, int i3) {
        int i4;
        Matrix m25886a;
        m11 m11Var = new m11(i2, i3);
        this.f51289b = m11Var;
        m11 m11Var2 = this.f51288a;
        if (m11Var2 == null || (i4 = this.f51291d) == 0 || this.f51290c == null || (m25886a = new jf1(m11Var, m11Var2).m25886a(i4)) == null) {
            return;
        }
        this.f51290c.setTransform(m25886a);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public /* synthetic */ void onVolumeChanged(float f2) {
        up1.m29068B(this, f2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23445a(@NonNull lf1 lf1Var) {
        int i2;
        Matrix m25886a;
        int i3 = lf1Var.f52381a;
        float f2 = lf1Var.f52384d;
        if (f2 > 0.0f) {
            i3 = Math.round(i3 * f2);
        }
        m11 m11Var = new m11(i3, lf1Var.f52382b);
        this.f51288a = m11Var;
        m11 m11Var2 = this.f51289b;
        if (m11Var2 == null || (i2 = this.f51291d) == 0 || this.f51290c == null || (m25886a = new jf1(m11Var2, m11Var).m25886a(i2)) == null) {
            return;
        }
        this.f51290c.setTransform(m25886a);
    }
}
