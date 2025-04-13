package com.google.android.exoplayer2.offline;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class DownloadHelper {

    /* renamed from: com.google.android.exoplayer2.offline.DownloadHelper$1 */
    class C10711 implements VideoRendererEventListener {
        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: B */
        public /* synthetic */ void mo5952B(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: G */
        public /* synthetic */ void mo5954G(long j2, int i2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: a */
        public /* synthetic */ void mo5955a(String str) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: e */
        public /* synthetic */ void mo5959e(String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: n */
        public /* synthetic */ void mo5964n(int i2, long j2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: q */
        public /* synthetic */ void mo5967q(Object obj, long j2) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: s */
        public /* synthetic */ void mo5969s(Format format) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: t */
        public /* synthetic */ void mo5970t(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: u */
        public /* synthetic */ void mo5971u(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        /* renamed from: z */
        public /* synthetic */ void mo5975z(Exception exc) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadHelper$2 */
    class C10722 implements AudioRendererEventListener {
        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: E */
        public /* synthetic */ void mo5953E(int i2, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: b */
        public /* synthetic */ void mo5956b(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: c */
        public /* synthetic */ void mo5957c(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: d */
        public /* synthetic */ void mo5958d(DecoderCounters decoderCounters) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: l */
        public /* synthetic */ void mo5962l(String str) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: m */
        public /* synthetic */ void mo5963m(String str, long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: o */
        public /* synthetic */ void mo5965o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: v */
        public /* synthetic */ void mo5972v(long j2) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: x */
        public /* synthetic */ void mo5973x(Exception exc) {
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        /* renamed from: y */
        public /* synthetic */ void mo5974y(Format format) {
        }
    }

    public interface Callback {
    }

    public static final class DownloadTrackSelection extends BaseTrackSelection {

        public static final class Factory implements ExoTrackSelection.Factory {
            @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
            /* renamed from: a */
            public ExoTrackSelection[] mo6740a(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
                ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
                for (int i2 = 0; i2 < definitionArr.length; i2++) {
                    exoTrackSelectionArr[i2] = definitionArr[i2] == null ? null : new DownloadTrackSelection(definitionArr[i2].f13955a, definitionArr[i2].f13956b);
                }
                return exoTrackSelectionArr;
            }
        }

        public DownloadTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr, 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: b */
        public int mo6736b() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: m */
        public void mo6737m(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        /* renamed from: p */
        public int mo6738p() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        /* renamed from: r */
        public Object mo6739r() {
            return null;
        }
    }

    public static final class FakeBandwidthMeter implements BandwidthMeter {
        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        /* renamed from: a */
        public /* synthetic */ long mo6741a() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        @Nullable
        /* renamed from: d */
        public TransferListener mo6742d() {
            return null;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        /* renamed from: e */
        public void mo6743e(BandwidthMeter.EventListener eventListener) {
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        /* renamed from: f */
        public long mo6744f() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
        /* renamed from: h */
        public void mo6745h(Handler handler, BandwidthMeter.EventListener eventListener) {
        }
    }

    public static class LiveContentUnsupportedException extends IOException {
    }

    public static final class MediaPreparer implements MediaSource.MediaSourceCaller, MediaPeriod.Callback, Handler.Callback {

        /* renamed from: b */
        public Timeline f12147b;

        /* renamed from: c */
        public MediaPeriod[] f12148c;

        @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
        /* renamed from: b */
        public void mo5903b(MediaSource mediaSource, Timeline timeline) {
            if (this.f12147b != null) {
                return;
            }
            if (timeline.m5990p(0, new Timeline.Window()).m6004d()) {
                new LiveContentUnsupportedException();
                throw null;
            }
            this.f12147b = timeline;
            int mo5936k = timeline.mo5936k();
            MediaPeriod[] mediaPeriodArr = new MediaPeriod[mo5936k];
            this.f12148c = mediaPeriodArr;
            if (mo5936k > 0) {
                timeline.mo5615o(0);
                throw null;
            }
            for (int i2 = 0; i2 < mo5936k; i2++) {
                mediaPeriodArr[i2].mo6789i(this, 0L);
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* renamed from: e */
        public void mo5784e(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        /* renamed from: g */
        public void mo5787g(MediaPeriod mediaPeriod) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            throw null;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r0 = r4.what
                r1 = 0
                if (r0 == 0) goto L27
                r2 = 1
                if (r0 == r2) goto L20
                r2 = 2
                if (r0 == r2) goto L1b
                r4 = 3
                r2 = 0
                if (r0 == r4) goto L10
                return r2
            L10:
                com.google.android.exoplayer2.source.MediaPeriod[] r4 = r3.f12148c
                if (r4 == 0) goto L1a
                int r0 = r4.length
                if (r0 <= 0) goto L1a
                r4 = r4[r2]
                throw r1
            L1a:
                throw r1
            L1b:
                java.lang.Object r4 = r4.obj
                com.google.android.exoplayer2.source.MediaPeriod r4 = (com.google.android.exoplayer2.source.MediaPeriod) r4
                throw r1
            L20:
                com.google.android.exoplayer2.source.MediaPeriod[] r4 = r3.f12148c     // Catch: java.io.IOException -> L26
                if (r4 != 0) goto L25
                throw r1
            L25:
                throw r1
            L26:
                throw r1
            L27:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadHelper.MediaPreparer.handleMessage(android.os.Message):boolean");
        }
    }

    static {
        DefaultTrackSelector.ParametersBuilder parametersBuilder = new DefaultTrackSelector.ParametersBuilder(DefaultTrackSelector.Parameters.f13908N, (DefaultTrackSelector.C11341) null);
        parametersBuilder.f14026v = true;
        parametersBuilder.m7320f();
    }
}
