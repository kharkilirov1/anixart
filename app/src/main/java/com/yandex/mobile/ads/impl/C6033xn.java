package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.xn */
/* loaded from: classes3.dex */
final class C6033xn implements ra0 {

    /* renamed from: b */
    private final x31 f56502b;

    /* renamed from: c */
    private final a f56503c;

    /* renamed from: d */
    @Nullable
    private cv0 f56504d;

    /* renamed from: e */
    @Nullable
    private ra0 f56505e;

    /* renamed from: f */
    private boolean f56506f = true;

    /* renamed from: g */
    private boolean f56507g;

    /* renamed from: com.yandex.mobile.ads.impl.xn$a */
    public interface a {
    }

    public C6033xn(a aVar, f51 f51Var) {
        this.f56503c = aVar;
        this.f56502b = new x31(f51Var);
    }

    /* renamed from: a */
    public final void m29771a() {
        this.f56507g = true;
        this.f56502b.m29662a();
    }

    /* renamed from: b */
    public final void m29774b() {
        this.f56507g = false;
        this.f56502b.m29664b();
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    public final nq0 getPlaybackParameters() {
        ra0 ra0Var = this.f56505e;
        return ra0Var != null ? ra0Var.getPlaybackParameters() : this.f56502b.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: o */
    public final long mo27885o() {
        if (this.f56506f) {
            return this.f56502b.mo27885o();
        }
        ra0 ra0Var = this.f56505e;
        Objects.requireNonNull(ra0Var);
        return ra0Var.mo27885o();
    }

    /* renamed from: a */
    public final void m29772a(long j2) {
        this.f56502b.m29663a(j2);
    }

    /* renamed from: b */
    public final void m29775b(cv0 cv0Var) throws C5043es {
        ra0 ra0Var;
        ra0 mo23532l = cv0Var.mo23532l();
        if (mo23532l == null || mo23532l == (ra0Var = this.f56505e)) {
            return;
        }
        if (ra0Var == null) {
            this.f56505e = mo23532l;
            this.f56504d = cv0Var;
            mo23532l.mo27884a(this.f56502b.getPlaybackParameters());
            return;
        }
        throw C5043es.m24247a(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
    }

    /* renamed from: a */
    public final void m29773a(cv0 cv0Var) {
        if (cv0Var == this.f56504d) {
            this.f56505e = null;
            this.f56504d = null;
            this.f56506f = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: a */
    public final void mo27884a(nq0 nq0Var) {
        ra0 ra0Var = this.f56505e;
        if (ra0Var != null) {
            ra0Var.mo27884a(nq0Var);
            nq0Var = this.f56505e.getPlaybackParameters();
        }
        this.f56502b.mo27884a(nq0Var);
    }

    /* renamed from: a */
    public final long m29770a(boolean z) {
        cv0 cv0Var = this.f56504d;
        if (cv0Var == null || cv0Var.mo22247a() || (!this.f56504d.mo22248d() && (z || this.f56504d.mo23526e()))) {
            this.f56506f = true;
            if (this.f56507g) {
                this.f56502b.m29662a();
            }
        } else {
            ra0 ra0Var = this.f56505e;
            Objects.requireNonNull(ra0Var);
            long mo27885o = ra0Var.mo27885o();
            if (this.f56506f) {
                if (mo27885o < this.f56502b.mo27885o()) {
                    this.f56502b.m29664b();
                } else {
                    this.f56506f = false;
                    if (this.f56507g) {
                        this.f56502b.m29662a();
                    }
                }
            }
            this.f56502b.m29663a(mo27885o);
            nq0 playbackParameters = ra0Var.getPlaybackParameters();
            if (!playbackParameters.equals(this.f56502b.getPlaybackParameters())) {
                this.f56502b.mo27884a(playbackParameters);
                ((C5354ks) this.f56503c).m26236a(playbackParameters);
            }
        }
        return mo27885o();
    }
}
