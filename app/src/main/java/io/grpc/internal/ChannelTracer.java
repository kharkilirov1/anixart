package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
final class ChannelTracer {

    /* renamed from: e */
    public static final Logger f58466e = Logger.getLogger(ChannelLogger.class.getName());

    /* renamed from: a */
    public final Object f58467a;

    /* renamed from: b */
    public final InternalLogId f58468b;

    /* renamed from: c */
    @GuardedBy
    @Nullable
    public final Collection<InternalChannelz.ChannelTrace.Event> f58469c;

    /* renamed from: d */
    @GuardedBy
    public int f58470d;

    /* renamed from: io.grpc.internal.ChannelTracer$1 */
    class C63451 extends ArrayDeque<InternalChannelz.ChannelTrace.Event> {

        /* renamed from: b */
        public final /* synthetic */ int f58471b;

        /* renamed from: c */
        public final /* synthetic */ ChannelTracer f58472c;

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        @GuardedBy
        public boolean add(Object obj) {
            InternalChannelz.ChannelTrace.Event event = (InternalChannelz.ChannelTrace.Event) obj;
            if (size() == this.f58471b) {
                removeFirst();
            }
            this.f58472c.f58470d++;
            return super.add(event);
        }
    }

    /* renamed from: io.grpc.internal.ChannelTracer$2 */
    public static /* synthetic */ class C63462 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58473a;

        static {
            int[] iArr = new int[InternalChannelz.ChannelTrace.Event.Severity.values().length];
            f58473a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58473a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m31044a(InternalLogId internalLogId, Level level, String str) {
        Logger logger = f58466e;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + internalLogId + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }
}
