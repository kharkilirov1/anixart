package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: classes2.dex */
final class ListenerCallQueue<L> {

    /* renamed from: b */
    public static final Logger f22198b = Logger.getLogger(ListenerCallQueue.class.getName());

    /* renamed from: a */
    public final List<PerListenerQueue<L>> f22199a = Collections.synchronizedList(new ArrayList());

    public interface Event<L> {
    }

    public static final class PerListenerQueue<L> implements Runnable {

        /* renamed from: b */
        @GuardedBy
        public boolean f22200b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (this) {
                    Preconditions.m11191o(this.f22200b);
                    throw null;
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f22200b = false;
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m12198a() {
        boolean z;
        for (int i2 = 0; i2 < this.f22199a.size(); i2++) {
            PerListenerQueue<L> perListenerQueue = this.f22199a.get(i2);
            synchronized (perListenerQueue) {
                z = true;
                if (perListenerQueue.f22200b) {
                    z = false;
                } else {
                    perListenerQueue.f22200b = true;
                }
            }
            if (z) {
                try {
                    throw null;
                } catch (RuntimeException e2) {
                    synchronized (perListenerQueue) {
                        perListenerQueue.f22200b = false;
                        f22198b.log(Level.SEVERE, "Exception while running callbacks for null on null", (Throwable) e2);
                        throw e2;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m12199b(Event<L> event) {
        Preconditions.m11187k(event, "event");
        synchronized (this.f22199a) {
            Iterator<PerListenerQueue<L>> it = this.f22199a.iterator();
            if (it.hasNext()) {
                synchronized (it.next()) {
                    throw null;
                }
            }
        }
    }
}
