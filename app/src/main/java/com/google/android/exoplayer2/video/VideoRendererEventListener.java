package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.RunnableC0976c;
import com.google.android.exoplayer2.audio.RunnableC0978e;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import java.util.Objects;

/* loaded from: classes.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        /* renamed from: a */
        @Nullable
        public final Handler f14898a;

        /* renamed from: b */
        @Nullable
        public final VideoRendererEventListener f14899b;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f14898a = handler;
            this.f14899b = videoRendererEventListener;
        }

        /* renamed from: a */
        public void m7815a(String str, long j2, long j3) {
            Handler handler = this.f14898a;
            if (handler != null) {
                handler.post(new RunnableC0978e(this, str, j2, j3, 1));
            }
        }

        /* renamed from: b */
        public void m7816b(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f14898a;
            if (handler != null) {
                handler.post(new RunnableC1179a(this, decoderCounters, 0));
            }
        }

        /* renamed from: c */
        public void m7817c(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f14898a;
            if (handler != null) {
                handler.post(new RunnableC0976c(this, format, decoderReuseEvaluation, 3));
            }
        }

        /* renamed from: d */
        public void m7818d(Object obj) {
            if (this.f14898a != null) {
                this.f14898a.post(new RunnableC1181c(this, obj, SystemClock.elapsedRealtime(), 0));
            }
        }

        /* renamed from: e */
        public void m7819e(VideoSize videoSize) {
            Handler handler = this.f14898a;
            if (handler != null) {
                handler.post(new RunnableC0207a(this, videoSize, 9));
            }
        }
    }

    /* renamed from: B */
    void mo5952B(DecoderCounters decoderCounters);

    /* renamed from: G */
    void mo5954G(long j2, int i2);

    /* renamed from: a */
    void mo5955a(String str);

    /* renamed from: e */
    void mo5959e(String str, long j2, long j3);

    /* renamed from: n */
    void mo5964n(int i2, long j2);

    void onVideoSizeChanged(VideoSize videoSize);

    /* renamed from: q */
    void mo5967q(Object obj, long j2);

    @Deprecated
    /* renamed from: s */
    void mo5969s(Format format);

    /* renamed from: t */
    void mo5970t(DecoderCounters decoderCounters);

    /* renamed from: u */
    void mo5971u(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    /* renamed from: z */
    void mo5975z(Exception exc);
}
