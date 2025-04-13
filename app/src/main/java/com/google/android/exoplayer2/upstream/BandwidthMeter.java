package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {

            /* renamed from: a */
            public final CopyOnWriteArrayList<HandlerAndListener> f14331a = new CopyOnWriteArrayList<>();

            public static final class HandlerAndListener {

                /* renamed from: a */
                public final Handler f14332a;

                /* renamed from: b */
                public final EventListener f14333b;

                /* renamed from: c */
                public boolean f14334c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f14332a = handler;
                    this.f14333b = eventListener;
                }
            }

            /* renamed from: a */
            public void m7426a(EventListener eventListener) {
                Iterator<HandlerAndListener> it = this.f14331a.iterator();
                while (it.hasNext()) {
                    HandlerAndListener next = it.next();
                    if (next.f14333b == eventListener) {
                        next.f14334c = true;
                        this.f14331a.remove(next);
                    }
                }
            }
        }

        /* renamed from: k */
        void mo6019k(int i2, long j2, long j3);
    }

    /* renamed from: a */
    long mo6741a();

    @Nullable
    /* renamed from: d */
    TransferListener mo6742d();

    /* renamed from: e */
    void mo6743e(EventListener eventListener);

    /* renamed from: f */
    long mo6744f();

    /* renamed from: h */
    void mo6745h(Handler handler, EventListener eventListener);
}
