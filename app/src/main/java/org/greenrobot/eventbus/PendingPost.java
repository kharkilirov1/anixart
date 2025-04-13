package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class PendingPost {

    /* renamed from: d */
    public static final List<PendingPost> f68846d = new ArrayList();

    /* renamed from: a */
    public Object f68847a;

    /* renamed from: b */
    public Subscription f68848b;

    /* renamed from: c */
    public PendingPost f68849c;

    public PendingPost(Object obj, Subscription subscription) {
        this.f68847a = obj;
        this.f68848b = subscription;
    }

    /* renamed from: a */
    public static PendingPost m34645a(Subscription subscription, Object obj) {
        List<PendingPost> list = f68846d;
        synchronized (list) {
            int size = ((ArrayList) list).size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost pendingPost = (PendingPost) ((ArrayList) list).remove(size - 1);
            pendingPost.f68847a = obj;
            pendingPost.f68848b = subscription;
            pendingPost.f68849c = null;
            return pendingPost;
        }
    }
}
