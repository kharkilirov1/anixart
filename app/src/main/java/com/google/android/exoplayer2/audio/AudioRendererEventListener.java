package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        /* renamed from: a */
        @Nullable
        public final Handler f10305a;

        /* renamed from: b */
        @Nullable
        public final AudioRendererEventListener f10306b;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f10305a = handler;
            this.f10306b = audioRendererEventListener;
        }

        /* renamed from: a */
        public void m6118a(String str, long j2, long j3) {
            Handler handler = this.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0978e(this, str, j2, j3, 0));
            }
        }

        /* renamed from: b */
        public void m6119b(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0974a(this, decoderCounters, 0));
            }
        }

        /* renamed from: c */
        public void m6120c(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.f10305a;
            if (handler != null) {
                handler.post(new RunnableC0976c(this, format, decoderReuseEvaluation, 0));
            }
        }

        /* renamed from: d */
        public void m6121d(final int i2, final long j2, final long j3) {
            Handler handler = this.f10305a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.exoplayer2.audio.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioRendererEventListener.EventDispatcher eventDispatcher = AudioRendererEventListener.EventDispatcher.this;
                        int i3 = i2;
                        long j4 = j2;
                        long j5 = j3;
                        AudioRendererEventListener audioRendererEventListener = eventDispatcher.f10306b;
                        int i4 = Util.f14736a;
                        audioRendererEventListener.mo5953E(i3, j4, j5);
                    }
                });
            }
        }
    }

    /* renamed from: E */
    void mo5953E(int i2, long j2, long j3);

    /* renamed from: b */
    void mo5956b(Exception exc);

    /* renamed from: c */
    void mo5957c(DecoderCounters decoderCounters);

    /* renamed from: d */
    void mo5958d(DecoderCounters decoderCounters);

    /* renamed from: l */
    void mo5962l(String str);

    /* renamed from: m */
    void mo5963m(String str, long j2, long j3);

    /* renamed from: o */
    void mo5965o(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onSkipSilenceEnabledChanged(boolean z);

    /* renamed from: v */
    void mo5972v(long j2);

    /* renamed from: x */
    void mo5973x(Exception exc);

    @Deprecated
    /* renamed from: y */
    void mo5974y(Format format);
}
