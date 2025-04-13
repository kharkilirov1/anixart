package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {

    /* renamed from: o */
    public static final MediaItem f12274o;

    /* renamed from: k */
    @Nullable
    @GuardedBy
    public Handler f12275k;

    /* renamed from: l */
    public boolean f12276l;

    /* renamed from: m */
    public Set<HandlerAndRunnable> f12277m;

    /* renamed from: n */
    public ShuffleOrder f12278n;

    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {

        /* renamed from: f */
        public final int f12279f;

        /* renamed from: g */
        public final int f12280g;

        /* renamed from: h */
        public final int[] f12281h;

        /* renamed from: i */
        public final int[] f12282i;

        /* renamed from: j */
        public final Timeline[] f12283j;

        /* renamed from: k */
        public final Object[] f12284k;

        /* renamed from: l */
        public final HashMap<Object, Integer> f12285l;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z) {
            super(z, shuffleOrder);
            throw null;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: C */
        public Timeline mo5607C(int i2) {
            return this.f12283j[i2];
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return this.f12280g;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return this.f12279f;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: u */
        public int mo5617u(Object obj) {
            Integer num = this.f12285l.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: v */
        public int mo5618v(int i2) {
            return Util.m7736e(this.f12281h, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: w */
        public int mo5619w(int i2) {
            return Util.m7736e(this.f12282i, i2 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: x */
        public Object mo5620x(int i2) {
            return this.f12284k[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: y */
        public int mo5621y(int i2) {
            return this.f12281h[i2];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        /* renamed from: z */
        public int mo5622z(int i2) {
            return this.f12282i[i2];
        }
    }

    public static final class FakeMediaSource extends BaseMediaSource {
        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        /* renamed from: E */
        public void mo6766E(@Nullable TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        /* renamed from: I */
        public void mo6768I() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        /* renamed from: a */
        public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.f12274o;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        /* renamed from: s */
        public void mo6798s(MediaPeriod mediaPeriod) {
        }
    }

    public static final class HandlerAndRunnable {
    }

    public static final class MediaSourceHolder {

        /* renamed from: a */
        public final Object f12286a;

        /* renamed from: b */
        public final List<MediaSource.MediaPeriodId> f12287b;

        /* renamed from: c */
        public int f12288c;

        /* renamed from: d */
        public int f12289d;
    }

    public static final class MessageData<T> {
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f9719b = Uri.EMPTY;
        f12274o = builder.m5839a();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: B */
    public void mo6765B() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public synchronized void mo6766E(@Nullable TransferListener transferListener) {
        this.f12265j = transferListener;
        this.f12264i = Util.m7744m();
        this.f12275k = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ConcatenatingMediaSource concatenatingMediaSource = ConcatenatingMediaSource.this;
                MediaItem mediaItem = ConcatenatingMediaSource.f12274o;
                Objects.requireNonNull(concatenatingMediaSource);
                int i2 = message.what;
                if (i2 == 0) {
                    Object obj = message.obj;
                    int i3 = Util.f14736a;
                    Objects.requireNonNull((ConcatenatingMediaSource.MessageData) obj);
                    throw null;
                }
                if (i2 == 1) {
                    Object obj2 = message.obj;
                    int i4 = Util.f14736a;
                    Objects.requireNonNull((ConcatenatingMediaSource.MessageData) obj2);
                    throw null;
                }
                if (i2 == 2) {
                    Object obj3 = message.obj;
                    int i5 = Util.f14736a;
                    ShuffleOrder shuffleOrder = concatenatingMediaSource.f12278n;
                    Objects.requireNonNull((ConcatenatingMediaSource.MessageData) obj3);
                    concatenatingMediaSource.f12278n = shuffleOrder.mo6909a(0, 1);
                    throw null;
                }
                if (i2 == 3) {
                    Object obj4 = message.obj;
                    int i6 = Util.f14736a;
                    Objects.requireNonNull((ConcatenatingMediaSource.MessageData) obj4);
                    concatenatingMediaSource.f12278n = null;
                    concatenatingMediaSource.m6807P(null);
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException();
                        }
                        Object obj5 = message.obj;
                        int i7 = Util.f14736a;
                        concatenatingMediaSource.m6806O((Set) obj5);
                        throw null;
                    }
                    concatenatingMediaSource.m6808Q();
                }
                return true;
            }
        });
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public synchronized void mo6768I() {
        super.mo6768I();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    /* renamed from: J */
    public MediaSource.MediaPeriodId mo6799J(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSourceHolder mediaSourceHolder2 = mediaSourceHolder;
        for (int i2 = 0; i2 < mediaSourceHolder2.f12287b.size(); i2++) {
            if (mediaSourceHolder2.f12287b.get(i2).f12359d == mediaPeriodId.f12359d) {
                return mediaPeriodId.m6829b(Pair.create(mediaSourceHolder2.f12286a, mediaPeriodId.f12356a));
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: K */
    public int mo6800K(MediaSourceHolder mediaSourceHolder, int i2) {
        return i2 + mediaSourceHolder.f12289d;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* renamed from: L */
    public void mo6795L(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        int i2 = mediaSourceHolder.f12288c;
        throw null;
    }

    /* renamed from: O */
    public final synchronized void m6806O(Set<HandlerAndRunnable> set) {
        Iterator<HandlerAndRunnable> it = set.iterator();
        if (!it.hasNext()) {
            throw null;
        }
        Objects.requireNonNull(it.next());
        throw null;
    }

    /* renamed from: P */
    public final void m6807P(@Nullable HandlerAndRunnable handlerAndRunnable) {
        if (this.f12276l) {
            return;
        }
        Handler handler = this.f12275k;
        Objects.requireNonNull(handler);
        handler.obtainMessage(4).sendToTarget();
        this.f12276l = true;
    }

    /* renamed from: Q */
    public final void m6808Q() {
        this.f12276l = false;
        this.f12277m = new HashSet();
        new ConcatenatedTimeline(null, this.f12278n, false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        Object obj = mediaPeriodId.f12356a;
        Object obj2 = ((Pair) obj).first;
        mediaPeriodId.m6829b(((Pair) obj).second);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return f12274o;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    /* renamed from: q */
    public boolean mo6775q() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    /* renamed from: t */
    public synchronized Timeline mo6776t() {
        this.f12278n.getLength();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: z */
    public void mo6781z() {
        super.mo6781z();
        throw null;
    }
}
