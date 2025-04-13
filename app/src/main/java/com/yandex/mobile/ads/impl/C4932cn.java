package com.yandex.mobile.ads.impl;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0920f;
import com.google.android.exoplayer2.analytics.C0949e;
import com.google.android.exoplayer2.analytics.C0950f;
import com.google.android.exoplayer2.analytics.C0951g;
import com.google.android.exoplayer2.analytics.C0952h;
import com.google.android.exoplayer2.analytics.C0953i;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.rq0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.internal.p038ws.WebSocketProtocol;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.yandex.mobile.ads.impl.cn */
/* loaded from: classes3.dex */
public final class C4932cn implements InterfaceC5569p8 {

    /* renamed from: a */
    private final InterfaceC4972di f49306a;

    /* renamed from: b */
    private final k61.C5321b f49307b;

    /* renamed from: c */
    private final k61.C5323d f49308c;

    /* renamed from: d */
    private final a f49309d;

    /* renamed from: e */
    private final SparseArray<InterfaceC5624q8.a> f49310e;

    /* renamed from: f */
    private f80<InterfaceC5624q8> f49311f;

    /* renamed from: g */
    private rq0 f49312g;

    /* renamed from: h */
    private InterfaceC4944cy f49313h;

    /* renamed from: com.yandex.mobile.ads.impl.cn$a */
    public static final class a {

        /* renamed from: a */
        private final k61.C5321b f49314a;

        /* renamed from: b */
        private AbstractC4698p<bc0.C4858b> f49315b = AbstractC4698p.m22055i();

        /* renamed from: c */
        private AbstractC4700q<bc0.C4858b, k61> f49316c = AbstractC4700q.m22063h();

        /* renamed from: d */
        @Nullable
        private bc0.C4858b f49317d;

        /* renamed from: e */
        private bc0.C4858b f49318e;

        /* renamed from: f */
        private bc0.C4858b f49319f;

        public a(k61.C5321b c5321b) {
            this.f49314a = c5321b;
        }

        @Nullable
        /* renamed from: b */
        public final bc0.C4858b m23487b() {
            bc0.C4858b next;
            bc0.C4858b c4858b;
            if (this.f49315b.isEmpty()) {
                return null;
            }
            AbstractC4698p<bc0.C4858b> abstractC4698p = this.f49315b;
            if (!(abstractC4698p instanceof List)) {
                Iterator<bc0.C4858b> it = abstractC4698p.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                c4858b = next;
            } else {
                if (abstractC4698p.isEmpty()) {
                    throw new NoSuchElementException();
                }
                c4858b = abstractC4698p.get(abstractC4698p.size() - 1);
            }
            return c4858b;
        }

        @Nullable
        /* renamed from: c */
        public final bc0.C4858b m23489c() {
            return this.f49318e;
        }

        @Nullable
        /* renamed from: d */
        public final bc0.C4858b m23490d() {
            return this.f49319f;
        }

        @Nullable
        /* renamed from: a */
        public final bc0.C4858b m23483a() {
            return this.f49317d;
        }

        @Nullable
        /* renamed from: a */
        public final k61 m23484a(bc0.C4858b c4858b) {
            return this.f49316c.get(c4858b);
        }

