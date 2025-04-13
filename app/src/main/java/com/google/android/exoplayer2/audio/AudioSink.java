package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface AudioSink {

    public static final class InitializationException extends Exception {

        /* renamed from: b */
        public final boolean f10308b;

        /* renamed from: c */
        public final Format f10309c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InitializationException(int r4, int r5, int r6, int r7, com.google.android.exoplayer2.Format r8, boolean r9, @androidx.annotation.Nullable java.lang.Exception r10) {
            /*
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " "
                r2.append(r4)
                java.lang.String r4 = "Config("
                r2.append(r4)
                java.lang.String r4 = ", "
                androidx.room.util.C0576a.m4127z(r2, r5, r4, r6, r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4, r10)
                r3.f10308b = r9
                r3.f10309c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, com.google.android.exoplayer2.Format, boolean, java.lang.Exception):void");
        }
    }

    public interface Listener {
        /* renamed from: a */
        void mo6139a(long j2);

        /* renamed from: b */
        void mo6140b(Exception exc);

        /* renamed from: c */
        void mo6141c(int i2, long j2, long j3);

        /* renamed from: d */
        void mo6142d(long j2);

        /* renamed from: e */
        void mo6143e();

        /* renamed from: f */
        void mo6144f();

        void onSkipSilenceEnabledChanged(boolean z);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedDiscontinuityException(long r4, long r6) {
            /*
                r3 = this;
                r0 = 103(0x67, float:1.44E-43)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                java.lang.String r2 = ", got "
                java.lang.StringBuilder r6 = androidx.room.util.C0576a.m4121t(r0, r1, r6, r2)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }

    public static final class WriteException extends Exception {

        /* renamed from: b */
        public final boolean f10310b;

        /* renamed from: c */
        public final Format f10311c;

        public WriteException(int i2, Format format, boolean z) {
            super(C0576a.m4111j(36, "AudioTrack write failed: ", i2));
            this.f10310b = z;
            this.f10311c = format;
        }
    }

    /* renamed from: a */
    boolean mo6122a(Format format);

    /* renamed from: b */
    void mo6123b() throws WriteException;

    /* renamed from: c */
    boolean mo6124c();

    /* renamed from: d */
    void mo6125d(PlaybackParameters playbackParameters);

    /* renamed from: e */
    boolean mo6126e();

    /* renamed from: f */
    void mo6127f(int i2);

    void flush();

    /* renamed from: g */
    long mo6128g(boolean z);

    PlaybackParameters getPlaybackParameters();

    /* renamed from: h */
    void mo6129h();

    /* renamed from: i */
    void mo6130i(AudioAttributes audioAttributes);

    /* renamed from: j */
    void mo6131j();

    /* renamed from: k */
    void mo6132k();

    /* renamed from: l */
    boolean mo6133l(ByteBuffer byteBuffer, long j2, int i2) throws InitializationException, WriteException;

    /* renamed from: m */
    void mo6134m(Listener listener);

    /* renamed from: n */
    int mo6135n(Format format);

    /* renamed from: o */
    void mo6136o(Format format, int i2, @Nullable int[] iArr) throws ConfigurationException;

    /* renamed from: p */
    void mo6137p(boolean z);

    void pause();

    void play();

    /* renamed from: q */
    void mo6138q(AuxEffectInfo auxEffectInfo);

    void reset();

    void setVolume(float f2);

    public static final class ConfigurationException extends Exception {

        /* renamed from: b */
        public final Format f10307b;

        public ConfigurationException(Throwable th, Format format) {
            super(th);
            this.f10307b = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.f10307b = format;
        }
    }
}
