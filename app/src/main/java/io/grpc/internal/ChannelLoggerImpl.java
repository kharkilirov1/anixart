package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class ChannelLoggerImpl extends ChannelLogger {

    /* renamed from: a */
    public final ChannelTracer f58463a;

    /* renamed from: b */
    public final TimeProvider f58464b;

    /* renamed from: io.grpc.internal.ChannelLoggerImpl$1 */
    public static /* synthetic */ class C63441 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58465a;

        static {
            int[] iArr = new int[ChannelLogger.ChannelLogLevel.values().length];
            f58465a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58465a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58465a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: d */
    public static Level m31042d(ChannelLogger.ChannelLogLevel channelLogLevel) {
        int ordinal = channelLogLevel.ordinal();
        return ordinal != 1 ? (ordinal == 2 || ordinal == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // io.grpc.ChannelLogger
    /* renamed from: a */
    public void mo30810a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
        InternalLogId internalLogId = this.f58463a.f58468b;
        Level m31042d = m31042d(channelLogLevel);
        if (ChannelTracer.f58466e.isLoggable(m31042d)) {
            ChannelTracer.m31044a(internalLogId, m31042d, str);
        }
        if (!m31043c(channelLogLevel) || channelLogLevel == ChannelLogger.ChannelLogLevel.DEBUG) {
            return;
        }
        ChannelTracer channelTracer = this.f58463a;
        InternalChannelz.ChannelTrace.Event.Builder builder = new InternalChannelz.ChannelTrace.Event.Builder();
        builder.f58164a = str;
        int ordinal = channelLogLevel.ordinal();
        builder.f58165b = ordinal != 2 ? ordinal != 3 ? InternalChannelz.ChannelTrace.Event.Severity.CT_INFO : InternalChannelz.ChannelTrace.Event.Severity.CT_ERROR : InternalChannelz.ChannelTrace.Event.Severity.CT_WARNING;
        builder.m30876b(this.f58464b.mo31206a());
        InternalChannelz.ChannelTrace.Event m30875a = builder.m30875a();
        synchronized (channelTracer.f58467a) {
            Collection<InternalChannelz.ChannelTrace.Event> collection = channelTracer.f58469c;
            if (collection != null) {
                collection.add(m30875a);
            }
        }
    }

    @Override // io.grpc.ChannelLogger
    /* renamed from: b */
    public void mo30811b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
        mo30810a(channelLogLevel, (m31043c(channelLogLevel) || ChannelTracer.f58466e.isLoggable(m31042d(channelLogLevel))) ? MessageFormat.format(str, objArr) : null);
    }

    /* renamed from: c */
    public final boolean m31043c(ChannelLogger.ChannelLogLevel channelLogLevel) {
        boolean z;
        if (channelLogLevel == ChannelLogger.ChannelLogLevel.DEBUG) {
            return false;
        }
        ChannelTracer channelTracer = this.f58463a;
        synchronized (channelTracer.f58467a) {
            z = channelTracer.f58469c != null;
        }
        return z;
    }
}
