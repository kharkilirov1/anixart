package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
final class Subscription {

    /* renamed from: a */
    public final Object f68873a;

    /* renamed from: b */
    public final SubscriberMethod f68874b;

    /* renamed from: c */
    public volatile boolean f68875c = true;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f68873a = obj;
        this.f68874b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f68873a == subscription.f68873a && this.f68874b.equals(subscription.f68874b);
    }

    public int hashCode() {
        return this.f68874b.f68860f.hashCode() + this.f68873a.hashCode();
    }
}
