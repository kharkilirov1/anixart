package io.grpc;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

@Internal
/* loaded from: classes3.dex */
public final class InternalChannelz {

    /* renamed from: f */
    public static final Logger f58149f = Logger.getLogger(InternalChannelz.class.getName());

    /* renamed from: g */
    public static final InternalChannelz f58150g = new InternalChannelz();

    /* renamed from: a */
    public final ConcurrentNavigableMap<Long, InternalInstrumented<ServerStats>> f58151a = new ConcurrentSkipListMap();

    /* renamed from: b */
    public final ConcurrentNavigableMap<Long, InternalInstrumented<ChannelStats>> f58152b = new ConcurrentSkipListMap();

    /* renamed from: c */
    public final ConcurrentMap<Long, InternalInstrumented<ChannelStats>> f58153c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentMap<Long, InternalInstrumented<SocketStats>> f58154d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentMap<Long, ServerSocketMap> f58155e = new ConcurrentHashMap();

    @Immutable
    public static final class ChannelStats {

        public static final class Builder {

            /* renamed from: a */
            public List<InternalWithLogId> f58156a = Collections.emptyList();

            /* renamed from: b */
            public List<InternalWithLogId> f58157b = Collections.emptyList();
        }
    }

    @Immutable
    public static final class ChannelTrace {

        public static final class Builder {

            /* renamed from: a */
            public List<Event> f58158a = Collections.emptyList();
        }

        @Immutable
        public static final class Event {

            /* renamed from: a */
            public final String f58159a;

            /* renamed from: b */
            public final Severity f58160b;

            /* renamed from: c */
            public final long f58161c;

            /* renamed from: d */
            @Nullable
            public final InternalWithLogId f58162d;

            /* renamed from: e */
            @Nullable
            public final InternalWithLogId f58163e;

            public static final class Builder {

                /* renamed from: a */
                public String f58164a;

                /* renamed from: b */
                public Severity f58165b;

                /* renamed from: c */
                public Long f58166c;

                /* renamed from: d */
                public InternalWithLogId f58167d;

                /* renamed from: a */
                public Event m30875a() {
                    Preconditions.m11187k(this.f58164a, "description");
                    Preconditions.m11187k(this.f58165b, "severity");
                    Preconditions.m11187k(this.f58166c, "timestampNanos");
                    return new Event(this.f58164a, this.f58165b, this.f58166c.longValue(), null, this.f58167d, null);
                }

                /* renamed from: b */
                public Builder m30876b(long j2) {
                    this.f58166c = Long.valueOf(j2);
                    return this;
                }
            }

            public enum Severity {
                /* JADX INFO: Fake field, exist only in values array */
                CT_UNKNOWN,
                CT_INFO,
                CT_WARNING,
                CT_ERROR
            }

            public Event(String str, Severity severity, long j2, InternalWithLogId internalWithLogId, InternalWithLogId internalWithLogId2, C62971 c62971) {
                this.f58159a = str;
                Preconditions.m11187k(severity, "severity");
                this.f58160b = severity;
                this.f58161c = j2;
                this.f58162d = null;
                this.f58163e = internalWithLogId2;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return Objects.m11173a(this.f58159a, event.f58159a) && Objects.m11173a(this.f58160b, event.f58160b) && this.f58161c == event.f58161c && Objects.m11173a(this.f58162d, event.f58162d) && Objects.m11173a(this.f58163e, event.f58163e);
            }

            public int hashCode() {
                return Arrays.hashCode(new Object[]{this.f58159a, this.f58160b, Long.valueOf(this.f58161c), this.f58162d, this.f58163e});
            }

            public String toString() {
                MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
                m11166b.m11171e("description", this.f58159a);
                m11166b.m11171e("severity", this.f58160b);
                m11166b.m11169c("timestampNanos", this.f58161c);
                m11166b.m11171e("channelRef", this.f58162d);
                m11166b.m11171e("subchannelRef", this.f58163e);
                return m11166b.toString();
            }
        }
    }

    public static final class OtherSecurity {
    }

    public static final class RootChannelList {
    }

    public static final class Security {
    }

    public static final class ServerList {
    }

    public static final class ServerSocketMap extends ConcurrentSkipListMap<Long, InternalInstrumented<SocketStats>> {
    }

    public static final class ServerSocketsList {
    }

    @Immutable
    public static final class ServerStats {

        public static final class Builder {
            public Builder() {
                new ArrayList();
            }
        }
    }

    public static final class SocketOptions {

        public static final class Builder {
            public Builder() {
                new HashMap();
            }
        }
    }

    public static final class SocketStats {
    }

    public static final class TcpInfo {

        public static final class Builder {
        }
    }

    @Immutable
    public static final class Tls {
        public Tls(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e2) {
                InternalChannelz.f58149f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e2);
            }
        }
    }

    @Immutable
    public static final class TransportStats {
    }

    @VisibleForTesting
    public InternalChannelz() {
    }

    /* renamed from: a */
    public static <T extends InternalInstrumented<?>> void m30873a(Map<Long, T> map, T t) {
        map.put(Long.valueOf(t.mo30881e().f58180c), t);
    }

    /* renamed from: b */
    public static <T extends InternalInstrumented<?>> void m30874b(Map<Long, T> map, T t) {
        map.remove(Long.valueOf(t.mo30881e().f58180c));
    }
}
