package org.greenrobot.eventbus;

/* loaded from: classes3.dex */
public final class SubscriberExceptionEvent {

    /* renamed from: a */
    public final Throwable f68852a;

    /* renamed from: b */
    public final Object f68853b;

    /* renamed from: c */
    public final Object f68854c;

    public SubscriberExceptionEvent(EventBus eventBus, Throwable th, Object obj, Object obj2) {
        this.f68852a = th;
        this.f68853b = obj;
        this.f68854c = obj2;
    }
}
