package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
class AsyncPoster implements Runnable, Poster {

    /* renamed from: b */
    public final PendingPostQueue f68809b = new PendingPostQueue();

    /* renamed from: c */
    public final EventBus f68810c;

    public AsyncPoster(EventBus eventBus) {
        this.f68810c = eventBus;
    }

    @Override // org.greenrobot.eventbus.Poster
    /* renamed from: a */
    public void mo34628a(Subscription subscription, Object obj) {
        this.f68809b.m34646a(PendingPost.m34645a(subscription, obj));
        this.f68810c.f68826j.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost m34647b = this.f68809b.m34647b();
        if (m34647b == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f68810c.m34632d(m34647b);
    }
}
