package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.base.AdResponse;
import java.io.Serializable;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.yandex.mobile.ads.impl.s0 */
/* loaded from: classes3.dex */
public final class C5721s0 implements InterfaceC5370l0, InterfaceC5541ok {

    /* renamed from: a */
    @NonNull
    private final RelativeLayout f54465a;

    /* renamed from: b */
    @NonNull
    private final AdResponse<String> f54466b;

    /* renamed from: c */
    @NonNull
    private final Window f54467c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5896v0 f54468d;

    /* renamed from: e */
    @NonNull
    private final sk1 f54469e;

    /* renamed from: f */
    @NonNull
    private final po0 f54470f;

    /* renamed from: g */
    @NonNull
    private final C4826aw f54471g;

    public C5721s0(@NonNull Context context, @NonNull RelativeLayout relativeLayout, @NonNull C4788a1 c4788a1, @NonNull Window window, @NonNull C5307jw c5307jw) {
        this.f54465a = relativeLayout;
        this.f54467c = window;
        this.f54468d = c4788a1;
        AdResponse<String> m25990a = c5307jw.m25990a();
        this.f54466b = m25990a;
        sk1 m25991b = c5307jw.m25991b();
        this.f54469e = m25991b;
        m25991b.m28290a(this);
        this.f54470f = new po0(context, m25990a, c4788a1);
        this.f54471g = new C4826aw(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: a */
    public final void mo25415a() {
        ((C4788a1) this.f54468d).m22360a(2, null);
        this.f54469e.m28296h();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: b */
    public final void mo25416b() {
        ((C4788a1) this.f54468d).m22360a(3, null);
        this.f54469e.m28294f();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5541ok
    /* renamed from: c */
    public final void mo27088c() {
        ((C4788a1) this.f54468d).m22358a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: d */
    public final void mo25417d() {
        this.f54469e.m28292d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: e */
    public final boolean mo25418e() {
        if (this.f54471g.m22631a()) {
            if (!(this.f54469e.m28293e().m23946b() && this.f54466b.m21808I())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: f */
    public final void mo25419f() {
        this.f54467c.requestFeature(1);
        this.f54467c.addFlags(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
        this.f54467c.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        if (C5474n6.m26805a(28)) {
            this.f54467c.setBackgroundDrawableResource(R.color.black);
            this.f54467c.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.f54470f.m27358a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    /* renamed from: g */
    public final void mo25420g() {
        this.f54469e.m28289a(this.f54465a);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_tracking_parameters", (Serializable) this.f54469e.m28293e().m23945a());
        ((C4788a1) this.f54468d).m22360a(0, bundle);
        ((C4788a1) this.f54468d).m22360a(5, null);
        n60.m26811d("Fullscreen Ad is being displayed", new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5370l0
    public final void onAdClosed() {
        ((C4788a1) this.f54468d).m22360a(4, null);
    }
}
