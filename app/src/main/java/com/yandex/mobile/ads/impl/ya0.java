package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.yandex.mobile.ads.exo.drm.InterfaceC4718e;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.impl.C5752sm;
import com.yandex.mobile.ads.impl.bb0;
import com.yandex.mobile.ads.impl.sa0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class ya0 extends AbstractC5074fe {

    /* renamed from: F0 */
    private static final za0 f56710F0 = ct0.m23514f();

    /* renamed from: G0 */
    private static final byte[] f56711G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final long[] f56712A;

    /* renamed from: A0 */
    @Nullable
    private C5043es f56713A0;

    /* renamed from: B */
    @Nullable
    private C5606pv f56714B;

    /* renamed from: B0 */
    public C5647qm f56715B0;

    /* renamed from: C */
    @Nullable
    private C5606pv f56716C;

    /* renamed from: C0 */
    private long f56717C0;

    /* renamed from: D */
    @Nullable
    private InterfaceC4718e f56718D;

    /* renamed from: D0 */
    private long f56719D0;

    /* renamed from: E */
    @Nullable
    private InterfaceC4718e f56720E;

    /* renamed from: E0 */
    private int f56721E0;

    /* renamed from: F */
    @Nullable
    private MediaCrypto f56722F;

    /* renamed from: G */
    private boolean f56723G;

    /* renamed from: H */
    private long f56724H;

    /* renamed from: I */
    private float f56725I;

    /* renamed from: J */
    private float f56726J;

    /* renamed from: K */
    @Nullable
    private sa0 f56727K;

    /* renamed from: L */
    @Nullable
    private C5606pv f56728L;

    /* renamed from: M */
    @Nullable
    private MediaFormat f56729M;

    /* renamed from: N */
    private boolean f56730N;

    /* renamed from: O */
    private float f56731O;

    /* renamed from: P */
    @Nullable
    private ArrayDeque<wa0> f56732P;

    /* renamed from: Q */
    @Nullable
    private C6068b f56733Q;

    /* renamed from: R */
    @Nullable
    private wa0 f56734R;

    /* renamed from: S */
    private int f56735S;

    /* renamed from: T */
    private boolean f56736T;

    /* renamed from: U */
    private boolean f56737U;

    /* renamed from: V */
    private boolean f56738V;

    /* renamed from: W */
    private boolean f56739W;

    /* renamed from: X */
    private boolean f56740X;

    /* renamed from: Y */
    private boolean f56741Y;

    /* renamed from: Z */
    private boolean f56742Z;

    /* renamed from: a0 */
    private boolean f56743a0;

    /* renamed from: b0 */
    private boolean f56744b0;

    /* renamed from: c0 */
    private boolean f56745c0;

    /* renamed from: d0 */
    @Nullable
    private C5858uf f56746d0;

    /* renamed from: e0 */
    private long f56747e0;

    /* renamed from: f0 */
    private int f56748f0;

    /* renamed from: g0 */
    private int f56749g0;

    /* renamed from: h0 */
    @Nullable
    private ByteBuffer f56750h0;

    /* renamed from: i0 */
    private boolean f56751i0;

    /* renamed from: j0 */
    private boolean f56752j0;

    /* renamed from: k0 */
    private boolean f56753k0;

    /* renamed from: l0 */
    private boolean f56754l0;

    /* renamed from: m0 */
    private boolean f56755m0;

    /* renamed from: n */
    private final sa0.InterfaceC5735b f56756n;

    /* renamed from: n0 */
    private boolean f56757n0;

    /* renamed from: o */
    private final ab0 f56758o;

    /* renamed from: o0 */
    private int f56759o0;

    /* renamed from: p */
    private final boolean f56760p;

    /* renamed from: p0 */
    private int f56761p0;

    /* renamed from: q */
    private final float f56762q;

    /* renamed from: q0 */
    private int f56763q0;

    /* renamed from: r */
    private final C5752sm f56764r;

    /* renamed from: r0 */
    private boolean f56765r0;

    /* renamed from: s */
    private final C5752sm f56766s;

    /* renamed from: s0 */
    private boolean f56767s0;

    /* renamed from: t */
    private final C5752sm f56768t;

    /* renamed from: t0 */
    private boolean f56769t0;

    /* renamed from: u */
    private final C5394le f56770u;

    /* renamed from: u0 */
    private long f56771u0;

    /* renamed from: v */
    private final j61<C5606pv> f56772v;

    /* renamed from: v0 */
    private long f56773v0;

    /* renamed from: w */
    private final ArrayList<Long> f56774w;

    /* renamed from: w0 */
    private boolean f56775w0;

    /* renamed from: x */
    private final MediaCodec.BufferInfo f56776x;

    /* renamed from: x0 */
    private boolean f56777x0;

    /* renamed from: y */
    private final long[] f56778y;

    /* renamed from: y0 */
    private boolean f56779y0;

    /* renamed from: z */
    private final long[] f56780z;

    /* renamed from: z0 */
    private boolean f56781z0;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.ya0$a */
    public static final class C6067a {
        @DoNotInline
        /* renamed from: a */
        public static void m29908a(sa0.C5734a c5734a, uq0 uq0Var) {
            LogSessionId m29096a = uq0Var.m29096a();
            if (m29096a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            c5734a.f54545b.setString("log-session-id", m29096a.getStringId());
        }
    }

    public ya0(int i2, C6083yn c6083yn, ab0 ab0Var, float f2) {
        super(i2);
        this.f56756n = c6083yn;
        this.f56758o = (ab0) C5220ia.m25469a(ab0Var);
        this.f56760p = false;
        this.f56762q = f2;
        this.f56764r = C5752sm.m28322j();
        this.f56766s = new C5752sm(0);
        this.f56768t = new C5752sm(2);
        C5394le c5394le = new C5394le();
        this.f56770u = c5394le;
        this.f56772v = new j61<>();
        this.f56774w = new ArrayList<>();
        this.f56776x = new MediaCodec.BufferInfo();
        this.f56725I = 1.0f;
        this.f56726J = 1.0f;
        this.f56724H = -9223372036854775807L;
        this.f56778y = new long[10];
        this.f56780z = new long[10];
        this.f56712A = new long[10];
        this.f56717C0 = -9223372036854775807L;
        this.f56719D0 = -9223372036854775807L;
        c5394le.m28323e(0);
        c5394le.f54757c.order(ByteOrder.nativeOrder());
        this.f56731O = -1.0f;
        this.f56735S = 0;
        this.f56759o0 = 0;
        this.f56748f0 = -1;
        this.f56749g0 = -1;
        this.f56747e0 = -9223372036854775807L;
        this.f56771u0 = -9223372036854775807L;
        this.f56773v0 = -9223372036854775807L;
        this.f56761p0 = 0;
        this.f56763q0 = 0;
    }

    @TargetApi
    /* renamed from: K */
    private void m29882K() throws C5043es {
        int i2 = this.f56763q0;
        if (i2 == 1) {
            try {
                this.f56727K.flush();
                return;
            } finally {
            }
        }
        if (i2 == 2) {
            try {
                this.f56727K.flush();
                mo24066N();
                m29883Q();
                return;
            } finally {
            }
        }
        if (i2 != 3) {
            this.f56777x0 = true;
            mo28535M();
        } else {
            m29903L();
            m29902I();
        }
    }

    @RequiresApi
    /* renamed from: Q */
    private void m29883Q() throws C5043es {
        try {
            this.f56722F.setMediaDrmSession(m29884a(this.f56720E).f55893b);
            m29888b(this.f56720E);
            this.f56761p0 = 0;
            this.f56763q0 = 0;
        } catch (MediaCryptoException e2) {
            throw m24561a(e2, this.f56714B, 6006);
        }
    }

    /* renamed from: b */
    private void m29888b(@Nullable InterfaceC4718e interfaceC4718e) {
        InterfaceC4718e interfaceC4718e2 = this.f56718D;
        if (interfaceC4718e2 != interfaceC4718e) {
            if (interfaceC4718e != null) {
                interfaceC4718e.mo22110b(null);
            }
            if (interfaceC4718e2 != null) {
                interfaceC4718e2.mo22106a((InterfaceC4719f.a) null);
            }
        }
        this.f56718D = interfaceC4718e;
    }

    /* renamed from: c */
    private boolean m29890c(long j2, long j3) throws C5043es {
        boolean z;
        boolean z2;
        boolean mo24081a;
        int mo24016a;
        boolean z3;
        if (!(this.f56749g0 >= 0)) {
            if (this.f56740X && this.f56767s0) {
                try {
                    mo24016a = this.f56727K.mo24016a(this.f56776x);
                } catch (IllegalStateException unused) {
                    m29882K();
                    if (this.f56777x0) {
                        m29903L();
                    }
                    return false;
                }
            } else {
                mo24016a = this.f56727K.mo24016a(this.f56776x);
            }
            if (mo24016a < 0) {
                if (mo24016a != -2) {
                    if (this.f56745c0 && (this.f56775w0 || this.f56761p0 == 2)) {
                        m29882K();
                    }
                    return false;
                }
                this.f56769t0 = true;
                MediaFormat mo24026b = this.f56727K.mo24026b();
                if (this.f56735S != 0 && mo24026b.getInteger("width") == 32 && mo24026b.getInteger("height") == 32) {
                    this.f56744b0 = true;
                } else {
                    if (this.f56742Z) {
                        mo24026b.setInteger("channel-count", 1);
                    }
                    this.f56729M = mo24026b;
                    this.f56730N = true;
                }
                return true;
            }
            if (this.f56744b0) {
                this.f56744b0 = false;
                this.f56727K.mo24025a(false, mo24016a);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f56776x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m29882K();
                return false;
            }
            this.f56749g0 = mo24016a;
            ByteBuffer mo24029c = this.f56727K.mo24029c(mo24016a);
            this.f56750h0 = mo24029c;
            if (mo24029c != null) {
                mo24029c.position(this.f56776x.offset);
                ByteBuffer byteBuffer = this.f56750h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f56776x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f56741Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f56776x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j4 = this.f56771u0;
                    if (j4 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j4;
                    }
                }
            }
            long j5 = this.f56776x.presentationTimeUs;
            int size = this.f56774w.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = false;
                    break;
                }
                if (this.f56774w.get(i2).longValue() == j5) {
                    this.f56774w.remove(i2);
                    z3 = true;
                    break;
                }
                i2++;
            }
            this.f56751i0 = z3;
            long j6 = this.f56773v0;
            long j7 = this.f56776x.presentationTimeUs;
            this.f56752j0 = j6 == j7;
            m29907d(j7);
        }
        if (this.f56740X && this.f56767s0) {
            try {
                sa0 sa0Var = this.f56727K;
                ByteBuffer byteBuffer2 = this.f56750h0;
                int i3 = this.f56749g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f56776x;
                z2 = false;
                z = true;
                try {
                    mo24081a = mo24081a(j2, j3, sa0Var, byteBuffer2, i3, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f56751i0, this.f56752j0, this.f56716C);
                } catch (IllegalStateException unused2) {
                    m29882K();
                    if (this.f56777x0) {
                        m29903L();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            sa0 sa0Var2 = this.f56727K;
            ByteBuffer byteBuffer3 = this.f56750h0;
            int i4 = this.f56749g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f56776x;
            mo24081a = mo24081a(j2, j3, sa0Var2, byteBuffer3, i4, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f56751i0, this.f56752j0, this.f56716C);
        }
        if (mo24081a) {
            mo24084c(this.f56776x.presentationTimeUs);
            boolean z4 = (this.f56776x.flags & 4) != 0;
            this.f56749g0 = -1;
            this.f56750h0 = null;
            if (!z4) {
                return z;
            }
            m29882K();
        }
        return z2;
    }

    @TargetApi
    /* renamed from: y */
    private boolean m29893y() throws C5043es {
        if (this.f56765r0) {
            this.f56761p0 = 1;
            if (this.f56737U || this.f56739W) {
                this.f56763q0 = 3;
                return false;
            }
            this.f56763q0 = 2;
        } else {
            m29883Q();
        }
        return true;
    }

    /* renamed from: z */
    private boolean m29894z() throws C5043es {
        int i2;
        int i3;
        sa0 sa0Var = this.f56727K;
        if (sa0Var == null || this.f56761p0 == 2 || this.f56775w0) {
            return false;
        }
        if (this.f56748f0 < 0) {
            int mo24028c = sa0Var.mo24028c();
            this.f56748f0 = mo24028c;
            if (mo24028c < 0) {
                return false;
            }
            this.f56766s.f54757c = this.f56727K.mo24027b(mo24028c);
            this.f56766s.mo22727b();
        }
        if (this.f56761p0 == 1) {
            if (!this.f56745c0) {
                this.f56767s0 = true;
                this.f56727K.mo24019a(this.f56748f0, 0, 0L, 4);
                this.f56748f0 = -1;
                this.f56766s.f54757c = null;
            }
            this.f56761p0 = 2;
            return false;
        }
        if (this.f56743a0) {
            this.f56743a0 = false;
            ByteBuffer byteBuffer = this.f56766s.f54757c;
            byte[] bArr = f56711G0;
            byteBuffer.put(bArr);
            this.f56727K.mo24019a(this.f56748f0, bArr.length, 0L, 0);
            this.f56748f0 = -1;
            this.f56766s.f54757c = null;
            this.f56765r0 = true;
            return true;
        }
        if (this.f56759o0 == 1) {
            for (int i4 = 0; i4 < this.f56728L.f53822n.size(); i4++) {
                this.f56766s.f54757c.put(this.f56728L.f53822n.get(i4));
            }
            this.f56759o0 = 2;
        }
        int position = this.f56766s.f54757c.position();
        C5658qv m24564q = m24564q();
        try {
            int m24559a = m24559a(m24564q, this.f56766s, 0);
            if (mo23526e()) {
                this.f56773v0 = this.f56771u0;
            }
            if (m24559a == -3) {
                return false;
            }
            if (m24559a == -5) {
                if (this.f56759o0 == 2) {
                    this.f56766s.mo22727b();
                    this.f56759o0 = 1;
                }
                mo24070a(m24564q);
                return true;
            }
            if (this.f56766s.m26638f()) {
                if (this.f56759o0 == 2) {
                    this.f56766s.mo22727b();
                    this.f56759o0 = 1;
                }
                this.f56775w0 = true;
                if (!this.f56765r0) {
                    m29882K();
                    return false;
                }
                try {
                    if (!this.f56745c0) {
                        this.f56767s0 = true;
                        this.f56727K.mo24019a(this.f56748f0, 0, 0L, 4);
                        this.f56748f0 = -1;
                        this.f56766s.f54757c = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    C5606pv c5606pv = this.f56714B;
                    int errorCode = e2.getErrorCode();
                    int i5 = s91.f54530a;
                    if (errorCode != 2 && errorCode != 4) {
                        if (errorCode != 10) {
                            if (errorCode != 7) {
                                if (errorCode != 8) {
                                    switch (errorCode) {
                                        case 15:
                                            break;
                                        case 16:
                                        case 18:
                                            break;
                                        case 17:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                    i3 = 6002;
                                                    break;
                                                default:
                                                    i3 = 6006;
                                                    break;
                                            }
                                    }
                                    throw m24561a(e2, c5606pv, i3);
                                }
                                i3 = 6003;
                                throw m24561a(e2, c5606pv, i3);
                            }
                        }
                        i3 = 6004;
                        throw m24561a(e2, c5606pv, i3);
                    }
                    i3 = 6005;
                    throw m24561a(e2, c5606pv, i3);
                }
            }
            if (!this.f56765r0 && !this.f56766s.m26639g()) {
                this.f56766s.mo22727b();
                if (this.f56759o0 == 2) {
                    this.f56759o0 = 1;
                }
                return true;
            }
            boolean m28325i = this.f56766s.m28325i();
            if (m28325i) {
                this.f56766s.f54756b.m27944a(position);
            }
            if (this.f56736T && !m28325i) {
                ByteBuffer byteBuffer2 = this.f56766s.f54757c;
                byte[] bArr2 = ch0.f49243a;
                int position2 = byteBuffer2.position();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    int i8 = i6 + 1;
                    if (i8 >= position2) {
                        byteBuffer2.clear();
                        break;
                    }
                    int i9 = byteBuffer2.get(i6) & 255;
                    if (i7 == 3) {
                        if (i9 == 1 && (byteBuffer2.get(i8) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer2.duplicate();
                            duplicate.position(i6 - 3);
                            duplicate.limit(position2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(duplicate);
                            break;
                        }
                    } else if (i9 == 0) {
                        i7++;
                    }
                    if (i9 != 0) {
                        i7 = 0;
                    }
                    i6 = i8;
                }
                if (this.f56766s.f54757c.position() == 0) {
                    return true;
                }
                this.f56736T = false;
            }
            C5752sm c5752sm = this.f56766s;
            long j2 = c5752sm.f54759e;
            C5858uf c5858uf = this.f56746d0;
            if (c5858uf != null) {
                j2 = c5858uf.m28988a(this.f56714B, c5752sm);
                this.f56771u0 = Math.max(this.f56771u0, this.f56746d0.m28987a(this.f56714B));
            }
            if (this.f56766s.m26637e()) {
                this.f56774w.add(Long.valueOf(j2));
            }
            if (this.f56779y0) {
                this.f56772v.m25808a(this.f56714B, j2);
                this.f56779y0 = false;
            }
            this.f56771u0 = Math.max(this.f56771u0, j2);
            this.f56766s.m28324h();
            if (this.f56766s.m26636d()) {
                mo24076a(this.f56766s);
            }
            mo24083b(this.f56766s);
            try {
                if (m28325i) {
                    this.f56727K.mo24021a(this.f56748f0, this.f56766s.f54756b, j2);
                } else {
                    this.f56727K.mo24019a(this.f56748f0, this.f56766s.f54757c.limit(), j2, 0);
                }
                this.f56748f0 = -1;
                this.f56766s.f54757c = null;
                this.f56765r0 = true;
                this.f56759o0 = 0;
                this.f56715B0.f54078c++;
                return true;
            } catch (MediaCodec.CryptoException e3) {
                C5606pv c5606pv2 = this.f56714B;
                int errorCode2 = e3.getErrorCode();
                int i10 = s91.f54530a;
                if (errorCode2 != 2 && errorCode2 != 4) {
                    if (errorCode2 != 10) {
                        if (errorCode2 != 7) {
                            if (errorCode2 != 8) {
                                switch (errorCode2) {
                                    case 15:
                                        break;
                                    case 16:
                                    case 18:
                                        break;
                                    case 17:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                        break;
                                    default:
                                        switch (errorCode2) {
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case 28:
                                                i2 = 6002;
                                                break;
                                            default:
                                                i2 = 6006;
                                                break;
                                        }
                                }
                                throw m24561a(e3, c5606pv2, i2);
                            }
                            i2 = 6003;
                            throw m24561a(e3, c5606pv2, i2);
                        }
                    }
                    i2 = 6004;
                    throw m24561a(e3, c5606pv2, i2);
                }
                i2 = 6005;
                throw m24561a(e3, c5606pv2, i2);
            }
        } catch (C5752sm.a e4) {
            mo24077a(e4);
            m29892d(0);
            try {
                this.f56727K.flush();
                return true;
            } finally {
                mo24066N();
            }
        }
    }

    /* renamed from: A */
    public final void m29895A() throws C5043es {
        if (m29896B()) {
            m29902I();
        }
    }

    /* renamed from: B */
    public final boolean m29896B() {
        if (this.f56727K == null) {
            return false;
        }
        int i2 = this.f56763q0;
        if (i2 == 3 || this.f56737U || ((this.f56738V && !this.f56769t0) || (this.f56739W && this.f56767s0))) {
            m29903L();
            return true;
        }
        if (i2 == 2) {
            int i3 = s91.f54530a;
            C5220ia.m25476b(i3 >= 23);
            if (i3 >= 23) {
                try {
                    m29883Q();
                } catch (C5043es e2) {
                    d90.m23840b("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    m29903L();
                    return true;
                }
            }
        }
        try {
            this.f56727K.flush();
            return false;
        } finally {
            mo24066N();
        }
    }

    @Nullable
    /* renamed from: C */
    public final sa0 m29897C() {
        return this.f56727K;
    }

    @Nullable
    /* renamed from: D */
    public final wa0 m29898D() {
        return this.f56734R;
    }

    /* renamed from: E */
    public boolean mo24064E() {
        return false;
    }

    @Nullable
    /* renamed from: F */
    public final MediaFormat m29899F() {
        return this.f56729M;
    }

    /* renamed from: G */
    public final long m29900G() {
        return this.f56719D0;
    }

    /* renamed from: H */
    public final float m29901H() {
        return this.f56725I;
    }

    /* renamed from: I */
    public final void m29902I() throws C5043es {
        C5606pv c5606pv;
        if (this.f56727K != null || this.f56753k0 || (c5606pv = this.f56714B) == null) {
            return;
        }
        boolean z = false;
        if (this.f56720E == null && mo28537b(c5606pv)) {
            C5606pv c5606pv2 = this.f56714B;
            this.f56755m0 = false;
            this.f56770u.mo22727b();
            this.f56768t.mo22727b();
            this.f56754l0 = false;
            this.f56753k0 = false;
            String str = c5606pv2.f53820l;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f56770u.m26435f(32);
            } else {
                this.f56770u.m26435f(1);
            }
            this.f56753k0 = true;
            return;
        }
        m29888b(this.f56720E);
        String str2 = this.f56714B.f53820l;
        InterfaceC4718e interfaceC4718e = this.f56718D;
        if (interfaceC4718e != null) {
            if (this.f56722F == null) {
                C5942vv m29884a = m29884a(interfaceC4718e);
                if (m29884a != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(m29884a.f55892a, m29884a.f55893b);
                        this.f56722F = mediaCrypto;
                        if (!m29884a.f55894c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                            z = true;
                        }
                        this.f56723G = z;
                    } catch (MediaCryptoException e2) {
                        throw m24561a(e2, this.f56714B, 6006);
                    }
                } else if (this.f56718D.mo22115g() == null) {
                    return;
                }
            }
            if (C5942vv.f55891d) {
                int mo22111c = this.f56718D.mo22111c();
                if (mo22111c == 1) {
                    InterfaceC4718e.a mo22115g = this.f56718D.mo22115g();
                    Objects.requireNonNull(mo22115g);
                    throw m24561a(mo22115g, this.f56714B, mo22115g.f48019a);
                }
                if (mo22111c != 4) {
                    return;
                }
            }
        }
        try {
            m29886a(this.f56722F, this.f56723G);
        } catch (C6068b e3) {
            throw m24561a(e3, this.f56714B, 4001);
        }
    }

    /* renamed from: J */
    public abstract void mo24065J();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public final void m29903L() {
        try {
            sa0 sa0Var = this.f56727K;
            if (sa0Var != null) {
                sa0Var.release();
                this.f56715B0.f54077b++;
                mo24078a(this.f56734R.f56065a);
            }
            this.f56727K = null;
            try {
                MediaCrypto mediaCrypto = this.f56722F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f56727K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f56722F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: M */
    public void mo28535M() throws C5043es {
    }

    @CallSuper
    /* renamed from: N */
    public void mo24066N() {
        this.f56748f0 = -1;
        this.f56766s.f54757c = null;
        this.f56749g0 = -1;
        this.f56750h0 = null;
        this.f56747e0 = -9223372036854775807L;
        this.f56767s0 = false;
        this.f56765r0 = false;
        this.f56743a0 = false;
        this.f56744b0 = false;
        this.f56751i0 = false;
        this.f56752j0 = false;
        this.f56774w.clear();
        this.f56771u0 = -9223372036854775807L;
        this.f56773v0 = -9223372036854775807L;
        C5858uf c5858uf = this.f56746d0;
        if (c5858uf != null) {
            c5858uf.m28989a();
        }
        this.f56761p0 = 0;
        this.f56763q0 = 0;
        this.f56759o0 = this.f56757n0 ? 1 : 0;
    }

    @CallSuper
    /* renamed from: O */
    public final void m29904O() {
        mo24066N();
        this.f56713A0 = null;
        this.f56746d0 = null;
        this.f56732P = null;
        this.f56734R = null;
        this.f56728L = null;
        this.f56729M = null;
        this.f56730N = false;
        this.f56769t0 = false;
        this.f56731O = -1.0f;
        this.f56735S = 0;
        this.f56736T = false;
        this.f56737U = false;
        this.f56738V = false;
        this.f56739W = false;
        this.f56740X = false;
        this.f56741Y = false;
        this.f56742Z = false;
        this.f56745c0 = false;
        this.f56757n0 = false;
        this.f56759o0 = 0;
        this.f56723G = false;
    }

    /* renamed from: P */
    public final void m29905P() {
        this.f56781z0 = true;
    }

    /* renamed from: a */
    public abstract float mo24067a(float f2, C5606pv[] c5606pvArr);

    /* renamed from: a */
    public abstract int mo24068a(ab0 ab0Var, C5606pv c5606pv) throws bb0.C4851b;

    @Override // com.yandex.mobile.ads.impl.dv0
    /* renamed from: a */
    public final int mo22243a(C5606pv c5606pv) throws C5043es {
        try {
            return mo24068a(this.f56758o, c5606pv);
        } catch (bb0.C4851b e2) {
            throw m24561a(e2, c5606pv, 4002);
        }
    }

    /* renamed from: a */
    public abstract sa0.C5734a mo24069a(wa0 wa0Var, C5606pv c5606pv, @Nullable MediaCrypto mediaCrypto, float f2);

    /* renamed from: a */
    public abstract C5873um mo24071a(wa0 wa0Var, C5606pv c5606pv, C5606pv c5606pv2);

    /* renamed from: a */
    public abstract ArrayList mo24073a(ab0 ab0Var, C5606pv c5606pv, boolean z) throws bb0.C4851b;

    /* renamed from: a */
    public abstract void mo24075a(C5606pv c5606pv, @Nullable MediaFormat mediaFormat) throws C5043es;

    /* renamed from: a */
    public void mo24076a(C5752sm c5752sm) throws C5043es {
    }

    /* renamed from: a */
    public abstract void mo24077a(Exception exc);

    /* renamed from: a */
    public abstract void mo24078a(String str);

    /* renamed from: a */
    public abstract void mo24079a(String str, long j2, long j3);

    /* renamed from: a */
    public abstract boolean mo24081a(long j2, long j3, @Nullable sa0 sa0Var, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, C5606pv c5606pv) throws C5043es;

    /* renamed from: a */
    public boolean mo24082a(wa0 wa0Var) {
        return true;
    }

    /* renamed from: b */
    public abstract void mo24083b(C5752sm c5752sm) throws C5043es;

    /* renamed from: b */
    public boolean mo28537b(C5606pv c5606pv) {
        return false;
    }

    /* renamed from: d */
    public final void m29907d(long j2) throws C5043es {
        boolean z;
        C5606pv m25809b = this.f56772v.m25809b(j2);
        if (m25809b == null && this.f56730N) {
            m25809b = this.f56772v.m25810c();
        }
        if (m25809b != null) {
            this.f56716C = m25809b;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f56730N && this.f56716C != null)) {
            mo24075a(this.f56716C, this.f56729M);
            this.f56730N = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.dv0
    /* renamed from: f */
    public final int mo23944f() {
        return 8;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public void mo22249u() {
        this.f56714B = null;
        this.f56717C0 = -9223372036854775807L;
        this.f56719D0 = -9223372036854775807L;
        this.f56721E0 = 0;
        m29896B();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: v */
    public void mo24087v() {
        try {
            this.f56755m0 = false;
            this.f56770u.mo22727b();
            this.f56768t.mo22727b();
            this.f56754l0 = false;
            this.f56753k0 = false;
            m29903L();
            InterfaceC4718e interfaceC4718e = this.f56720E;
            if (interfaceC4718e != null) {
                interfaceC4718e.mo22106a((InterfaceC4719f.a) null);
            }
            this.f56720E = null;
        } catch (Throwable th) {
            InterfaceC4718e interfaceC4718e2 = this.f56720E;
            if (interfaceC4718e2 != null) {
                interfaceC4718e2.mo22106a((InterfaceC4719f.a) null);
            }
            this.f56720E = null;
            throw th;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ya0$b */
    public static class C6068b extends Exception {

        /* renamed from: a */
        public final String f56782a;

        /* renamed from: b */
        public final boolean f56783b;

        /* renamed from: c */
        @Nullable
        public final wa0 f56784c;

        /* renamed from: d */
        @Nullable
        public final String f56785d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6068b(com.yandex.mobile.ads.impl.C5606pv r10, @androidx.annotation.Nullable java.lang.Exception r11, boolean r12, com.yandex.mobile.ads.impl.wa0 r13) {
            /*
                r9 = this;
                java.lang.String r0 = "Decoder init failed: "
                java.lang.StringBuilder r0 = com.yandex.mobile.ads.impl.l60.m26356a(r0)
                java.lang.String r1 = r13.f56065a
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r10.f53820l
                int r10 = com.yandex.mobile.ads.impl.s91.f54530a
                r0 = 21
                if (r10 < r0) goto L24
                java.lang.String r10 = m29911a(r11)
                goto L25
            L24:
                r10 = 0
            L25:
                r8 = r10
                r2 = r9
                r4 = r11
                r6 = r12
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ya0.C6068b.<init>(com.yandex.mobile.ads.impl.pv, java.lang.Exception, boolean, com.yandex.mobile.ads.impl.wa0):void");
        }

        /* renamed from: a */
        public static C6068b m29909a(C6068b c6068b) {
            return new C6068b(c6068b.getMessage(), c6068b.getCause(), c6068b.f56782a, c6068b.f56783b, c6068b.f56784c, c6068b.f56785d);
        }

        @Nullable
        @RequiresApi
        /* renamed from: a */
        private static String m29911a(@Nullable Exception exc) {
            if (exc instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
            }
            return null;
        }

        public C6068b(int i2, C5606pv c5606pv, @Nullable bb0.C4851b c4851b, boolean z) {
            this("Decoder init failed: [" + i2 + "], " + c5606pv, c4851b, c5606pv.f53820l, z, null, m29910a(i2));
        }

        /* renamed from: a */
        private static String m29910a(int i2) {
            StringBuilder m27x = C0000a.m27x("com.yandex.mobile.ads.exoplayer2.mediacodec.MediaCodecRenderer_", i2 < 0 ? "neg_" : "");
            m27x.append(Math.abs(i2));
            return m27x.toString();
        }

        private C6068b(String str, @Nullable Throwable th, String str2, boolean z, @Nullable wa0 wa0Var, @Nullable String str3) {
            super(str, th);
            this.f56782a = str2;
            this.f56783b = z;
            this.f56784c = wa0Var;
            this.f56785d = str3;
        }
    }

    /* renamed from: a */
    public final void m29906a(C5043es c5043es) {
        this.f56713A0 = c5043es;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public void mo24080a(boolean z, boolean z2) throws C5043es {
        this.f56715B0 = new C5647qm();
    }

    /* renamed from: b */
    private boolean m29889b(long j2, long j3) throws C5043es {
        C5220ia.m25476b(!this.f56777x0);
        if (this.f56770u.m26438m()) {
            C5394le c5394le = this.f56770u;
            ByteBuffer byteBuffer = c5394le.f54757c;
            int i2 = this.f56749g0;
            int m26437l = c5394le.m26437l();
            C5394le c5394le2 = this.f56770u;
            if (!mo24081a(j2, j3, null, byteBuffer, i2, 0, m26437l, c5394le2.f54759e, c5394le2.m26637e(), this.f56770u.m26638f(), this.f56716C)) {
                return false;
            }
            mo24084c(this.f56770u.m26436k());
            this.f56770u.mo22727b();
        }
        if (this.f56775w0) {
            this.f56777x0 = true;
            return false;
        }
        if (this.f56754l0) {
            C5220ia.m25476b(this.f56770u.m26434a(this.f56768t));
            this.f56754l0 = false;
        }
        if (this.f56755m0) {
            if (this.f56770u.m26438m()) {
                return true;
            }
            this.f56755m0 = false;
            this.f56770u.mo22727b();
            this.f56768t.mo22727b();
            this.f56754l0 = false;
            this.f56753k0 = false;
            this.f56755m0 = false;
            m29902I();
            if (!this.f56753k0) {
                return false;
            }
        }
        C5220ia.m25476b(!this.f56775w0);
        C5658qv m24564q = m24564q();
        this.f56768t.mo22727b();
        while (true) {
            this.f56768t.mo22727b();
            int m24559a = m24559a(m24564q, this.f56768t, 0);
            if (m24559a == -5) {
                mo24070a(m24564q);
                break;
            }
            if (m24559a != -4) {
                if (m24559a != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f56768t.m26638f()) {
                    this.f56775w0 = true;
                    break;
                }
                if (this.f56779y0) {
                    C5606pv c5606pv = this.f56714B;
                    Objects.requireNonNull(c5606pv);
                    this.f56716C = c5606pv;
                    mo24075a(c5606pv, (MediaFormat) null);
                    this.f56779y0 = false;
                }
                this.f56768t.m28324h();
                if (!this.f56770u.m26434a(this.f56768t)) {
                    this.f56754l0 = true;
                    break;
                }
            }
        }
        if (this.f56770u.m26438m()) {
            this.f56770u.m28324h();
        }
        return this.f56770u.m26438m() || this.f56775w0 || this.f56755m0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22246a(C5606pv[] c5606pvArr, long j2, long j3) throws C5043es {
        if (this.f56719D0 == -9223372036854775807L) {
            C5220ia.m25476b(this.f56717C0 == -9223372036854775807L);
            this.f56717C0 = j2;
            this.f56719D0 = j3;
            return;
        }
        int i2 = this.f56721E0;
        if (i2 == this.f56780z.length) {
            StringBuilder m26356a = l60.m26356a("Too many stream changes, so dropping offset: ");
            m26356a.append(this.f56780z[this.f56721E0 - 1]);
            d90.m23842d("MediaCodecRenderer", m26356a.toString());
        } else {
            this.f56721E0 = i2 + 1;
        }
        long[] jArr = this.f56778y;
        int i3 = this.f56721E0 - 1;
        jArr[i3] = j2;
        this.f56780z[i3] = j3;
        this.f56712A[i3] = this.f56771u0;
    }

    /* renamed from: d */
    private boolean m29892d(int i2) throws C5043es {
        C5658qv m24564q = m24564q();
        this.f56764r.mo22727b();
        int m24559a = m24559a(m24564q, this.f56764r, i2 | 4);
        if (m24559a == -5) {
            mo24070a(m24564q);
            return true;
        }
        if (m24559a != -4 || !this.f56764r.m26638f()) {
            return false;
        }
        this.f56775w0 = true;
        m29882K();
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public boolean mo22248d() {
        if (this.f56714B != null) {
            if (m24567t()) {
                return true;
            }
            if (this.f56749g0 >= 0) {
                return true;
            }
            if (this.f56747e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f56747e0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public void mo22245a(long j2, boolean z) throws C5043es {
        this.f56775w0 = false;
        this.f56777x0 = false;
        this.f56781z0 = false;
        if (this.f56753k0) {
            this.f56770u.mo22727b();
            this.f56768t.mo22727b();
            this.f56754l0 = false;
        } else {
            m29895A();
        }
        if (this.f56772v.m25811d() > 0) {
            this.f56779y0 = true;
        }
        this.f56772v.m25807a();
        int i2 = this.f56721E0;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.f56719D0 = this.f56780z[i3];
            this.f56717C0 = this.f56778y[i3];
            this.f56721E0 = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe, com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public void mo23519a(float f2, float f3) throws C5043es {
        this.f56725I = f2;
        this.f56726J = f3;
        m29891c(this.f56728L);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0069 A[LOOP:1: B:33:0x0047->B:42:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[EDGE_INSN: B:43:0x006a->B:44:? BREAK  A[LOOP:1: B:33:0x0047->B:42:0x0069], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[LOOP:2: B:45:0x006a->B:54:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EDGE_INSN: B:55:0x0088->B:56:0x0088 BREAK  A[LOOP:2: B:45:0x006a->B:54:0x0087], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22244a(long r12, long r14) throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ya0.mo22244a(long, long):void");
    }

    @CallSuper
    /* renamed from: c */
    public void mo24084c(long j2) {
        while (true) {
            int i2 = this.f56721E0;
            if (i2 == 0 || j2 < this.f56712A[0]) {
                return;
            }
            long[] jArr = this.f56778y;
            this.f56717C0 = jArr[0];
            this.f56719D0 = this.f56780z[0];
            int i3 = i2 - 1;
            this.f56721E0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.f56780z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f56721E0);
            long[] jArr3 = this.f56712A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f56721E0);
            mo24065J();
        }
    }

    /* renamed from: c */
    private boolean m29891c(C5606pv c5606pv) throws C5043es {
        if (s91.f54530a >= 23 && this.f56727K != null && this.f56763q0 != 3 && mo23525c() != 0) {
            float mo24067a = mo24067a(this.f56726J, m24566s());
            float f2 = this.f56731O;
            if (f2 == mo24067a) {
                return true;
            }
            if (mo24067a == -1.0f) {
                if (this.f56765r0) {
                    this.f56761p0 = 1;
                    this.f56763q0 = 3;
                    return false;
                }
                m29903L();
                m29902I();
                return false;
            }
            if (f2 == -1.0f && mo24067a <= this.f56762q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo24067a);
            this.f56727K.mo24022a(bundle);
            this.f56731O = mo24067a;
        }
        return true;
    }

    /* renamed from: a */
    public va0 mo24072a(IllegalStateException illegalStateException, @Nullable wa0 wa0Var) {
        return new va0(illegalStateException, wa0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29886a(android.media.MediaCrypto r8, boolean r9) throws com.yandex.mobile.ads.impl.ya0.C6068b {
        /*
            r7 = this;
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r0 = r7.f56732P
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.m29885a(r9)     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            r2.<init>()     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            r7.f56732P = r2     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            boolean r3 = r7.f56760p     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r2 = r7.f56732P     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            com.yandex.mobile.ads.impl.wa0 r0 = (com.yandex.mobile.ads.impl.wa0) r0     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            r2.add(r0)     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
        L2a:
            r7.f56733Q = r1     // Catch: com.yandex.mobile.ads.impl.bb0.C4851b -> L2d
            goto L39
        L2d:
            r8 = move-exception
            com.yandex.mobile.ads.impl.ya0$b r0 = new com.yandex.mobile.ads.impl.ya0$b
            com.yandex.mobile.ads.impl.pv r1 = r7.f56714B
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r2, r1, r8, r9)
            throw r0
        L39:
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r0 = r7.f56732P
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r0 = r7.f56732P
            java.lang.Object r0 = r0.peekFirst()
            com.yandex.mobile.ads.impl.wa0 r0 = (com.yandex.mobile.ads.impl.wa0) r0
        L49:
            com.yandex.mobile.ads.impl.sa0 r2 = r7.f56727K
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r2 = r7.f56732P
            java.lang.Object r2 = r2.peekFirst()
            com.yandex.mobile.ads.impl.wa0 r2 = (com.yandex.mobile.ads.impl.wa0) r2
            boolean r3 = r7.mo24082a(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.m29887a(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.yandex.mobile.ads.impl.d90.m23842d(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.m29887a(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.yandex.mobile.ads.impl.d90.m23840b(r4, r5, r3)
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r4 = r7.f56732P
            r4.removeFirst()
            com.yandex.mobile.ads.impl.ya0$b r4 = new com.yandex.mobile.ads.impl.ya0$b
            com.yandex.mobile.ads.impl.pv r5 = r7.f56714B
            r4.<init>(r5, r3, r9, r2)
            r7.mo24077a(r4)
            com.yandex.mobile.ads.impl.ya0$b r2 = r7.f56733Q
            if (r2 != 0) goto L9f
            r7.f56733Q = r4
            goto La5
        L9f:
            com.yandex.mobile.ads.impl.ya0$b r2 = com.yandex.mobile.ads.impl.ya0.C6068b.m29909a(r2)
            r7.f56733Q = r2
        La5:
            java.util.ArrayDeque<com.yandex.mobile.ads.impl.wa0> r2 = r7.f56732P
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            com.yandex.mobile.ads.impl.ya0$b r8 = r7.f56733Q
            throw r8
        Lb1:
            r7.f56732P = r1
            return
        Lb4:
            com.yandex.mobile.ads.impl.ya0$b r8 = new com.yandex.mobile.ads.impl.ya0$b
            com.yandex.mobile.ads.impl.pv r0 = r7.f56714B
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r2, r0, r1, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ya0.m29886a(android.media.MediaCrypto, boolean):void");
    }

    /* renamed from: a */
    private List<wa0> m29885a(boolean z) throws bb0.C4851b {
        ArrayList mo24073a = mo24073a(this.f56758o, this.f56714B, z);
        if (mo24073a.isEmpty() && z) {
            mo24073a = mo24073a(this.f56758o, this.f56714B, false);
            if (!mo24073a.isEmpty()) {
                StringBuilder m26356a = l60.m26356a("Drm session requires secure decoder for ");
                m26356a.append(this.f56714B.f53820l);
                m26356a.append(", but no secure decoder available. Trying to proceed with ");
                m26356a.append(mo24073a);
                m26356a.append(".");
                d90.m23842d("MediaCodecRenderer", m26356a.toString());
            }
        }
        return mo24073a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0267, code lost:
    
        if (r1.m30080B().equals(r4) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x018d, code lost:
    
        if (r4.m30090L().equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01a1, code lost:
    
        if (r4.m30117z().equals(r2) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
    
        if (r16.m30113v().equals(r2) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
    
        if (r16.m30107p().equals(r2) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ab  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m29887a(com.yandex.mobile.ads.impl.wa0 r18, android.media.MediaCrypto r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ya0.m29887a(com.yandex.mobile.ads.impl.wa0, android.media.MediaCrypto):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x012d, code lost:
    
        if (r0 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r12 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (m29893y() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012f, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0101, code lost:
    
        if (m29893y() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0115, code lost:
    
        if (m29893y() == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.mobile.ads.impl.C5873um mo24070a(com.yandex.mobile.ads.impl.C5658qv r12) throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ya0.mo24070a(com.yandex.mobile.ads.impl.qv):com.yandex.mobile.ads.impl.um");
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public boolean mo22247a() {
        return this.f56777x0;
    }

    @Nullable
    /* renamed from: a */
    private C5942vv m29884a(InterfaceC4718e interfaceC4718e) throws C5043es {
        InterfaceC5646ql mo22116h = interfaceC4718e.mo22116h();
        if (mo22116h != null && !(mo22116h instanceof C5942vv)) {
            throw m24561a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + mo22116h), this.f56714B, 6001);
        }
        return (C5942vv) mo22116h;
    }
}
