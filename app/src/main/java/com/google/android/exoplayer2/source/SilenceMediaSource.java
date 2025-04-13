package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class SilenceMediaSource extends BaseMediaSource {

    /* renamed from: h */
    public static final Format f12530h;

    /* renamed from: i */
    public static final byte[] f12531i;

    public static final class Factory {
    }

    public static final class SilenceMediaPeriod implements MediaPeriod {

        /* renamed from: d */
        public static final TrackGroupArray f12532d = new TrackGroupArray(new TrackGroup(SilenceMediaSource.f12530h));

        /* renamed from: b */
        public final long f12533b;

        /* renamed from: c */
        public final ArrayList<SampleStream> f12534c = new ArrayList<>();

        public SilenceMediaPeriod(long j2) {
            this.f12533b = j2;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: c */
        public long mo6788c(long j2, SeekParameters seekParameters) {
            return Util.m7742k(j2, 0L, this.f12533b);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j2) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return f12532d;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: i */
        public void mo6789i(MediaPeriod.Callback callback, long j2) {
            callback.mo5787g(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        /* renamed from: j */
        public long mo6790j(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
            long m7742k = Util.m7742k(j2, 0L, this.f12533b);
            for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                if (sampleStreamArr[i2] != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                    this.f12534c.remove(sampleStreamArr[i2]);
                    sampleStreamArr[i2] = null;
                }
                if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.f12533b);
                    silenceSampleStream.m6916c(m7742k);
                    this.f12534c.add(silenceSampleStream);
                    sampleStreamArr[i2] = silenceSampleStream;
                    zArr2[i2] = true;
                }
            }
            return m7742k;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j2) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j2) {
            long m7742k = Util.m7742k(j2, 0L, this.f12533b);
            for (int i2 = 0; i2 < this.f12534c.size(); i2++) {
                ((SilenceSampleStream) this.f12534c.get(i2)).m6916c(m7742k);
            }
            return m7742k;
        }
    }

    public static final class SilenceSampleStream implements SampleStream {

        /* renamed from: b */
        public final long f12535b;

        /* renamed from: c */
        public boolean f12536c;

        /* renamed from: d */
        public long f12537d;

        public SilenceSampleStream(long j2) {
            Format format = SilenceMediaSource.f12530h;
            this.f12535b = Util.m7703B(2, 2) * ((j2 * 44100) / 1000000);
            m6916c(0L);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        public void mo6791a() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public boolean mo6792b() {
            return true;
        }

        /* renamed from: c */
        public void m6916c(long j2) {
            Format format = SilenceMediaSource.f12530h;
            this.f12537d = Util.m7742k(Util.m7703B(2, 2) * ((j2 * 44100) / 1000000), 0L, this.f12535b);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public int mo6793d(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (!this.f12536c || (i2 & 2) != 0) {
                formatHolder.f9704b = SilenceMediaSource.f12530h;
                this.f12536c = true;
                return -5;
            }
            long j2 = this.f12535b;
            long j3 = this.f12537d;
            long j4 = j2 - j3;
            if (j4 == 0) {
                decoderInputBuffer.m6238e(4);
                return -4;
            }
            Format format = SilenceMediaSource.f12530h;
            decoderInputBuffer.f10607f = ((j3 / Util.m7703B(2, 2)) * 1000000) / 44100;
            decoderInputBuffer.m6238e(1);
            byte[] bArr = SilenceMediaSource.f12531i;
            int min = (int) Math.min(bArr.length, j4);
            if ((i2 & 4) == 0) {
                decoderInputBuffer.m6250n(min);
                decoderInputBuffer.f10605d.put(bArr, 0, min);
            }
            if ((i2 & 1) == 0) {
                this.f12537d += min;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: h */
        public int mo6794h(long j2) {
            long j3 = this.f12537d;
            m6916c(j2);
            return (int) ((this.f12537d - j3) / SilenceMediaSource.f12531i.length);
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "audio/raw";
        builder.f9700x = 2;
        builder.f9701y = 44100;
        builder.f9702z = 2;
        Format m5833a = builder.m5833a();
        f12530h = m5833a;
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.f9718a = "SilenceMediaSource";
        builder2.f9719b = Uri.EMPTY;
        builder2.f9720c = m5833a.f9659m;
        builder2.m5839a();
        f12531i = new byte[Util.m7703B(2, 2) * RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        m6767G(new SinglePeriodTimeline(0L, true, false, false, null, null));
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        return new SilenceMediaPeriod(0L);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
    }
}
