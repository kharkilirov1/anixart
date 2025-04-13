package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import androidx.core.view.inputmethod.C0273a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.C1035d;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {

    /* renamed from: o1 */
    public static final int[] f14817o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: p1 */
    public static boolean f14818p1;

    /* renamed from: q1 */
    public static boolean f14819q1;

    /* renamed from: F0 */
    public final Context f14820F0;

    /* renamed from: G0 */
    public final VideoFrameReleaseHelper f14821G0;

    /* renamed from: H0 */
    public final VideoRendererEventListener.EventDispatcher f14822H0;

    /* renamed from: I0 */
    public final long f14823I0;

    /* renamed from: J0 */
    public final int f14824J0;

    /* renamed from: K0 */
    public final boolean f14825K0;

    /* renamed from: L0 */
    public CodecMaxValues f14826L0;

    /* renamed from: M0 */
    public boolean f14827M0;

    /* renamed from: N0 */
    public boolean f14828N0;

    /* renamed from: O0 */
    @Nullable
    public Surface f14829O0;

    /* renamed from: P0 */
    @Nullable
    public DummySurface f14830P0;

    /* renamed from: Q0 */
    public boolean f14831Q0;

    /* renamed from: R0 */
    public int f14832R0;

    /* renamed from: S0 */
    public boolean f14833S0;

    /* renamed from: T0 */
    public boolean f14834T0;

    /* renamed from: U0 */
    public boolean f14835U0;

    /* renamed from: V0 */
    public long f14836V0;

    /* renamed from: W0 */
    public long f14837W0;

    /* renamed from: X0 */
    public long f14838X0;

    /* renamed from: Y0 */
    public int f14839Y0;

    /* renamed from: Z0 */
    public int f14840Z0;

    /* renamed from: a1 */
    public int f14841a1;

    /* renamed from: b1 */
    public long f14842b1;

    /* renamed from: c1 */
    public long f14843c1;

    /* renamed from: d1 */
    public long f14844d1;

    /* renamed from: e1 */
    public int f14845e1;

    /* renamed from: f1 */
    public int f14846f1;

    /* renamed from: g1 */
    public int f14847g1;

    /* renamed from: h1 */
    public int f14848h1;

    /* renamed from: i1 */
    public float f14849i1;

    /* renamed from: j1 */
    @Nullable
    public VideoSize f14850j1;

    /* renamed from: k1 */
    public boolean f14851k1;

    /* renamed from: l1 */
    public int f14852l1;

    /* renamed from: m1 */
    @Nullable
    public OnFrameRenderedListenerV23 f14853m1;

    /* renamed from: n1 */
    @Nullable
    public VideoFrameMetadataListener f14854n1;

    public static final class CodecMaxValues {

        /* renamed from: a */
        public final int f14855a;

        /* renamed from: b */
        public final int f14856b;

        /* renamed from: c */
        public final int f14857c;

        public CodecMaxValues(int i2, int i3, int i4) {
            this.f14855a = i2;
            this.f14856b = i3;
            this.f14857c = i4;
        }
    }

    @RequiresApi
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {

        /* renamed from: b */
        public final Handler f14858b;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler m7745n = Util.m7745n(this);
            this.f14858b = m7745n;
            mediaCodecAdapter.mo6613h(this, m7745n);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        /* renamed from: a */
        public void mo6637a(MediaCodecAdapter mediaCodecAdapter, long j2, long j3) {
            if (Util.f14736a >= 30) {
                m7807b(j2);
            } else {
                this.f14858b.sendMessageAtFrontOfQueue(Message.obtain(this.f14858b, 0, (int) (j2 >> 32), (int) j2));
            }
        }

        /* renamed from: b */
        public final void m7807b(long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.f14853m1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.f11955y0 = true;
                return;
            }
            try {
                mediaCodecVideoRenderer.m7798N0(j2);
            } catch (ExoPlaybackException e2) {
                MediaCodecVideoRenderer.this.f11957z0 = e2;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m7807b(Util.m7731b0(message.arg1, message.arg2));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j2, boolean z, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i2) {
        super(2, factory, mediaCodecSelector, z, 30.0f);
        this.f14823I0 = j2;
        this.f14824J0 = i2;
        Context applicationContext = context.getApplicationContext();
        this.f14820F0 = applicationContext;
        this.f14821G0 = new VideoFrameReleaseHelper(applicationContext);
        this.f14822H0 = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.f14825K0 = "NVIDIA".equals(Util.f14738c);
        this.f14837W0 = -9223372036854775807L;
        this.f14846f1 = -1;
        this.f14847g1 = -1;
        this.f14849i1 = -1.0f;
        this.f14832R0 = 1;
        this.f14852l1 = 0;
        this.f14850j1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x07cf, code lost:
    
        if (r0.equals("NX573J") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0831, code lost:
    
        if (r0.equals("AFTN") == false) goto L610;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7787E0() {
        /*
            Method dump skipped, instructions count: 3046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.m7787E0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: F0 */
    public static int m7788F0(MediaCodecInfo mediaCodecInfo, Format format) {
        char c2;
        int i2;
        int intValue;
        int i3 = format.f9664r;
        int i4 = format.f9665s;
        if (i3 == -1 || i4 == -1) {
            return -1;
        }
        String str = format.f9659m;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> m6679c = MediaCodecUtil.m6679c(format);
            str = (m6679c == null || !((intValue = ((Integer) m6679c.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        Objects.requireNonNull(str);
        int i5 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 == 3) {
                        String str2 = Util.f14739d;
                        if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.f14738c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.f11885f)))) {
                            return -1;
                        }
                        i2 = Util.m7738g(i4, 16) * Util.m7738g(i3, 16) * 16 * 16;
                        i5 = 2;
                        return (i2 * 3) / (i5 * 2);
                    }
                    if (c2 != 4) {
                        if (c2 != 5) {
                            return -1;
                        }
                    }
                }
            }
            i2 = i3 * i4;
            return (i2 * 3) / (i5 * 2);
        }
        i2 = i3 * i4;
        i5 = 2;
        return (i2 * 3) / (i5 * 2);
    }

    /* renamed from: G0 */
    public static List<MediaCodecInfo> m7789G0(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> m6679c;
        String str = format.f9659m;
        if (str == null) {
            return Collections.emptyList();
        }
        List<MediaCodecInfo> mo4128a = mediaCodecSelector.mo4128a(str, z, z2);
        Pattern pattern = MediaCodecUtil.f11962a;
        ArrayList arrayList = new ArrayList(mo4128a);
        MediaCodecUtil.m6686j(arrayList, new C1035d(format));
        if ("video/dolby-vision".equals(str) && (m6679c = MediaCodecUtil.m6679c(format)) != null) {
            int intValue = ((Integer) m6679c.first).intValue();
            if (intValue == 16 || intValue == 256) {
                arrayList.addAll(mediaCodecSelector.mo4128a("video/hevc", z, z2));
            } else if (intValue == 512) {
                arrayList.addAll(mediaCodecSelector.mo4128a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: H0 */
    public static int m7790H0(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.f9660n == -1) {
            return m7788F0(mediaCodecInfo, format);
        }
        int size = format.f9661o.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += format.f9661o.get(i3).length;
        }
        return format.f9660n + i2;
    }

    /* renamed from: I0 */
    public static boolean m7791I0(long j2) {
        return j2 < -30000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f14850j1 = null;
        m7792C0();
        this.f14831Q0 = false;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        VideoFrameReleaseHelper.DisplayHelper displayHelper = videoFrameReleaseHelper.f14874b;
        if (displayHelper != null) {
            displayHelper.mo7814b();
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.f14875c;
            Objects.requireNonNull(vSyncSampler);
            vSyncSampler.f14895c.sendEmptyMessage(2);
        }
        this.f14853m1 = null;
        try {
            super.mo5651B();
        } finally {
            this.f14822H0.m7816b(this.f11889A0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
        this.f11889A0 = new DecoderCounters();
        RendererConfiguration rendererConfiguration = this.f9445d;
        Objects.requireNonNull(rendererConfiguration);
        boolean z3 = rendererConfiguration.f9985a;
        Assertions.m7516d((z3 && this.f14852l1 == 0) ? false : true);
        if (this.f14851k1 != z3) {
            this.f14851k1 = z3;
            m6669o0();
        }
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14822H0;
        DecoderCounters decoderCounters = this.f11889A0;
        Handler handler = eventDispatcher.f14898a;
        if (handler != null) {
            handler.post(new RunnableC1179a(eventDispatcher, decoderCounters, 1));
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        if (videoFrameReleaseHelper.f14874b != null) {
            VideoFrameReleaseHelper.VSyncSampler vSyncSampler = videoFrameReleaseHelper.f14875c;
            Objects.requireNonNull(vSyncSampler);
            vSyncSampler.f14895c.sendEmptyMessage(1);
            videoFrameReleaseHelper.f14874b.mo7813a(new C0273a(videoFrameReleaseHelper, 8));
        }
        this.f14834T0 = z2;
        this.f14835U0 = false;
    }

    /* renamed from: C0 */
    public final void m7792C0() {
        MediaCodecAdapter mediaCodecAdapter;
        this.f14833S0 = false;
        if (Util.f14736a < 23 || !this.f14851k1 || (mediaCodecAdapter = this.f11901J) == null) {
            return;
        }
        this.f14853m1 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
        super.mo5653D(j2, z);
        m7792C0();
        this.f14821G0.m7809b();
        this.f14842b1 = -9223372036854775807L;
        this.f14836V0 = -9223372036854775807L;
        this.f14840Z0 = 0;
        if (z) {
            m7802R0();
        } else {
            this.f14837W0 = -9223372036854775807L;
        }
    }

    /* renamed from: D0 */
    public boolean m7793D0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!f14818p1) {
                f14819q1 = m7787E0();
                f14818p1 = true;
            }
        }
        return f14819q1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    @TargetApi
    /* renamed from: E */
    public void mo5654E() {
        try {
            super.mo5654E();
        } finally {
            if (this.f14830P0 != null) {
                m7799O0();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: F */
    public void mo5655F() {
        this.f14839Y0 = 0;
        this.f14838X0 = SystemClock.elapsedRealtime();
        this.f14843c1 = SystemClock.elapsedRealtime() * 1000;
        this.f14844d1 = 0L;
        this.f14845e1 = 0;
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        videoFrameReleaseHelper.f14876d = true;
        videoFrameReleaseHelper.m7809b();
        videoFrameReleaseHelper.m7811d(false);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: G */
    public void mo5656G() {
        this.f14837W0 = -9223372036854775807L;
        m7794J0();
        int i2 = this.f14845e1;
        if (i2 != 0) {
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14822H0;
            long j2 = this.f14844d1;
            Handler handler = eventDispatcher.f14898a;
            if (handler != null) {
                handler.post(new RunnableC1180b(eventDispatcher, j2, i2));
            }
            this.f14844d1 = 0L;
            this.f14845e1 = 0;
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        videoFrameReleaseHelper.f14876d = false;
        videoFrameReleaseHelper.m7808a();
    }

    /* renamed from: J0 */
    public final void m7794J0() {
        if (this.f14839Y0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f14838X0;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14822H0;
            int i2 = this.f14839Y0;
            Handler handler = eventDispatcher.f14898a;
            if (handler != null) {
                handler.post(new RunnableC1180b(eventDispatcher, i2, j2));
            }
            this.f14839Y0 = 0;
            this.f14838X0 = elapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: K */
    public DecoderReuseEvaluation mo6206K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation m6641c = mediaCodecInfo.m6641c(format, format2);
        int i2 = m6641c.f10617e;
        int i3 = format2.f9664r;
        CodecMaxValues codecMaxValues = this.f14826L0;
        if (i3 > codecMaxValues.f14855a || format2.f9665s > codecMaxValues.f14856b) {
            i2 |= 256;
        }
        if (m7790H0(mediaCodecInfo, format2) > this.f14826L0.f14857c) {
            i2 |= 64;
        }
        int i4 = i2;
        return new DecoderReuseEvaluation(mediaCodecInfo.f11880a, format, format2, i4 != 0 ? 0 : m6641c.f10616d, i4);
    }

    /* renamed from: K0 */
    public void m7795K0() {
        this.f14835U0 = true;
        if (this.f14833S0) {
            return;
        }
        this.f14833S0 = true;
        this.f14822H0.m7818d(this.f14829O0);
        this.f14831Q0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: L */
    public MediaCodecDecoderException mo6653L(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th, mediaCodecInfo, this.f14829O0);
    }

    /* renamed from: L0 */
    public final void m7796L0() {
        int i2 = this.f14846f1;
        if (i2 == -1 && this.f14847g1 == -1) {
            return;
        }
        VideoSize videoSize = this.f14850j1;
        if (videoSize != null && videoSize.f14901b == i2 && videoSize.f14902c == this.f14847g1 && videoSize.f14903d == this.f14848h1 && videoSize.f14904e == this.f14849i1) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(i2, this.f14847g1, this.f14848h1, this.f14849i1);
        this.f14850j1 = videoSize2;
        this.f14822H0.m7819e(videoSize2);
    }

    /* renamed from: M0 */
    public final void m7797M0(long j2, long j3, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.f14854n1;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.mo5978l(j2, j3, format, this.f11903L);
        }
    }

    /* renamed from: N0 */
    public void m7798N0(long j2) throws ExoPlaybackException {
        m6651B0(j2);
        m7796L0();
        this.f11889A0.f10597e++;
        m7795K0();
        super.mo6667i0(j2);
        if (this.f14851k1) {
            return;
        }
        this.f14841a1--;
    }

    @RequiresApi
    /* renamed from: O0 */
    public final void m7799O0() {
        Surface surface = this.f14829O0;
        DummySurface dummySurface = this.f14830P0;
        if (surface == dummySurface) {
            this.f14829O0 = null;
        }
        dummySurface.release();
        this.f14830P0 = null;
    }

    /* renamed from: P0 */
    public void m7800P0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        m7796L0();
        TraceUtil.m7696a("releaseOutputBuffer");
        mediaCodecAdapter.mo6614i(i2, true);
        TraceUtil.m7697b();
        this.f14843c1 = SystemClock.elapsedRealtime() * 1000;
        this.f11889A0.f10597e++;
        this.f14840Z0 = 0;
        m7795K0();
    }

    @RequiresApi
    /* renamed from: Q0 */
    public void m7801Q0(MediaCodecAdapter mediaCodecAdapter, int i2, long j2) {
        m7796L0();
        TraceUtil.m7696a("releaseOutputBuffer");
        mediaCodecAdapter.mo6610e(i2, j2);
        TraceUtil.m7697b();
        this.f14843c1 = SystemClock.elapsedRealtime() * 1000;
        this.f11889A0.f10597e++;
        this.f14840Z0 = 0;
        m7795K0();
    }

    /* renamed from: R0 */
    public final void m7802R0() {
        this.f14837W0 = this.f14823I0 > 0 ? SystemClock.elapsedRealtime() + this.f14823I0 : -9223372036854775807L;
    }

    /* renamed from: S0 */
    public final boolean m7803S0(MediaCodecInfo mediaCodecInfo) {
        return Util.f14736a >= 23 && !this.f14851k1 && !m7793D0(mediaCodecInfo.f11880a) && (!mediaCodecInfo.f11885f || DummySurface.m7778c(this.f14820F0));
    }

    /* renamed from: T0 */
    public void m7804T0(MediaCodecAdapter mediaCodecAdapter, int i2) {
        TraceUtil.m7696a("skipVideoBuffer");
        mediaCodecAdapter.mo6614i(i2, false);
        TraceUtil.m7697b();
        this.f11889A0.f10598f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: U */
    public boolean mo6661U() {
        return this.f14851k1 && Util.f14736a < 23;
    }

    /* renamed from: U0 */
    public void m7805U0(int i2) {
        DecoderCounters decoderCounters = this.f11889A0;
        decoderCounters.f10599g += i2;
        this.f14839Y0 += i2;
        int i3 = this.f14840Z0 + i2;
        this.f14840Z0 = i3;
        decoderCounters.f10600h = Math.max(i3, decoderCounters.f10600h);
        int i4 = this.f14824J0;
        if (i4 <= 0 || this.f14839Y0 < i4) {
            return;
        }
        m7794J0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: V */
    public float mo6207V(float f2, Format format, Format[] formatArr) {
        float f3 = -1.0f;
        for (Format format2 : formatArr) {
            float f4 = format2.f9666t;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    /* renamed from: V0 */
    public void m7806V0(long j2) {
        DecoderCounters decoderCounters = this.f11889A0;
        decoderCounters.f10602j += j2;
        decoderCounters.f10603k++;
        this.f14844d1 += j2;
        this.f14845e1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: W */
    public List<MediaCodecInfo> mo6208W(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return m7789G0(mediaCodecSelector, format, z, this.f14851k1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0114, code lost:
    
        if (r12 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0116, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0119, code lost:
    
        if (r12 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x011d, code lost:
    
        r1 = new android.graphics.Point(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x011c, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0118, code lost:
    
        r11 = r5;
     */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @android.annotation.TargetApi
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration mo6209Y(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r22, com.google.android.exoplayer2.Format r23, @androidx.annotation.Nullable android.media.MediaCrypto r24, float r25) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.mo6209Y(com.google.android.exoplayer2.mediacodec.MediaCodecInfo, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi
    /* renamed from: Z */
    public void mo6663Z(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f14828N0) {
            ByteBuffer byteBuffer = decoderInputBuffer.f10608g;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodecAdapter mediaCodecAdapter = this.f11901J;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    mediaCodecAdapter.mo6609d(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        DummySurface dummySurface;
        if (super.mo5905b() && (this.f14833S0 || (((dummySurface = this.f14830P0) != null && this.f14829O0 == dummySurface) || this.f11901J == null || this.f14851k1))) {
            this.f14837W0 = -9223372036854775807L;
            return true;
        }
        if (this.f14837W0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f14837W0) {
            return true;
        }
        this.f14837W0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: d0 */
    public void mo6210d0(Exception exc) {
        Log.m7585b("MediaCodecVideoRenderer", "Video codec error", exc);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14822H0;
        Handler handler = eventDispatcher.f14898a;
        if (handler != null) {
            handler.post(new RunnableC0207a(eventDispatcher, exc, 11));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: e0 */
    public void mo6211e0(String str, long j2, long j3) {
        this.f14822H0.m7815a(str, j2, j3);
        this.f14827M0 = m7793D0(str);
        MediaCodecInfo mediaCodecInfo = this.f11908Q;
        Objects.requireNonNull(mediaCodecInfo);
        boolean z = false;
        if (Util.f14736a >= 29 && "video/x-vnd.on2.vp9".equals(mediaCodecInfo.f11881b)) {
            MediaCodecInfo.CodecProfileLevel[] m6642d = mediaCodecInfo.m6642d();
            int length = m6642d.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (m6642d[i2].profile == 16384) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.f14828N0 = z;
        if (Util.f14736a < 23 || !this.f14851k1) {
            return;
        }
        MediaCodecAdapter mediaCodecAdapter = this.f11901J;
        Objects.requireNonNull(mediaCodecAdapter);
        this.f14853m1 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: f0 */
    public void mo6212f0(String str) {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.f14822H0;
        Handler handler = eventDispatcher.f14898a;
        if (handler != null) {
            handler.post(new RunnableC0207a(eventDispatcher, str, 10));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* renamed from: g0 */
    public DecoderReuseEvaluation mo6213g0(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation mo6213g0 = super.mo6213g0(formatHolder);
        this.f14822H0.m7817c(formatHolder.f9704b, mo6213g0);
        return mo6213g0;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: h0 */
    public void mo6214h0(Format format, @Nullable MediaFormat mediaFormat) {
        MediaCodecAdapter mediaCodecAdapter = this.f11901J;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.mo6615j(this.f14832R0);
        }
        if (this.f14851k1) {
            this.f14846f1 = format.f9664r;
            this.f14847g1 = format.f9665s;
        } else {
            Objects.requireNonNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f14846f1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f14847g1 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f2 = format.f9668v;
        this.f14849i1 = f2;
        if (Util.f14736a >= 21) {
            int i2 = format.f9667u;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f14846f1;
                this.f14846f1 = this.f14847g1;
                this.f14847g1 = i3;
                this.f14849i1 = 1.0f / f2;
            }
        } else {
            this.f14848h1 = format.f9667u;
        }
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        videoFrameReleaseHelper.f14878f = format.f9666t;
        FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f14873a;
        fixedFrameRateEstimator.f14800a.m7785c();
        fixedFrameRateEstimator.f14801b.m7785c();
        fixedFrameRateEstimator.f14802c = false;
        fixedFrameRateEstimator.f14803d = -9223372036854775807L;
        fixedFrameRateEstimator.f14804e = 0;
        videoFrameReleaseHelper.m7810c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* renamed from: i0 */
    public void mo6667i0(long j2) {
        super.mo6667i0(j2);
        if (this.f14851k1) {
            return;
        }
        this.f14841a1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: j0 */
    public void mo6215j0() {
        m7792C0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* renamed from: k0 */
    public void mo6216k0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f14851k1;
        if (!z) {
            this.f14841a1++;
        }
        if (Util.f14736a >= 23 || !z) {
            return;
        }
        m7798N0(decoderInputBuffer.f10607f);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    /* renamed from: m */
    public void mo5666m(float f2, float f3) throws ExoPlaybackException {
        this.f11899H = f2;
        this.f11900I = f3;
        m6676z0(this.f11902K);
        VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
        videoFrameReleaseHelper.f14881i = f2;
        videoFrameReleaseHelper.m7809b();
        videoFrameReleaseHelper.m7811d(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if ((r11 == 0 ? false : r13.f14811g[(int) ((r11 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012f, code lost:
    
        if ((m7791I0(r5) && r22 > 100000) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo6217m0(long r28, long r30, @androidx.annotation.Nullable com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r32, @androidx.annotation.Nullable java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, com.google.android.exoplayer2.Format r41) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.mo6217m0(long, long, com.google.android.exoplayer2.mediacodec.MediaCodecAdapter, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
        if (i2 != 1) {
            if (i2 == 7) {
                this.f14854n1 = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f14852l1 != intValue) {
                    this.f14852l1 = intValue;
                    if (this.f14851k1) {
                        m6669o0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 == 4) {
                int intValue2 = ((Integer) obj).intValue();
                this.f14832R0 = intValue2;
                MediaCodecAdapter mediaCodecAdapter = this.f11901J;
                if (mediaCodecAdapter != null) {
                    mediaCodecAdapter.mo6615j(intValue2);
                    return;
                }
                return;
            }
            if (i2 != 5) {
                return;
            }
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.f14821G0;
            int intValue3 = ((Integer) obj).intValue();
            if (videoFrameReleaseHelper.f14882j == intValue3) {
                return;
            }
            videoFrameReleaseHelper.f14882j = intValue3;
            videoFrameReleaseHelper.m7811d(true);
            return;
        }
        DummySurface dummySurface = obj instanceof Surface ? (Surface) obj : null;
        if (dummySurface == null) {
            DummySurface dummySurface2 = this.f14830P0;
            if (dummySurface2 != null) {
                dummySurface = dummySurface2;
            } else {
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo = this.f11908Q;
                if (mediaCodecInfo != null && m7803S0(mediaCodecInfo)) {
                    dummySurface = DummySurface.m7779d(this.f14820F0, mediaCodecInfo.f11885f);
                    this.f14830P0 = dummySurface;
                }
            }
        }
        if (this.f14829O0 == dummySurface) {
            if (dummySurface == null || dummySurface == this.f14830P0) {
                return;
            }
            VideoSize videoSize = this.f14850j1;
            if (videoSize != null) {
                this.f14822H0.m7819e(videoSize);
            }
            if (this.f14831Q0) {
                this.f14822H0.m7818d(this.f14829O0);
                return;
            }
            return;
        }
        this.f14829O0 = dummySurface;
        VideoFrameReleaseHelper videoFrameReleaseHelper2 = this.f14821G0;
        Objects.requireNonNull(videoFrameReleaseHelper2);
        DummySurface dummySurface3 = dummySurface instanceof DummySurface ? null : dummySurface;
        if (videoFrameReleaseHelper2.f14877e != dummySurface3) {
            videoFrameReleaseHelper2.m7808a();
            videoFrameReleaseHelper2.f14877e = dummySurface3;
            videoFrameReleaseHelper2.m7811d(true);
        }
        this.f14831Q0 = false;
        int i3 = this.f9447f;
        MediaCodecAdapter mediaCodecAdapter2 = this.f11901J;
        if (mediaCodecAdapter2 != null) {
            if (Util.f14736a < 23 || dummySurface == null || this.f14827M0) {
                m6669o0();
                m6665b0();
            } else {
                mediaCodecAdapter2.mo6617l(dummySurface);
            }
        }
        if (dummySurface == null || dummySurface == this.f14830P0) {
            this.f14850j1 = null;
            m7792C0();
            return;
        }
        VideoSize videoSize2 = this.f14850j1;
        if (videoSize2 != null) {
            this.f14822H0.m7819e(videoSize2);
        }
        m7792C0();
        if (i3 == 2) {
            m7802R0();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    /* renamed from: q0 */
    public void mo6670q0() {
        super.mo6670q0();
        this.f14841a1 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: w0 */
    public boolean mo6675w0(com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return this.f14829O0 != null || m7803S0(mediaCodecInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: y0 */
    public int mo6220y0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i2 = 0;
        if (!MimeTypes.m7607o(format.f9659m)) {
            return 0;
        }
        boolean z = format.f9662p != null;
        List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> m7789G0 = m7789G0(mediaCodecSelector, format, z, false);
        if (z && m7789G0.isEmpty()) {
            m7789G0 = m7789G0(mediaCodecSelector, format, false, false);
        }
        if (m7789G0.isEmpty()) {
            return 1;
        }
        int i3 = format.f9646F;
        if (!(i3 == 0 || i3 == 2)) {
            return 2;
        }
        com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo = m7789G0.get(0);
        boolean m6643e = mediaCodecInfo.m6643e(format);
        int i4 = mediaCodecInfo.m6644f(format) ? 16 : 8;
        if (m6643e) {
            List<com.google.android.exoplayer2.mediacodec.MediaCodecInfo> m7789G02 = m7789G0(mediaCodecSelector, format, z, true);
            if (!m7789G02.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.MediaCodecInfo mediaCodecInfo2 = m7789G02.get(0);
                if (mediaCodecInfo2.m6643e(format) && mediaCodecInfo2.m6644f(format)) {
                    i2 = 32;
                }
            }
        }
        return (m6643e ? 4 : 3) | i4 | i2;
    }
}
