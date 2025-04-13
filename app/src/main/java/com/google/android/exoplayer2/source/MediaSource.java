package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

/* loaded from: classes.dex */
public interface MediaSource {

    public static final class MediaPeriodId extends com.google.android.exoplayer2.source.MediaPeriodId {
        public MediaPeriodId(Object obj) {
            super(obj);
        }

        /* renamed from: b */
        public MediaPeriodId m6829b(Object obj) {
            return new MediaPeriodId(this.f12356a.equals(obj) ? this : new com.google.android.exoplayer2.source.MediaPeriodId(obj, this.f12357b, this.f12358c, this.f12359d, this.f12360e));
        }

        public MediaPeriodId(Object obj, long j2) {
            super(obj, j2);
        }

        public MediaPeriodId(Object obj, long j2, int i2) {
            super(obj, j2, i2);
        }

        public MediaPeriodId(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public MediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId) {
            super(mediaPeriodId);
        }
    }

    public interface MediaSourceCaller {
        /* renamed from: b */
        void mo5903b(MediaSource mediaSource, Timeline timeline);
    }

    /* renamed from: a */
    MediaPeriod mo6797a(MediaPeriodId mediaPeriodId, Allocator allocator, long j2);

    /* renamed from: c */
    void mo6769c(MediaSourceCaller mediaSourceCaller);

    /* renamed from: e */
    void mo6770e(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    MediaItem getMediaItem();

    /* renamed from: k */
    void mo6771k(MediaSourceEventListener mediaSourceEventListener);

    /* renamed from: l */
    void mo6772l(MediaSourceCaller mediaSourceCaller);

    void maybeThrowSourceInfoRefreshError() throws IOException;

    /* renamed from: n */
    void mo6773n(Handler handler, DrmSessionEventListener drmSessionEventListener);

    /* renamed from: o */
    void mo6774o(DrmSessionEventListener drmSessionEventListener);

    /* renamed from: q */
    boolean mo6775q();

    /* renamed from: s */
    void mo6798s(MediaPeriod mediaPeriod);

    @Nullable
    /* renamed from: t */
    Timeline mo6776t();

    /* renamed from: u */
    void mo6777u(MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener);

    /* renamed from: v */
    void mo6778v(MediaSourceCaller mediaSourceCaller);
}
