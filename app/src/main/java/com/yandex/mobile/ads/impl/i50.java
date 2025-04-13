package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i50 {

    /* renamed from: a */
    @NonNull
    private final da1<VideoAd> f51215a;

    /* renamed from: b */
    @NonNull
    private final h50 f51216b;

    /* renamed from: c */
    @NonNull
    private final hc1<VideoAd> f51217c;

    /* renamed from: d */
    @NonNull
    private final w10 f51218d;

    /* renamed from: e */
    @NonNull
    private final w40 f51219e;

    /* renamed from: f */
    @NonNull
    private final j50 f51220f;

    public i50(@NonNull Context context, @NonNull t30 t30Var, @NonNull i40 i40Var, @NonNull m50 m50Var, @NonNull hc1 hc1Var, @NonNull sd1 sd1Var, @NonNull vf1 vf1Var, @NonNull w10 w10Var, @NonNull sc1 sc1Var) {
        this.f51218d = w10Var;
        this.f51217c = hc1Var;
        this.f51219e = new w40(new q10(context), new C5724s3());
        j50 j50Var = new j50(sc1Var);
        this.f51220f = j50Var;
        VideoAd videoAd = (VideoAd) hc1Var.m25118c();
        y50 y50Var = new y50(i40Var);
        h50 h50Var = new h50(videoAd, t30Var);
        this.f51216b = h50Var;
        jd1 jd1Var = new jd1();
        new z30(videoAd, y50Var, h50Var, i40Var, sd1Var).m30049a(jd1Var);
        da1<VideoAd> da1Var = new da1<>(context, h50Var, y50Var, hc1Var, new x50(m50Var, hc1Var, sd1Var, y50Var), sd1Var, vf1Var, jd1Var, j50Var);
        this.f51215a = da1Var;
        o30 o30Var = new o30(videoAd);
        i30 i30Var = new i30(m50Var);
        da1Var.m23856a(o30Var);
        da1Var.m23855a(i30Var);
    }

    /* renamed from: a */
    public final void m25443a() {
        this.f51215a.m23854a();
        Objects.requireNonNull(this.f51219e);
    }

    /* renamed from: b */
    public final void m25444b() {
        this.f51215a.m23857b();
    }

    /* renamed from: c */
    public final void m25445c() {
        this.f51215a.m23858c();
    }

    /* renamed from: d */
    public final void m25446d() {
        this.f51215a.m23859d();
        this.f51219e.m29378a(this.f51217c, this.f51218d, this.f51220f);
    }

    /* renamed from: e */
    public final void m25447e() {
        this.f51216b.m25060f();
        this.f51220f.m25802a();
    }

    /* renamed from: f */
    public final void m25448f() {
        this.f51215a.m23860e();
    }

    /* renamed from: g */
    public final void m25449g() {
        this.f51215a.m23861f();
        this.f51220f.m25802a();
    }
}
