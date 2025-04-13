package com.yandex.mobile.ads.impl;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.C4717d;
import com.yandex.mobile.ads.exo.drm.InterfaceC4720g;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.us0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ws0 extends AbstractC4917ce implements us0.InterfaceC5883b {

    /* renamed from: h */
    private final pb0 f56250h;

    /* renamed from: i */
    private final pb0.C5580f f56251i;

    /* renamed from: j */
    private final InterfaceC4978dm.a f56252j;

    /* renamed from: k */
    private final ts0.InterfaceC5816a f56253k;

    /* renamed from: l */
    private final InterfaceC4720g f56254l;

    /* renamed from: m */
    private final i80 f56255m;

    /* renamed from: n */
    private final int f56256n;

    /* renamed from: o */
    private boolean f56257o;

    /* renamed from: p */
    private long f56258p;

    /* renamed from: q */
    private boolean f56259q;

    /* renamed from: r */
    private boolean f56260r;

    /* renamed from: s */
    @Nullable
    private v71 f56261s;

    /* renamed from: com.yandex.mobile.ads.impl.ws0$a */
    public static final class C5988a implements bc0.InterfaceC4857a {

        /* renamed from: a */
        private final InterfaceC4978dm.a f56262a;

        /* renamed from: b */
        private ts0.InterfaceC5816a f56263b;

        /* renamed from: c */
        private InterfaceC5547oq f56264c;

        /* renamed from: d */
        private i80 f56265d;

        public C5988a(InterfaceC4978dm.a aVar, InterfaceC5604pt interfaceC5604pt) {
            this(aVar, new en1(interfaceC5604pt, 15));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ ts0 m29560a(InterfaceC5604pt interfaceC5604pt, uq0 uq0Var) {
            return new C5687rf(interfaceC5604pt);
        }

        public C5988a(InterfaceC4978dm.a aVar, ts0.InterfaceC5816a interfaceC5816a) {
            this(aVar, interfaceC5816a, new C4717d(), new C5981wn());
        }

        /* renamed from: a */
        public final ws0 m29562a(pb0 pb0Var) {
            Objects.requireNonNull(pb0Var.f53429b);
            Object obj = pb0Var.f53429b.f53483g;
            return new ws0(pb0Var, this.f56262a, this.f56263b, this.f56264c.mo22158a(pb0Var), this.f56265d, 1048576, 0);
        }

        public C5988a(InterfaceC4978dm.a aVar, ts0.InterfaceC5816a interfaceC5816a, C4717d c4717d, C5981wn c5981wn) {
            this.f56262a = aVar;
            this.f56263b = interfaceC5816a;
            this.f56264c = c4717d;
            this.f56265d = c5981wn;
        }
    }

    public /* synthetic */ ws0(pb0 pb0Var, InterfaceC4978dm.a aVar, ts0.InterfaceC5816a interfaceC5816a, InterfaceC4720g interfaceC4720g, i80 i80Var, int i2, int i3) {
        this(pb0Var, aVar, interfaceC5816a, interfaceC4720g, i80Var, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.mobile.ads.impl.vs0] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.mobile.ads.impl.ce, com.yandex.mobile.ads.impl.ws0] */
    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    /* renamed from: a */
    public final void mo23238a(@Nullable v71 v71Var) {
        this.f56261s = v71Var;
        this.f56254l.prepare();
        InterfaceC4720g interfaceC4720g = this.f56254l;
        Looper myLooper = Looper.myLooper();
        Objects.requireNonNull(myLooper);
        interfaceC4720g.mo22137a(myLooper, m23242c());
        long j2 = this.f56258p;
        k11 k11Var = new k11(j2, j2, this.f56259q, this.f56260r, this.f56250h);
        if (this.f56257o) {
            k11Var = new vs0(k11Var);
        }
        m23237a(k11Var);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4917ce
    /* renamed from: e */
    public final void mo23244e() {
        this.f56254l.release();
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final pb0 getMediaItem() {
        return this.f56250h;
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    private ws0(pb0 pb0Var, InterfaceC4978dm.a aVar, ts0.InterfaceC5816a interfaceC5816a, InterfaceC4720g interfaceC4720g, i80 i80Var, int i2) {
        this.f56251i = (pb0.C5580f) C5220ia.m25469a(pb0Var.f53429b);
        this.f56250h = pb0Var;
        this.f56252j = aVar;
        this.f56253k = interfaceC5816a;
        this.f56254l = interfaceC4720g;
        this.f56255m = i80Var;
        this.f56256n = i2;
        this.f56257o = true;
        this.f56258p = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final vb0 mo22790a(bc0.C4858b c4858b, InterfaceC5476n8 interfaceC5476n8, long j2) {
        InterfaceC4978dm mo22497a = this.f56252j.mo22497a();
        v71 v71Var = this.f56261s;
        if (v71Var != null) {
            mo22497a.mo22488a(v71Var);
        }
        return new us0(this.f56251i.f53477a, mo22497a, this.f56253k.mo24217a(m23242c()), this.f56254l, m23235a(c4858b), this.f56255m, m23240b(c4858b), this, interfaceC5476n8, this.f56251i.f53481e, this.f56256n);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22797a(vb0 vb0Var) {
        ((us0) vb0Var).m29128l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.yandex.mobile.ads.impl.vs0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.ce, com.yandex.mobile.ads.impl.ws0] */
    /* renamed from: a */
    public final void m29559a(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.f56258p;
        }
        if (!this.f56257o && this.f56258p == j2 && this.f56259q == z && this.f56260r == z2) {
            return;
        }
        this.f56258p = j2;
        this.f56259q = z;
        this.f56260r = z2;
        this.f56257o = false;
        long j3 = this.f56258p;
        k11 k11Var = new k11(j3, j3, this.f56259q, this.f56260r, this.f56250h);
        if (this.f56257o) {
            k11Var = new vs0(k11Var);
        }
        m23237a(k11Var);
    }
}
