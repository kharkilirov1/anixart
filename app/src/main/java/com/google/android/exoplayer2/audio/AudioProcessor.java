package com.google.android.exoplayer2.audio;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f10299a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class AudioFormat {

        /* renamed from: e */
        public static final AudioFormat f10300e = new AudioFormat(-1, -1, -1);

        /* renamed from: a */
        public final int f10301a;

        /* renamed from: b */
        public final int f10302b;

        /* renamed from: c */
        public final int f10303c;

        /* renamed from: d */
        public final int f10304d;

        public AudioFormat(int i2, int i3, int i4) {
            this.f10301a = i2;
            this.f10302b = i3;
            this.f10303c = i4;
            this.f10304d = Util.m7713L(i4) ? Util.m7703B(i4, i3) : -1;
        }

        public String toString() {
            int i2 = this.f10301a;
            int i3 = this.f10302b;
            int i4 = this.f10303c;
            StringBuilder m4120s = C0576a.m4120s(83, "AudioFormat[sampleRate=", i2, ", channelCount=", i3);
            m4120s.append(", encoding=");
            m4120s.append(i4);
            m4120s.append(']');
            return m4120s.toString();
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.AudioFormat r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.String r1 = "Unhandled format: "
                java.lang.String r3 = androidx.room.util.C0576a.m4114m(r0, r1, r3)
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$AudioFormat):void");
        }
    }

    /* renamed from: a */
    boolean mo6112a();

    /* renamed from: b */
    ByteBuffer mo6113b();

    /* renamed from: c */
    boolean mo6114c();

    /* renamed from: d */
    void mo6115d(ByteBuffer byteBuffer);

    /* renamed from: e */
    AudioFormat mo6116e(AudioFormat audioFormat) throws UnhandledAudioFormatException;

    /* renamed from: f */
    void mo6117f();

    void flush();

    void reset();
}