        /* renamed from: a */
        public final void m23485a(rq0 rq0Var) {
            this.f49317d = m23480a(rq0Var, this.f49315b, this.f49318e, this.f49314a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m23486a(List<bc0.C4858b> list, @Nullable bc0.C4858b c4858b, rq0 rq0Var) {
            this.f49315b = AbstractC4698p.m22050a((Collection) list);
            if (!((AbstractCollection) list).isEmpty()) {
                this.f49318e = (bc0.C4858b) list.get(0);
                Objects.requireNonNull(c4858b);
                this.f49319f = c4858b;
            }
            if (this.f49317d == null) {
                this.f49317d = m23480a(rq0Var, this.f49315b, this.f49318e, this.f49314a);
            }
            m23482a(rq0Var.getCurrentTimeline());
        }

        /* renamed from: b */
        public final void m23488b(rq0 rq0Var) {
            this.f49317d = m23480a(rq0Var, this.f49315b, this.f49318e, this.f49314a);
            m23482a(rq0Var.getCurrentTimeline());
        }

        /* renamed from: a */
        private void m23482a(k61 k61Var) {
            AbstractC4700q.a<bc0.C4858b, k61> m22061a = AbstractC4700q.m22061a();
            if (this.f49315b.isEmpty()) {
                m23481a(m22061a, this.f49318e, k61Var);
                if (!gn0.m24948a(this.f49319f, this.f49318e)) {
                    m23481a(m22061a, this.f49319f, k61Var);
                }
                if (!gn0.m24948a(this.f49317d, this.f49318e) && !gn0.m24948a(this.f49317d, this.f49319f)) {
                    m23481a(m22061a, this.f49317d, k61Var);
                }
            } else {
                for (int i2 = 0; i2 < this.f49315b.size(); i2++) {
                    m23481a(m22061a, this.f49315b.get(i2), k61Var);
                }
                if (!this.f49315b.contains(this.f49317d)) {
                    m23481a(m22061a, this.f49317d, k61Var);
                }
            }
            this.f49316c = m22061a.m22068a();
        }

        /* renamed from: a */
        private void m23481a(AbstractC4700q.a<bc0.C4858b, k61> aVar, @Nullable bc0.C4858b c4858b, k61 k61Var) {
            if (c4858b == null) {
                return;
            }
            if (k61Var.mo23970a(c4858b.f56449a) != -1) {
                aVar.m22067a(c4858b, k61Var);
                return;
            }
            k61 k61Var2 = this.f49316c.get(c4858b);
            if (k61Var2 != null) {
                aVar.m22067a(c4858b, k61Var2);
            }
        }

        @Nullable
        /* renamed from: a */
        private static bc0.C4858b m23480a(rq0 rq0Var, AbstractC4698p<bc0.C4858b> abstractC4698p, @Nullable bc0.C4858b c4858b, k61.C5321b c5321b) {
            k61 currentTimeline = rq0Var.getCurrentTimeline();
            int currentPeriodIndex = rq0Var.getCurrentPeriodIndex();
            Object mo23975a = currentTimeline.m26043c() ? null : currentTimeline.mo23975a(currentPeriodIndex);
            boolean z = false;
            int m26049a = (rq0Var.isPlayingAd() || currentTimeline.m26043c()) ? -1 : currentTimeline.mo23972a(currentPeriodIndex, c5321b, false).m26049a(s91.m28096a(rq0Var.getCurrentPosition()) - c5321b.f51853e);
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 < abstractC4698p.size()) {
                    bc0.C4858b c4858b2 = abstractC4698p.get(i2);
                    boolean isPlayingAd = rq0Var.isPlayingAd();
                    int currentAdGroupIndex = rq0Var.getCurrentAdGroupIndex();
                    int currentAdIndexInAdGroup = rq0Var.getCurrentAdIndexInAdGroup();
                    if (!c4858b2.f56449a.equals(mo23975a) || ((!isPlayingAd || c4858b2.f56450b != currentAdGroupIndex || c4858b2.f56451c != currentAdIndexInAdGroup) && (isPlayingAd || c4858b2.f56450b != -1 || c4858b2.f56453e != m26049a))) {
                        z2 = false;
                    }
                    if (z2) {
                        return c4858b2;
                    }
                    i2++;
                } else {
                    if (abstractC4698p.isEmpty() && c4858b != null) {
                        boolean isPlayingAd2 = rq0Var.isPlayingAd();
                        int currentAdGroupIndex2 = rq0Var.getCurrentAdGroupIndex();
                        int currentAdIndexInAdGroup2 = rq0Var.getCurrentAdIndexInAdGroup();
                        if (c4858b.f56449a.equals(mo23975a) && ((isPlayingAd2 && c4858b.f56450b == currentAdGroupIndex2 && c4858b.f56451c == currentAdIndexInAdGroup2) || (!isPlayingAd2 && c4858b.f56450b == -1 && c4858b.f56453e == m26049a))) {
                            z = true;
                        }
                        if (z) {
                            return c4858b;
                        }
                    }
                    return null;
                }
            }
        }
    }

