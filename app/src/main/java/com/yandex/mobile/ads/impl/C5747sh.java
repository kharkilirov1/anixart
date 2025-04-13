package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.sh */
/* loaded from: classes3.dex */
public final class C5747sh {

    /* renamed from: a */
    @NonNull
    private final hc1<VideoAd> f54669a;

    /* renamed from: b */
    @NonNull
    private final g40 f54670b;

    /* renamed from: c */
    @NonNull
    private final C6034xo f54671c = new C6034xo();

    public C5747sh(@NonNull Context context, @NonNull m50 m50Var, @NonNull hc1<VideoAd> hc1Var, @NonNull tf1 tf1Var, @NonNull sb1 sb1Var, @NonNull ee1 ee1Var) {
        this.f54669a = hc1Var;
        this.f54670b = new g40(context, m50Var, hc1Var, tf1Var, sb1Var, ee1Var);
    }

    /* renamed from: a */
    public final void m28249a(@NonNull View view) {
        int m29779a = this.f54671c.m29779a(view.getContext());
        if (!(!TextUtils.isEmpty(this.f54669a.m25116a().m24612b())) || C5782t5.m28464a(3, m29779a)) {
            view.setVisibility(8);
        } else {
            view.setOnClickListener(this.f54670b);
        }
    }
}
