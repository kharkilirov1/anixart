package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.RunnableC0976c;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface DrmSessionEventListener {
    /* renamed from: C */
    void mo5890C(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int i3);

    /* renamed from: D */
    void mo5891D(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    /* renamed from: H */
    void mo5893H(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    /* renamed from: i */
    void mo5898i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception exc);

    /* renamed from: p */
    void mo5900p(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    @Deprecated
    /* renamed from: r */
    void mo5901r(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    /* renamed from: w */
    void mo5902w(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    public static class EventDispatcher {

        /* renamed from: a */
        public final int f10718a;

        /* renamed from: b */
        @Nullable
        public final MediaSource.MediaPeriodId f10719b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<ListenerAndHandler> f10720c;

        public static final class ListenerAndHandler {

            /* renamed from: a */
            public Handler f10721a;

            /* renamed from: b */
            public DrmSessionEventListener f10722b;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.f10721a = handler;
                this.f10722b = drmSessionEventListener;
            }
        }

        public EventDispatcher() {
            this.f10720c = new CopyOnWriteArrayList<>();
            this.f10718a = 0;
            this.f10719b = null;
        }

        /* renamed from: a */
        public void m6300a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            this.f10720c.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        /* renamed from: b */
        public void m6301b() {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0997c(this, next.f10722b, 3));
            }
        }

        /* renamed from: c */
        public void m6302c() {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0997c(this, next.f10722b, 1));
            }
        }

        /* renamed from: d */
        public void m6303d() {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0997c(this, next.f10722b, 2));
            }
        }

        /* renamed from: e */
        public void m6304e(int i2) {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0998d(this, next.f10722b, i2, 0));
            }
        }

        /* renamed from: f */
        public void m6305f(Exception exc) {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0976c(this, next.f10722b, exc, 1));
            }
        }

        /* renamed from: g */
        public void m6306g() {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f10721a, new RunnableC0997c(this, next.f10722b, 0));
            }
        }

        /* renamed from: h */
        public void m6307h(DrmSessionEventListener drmSessionEventListener) {
            Iterator<ListenerAndHandler> it = this.f10720c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                if (next.f10722b == drmSessionEventListener) {
                    this.f10720c.remove(next);
                }
            }
        }

        @CheckResult
        /* renamed from: i */
        public EventDispatcher m6308i(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.f10720c, i2, mediaPeriodId);
        }

        public EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.f10720c = copyOnWriteArrayList;
            this.f10718a = i2;
            this.f10719b = mediaPeriodId;
        }
    }
}
