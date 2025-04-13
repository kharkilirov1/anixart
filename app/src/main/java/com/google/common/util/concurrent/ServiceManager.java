package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import java.util.Map;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class ServiceManager implements ServiceManagerBridge {

    /* renamed from: a */
    public static final Logger f22226a = Logger.getLogger(ServiceManager.class.getName());

    /* renamed from: b */
    public static final ListenerCallQueue.Event<Listener> f22227b = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        public String toString() {
            return "healthy()";
        }
    };

    /* renamed from: c */
    public static final ListenerCallQueue.Event<Listener> f22228c = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
        public String toString() {
            return "stopped()";
        }
    };

    public static final class EmptyServiceManagerWarning extends Throwable {
    }

    public static abstract class Listener {
    }

    public static final class NoOpService extends AbstractService {
    }

    public static final class ServiceListener extends Service.Listener {
    }

    public static final class ServiceManagerState {

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1 */
        class C20311 implements Function<Map.Entry<Service, Long>, Long> {
            @Override // com.google.common.base.Function
            public Long apply(Map.Entry<Service, Long> entry) {
                return entry.getValue();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2 */
        class C20322 implements ListenerCallQueue.Event<Listener> {

            /* renamed from: a */
            public final /* synthetic */ Service f22229a;

            public String toString() {
                String valueOf = String.valueOf(this.f22229a);
                return C0576a.m4115n(valueOf.length() + 18, "failed({service=", valueOf, "})");
            }
        }

        public final class AwaitHealthGuard extends Monitor.Guard {
        }

        public final class StoppedGuard extends Monitor.Guard {
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper toStringHelper = new MoreObjects.ToStringHelper("ServiceManager", null);
        toStringHelper.m11171e("services", Collections2.m11432c(null, Predicates.m11203h(Predicates.m11202g(NoOpService.class))));
        return toStringHelper.toString();
    }
}
