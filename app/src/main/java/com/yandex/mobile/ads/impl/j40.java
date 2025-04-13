package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.p009ui.AdOverlayInfo;
import com.google.android.exoplayer2.p009ui.AdViewProvider;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.impl.n80;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j40 {

    /* renamed from: a */
    @NonNull
    private final C4794a6 f51490a;

    /* renamed from: b */
    @NonNull
    private final C6104z3 f51491b;

    /* renamed from: c */
    @NonNull
    private final C4791a4 f51492c;

    /* renamed from: d */
    @NonNull
    private final C5857ue f51493d;

    /* renamed from: e */
    @NonNull
    private final C5914ve f51494e;

    /* renamed from: f */
    @NonNull
    private final n80 f51495f;

    /* renamed from: g */
    @NonNull
    private final C5603ps f51496g;

    /* renamed from: h */
    @NonNull
    private final C5144gs f51497h;

    /* renamed from: i */
    @NonNull
    private final sr0 f51498i;

    /* renamed from: j */
    @NonNull
    private final zq0 f51499j;

    /* renamed from: k */
    @NonNull
    private final Player.Listener f51500k;

    /* renamed from: l */
    @NonNull
    private final xc1 f51501l = new xc1();

    /* renamed from: m */
    @Nullable
    private InstreamAd f51502m;

    /* renamed from: n */
    @Nullable
    private Player f51503n;

    /* renamed from: o */
    @Nullable
    private Object f51504o;

    /* renamed from: p */
    private boolean f51505p;

    /* renamed from: q */
    private boolean f51506q;

    /* renamed from: com.yandex.mobile.ads.impl.j40$a */
    public class C5268a implements n80.InterfaceC5478b {
        private C5268a() {
        }

        @Override // com.yandex.mobile.ads.impl.n80.InterfaceC5478b
        /* renamed from: a */
        public final void mo25790a(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InstreamAd instreamAd) {
            j40.this.f51506q = false;
            j40.this.f51502m = instreamAd;
            if (instreamAd instanceof l50) {
                l50 l50Var = (l50) j40.this.f51502m;
                Objects.requireNonNull(j40.this);
                l50Var.m26355a();
            }
            C5797te m28985a = j40.this.f51493d.m28985a(viewGroup, list, instreamAd);
            j40.this.f51494e.m29219a(m28985a);
            m28985a.m28638a(j40.this.f51501l);
            m28985a.m28636a(j40.m25778h(j40.this));
            m28985a.m28637a(j40.m25779i(j40.this));
            if (j40.this.f51496g.m27372b()) {
                j40.this.f51505p = true;
                j40.m25770a(j40.this, instreamAd);
            }
        }

        public /* synthetic */ C5268a(j40 j40Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.n80.InterfaceC5478b
        /* renamed from: a */
        public final void mo25789a() {
            j40.this.f51506q = false;
            j40.this.f51491b.m30046a(AdPlaybackState.f12599h);
        }
    }

    public j40(@NonNull C6107z5 c6107z5, @NonNull C4791a4 c4791a4, @NonNull C5857ue c5857ue, @NonNull C5914ve c5914ve, @NonNull n80 n80Var, @NonNull yq0 yq0Var, @NonNull C5144gs c5144gs, @NonNull sr0 sr0Var, @NonNull C5457ms c5457ms) {
        this.f51490a = c6107z5.m30057b();
        this.f51491b = c6107z5.m30058c();
        this.f51492c = c4791a4;
        this.f51493d = c5857ue;
        this.f51494e = c5914ve;
        this.f51495f = n80Var;
        this.f51497h = c5144gs;
        this.f51498i = sr0Var;
        this.f51496g = yq0Var.m29964c();
        this.f51499j = yq0Var.m29965d();
        this.f51500k = c5457ms;
    }

    /* renamed from: h */
    public static /* synthetic */ qb1 m25778h(j40 j40Var) {
        Objects.requireNonNull(j40Var);
        return null;
    }

    /* renamed from: i */
    public static /* synthetic */ rb1 m25779i(j40 j40Var) {
        Objects.requireNonNull(j40Var);
        return null;
    }

    /* renamed from: a */
    public final void m25785a(@Nullable Player player) {
        this.f51503n = player;
    }

    /* renamed from: a */
    public final void m25786a(@NonNull AdsLoader.EventListener eventListener, @Nullable AdViewProvider adViewProvider, @Nullable Object obj) {
        Player player = this.f51503n;
        this.f51496g.m27370a(player);
        this.f51504o = obj;
        if (player != null) {
            player.mo5745w(this.f51500k);
            this.f51491b.m30047a(eventListener);
            this.f51498i.m28355a(new wq0(player, this.f51499j));
            if (this.f51505p) {
                this.f51491b.m30046a(this.f51491b.m30045a());
                C5797te m29218a = this.f51494e.m29218a();
                if (m29218a != null) {
                    m29218a.m28635a();
                    return;
                }
                return;
            }
            InstreamAd instreamAd = this.f51502m;
            if (instreamAd != null) {
                this.f51491b.m30046a(this.f51492c.m22372a(instreamAd, this.f51504o));
            } else if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                Iterator<AdOverlayInfo> it = adViewProvider.getAdOverlayInfos().iterator();
                while (it.hasNext()) {
                    arrayList.add(C4883bs.m22928a(it.next()));
                }
                m25784a(adViewGroup, arrayList);
            }
        }
    }

    /* renamed from: b */
    public final void m25788b() {
        Player m27369a = this.f51496g.m27369a();
        if (m27369a != null) {
            if (this.f51502m != null) {
                long m7717P = Util.m7717P(m27369a.getCurrentPosition());
                if (!this.f51499j.m30284c()) {
                    m7717P = 0;
                }
                this.f51491b.m30046a(this.f51491b.m30045a().m6930h(m7717P));
            }
            m27369a.mo5740p(this.f51500k);
            this.f51491b.m30047a((AdsLoader.EventListener) null);
            this.f51496g.m27370a((Player) null);
            this.f51505p = true;
        }
    }

    /* renamed from: a */
    public final void m25787a(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f51501l.m29737a(videoAdPlaybackListener);
    }

    /* renamed from: a */
    public final void m25784a(@Nullable ViewGroup viewGroup, @Nullable List<fc1> list) {
        if (this.f51506q || this.f51502m != null || viewGroup == null) {
            return;
        }
        this.f51506q = true;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f51495f.m26817a(viewGroup, list, new C5268a(this, 0));
    }

    /* renamed from: a */
    public final void m25781a() {
        this.f51506q = false;
        this.f51505p = false;
        this.f51502m = null;
        this.f51498i.m28355a((wq0) null);
        this.f51490a.m22381a();
        this.f51490a.m22382a((dr0) null);
        this.f51494e.m29221c();
        this.f51491b.m30048b();
        this.f51495f.m26816a();
        this.f51501l.m29737a(null);
        C5797te m29218a = this.f51494e.m29218a();
        if (m29218a != null) {
            m29218a.m28636a((qb1) null);
        }
        C5797te m29218a2 = this.f51494e.m29218a();
        if (m29218a2 != null) {
            m29218a2.m28637a((rb1) null);
        }
    }

    /* renamed from: a */
    public final void m25782a(int i2, int i3) {
        this.f51497h.m24967a(i2, i3);
    }

    /* renamed from: a */
    public final void m25783a(int i2, int i3, @NonNull IOException iOException) {
        this.f51497h.m24968b(i2, i3, iOException);
    }

    /* renamed from: a */
    public static void m25770a(j40 j40Var, InstreamAd instreamAd) {
        j40Var.f51491b.m30046a(j40Var.f51492c.m22372a(instreamAd, j40Var.f51504o));
    }
}
