package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.InterfaceC5853ub;
import com.yandex.mobile.ads.impl.bb0;
import com.yandex.mobile.ads.impl.cv0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ta0 extends ya0 implements ra0 {

    /* renamed from: S0 */
    private static final ua0 f54991S0 = ct0.m23512d();

    /* renamed from: H0 */
    private final Context f54992H0;

    /* renamed from: I0 */
    private final InterfaceC5790tb.a f54993I0;

    /* renamed from: J0 */
    private final InterfaceC5853ub f54994J0;

    /* renamed from: K0 */
    private int f54995K0;

    /* renamed from: L0 */
    private boolean f54996L0;

    /* renamed from: M0 */
    @Nullable
    private C5606pv f54997M0;

    /* renamed from: N0 */
    private long f54998N0;

    /* renamed from: O0 */
    private boolean f54999O0;

    /* renamed from: P0 */
    private boolean f55000P0;

    /* renamed from: Q0 */
    private boolean f55001Q0;

    /* renamed from: R0 */
    @Nullable
    private cv0.InterfaceC4941a f55002R0;

    /* renamed from: com.yandex.mobile.ads.impl.ta0$a */
    public final class C5789a implements InterfaceC5853ub.c {
        private C5789a() {
        }

        public /* synthetic */ C5789a(ta0 ta0Var, int i2) {
            this();
        }
    }

    public ta0(Context context, C6083yn c6083yn, ab0 ab0Var, @Nullable Handler handler, @Nullable InterfaceC5790tb interfaceC5790tb, C5085fn c5085fn) {
        super(1, c6083yn, ab0Var, 44100.0f);
        this.f54992H0 = context.getApplicationContext();
        this.f54994J0 = c5085fn;
        this.f54993I0 = new InterfaceC5790tb.a(handler, interfaceC5790tb);
        c5085fn.m24665a(new C5789a(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: J */
    public final void mo24065J() {
        this.f54994J0.mo24676f();
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: M */
    public final void mo28535M() throws C5043es {
        try {
            this.f54994J0.mo24673c();
        } catch (InterfaceC5853ub.e e2) {
            throw m24560a(5002, e2.f55438c, e2, e2.f55437b);
        }
    }

    @CallSuper
    /* renamed from: R */
    public final void m28536R() {
        this.f55000P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public final boolean mo22248d() {
        return this.f54994J0.mo24674d() || super.mo22248d();
    }

    @Override // com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dv0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    public final nq0 getPlaybackParameters() {
        return this.f54994J0.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.cv0
    @Nullable
    /* renamed from: l */
    public final ra0 mo23532l() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: o */
    public final long mo27885o() {
        if (mo23525c() == 2) {
            long mo24659a = this.f54994J0.mo24659a(mo22247a());
            if (mo24659a != Long.MIN_VALUE) {
                if (!this.f55000P0) {
                    mo24659a = Math.max(this.f54998N0, mo24659a);
                }
                this.f54998N0 = mo24659a;
                this.f55000P0 = false;
            }
        }
        return this.f54998N0;
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public final void mo22249u() {
        this.f55001Q0 = true;
        try {
            this.f54994J0.flush();
            try {
                super.mo22249u();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo22249u();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: v */
    public final void mo24087v() {
        try {
            super.mo24087v();
        } finally {
            if (this.f55001Q0) {
                this.f55001Q0 = false;
                this.f54994J0.reset();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: w */
    public final void mo24088w() {
        this.f54994J0.play();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: x */
    public final void mo24089x() {
        long mo24659a = this.f54994J0.mo24659a(mo22247a());
        if (mo24659a != Long.MIN_VALUE) {
            if (!this.f55000P0) {
                mo24659a = Math.max(this.f54998N0, mo24659a);
            }
            this.f54998N0 = mo24659a;
            this.f55000P0 = false;
        }
        this.f54994J0.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final boolean mo24081a(long j2, long j3, @Nullable sa0 sa0Var, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, C5606pv c5606pv) throws C5043es {
        Objects.requireNonNull(byteBuffer);
        if (this.f54997M0 != null && (i3 & 2) != 0) {
            Objects.requireNonNull(sa0Var);
            sa0Var.mo24025a(false, i2);
            return true;
        }
        if (z) {
            if (sa0Var != null) {
                sa0Var.mo24025a(false, i2);
            }
            this.f56715B0.f54081f += i4;
            this.f54994J0.mo24676f();
            return true;
        }
        try {
            if (!this.f54994J0.mo24669a(byteBuffer, j4, i4)) {
                return false;
            }
            if (sa0Var != null) {
                sa0Var.mo24025a(false, i2);
            }
            this.f56715B0.f54080e += i4;
            return true;
        } catch (InterfaceC5853ub.b e2) {
            throw m24560a(5001, e2.f55435c, e2, e2.f55434b);
        } catch (InterfaceC5853ub.e e3) {
            throw m24560a(5002, c5606pv, e3, e3.f55437b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: b */
    public final boolean mo28537b(C5606pv c5606pv) {
        return this.f54994J0.mo24668a(c5606pv);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: b */
    public final void mo24083b(C5752sm c5752sm) {
        if (!this.f54999O0 || c5752sm.m26637e()) {
            return;
        }
        if (Math.abs(c5752sm.f54759e - this.f54998N0) > 500000) {
            this.f54998N0 = c5752sm.f54759e;
        }
        this.f54999O0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo24068a(com.yandex.mobile.ads.impl.ab0 r13, com.yandex.mobile.ads.impl.C5606pv r14) throws com.yandex.mobile.ads.impl.bb0.C4851b {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ta0.mo24068a(com.yandex.mobile.ads.impl.ab0, com.yandex.mobile.ads.impl.pv):int");
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final ArrayList mo24073a(ab0 ab0Var, C5606pv c5606pv, boolean z) throws bb0.C4851b {
        AbstractC4698p m22058a;
        InterfaceC5853ub interfaceC5853ub = this.f54994J0;
        String str = c5606pv.f53820l;
        if (str == null) {
            m22058a = AbstractC4698p.m22055i();
        } else {
            if (interfaceC5853ub.mo24668a(c5606pv)) {
                List<wa0> m22770a = bb0.m22770a("audio/raw", false, false);
                wa0 wa0Var = m22770a.isEmpty() ? null : m22770a.get(0);
                if (wa0Var != null) {
                    m22058a = AbstractC4698p.m22048a(wa0Var);
                }
            }
            List<wa0> mo22450a = ab0Var.mo22450a(str, z, false);
            String m22767a = bb0.m22767a(c5606pv);
            if (m22767a == null) {
                m22058a = AbstractC4698p.m22050a((Collection) mo22450a);
            } else {
                List<wa0> mo22450a2 = ab0Var.mo22450a(m22767a, z, false);
                int i2 = AbstractC4698p.f47900c;
                m22058a = new AbstractC4698p.a().m22059b((List) mo22450a).m22059b((List) mo22450a2).m22058a();
            }
        }
        return bb0.m22768a(m22058a, c5606pv);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[LOOP:1: B:26:0x008d->B:28:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.sa0.C5734a mo24069a(com.yandex.mobile.ads.impl.wa0 r11, com.yandex.mobile.ads.impl.C5606pv r12, @androidx.annotation.Nullable android.media.MediaCrypto r13, float r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ta0.mo24069a(com.yandex.mobile.ads.impl.wa0, com.yandex.mobile.ads.impl.pv, android.media.MediaCrypto, float):com.yandex.mobile.ads.impl.sa0$a");
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final C5873um mo24071a(wa0 wa0Var, C5606pv c5606pv, C5606pv c5606pv2) {
        C5873um m29421a = wa0Var.m29421a(c5606pv, c5606pv2);
        int i2 = m29421a.f55566e;
        if (m28532a(c5606pv2, wa0Var) > this.f54995K0) {
            i2 |= 64;
        }
        int i3 = i2;
        return new C5873um(wa0Var.f56065a, c5606pv, c5606pv2, i3 != 0 ? 0 : m29421a.f55565d, i3);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final float mo24067a(float f2, C5606pv[] c5606pvArr) {
        int i2 = -1;
        for (C5606pv c5606pv : c5606pvArr) {
            int i3 = c5606pv.f53834z;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * i2;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24079a(String str, long j2, long j3) {
        this.f54993I0.m28562a(str, j2, j3);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24078a(String str) {
        this.f54993I0.m28561a(str);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24077a(Exception exc) {
        d90.m23838a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f54993I0.m28560a(exc);
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    @Nullable
    /* renamed from: a */
    public final C5873um mo24070a(C5658qv c5658qv) throws C5043es {
        C5873um mo24070a = super.mo24070a(c5658qv);
        this.f54993I0.m28558a(c5658qv.f54140b, mo24070a);
        return mo24070a;
    }

    @Override // com.yandex.mobile.ads.impl.ya0
    /* renamed from: a */
    public final void mo24075a(C5606pv c5606pv, @Nullable MediaFormat mediaFormat) throws C5043es {
        int m28116b;
        int i2;
        C5606pv c5606pv2 = this.f54997M0;
        int[] iArr = null;
        if (c5606pv2 != null) {
            c5606pv = c5606pv2;
        } else if (m29897C() != null) {
            if ("audio/raw".equals(c5606pv.f53820l)) {
                m28116b = c5606pv.f53803A;
            } else if (s91.f54530a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                m28116b = mediaFormat.getInteger("pcm-encoding");
            } else {
                m28116b = mediaFormat.containsKey("v-bits-per-sample") ? s91.m28116b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            C5606pv m27550a = new C5606pv.a().m27561f("audio/raw").m27565j(m28116b).m27558e(c5606pv.f53804B).m27560f(c5606pv.f53805C).m27554c(mediaFormat.getInteger("channel-count")).m27569n(mediaFormat.getInteger("sample-rate")).m27550a();
            if (this.f54996L0 && m27550a.f53833y == 6 && (i2 = c5606pv.f53833y) < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < c5606pv.f53833y; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            }
            c5606pv = m27550a;
        }
        try {
            this.f54994J0.mo24664a(c5606pv, iArr);
        } catch (InterfaceC5853ub.a e2) {
            throw m24561a(e2, e2.f55432a, 5001);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo24080a(boolean z, boolean z2) throws C5043es {
        super.mo24080a(z, z2);
        this.f54993I0.m28565b(this.f56715B0);
        if (m24563p().f50068a) {
            this.f54994J0.mo24671b();
        } else {
            this.f54994J0.mo24675e();
        }
        this.f54994J0.mo24666a(m24565r());
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22245a(long j2, boolean z) throws C5043es {
        super.mo22245a(j2, z);
        this.f54994J0.flush();
        this.f54998N0 = j2;
        this.f54999O0 = true;
        this.f55000P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.ya0, com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final boolean mo22247a() {
        return super.mo22247a() && this.f54994J0.mo24667a();
    }

    @Override // com.yandex.mobile.ads.impl.ra0
    /* renamed from: a */
    public final void mo27884a(nq0 nq0Var) {
        this.f54994J0.mo24663a(nq0Var);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.vq0.InterfaceC5936b
    /* renamed from: a */
    public final void mo24074a(int i2, @Nullable Object obj) throws C5043es {
        if (i2 == 2) {
            this.f54994J0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.f54994J0.mo24662a((C5481nb) obj);
            return;
        }
        if (i2 != 6) {
            switch (i2) {
                case 9:
                    this.f54994J0.mo24672b(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.f54994J0.mo24660a(((Integer) obj).intValue());
                    break;
                case 11:
                    this.f55002R0 = (cv0.InterfaceC4941a) obj;
                    break;
            }
            return;
        }
        this.f54994J0.mo24661a((C5174hc) obj);
    }

    /* renamed from: a */
    private int m28532a(C5606pv c5606pv, wa0 wa0Var) {
        int i2;
        if (!f54991S0.m28923f().equals(wa0Var.f56065a) || (i2 = s91.f54530a) >= 24 || (i2 == 23 && s91.m28131d(this.f54992H0))) {
            return c5606pv.f53821m;
        }
        return -1;
    }
}
