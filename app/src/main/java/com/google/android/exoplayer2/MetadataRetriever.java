package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MetadataRetriever {

    public static final class MetadataRetrieverInternal {

        public final class MediaSourceHandlerCallback implements Handler.Callback {

            /* renamed from: b */
            public MediaPeriod f9917b;

            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {

                /* renamed from: b */
                public boolean f9918b;

                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
                    /* renamed from: e */
                    public void mo5784e(MediaPeriod mediaPeriod) {
                        Objects.requireNonNull(null);
                        throw null;
                    }

                    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
                    /* renamed from: g */
                    public void mo5787g(MediaPeriod mediaPeriod) {
                        Objects.requireNonNull(null);
                        throw null;
                    }
                }

                @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
                /* renamed from: b */
                public void mo5903b(MediaSource mediaSource, Timeline timeline) {
                    if (this.f9918b) {
                        return;
                    }
                    this.f9918b = true;
                    mediaSource.mo6797a(new MediaSource.MediaPeriodId(timeline.mo5615o(0)), null, 0L);
                    throw null;
                }
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    Objects.requireNonNull(null);
                    throw null;
                }
                if (i2 == 1) {
                    try {
                        MediaPeriod mediaPeriod = this.f9917b;
                        if (mediaPeriod == null) {
                            Objects.requireNonNull(null);
                            throw null;
                        }
                        mediaPeriod.maybeThrowPrepareError();
                        Objects.requireNonNull(null);
                        throw null;
                    } catch (Exception unused) {
                        Objects.requireNonNull(null);
                        throw null;
                    }
                }
                if (i2 == 2) {
                    MediaPeriod mediaPeriod2 = this.f9917b;
                    Objects.requireNonNull(mediaPeriod2);
                    mediaPeriod2.continueLoading(0L);
                    return true;
                }
                if (i2 != 3) {
                    return false;
                }
                if (this.f9917b != null) {
                    Objects.requireNonNull(null);
                    throw null;
                }
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }
}
