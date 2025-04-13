package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.RunnableC0976c;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p005c.RunnableC0695b;

/* loaded from: classes.dex */
public interface MediaSourceEventListener {
    /* renamed from: A */
    void mo5889A(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: F */
    void mo5892F(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z);

    /* renamed from: f */
    void mo5895f(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    /* renamed from: g */
    void mo5896g(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    /* renamed from: h */
    void mo5897h(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    /* renamed from: j */
    void mo5899j(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    public static class EventDispatcher {

        /* renamed from: a */
        public final int f12361a;

        /* renamed from: b */
        @Nullable
        public final MediaSource.MediaPeriodId f12362b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<ListenerAndHandler> f12363c;

        /* renamed from: d */
        public final long f12364d;

        public static final class ListenerAndHandler {

            /* renamed from: a */
            public Handler f12365a;

            /* renamed from: b */
            public MediaSourceEventListener f12366b;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.f12365a = handler;
                this.f12366b = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this.f12363c = new CopyOnWriteArrayList<>();
            this.f12361a = 0;
            this.f12362b = null;
            this.f12364d = 0L;
        }

        /* renamed from: a */
        public void m6830a(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Objects.requireNonNull(handler);
            this.f12363c.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        /* renamed from: b */
        public final long m6831b(long j2) {
            long m7735d0 = Util.m7735d0(j2);
            if (m7735d0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f12364d + m7735d0;
        }

        /* renamed from: c */
        public void m6832c(int i2, @Nullable Format format, int i3, @Nullable Object obj, long j2) {
            m6833d(new MediaLoadData(1, i2, format, i3, obj, m6831b(j2), -9223372036854775807L));
        }

        /* renamed from: d */
        public void m6833d(MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC0976c(this, next.f12366b, mediaLoadData, 2));
            }
        }

        /* renamed from: e */
        public void m6834e(LoadEventInfo loadEventInfo, int i2) {
            m6835f(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: f */
        public void m6835f(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3) {
            m6836g(loadEventInfo, new MediaLoadData(i2, i3, format, i4, obj, m6831b(j2), m6831b(j3)));
        }

        /* renamed from: g */
        public void m6836g(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC1107f(this, next.f12366b, loadEventInfo, mediaLoadData, 1));
            }
        }

        /* renamed from: h */
        public void m6837h(LoadEventInfo loadEventInfo, int i2) {
            m6838i(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: i */
        public void m6838i(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3) {
            m6839j(loadEventInfo, new MediaLoadData(i2, i3, format, i4, obj, m6831b(j2), m6831b(j3)));
        }

        /* renamed from: j */
        public void m6839j(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC1107f(this, next.f12366b, loadEventInfo, mediaLoadData, 0));
            }
        }

        /* renamed from: k */
        public void m6840k(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3, IOException iOException, boolean z) {
            m6842m(loadEventInfo, new MediaLoadData(i2, i3, format, i4, obj, m6831b(j2), m6831b(j3)), iOException, z);
        }

        /* renamed from: l */
        public void m6841l(LoadEventInfo loadEventInfo, int i2, IOException iOException, boolean z) {
            m6840k(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: m */
        public void m6842m(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC1108g(this, next.f12366b, loadEventInfo, mediaLoadData, iOException, z, 0));
            }
        }

        /* renamed from: n */
        public void m6843n(LoadEventInfo loadEventInfo, int i2) {
            m6844o(loadEventInfo, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: o */
        public void m6844o(LoadEventInfo loadEventInfo, int i2, int i3, @Nullable Format format, int i4, @Nullable Object obj, long j2, long j3) {
            m6845p(loadEventInfo, new MediaLoadData(i2, i3, format, i4, obj, m6831b(j2), m6831b(j3)));
        }

        /* renamed from: p */
        public void m6845p(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC1107f(this, next.f12366b, loadEventInfo, mediaLoadData, 2));
            }
        }

        /* renamed from: q */
        public void m6846q(int i2, long j2, long j3) {
            m6847r(new MediaLoadData(1, i2, null, 3, null, m6831b(j2), m6831b(j3)));
        }

        /* renamed from: r */
        public void m6847r(MediaLoadData mediaLoadData) {
            MediaSource.MediaPeriodId mediaPeriodId = this.f12362b;
            Objects.requireNonNull(mediaPeriodId);
            Iterator<ListenerAndHandler> it = this.f12363c.iterator();
            while (it.hasNext()) {
                ListenerAndHandler next = it.next();
                Util.m7721T(next.f12365a, new RunnableC0695b(this, next.f12366b, mediaPeriodId, mediaLoadData, 1));
            }
        }

        @CheckResult
        /* renamed from: s */
        public EventDispatcher m6848s(int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            return new EventDispatcher(this.f12363c, i2, mediaPeriodId, j2);
        }

        public EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i2, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            this.f12363c = copyOnWriteArrayList;
            this.f12361a = i2;
            this.f12362b = mediaPeriodId;
            this.f12364d = j2;
        }
    }
}
