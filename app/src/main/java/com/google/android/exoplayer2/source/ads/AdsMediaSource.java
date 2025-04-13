package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p009ui.AdViewProvider;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {

    /* renamed from: w */
    public static final MediaSource.MediaPeriodId f12616w = new MediaSource.MediaPeriodId(new Object());

    /* renamed from: k */
    public final MediaSource f12617k;

    /* renamed from: l */
    public final MediaSourceFactory f12618l;

    /* renamed from: m */
    public final AdsLoader f12619m;

    /* renamed from: n */
    public final AdViewProvider f12620n;

    /* renamed from: o */
    public final DataSpec f12621o;

    /* renamed from: p */
    public final Object f12622p;

    /* renamed from: q */
    public final Handler f12623q;

    /* renamed from: r */
    public final Timeline.Period f12624r;

    /* renamed from: s */
    @Nullable
    public ComponentListener f12625s;

    /* renamed from: t */
    @Nullable
    public Timeline f12626t;

    /* renamed from: u */
    @Nullable
    public AdPlaybackState f12627u;

    /* renamed from: v */
    public AdMediaSourceHolder[][] f12628v;

    public static final class AdLoadException extends IOException {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public AdLoadException(int i2, Exception exc) {
            super(exc);
        }
    }

    public final class AdMediaSourceHolder {

        /* renamed from: a */
        public final MediaSource.MediaPeriodId f12629a;

        /* renamed from: b */
        public final List<MaskingMediaPeriod> f12630b = new ArrayList();

        /* renamed from: c */
        public Uri f12631c;

        /* renamed from: d */
        public MediaSource f12632d;

        /* renamed from: e */
        public Timeline f12633e;

        public AdMediaSourceHolder(MediaSource.MediaPeriodId mediaPeriodId) {
            this.f12629a = mediaPeriodId;
        }
    }

    public final class AdPrepareListener implements MaskingMediaPeriod.PrepareListener {

        /* renamed from: a */
        public final Uri f12635a;

        public AdPrepareListener(Uri uri) {
            this.f12635a = uri;
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        /* renamed from: a */
        public void mo6824a(MediaSource.MediaPeriodId mediaPeriodId) {
            AdsMediaSource.this.f12623q.post(new RunnableC1094b(this, mediaPeriodId, 0));
        }

        @Override // com.google.android.exoplayer2.source.MaskingMediaPeriod.PrepareListener
        /* renamed from: b */
        public void mo6825b(final MediaSource.MediaPeriodId mediaPeriodId, final IOException iOException) {
            AdsMediaSource adsMediaSource = AdsMediaSource.this;
            MediaSource.MediaPeriodId mediaPeriodId2 = AdsMediaSource.f12616w;
            adsMediaSource.f12230d.m6848s(0, mediaPeriodId, 0L).m6841l(new LoadEventInfo(LoadEventInfo.m6820a(), new DataSpec(this.f12635a, 0L, -1L), SystemClock.elapsedRealtime()), 6, new AdLoadException(0, iOException), true);
            AdsMediaSource.this.f12623q.post(new Runnable() { // from class: com.google.android.exoplayer2.source.ads.c
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.AdPrepareListener adPrepareListener = AdsMediaSource.AdPrepareListener.this;
                    MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
                    IOException iOException2 = iOException;
                    AdsMediaSource adsMediaSource2 = AdsMediaSource.this;
                    adsMediaSource2.f12619m.handlePrepareError(adsMediaSource2, mediaPeriodId3.f12357b, mediaPeriodId3.f12358c, iOException2);
                }
            });
        }
    }

    public final class ComponentListener implements AdsLoader.EventListener {

        /* renamed from: a */
        public final Handler f12637a = Util.m7744m();

        /* renamed from: b */
        public volatile boolean f12638b;

        public ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
        /* renamed from: a */
        public void mo6940a(AdPlaybackState adPlaybackState) {
            if (this.f12638b) {
                return;
            }
            this.f12637a.post(new RunnableC1094b(this, adPlaybackState, 1));
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        ComponentListener componentListener = new ComponentListener();
        this.f12625s = componentListener;
        m6801M(f12616w, this.f12617k);
        this.f12623q.post(new RunnableC1093a(this, componentListener, 0));
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        super.mo6768I();
        ComponentListener componentListener = this.f12625s;
        Objects.requireNonNull(componentListener);
        this.f12625s = null;
        componentListener.f12638b = true;
        componentListener.f12637a.removeCallbacksAndMessages(null);
        this.f12626t = null;
        this.f12627u = null;
        this.f12628v = new AdMediaSourceHolder[0][];
        this.f12623q.post(new RunnableC1093a(this, componentListener, 1));
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
        return mediaPeriodId3.m6828a() ? mediaPeriodId3 : mediaPeriodId2;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    public void mo6795L(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        if (mediaPeriodId2.m6828a()) {
            AdMediaSourceHolder adMediaSourceHolder = this.f12628v[mediaPeriodId2.f12357b][mediaPeriodId2.f12358c];
            Objects.requireNonNull(adMediaSourceHolder);
            Assertions.m7513a(timeline.mo5936k() == 1);
            if (adMediaSourceHolder.f12633e == null) {
                Object mo5615o = timeline.mo5615o(0);
                for (int i2 = 0; i2 < adMediaSourceHolder.f12630b.size(); i2++) {
                    MaskingMediaPeriod maskingMediaPeriod = adMediaSourceHolder.f12630b.get(i2);
                    maskingMediaPeriod.m6821b(new MediaSource.MediaPeriodId(mo5615o, maskingMediaPeriod.f12323b.f12359d));
                }
            }
            adMediaSourceHolder.f12633e = timeline;
        } else {
            Assertions.m7513a(timeline.mo5936k() == 1);
            this.f12626t = timeline;
        }
        m6942P();
    }

    /* renamed from: O */
    public final void m6941O() {
        Uri uri;
        AdPlaybackState adPlaybackState = this.f12627u;
        if (adPlaybackState == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f12628v.length; i2++) {
            int i3 = 0;
            while (true) {
                AdMediaSourceHolder[][] adMediaSourceHolderArr = this.f12628v;
                if (i3 < adMediaSourceHolderArr[i2].length) {
                    AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr[i2][i3];
                    AdPlaybackState.AdGroup m6925b = adPlaybackState.m6925b(i2);
                    if (adMediaSourceHolder != null) {
                        if (!(adMediaSourceHolder.f12632d != null)) {
                            Uri[] uriArr = m6925b.f12611d;
                            if (i3 < uriArr.length && (uri = uriArr[i3]) != null) {
                                MediaItem.Builder builder = new MediaItem.Builder();
                                builder.f9719b = uri;
                                MediaItem.LocalConfiguration localConfiguration = this.f12617k.getMediaItem().f9714c;
                                if (localConfiguration != null) {
                                    MediaItem.DrmConfiguration drmConfiguration = localConfiguration.f9772c;
                                    builder.f9722e = drmConfiguration != null ? new MediaItem.DrmConfiguration.Builder(drmConfiguration, null) : new MediaItem.DrmConfiguration.Builder(null);
                                }
                                MediaSource mo6812c = this.f12618l.mo6812c(builder.m5839a());
                                adMediaSourceHolder.f12632d = mo6812c;
                                adMediaSourceHolder.f12631c = uri;
                                for (int i4 = 0; i4 < adMediaSourceHolder.f12630b.size(); i4++) {
                                    MaskingMediaPeriod maskingMediaPeriod = adMediaSourceHolder.f12630b.get(i4);
                                    maskingMediaPeriod.m6823h(mo6812c);
                                    maskingMediaPeriod.f12329h = AdsMediaSource.this.new AdPrepareListener(uri);
                                }
                                AdsMediaSource.this.m6801M(adMediaSourceHolder.f12629a, mo6812c);
                            }
                        }
                    }
                    i3++;
                }
            }
        }
    }

    /* renamed from: P */
    public final void m6942P() {
        Timeline timeline;
        Timeline timeline2 = this.f12626t;
        AdPlaybackState adPlaybackState = this.f12627u;
        if (adPlaybackState != null && timeline2 != null) {
            if (adPlaybackState.f12603c != 0) {
                long[][] jArr = new long[this.f12628v.length][];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    AdMediaSourceHolder[][] adMediaSourceHolderArr = this.f12628v;
                    if (i3 >= adMediaSourceHolderArr.length) {
                        break;
                    }
                    jArr[i3] = new long[adMediaSourceHolderArr[i3].length];
                    int i4 = 0;
                    while (true) {
                        AdMediaSourceHolder[][] adMediaSourceHolderArr2 = this.f12628v;
                        if (i4 < adMediaSourceHolderArr2[i3].length) {
                            AdMediaSourceHolder adMediaSourceHolder = adMediaSourceHolderArr2[i3][i4];
                            long[] jArr2 = jArr[i3];
                            long j2 = -9223372036854775807L;
                            if (adMediaSourceHolder != null && (timeline = adMediaSourceHolder.f12633e) != null) {
                                j2 = timeline.m5987h(0, AdsMediaSource.this.f12624r).f10052e;
                            }
                            jArr2[i4] = j2;
                            i4++;
                        }
                    }
                    i3++;
                }
                Assertions.m7516d(adPlaybackState.f12606f == 0);
                AdPlaybackState.AdGroup[] adGroupArr = adPlaybackState.f12607g;
                AdPlaybackState.AdGroup[] adGroupArr2 = (AdPlaybackState.AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
                while (i2 < adPlaybackState.f12603c) {
                    AdPlaybackState.AdGroup adGroup = adGroupArr2[i2];
                    long[] jArr3 = jArr[i2];
                    Objects.requireNonNull(adGroup);
                    int length = jArr3.length;
                    Uri[] uriArr = adGroup.f12611d;
                    if (length < uriArr.length) {
                        jArr3 = AdPlaybackState.AdGroup.m6933b(jArr3, uriArr.length);
                    } else if (adGroup.f12610c != -1 && jArr3.length > uriArr.length) {
                        jArr3 = Arrays.copyOf(jArr3, uriArr.length);
                    }
                    adGroupArr2[i2] = new AdPlaybackState.AdGroup(adGroup.f12609b, adGroup.f12610c, adGroup.f12612e, adGroup.f12611d, jArr3, adGroup.f12614g, adGroup.f12615h);
                    i2++;
                    timeline2 = timeline2;
                }
                AdPlaybackState adPlaybackState2 = new AdPlaybackState(adPlaybackState.f12602b, adGroupArr2, adPlaybackState.f12604d, adPlaybackState.f12605e, adPlaybackState.f12606f);
                this.f12627u = adPlaybackState2;
                m6767G(new SinglePeriodAdTimeline(timeline2, adPlaybackState2));
                return;
            }
            m6767G(timeline2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        AdPlaybackState adPlaybackState = this.f12627u;
        Objects.requireNonNull(adPlaybackState);
        if (adPlaybackState.f12603c <= 0 || !mediaPeriodId.m6828a()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
            maskingMediaPeriod.m6823h(this.f12617k);
            maskingMediaPeriod.m6821b(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i2 = mediaPeriodId.f12357b;
        int i3 = mediaPeriodId.f12358c;
        AdMediaSourceHolder[][] adMediaSourceHolderArr = this.f12628v;
        if (adMediaSourceHolderArr[i2].length <= i3) {
            adMediaSourceHolderArr[i2] = (AdMediaSourceHolder[]) Arrays.copyOf(adMediaSourceHolderArr[i2], i3 + 1);
        }
        AdMediaSourceHolder adMediaSourceHolder = this.f12628v[i2][i3];
        if (adMediaSourceHolder == null) {
            adMediaSourceHolder = new AdMediaSourceHolder(mediaPeriodId);
            this.f12628v[i2][i3] = adMediaSourceHolder;
            m6941O();
        }
        MaskingMediaPeriod maskingMediaPeriod2 = new MaskingMediaPeriod(mediaPeriodId, allocator, j2);
        adMediaSourceHolder.f12630b.add(maskingMediaPeriod2);
        MediaSource mediaSource = adMediaSourceHolder.f12632d;
        if (mediaSource != null) {
            maskingMediaPeriod2.m6823h(mediaSource);
            AdsMediaSource adsMediaSource = AdsMediaSource.this;
            Uri uri = adMediaSourceHolder.f12631c;
            Objects.requireNonNull(uri);
            maskingMediaPeriod2.f12329h = adsMediaSource.new AdPrepareListener(uri);
        }
        Timeline timeline = adMediaSourceHolder.f12633e;
        if (timeline != null) {
            maskingMediaPeriod2.m6821b(new MediaSource.MediaPeriodId(timeline.mo5615o(0), mediaPeriodId.f12359d));
        }
        return maskingMediaPeriod2;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12617k.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.f12323b;
        if (!mediaPeriodId.m6828a()) {
            maskingMediaPeriod.m6822d();
            return;
        }
        AdMediaSourceHolder adMediaSourceHolder = this.f12628v[mediaPeriodId.f12357b][mediaPeriodId.f12358c];
        Objects.requireNonNull(adMediaSourceHolder);
        adMediaSourceHolder.f12630b.remove(maskingMediaPeriod);
        maskingMediaPeriod.m6822d();
        if (adMediaSourceHolder.f12630b.isEmpty()) {
            if (adMediaSourceHolder.f12632d != null) {
                AdsMediaSource.this.m6802N(adMediaSourceHolder.f12629a);
            }
            this.f12628v[mediaPeriodId.f12357b][mediaPeriodId.f12358c] = null;
        }
    }
}
