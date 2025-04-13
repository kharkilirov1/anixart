package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class PendingPostQueue {

    /* renamed from: a */
    public PendingPost f68850a;

    /* renamed from: b */
    public PendingPost f68851b;

    /* renamed from: a */
    public synchronized void m34646a(PendingPost pendingPost) {
        PendingPost pendingPost2 = this.f68851b;
        if (pendingPost2 != null) {
            pendingPost2.f68849c = pendingPost;
            this.f68851b = pendingPost;
        } else {
            if (this.f68850a != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f68851b = pendingPost;
            this.f68850a = pendingPost;
        }
        notifyAll();
    }

    /* renamed from: b */
    public synchronized PendingPost m34647b() {
        PendingPost pendingPost;
        pendingPost = this.f68850a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f68849c;
            this.f68850a = pendingPost2;
            if (pendingPost2 == null) {
                this.f68851b = null;
            }
        }
        return pendingPost;
    }
}
