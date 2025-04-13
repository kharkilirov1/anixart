package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/* loaded from: classes.dex */
final class MediaSourceList {

    /* renamed from: d */
    public final MediaSourceListInfoRefreshListener f9897d;

    /* renamed from: e */
    public final MediaSourceEventListener.EventDispatcher f9898e;

    /* renamed from: f */
    public final DrmSessionEventListener.EventDispatcher f9899f;

    /* renamed from: g */
    public final HashMap<MediaSourceHolder, MediaSourceAndListener> f9900g;

    /* renamed from: h */
    public final Set<MediaSourceHolder> f9901h;

    /* renamed from: j */
    public boolean f9903j;

    /* renamed from: k */
    @Nullable
    public TransferListener f9904k;

    /* renamed from: i */
    public ShuffleOrder f9902i = new ShuffleOrder.DefaultShuffleOrder(0, new Random());

    /* renamed from: b */
    public final IdentityHashMap<MediaPeriod, MediaSourceHolder> f9895b = new IdentityHashMap<>();

    /* renamed from: c */
    public final Map<Object, MediaSourceHolder> f9896c = new HashMap();

    /* renamed from: a */
    public final List<MediaSourceHolder> f9894a = new ArrayList();

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {

        /* renamed from: b */
        public final MediaSourceHolder f9905b;

        /* renamed from: c */
        public MediaSourceEventListener.EventDispatcher f9906c;

        /* renamed from: d */
        public DrmSessionEventListener.EventDispatcher f9907d;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.f9906c = MediaSourceList.this.f9898e;
            this.f9907d = MediaSourceList.this.f9899f;
            this.f9905b = mediaSourceHolder;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: A */
        public void mo5889A(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6839j(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: C */
        public void mo5890C(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6304e(i3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: D */
        public void mo5891D(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6306g();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: F */
        public void mo5892F(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6842m(loadEventInfo, mediaLoadData, iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: H */
        public void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6303d();
            }
        }

        /* renamed from: a */
        public final boolean m5894a(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodId2 = null;
            if (mediaPeriodId != null) {
                MediaSourceHolder mediaSourceHolder = this.f9905b;
                int i3 = 0;
                while (true) {
                    if (i3 >= mediaSourceHolder.f9914c.size()) {
                        break;
                    }
                    if (mediaSourceHolder.f9914c.get(i3).f12359d == mediaPeriodId.f12359d) {
                        mediaPeriodId2 = mediaPeriodId.m6829b(Pair.create(mediaSourceHolder.f9913b, mediaPeriodId.f12356a));
                        break;
                    }
                    i3++;
                }
                if (mediaPeriodId2 == null) {
                    return false;
                }
            }
            int i4 = i2 + this.f9905b.f9915d;
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f9906c;
            if (eventDispatcher.f12361a != i4 || !Util.m7728a(eventDispatcher.f12362b, mediaPeriodId2)) {
                this.f9906c = MediaSourceList.this.f9898e.m6848s(i4, mediaPeriodId2, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f9907d;
            if (eventDispatcher2.f10718a == i4 && Util.m7728a(eventDispatcher2.f10719b, mediaPeriodId2)) {
                return true;
            }
            this.f9907d = MediaSourceList.this.f9899f.m6308i(i4, mediaPeriodId2);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: f */
        public void mo5895f(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6833d(mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: g */
        public void mo5896g(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6836g(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: h */
        public void mo5897h(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6847r(mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: i */
        public void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6305f(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        /* renamed from: j */
        public void mo5899j(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9906c.m6845p(loadEventInfo, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: p */
        public void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6302c();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: r */
        public /* synthetic */ void mo5901r(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        /* renamed from: w */
        public void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (m5894a(i2, mediaPeriodId)) {
                this.f9907d.m6301b();
            }
        }
    }

    public static final class MediaSourceAndListener {

        /* renamed from: a */
        public final MediaSource f9909a;

        /* renamed from: b */
        public final MediaSource.MediaSourceCaller f9910b;

        /* renamed from: c */
        public final ForwardingEventListener f9911c;

        public MediaSourceAndListener(MediaSource mediaSource, MediaSource.MediaSourceCaller mediaSourceCaller, ForwardingEventListener forwardingEventListener) {
            this.f9909a = mediaSource;
            this.f9910b = mediaSourceCaller;
            this.f9911c = forwardingEventListener;
        }
    }

    public static final class MediaSourceHolder implements MediaSourceInfoHolder {

        /* renamed from: a */
        public final MaskingMediaSource f9912a;

        /* renamed from: d */
        public int f9915d;

        /* renamed from: e */
        public boolean f9916e;

        /* renamed from: c */
        public final List<MediaSource.MediaPeriodId> f9914c = new ArrayList();

        /* renamed from: b */
        public final Object f9913b = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z) {
            this.f9912a = new MaskingMediaSource(mediaSource, z);
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        /* renamed from: a */
        public Object mo5748a() {
            return this.f9913b;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        /* renamed from: b */
        public Timeline mo5749b() {
            return this.f9912a.f12336o;
        }
    }

    public interface MediaSourceListInfoRefreshListener {
        /* renamed from: c */
        void mo5780c();
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener mediaSourceListInfoRefreshListener, @Nullable AnalyticsCollector analyticsCollector, Handler handler) {
        this.f9897d = mediaSourceListInfoRefreshListener;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
        this.f9898e = eventDispatcher;
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = new DrmSessionEventListener.EventDispatcher();
        this.f9899f = eventDispatcher2;
        this.f9900g = new HashMap<>();
        this.f9901h = new HashSet();
        if (analyticsCollector != null) {
            eventDispatcher.m6830a(handler, analyticsCollector);
            eventDispatcher2.m6300a(handler, analyticsCollector);
        }
    }

    /* renamed from: a */
    public Timeline m5880a(int i2, List<MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        if (!list.isEmpty()) {
            this.f9902i = shuffleOrder;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                MediaSourceHolder mediaSourceHolder = list.get(i3 - i2);
                if (i3 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = this.f9894a.get(i3 - 1);
                    mediaSourceHolder.f9915d = mediaSourceHolder2.f9912a.f12336o.mo5937r() + mediaSourceHolder2.f9915d;
                    mediaSourceHolder.f9916e = false;
                    mediaSourceHolder.f9914c.clear();
                } else {
                    mediaSourceHolder.f9915d = 0;
                    mediaSourceHolder.f9916e = false;
                    mediaSourceHolder.f9914c.clear();
                }
                m5881b(i3, mediaSourceHolder.f9912a.f12336o.mo5937r());
                this.f9894a.add(i3, mediaSourceHolder);
                this.f9896c.put(mediaSourceHolder.f9913b, mediaSourceHolder);
                if (this.f9903j) {
                    m5886g(mediaSourceHolder);
                    if (this.f9895b.isEmpty()) {
                        this.f9901h.add(mediaSourceHolder);
                    } else {
                        MediaSourceAndListener mediaSourceAndListener = this.f9900g.get(mediaSourceHolder);
                        if (mediaSourceAndListener != null) {
                            mediaSourceAndListener.f9909a.mo6772l(mediaSourceAndListener.f9910b);
                        }
                    }
                }
            }
        }
        return m5882c();
    }

    /* renamed from: b */
    public final void m5881b(int i2, int i3) {
        while (i2 < this.f9894a.size()) {
            this.f9894a.get(i2).f9915d += i3;
            i2++;
        }
    }

    /* renamed from: c */
    public Timeline m5882c() {
        if (this.f9894a.isEmpty()) {
            return Timeline.f10047b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9894a.size(); i3++) {
            MediaSourceHolder mediaSourceHolder = this.f9894a.get(i3);
            mediaSourceHolder.f9915d = i2;
            i2 += mediaSourceHolder.f9912a.f12336o.mo5937r();
        }
        return new PlaylistTimeline(this.f9894a, this.f9902i);
    }

    /* renamed from: d */
    public final void m5883d() {
        Iterator<MediaSourceHolder> it = this.f9901h.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.f9914c.isEmpty()) {
                MediaSourceAndListener mediaSourceAndListener = this.f9900g.get(next);
                if (mediaSourceAndListener != null) {
                    mediaSourceAndListener.f9909a.mo6772l(mediaSourceAndListener.f9910b);
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public int m5884e() {
        return this.f9894a.size();
    }

    /* renamed from: f */
    public final void m5885f(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.f9916e && mediaSourceHolder.f9914c.isEmpty()) {
            MediaSourceAndListener remove = this.f9900g.remove(mediaSourceHolder);
            Objects.requireNonNull(remove);
            remove.f9909a.mo6769c(remove.f9910b);
            remove.f9909a.mo6771k(remove.f9911c);
            remove.f9909a.mo6774o(remove.f9911c);
            this.f9901h.remove(mediaSourceHolder);
        }
    }

    /* renamed from: g */
    public final void m5886g(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.f9912a;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.q
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            /* renamed from: b */
            public final void mo5903b(MediaSource mediaSource, Timeline timeline) {
                MediaSourceList.this.f9897d.mo5780c();
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        this.f9900g.put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, mediaSourceCaller, forwardingEventListener));
        maskingMediaSource.mo6770e(Util.m7746o(), forwardingEventListener);
        maskingMediaSource.f12231e.m6300a(Util.m7746o(), forwardingEventListener);
        maskingMediaSource.mo6777u(mediaSourceCaller, this.f9904k);
    }

    /* renamed from: h */
    public void m5887h(MediaPeriod mediaPeriod) {
        MediaSourceHolder remove = this.f9895b.remove(mediaPeriod);
        Objects.requireNonNull(remove);
        remove.f9912a.mo6798s(mediaPeriod);
        remove.f9914c.remove(((MaskingMediaPeriod) mediaPeriod).f12323b);
        if (!this.f9895b.isEmpty()) {
            m5883d();
        }
        m5885f(remove);
    }

    /* renamed from: i */
    public final void m5888i(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            MediaSourceHolder remove = this.f9894a.remove(i4);
            this.f9896c.remove(remove.f9913b);
            m5881b(i4, -remove.f9912a.f12336o.mo5937r());
            remove.f9916e = true;
            if (this.f9903j) {
                m5885f(remove);
            }
        }
    }
}
