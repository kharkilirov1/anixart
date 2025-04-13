package io.grpc.internal;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.grpc.CallOptions;
import io.grpc.ClientStreamTracer;
import io.grpc.InternalLogId;
import io.grpc.InternalMetadata;
import io.grpc.Metadata;
import io.grpc.ProxyDetector;
import io.grpc.Status;
import io.grpc.internal.SharedResourceHolder;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class GrpcUtil {

    /* renamed from: a */
    public static final Logger f58655a = Logger.getLogger(GrpcUtil.class.getName());

    /* renamed from: b */
    public static final Charset f58656b = StandardCharsets.US_ASCII;

    /* renamed from: c */
    public static final Metadata.Key<Long> f58657c = Metadata.Key.m30914a("grpc-timeout", new TimeoutMarshaller());

    /* renamed from: d */
    public static final Metadata.Key<String> f58658d;

    /* renamed from: e */
    public static final Metadata.Key<byte[]> f58659e;

    /* renamed from: f */
    public static final Metadata.Key<String> f58660f;

    /* renamed from: g */
    public static final Metadata.Key<byte[]> f58661g;

    /* renamed from: h */
    public static final Metadata.Key<String> f58662h;

    /* renamed from: i */
    public static final Metadata.Key<String> f58663i;

    /* renamed from: j */
    public static final Metadata.Key<String> f58664j;

    /* renamed from: k */
    public static final Metadata.Key<String> f58665k;

    /* renamed from: l */
    public static final Splitter f58666l;

    /* renamed from: m */
    public static final long f58667m;

    /* renamed from: n */
    public static final CallOptions.Key<Boolean> f58668n;

    /* renamed from: o */
    public static final ClientStreamTracer f58669o;

    /* renamed from: p */
    public static final SharedResourceHolder.Resource<Executor> f58670p;

    /* renamed from: q */
    public static final SharedResourceHolder.Resource<ScheduledExecutorService> f58671q;

    /* renamed from: r */
    public static final Supplier<Stopwatch> f58672r;

    /* renamed from: io.grpc.internal.GrpcUtil$1 */
    public class C63901 implements ProxyDetector {
    }

    /* renamed from: io.grpc.internal.GrpcUtil$6 */
    class C63956 implements ClientTransport {

        /* renamed from: a */
        public final /* synthetic */ ClientTransport f58673a;

        @Override // io.grpc.InternalWithLogId
        /* renamed from: e */
        public InternalLogId mo30881e() {
            return this.f58673a.mo30881e();
        }
    }

    public static final class AcceptEncodingMarshaller implements InternalMetadata.TrustedAsciiMarshaller<byte[]> {
        public AcceptEncodingMarshaller() {
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: a */
        public byte[] mo30918a(Object obj) {
            return (byte[]) obj;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: b */
        public Object mo30919b(byte[] bArr) {
            return bArr;
        }

        public AcceptEncodingMarshaller(C63901 c63901) {
        }
    }

    @Immutable
    public static final class GrpcBuildVersion {
        public String toString() {
            return "null null";
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Http2Error {

        /* renamed from: d */
        public static final Http2Error f58674d;

        /* renamed from: e */
        public static final Http2Error[] f58675e;

        /* renamed from: f */
        public static final /* synthetic */ Http2Error[] f58676f;

        /* renamed from: b */
        public final int f58677b;

        /* renamed from: c */
        public final Status f58678c;

        /* JADX INFO: Fake field, exist only in values array */
        Http2Error EF0;

        /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.GrpcUtil.Http2Error.<clinit>():void");
        }

        public Http2Error(String str, int i2, int i3, Status status) {
            this.f58677b = i3;
            StringBuilder m24u = C0000a.m24u("HTTP/2 error code: ");
            m24u.append(name());
            String sb = m24u.toString();
            this.f58678c = status.m30947g(status.f58292b != null ? C0000a.m20q(C0000a.m27x(sb, " ("), status.f58292b, ")") : sb);
        }

        public static Http2Error valueOf(String str) {
            return (Http2Error) Enum.valueOf(Http2Error.class, str);
        }

        public static Http2Error[] values() {
            return (Http2Error[]) f58676f.clone();
        }
    }

    @VisibleForTesting
    public static class TimeoutMarshaller implements Metadata.AsciiMarshaller<Long> {
        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: a */
        public String mo30908a(Long l2) {
            Long l3 = l2;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l3.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l3.longValue() < 100000000) {
                return l3 + "n";
            }
            if (l3.longValue() < 100000000000L) {
                return timeUnit.toMicros(l3.longValue()) + "u";
            }
            if (l3.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l3.longValue()) + "m";
            }
            if (l3.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l3.longValue()) + "S";
            }
            if (l3.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l3.longValue()) + "M";
            }
            return timeUnit.toHours(l3.longValue()) + "H";
        }

        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: b */
        public Long mo30909b(String str) {
            Preconditions.m11179c(str.length() > 0, "empty timeout");
            Preconditions.m11179c(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
        }
    }

    static {
        Metadata.AsciiMarshaller<String> asciiMarshaller = Metadata.f58205d;
        f58658d = Metadata.Key.m30914a("grpc-encoding", asciiMarshaller);
        f58659e = InternalMetadata.m30879a("grpc-accept-encoding", new AcceptEncodingMarshaller(null));
        f58660f = Metadata.Key.m30914a("content-encoding", asciiMarshaller);
        f58661g = InternalMetadata.m30879a("accept-encoding", new AcceptEncodingMarshaller(null));
        f58662h = Metadata.Key.m30914a("content-length", asciiMarshaller);
        f58663i = Metadata.Key.m30914a("content-type", asciiMarshaller);
        f58664j = Metadata.Key.m30914a("te", asciiMarshaller);
        f58665k = Metadata.Key.m30914a("user-agent", asciiMarshaller);
        f58666l = Splitter.m11204a(',').m11209f();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f58667m = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        new ProxyDetectorImpl();
        f58668n = CallOptions.Key.m30808a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f58669o = new ClientStreamTracer() { // from class: io.grpc.internal.GrpcUtil.2
        };
        f58670p = new SharedResourceHolder.Resource<Executor>() { // from class: io.grpc.internal.GrpcUtil.3
            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: a */
            public Executor mo31098a() {
                return Executors.newCachedThreadPool(GrpcUtil.m31095f("grpc-default-executor-%d", true));
            }

            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: b */
            public void mo31099b(Executor executor) {
                ((ExecutorService) executor).shutdown();
            }

            public String toString() {
                return "grpc-default-executor";
            }
        };
        f58671q = new SharedResourceHolder.Resource<ScheduledExecutorService>() { // from class: io.grpc.internal.GrpcUtil.4
            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: a */
            public ScheduledExecutorService mo31098a() {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, GrpcUtil.m31095f("grpc-timer-%d", true));
                try {
                    newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
                return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
            }

            @Override // io.grpc.internal.SharedResourceHolder.Resource
            /* renamed from: b */
            public void mo31099b(ScheduledExecutorService scheduledExecutorService) {
                scheduledExecutorService.shutdown();
            }
        };
        f58672r = new Supplier<Stopwatch>() { // from class: io.grpc.internal.GrpcUtil.5
            @Override // com.google.common.base.Supplier
            public Stopwatch get() {
                return new Stopwatch();
            }
        };
    }

    /* renamed from: a */
    public static URI m31090a(String str) {
        Preconditions.m11187k(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(C0000a.m14k("Invalid authority: ", str), e2);
        }
    }

    /* renamed from: b */
    public static void m31091b(StreamListener.MessageProducer messageProducer) {
        while (true) {
            InputStream next = messageProducer.next();
            if (next == null) {
                return;
            } else {
                m31092c(next);
            }
        }
    }

    /* renamed from: c */
    public static void m31092c(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            f58655a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    /* renamed from: d */
    public static ClientStreamTracer[] m31093d(CallOptions callOptions, Metadata metadata, int i2, boolean z) {
        List<ClientStreamTracer.Factory> list = callOptions.f58065g;
        int size = list.size() + 1;
        ClientStreamTracer[] clientStreamTracerArr = new ClientStreamTracer[size];
        ClientStreamTracer.StreamInfo.Builder builder = new ClientStreamTracer.StreamInfo.Builder();
        builder.f58084a = callOptions;
        builder.f58085b = i2;
        builder.f58086c = z;
        ClientStreamTracer.StreamInfo streamInfo = new ClientStreamTracer.StreamInfo(callOptions, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            clientStreamTracerArr[i3] = list.get(i3).mo30823a(streamInfo, metadata);
        }
        clientStreamTracerArr[size - 1] = f58669o;
        return clientStreamTracerArr;
    }

    /* renamed from: e */
    public static String m31094e(String str, @Nullable String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append(JsonPointer.SEPARATOR);
        sb.append("1.44.1");
        return sb.toString();
    }

    /* renamed from: f */
    public static ThreadFactory m31095f(String str, boolean z) {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder();
        threadFactoryBuilder.f22238b = Boolean.valueOf(z);
        String.format(Locale.ROOT, str, 0);
        threadFactoryBuilder.f22237a = str;
        return threadFactoryBuilder.m12208a();
    }

    /* renamed from: g */
    public static Status m31096g(int i2) {
        Status.Code code;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        } else {
            code = Status.Code.INTERNAL;
        }
        return code.m30948a().m30947g("HTTP status code " + i2);
    }

    /* renamed from: h */
    public static boolean m31097h(CallOptions callOptions) {
        return !Boolean.TRUE.equals(callOptions.m30803a(f58668n));
    }
}
