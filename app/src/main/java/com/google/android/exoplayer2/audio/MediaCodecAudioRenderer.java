package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.C1035d;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {

    /* renamed from: F0 */
    public final Context f10469F0;

    /* renamed from: G0 */
    public final AudioRendererEventListener.EventDispatcher f10470G0;

    /* renamed from: H0 */
    public final AudioSink f10471H0;

    /* renamed from: I0 */
    public int f10472I0;

    /* renamed from: J0 */
    public boolean f10473J0;

    /* renamed from: K0 */
    @Nullable
    public Format f10474K0;

    /* renamed from: L0 */
    public long f10475L0;

    /* renamed from: M0 */
    public boolean f10476M0;

    /* renamed from: N0 */
    public boolean f10477N0;

    /* renamed from: O0 */
    public boolean f10478O0;

    /* renamed from: P0 */
    @Nullable
    public Renderer.WakeupListener f10479P0;

    public final class AudioSinkListener implements AudioSink.Listener {
        public AudioSinkListener(C09731 c09731) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: a */
        public void mo6139a(long j2) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.f10470G0;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0977d(eventDispatcher, j2, 0));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: b */
        public void mo6140b(Exception exc) {
            Log.m7585b("MediaCodecAudioRenderer", "Audio sink error", exc);
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.f10470G0;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0975b(eventDispatcher, exc, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: c */
        public void mo6141c(int i2, long j2, long j3) {
            MediaCodecAudioRenderer.this.f10470G0.m6121d(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: d */
        public void mo6142d(long j2) {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.f10479P0;
            if (wakeupListener != null) {
                wakeupListener.mo5820b(j2);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: e */
        public void mo6143e() {
            MediaCodecAudioRenderer.this.f10477N0 = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: f */
        public void mo6144f() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.f10479P0;
            if (wakeupListener != null) {
                wakeupListener.mo5819a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = MediaCodecAudioRenderer.this.f10470G0;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0979f(eventDispatcher, z, 0));
            }
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1, factory, mediaCodecSelector, z, 44100.0f);
        this.f10469F0 = context.getApplicationContext();
        this.f10471H0 = audioSink;
        this.f10470G0 = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        audioSink.mo6134m(new AudioSinkListener(null));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f10478O0 = true;
        try {
            this.f10471H0.flush();
            try {
                super.mo5651B();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo5651B();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f11889A0 = decoderCounters;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10470G0;
        Handler handler = eventDispatcher.f10305a;
        if (handler != null) {
            handler.post(new RunnableC0974a(eventDispatcher, decoderCounters, 1));
        }
        RendererConfiguration rendererConfiguration = this.f9445d;
        Objects.requireNonNull(rendererConfiguration);
        if (rendererConfiguration.f9985a) {
            this.f10471H0.mo6132k();
        } else {
            this.f10471H0.mo6129h();
        }
    }

    /* renamed from: C0 */
    public final int m6204C0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.f11880a) || (i2 = Util.f14736a) >= 24 || (i2 == 23 && Util.m7715N(this.f10469F0))) {
            return format.f9660n;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
        super.mo5653D(j2, z);
        this.f10471H0.flush();
        this.f10475L0 = j2;
        this.f10476M0 = true;
        this.f10477N0 = true;
    }

    /* renamed from: D0 */
    public final void m6205D0() {
        long mo6128g = this.f10471H0.mo6128g(mo5906c());
        if (mo6128g != Long.MIN_VALUE) {
            if (!this.f10477N0) {
                mo6128g = Math.max(this.f10475L0, mo6128g);
            }
            this.f10475L0 = mo6128g;
            this.f10477N0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: E */
    public void mo5654E() {
        try {
            super.mo5654E();
        } finally {
            if (this.f10478O0) {
                this.f10478O0 = false;
                this.f10471H0.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: F */
    public void mo5655F() {
        this.f10471H0.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    /* renamed from: G */
    public void mo5656G() {
        m6205D0();
        this.f10471H0.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: K */
    public DecoderReuseEvaluation mo6206K(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation m6641c = mediaCodecInfo.m6641c(format, format2);
        int i2 = m6641c.f10617e;
        if (m6204C0(mediaCodecInfo, format2) > this.f10472I0) {
            i2 |= 64;
        }
        int i3 = i2;
        return new DecoderReuseEvaluation(mediaCodecInfo.f11880a, format, format2, i3 != 0 ? 0 : m6641c.f10616d, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: V */
    public float mo6207V(float f2, Format format, Format[] formatArr) {
        int i2 = -1;
        for (Format format2 : formatArr) {
            int i3 = format2.f9641A;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * i2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: W */
    public List<MediaCodecInfo> mo6208W(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        MediaCodecInfo m6680d;
        String str = format.f9659m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f10471H0.mo6122a(format) && (m6680d = MediaCodecUtil.m6680d("audio/raw", false, false)) != null) {
            return Collections.singletonList(m6680d);
        }
        List<MediaCodecInfo> mo4128a = mediaCodecSelector.mo4128a(str, z, false);
        Pattern pattern = MediaCodecUtil.f11962a;
        ArrayList arrayList = new ArrayList(mo4128a);
        MediaCodecUtil.m6686j(arrayList, new C1035d(format));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(mediaCodecSelector.mo4128a("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Configuration mo6209Y(com.google.android.exoplayer2.mediacodec.MediaCodecInfo r13, com.google.android.exoplayer2.Format r14, @androidx.annotation.Nullable android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.MediaCodecAudioRenderer.mo6209Y(com.google.android.exoplayer2.mediacodec.MediaCodecInfo, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.MediaCodecAdapter$Configuration");
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return this.f10471H0.mo6126e() || super.mo5905b();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return this.f11951w0 && this.f10471H0.mo6124c();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: d */
    public void mo5697d(PlaybackParameters playbackParameters) {
        this.f10471H0.mo6125d(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: d0 */
    public void mo6210d0(Exception exc) {
        Log.m7585b("MediaCodecAudioRenderer", "Audio codec error", exc);
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10470G0;
        Handler handler = eventDispatcher.f10305a;
        if (handler != null) {
            handler.post(new RunnableC0975b(eventDispatcher, exc, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: e0 */
    public void mo6211e0(String str, long j2, long j3) {
        this.f10470G0.m6118a(str, j2, j3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: f0 */
    public void mo6212f0(String str) {
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10470G0;
        Handler handler = eventDispatcher.f10305a;
        if (handler != null) {
            handler.post(new RunnableC0207a(eventDispatcher, str, 7));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    /* renamed from: g0 */
    public DecoderReuseEvaluation mo6213g0(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation mo6213g0 = super.mo6213g0(formatHolder);
        this.f10470G0.m6120c(formatHolder.f9704b, mo6213g0);
        return mo6213g0;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.f10471H0.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: h0 */
    public void mo6214h0(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int i2;
        Format format2 = this.f10474K0;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f11901J != null) {
            int m7702A = "audio/raw".equals(format.f9659m) ? format.f9642B : (Util.f14736a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? Util.m7702A(mediaFormat.getInteger("v-bits-per-sample")) : "audio/raw".equals(format.f9659m) ? format.f9642B : 2 : mediaFormat.getInteger("pcm-encoding");
            Format.Builder builder = new Format.Builder();
            builder.f9687k = "audio/raw";
            builder.f9702z = m7702A;
            builder.f9673A = format.f9643C;
            builder.f9674B = format.f9644D;
            builder.f9700x = mediaFormat.getInteger("channel-count");
            builder.f9701y = mediaFormat.getInteger("sample-rate");
            Format m5833a = builder.m5833a();
            if (this.f10473J0 && m5833a.f9672z == 6 && (i2 = format.f9672z) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < format.f9672z; i3++) {
                    iArr[i3] = i3;
                }
            }
            format = m5833a;
        }
        try {
            this.f10471H0.mo6136o(format, 0, iArr);
        } catch (AudioSink.ConfigurationException e2) {
            throw m5677y(e2, e2.f10307b, false, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: j0 */
    public void mo6215j0() {
        this.f10471H0.mo6131j();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: k0 */
    public void mo6216k0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f10476M0 || decoderInputBuffer.m6241i()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f10607f - this.f10475L0) > 500000) {
            this.f10475L0 = decoderInputBuffer.f10607f;
        }
        this.f10476M0 = false;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: l */
    public long mo5698l() {
        if (this.f9447f == 2) {
            m6205D0();
        }
        return this.f10475L0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: m0 */
    public boolean mo6217m0(long j2, long j3, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        Objects.requireNonNull(byteBuffer);
        if (this.f10474K0 != null && (i3 & 2) != 0) {
            Objects.requireNonNull(mediaCodecAdapter);
            mediaCodecAdapter.mo6614i(i2, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.mo6614i(i2, false);
            }
            this.f11889A0.f10598f += i4;
            this.f10471H0.mo6131j();
            return true;
        }
        try {
            if (!this.f10471H0.mo6133l(byteBuffer, j4, i4)) {
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.mo6614i(i2, false);
            }
            this.f11889A0.f10597e += i4;
            return true;
        } catch (AudioSink.InitializationException e2) {
            throw m5677y(e2, e2.f10309c, e2.f10308b, 5001);
        } catch (AudioSink.WriteException e3) {
            throw m5677y(e3, format, e3.f10310b, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: p0 */
    public void mo6218p0() throws ExoPlaybackException {
        try {
            this.f10471H0.mo6123b();
        } catch (AudioSink.WriteException e2) {
            throw m5677y(e2, e2.f10311c, e2.f10310b, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
        if (i2 == 2) {
            this.f10471H0.setVolume(((Float) obj).floatValue());
        }
        if (i2 == 3) {
            this.f10471H0.mo6130i((AudioAttributes) obj);
            return;
        }
        if (i2 == 6) {
            this.f10471H0.mo6138q((AuxEffectInfo) obj);
            return;
        }
        switch (i2) {
            case 9:
                this.f10471H0.mo6137p(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f10471H0.mo6127f(((Integer) obj).intValue());
                break;
            case 11:
                this.f10479P0 = (Renderer.WakeupListener) obj;
                break;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: w */
    public MediaClock mo5675w() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: x0 */
    public boolean mo6219x0(Format format) {
        return this.f10471H0.mo6122a(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* renamed from: y0 */
    public int mo6220y0(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        if (!MimeTypes.m7603k(format.f9659m)) {
            return 0;
        }
        int i2 = Util.f14736a >= 21 ? 32 : 0;
        int i3 = format.f9646F;
        boolean z = i3 != 0;
        boolean z2 = i3 == 0 || i3 == 2;
        if (z2 && this.f10471H0.mo6122a(format) && (!z || MediaCodecUtil.m6680d("audio/raw", false, false) != null)) {
            return i2 | 12;
        }
        if ("audio/raw".equals(format.f9659m) && !this.f10471H0.mo6122a(format)) {
            return 1;
        }
        AudioSink audioSink = this.f10471H0;
        int i4 = format.f9672z;
        int i5 = format.f9641A;
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/raw";
        builder.f9700x = i4;
        builder.f9701y = i5;
        builder.f9702z = 2;
        if (!audioSink.mo6122a(builder.m5833a())) {
            return 1;
        }
        List<MediaCodecInfo> mo6208W = mo6208W(mediaCodecSelector, format, false);
        if (mo6208W.isEmpty()) {
            return 1;
        }
        if (!z2) {
            return 2;
        }
        MediaCodecInfo mediaCodecInfo = mo6208W.get(0);
        boolean m6643e = mediaCodecInfo.m6643e(format);
        return ((m6643e && mediaCodecInfo.m6644f(format)) ? 16 : 8) | (m6643e ? 4 : 3) | i2;
    }
}
