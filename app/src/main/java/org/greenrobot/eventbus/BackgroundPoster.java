package org.greenrobot.eventbus;

import java.util.logging.Level;

/* loaded from: classes3.dex */
final class BackgroundPoster implements Runnable, Poster {

    /* renamed from: b */
    public final PendingPostQueue f68811b = new PendingPostQueue();

    /* renamed from: c */
    public final EventBus f68812c;

    /* renamed from: d */
    public volatile boolean f68813d;

    public BackgroundPoster(EventBus eventBus) {
        this.f68812c = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    /* renamed from: a */
    public void mo34628a(Subscription subscription, Object obj) {
        PendingPost m34645a = PendingPost.m34645a(subscription, obj);
        synchronized (this) {
            this.f68811b.m34646a(m34645a);
            if (!this.f68813d) {
                this.f68813d = true;
                this.f68812c.f68826j.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost m34647b;
        while (true) {
            try {
                PendingPostQueue pendingPostQueue = this.f68811b;
                synchronized (pendingPostQueue) {
                    if (pendingPostQueue.f68850a == null) {
                        pendingPostQueue.wait(1000);
                    }
                    m34647b = pendingPostQueue.m34647b();
                }
                if (m34647b == null) {
                    synchronized (this) {
                        m34647b = this.f68811b.m34647b();
                        if (m34647b == null) {
                            return;
                        }
                    }
                }
                this.f68812c.m34632d(m34647b);
            } catch (InterruptedException e2) {
                this.f68812c.f68832p.mo34642b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e2);
                return;
            } finally {
                this.f68813d = false;
            }
        }
    }
}
