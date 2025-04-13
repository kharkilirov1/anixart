package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public class HandlerPoster extends Handler implements Poster {

    /* renamed from: b */
    public final PendingPostQueue f68840b;

    /* renamed from: c */
    public final int f68841c;

    /* renamed from: d */
    public final EventBus f68842d;

    /* renamed from: e */
    public boolean f68843e;

    public HandlerPoster(EventBus eventBus, Looper looper, int i2) {
        super(looper);
        this.f68842d = eventBus;
        this.f68841c = i2;
        this.f68840b = new PendingPostQueue();
    }

    @Override // org.greenrobot.eventbus.Poster
    /* renamed from: a */
    public void mo34628a(Subscription subscription, Object obj) {
        PendingPost m34645a = PendingPost.m34645a(subscription, obj);
        synchronized (this) {
            this.f68840b.m34646a(m34645a);
            if (!this.f68843e) {
                this.f68843e = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost m34647b = this.f68840b.m34647b();
                if (m34647b == null) {
                    synchronized (this) {
                        m34647b = this.f68840b.m34647b();
                        if (m34647b == null) {
                            this.f68843e = false;
                            return;
                        }
                    }
                }
                this.f68842d.m34632d(m34647b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f68841c);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f68843e = true;
        } finally {
            this.f68843e = false;
        }
    }
}
