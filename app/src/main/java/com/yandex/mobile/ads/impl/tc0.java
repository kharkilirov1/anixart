package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.C6206e;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tc0 {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f55044a;

    /* renamed from: b */
    @NonNull
    private final fl0 f55045b = new fl0();

    /* renamed from: c */
    @NonNull
    private final vl0 f55046c = new vl0();

    /* renamed from: d */
    @NonNull
    private final of1 f55047d = new of1();

    /* renamed from: e */
    @NonNull
    private final C6206e f55048e = new C6206e();

    /* renamed from: f */
    @NonNull
    private final ql0 f55049f = new ql0();

    public tc0(@NonNull AdResponse<?> adResponse) {
        this.f55044a = adResponse;
    }

    @NonNull
    /* renamed from: a */
    public final cl1 m28593a(@NonNull MediaView mediaView, @NonNull C5101g2 c5101g2, @NonNull l20 l20Var, @NonNull cl0 cl0Var, @NonNull nj0 nj0Var) {
        Context context = mediaView.getContext();
        int m27749a = this.f55049f.m27749a(mediaView);
        Objects.requireNonNull(this.f55045b);
        qe1 m24637a = fl0.m24637a(m27749a);
        Objects.requireNonNull(this.f55048e);
        sl0 m29234a = this.f55046c.m29234a(context, m24637a, C6206e.m30540a(mediaView));
        Objects.requireNonNull(this.f55047d);
        mediaView.removeAllViews();
        mediaView.addView(m29234a, new FrameLayout.LayoutParams(-1, -1));
        return new cl1(mediaView, new zf1(m29234a, m24637a, c5101g2, this.f55044a, l20Var, cl0Var, nj0Var), c5101g2);
    }
}
