package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import com.google.android.exoplayer2.drm.C0996b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {

    /* renamed from: A */
    public boolean f10366A;

    /* renamed from: B */
    public long f10367B;

    /* renamed from: C */
    public boolean f10368C;

    /* renamed from: D */
    public boolean f10369D;

    /* renamed from: E */
    public boolean f10370E;

    /* renamed from: F */
    public boolean f10371F;

    /* renamed from: m */
    public final AudioRendererEventListener.EventDispatcher f10372m;

    /* renamed from: n */
    public final AudioSink f10373n;

    /* renamed from: o */
    public final DecoderInputBuffer f10374o;

    /* renamed from: p */
    public DecoderCounters f10375p;

    /* renamed from: q */
    public Format f10376q;

    /* renamed from: r */
    public int f10377r;

    /* renamed from: s */
    public int f10378s;

    /* renamed from: t */
    @Nullable
    public T f10379t;

    /* renamed from: u */
    @Nullable
    public DecoderInputBuffer f10380u;

    /* renamed from: v */
    @Nullable
    public SimpleDecoderOutputBuffer f10381v;

    /* renamed from: w */
    @Nullable
    public DrmSession f10382w;

    /* renamed from: x */
    @Nullable
    public DrmSession f10383x;

    /* renamed from: y */
    public int f10384y;

    /* renamed from: z */
    public boolean f10385z;

    public final class AudioSinkListener implements AudioSink.Listener {
        public AudioSinkListener(C09701 c09701) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: a */
        public void mo6139a(long j2) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = DecoderAudioRenderer.this.f10372m;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0977d(eventDispatcher, j2, 0));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: b */
        public void mo6140b(Exception exc) {
            Log.m7585b("DecoderAudioRenderer", "Audio sink error", exc);
            AudioRendererEventListener.EventDispatcher eventDispatcher = DecoderAudioRenderer.this.f10372m;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0975b(eventDispatcher, exc, 1));
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: c */
        public void mo6141c(int i2, long j2, long j3) {
            DecoderAudioRenderer.this.f10372m.m6121d(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: d */
        public /* synthetic */ void mo6142d(long j2) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: e */
        public void mo6143e() {
            DecoderAudioRenderer.this.f10369D = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        /* renamed from: f */
        public /* synthetic */ void mo6144f() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            AudioRendererEventListener.EventDispatcher eventDispatcher = DecoderAudioRenderer.this.f10372m;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0979f(eventDispatcher, z, 0));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecoderAudioRenderer() {
        super(1);
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(null, new DefaultAudioSink.DefaultAudioProcessorChain(new AudioProcessor[0]), false, false, 0);
        this.f10372m = new AudioRendererEventListener.EventDispatcher(null, null);
        this.f10373n = defaultAudioSink;
        defaultAudioSink.mo6134m(new AudioSinkListener(null));
        this.f10374o = new DecoderInputBuffer(0);
        this.f10384y = 0;
        this.f10366A = true;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: B */
    public void mo5651B() {
        this.f10376q = null;
        this.f10366A = true;
        try {
            C0996b.m6331b(this.f10383x, null);
            this.f10383x = null;
            m6168P();
            this.f10373n.reset();
        } finally {
            this.f10372m.m6119b(this.f10375p);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: C */
    public void mo5652C(boolean z, boolean z2) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f10375p = decoderCounters;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10372m;
        Handler handler = eventDispatcher.f10305a;
        if (handler != null) {
            handler.post(new RunnableC0974a(eventDispatcher, decoderCounters, 1));
        }
        RendererConfiguration rendererConfiguration = this.f9445d;
        Objects.requireNonNull(rendererConfiguration);
        if (rendererConfiguration.f9985a) {
            this.f10373n.mo6132k();
        } else {
            this.f10373n.mo6129h();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: D */
    public void mo5653D(long j2, boolean z) throws ExoPlaybackException {
        this.f10373n.flush();
        this.f10367B = j2;
        this.f10368C = true;
        this.f10369D = true;
        this.f10370E = false;
        this.f10371F = false;
        T t = this.f10379t;
        if (t != null) {
            if (this.f10384y != 0) {
                m6168P();
                m6166N();
                return;
            }
            this.f10380u = null;
            if (this.f10381v != null) {
                throw null;
            }
            t.flush();
            this.f10385z = false;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: F */
    public void mo5655F() {
        this.f10373n.play();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    /* renamed from: G */
    public void mo5656G() {
        m6170R();
        this.f10373n.pause();
    }

    /* renamed from: J */
    public abstract T m6162J(Format format, @Nullable CryptoConfig cryptoConfig) throws DecoderException;

    /* renamed from: K */
    public final boolean m6163K() throws ExoPlaybackException, DecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException {
        if (this.f10381v == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.f10379t.mo6245b();
            this.f10381v = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i2 = simpleDecoderOutputBuffer.f10612d;
            if (i2 > 0) {
                this.f10375p.f10598f += i2;
                this.f10373n.mo6131j();
            }
        }
        if (this.f10381v.m6242j()) {
            if (this.f10384y != 2) {
                Objects.requireNonNull(this.f10381v);
                throw null;
            }
            m6168P();
            m6166N();
            this.f10366A = true;
            return false;
        }
        if (this.f10366A) {
            Format.Builder m5829b = m6165M(this.f10379t).m5829b();
            m5829b.f9673A = this.f10377r;
            m5829b.f9674B = this.f10378s;
            this.f10373n.mo6136o(m5829b.m5833a(), 0, null);
            this.f10366A = false;
        }
        AudioSink audioSink = this.f10373n;
        Objects.requireNonNull(this.f10381v);
        if (!audioSink.mo6133l(null, this.f10381v.f10611c, 1)) {
            return false;
        }
        this.f10375p.f10597e++;
        Objects.requireNonNull(this.f10381v);
        throw null;
    }

    /* renamed from: L */
    public final boolean m6164L() throws DecoderException, ExoPlaybackException {
        T t = this.f10379t;
        if (t == null || this.f10384y == 2 || this.f10370E) {
            return false;
        }
        if (this.f10380u == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t.mo6246c();
            this.f10380u = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.f10384y == 1) {
            DecoderInputBuffer decoderInputBuffer2 = this.f10380u;
            decoderInputBuffer2.f10580b = 4;
            this.f10379t.mo6247d(decoderInputBuffer2);
            this.f10380u = null;
            this.f10384y = 2;
            return false;
        }
        FormatHolder m5678z = m5678z();
        int m5658I = m5658I(m5678z, this.f10380u, 0);
        if (m5658I == -5) {
            m6167O(m5678z);
            return true;
        }
        if (m5658I != -4) {
            if (m5658I == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.f10380u.m6242j()) {
            this.f10370E = true;
            this.f10379t.mo6247d(this.f10380u);
            this.f10380u = null;
            return false;
        }
        this.f10380u.m6251o();
        Objects.requireNonNull(this.f10380u);
        DecoderInputBuffer decoderInputBuffer3 = this.f10380u;
        if (this.f10368C && !decoderInputBuffer3.m6241i()) {
            if (Math.abs(decoderInputBuffer3.f10607f - this.f10367B) > 500000) {
                this.f10367B = decoderInputBuffer3.f10607f;
            }
            this.f10368C = false;
        }
        this.f10379t.mo6247d(this.f10380u);
        this.f10385z = true;
        this.f10375p.f10595c++;
        this.f10380u = null;
        return true;
    }

    /* renamed from: M */
    public abstract Format m6165M(T t);

    /* renamed from: N */
    public final void m6166N() throws ExoPlaybackException {
        if (this.f10379t != null) {
            return;
        }
        DrmSession drmSession = this.f10383x;
        C0996b.m6331b(this.f10382w, drmSession);
        this.f10382w = drmSession;
        CryptoConfig cryptoConfig = null;
        if (drmSession != null && (cryptoConfig = drmSession.mo6268g()) == null && this.f10382w.mo6267f() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.m7696a("createAudioDecoder");
            this.f10379t = m6162J(this.f10376q, cryptoConfig);
            TraceUtil.m7697b();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f10372m.m6118a(this.f10379t.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.f10375p.f10593a++;
        } catch (DecoderException e2) {
            Log.m7585b("DecoderAudioRenderer", "Audio codec error", e2);
            AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10372m;
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0975b(eventDispatcher, e2, 0));
            }
            throw m5677y(e2, this.f10376q, false, 4001);
        } catch (OutOfMemoryError e3) {
            throw m5677y(e3, this.f10376q, false, 4001);
        }
    }

    /* renamed from: O */
    public final void m6167O(FormatHolder formatHolder) throws ExoPlaybackException {
        Format format = formatHolder.f9704b;
        Objects.requireNonNull(format);
        DrmSession drmSession = formatHolder.f9703a;
        C0996b.m6331b(this.f10383x, drmSession);
        this.f10383x = drmSession;
        Format format2 = this.f10376q;
        this.f10376q = format;
        this.f10377r = format.f9643C;
        this.f10378s = format.f9644D;
        T t = this.f10379t;
        if (t == null) {
            m6166N();
            this.f10372m.m6120c(this.f10376q, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = drmSession != this.f10382w ? new DecoderReuseEvaluation(t.getName(), format2, format, 0, 128) : new DecoderReuseEvaluation(t.getName(), format2, format, 0, 1);
        if (decoderReuseEvaluation.f10616d == 0) {
            if (this.f10385z) {
                this.f10384y = 1;
            } else {
                m6168P();
                m6166N();
                this.f10366A = true;
            }
        }
        this.f10372m.m6120c(this.f10376q, decoderReuseEvaluation);
    }

    /* renamed from: P */
    public final void m6168P() {
        this.f10380u = null;
        this.f10381v = null;
        this.f10384y = 0;
        this.f10385z = false;
        T t = this.f10379t;
        if (t != null) {
            this.f10375p.f10594b++;
            t.release();
            AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10372m;
            String name = this.f10379t.getName();
            Handler handler = eventDispatcher.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0207a(eventDispatcher, name, 7));
            }
            this.f10379t = null;
        }
        C0996b.m6331b(this.f10382w, null);
        this.f10382w = null;
    }

    /* renamed from: Q */
    public abstract int m6169Q(Format format);

    /* renamed from: R */
    public final void m6170R() {
        long mo6128g = this.f10373n.mo6128g(mo5906c());
        if (mo6128g != Long.MIN_VALUE) {
            if (!this.f10369D) {
                mo6128g = Math.max(this.f10367B, mo6128g);
            }
            this.f10367B = mo6128g;
            this.f10369D = false;
        }
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    /* renamed from: a */
    public final int mo5904a(Format format) {
        if (!MimeTypes.m7603k(format.f9659m)) {
            return 0;
        }
        int m6169Q = m6169Q(format);
        if (m6169Q <= 2) {
            return m6169Q | 0 | 0;
        }
        return m6169Q | 8 | (Util.f14736a >= 21 ? 32 : 0);
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: b */
    public boolean mo5905b() {
        return this.f10373n.mo6126e() || (this.f10376q != null && (m5650A() || this.f10381v != null));
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: c */
    public boolean mo5906c() {
        return this.f10371F && this.f10373n.mo6124c();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: d */
    public void mo5697d(PlaybackParameters playbackParameters) {
        this.f10373n.mo6125d(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.f10373n.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    /* renamed from: l */
    public long mo5698l() {
        if (this.f9447f == 2) {
            m6170R();
        }
        return this.f10367B;
    }

    @Override // com.google.android.exoplayer2.Renderer
    /* renamed from: p */
    public void mo5938p(long j2, long j3) throws ExoPlaybackException {
        if (this.f10371F) {
            try {
                this.f10373n.mo6123b();
                return;
            } catch (AudioSink.WriteException e2) {
                throw m5677y(e2, e2.f10311c, e2.f10310b, 5002);
            }
        }
        if (this.f10376q == null) {
            FormatHolder m5678z = m5678z();
            this.f10374o.mo6248l();
            int m5658I = m5658I(m5678z, this.f10374o, 2);
            if (m5658I != -5) {
                if (m5658I == -4) {
                    Assertions.m7516d(this.f10374o.m6242j());
                    this.f10370E = true;
                    try {
                        this.f10371F = true;
                        this.f10373n.mo6123b();
                        return;
                    } catch (AudioSink.WriteException e3) {
                        throw m5677y(e3, null, false, 5002);
                    }
                }
                return;
            }
            m6167O(m5678z);
        }
        m6166N();
        if (this.f10379t != null) {
            try {
                TraceUtil.m7696a("drainAndFeed");
                m6163K();
                while (m6164L()) {
                }
                TraceUtil.m7697b();
                synchronized (this.f10375p) {
                }
            } catch (AudioSink.ConfigurationException e4) {
                throw m5677y(e4, e4.f10307b, false, 5001);
            } catch (AudioSink.InitializationException e5) {
                throw m5677y(e5, e5.f10309c, e5.f10308b, 5001);
            } catch (AudioSink.WriteException e6) {
                throw m5677y(e6, e6.f10311c, e6.f10310b, 5002);
            } catch (DecoderException e7) {
                Log.m7585b("DecoderAudioRenderer", "Audio codec error", e7);
                AudioRendererEventListener.EventDispatcher eventDispatcher = this.f10372m;
                Handler handler = eventDispatcher.f10305a;
                if (handler != null) {
                    handler.post(new RunnableC0975b(eventDispatcher, e7, 0));
                }
                throw m5677y(e7, this.f10376q, false, 4003);
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    /* renamed from: q */
    public void mo5669q(int i2, @Nullable Object obj) throws ExoPlaybackException {
        if (i2 == 2) {
            this.f10373n.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.f10373n.mo6130i((AudioAttributes) obj);
        } else if (i2 == 6) {
            this.f10373n.mo6138q((AuxEffectInfo) obj);
        } else if (i2 == 9) {
            this.f10373n.mo6137p(((Boolean) obj).booleanValue());
        } else {
            if (i2 != 10) {
                return;
            }
            this.f10373n.mo6127f(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    /* renamed from: w */
    public MediaClock mo5675w() {
        return this;
    }
}
