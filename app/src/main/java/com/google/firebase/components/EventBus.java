package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class EventBus implements Subscriber, Publisher {

    /* renamed from: a */
    @GuardedBy
    public final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> f22503a = new HashMap();

    /* renamed from: b */
    @GuardedBy
    public Queue<Event<?>> f22504b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f22505c;

    public EventBus(Executor executor) {
        this.f22505c = executor;
    }

    @Override // com.google.firebase.events.Subscriber
    /* renamed from: a */
    public <T> void mo12350a(Class<T> cls, EventHandler<? super T> eventHandler) {
        Executor executor = this.f22505c;
        synchronized (this) {
            Objects.requireNonNull(executor);
            if (!this.f22503a.containsKey(cls)) {
                this.f22503a.put(cls, new ConcurrentHashMap<>());
            }
            this.f22503a.get(cls).put(eventHandler, executor);
        }
    }
}
