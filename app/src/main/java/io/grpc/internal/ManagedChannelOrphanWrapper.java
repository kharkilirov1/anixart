package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class ManagedChannelOrphanWrapper extends ForwardingManagedChannel {

    /* renamed from: a */
    public static final Logger f58865a;

    @VisibleForTesting
    public static final class ManagedChannelReference extends WeakReference<ManagedChannelOrphanWrapper> {
        static {
            Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
            new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it").setStackTrace(new StackTraceElement[0]);
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            super.clear();
            throw null;
        }
    }

    static {
        new ReferenceQueue();
        new ConcurrentHashMap();
        f58865a = Logger.getLogger(ManagedChannelOrphanWrapper.class.getName());
    }
}
