package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h50 implements cd1<VideoAd> {

    /* renamed from: a */
    @NonNull
    private final t30 f50847a;

    /* renamed from: b */
    @NonNull
    private final VideoAd f50848b;

    /* renamed from: c */
    @Nullable
    private C5166a f50849c;

    /* renamed from: com.yandex.mobile.ads.impl.h50$a */
    public static class C5166a implements InstreamAdPlayerListener {

        /* renamed from: a */
        @NonNull
        private final g50 f50850a = new g50();

        /* renamed from: b */
        @NonNull
        private final fd1 f50851b;

        public C5166a(@NonNull rc1 rc1Var) {
            this.f50851b = rc1Var;
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdBufferingFinished(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24549a();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdBufferingStarted(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24551b();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdCompleted(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24553d();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdPaused(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24558i();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdPrepared(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24557h();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdResumed(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24555f();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdSkipped(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24556g();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdStarted(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24552c();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onAdStopped(@NonNull VideoAd videoAd) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.mo24554e();
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onError(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerError instreamAdPlayerError) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            Objects.requireNonNull(this.f50850a);
            fd1Var.mo24550a(g50.m24806a(instreamAdPlayerError));
        }

        @Override // com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayerListener
        public final void onVolumeChanged(@NonNull VideoAd videoAd, float f2) {
            fd1 fd1Var = this.f50851b;
            videoAd.getMediaFile();
            fd1Var.onVolumeChanged(f2);
        }
    }

    public h50(@NonNull VideoAd videoAd, @NonNull t30 t30Var) {
        this.f50848b = videoAd;
        this.f50847a = t30Var;
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: a */
    public final void mo23228a(@NonNull hc1<VideoAd> hc1Var) {
        this.f50847a.m28452g(hc1Var.m25118c());
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: b */
    public final void mo23230b() {
        this.f50847a.m28456k(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: c */
    public final void mo23231c() {
        this.f50847a.m28454i(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: d */
    public final long mo23232d() {
        return this.f50847a.m28441a(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: e */
    public final void mo23233e() {
        this.f50847a.m28451f(this.f50848b);
    }

    /* renamed from: f */
    public final void m25060f() {
        this.f50847a.m28453h(this.f50848b);
    }

    /* renamed from: g */
    public final void m25061g() {
        this.f50847a.m28455j(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final long getAdPosition() {
        return this.f50847a.m28445b(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final float getVolume() {
        return this.f50847a.m28448c(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final boolean isPlayingAd() {
        return this.f50847a.m28449d(this.f50848b);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: a */
    public final void mo23227a() {
        this.f50847a.m28450e(this.f50848b);
    }

    /* renamed from: a */
    public final void m25059a(float f2) {
        this.f50847a.m28443a(this.f50848b, f2);
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    /* renamed from: a */
    public final void mo23229a(@Nullable rc1 rc1Var) {
        C5166a c5166a = this.f50849c;
        if (c5166a != null) {
            this.f50847a.m28447b(this.f50848b, c5166a);
            this.f50849c = null;
        }
        if (rc1Var != null) {
            C5166a c5166a2 = new C5166a(rc1Var);
            this.f50849c = c5166a2;
            this.f50847a.m28444a(this.f50848b, c5166a2);
        }
    }
}
