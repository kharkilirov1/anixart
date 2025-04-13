package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class BaseMediaSource implements MediaSource {

    /* renamed from: b */
    public final ArrayList<MediaSource.MediaSourceCaller> f12228b = new ArrayList<>(1);

    /* renamed from: c */
    public final HashSet<MediaSource.MediaSourceCaller> f12229c = new HashSet<>(1);

    /* renamed from: d */
    public final MediaSourceEventListener.EventDispatcher f12230d = new MediaSourceEventListener.EventDispatcher();

    /* renamed from: e */
    public final DrmSessionEventListener.EventDispatcher f12231e = new DrmSessionEventListener.EventDispatcher();

    /* renamed from: f */
    @Nullable
    public Looper f12232f;

    /* renamed from: g */
    @Nullable
    public Timeline f12233g;

    /* renamed from: B */
    public void mo6765B() {
    }

    /* renamed from: E */
    public abstract void mo6766E(@Nullable TransferListener transferListener);

    /* renamed from: G */
    public final void m6767G(Timeline timeline) {
        this.f12233g = timeline;
        Iterator<MediaSource.MediaSourceCaller> it = this.f12228b.iterator();
        while (it.hasNext()) {
            it.next().mo5903b(this, timeline);
        }
    }

    /* renamed from: I */
    public abstract void mo6768I();

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: c */
    public final void mo6769c(MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.f12228b.remove(mediaSourceCaller);
        if (!this.f12228b.isEmpty()) {
            mo6772l(mediaSourceCaller);
            return;
        }
        this.f12232f = null;
        this.f12233g = null;
        this.f12229c.clear();
        mo6768I();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: e */
    public final void mo6770e(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f12230d;
        Objects.requireNonNull(eventDispatcher);
        eventDispatcher.f12363c.add(new MediaSourceEventListener.EventDispatcher.ListenerAndHandler(handler, mediaSourceEventListener));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: k */
    public final void mo6771k(MediaSourceEventListener mediaSourceEventListener) {
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f12230d;
        Iterator<MediaSourceEventListener.EventDispatcher.ListenerAndHandler> it = eventDispatcher.f12363c.iterator();
        while (it.hasNext()) {
            MediaSourceEventListener.EventDispatcher.ListenerAndHandler next = it.next();
            if (next.f12366b == mediaSourceEventListener) {
                eventDispatcher.f12363c.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: l */
    public final void mo6772l(MediaSource.MediaSourceCaller mediaSourceCaller) {
        boolean z = !this.f12229c.isEmpty();
        this.f12229c.remove(mediaSourceCaller);
        if (z && this.f12229c.isEmpty()) {
            mo6781z();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: n */
    public final void mo6773n(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        this.f12231e.m6300a(handler, drmSessionEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: o */
    public final void mo6774o(DrmSessionEventListener drmSessionEventListener) {
        this.f12231e.m6307h(drmSessionEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: q */
    public /* synthetic */ boolean mo6775q() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: t */
    public /* synthetic */ Timeline mo6776t() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: u */
    public final void mo6777u(MediaSource.MediaSourceCaller mediaSourceCaller, @Nullable TransferListener transferListener) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f12232f;
        Assertions.m7513a(looper == null || looper == myLooper);
        Timeline timeline = this.f12233g;
        this.f12228b.add(mediaSourceCaller);
        if (this.f12232f == null) {
            this.f12232f = myLooper;
            this.f12229c.add(mediaSourceCaller);
            mo6766E(transferListener);
        } else if (timeline != null) {
            mo6778v(mediaSourceCaller);
            mediaSourceCaller.mo5903b(this, timeline);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: v */
    public final void mo6778v(MediaSource.MediaSourceCaller mediaSourceCaller) {
        Objects.requireNonNull(this.f12232f);
        boolean isEmpty = this.f12229c.isEmpty();
        this.f12229c.add(mediaSourceCaller);
        if (isEmpty) {
            mo6765B();
        }
    }

    /* renamed from: x */
    public final DrmSessionEventListener.EventDispatcher m6779x(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return this.f12231e.m6308i(0, null);
    }

    /* renamed from: y */
    public final MediaSourceEventListener.EventDispatcher m6780y(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return this.f12230d.m6848s(0, null, 0L);
    }

    /* renamed from: z */
    public void mo6781z() {
    }
}
