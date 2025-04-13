package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UnknownNull;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {

    /* renamed from: h */
    public final HashMap<T, MediaSourceAndListener<T>> f12263h = new HashMap<>();

    /* renamed from: i */
    @Nullable
    public Handler f12264i;

    /* renamed from: j */
    @Nullable
    public TransferListener f12265j;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {

        /* renamed from: b */
        @UnknownNull
        public final T f12266b;

        /* renamed from: c */
        public MediaSourceEventListener.EventDispatcher f12267c;

        /* renamed from: d */
        public DrmSessionEventListener.EventDispatcher f12268d;

        public ForwardingEventListener(@UnknownNull T t) {
            this.f12267c = CompositeMediaSource.this.m6780y(null);
            this.f12268d = CompositeMediaSource.this.m6779x(null);
            this.f12266b = t;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: A */
        public void mo5889A(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6839j(loadEventInfo, m6804b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: C */
        public void mo5890C(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6304e(i3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: D */
        public void mo5891D(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6306g();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: F */
        public void mo5892F(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6842m(loadEventInfo, m6804b(mediaLoadData), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: H */
        public void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6303d();
            }
        }

        /* renamed from: a */
        public final boolean m6803a(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2;
            if (mediaPeriodId != null) {
                mediaPeriodId2 = CompositeMediaSource.this.mo6799J(this.f12266b, mediaPeriodId);
                if (mediaPeriodId2 == null) {
                    return false;
                }
            } else {
                mediaPeriodId2 = null;
            }
            int mo6800K = CompositeMediaSource.this.mo6800K(this.f12266b, i2);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f12267c;
            if (eventDispatcher.f12361a != mo6800K || !Util.m7728a(eventDispatcher.f12362b, mediaPeriodId2)) {
                this.f12267c = CompositeMediaSource.this.f12230d.m6848s(mo6800K, mediaPeriodId2, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f12268d;
            if (eventDispatcher2.f10718a == mo6800K && Util.m7728a(eventDispatcher2.f10719b, mediaPeriodId2)) {
                return true;
            }
            this.f12268d = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.f12231e.f10720c, mo6800K, mediaPeriodId2);
            return true;
        }

        /* renamed from: b */
        public final MediaLoadData m6804b(MediaLoadData mediaLoadData) {
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            long j2 = mediaLoadData.f12350f;
            Objects.requireNonNull(compositeMediaSource);
            CompositeMediaSource compositeMediaSource2 = CompositeMediaSource.this;
            long j3 = mediaLoadData.f12351g;
            Objects.requireNonNull(compositeMediaSource2);
            return (j2 == mediaLoadData.f12350f && j3 == mediaLoadData.f12351g) ? mediaLoadData : new MediaLoadData(mediaLoadData.f12345a, mediaLoadData.f12346b, mediaLoadData.f12347c, mediaLoadData.f12348d, mediaLoadData.f12349e, j2, j3);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: f */
        public void mo5895f(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6833d(m6804b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: g */
        public void mo5896g(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6836g(loadEventInfo, m6804b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: h */
        public void mo5897h(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6847r(m6804b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: i */
        public void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6305f(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: j */
        public void mo5899j(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12267c.m6845p(loadEventInfo, m6804b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: p */
        public void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6302c();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: r */
        public /* synthetic */ void mo5901r(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: w */
        public void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m6803a(i2, mediaPeriodId)) {
                this.f12268d.m6301b();
            }
        }
    }

    public static final class MediaSourceAndListener<T> {

        /* renamed from: a */
        public final MediaSource f12270a;

        /* renamed from: b */
        public final MediaSource.MediaSourceCaller f12271b;

        /* renamed from: c */
        public final CompositeMediaSource<T>.ForwardingEventListener f12272c;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, CompositeMediaSource<T>.ForwardingEventListener forwardingEventListener) {
            this.f12270a = mediaSource;
            this.f12271b = mediaSourceCaller;
            this.f12272c = forwardingEventListener;
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    /* renamed from: B */
    public void mo6765B() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.f12263h.values()) {
            mediaSourceAndListener.f12270a.mo6778v(mediaSourceAndListener.f12271b);
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    /* renamed from: I */
    public void mo6768I() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.f12263h.values()) {
            mediaSourceAndListener.f12270a.mo6769c(mediaSourceAndListener.f12271b);
            mediaSourceAndListener.f12270a.mo6771k(mediaSourceAndListener.f12272c);
            mediaSourceAndListener.f12270a.mo6774o(mediaSourceAndListener.f12272c);
        }
        this.f12263h.clear();
    }

    @Nullable
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(@UnknownNull T t, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    /* renamed from: K */
    public int mo6800K(@UnknownNull T t, int i2) {
        return i2;
    }

    /* renamed from: L */
    public abstract void mo6795L(@UnknownNull T t, MediaSource mediaSource, Timeline timeline);

    /* renamed from: M */
    public final void m6801M(@UnknownNull final T t, MediaSource mediaSource) {
        Assertions.m7513a(!this.f12263h.containsKey(t));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.source.a
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            /* renamed from: b */
            public final void mo5903b(MediaSource mediaSource2, Timeline timeline) {
                CompositeMediaSource.this.mo6795L(t, mediaSource2, timeline);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(t);
        this.f12263h.put(t, new MediaSourceAndListener<>(mediaSource, mediaSourceCaller, forwardingEventListener));
        Handler handler = this.f12264i;
        Objects.requireNonNull(handler);
        mediaSource.mo6770e(handler, forwardingEventListener);
        Handler handler2 = this.f12264i;
        Objects.requireNonNull(handler2);
        mediaSource.mo6773n(handler2, forwardingEventListener);
        mediaSource.mo6777u(mediaSourceCaller, this.f12265j);
        if (!this.f12229c.isEmpty()) {
            return;
        }
        mediaSource.mo6772l(mediaSourceCaller);
    }

    /* renamed from: N */
    public final void m6802N(@UnknownNull T t) {
        MediaSourceAndListener<T> remove = this.f12263h.remove(t);
        Objects.requireNonNull(remove);
        remove.f12270a.mo6769c(remove.f12271b);
        remove.f12270a.mo6771k(remove.f12272c);
        remove.f12270a.mo6774o(remove.f12272c);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<MediaSourceAndListener<T>> it = this.f12263h.values().iterator();
        while (it.hasNext()) {
            it.next().f12270a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    /* renamed from: z */
    public void mo6781z() {
        for (MediaSourceAndListener<T> mediaSourceAndListener : this.f12263h.values()) {
            mediaSourceAndListener.f12270a.mo6772l(mediaSourceAndListener.f12271b);
        }
    }
}
