package com.google.android.exoplayer2.video;

import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.drm.C0996b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {

    /* renamed from: A */
    public long f14766A;

    /* renamed from: B */
    public long f14767B;

    /* renamed from: C */
    public boolean f14768C;

    /* renamed from: D */
    public boolean f14769D;

    /* renamed from: E */
    @Nullable
    public VideoSize f14770E;

    /* renamed from: F */
    public int f14771F;

    /* renamed from: G */
    public int f14772G;

    /* renamed from: H */
    public int f14773H;

    /* renamed from: I */
    public DecoderCounters f14774I;

    /* renamed from: m */
    public Format f14775m;

    /* renamed from: n */
    @Nullable
    public Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> f14776n;

    /* renamed from: o */
    public DecoderInputBuffer f14777o;

    /* renamed from: p */
    public VideoDecoderOutputBuffer f14778p;

    /* renamed from: q */
    public int f14779q;

    /* renamed from: r */
    @Nullable
    public Object f14780r;

    /* renamed from: s */
    @Nullable
    public Surface f14781s;

    /* renamed from: t */
    @Nullable
    public VideoDecoderOutputBufferRenderer f14782t;

    /* renamed from: u */
    @Nullable
    public VideoFrameMetadataListener f14783u;

    /* renamed from: v */
    @Nullable
    public DrmSession f14784v;

    /* renamed from: w */
    @Nullable
    public DrmSession f14785w;

    /* renamed from: x */
    public int f14786x;

    /* renamed from: y */
    public boolean f14787y;

    /* renamed from: z */
    public boolean f14788z;

    /* renamed from: N */
    public static boolean m7767N(long j2) {
        return j2 < -30000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5651B() {
        /*
            r2 = this;
            r0 = 0
            r2.f14775m = r0
            r2.f14770E = r0
            r1 = 0
            r2.f14788z = r1
            com.google.android.exoplayer2.drm.DrmSession r1 = r2.f14785w     // Catch: java.lang.Throwable -> L13
            com.google.android.exoplayer2.drm.C0996b.m6331b(r1, r0)     // Catch: java.lang.Throwable -> L13
            r2.f14785w = r0     // Catch: java.lang.Throwable -> L13
            r2.m7774Q()     // Catch: java.lang.Throwable -> L13
            throw r0
        L13:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DecoderVideoRenderer.mo5651B():void");
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
        this.f14774I = new DecoderCounters();
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
        this.f14769D = false;
        this.f14788z = false;
        this.f14766A = -9223372036854775807L;
        this.f14772G = 0;
        if (this.f14776n != null) {
            m7771M();
        }
        if (z) {
            this.f14767B = -9223372036854775807L;
        } else {
            this.f14767B = -9223372036854775807L;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: F */
    public void mo5655F() {
        this.f14771F = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: G */
    public void mo5656G() {
        this.f14767B = -9223372036854775807L;
        if (this.f14771F <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) throws ExoPlaybackException {
    }

    /* renamed from: J */
    public abstract Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> m7768J(Format format, @Nullable CryptoConfig cryptoConfig) throws DecoderException;

    /* renamed from: K */
    public final boolean m7769K(long j2, long j3) throws ExoPlaybackException, DecoderException {
        if (this.f14778p == null) {
            VideoDecoderOutputBuffer mo6245b = this.f14776n.mo6245b();
            this.f14778p = mo6245b;
            if (mo6245b == null) {
                return false;
            }
            DecoderCounters decoderCounters = this.f14774I;
            int i2 = decoderCounters.f10598f;
            int i3 = mo6245b.f10612d;
            decoderCounters.f10598f = i2 + i3;
            this.f14773H -= i3;
        }
        if (this.f14778p.m6242j()) {
            if (this.f14786x != 2) {
                Objects.requireNonNull(this.f14778p);
                throw null;
            }
            m7774Q();
            m7772O();
            return false;
        }
        if (this.f14766A == -9223372036854775807L) {
            this.f14766A = j2;
        }
        long j4 = this.f14778p.f10611c - j2;
        if (this.f14779q != -1) {
            throw null;
        }
        if (!m7767N(j4)) {
            return false;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f14778p;
        this.f14774I.f10598f++;
        Objects.requireNonNull(videoDecoderOutputBuffer);
        throw null;
    }

    /* renamed from: L */
    public final boolean m7770L() throws DecoderException, ExoPlaybackException {
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.f14776n;
        if (decoder == null || this.f14786x == 2 || this.f14769D) {
            return false;
        }
        if (this.f14777o == null) {
            DecoderInputBuffer mo6246c = decoder.mo6246c();
            this.f14777o = mo6246c;
            if (mo6246c == null) {
                return false;
            }
        }
        if (this.f14786x == 1) {
            DecoderInputBuffer decoderInputBuffer = this.f14777o;
            decoderInputBuffer.f10580b = 4;
            this.f14776n.mo6247d(decoderInputBuffer);
            this.f14777o = null;
            this.f14786x = 2;
            return false;
        }
        FormatHolder m5678z = m5678z();
        int m5658I = m5658I(m5678z, this.f14777o, 0);
        if (m5658I == -5) {
            m7773P(m5678z);
            throw null;
        }
        if (m5658I != -4) {
            if (m5658I == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f14777o.m6242j()) {
            this.f14769D = true;
            this.f14776n.mo6247d(this.f14777o);
            this.f14777o = null;
            return false;
        }
        if (this.f14768C) {
            long j2 = this.f14777o.f10607f;
            throw null;
        }
        this.f14777o.m6251o();
        Objects.requireNonNull(this.f14777o);
        this.f14776n.mo6247d(this.f14777o);
        this.f14773H++;
        this.f14787y = true;
        this.f14774I.f10595c++;
        this.f14777o = null;
        return true;
    }

    @CallSuper
    /* renamed from: M */
    public void m7771M() throws ExoPlaybackException {
        this.f14773H = 0;
        if (this.f14786x != 0) {
            m7774Q();
            m7772O();
            return;
        }
        this.f14777o = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f14778p;
        if (videoDecoderOutputBuffer != null) {
            Objects.requireNonNull(videoDecoderOutputBuffer);
            throw null;
        }
        this.f14776n.flush();
        this.f14787y = false;
    }

    /* renamed from: O */
    public final void m7772O() throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        if (this.f14776n != null) {
            return;
        }
        DrmSession drmSession = this.f14785w;
        C0996b.m6331b(this.f14784v, drmSession);
        this.f14784v = drmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.mo6268g();
            if (cryptoConfig == null && this.f14784v.mo6267f() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f14776n = m7768J(this.f14775m, cryptoConfig);
            m7775R(this.f14779q);
            SystemClock.elapsedRealtime();
            this.f14776n.getName();
            throw null;
        } catch (DecoderException e2) {
            Log.m7585b("DecoderVideoRenderer", "Video codec error", e2);
            throw null;
        } catch (OutOfMemoryError e3) {
            throw m5677y(e3, this.f14775m, false, 4001);
        }
    }

    @CallSuper
    /* renamed from: P */
    public void m7773P(FormatHolder formatHolder) throws ExoPlaybackException {
        this.f14768C = true;
        Format format = formatHolder.f9704b;
        Objects.requireNonNull(format);
        DrmSession drmSession = formatHolder.f9703a;
        C0996b.m6331b(this.f14785w, drmSession);
        this.f14785w = drmSession;
        Format format2 = this.f14775m;
        this.f14775m = format;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.f14776n;
        if (decoder == null) {
            m7772O();
            throw null;
        }
        if ((drmSession != this.f14784v ? new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 128) : new DecoderReuseEvaluation(decoder.getName(), format2, format, 0, 1)).f10616d != 0) {
            throw null;
        }
        if (this.f14787y) {
            this.f14786x = 1;
            throw null;
        }
        m7774Q();
        m7772O();
        throw null;
    }

    @CallSuper
    /* renamed from: Q */
    public void m7774Q() {
        this.f14777o = null;
        this.f14778p = null;
        this.f14786x = 0;
        this.f14787y = false;
        this.f14773H = 0;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.f14776n;
        if (decoder == null) {
            C0996b.m6331b(this.f14784v, null);
            this.f14784v = null;
        } else {
            this.f14774I.f10594b++;
            decoder.release();
            this.f14776n.getName();
            throw null;
        }
    }

    /* renamed from: R */
    public abstract void m7775R(int i2);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if ((r9.f14779q != -1) == false) goto L15;
     */
    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo5905b() {
        /*
            r9 = this;
            com.google.android.exoplayer2.Format r0 = r9.f14775m
            r1 = 0
            r2 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L26
            boolean r0 = r9.m5650A()
            if (r0 != 0) goto L15
            com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer r0 = r9.f14778p
            if (r0 == 0) goto L26
        L15:
            boolean r0 = r9.f14788z
            if (r0 != 0) goto L23
            int r0 = r9.f14779q
            r5 = -1
            if (r0 == r5) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L26
        L23:
            r9.f14767B = r3
            return r2
        L26:
            long r5 = r9.f14767B
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L2d
            return r1
        L2d:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r9.f14767B
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L38
            return r2
        L38:
            r9.f14767B = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DecoderVideoRenderer.mo5905b():boolean");
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return false;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    public void mo5938p(long j2, long j3) throws ExoPlaybackException {
        if (this.f14775m == null) {
            m5678z();
            throw null;
        }
        m7772O();
        if (this.f14776n != null) {
            try {
                TraceUtil.m7696a("drainAndFeed");
                m7769K(j2, j3);
                while (m7770L()) {
                }
                TraceUtil.m7697b();
                synchronized (this.f14774I) {
                }
            } catch (DecoderException e2) {
                Log.m7585b("DecoderVideoRenderer", "Video codec error", e2);
                throw null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
        if (i2 != 1) {
            if (i2 == 7) {
                this.f14783u = (VideoFrameMetadataListener) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f14781s = (Surface) obj;
            this.f14782t = null;
            this.f14779q = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.f14781s = null;
            this.f14782t = (VideoDecoderOutputBufferRenderer) obj;
            this.f14779q = 0;
        } else {
            this.f14781s = null;
            this.f14782t = null;
            this.f14779q = -1;
            obj = null;
        }
        if (this.f14780r == obj) {
            if (obj != null) {
                if (this.f14770E != null) {
                    throw null;
                }
                if (this.f14788z) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.f14780r = obj;
        if (obj == null) {
            this.f14770E = null;
            this.f14788z = false;
            return;
        }
        if (this.f14776n != null) {
            m7775R(this.f14779q);
        }
        if (this.f14770E != null) {
            throw null;
        }
        this.f14788z = false;
        if (this.f9447f == 2) {
            this.f14767B = -9223372036854775807L;
        }
    }
}
