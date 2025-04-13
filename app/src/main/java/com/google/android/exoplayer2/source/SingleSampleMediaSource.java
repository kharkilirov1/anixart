package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {

    /* renamed from: h */
    public final DataSpec f12573h;

    /* renamed from: i */
    public final DataSource.Factory f12574i;

    /* renamed from: j */
    public final Format f12575j;

    /* renamed from: k */
    public final long f12576k;

    /* renamed from: l */
    public final LoadErrorHandlingPolicy f12577l;

    /* renamed from: m */
    public final boolean f12578m;

    /* renamed from: n */
    public final Timeline f12579n;

    /* renamed from: o */
    public final MediaItem f12580o;

    /* renamed from: p */
    @Nullable
    public TransferListener f12581p;

    public static final class Factory {

        /* renamed from: a */
        public final DataSource.Factory f12582a;

        /* renamed from: b */
        public LoadErrorHandlingPolicy f12583b;

        /* renamed from: c */
        public boolean f12584c;

        public Factory(DataSource.Factory factory) {
            Objects.requireNonNull(factory);
            this.f12582a = factory;
            this.f12583b = new DefaultLoadErrorHandlingPolicy();
            this.f12584c = true;
        }
    }

    public SingleSampleMediaSource(String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, Object obj, C10911 c10911) {
        this.f12574i = factory;
        this.f12576k = j2;
        this.f12577l = loadErrorHandlingPolicy;
        this.f12578m = z;
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f9719b = Uri.EMPTY;
        String uri = subtitleConfiguration.f9778a.toString();
        Objects.requireNonNull(uri);
        builder.f9718a = uri;
        builder.f9725h = ImmutableList.m11634y(ImmutableList.m11628E(subtitleConfiguration));
        builder.f9727j = null;
        MediaItem m5839a = builder.m5839a();
        this.f12580o = m5839a;
        Format.Builder builder2 = new Format.Builder();
        builder2.f9677a = null;
        builder2.f9687k = (String) MoreObjects.m11165a(subtitleConfiguration.f9779b, "text/x-unknown");
        builder2.f9679c = subtitleConfiguration.f9780c;
        builder2.f9680d = subtitleConfiguration.f9781d;
        builder2.f9681e = subtitleConfiguration.f9782e;
        builder2.f9678b = subtitleConfiguration.f9783f;
        this.f12575j = builder2.m5833a();
        DataSpec.Builder builder3 = new DataSpec.Builder();
        builder3.f14372a = subtitleConfiguration.f9778a;
        builder3.f14380i = 1;
        this.f12573h = builder3.m7438a();
        this.f12579n = new SinglePeriodTimeline(j2, true, false, false, null, m5839a);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12581p = transferListener;
        m6767G(this.f12579n);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        return new SingleSampleMediaPeriod(this.f12573h, this.f12574i, this.f12581p, this.f12575j, this.f12576k, this.f12577l, this.f12230d.m6848s(0, mediaPeriodId, 0L), this.f12578m);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12580o;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).f12560j.m7474g(null);
    }
}
