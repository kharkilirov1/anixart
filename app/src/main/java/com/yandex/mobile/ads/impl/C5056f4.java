package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.util.Assertions;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.f4 */
/* loaded from: classes3.dex */
public final class C5056f4 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f50112a;

    /* renamed from: b */
    @NonNull
    private final C5424m3 f50113b;

    /* renamed from: c */
    @NonNull
    private final C5003e4 f50114c;

    /* renamed from: d */
    @NonNull
    private final zq0 f50115d;

    /* renamed from: e */
    @NonNull
    private final sq0 f50116e;

    /* renamed from: f */
    @NonNull
    private final C4955d4 f50117f;

    /* renamed from: g */
    @NonNull
    private final e50 f50118g = e50.m24007a();

    public C5056f4(@NonNull C6107z5 c6107z5, @NonNull yq0 yq0Var, @NonNull C5003e4 c5003e4) {
        this.f50112a = c6107z5.m30057b();
        this.f50113b = c6107z5.m30056a();
        this.f50115d = yq0Var.m29965d();
        this.f50116e = yq0Var.m29963b();
        this.f50114c = c5003e4;
        this.f50117f = new C4955d4(c6107z5, yq0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m24305a(VideoAd videoAd) {
        this.f50114c.onAdSkipped(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m24307b(VideoAd videoAd) {
        this.f50114c.onAdStopped(videoAd);
    }

    /* renamed from: c */
    public final void m24308c(@NonNull VideoAd videoAd) {
        if (d40.f49561c.equals(this.f50112a.m22380a(videoAd))) {
            this.f50112a.m22383a(videoAd, d40.f49562d);
            dr0 m22384b = this.f50112a.m22384b();
            Assertions.m7516d(videoAd.equals(m22384b != null ? m22384b.m23928b() : null));
            this.f50115d.m30282a(false);
            this.f50116e.m28350a();
            this.f50114c.onAdPaused(videoAd);
        }
    }

    /* renamed from: d */
    public final void m24309d(@NonNull VideoAd videoAd) {
        d40 m22380a = this.f50112a.m22380a(videoAd);
        if (d40.f49559a.equals(m22380a) || d40.f49560b.equals(m22380a)) {
            this.f50112a.m22383a(videoAd, d40.f49561c);
            C5264j3 m26561a = this.f50113b.m26561a(videoAd);
            Objects.requireNonNull(m26561a);
            this.f50112a.m22382a(new dr0(m26561a, videoAd));
            this.f50114c.onAdStarted(videoAd);
            return;
        }
        if (d40.f49562d.equals(m22380a)) {
            dr0 m22384b = this.f50112a.m22384b();
            Assertions.m7516d(videoAd.equals(m22384b != null ? m22384b.m23928b() : null));
            this.f50112a.m22383a(videoAd, d40.f49561c);
            this.f50114c.onAdResumed(videoAd);
        }
    }

    /* renamed from: e */
    public final void m24310e(@NonNull VideoAd videoAd) {
        if (d40.f49562d.equals(this.f50112a.m22380a(videoAd))) {
            this.f50112a.m22383a(videoAd, d40.f49561c);
            dr0 m22384b = this.f50112a.m22384b();
            Assertions.m7516d(videoAd.equals(m22384b != null ? m22384b.m23928b() : null));
            this.f50115d.m30282a(true);
            this.f50116e.m28351b();
            this.f50114c.onAdResumed(videoAd);
        }
    }

    /* renamed from: f */
    public final void m24311f(@NonNull VideoAd videoAd) {
        int i2 = 1;
        int i3 = this.f50118g.m24013d() ? 2 : 1;
        ho1 ho1Var = new ho1(this, videoAd, i2);
        d40 m22380a = this.f50112a.m22380a(videoAd);
        d40 d40Var = d40.f49559a;
        if (d40Var.equals(m22380a)) {
            C5264j3 m26561a = this.f50113b.m26561a(videoAd);
            if (m26561a != null) {
                this.f50117f.m23799a(m26561a, i3, ho1Var);
                return;
            }
            return;
        }
        this.f50112a.m22383a(videoAd, d40Var);
        dr0 m22384b = this.f50112a.m22384b();
        if (m22384b != null) {
            this.f50117f.m23799a(m22384b.m23927a(), i3, ho1Var);
        } else {
            n60.m26810c("StopAd without playing data", new Object[0]);
        }
    }

    /* renamed from: g */
    public final void m24312g(@NonNull VideoAd videoAd) {
        ho1 ho1Var = new ho1(this, videoAd, 0);
        d40 m22380a = this.f50112a.m22380a(videoAd);
        d40 d40Var = d40.f49559a;
        if (d40Var.equals(m22380a)) {
            C5264j3 m26561a = this.f50113b.m26561a(videoAd);
            if (m26561a != null) {
                this.f50117f.m23799a(m26561a, 1, ho1Var);
                return;
            }
            return;
        }
        this.f50112a.m22383a(videoAd, d40Var);
        dr0 m22384b = this.f50112a.m22384b();
        if (m22384b == null) {
            n60.m26810c("StopAd without playing data", new Object[0]);
        } else {
            this.f50117f.m23799a(m22384b.m23927a(), 1, ho1Var);
        }
    }
}
