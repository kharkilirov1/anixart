package com.yandex.mobile.ads.instream;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C6029xj;
import com.yandex.mobile.ads.impl.ad1;
import com.yandex.mobile.ads.impl.d50;
import com.yandex.mobile.ads.impl.e30;
import com.yandex.mobile.ads.impl.f30;
import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.l50;
import com.yandex.mobile.ads.impl.qb1;
import com.yandex.mobile.ads.impl.rb1;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.tb1;
import com.yandex.mobile.ads.impl.v30;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.impl.y81;
import com.yandex.mobile.ads.impl.zc1;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@MainThread
/* loaded from: classes3.dex */
public class InstreamAdBinder implements y81 {

    /* renamed from: a */
    @NonNull
    private final InstreamAdPlayer f57406a;

    /* renamed from: b */
    @NonNull
    private final VideoPlayer f57407b;

    /* renamed from: c */
    @NonNull
    private final d50 f57408c;

    /* renamed from: d */
    @NonNull
    private final C6151c f57409d;

    /* renamed from: e */
    @NonNull
    private final f30 f57410e;

    /* renamed from: f */
    @NonNull
    private final v30 f57411f;

    /* renamed from: g */
    @NonNull
    private final v50 f57412g;

    /* renamed from: h */
    @NonNull
    private final e30 f57413h;

    /* renamed from: i */
    @NonNull
    private final tb1 f57414i;

    /* renamed from: j */
    @NonNull
    private final ad1 f57415j;

    public InstreamAdBinder(@NonNull Context context, @NonNull InstreamAd instreamAd, @NonNull InstreamAdPlayer instreamAdPlayer, @NonNull VideoPlayer videoPlayer) {
        this.f57406a = instreamAdPlayer;
        this.f57407b = videoPlayer;
        C6151c c6151c = new C6151c(context, m30349a(instreamAd), new t30(instreamAdPlayer), new C6153e(videoPlayer));
        this.f57409d = c6151c;
        d50 d50Var = new d50();
        this.f57408c = d50Var;
        c6151c.m30379a(d50Var);
        e30 e30Var = new e30();
        this.f57413h = e30Var;
        tb1 tb1Var = new tb1();
        this.f57414i = tb1Var;
        c6151c.m30380a(new C6029xj(tb1Var, e30Var));
        this.f57410e = f30.m24299a();
        this.f57411f = new v30(this);
        this.f57412g = new v50(this);
        this.f57415j = new ad1();
    }

    /* renamed from: a */
    public final void m30350a(@Nullable qb1 qb1Var) {
        this.f57413h.m24001a(qb1Var);
    }

    public void bind(@NonNull InstreamAdView instreamAdView) {
        m30352a(instreamAdView, Collections.emptyList());
    }

    @Override // com.yandex.mobile.ads.impl.y81
    public void invalidateAdPlayer() {
        this.f57411f.m29180b(this.f57406a);
        this.f57409d.m30378a();
    }

    public void invalidateVideoPlayer() {
        this.f57412g.m29183b(this.f57407b);
        this.f57409d.m30382b();
    }

    public void prepareAd() {
        this.f57409d.m30383c();
    }

    public void setInstreamAdListener(@Nullable InstreamAdListener instreamAdListener) {
        this.f57408c.m23809a(instreamAdListener);
    }

    public void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        zc1 zc1Var;
        if (videoAdPlaybackListener != null) {
            Objects.requireNonNull(this.f57415j);
            zc1Var = ad1.m22466a(videoAdPlaybackListener);
        } else {
            zc1Var = null;
        }
        this.f57414i.m28583a(zc1Var);
    }

    public void unbind() {
        if (this.f57410e.m24302a(this)) {
            this.f57409d.m30384d();
        }
    }

    /* renamed from: a */
    public final void m30351a(@Nullable rb1 rb1Var) {
        this.f57413h.m24002a(rb1Var);
    }

    @NonNull
    /* renamed from: a */
    private static l50 m30349a(@NonNull InstreamAd instreamAd) {
        if (instreamAd instanceof l50) {
            return (l50) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }

    /* renamed from: a */
    public final void m30352a(@NonNull InstreamAdView instreamAdView, @NonNull List<fc1> list) {
        InstreamAdBinder m24300a = this.f57410e.m24300a(instreamAdView);
        if (!equals(m24300a)) {
            if (m24300a != null) {
                m24300a.unbind();
            }
            if (this.f57410e.m24302a(this)) {
                this.f57409d.m30384d();
            }
            this.f57410e.m24301a(instreamAdView, this);
        }
        this.f57411f.m29179a(this.f57406a);
        this.f57412g.m29182a(this.f57407b);
        this.f57409d.m30381a(instreamAdView, list);
    }
}
