package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ga0;

@SuppressLint
/* loaded from: classes3.dex */
public final class yf0 extends yo0 {

    /* renamed from: k */
    @NonNull
    private final nf0 f56829k;

    /* renamed from: l */
    @NonNull
    private final cg0 f56830l;

    /* renamed from: m */
    @NonNull
    private ga0 f56831m;

    /* renamed from: n */
    @Nullable
    private InterfaceC6075a f56832n;

    /* renamed from: o */
    private boolean f56833o;

    /* renamed from: com.yandex.mobile.ads.impl.yf0$a */
    public interface InterfaceC6075a {
        /* renamed from: a */
        void mo24147a();

        /* renamed from: b */
        void mo24148b();
    }

    public yf0(@NonNull Context context) throws Throwable {
        super(context);
        this.f56833o = false;
        this.f56831m = new f11();
        nf0 nf0Var = new nf0();
        this.f56829k = nf0Var;
        this.f56830l = new cg0(this, nf0Var);
    }

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.InterfaceC5610pz
    /* renamed from: a */
    public final void mo26301a() {
        super.mo26301a();
        InterfaceC6075a interfaceC6075a = this.f56832n;
        if (interfaceC6075a != null) {
            this.f56833o = true;
            interfaceC6075a.mo24148b();
            this.f56832n = null;
        }
    }

    /* renamed from: b */
    public final void m29936b(@NonNull String str) {
        if (this.f56833o) {
            return;
        }
        this.f56830l.m23258b(str);
    }

    @Override // com.yandex.mobile.ads.impl.yo0
    /* renamed from: h */
    public final void mo26109h() {
        this.f56830l.m23252a();
    }

    @NonNull
    /* renamed from: i */
    public final nf0 m29937i() {
        return this.f56829k;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        ga0.C5115a mo22622a = this.f56831m.mo22622a(i2, i3);
        super.onMeasure(mo22622a.f50538a, mo22622a.f50539b);
    }

    public void setAspectRatio(float f2) {
        this.f56831m = new at0(f2);
    }

    public void setClickListener(@NonNull InterfaceC5972wh interfaceC5972wh) {
        this.f56830l.m23254a(interfaceC5972wh);
    }

    public void setPreloadListener(@NonNull InterfaceC6075a interfaceC6075a) {
        this.f56832n = interfaceC6075a;
    }

    @Override // com.yandex.mobile.ads.impl.yo0, com.yandex.mobile.ads.impl.InterfaceC5610pz
    /* renamed from: a */
    public final void mo26655a(int i2) {
        super.mo26655a(i2);
        if (this.f56832n != null) {
            stopLoading();
            this.f56832n.mo24147a();
            this.f56832n = null;
        }
    }
}
