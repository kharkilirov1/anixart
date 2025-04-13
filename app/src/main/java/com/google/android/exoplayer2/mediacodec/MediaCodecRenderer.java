package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.C0996b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.FrameworkCryptoConfig;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {

    /* renamed from: E0 */
    public static final byte[] f11887E0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    @Nullable
    public Format f11888A;

    /* renamed from: A0 */
    public DecoderCounters f11889A0;

    /* renamed from: B */
    @Nullable
    public Format f11890B;

    /* renamed from: B0 */
    public long f11891B0;

    /* renamed from: C */
    @Nullable
    public DrmSession f11892C;

    /* renamed from: C0 */
    public long f11893C0;

    /* renamed from: D */
    @Nullable
    public DrmSession f11894D;

    /* renamed from: D0 */
    public int f11895D0;

    /* renamed from: E */
    @Nullable
    public MediaCrypto f11896E;

    /* renamed from: F */
    public boolean f11897F;

    /* renamed from: G */
    public long f11898G;

    /* renamed from: H */
    public float f11899H;

    /* renamed from: I */
    public float f11900I;

    /* renamed from: J */
    @Nullable
    public MediaCodecAdapter f11901J;

    /* renamed from: K */
    @Nullable
    public Format f11902K;

    /* renamed from: L */
    @Nullable
    public MediaFormat f11903L;

    /* renamed from: M */
    public boolean f11904M;

    /* renamed from: N */
    public float f11905N;

    /* renamed from: O */
    @Nullable
    public ArrayDeque<MediaCodecInfo> f11906O;

    /* renamed from: P */
    @Nullable
    public DecoderInitializationException f11907P;

    /* renamed from: Q */
    @Nullable
    public MediaCodecInfo f11908Q;

    /* renamed from: R */
    public int f11909R;

    /* renamed from: S */
    public boolean f11910S;

    /* renamed from: T */
    public boolean f11911T;

    /* renamed from: U */
    public boolean f11912U;

    /* renamed from: V */
    public boolean f11913V;

    /* renamed from: W */
    public boolean f11914W;

    /* renamed from: X */
    public boolean f11915X;

    /* renamed from: Y */
    public boolean f11916Y;

    /* renamed from: Z */
    public boolean f11917Z;

    /* renamed from: a0 */
    public boolean f11918a0;

    /* renamed from: b0 */
    public boolean f11919b0;

    /* renamed from: c0 */
    @Nullable
    public C2Mp3TimestampTracker f11920c0;

    /* renamed from: d0 */
    public long f11921d0;

    /* renamed from: e0 */
    public int f11922e0;

    /* renamed from: f0 */
    public int f11923f0;

    /* renamed from: g0 */
    @Nullable
    public ByteBuffer f11924g0;

    /* renamed from: h0 */
    public boolean f11925h0;

    /* renamed from: i0 */
    public boolean f11926i0;

    /* renamed from: j0 */
    public boolean f11927j0;

    /* renamed from: k0 */
    public boolean f11928k0;

    /* renamed from: l0 */
    public boolean f11929l0;

    /* renamed from: m */
    public final MediaCodecAdapter.Factory f11930m;

    /* renamed from: m0 */
    public boolean f11931m0;

    /* renamed from: n */
    public final MediaCodecSelector f11932n;

    /* renamed from: n0 */
    public int f11933n0;

    /* renamed from: o */
    public final boolean f11934o;

    /* renamed from: o0 */
    public int f11935o0;

    /* renamed from: p */
    public final float f11936p;

    /* renamed from: p0 */
    public int f11937p0;

    /* renamed from: q */
    public final DecoderInputBuffer f11938q;

    /* renamed from: q0 */
    public boolean f11939q0;

    /* renamed from: r */
    public final DecoderInputBuffer f11940r;

    /* renamed from: r0 */
    public boolean f11941r0;

    /* renamed from: s */
    public final DecoderInputBuffer f11942s;

    /* renamed from: s0 */
    public boolean f11943s0;

    /* renamed from: t */
    public final BatchBuffer f11944t;

    /* renamed from: t0 */
    public long f11945t0;

    /* renamed from: u */
    public final TimedValueQueue<Format> f11946u;

    /* renamed from: u0 */
    public long f11947u0;

    /* renamed from: v */
    public final ArrayList<Long> f11948v;

    /* renamed from: v0 */
    public boolean f11949v0;

    /* renamed from: w */
    public final MediaCodec.BufferInfo f11950w;

    /* renamed from: w0 */
    public boolean f11951w0;

    /* renamed from: x */
    public final long[] f11952x;

    /* renamed from: x0 */
    public boolean f11953x0;

    /* renamed from: y */
    public final long[] f11954y;

    /* renamed from: y0 */
    public boolean f11955y0;

    /* renamed from: z */
    public final long[] f11956z;

    /* renamed from: z0 */
    @Nullable
    public ExoPlaybackException f11957z0;

    public MediaCodecRenderer(int i2, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, float f2) {
        super(i2);
        this.f11930m = factory;
        Objects.requireNonNull(mediaCodecSelector);
        this.f11932n = mediaCodecSelector;
        this.f11934o = z;
        this.f11936p = f2;
        this.f11938q = new DecoderInputBuffer(0);
        this.f11940r = new DecoderInputBuffer(0);
        this.f11942s = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.f11944t = batchBuffer;
        this.f11946u = new TimedValueQueue<>();
        this.f11948v = new ArrayList<>();
        this.f11950w = new MediaCodec.BufferInfo();
        this.f11899H = 1.0f;
        this.f11900I = 1.0f;
        this.f11898G = -9223372036854775807L;
        this.f11952x = new long[10];
        this.f11954y = new long[10];
        this.f11956z = new long[10];
        this.f11891B0 = -9223372036854775807L;
        this.f11893C0 = -9223372036854775807L;
        batchBuffer.m6250n(0);
        batchBuffer.f10605d.order(ByteOrder.nativeOrder());
        this.f11905N = -1.0f;
        this.f11909R = 0;
        this.f11933n0 = 0;
        this.f11922e0 = -1;
        this.f11923f0 = -1;
        this.f11921d0 = -9223372036854775807L;
        this.f11945t0 = -9223372036854775807L;
        this.f11947u0 = -9223372036854775807L;
        this.f11935o0 = 0;
        this.f11937p0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* renamed from: Q */
    private boolean m6647Q() throws ExoPlaybackException {
        MediaCodecAdapter mediaCodecAdapter = this.f11901J;
        boolean z = 0;
        if (mediaCodecAdapter == null || this.f11935o0 == 2 || this.f11949v0) {
            return false;
        }
        if (this.f11922e0 < 0) {
            int mo6611f = mediaCodecAdapter.mo6611f();
            this.f11922e0 = mo6611f;
            if (mo6611f < 0) {
                return false;
            }
            this.f11940r.f10605d = this.f11901J.mo6616k(mo6611f);
            this.f11940r.mo6248l();
        }
        if (this.f11935o0 == 1) {
            if (!this.f11919b0) {
                this.f11941r0 = true;
                this.f11901J.mo6618m(this.f11922e0, 0, 0, 0L, 4);
                m6672s0();
            }
            this.f11935o0 = 2;
            return false;
        }
        if (this.f11917Z) {
            this.f11917Z = false;
            ByteBuffer byteBuffer = this.f11940r.f10605d;
            byte[] bArr = f11887E0;
            byteBuffer.put(bArr);
            this.f11901J.mo6618m(this.f11922e0, 0, bArr.length, 0L, 0);
            m6672s0();
            this.f11939q0 = true;
            return true;
        }
        if (this.f11933n0 == 1) {
            for (int i2 = 0; i2 < this.f11902K.f9661o.size(); i2++) {
                this.f11940r.f10605d.put(this.f11902K.f9661o.get(i2));
            }
            this.f11933n0 = 2;
        }
        int position = this.f11940r.f10605d.position();
        FormatHolder m5678z = m5678z();
        try {
            int m5658I = m5658I(m5678z, this.f11940r, 0);
            if (mo5662h()) {
                this.f11947u0 = this.f11945t0;
            }
            if (m5658I == -3) {
                return false;
            }
            if (m5658I == -5) {
                if (this.f11933n0 == 2) {
                    this.f11940r.mo6248l();
                    this.f11933n0 = 1;
                }
                mo6213g0(m5678z);
                return true;
            }
            if (this.f11940r.m6242j()) {
                if (this.f11933n0 == 2) {
                    this.f11940r.mo6248l();
                    this.f11933n0 = 1;
                }
                this.f11949v0 = true;
                if (!this.f11939q0) {
                    m6648l0();
                    return false;
                }
                try {
                    if (!this.f11919b0) {
                        this.f11941r0 = true;
                        this.f11901J.mo6618m(this.f11922e0, 0, 0, 0L, 4);
                        m6672s0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw m5677y(e2, this.f11888A, false, Util.m7754w(e2.getErrorCode()));
                }
            }
            if (!this.f11939q0 && !this.f11940r.m6243k()) {
                this.f11940r.mo6248l();
                if (this.f11933n0 == 2) {
                    this.f11933n0 = 1;
                }
                return true;
            }
            boolean m6252p = this.f11940r.m6252p();
            if (m6252p) {
                CryptoInfo cryptoInfo = this.f11940r.f10604c;
                Objects.requireNonNull(cryptoInfo);
                if (position != 0) {
                    if (cryptoInfo.f10584d == null) {
                        int[] iArr = new int[1];
                        cryptoInfo.f10584d = iArr;
                        cryptoInfo.f10589i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = cryptoInfo.f10584d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f11910S && !m6252p) {
                ByteBuffer byteBuffer2 = this.f11940r.f10605d;
                byte[] bArr2 = NalUnitUtil.f14658a;
                int position2 = byteBuffer2.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= position2) {
                        byteBuffer2.clear();
                        break;
                    }
                    int i6 = byteBuffer2.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1 && (byteBuffer2.get(i5) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer2.duplicate();
                            duplicate.position(i3 - 3);
                            duplicate.limit(position2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(duplicate);
                            break;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (this.f11940r.f10605d.position() == 0) {
                    return true;
                }
                this.f11910S = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f11940r;
            long j2 = decoderInputBuffer.f10607f;
            C2Mp3TimestampTracker c2Mp3TimestampTracker = this.f11920c0;
            if (c2Mp3TimestampTracker != null) {
                Format format = this.f11888A;
                if (c2Mp3TimestampTracker.f11866b == 0) {
                    c2Mp3TimestampTracker.f11865a = j2;
                }
                if (!c2Mp3TimestampTracker.f11867c) {
                    ByteBuffer byteBuffer3 = decoderInputBuffer.f10605d;
                    Objects.requireNonNull(byteBuffer3);
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        i7 = (i7 << 8) | (byteBuffer3.get(i8) & 255);
                    }
                    int m6224d = MpegAudioUtil.m6224d(i7);
                    if (m6224d == -1) {
                        c2Mp3TimestampTracker.f11867c = true;
                        c2Mp3TimestampTracker.f11866b = 0L;
                        c2Mp3TimestampTracker.f11865a = decoderInputBuffer.f10607f;
                        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j2 = decoderInputBuffer.f10607f;
                    } else {
                        long m6634a = c2Mp3TimestampTracker.m6634a(format.f9641A);
                        c2Mp3TimestampTracker.f11866b += m6224d;
                        j2 = m6634a;
                    }
                }
                long j3 = this.f11945t0;
                C2Mp3TimestampTracker c2Mp3TimestampTracker2 = this.f11920c0;
                Format format2 = this.f11888A;
                Objects.requireNonNull(c2Mp3TimestampTracker2);
                this.f11945t0 = Math.max(j3, c2Mp3TimestampTracker2.m6634a(format2.f9641A));
            }
            long j4 = j2;
            if (this.f11940r.m6241i()) {
                this.f11948v.add(Long.valueOf(j4));
            }
            if (this.f11953x0) {
                this.f11946u.m7685a(j4, this.f11888A);
                this.f11953x0 = false;
            }
            this.f11945t0 = Math.max(this.f11945t0, j4);
            this.f11940r.m6251o();
            if (this.f11940r.m6240h()) {
                mo6663Z(this.f11940r);
            }
            mo6216k0(this.f11940r);
            try {
                if (m6252p) {
                    this.f11901J.mo6607b(this.f11922e0, 0, this.f11940r.f10604c, j4, 0);
                } else {
                    this.f11901J.mo6618m(this.f11922e0, 0, this.f11940r.f10605d.limit(), j4, 0);
                }
                m6672s0();
                this.f11939q0 = true;
                this.f11933n0 = 0;
                DecoderCounters decoderCounters = this.f11889A0;
                z = decoderCounters.f10595c + 1;
                decoderCounters.f10595c = z;
                return true;
            } catch (MediaCodec.CryptoException e3) {
                throw m5677y(e3, this.f11888A, z, Util.m7754w(e3.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e4) {
            mo6210d0(e4);
            m6668n0(0);
            m6658R();
            return true;
        }
    }

    @TargetApi
    /* renamed from: l0 */
    private void m6648l0() throws ExoPlaybackException {
        int i2 = this.f11937p0;
        if (i2 == 1) {
            m6658R();
            return;
        }
        if (i2 == 2) {
            m6658R();
            m6650A0();
        } else if (i2 != 3) {
            this.f11951w0 = true;
            mo6218p0();
        } else {
            m6669o0();
            m6665b0();
        }
    }

    /* renamed from: u0 */
    private void m6649u0(@Nullable DrmSession drmSession) {
        C0996b.m6331b(this.f11894D, drmSession);
        this.f11894D = drmSession;
    }

    @RequiresApi
    /* renamed from: A0 */
    public final void m6650A0() throws ExoPlaybackException {
        try {
            this.f11896E.setMediaDrmSession(m6662X(this.f11894D).f10732b);
            m6673t0(this.f11894D);
            this.f11935o0 = 0;
            this.f11937p0 = 0;
        } catch (MediaCryptoException e2) {
            throw m5677y(e2, this.f11888A, false, 6006);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f11888A = null;
        this.f11891B0 = -9223372036854775807L;
        this.f11893C0 = -9223372036854775807L;
        this.f11895D0 = 0;
        m6659S();
    }

    /* renamed from: B0 */
    public final void m6651B0(long j2) throws ExoPlaybackException {
        boolean z;
        Format m7690f;
        Format m7689e = this.f11946u.m7689e(j2);
        if (m7689e == null && this.f11904M) {
            TimedValueQueue<Format> timedValueQueue = this.f11946u;
            synchronized (timedValueQueue) {
                m7690f = timedValueQueue.f14731d == 0 ? null : timedValueQueue.m7690f();
            }
            m7689e = m7690f;
        }
        if (m7689e != null) {
            this.f11890B = m7689e;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f11904M && this.f11890B != null)) {
            mo6214h0(this.f11890B, this.f11903L);
            this.f11904M = false;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
        this.f11889A0 = new DecoderCounters();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
        int i2;
        this.f11949v0 = false;
        this.f11951w0 = false;
        this.f11955y0 = false;
        if (this.f11927j0) {
            this.f11944t.mo6248l();
            this.f11942s.mo6248l();
            this.f11928k0 = false;
        } else if (m6659S()) {
            m6665b0();
        }
        TimedValueQueue<Format> timedValueQueue = this.f11946u;
        synchronized (timedValueQueue) {
            i2 = timedValueQueue.f14731d;
        }
        if (i2 > 0) {
            this.f11953x0 = true;
        }
        this.f11946u.m7686b();
        int i3 = this.f11895D0;
        if (i3 != 0) {
            this.f11893C0 = this.f11954y[i3 - 1];
            this.f11891B0 = this.f11952x[i3 - 1];
            this.f11895D0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: E */
    public void mo5654E() {
        try {
            m6654M();
            m6669o0();
        } finally {
            m6649u0(null);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: F */
    public void mo5655F() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: G */
    public void mo5656G() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: H */
    public void mo5657H(Format[] formatArr, long j2, long j3) throws ExoPlaybackException {
        if (this.f11893C0 == -9223372036854775807L) {
            Assertions.m7516d(this.f11891B0 == -9223372036854775807L);
            this.f11891B0 = j2;
            this.f11893C0 = j3;
            return;
        }
        int i2 = this.f11895D0;
        long[] jArr = this.f11954y;
        if (i2 == jArr.length) {
            long j4 = jArr[i2 - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j4);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f11895D0 = i2 + 1;
        }
        long[] jArr2 = this.f11952x;
        int i3 = this.f11895D0;
        jArr2[i3 - 1] = j2;
        this.f11954y[i3 - 1] = j3;
        this.f11956z[i3 - 1] = this.f11945t0;
    }

    /* renamed from: J */
    public final boolean m6652J(long j2, long j3) throws ExoPlaybackException {
        Assertions.m7516d(!this.f11951w0);
        if (this.f11944t.m6633r()) {
            BatchBuffer batchBuffer = this.f11944t;
            if (!mo6217m0(j2, j3, null, batchBuffer.f10605d, this.f11923f0, 0, batchBuffer.f11863k, batchBuffer.f10607f, batchBuffer.m6241i(), this.f11944t.m6242j(), this.f11890B)) {
                return false;
            }
            mo6667i0(this.f11944t.f11862j);
            this.f11944t.mo6248l();
        }
        if (this.f11949v0) {
            this.f11951w0 = true;
            return false;
        }
        if (this.f11928k0) {
            Assertions.m7516d(this.f11944t.m6632q(this.f11942s));
            this.f11928k0 = false;
        }
        if (this.f11929l0) {
            if (this.f11944t.m6633r()) {
                return true;
            }
            m6654M();
            this.f11929l0 = false;
            m6665b0();
            if (!this.f11927j0) {
                return false;
            }
        }
        Assertions.m7516d(!this.f11949v0);
        FormatHolder m5678z = m5678z();
        this.f11942s.mo6248l();
        while (true) {
            this.f11942s.mo6248l();
            int m5658I = m5658I(m5678z, this.f11942s, 0);
            if (m5658I == -5) {
                mo6213g0(m5678z);
                break;
            }
            if (m5658I != -4) {
                if (m5658I != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f11942s.m6242j()) {
                    this.f11949v0 = true;
                    break;
                }
                if (this.f11953x0) {
                    Format format = this.f11888A;
                    Objects.requireNonNull(format);
                    this.f11890B = format;
                    mo6214h0(format, null);
                    this.f11953x0 = false;
                }
                this.f11942s.m6251o();
                if (!this.f11944t.m6632q(this.f11942s)) {
                    this.f11928k0 = true;
                    break;
                }
            }
        }
        if (this.f11944t.m6633r()) {
            this.f11944t.m6251o();
        }
        return this.f11944t.m6633r() || this.f11949v0 || this.f11929l0;
    }

    /* renamed from: K */
    public DecoderReuseEvaluation mo6206K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.f11880a, format, format2, 0, 1);
    }

    /* renamed from: L */
    public MediaCodecDecoderException mo6653L(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    /* renamed from: M */
    public final void m6654M() {
        this.f11929l0 = false;
        this.f11944t.mo6248l();
        this.f11942s.mo6248l();
        this.f11928k0 = false;
        this.f11927j0 = false;
    }

    /* renamed from: N */
    public final void m6655N() throws ExoPlaybackException {
        if (this.f11939q0) {
            this.f11935o0 = 1;
            this.f11937p0 = 3;
        } else {
            m6669o0();
            m6665b0();
        }
    }

    @TargetApi
    /* renamed from: O */
    public final boolean m6656O() throws ExoPlaybackException {
        if (this.f11939q0) {
            this.f11935o0 = 1;
            if (this.f11911T || this.f11913V) {
                this.f11937p0 = 3;
                return false;
            }
            this.f11937p0 = 2;
        } else {
            m6650A0();
        }
        return true;
    }

    /* renamed from: P */
    public final boolean m6657P(long j2, long j3) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean mo6217m0;
        int mo6612g;
        boolean z3;
        if (!(this.f11923f0 >= 0)) {
            if (this.f11914W && this.f11941r0) {
                try {
                    mo6612g = this.f11901J.mo6612g(this.f11950w);
                } catch (IllegalStateException unused) {
                    m6648l0();
                    if (this.f11951w0) {
                        m6669o0();
                    }
                    return false;
                }
            } else {
                mo6612g = this.f11901J.mo6612g(this.f11950w);
            }
            if (mo6612g < 0) {
                if (mo6612g != -2) {
                    if (this.f11919b0 && (this.f11949v0 || this.f11935o0 == 2)) {
                        m6648l0();
                    }
                    return false;
                }
                this.f11943s0 = true;
                MediaFormat mo6608c = this.f11901J.mo6608c();
                if (this.f11909R != 0 && mo6608c.getInteger("width") == 32 && mo6608c.getInteger("height") == 32) {
                    this.f11918a0 = true;
                } else {
                    if (this.f11916Y) {
                        mo6608c.setInteger("channel-count", 1);
                    }
                    this.f11903L = mo6608c;
                    this.f11904M = true;
                }
                return true;
            }
            if (this.f11918a0) {
                this.f11918a0 = false;
                this.f11901J.mo6614i(mo6612g, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f11950w;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m6648l0();
                return false;
            }
            this.f11923f0 = mo6612g;
            ByteBuffer mo6619n = this.f11901J.mo6619n(mo6612g);
            this.f11924g0 = mo6619n;
            if (mo6619n != null) {
                mo6619n.position(this.f11950w.offset);
                ByteBuffer byteBuffer = this.f11924g0;
                MediaCodec.BufferInfo bufferInfo2 = this.f11950w;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f11915X) {
                MediaCodec.BufferInfo bufferInfo3 = this.f11950w;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j4 = this.f11945t0;
                    if (j4 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j4;
                    }
                }
            }
            long j5 = this.f11950w.presentationTimeUs;
            int size = this.f11948v.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = false;
                    break;
                }
                if (this.f11948v.get(i2).longValue() == j5) {
                    this.f11948v.remove(i2);
                    z3 = true;
                    break;
                }
                i2++;
            }
            this.f11925h0 = z3;
            long j6 = this.f11947u0;
            long j7 = this.f11950w.presentationTimeUs;
            this.f11926i0 = j6 == j7;
            m6651B0(j7);
        }
        if (this.f11914W && this.f11941r0) {
            try {
                MediaCodecAdapter mediaCodecAdapter = this.f11901J;
                ByteBuffer byteBuffer2 = this.f11924g0;
                int i3 = this.f11923f0;
                MediaCodec.BufferInfo bufferInfo4 = this.f11950w;
                z2 = false;
                z = true;
                try {
                    mo6217m0 = mo6217m0(j2, j3, mediaCodecAdapter, byteBuffer2, i3, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f11925h0, this.f11926i0, this.f11890B);
                } catch (IllegalStateException unused2) {
                    m6648l0();
                    if (this.f11951w0) {
                        m6669o0();
                    }
                    return z2;
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
            }
        } else {
            z = true;
            z2 = false;
            MediaCodecAdapter mediaCodecAdapter2 = this.f11901J;
            ByteBuffer byteBuffer3 = this.f11924g0;
            int i4 = this.f11923f0;
            MediaCodec.BufferInfo bufferInfo5 = this.f11950w;
            mo6217m0 = mo6217m0(j2, j3, mediaCodecAdapter2, byteBuffer3, i4, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f11925h0, this.f11926i0, this.f11890B);
        }
        if (mo6217m0) {
            mo6667i0(this.f11950w.presentationTimeUs);
            boolean z4 = (this.f11950w.flags & 4) != 0;
            this.f11923f0 = -1;
            this.f11924g0 = null;
            if (!z4) {
                return z;
            }
            m6648l0();
        }
        return z2;
    }

    /* renamed from: R */
    public final void m6658R() {
        try {
            this.f11901J.flush();
        } finally {
            mo6670q0();
        }
    }

    /* renamed from: S */
    public boolean m6659S() {
        if (this.f11901J == null) {
            return false;
        }
        if (this.f11937p0 == 3 || this.f11911T || ((this.f11912U && !this.f11943s0) || (this.f11913V && this.f11941r0))) {
            m6669o0();
            return true;
        }
        m6658R();
        return false;
    }

    /* renamed from: T */
    public final List<MediaCodecInfo> m6660T(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> mo6208W = mo6208W(this.f11932n, this.f11888A, z);
        if (mo6208W.isEmpty() && z) {
            mo6208W = mo6208W(this.f11932n, this.f11888A, false);
            if (!mo6208W.isEmpty()) {
                String str = this.f11888A.f9659m;
                String valueOf = String.valueOf(mo6208W);
                StringBuilder m4122u = C0576a.m4122u(valueOf.length() + C0576a.m4106e(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                m4122u.append(".");
                Log.w("MediaCodecRenderer", m4122u.toString());
            }
        }
        return mo6208W;
    }

    /* renamed from: U */
    public boolean mo6661U() {
        return false;
    }

    /* renamed from: V */
    public float mo6207V(float f2, Format format, Format[] formatArr) {
        return -1.0f;
    }

    /* renamed from: W */
    public abstract List<MediaCodecInfo> mo6208W(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    /* renamed from: X */
    public final FrameworkCryptoConfig m6662X(DrmSession drmSession) throws ExoPlaybackException {
        CryptoConfig mo6268g = drmSession.mo6268g();
        if (mo6268g == null || (mo6268g instanceof FrameworkCryptoConfig)) {
            return (FrameworkCryptoConfig) mo6268g;
        }
        String valueOf = String.valueOf(mo6268g);
        throw m5677y(new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 43, "Expecting FrameworkCryptoConfig but found: ", valueOf)), this.f11888A, false, 6001);
    }

    /* renamed from: Y */
    public abstract MediaCodecAdapter.Configuration mo6209Y(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f2);

    /* renamed from: Z */
    public void mo6663Z(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo5904a(Format format) throws ExoPlaybackException {
        try {
            return mo6220y0(this.f11932n, format);
        } catch (MediaCodecUtil.DecoderQueryException e2) {
            throw m5676x(e2, format, 4002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x014c, code lost:
    
        if ("stvm8".equals(r4) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x015c, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r1) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022f  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6664a0(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.m6664a0(com.google.android.exoplayer2.mediacodec.MediaCodecInfo, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        if (this.f11888A == null) {
            return false;
        }
        if (!m5650A()) {
            if (!(this.f11923f0 >= 0) && (this.f11921d0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f11921d0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b0 */
    public final void m6665b0() throws ExoPlaybackException {
        Format format;
        if (this.f11901J != null || this.f11927j0 || (format = this.f11888A) == null) {
            return;
        }
        if (this.f11894D == null && mo6219x0(format)) {
            Format format2 = this.f11888A;
            m6654M();
            String str = format2.f9659m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                BatchBuffer batchBuffer = this.f11944t;
                Objects.requireNonNull(batchBuffer);
                batchBuffer.f11864l = 32;
            } else {
                BatchBuffer batchBuffer2 = this.f11944t;
                Objects.requireNonNull(batchBuffer2);
                batchBuffer2.f11864l = 1;
            }
            this.f11927j0 = true;
            return;
        }
        m6673t0(this.f11894D);
        String str2 = this.f11888A.f9659m;
        DrmSession drmSession = this.f11892C;
        if (drmSession != null) {
            if (this.f11896E == null) {
                FrameworkCryptoConfig m6662X = m6662X(drmSession);
                if (m6662X != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(m6662X.f10731a, m6662X.f10732b);
                        this.f11896E = mediaCrypto;
                        this.f11897F = !m6662X.f10733c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e2) {
                        throw m5677y(e2, this.f11888A, false, 6006);
                    }
                } else if (this.f11892C.mo6267f() == null) {
                    return;
                }
            }
            if (FrameworkCryptoConfig.f10730d) {
                int state = this.f11892C.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException mo6267f = this.f11892C.mo6267f();
                    Objects.requireNonNull(mo6267f);
                    throw m5677y(mo6267f, this.f11888A, false, mo6267f.f10717b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m6666c0(this.f11896E, this.f11897F);
        } catch (DecoderInitializationException e3) {
            throw m5677y(e3, this.f11888A, false, 4001);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return this.f11951w0;
    }

    /* renamed from: c0 */
    public final void m6666c0(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.f11906O == null) {
            try {
                List<MediaCodecInfo> m6660T = m6660T(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.f11906O = arrayDeque;
                if (this.f11934o) {
                    arrayDeque.addAll(m6660T);
                } else if (!m6660T.isEmpty()) {
                    this.f11906O.add(m6660T.get(0));
                }
                this.f11907P = null;
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                throw new DecoderInitializationException(this.f11888A, e2, z, -49998);
            }
        }
        if (this.f11906O.isEmpty()) {
            throw new DecoderInitializationException(this.f11888A, null, z, -49999);
        }
        while (this.f11901J == null) {
            MediaCodecInfo peekFirst = this.f11906O.peekFirst();
            if (!mo6675w0(peekFirst)) {
                return;
            }
            try {
                m6664a0(peekFirst, mediaCrypto);
            } catch (Exception e3) {
                String valueOf = String.valueOf(peekFirst);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Failed to initialize decoder: ");
                sb.append(valueOf);
                com.google.android.exoplayer2.util.Log.m7588e("MediaCodecRenderer", sb.toString(), e3);
                this.f11906O.removeFirst();
                Format format = this.f11888A;
                String str = peekFirst.f11880a;
                String valueOf2 = String.valueOf(format);
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(C1008a.m6437d(valueOf2.length() + C0576a.m4106e(str, 23), "Decoder init failed: ", str, ", ", valueOf2), e3, format.f9659m, z, peekFirst, (Util.f14736a < 21 || !(e3 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) e3).getDiagnosticInfo(), null);
                mo6210d0(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.f11907P;
                if (decoderInitializationException2 == null) {
                    this.f11907P = decoderInitializationException;
                } else {
                    this.f11907P = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.f11958b, decoderInitializationException2.f11959c, decoderInitializationException2.f11960d, decoderInitializationException2.f11961e, decoderInitializationException);
                }
                if (this.f11906O.isEmpty()) {
                    throw this.f11907P;
                }
            }
        }
        this.f11906O = null;
    }

    /* renamed from: d0 */
    public void mo6210d0(Exception exc) {
    }

    /* renamed from: e0 */
    public void mo6211e0(String str, long j2, long j3) {
    }

    /* renamed from: f0 */
    public void mo6212f0(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (m6656O() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ea, code lost:
    
        if (m6656O() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        if (m6656O() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (r0 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x006c, code lost:
    
        if (r5 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation mo6213g0(com.google.android.exoplayer2.FormatHolder r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo6213g0(com.google.android.exoplayer2.FormatHolder):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    /* renamed from: h0 */
    public void mo6214h0(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @CallSuper
    /* renamed from: i0 */
    public void mo6667i0(long j2) {
        while (true) {
            int i2 = this.f11895D0;
            if (i2 == 0 || j2 < this.f11956z[0]) {
                return;
            }
            long[] jArr = this.f11952x;
            this.f11891B0 = jArr[0];
            this.f11893C0 = this.f11954y[0];
            int i3 = i2 - 1;
            this.f11895D0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.f11954y;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f11895D0);
            long[] jArr3 = this.f11956z;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f11895D0);
            mo6215j0();
        }
    }

    /* renamed from: j0 */
    public void mo6215j0() {
    }

    /* renamed from: k0 */
    public void mo6216k0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    /* renamed from: m */
    public void mo5666m(float f2, float f3) throws ExoPlaybackException {
        this.f11899H = f2;
        this.f11900I = f3;
        m6676z0(this.f11902K);
    }

    /* renamed from: m0 */
    public abstract boolean mo6217m0(long j2, long j3, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* renamed from: n0 */
    public final boolean m6668n0(int i2) throws ExoPlaybackException {
        FormatHolder m5678z = m5678z();
        this.f11938q.mo6248l();
        int m5658I = m5658I(m5678z, this.f11938q, i2 | 4);
        if (m5658I == -5) {
            mo6213g0(m5678z);
            return true;
        }
        if (m5658I != -4 || !this.f11938q.m6242j()) {
            return false;
        }
        this.f11949v0 = true;
        m6648l0();
        return false;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: o */
    public final int mo5668o() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o0 */
    public void m6669o0() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.f11901J;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.f11889A0.f10594b++;
                mo6212f0(this.f11908Q.f11880a);
            }
            this.f11901J = null;
            try {
                MediaCrypto mediaCrypto = this.f11896E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f11901J = null;
            try {
                MediaCrypto mediaCrypto2 = this.f11896E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5938p(long r6, long r8) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo5938p(long, long):void");
    }

    /* renamed from: p0 */
    public void mo6218p0() throws ExoPlaybackException {
    }

    @CallSuper
    /* renamed from: q0 */
    public void mo6670q0() {
        m6672s0();
        this.f11923f0 = -1;
        this.f11924g0 = null;
        this.f11921d0 = -9223372036854775807L;
        this.f11941r0 = false;
        this.f11939q0 = false;
        this.f11917Z = false;
        this.f11918a0 = false;
        this.f11925h0 = false;
        this.f11926i0 = false;
        this.f11948v.clear();
        this.f11945t0 = -9223372036854775807L;
        this.f11947u0 = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker = this.f11920c0;
        if (c2Mp3TimestampTracker != null) {
            c2Mp3TimestampTracker.f11865a = 0L;
            c2Mp3TimestampTracker.f11866b = 0L;
            c2Mp3TimestampTracker.f11867c = false;
        }
        this.f11935o0 = 0;
        this.f11937p0 = 0;
        this.f11933n0 = this.f11931m0 ? 1 : 0;
    }

    @CallSuper
    /* renamed from: r0 */
    public void m6671r0() {
        mo6670q0();
        this.f11957z0 = null;
        this.f11920c0 = null;
        this.f11906O = null;
        this.f11908Q = null;
        this.f11902K = null;
        this.f11903L = null;
        this.f11904M = false;
        this.f11943s0 = false;
        this.f11905N = -1.0f;
        this.f11909R = 0;
        this.f11910S = false;
        this.f11911T = false;
        this.f11912U = false;
        this.f11913V = false;
        this.f11914W = false;
        this.f11915X = false;
        this.f11916Y = false;
        this.f11919b0 = false;
        this.f11931m0 = false;
        this.f11933n0 = 0;
        this.f11897F = false;
    }

    /* renamed from: s0 */
    public final void m6672s0() {
        this.f11922e0 = -1;
        this.f11940r.f10605d = null;
    }

    /* renamed from: t0 */
    public final void m6673t0(@Nullable DrmSession drmSession) {
        C0996b.m6331b(this.f11892C, drmSession);
        this.f11892C = drmSession;
    }

    /* renamed from: v0 */
    public final boolean m6674v0(long j2) {
        return this.f11898G == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.f11898G;
    }

    /* renamed from: w0 */
    public boolean mo6675w0(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    /* renamed from: x0 */
    public boolean mo6219x0(Format format) {
        return false;
    }

    /* renamed from: y0 */
    public abstract int mo6220y0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    /* renamed from: z0 */
    public final boolean m6676z0(Format format) throws ExoPlaybackException {
        if (Util.f14736a >= 23 && this.f11901J != null && this.f11937p0 != 3 && this.f9447f != 0) {
            float f2 = this.f11900I;
            Format[] formatArr = this.f9449h;
            Objects.requireNonNull(formatArr);
            float mo6207V = mo6207V(f2, format, formatArr);
            float f3 = this.f11905N;
            if (f3 == mo6207V) {
                return true;
            }
            if (mo6207V == -1.0f) {
                m6655N();
                return false;
            }
            if (f3 == -1.0f && mo6207V <= this.f11936p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo6207V);
            this.f11901J.mo6609d(bundle);
            this.f11905N = mo6207V;
        }
        return true;
    }

    public static class DecoderInitializationException extends Exception {

        /* renamed from: b */
        public final String f11958b;

        /* renamed from: c */
        public final boolean f11959c;

        /* renamed from: d */
        @Nullable
        public final MediaCodecInfo f11960d;

        /* renamed from: e */
        @Nullable
        public final String f11961e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, @androidx.annotation.Nullable java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f9659m
                if (r15 >= 0) goto L2a
                java.lang.String r12 = "neg_"
                goto L2c
            L2a:
                java.lang.String r12 = ""
            L2c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, int):void");
        }

        public DecoderInitializationException(String str, @Nullable Throwable th, String str2, boolean z, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.f11958b = str2;
            this.f11959c = z;
            this.f11960d = mediaCodecInfo;
            this.f11961e = str3;
        }
    }
}
