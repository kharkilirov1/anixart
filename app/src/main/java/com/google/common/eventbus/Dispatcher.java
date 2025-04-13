package com.google.common.eventbus;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
abstract class Dispatcher {

    public static final class ImmediateDispatcher extends Dispatcher {
    }

    public static final class LegacyAsyncDispatcher extends Dispatcher {

        public static final class EventWithSubscriber {
        }

        public LegacyAsyncDispatcher() {
            new ConcurrentLinkedQueue();
        }
    }

    public static final class PerThreadQueuedDispatcher extends Dispatcher {

        public static final class Event {
        }

        public PerThreadQueuedDispatcher() {
            new ThreadLocal<Queue<Event>>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                @Override // java.lang.ThreadLocal
                public Queue<Event> initialValue() {
                    return new ArrayDeque();
                }
            };
            new ThreadLocal<Boolean>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                @Override // java.lang.ThreadLocal
                public /* bridge */ /* synthetic */ Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }

        public PerThreadQueuedDispatcher(C18181 c18181) {
            new ThreadLocal<Queue<Event>>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.1
                @Override // java.lang.ThreadLocal
                public Queue<Event> initialValue() {
                    return new ArrayDeque();
                }
            };
            new ThreadLocal<Boolean>() { // from class: com.google.common.eventbus.Dispatcher.PerThreadQueuedDispatcher.2
                @Override // java.lang.ThreadLocal
                public /* bridge */ /* synthetic */ Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }
    }
}
