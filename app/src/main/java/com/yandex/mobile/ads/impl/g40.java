package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class g40 implements View.OnClickListener {

    /* renamed from: a */
    @NonNull
    private final tf1 f50495a;

    /* renamed from: b */
    @NonNull
    private final hc1<VideoAd> f50496b;

    /* renamed from: c */
    @NonNull
    private final sb1 f50497c;

    /* renamed from: d */
    @NonNull
    private final mo0 f50498d;

    /* renamed from: e */
    @NonNull
    private final ee1 f50499e;

    public g40(@NonNull Context context, @NonNull m50 m50Var, @NonNull hc1<VideoAd> hc1Var, @NonNull tf1 tf1Var, @NonNull sb1 sb1Var, @NonNull ee1 ee1Var) {
        this.f50496b = hc1Var;
        this.f50495a = tf1Var;
        this.f50497c = sb1Var;
        this.f50498d = new c50(context, m50Var, hc1Var).m23025a();
        this.f50499e = ee1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        this.f50495a.mo25520m();
        this.f50497c.onAdClicked(this.f50496b.m25118c());
        String m24133a = this.f50499e.m24133a();
        if (TextUtils.isEmpty(m24133a)) {
            return;
        }
        this.f50498d.mo23301a(m24133a);
    }
}