    public C4932cn(InterfaceC4972di interfaceC4972di) {
        this.f49306a = (InterfaceC4972di) C5220ia.m25469a(interfaceC4972di);
        this.f49311f = new f80<>(s91.m28127c(), interfaceC4972di, dn1.f49705p);
        k61.C5321b c5321b = new k61.C5321b();
        this.f49307b = c5321b;
        this.f49308c = new k61.C5323d();
        this.f49309d = new a(c5321b);
        this.f49310e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23377a(InterfaceC5624q8 interfaceC5624q8, C5201hv c5201hv) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m23398c(InterfaceC5624q8.a aVar, C5647qm c5647qm, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28578a(c5647qm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m23413f() {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 1028, new ln1(m23477d, 4));
        this.f49311f.m24344b();
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23438a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    @CallSuper
    /* renamed from: a */
    public final void mo23456a(tb0 tb0Var) {
        this.f49311f.m24343a((f80<InterfaceC5624q8>) tb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: b */
    public final void mo23465b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23470b(C5647qm c5647qm) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1007, new vn1(m23408e, c5647qm, 0));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: c */
    public final void mo23474c() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: d */
    public final void mo23478d(C5647qm c5647qm) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1015, new vn1(m23408e, c5647qm, 3));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onCues(List<C5751sl> list) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 27, new pn1(m23477d, list, 9));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onIsLoadingChanged(boolean z) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 3, new mn1(m23477d, z, 2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onIsPlayingChanged(boolean z) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 7, new mn1(m23477d, z, 1));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onPlayWhenReadyChanged(boolean z, int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 5, new on1(m23477d, z, i2, 2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onPlaybackStateChanged(int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 4, new qn1(m23477d, i2, 0));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onPlaybackSuppressionReasonChanged(int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 6, new qn1(m23477d, i2, 1));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onPlayerStateChanged(boolean z, int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, -1, new on1(m23477d, z, i2, 1));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onRenderedFirstFrame() {
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onSkipSilenceEnabledChanged(boolean z) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 23, new mn1(m23408e, z, 0));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onSurfaceSizeChanged(int i2, int i3) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 24, new C0951g(m23408e, i2, i3, 1));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    public final void onVolumeChanged(float f2) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 22, new C0949e(m23408e, f2, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    @CallSuper
    public final void release() {
        ((InterfaceC4944cy) C5220ia.m25474b(this.f49313h)).mo23555a(new gp1(this, 3));
    }

    /* renamed from: e */
    private InterfaceC5624q8.a m23408e() {
        return m23344a(this.f49309d.m23490d());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    @CallSuper
    /* renamed from: a */
    public final void mo23453a(rq0 rq0Var, Looper looper) {
        C5220ia.m25476b(this.f49312g == null || this.f49309d.f49315b.isEmpty());
        this.f49312g = rq0Var;
        this.f49313h = this.f49306a.mo23885a(looper, null);
        this.f49311f = this.f49311f.m24340a(looper, new pn1(this, rq0Var, 3));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: c */
    public final void mo23476c(Exception exc) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1030, new wn1(m23408e, exc, 2));
    }

    /* renamed from: e */
    private InterfaceC5624q8.a m23409e(int i2, @Nullable bc0.C4858b c4858b) {
        Objects.requireNonNull(this.f49312g);
        if (c4858b != null) {
            if (this.f49309d.m23484a(c4858b) != null) {
                return m23344a(c4858b);
            }
            return m23437a(k61.f51847a, i2, c4858b);
        }
        k61 currentTimeline = this.f49312g.getCurrentTimeline();
        if (!(i2 < currentTimeline.mo25935b())) {
            currentTimeline = k61.f51847a;
        }
        return m23437a(currentTimeline, i2, (bc0.C4858b) null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23473b(String str, long j2, long j3) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1008, new yn1(m23408e, str, j3, j2, 0));
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    /* renamed from: c */
    public final void mo23194c(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1000, new sn1(m23409e, j80Var, rb0Var, 2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23472b(String str) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1012, new xn1(m23408e, str, 1));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: d */
    public final void mo22164d(int i2, @Nullable bc0.C4858b c4858b) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1026, new ln1(m23409e, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23378a(rq0 rq0Var, InterfaceC5624q8 interfaceC5624q8, C5201hv c5201hv) {
        ((tb0) interfaceC5624q8).m28580a(rq0Var, new InterfaceC5624q8.b(c5201hv, this.f49310e));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23463a(List<bc0.C4858b> list, @Nullable bc0.C4858b c4858b) {
        a aVar = this.f49309d;
        rq0 rq0Var = this.f49312g;
        Objects.requireNonNull(rq0Var);
        aVar.m23486a(list, c4858b, rq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23471b(Exception exc) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1029, new wn1(m23408e, exc, 0));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: c */
    public final void mo22163c(int i2, @Nullable bc0.C4858b c4858b) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1023, new ln1(m23409e, 1));
    }

    /* renamed from: d */
    public final InterfaceC5624q8.a m23477d() {
        return m23344a(this.f49309d.m23483a());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23448a(C5606pv c5606pv, @Nullable C5873um c5873um) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1009, new un1(m23408e, c5606pv, c5873um, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23469b(C5606pv c5606pv, @Nullable C5873um c5873um) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1017, new un1(m23408e, c5606pv, c5873um, 0));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: c */
    public final void mo23475c(C5647qm c5647qm) {
        InterfaceC5624q8.a m23344a = m23344a(this.f49309d.m23489c());
        m23449a(m23344a, 1020, new vn1(m23344a, c5647qm, 2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23442a(long j2) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1010, new C0952h(m23408e, j2, 1));
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    /* renamed from: b */
    public final void mo23193b(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new sn1(m23409e, j80Var, rb0Var, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23441a(int i2, long j2, long j3) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1011, new rn1(m23408e, i2, j2, j3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m23380b(InterfaceC5624q8.a aVar, int i2, long j2, long j3, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28575a(aVar, i2, j2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23459a(Exception exc) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1014, new wn1(m23408e, exc, 1));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: b */
    public final void mo22162b(int i2, @Nullable bc0.C4858b c4858b) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1027, new ln1(m23409e, 3));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23462a(String str, long j2, long j3) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1016, new yn1(m23408e, str, j3, j2, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: b */
    public final void mo23466b(int i2, long j2) {
        InterfaceC5624q8.a m23344a = m23344a(this.f49309d.m23489c());
        m23449a(m23344a, 1018, new nn1(m23344a, i2, j2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5793tc.a
    /* renamed from: b */
    public final void mo23467b(int i2, long j2, long j3) {
        InterfaceC5624q8.a m23344a = m23344a(this.f49309d.m23487b());
        m23449a(m23344a, 1006, new rn1(m23344a, i2, j2, j3, 0));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23461a(String str) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 1019, new xn1(m23408e, str, 0));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: b */
    public final void mo23468b(C5043es c5043es) {
        InterfaceC5624q8.a m23477d;
        xb0 xb0Var;
        if ((c5043es instanceof C5043es) && (xb0Var = c5043es.f50046h) != null) {
            m23477d = m23344a(new bc0.C4858b(xb0Var));
        } else {
            m23477d = m23477d();
        }
        m23449a(m23477d, 10, new tn1(m23477d, c5043es, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23460a(Object obj, long j2) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 26, new C0920f(m23408e, obj, j2, 2));
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    /* renamed from: a */
    public final void mo23190a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1002, new sn1(m23409e, j80Var, rb0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    /* renamed from: a */
    public final void mo23191a(int i2, @Nullable bc0.C4858b c4858b, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1003, new C0953i(m23409e, j80Var, rb0Var, iOException, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23356a(InterfaceC5624q8.a aVar, j80 j80Var, rb0 rb0Var, IOException iOException, boolean z, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28579a(rb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.cc0
    /* renamed from: a */
    public final void mo23192a(int i2, @Nullable bc0.C4858b c4858b, rb0 rb0Var) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1004, new pn1(m23409e, rb0Var, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23364a(InterfaceC5624q8.a aVar, rb0 rb0Var, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28576a(aVar, rb0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23439a(int i2) {
        a aVar = this.f49309d;
        rq0 rq0Var = this.f49312g;
        Objects.requireNonNull(rq0Var);
        aVar.m23488b(rq0Var);
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 0, new qn1(m23477d, i2, 2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23447a(@Nullable pb0 pb0Var, int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 1, new yo1(m23477d, pb0Var, i2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23455a(t71 t71Var) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 2, new pn1(m23477d, t71Var, 5));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23451a(rq0.C5705a c5705a) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 13, new pn1(m23477d, c5705a, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23357a(InterfaceC5624q8.a aVar, kq0 kq0Var, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28573a(kq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23452a(rq0.C5707c c5707c, rq0.C5707c c5707c2, int i2) {
        a aVar = this.f49309d;
        rq0 rq0Var = this.f49312g;
        Objects.requireNonNull(rq0Var);
        aVar.m23485a(rq0Var);
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 11, new C0950f(m23477d, i2, c5707c, c5707c2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23350a(InterfaceC5624q8.a aVar, int i2, rq0.C5707c c5707c, rq0.C5707c c5707c2, InterfaceC5624q8 interfaceC5624q8) {
        Objects.requireNonNull(interfaceC5624q8);
        ((tb0) interfaceC5624q8).m28572a(i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23446a(nq0 nq0Var) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 12, new pn1(m23477d, nq0Var, 4));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23454a(sb0 sb0Var) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 14, new pn1(m23477d, sb0Var, 0));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23443a(Metadata metadata) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 28, new pn1(m23477d, metadata, 2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23457a(C5871ul c5871ul) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 27, new pn1(m23477d, c5871ul, 10));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23445a(lf1 lf1Var) {
        InterfaceC5624q8.a m23408e = m23408e();
        m23449a(m23408e, 25, new pn1(m23408e, lf1Var, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23358a(InterfaceC5624q8.a aVar, lf1 lf1Var, InterfaceC5624q8 interfaceC5624q8) {
        ((tb0) interfaceC5624q8).m28574a(lf1Var);
        int i2 = lf1Var.f52381a;
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23458a(C5875uo c5875uo) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 29, new pn1(m23477d, c5875uo, 7));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23464a(boolean z, int i2) {
        InterfaceC5624q8.a m23477d = m23477d();
        m23449a(m23477d, 30, new on1(m23477d, i2, z));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: a */
    public final void mo22160a(int i2, @Nullable bc0.C4858b c4858b, int i3) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1022, new qn1(m23409e, i3, 3));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: a */
    public final void mo22161a(int i2, @Nullable bc0.C4858b c4858b, Exception exc) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, new wn1(m23409e, exc, 3));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4719f
    /* renamed from: a */
    public final void mo22159a(int i2, @Nullable bc0.C4858b c4858b) {
        InterfaceC5624q8.a m23409e = m23409e(i2, c4858b);
        m23449a(m23409e, 1025, new ln1(m23409e, 0));
    }

    /* renamed from: a */
    public final void m23449a(InterfaceC5624q8.a aVar, int i2, f80.InterfaceC5063a<InterfaceC5624q8> interfaceC5063a) {
        this.f49310e.put(i2, aVar);
        f80<InterfaceC5624q8> f80Var = this.f49311f;
        f80Var.m24342a(i2, interfaceC5063a);
        f80Var.m24341a();
    }

    @RequiresNonNull({"player"})
    /* renamed from: a */
    public final InterfaceC5624q8.a m23437a(k61 k61Var, int i2, @Nullable bc0.C4858b c4858b) {
        long m28119b;
        bc0.C4858b c4858b2 = k61Var.m26043c() ? null : c4858b;
        long mo23887c = this.f49306a.mo23887c();
        boolean z = k61Var.equals(this.f49312g.getCurrentTimeline()) && i2 == this.f49312g.getCurrentMediaItemIndex();
        if (c4858b2 != null && c4858b2.m29735a()) {
            if (z && this.f49312g.getCurrentAdGroupIndex() == c4858b2.f56450b && this.f49312g.getCurrentAdIndexInAdGroup() == c4858b2.f56451c) {
                m28119b = this.f49312g.getCurrentPosition();
            }
            m28119b = 0;
        } else if (z) {
            m28119b = this.f49312g.getContentPosition();
        } else {
            if (!k61Var.m26043c()) {
                m28119b = s91.m28119b(k61Var.mo23974a(i2, this.f49308c, 0L).f51876m);
            }
            m28119b = 0;
        }
        return new InterfaceC5624q8.a(mo23887c, k61Var, i2, c4858b2, m28119b, this.f49312g.getCurrentTimeline(), this.f49312g.getCurrentMediaItemIndex(), this.f49309d.m23483a(), this.f49312g.getCurrentPosition(), this.f49312g.getTotalBufferedDuration());
    }

    /* renamed from: a */
    private InterfaceC5624q8.a m23344a(@Nullable bc0.C4858b c4858b) {
        Objects.requireNonNull(this.f49312g);
        k61 m23484a = c4858b == null ? null : this.f49309d.m23484a(c4858b);
        if (c4858b != null && m23484a != null) {
            return m23437a(m23484a, m23484a.mo23973a(c4858b.f56449a, this.f49307b).f51851c, c4858b);
        }
        int currentMediaItemIndex = this.f49312g.getCurrentMediaItemIndex();
        k61 currentTimeline = this.f49312g.getCurrentTimeline();
        if (!(currentMediaItemIndex < currentTimeline.mo25935b())) {
            currentTimeline = k61.f51847a;
        }
        return m23437a(currentTimeline, currentMediaItemIndex, (bc0.C4858b) null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23450a(C5647qm c5647qm) {
        InterfaceC5624q8.a m23344a = m23344a(this.f49309d.m23489c());
        m23449a(m23344a, 1013, new vn1(m23344a, c5647qm, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5569p8
    /* renamed from: a */
    public final void mo23440a(int i2, long j2) {
        InterfaceC5624q8.a m23344a = m23344a(this.f49309d.m23489c());
        m23449a(m23344a, 1021, new nn1(m23344a, j2, i2));
    }

    @Override // com.yandex.mobile.ads.impl.rq0.InterfaceC5706b
    /* renamed from: a */
    public final void mo23444a(@Nullable C5043es c5043es) {
        InterfaceC5624q8.a m23477d;
        xb0 xb0Var;
        if ((c5043es instanceof C5043es) && (xb0Var = c5043es.f50046h) != null) {
            m23477d = m23344a(new bc0.C4858b(xb0Var));
        } else {
            m23477d = m23477d();
        }
        m23449a(m23477d, 10, new tn1(m23477d, c5043es, 0));
    }
}
