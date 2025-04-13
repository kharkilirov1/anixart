package com.google.common.eventbus;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.eventbus.Dispatcher;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@Beta
/* loaded from: classes.dex */
public class EventBus {

    /* renamed from: d */
    public static final Logger f21670d = Logger.getLogger(EventBus.class.getName());

    /* renamed from: a */
    public final String f21671a;

    /* renamed from: b */
    public final Executor f21672b;

    /* renamed from: c */
    public final SubscriberExceptionHandler f21673c;

    public static final class LoggingHandler implements SubscriberExceptionHandler {

        /* renamed from: a */
        public static final LoggingHandler f21674a = new LoggingHandler();
    }

    public EventBus() {
        Executor m12201a = MoreExecutors.m12201a();
        new Dispatcher.PerThreadQueuedDispatcher(null);
        LoggingHandler loggingHandler = LoggingHandler.f21674a;
        new SubscriberRegistry(this);
        this.f21671a = "default";
        this.f21672b = m12201a;
        this.f21673c = loggingHandler;
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11172f(this.f21671a);
        return m11166b.toString();
    }
}
