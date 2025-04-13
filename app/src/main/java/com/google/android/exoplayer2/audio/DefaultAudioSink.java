package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioTrackPositionTracker;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.internal.p038ws.RealWebSocket;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: A */
    public long f10387A;

    /* renamed from: B */
    public long f10388B;

    /* renamed from: C */
    public long f10389C;

    /* renamed from: D */
    public int f10390D;

    /* renamed from: E */
    public boolean f10391E;

    /* renamed from: F */
    public boolean f10392F;

    /* renamed from: G */
    public long f10393G;

    /* renamed from: H */
    public float f10394H;

    /* renamed from: I */
    public AudioProcessor[] f10395I;

    /* renamed from: J */
    public ByteBuffer[] f10396J;

    /* renamed from: K */
    @Nullable
    public ByteBuffer f10397K;

    /* renamed from: L */
    public int f10398L;

    /* renamed from: M */
    @Nullable
    public ByteBuffer f10399M;

    /* renamed from: N */
    public byte[] f10400N;

    /* renamed from: O */
    public int f10401O;

    /* renamed from: P */
    public int f10402P;

    /* renamed from: Q */
    public boolean f10403Q;

    /* renamed from: R */
    public boolean f10404R;

    /* renamed from: S */
    public boolean f10405S;

    /* renamed from: T */
    public boolean f10406T;

    /* renamed from: U */
    public int f10407U;

    /* renamed from: V */
    public AuxEffectInfo f10408V;

    /* renamed from: W */
    public boolean f10409W;

    /* renamed from: X */
    public long f10410X;

    /* renamed from: Y */
    public boolean f10411Y;

    /* renamed from: Z */
    public boolean f10412Z;

    /* renamed from: a */
    @Nullable
    public final AudioCapabilities f10413a;

    /* renamed from: b */
    public final AudioProcessorChain f10414b;

    /* renamed from: c */
    public final boolean f10415c;

    /* renamed from: d */
    public final ChannelMappingAudioProcessor f10416d;

    /* renamed from: e */
    public final TrimmingAudioProcessor f10417e;

    /* renamed from: f */
    public final AudioProcessor[] f10418f;

    /* renamed from: g */
    public final AudioProcessor[] f10419g;

    /* renamed from: h */
    public final ConditionVariable f10420h;

    /* renamed from: i */
    public final AudioTrackPositionTracker f10421i;

    /* renamed from: j */
    public final ArrayDeque<MediaPositionParameters> f10422j;

    /* renamed from: k */
    public final boolean f10423k;

    /* renamed from: l */
    public final int f10424l;

    /* renamed from: m */
    public StreamEventCallbackV29 f10425m;

    /* renamed from: n */
    public final PendingExceptionHolder<AudioSink.InitializationException> f10426n;

    /* renamed from: o */
    public final PendingExceptionHolder<AudioSink.WriteException> f10427o;

    /* renamed from: p */
    @Nullable
    public AudioSink.Listener f10428p;

    /* renamed from: q */
    @Nullable
    public Configuration f10429q;

    /* renamed from: r */
    public Configuration f10430r;

    /* renamed from: s */
    @Nullable
    public AudioTrack f10431s;

    /* renamed from: t */
    public AudioAttributes f10432t;

    /* renamed from: u */
    @Nullable
    public MediaPositionParameters f10433u;

    /* renamed from: v */
    public MediaPositionParameters f10434v;

    /* renamed from: w */
    public PlaybackParameters f10435w;

    /* renamed from: x */
    @Nullable
    public ByteBuffer f10436x;

    /* renamed from: y */
    public int f10437y;

    /* renamed from: z */
    public long f10438z;

    public interface AudioProcessorChain {
        /* renamed from: a */
        PlaybackParameters mo6192a(PlaybackParameters playbackParameters);

        /* renamed from: b */
        long mo6193b(long j2);

        /* renamed from: c */
        long mo6194c();

        /* renamed from: d */
        boolean mo6195d(boolean z);
    }

    public static final class Configuration {

        /* renamed from: a */
        public final Format f10441a;

        /* renamed from: b */
        public final int f10442b;

        /* renamed from: c */
        public final int f10443c;

        /* renamed from: d */
        public final int f10444d;

        /* renamed from: e */
        public final int f10445e;

        /* renamed from: f */
        public final int f10446f;

        /* renamed from: g */
        public final int f10447g;

        /* renamed from: h */
        public final int f10448h;

        /* renamed from: i */
        public final AudioProcessor[] f10449i;

        public Configuration(Format format, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, AudioProcessor[] audioProcessorArr) {
            int round;
            this.f10441a = format;
            this.f10442b = i2;
            this.f10443c = i3;
            this.f10444d = i4;
            this.f10445e = i5;
            this.f10446f = i6;
            this.f10447g = i7;
            this.f10449i = audioProcessorArr;
            if (i8 != 0) {
                round = i8;
            } else {
                if (i3 == 0) {
                    float f2 = z ? 8.0f : 1.0f;
                    int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
                    Assertions.m7516d(minBufferSize != -2);
                    long j2 = i5;
                    int m7741j = Util.m7741j(minBufferSize * 4, ((int) ((250000 * j2) / 1000000)) * i4, Math.max(minBufferSize, ((int) ((j2 * 750000) / 1000000)) * i4));
                    round = f2 != 1.0f ? Math.round(m7741j * f2) : m7741j;
                } else if (i3 == 1) {
                    round = m6200e(50000000L);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException();
                    }
                    round = m6200e(250000L);
                }
            }
            this.f10448h = round;
        }

        @RequiresApi
        /* renamed from: d */
        public static android.media.AudioAttributes m6196d(AudioAttributes audioAttributes, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : audioAttributes.m6108b();
        }

        /* renamed from: a */
        public AudioTrack m6197a(boolean z, AudioAttributes audioAttributes, int i2) throws AudioSink.InitializationException {
            try {
                AudioTrack m6198b = m6198b(z, audioAttributes, i2);
                int state = m6198b.getState();
                if (state == 1) {
                    return m6198b;
                }
                try {
                    m6198b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f10445e, this.f10446f, this.f10448h, this.f10441a, m6201f(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new AudioSink.InitializationException(0, this.f10445e, this.f10446f, this.f10448h, this.f10441a, m6201f(), e2);
            }
        }

        /* renamed from: b */
        public final AudioTrack m6198b(boolean z, AudioAttributes audioAttributes, int i2) {
            int i3 = Util.f14736a;
            if (i3 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(m6196d(audioAttributes, z)).setAudioFormat(DefaultAudioSink.m6172u(this.f10445e, this.f10446f, this.f10447g)).setTransferMode(1).setBufferSizeInBytes(this.f10448h).setSessionId(i2).setOffloadedPlayback(this.f10443c == 1).build();
            }
            if (i3 >= 21) {
                return new AudioTrack(m6196d(audioAttributes, z), DefaultAudioSink.m6172u(this.f10445e, this.f10446f, this.f10447g), this.f10448h, 1, i2);
            }
            int m7705D = Util.m7705D(audioAttributes.f10287d);
            return i2 == 0 ? new AudioTrack(m7705D, this.f10445e, this.f10446f, this.f10447g, this.f10448h, 1) : new AudioTrack(m7705D, this.f10445e, this.f10446f, this.f10447g, this.f10448h, 1, i2);
        }

        /* renamed from: c */
        public long m6199c(long j2) {
            return (j2 * 1000000) / this.f10445e;
        }

        /* renamed from: e */
        public final int m6200e(long j2) {
            int i2;
            int i3 = this.f10447g;
            switch (i3) {
                case 5:
                    i2 = 80000;
                    break;
                case 6:
                case 18:
                    i2 = 768000;
                    break;
                case 7:
                    i2 = 192000;
                    break;
                case 8:
                    i2 = 2250000;
                    break;
                case 9:
                    i2 = 40000;
                    break;
                case 10:
                    i2 = 100000;
                    break;
                case 11:
                    i2 = 16000;
                    break;
                case 12:
                    i2 = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i2 = 3062500;
                    break;
                case 15:
                    i2 = 8000;
                    break;
                case 16:
                    i2 = 256000;
                    break;
                case 17:
                    i2 = 336000;
                    break;
            }
            if (i3 == 5) {
                i2 *= 2;
            }
            return (int) ((j2 * i2) / 1000000);
        }

        /* renamed from: f */
        public boolean m6201f() {
            return this.f10443c == 1;
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {

        /* renamed from: a */
        public final AudioProcessor[] f10450a;

        /* renamed from: b */
        public final SilenceSkippingAudioProcessor f10451b;

        /* renamed from: c */
        public final SonicAudioProcessor f10452c;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f10450a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f10451b = silenceSkippingAudioProcessor;
            this.f10452c = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        /* renamed from: a */
        public PlaybackParameters mo6192a(PlaybackParameters playbackParameters) {
            SonicAudioProcessor sonicAudioProcessor = this.f10452c;
            float f2 = playbackParameters.f9949b;
            if (sonicAudioProcessor.f10530c != f2) {
                sonicAudioProcessor.f10530c = f2;
                sonicAudioProcessor.f10536i = true;
            }
            float f3 = playbackParameters.f9950c;
            if (sonicAudioProcessor.f10531d != f3) {
                sonicAudioProcessor.f10531d = f3;
                sonicAudioProcessor.f10536i = true;
            }
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        /* renamed from: b */
        public long mo6193b(long j2) {
            SonicAudioProcessor sonicAudioProcessor = this.f10452c;
            if (sonicAudioProcessor.f10542o < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                return (long) (sonicAudioProcessor.f10530c * j2);
            }
            long j3 = sonicAudioProcessor.f10541n;
            Objects.requireNonNull(sonicAudioProcessor.f10537j);
            long j4 = j3 - ((r4.f10517k * r4.f10508b) * 2);
            int i2 = sonicAudioProcessor.f10535h.f10301a;
            int i3 = sonicAudioProcessor.f10534g.f10301a;
            return i2 == i3 ? Util.m7723V(j2, j4, sonicAudioProcessor.f10542o) : Util.m7723V(j2, j4 * i2, sonicAudioProcessor.f10542o * i3);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        /* renamed from: c */
        public long mo6194c() {
            return this.f10451b.f10506t;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        /* renamed from: d */
        public boolean mo6195d(boolean z) {
            this.f10451b.f10499m = z;
            return z;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class MediaPositionParameters {

        /* renamed from: a */
        public final PlaybackParameters f10453a;

        /* renamed from: b */
        public final boolean f10454b;

        /* renamed from: c */
        public final long f10455c;

        /* renamed from: d */
        public final long f10456d;

        public MediaPositionParameters(PlaybackParameters playbackParameters, boolean z, long j2, long j3, C09711 c09711) {
            this.f10453a = playbackParameters;
            this.f10454b = z;
            this.f10455c = j2;
            this.f10456d = j3;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {

        /* renamed from: a */
        public final long f10457a;

        /* renamed from: b */
        @Nullable
        public T f10458b;

        /* renamed from: c */
        public long f10459c;

        public PendingExceptionHolder(long j2) {
            this.f10457a = j2;
        }

        /* renamed from: a */
        public void m6202a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10458b == null) {
                this.f10458b = t;
                this.f10459c = this.f10457a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f10459c) {
                T t2 = this.f10458b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f10458b;
                this.f10458b = null;
                throw t3;
            }
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        public PositionTrackerListener(C09711 c09711) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        /* renamed from: a */
        public void mo6152a(long j2) {
            AudioSink.Listener listener = DefaultAudioSink.this.f10428p;
            if (listener != null) {
                listener.mo6139a(j2);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        /* renamed from: b */
        public void mo6153b(int i2, long j2) {
            if (DefaultAudioSink.this.f10428p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                defaultAudioSink.f10428p.mo6141c(i2, j2, elapsedRealtime - defaultAudioSink.f10410X);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        /* renamed from: c */
        public void mo6154c(long j2) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j2);
            Log.w("DefaultAudioSink", sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        /* renamed from: d */
        public void mo6155d(long j2, long j3, long j4, long j5) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long j6 = defaultAudioSink.f10430r.f10443c == 0 ? defaultAudioSink.f10438z / r1.f10442b : defaultAudioSink.f10387A;
            long m6191z = defaultAudioSink.m6191z();
            StringBuilder m4121t = C0576a.m4121t(182, "Spurious audio timestamp (frame position mismatch): ", j2, ", ");
            m4121t.append(j3);
            m4121t.append(", ");
            m4121t.append(j4);
            m4121t.append(", ");
            m4121t.append(j5);
            m4121t.append(", ");
            m4121t.append(j6);
            m4121t.append(", ");
            m4121t.append(m6191z);
            Log.w("DefaultAudioSink", m4121t.toString());
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        /* renamed from: e */
        public void mo6156e(long j2, long j3, long j4, long j5) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long j6 = defaultAudioSink.f10430r.f10443c == 0 ? defaultAudioSink.f10438z / r1.f10442b : defaultAudioSink.f10387A;
            long m6191z = defaultAudioSink.m6191z();
            StringBuilder m4121t = C0576a.m4121t(180, "Spurious audio timestamp (system clock mismatch): ", j2, ", ");
            m4121t.append(j3);
            m4121t.append(", ");
            m4121t.append(j4);
            m4121t.append(", ");
            m4121t.append(j5);
            m4121t.append(", ");
            m4121t.append(j6);
            m4121t.append(", ");
            m4121t.append(m6191z);
            Log.w("DefaultAudioSink", m4121t.toString());
        }
    }

    @RequiresApi
    public final class StreamEventCallbackV29 {

        /* renamed from: a */
        public final Handler f10461a = new Handler();

        /* renamed from: b */
        public final AudioTrack.StreamEventCallback f10462b;

        public StreamEventCallbackV29() {
            this.f10462b = new AudioTrack.StreamEventCallback(DefaultAudioSink.this) { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(AudioTrack audioTrack, int i2) {
                    Assertions.m7516d(audioTrack == DefaultAudioSink.this.f10431s);
                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                    AudioSink.Listener listener = defaultAudioSink.f10428p;
                    if (listener == null || !defaultAudioSink.f10405S) {
                        return;
                    }
                    listener.mo6144f();
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(AudioTrack audioTrack) {
                    Assertions.m7516d(audioTrack == DefaultAudioSink.this.f10431s);
                    DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                    AudioSink.Listener listener = defaultAudioSink.f10428p;
                    if (listener == null || !defaultAudioSink.f10405S) {
                        return;
                    }
                    listener.mo6144f();
                }
            };
        }
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z, boolean z2, int i2) {
        this.f10413a = audioCapabilities;
        this.f10414b = audioProcessorChain;
        int i3 = Util.f14736a;
        this.f10415c = i3 >= 21 && z;
        this.f10423k = i3 >= 23 && z2;
        this.f10424l = i3 < 29 ? 0 : i2;
        this.f10420h = new ConditionVariable(true);
        this.f10421i = new AudioTrackPositionTracker(new PositionTrackerListener(null));
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.f10416d = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.f10417e = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, ((DefaultAudioProcessorChain) audioProcessorChain).f10450a);
        this.f10418f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f10419g = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.f10394H = 1.0f;
        this.f10432t = AudioAttributes.f10284g;
        this.f10407U = 0;
        this.f10408V = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.f9948e;
        this.f10434v = new MediaPositionParameters(playbackParameters, false, 0L, 0L, null);
        this.f10435w = playbackParameters;
        this.f10402P = -1;
        this.f10395I = new AudioProcessor[0];
        this.f10396J = new ByteBuffer[0];
        this.f10422j = new ArrayDeque<>();
        this.f10426n = new PendingExceptionHolder<>(100L);
        this.f10427o = new PendingExceptionHolder<>(100L);
    }

    /* renamed from: C */
    public static boolean m6171C(AudioTrack audioTrack) {
        return Util.f14736a >= 29 && audioTrack.isOffloadedPlayback();
    }

    @RequiresApi
    /* renamed from: u */
    public static AudioFormat m6172u(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        if (r2 != 5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    @androidx.annotation.Nullable
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6173w(com.google.android.exoplayer2.Format r13, @androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioCapabilities r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6173w(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.audio.AudioCapabilities):android.util.Pair");
    }

    /* renamed from: A */
    public final void m6174A() throws AudioSink.InitializationException {
        this.f10420h.block();
        try {
            Configuration configuration = this.f10430r;
            Objects.requireNonNull(configuration);
            AudioTrack m6197a = configuration.m6197a(this.f10409W, this.f10432t, this.f10407U);
            this.f10431s = m6197a;
            if (m6171C(m6197a)) {
                AudioTrack audioTrack = this.f10431s;
                if (this.f10425m == null) {
                    this.f10425m = new StreamEventCallbackV29();
                }
                StreamEventCallbackV29 streamEventCallbackV29 = this.f10425m;
                final Handler handler = streamEventCallbackV29.f10461a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.exoplayer2.audio.h
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, streamEventCallbackV29.f10462b);
                if (this.f10424l != 3) {
                    AudioTrack audioTrack2 = this.f10431s;
                    Format format = this.f10430r.f10441a;
                    audioTrack2.setOffloadDelayPadding(format.f9643C, format.f9644D);
                }
            }
            this.f10407U = this.f10431s.getAudioSessionId();
            AudioTrackPositionTracker audioTrackPositionTracker = this.f10421i;
            AudioTrack audioTrack3 = this.f10431s;
            Configuration configuration2 = this.f10430r;
            audioTrackPositionTracker.m6151e(audioTrack3, configuration2.f10443c == 2, configuration2.f10447g, configuration2.f10444d, configuration2.f10448h);
            m6181I();
            int i2 = this.f10408V.f10355a;
            if (i2 != 0) {
                this.f10431s.attachAuxEffect(i2);
                this.f10431s.setAuxEffectSendLevel(this.f10408V.f10356b);
            }
            this.f10392F = true;
        } catch (AudioSink.InitializationException e2) {
            if (this.f10430r.m6201f()) {
                this.f10411Y = true;
            }
            AudioSink.Listener listener = this.f10428p;
            if (listener != null) {
                listener.mo6140b(e2);
            }
            throw e2;
        }
    }

    /* renamed from: B */
    public final boolean m6175B() {
        return this.f10431s != null;
    }

    /* renamed from: D */
    public final void m6176D() {
        if (this.f10404R) {
            return;
        }
        this.f10404R = true;
        AudioTrackPositionTracker audioTrackPositionTracker = this.f10421i;
        long m6191z = m6191z();
        audioTrackPositionTracker.f10354z = audioTrackPositionTracker.m6148b();
        audioTrackPositionTracker.f10352x = SystemClock.elapsedRealtime() * 1000;
        audioTrackPositionTracker.f10323A = m6191z;
        this.f10431s.stop();
        this.f10437y = 0;
    }

    /* renamed from: E */
    public final void m6177E(long j2) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f10395I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f10396J[i2 - 1];
            } else {
                byteBuffer = this.f10397K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f10299a;
                }
            }
            if (i2 == length) {
                m6184L(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.f10395I[i2];
                if (i2 > this.f10402P) {
                    audioProcessor.mo6115d(byteBuffer);
                }
                ByteBuffer mo6113b = audioProcessor.mo6113b();
                this.f10396J[i2] = mo6113b;
                if (mo6113b.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* renamed from: F */
    public final void m6178F() {
        this.f10438z = 0L;
        this.f10387A = 0L;
        this.f10388B = 0L;
        this.f10389C = 0L;
        this.f10412Z = false;
        this.f10390D = 0;
        this.f10434v = new MediaPositionParameters(m6188v(), m6190y(), 0L, 0L, null);
        this.f10393G = 0L;
        this.f10433u = null;
        this.f10422j.clear();
        this.f10397K = null;
        this.f10398L = 0;
        this.f10399M = null;
        this.f10404R = false;
        this.f10403Q = false;
        this.f10402P = -1;
        this.f10436x = null;
        this.f10437y = 0;
        this.f10417e.f10550o = 0L;
        m6187t();
    }

    /* renamed from: G */
    public final void m6179G(PlaybackParameters playbackParameters, boolean z) {
        MediaPositionParameters m6189x = m6189x();
        if (playbackParameters.equals(m6189x.f10453a) && z == m6189x.f10454b) {
            return;
        }
        MediaPositionParameters mediaPositionParameters = new MediaPositionParameters(playbackParameters, z, -9223372036854775807L, -9223372036854775807L, null);
        if (m6175B()) {
            this.f10433u = mediaPositionParameters;
        } else {
            this.f10434v = mediaPositionParameters;
        }
    }

    @RequiresApi
    /* renamed from: H */
    public final void m6180H(PlaybackParameters playbackParameters) {
        if (m6175B()) {
            try {
                this.f10431s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.f9949b).setPitch(playbackParameters.f9950c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                com.google.android.exoplayer2.util.Log.m7588e("DefaultAudioSink", "Failed to set playback params", e2);
            }
            playbackParameters = new PlaybackParameters(this.f10431s.getPlaybackParams().getSpeed(), this.f10431s.getPlaybackParams().getPitch());
            AudioTrackPositionTracker audioTrackPositionTracker = this.f10421i;
            audioTrackPositionTracker.f10338j = playbackParameters.f9949b;
            AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f10334f;
            if (audioTimestampPoller != null) {
                audioTimestampPoller.m6145a();
            }
        }
        this.f10435w = playbackParameters;
    }

    /* renamed from: I */
    public final void m6181I() {
        if (m6175B()) {
            if (Util.f14736a >= 21) {
                this.f10431s.setVolume(this.f10394H);
                return;
            }
            AudioTrack audioTrack = this.f10431s;
            float f2 = this.f10394H;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* renamed from: J */
    public final boolean m6182J() {
        if (this.f10409W || !"audio/raw".equals(this.f10430r.f10441a.f9659m)) {
            return false;
        }
        return !(this.f10415c && Util.m7712K(this.f10430r.f10441a.f9642B));
    }

    /* renamed from: K */
    public final boolean m6183K(Format format, AudioAttributes audioAttributes) {
        int m7750s;
        int i2 = Util.f14736a;
        if (i2 < 29 || this.f10424l == 0) {
            return false;
        }
        String str = format.f9659m;
        Objects.requireNonNull(str);
        int m7596d = MimeTypes.m7596d(str, format.f9656j);
        if (m7596d == 0 || (m7750s = Util.m7750s(format.f9672z)) == 0) {
            return false;
        }
        AudioFormat m6172u = m6172u(format.f9641A, m7750s, m7596d);
        android.media.AudioAttributes m6108b = audioAttributes.m6108b();
        int playbackOffloadSupport = i2 >= 31 ? AudioManager.getPlaybackOffloadSupport(m6172u, m6108b) : !AudioManager.isOffloadedPlaybackSupported(m6172u, m6108b) ? 0 : (i2 == 30 && Util.f14739d.startsWith("Pixel")) ? 2 : 1;
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((format.f9643C != 0 || format.f9644D != 0) && (this.f10424l == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e2, code lost:
    
        if (r15 < r14) goto L47;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6184L(java.nio.ByteBuffer r13, long r14) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6184L(java.nio.ByteBuffer, long):void");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: a */
    public boolean mo6122a(Format format) {
        return mo6135n(format) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: b */
    public void mo6123b() throws AudioSink.WriteException {
        if (!this.f10403Q && m6175B() && m6186s()) {
            m6176D();
            this.f10403Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: c */
    public boolean mo6124c() {
        return !m6175B() || (this.f10403Q && !mo6126e());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: d */
    public void mo6125d(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.m7740i(playbackParameters.f9949b, 0.1f, 8.0f), Util.m7740i(playbackParameters.f9950c, 0.1f, 8.0f));
        if (!this.f10423k || Util.f14736a < 23) {
            m6179G(playbackParameters2, m6190y());
        } else {
            m6180H(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: e */
    public boolean mo6126e() {
        return m6175B() && this.f10421i.m6149c(m6191z());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: f */
    public void mo6127f(int i2) {
        if (this.f10407U != i2) {
            this.f10407U = i2;
            this.f10406T = i2 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (m6175B()) {
            m6178F();
            AudioTrack audioTrack = this.f10421i.f10331c;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f10431s.pause();
            }
            if (m6171C(this.f10431s)) {
                StreamEventCallbackV29 streamEventCallbackV29 = this.f10425m;
                Objects.requireNonNull(streamEventCallbackV29);
                this.f10431s.unregisterStreamEventCallback(streamEventCallbackV29.f10462b);
                streamEventCallbackV29.f10461a.removeCallbacksAndMessages(null);
            }
            final AudioTrack audioTrack2 = this.f10431s;
            this.f10431s = null;
            if (Util.f14736a < 21 && !this.f10406T) {
                this.f10407U = 0;
            }
            Configuration configuration = this.f10429q;
            if (configuration != null) {
                this.f10430r = configuration;
                this.f10429q = null;
            }
            this.f10421i.m6150d();
            this.f10420h.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack2.flush();
                        audioTrack2.release();
                    } finally {
                        DefaultAudioSink.this.f10420h.open();
                    }
                }
            }.start();
        }
        this.f10427o.f10458b = null;
        this.f10426n.f10458b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ab A[Catch: Exception -> 0x01b5, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b5, blocks: (B:65:0x0181, B:67:0x01ab), top: B:64:0x0181 }] */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6128g(boolean r27) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo6128g(boolean):long");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.f10423k ? this.f10435w : m6188v();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: h */
    public void mo6129h() {
        if (this.f10409W) {
            this.f10409W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: i */
    public void mo6130i(AudioAttributes audioAttributes) {
        if (this.f10432t.equals(audioAttributes)) {
            return;
        }
        this.f10432t = audioAttributes;
        if (this.f10409W) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: j */
    public void mo6131j() {
        this.f10391E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: k */
    public void mo6132k() {
        Assertions.m7516d(Util.f14736a >= 21);
        Assertions.m7516d(this.f10406T);
        if (this.f10409W) {
            return;
        }
        this.f10409W = true;
        flush();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00ea, code lost:
    
        if (r5.m6148b() == 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo6133l(java.nio.ByteBuffer r19, long r20, int r22) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo6133l(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: m */
    public void mo6134m(AudioSink.Listener listener) {
        this.f10428p = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: n */
    public int mo6135n(Format format) {
        if (!"audio/raw".equals(format.f9659m)) {
            if (this.f10411Y || !m6183K(format, this.f10432t)) {
                return m6173w(format, this.f10413a) != null ? 2 : 0;
            }
            return 2;
        }
        if (Util.m7713L(format.f9642B)) {
            int i2 = format.f9642B;
            return (i2 == 2 || (this.f10415c && i2 == 4)) ? 2 : 1;
        }
        C0576a.m4123v(33, "Invalid PCM encoding: ", format.f9642B, "DefaultAudioSink");
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: o */
    public void mo6136o(Format format, int i2, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int intValue;
        int intValue2;
        AudioProcessor[] audioProcessorArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        if ("audio/raw".equals(format.f9659m)) {
            Assertions.m7513a(Util.m7713L(format.f9642B));
            i5 = Util.m7703B(format.f9642B, format.f9672z);
            AudioProcessor[] audioProcessorArr2 = ((this.f10415c && Util.m7712K(format.f9642B)) ? 1 : 0) != 0 ? this.f10419g : this.f10418f;
            TrimmingAudioProcessor trimmingAudioProcessor = this.f10417e;
            int i9 = format.f9643C;
            int i10 = format.f9644D;
            trimmingAudioProcessor.f10544i = i9;
            trimmingAudioProcessor.f10545j = i10;
            if (Util.f14736a < 21 && format.f9672z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i11 = 0; i11 < 6; i11++) {
                    iArr2[i11] = i11;
                }
            } else {
                iArr2 = iArr;
            }
            this.f10416d.f10364i = iArr2;
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format.f9641A, format.f9672z, format.f9642B);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.AudioFormat mo6116e = audioProcessor.mo6116e(audioFormat);
                    if (audioProcessor.mo6112a()) {
                        audioFormat = mo6116e;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                    throw new AudioSink.ConfigurationException(e2, format);
                }
            }
            int i12 = audioFormat.f10303c;
            i7 = audioFormat.f10301a;
            i4 = Util.m7750s(audioFormat.f10302b);
            audioProcessorArr = audioProcessorArr2;
            i3 = i12;
            i6 = Util.m7703B(i12, audioFormat.f10302b);
            i8 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i13 = format.f9641A;
            if (m6183K(format, this.f10432t)) {
                String str = format.f9659m;
                Objects.requireNonNull(str);
                intValue = MimeTypes.m7596d(str, format.f9656j);
                intValue2 = Util.m7750s(format.f9672z);
            } else {
                Pair<Integer, Integer> m6173w = m6173w(format, this.f10413a);
                if (m6173w == null) {
                    String valueOf = String.valueOf(format);
                    throw new AudioSink.ConfigurationException(C0576a.m4114m(valueOf.length() + 37, "Unable to configure passthrough for: ", valueOf), format);
                }
                intValue = ((Integer) m6173w.first).intValue();
                intValue2 = ((Integer) m6173w.second).intValue();
                r2 = 2;
            }
            audioProcessorArr = audioProcessorArr3;
            i3 = intValue;
            i4 = intValue2;
            i5 = -1;
            i6 = -1;
            i7 = i13;
            i8 = r2;
        }
        if (i3 == 0) {
            String valueOf2 = String.valueOf(format);
            StringBuilder sb = new StringBuilder(valueOf2.length() + 48);
            sb.append("Invalid output encoding (mode=");
            sb.append(i8);
            sb.append(") for: ");
            sb.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb.toString(), format);
        }
        if (i4 != 0) {
            this.f10411Y = false;
            Configuration configuration = new Configuration(format, i5, i8, i6, i7, i4, i3, i2, this.f10423k, audioProcessorArr);
            if (m6175B()) {
                this.f10429q = configuration;
                return;
            } else {
                this.f10430r = configuration;
                return;
            }
        }
        String valueOf3 = String.valueOf(format);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 54);
        sb2.append("Invalid output channel config (mode=");
        sb2.append(i8);
        sb2.append(") for: ");
        sb2.append(valueOf3);
        throw new AudioSink.ConfigurationException(sb2.toString(), format);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: p */
    public void mo6137p(boolean z) {
        m6179G(m6188v(), z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        boolean z = false;
        this.f10405S = false;
        if (m6175B()) {
            AudioTrackPositionTracker audioTrackPositionTracker = this.f10421i;
            audioTrackPositionTracker.f10340l = 0L;
            audioTrackPositionTracker.f10351w = 0;
            audioTrackPositionTracker.f10350v = 0;
            audioTrackPositionTracker.f10341m = 0L;
            audioTrackPositionTracker.f10325C = 0L;
            audioTrackPositionTracker.f10328F = 0L;
            audioTrackPositionTracker.f10339k = false;
            if (audioTrackPositionTracker.f10352x == -9223372036854775807L) {
                AudioTimestampPoller audioTimestampPoller = audioTrackPositionTracker.f10334f;
                Objects.requireNonNull(audioTimestampPoller);
                audioTimestampPoller.m6145a();
                z = true;
            }
            if (z) {
                this.f10431s.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.f10405S = true;
        if (m6175B()) {
            AudioTimestampPoller audioTimestampPoller = this.f10421i.f10334f;
            Objects.requireNonNull(audioTimestampPoller);
            audioTimestampPoller.m6145a();
            this.f10431s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    /* renamed from: q */
    public void mo6138q(AuxEffectInfo auxEffectInfo) {
        if (this.f10408V.equals(auxEffectInfo)) {
            return;
        }
        int i2 = auxEffectInfo.f10355a;
        float f2 = auxEffectInfo.f10356b;
        AudioTrack audioTrack = this.f10431s;
        if (audioTrack != null) {
            if (this.f10408V.f10355a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.f10431s.setAuxEffectSendLevel(f2);
            }
        }
        this.f10408V = auxEffectInfo;
    }

    /* renamed from: r */
    public final void m6185r(long j2) {
        PlaybackParameters mo6192a = m6182J() ? this.f10414b.mo6192a(m6188v()) : PlaybackParameters.f9948e;
        boolean mo6195d = m6182J() ? this.f10414b.mo6195d(m6190y()) : false;
        this.f10422j.add(new MediaPositionParameters(mo6192a, mo6195d, Math.max(0L, j2), this.f10430r.m6199c(m6191z()), null));
        AudioProcessor[] audioProcessorArr = this.f10430r.f10449i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.mo6112a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f10395I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f10396J = new ByteBuffer[size];
        m6187t();
        AudioSink.Listener listener = this.f10428p;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(mo6195d);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f10418f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f10419g) {
            audioProcessor2.reset();
        }
        this.f10405S = false;
        this.f10411Y = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m6186s() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.f10402P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f10402P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f10402P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f10395I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo6117f()
        L1f:
            r9.m6177E(r7)
            boolean r0 = r4.mo6114c()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f10402P
            int r0 = r0 + r2
            r9.f10402P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f10399M
            if (r0 == 0) goto L3b
            r9.m6184L(r0, r7)
            java.nio.ByteBuffer r0 = r9.f10399M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f10402P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m6186s():boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f2) {
        if (this.f10394H != f2) {
            this.f10394H = f2;
            m6181I();
        }
    }

    /* renamed from: t */
    public final void m6187t() {
        int i2 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f10395I;
            if (i2 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i2];
            audioProcessor.flush();
            this.f10396J[i2] = audioProcessor.mo6113b();
            i2++;
        }
    }

    /* renamed from: v */
    public final PlaybackParameters m6188v() {
        return m6189x().f10453a;
    }

    /* renamed from: x */
    public final MediaPositionParameters m6189x() {
        MediaPositionParameters mediaPositionParameters = this.f10433u;
        return mediaPositionParameters != null ? mediaPositionParameters : !this.f10422j.isEmpty() ? this.f10422j.getLast() : this.f10434v;
    }

    /* renamed from: y */
    public boolean m6190y() {
        return m6189x().f10454b;
    }

    /* renamed from: z */
    public final long m6191z() {
        return this.f10430r.f10443c == 0 ? this.f10388B / r0.f10444d : this.f10389C;
    }
}
