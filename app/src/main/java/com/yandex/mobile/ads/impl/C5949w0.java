package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.yandex.mobile.ads.impl.w0 */
/* loaded from: classes3.dex */
public final class C5949w0 implements InterfaceC5370l0, InterfaceC5541ok {

    /* renamed from: a */
    @NonNull
    private final Context f55972a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5896v0 f55973b;

    /* renamed from: c */
    @NonNull
    private final Window f55974c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC6256u f55975d;

    /* renamed from: e */
    @NonNull
    private final C5254ix f55976e;

    /* renamed from: f */
    @NonNull
    private final C4826aw f55977f;

    public C5949w0(@NonNull Context context, @NonNull RelativeLayout relativeLayout, @NonNull Window window, @NonNull InterfaceC6256u interfaceC6256u, @NonNull AdResponse adResponse, @NonNull C4788a1 c4788a1, @NonNull C5612q0 c5612q0, int i2) {
        this.f55972a = context;
        this.f55974c = window;
        this.f55973b = c4788a1;
        this.f55975d = interfaceC6256u;
        this.f55976e = new C5308jx(c4788a1, i2, 0).m25994a(context, adResponse, interfaceC6256u, relativeLayout, this, new oj0(c4788a1, new C4890bx(xz0.m29823b().m29824a(context))), c5612q0, new C5543om(context, ax0.m22651a(adResponse)).m27091a());
        this.f55977f = new C4826aw(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: a */
    public final void mo25415a() {
        ((C4788a1) this.f55973b).m22360a(2, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: b */
    public final void mo25416b() {
        ((C4788a1) this.f55973b).m22360a(3, null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5541ok
    /* renamed from: c */
    public final void mo27088c() {
        ((C4788a1) this.f55973b).m22358a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: d */
    public final void mo25417d() {
        this.f55976e.m25743a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: e */
    public final boolean mo25418e() {
        return this.f55977f.m22631a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: f */
    public final void mo25419f() {
        ((C4788a1) this.f55973b).m22359a(this.f55972a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f55974c.requestFeature(1);
        this.f55974c.addFlags(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        this.f55974c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (C5474n6.m26805a(28)) {
            this.f55974c.setBackgroundDrawableResource(R.color.transparent);
            this.f55974c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: g */
    public final void mo25420g() {
        this.f55976e.m25744b();
        ((C4788a1) this.f55973b).m22360a(0, null);
        ((C4788a1) this.f55973b).m22360a(5, null);
        n60.m26811d("Fullscreen Native Ad is being displayed", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    public final void onAdClosed() {
        this.f55975d.destroy();
        ((C4788a1) this.f55973b).m22360a(4, null);
    }
}
