package io.grpc.okhttp;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.squareup.okhttp.Credentials;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.internal.http.StatusLine;
import io.grpc.Attributes;
import io.grpc.Grpc;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.InternalChannelz;
import io.grpc.InternalLogId;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.ClientTransport;
import io.grpc.internal.ConnectionClientTransport;
import io.grpc.internal.GrpcAttributes;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.Http2Ping;
import io.grpc.internal.InUseStateAggregator;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.ManagedClientTransport;
import io.grpc.internal.SerializingExecutor;
import io.grpc.internal.SharedResourceHolder;
import io.grpc.internal.TransportTracer;
import io.grpc.okhttp.ExceptionHandlingFrameWriter;
import io.grpc.okhttp.OkHttpClientStream;
import io.grpc.okhttp.OkHttpFrameLogger;
import io.grpc.okhttp.internal.ConnectionSpec;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameReader;
import io.grpc.okhttp.internal.framed.FrameWriter;
import io.grpc.okhttp.internal.framed.Header;
import io.grpc.okhttp.internal.framed.HeadersMode;
import io.grpc.okhttp.internal.framed.Http2;
import io.grpc.okhttp.internal.framed.Settings;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.p038ws.RealWebSocket;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.RealBufferedSink;
import okio.Source;
import okio.Timeout;
import p000a.C0000a;

/* loaded from: classes3.dex */
class OkHttpClientTransport implements ConnectionClientTransport, ExceptionHandlingFrameWriter.TransportExceptionHandler {

    /* renamed from: O */
    public static final Map<ErrorCode, Status> f59236O;

    /* renamed from: P */
    public static final Logger f59237P;

    /* renamed from: Q */
    public static final OkHttpClientStream[] f59238Q;

    /* renamed from: A */
    @GuardedBy
    public int f59239A;

    /* renamed from: B */
    @GuardedBy
    public final Deque<OkHttpClientStream> f59240B;

    /* renamed from: C */
    public final ConnectionSpec f59241C;

    /* renamed from: D */
    public ScheduledExecutorService f59242D;

    /* renamed from: E */
    public KeepAliveManager f59243E;

    /* renamed from: F */
    public boolean f59244F;

    /* renamed from: G */
    public long f59245G;

    /* renamed from: H */
    public long f59246H;

    /* renamed from: I */
    public boolean f59247I;

    /* renamed from: J */
    public final Runnable f59248J;

    /* renamed from: K */
    public final int f59249K;

    /* renamed from: L */
    @GuardedBy
    public final TransportTracer f59250L;

    /* renamed from: M */
    @GuardedBy
    public final InUseStateAggregator<OkHttpClientStream> f59251M;

    /* renamed from: N */
    @VisibleForTesting
    @Nullable
    public final HttpConnectProxiedSocketAddress f59252N;

    /* renamed from: a */
    public final InetSocketAddress f59253a;

    /* renamed from: b */
    public final String f59254b;

    /* renamed from: c */
    public final String f59255c;

    /* renamed from: d */
    public final Random f59256d;

    /* renamed from: e */
    public final Supplier<Stopwatch> f59257e;

    /* renamed from: f */
    public final int f59258f;

    /* renamed from: g */
    public ManagedClientTransport.Listener f59259g;

    /* renamed from: h */
    @GuardedBy
    public ExceptionHandlingFrameWriter f59260h;

    /* renamed from: i */
    public OutboundFlowController f59261i;

    /* renamed from: j */
    public final Object f59262j;

    /* renamed from: k */
    public final InternalLogId f59263k;

    /* renamed from: l */
    @GuardedBy
    public int f59264l;

    /* renamed from: m */
    @GuardedBy
    public final Map<Integer, OkHttpClientStream> f59265m;

    /* renamed from: n */
    public final Executor f59266n;

    /* renamed from: o */
    public final SerializingExecutor f59267o;

    /* renamed from: p */
    public int f59268p;

    /* renamed from: q */
    public ClientFrameHandler f59269q;

    /* renamed from: r */
    public Attributes f59270r;

    /* renamed from: s */
    @GuardedBy
    public Status f59271s;

    /* renamed from: t */
    @GuardedBy
    public boolean f59272t;

    /* renamed from: u */
    @GuardedBy
    public Http2Ping f59273u;

    /* renamed from: v */
    @GuardedBy
    public boolean f59274v;

    /* renamed from: w */
    @GuardedBy
    public boolean f59275w;

    /* renamed from: x */
    public final SocketFactory f59276x;

    /* renamed from: y */
    public SSLSocketFactory f59277y;

    /* renamed from: z */
    public HostnameVerifier f59278z;

    /* renamed from: io.grpc.okhttp.OkHttpClientTransport$1 */
    public class C64771 extends InUseStateAggregator<OkHttpClientStream> {

        /* renamed from: b */
        public final /* synthetic */ OkHttpClientTransport f59279b;

        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: a */
        public void mo30974a() {
            this.f59279b.f59259g.mo31130d(true);
        }

        @Override // io.grpc.internal.InUseStateAggregator
        /* renamed from: b */
        public void mo30975b() {
            this.f59279b.f59259g.mo31130d(false);
        }
    }

    /* renamed from: io.grpc.okhttp.OkHttpClientTransport$2 */
    class C64782 implements TransportTracer.FlowControlReader {
    }

    static {
        EnumMap enumMap = new EnumMap(ErrorCode.class);
        ErrorCode errorCode = ErrorCode.NO_ERROR;
        Status status = Status.f58286m;
        enumMap.put((EnumMap) errorCode, (ErrorCode) status.m30947g("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) ErrorCode.PROTOCOL_ERROR, (ErrorCode) status.m30947g("Protocol error"));
        enumMap.put((EnumMap) ErrorCode.INTERNAL_ERROR, (ErrorCode) status.m30947g("Internal error"));
        enumMap.put((EnumMap) ErrorCode.FLOW_CONTROL_ERROR, (ErrorCode) status.m30947g("Flow control error"));
        enumMap.put((EnumMap) ErrorCode.STREAM_CLOSED, (ErrorCode) status.m30947g("Stream closed"));
        enumMap.put((EnumMap) ErrorCode.FRAME_TOO_LARGE, (ErrorCode) status.m30947g("Frame too large"));
        enumMap.put((EnumMap) ErrorCode.REFUSED_STREAM, (ErrorCode) Status.f58287n.m30947g("Refused stream"));
        enumMap.put((EnumMap) ErrorCode.CANCEL, (ErrorCode) Status.f58279f.m30947g("Cancelled"));
        enumMap.put((EnumMap) ErrorCode.COMPRESSION_ERROR, (ErrorCode) status.m30947g("Compression error"));
        enumMap.put((EnumMap) ErrorCode.CONNECT_ERROR, (ErrorCode) status.m30947g("Connect error"));
        enumMap.put((EnumMap) ErrorCode.ENHANCE_YOUR_CALM, (ErrorCode) Status.f58284k.m30947g("Enhance your calm"));
        enumMap.put((EnumMap) ErrorCode.INADEQUATE_SECURITY, (ErrorCode) Status.f58282i.m30947g("Inadequate security"));
        f59236O = Collections.unmodifiableMap(enumMap);
        f59237P = Logger.getLogger(OkHttpClientTransport.class.getName());
        f59238Q = new OkHttpClientStream[0];
    }

    /* renamed from: g */
    public static Socket m31227g(OkHttpClientTransport okHttpClientTransport, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        Objects.requireNonNull(okHttpClientTransport);
        try {
            Socket createSocket = inetSocketAddress2.getAddress() != null ? okHttpClientTransport.f59276x.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : okHttpClientTransport.f59276x.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            createSocket.setTcpNoDelay(true);
            Source m34608j = Okio.m34608j(createSocket);
            BufferedSink m34601c = Okio.m34601c(Okio.m34604f(createSocket));
            Request m31231i = okHttpClientTransport.m31231i(inetSocketAddress, str, str2);
            HttpUrl httpUrl = m31231i.f24914a;
            RealBufferedSink realBufferedSink = (RealBufferedSink) m34601c;
            realBufferedSink.mo34559p0(String.format("CONNECT %s:%d HTTP/1.1", httpUrl.f24855d, Integer.valueOf(httpUrl.f24856e))).mo34559p0("\r\n");
            int m13891b = m31231i.f24916c.m13891b();
            for (int i2 = 0; i2 < m13891b; i2++) {
                realBufferedSink.mo34559p0(m31231i.f24916c.m13890a(i2)).mo34559p0(": ").mo34559p0(m31231i.f24916c.m13892c(i2)).mo34559p0("\r\n");
            }
            realBufferedSink.mo34559p0("\r\n");
            realBufferedSink.flush();
            StatusLine m14008a = StatusLine.m14008a(m31229r(m34608j));
            while (!m31229r(m34608j).equals("")) {
            }
            int i3 = m14008a.f25185b;
            if (i3 >= 200 && i3 < 300) {
                return createSocket;
            }
            Buffer buffer = new Buffer();
            try {
                createSocket.shutdownOutput();
                m34608j.read(buffer, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            } catch (IOException e2) {
                buffer.m34516D0("Unable to read body: " + e2.toString());
            }
            try {
                createSocket.close();
            } catch (IOException unused) {
            }
            throw new StatusException(Status.f58287n.m30947g(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(m14008a.f25185b), m14008a.f25186c, buffer.m34553m())));
        } catch (IOException e3) {
            throw new StatusException(Status.f58287n.m30947g("Failed trying to connect with proxy").m30946f(e3));
        }
    }

    /* renamed from: h */
    public static void m31228h(OkHttpClientTransport okHttpClientTransport, ErrorCode errorCode, String str) {
        Objects.requireNonNull(okHttpClientTransport);
        okHttpClientTransport.m31242u(0, errorCode, m31230y(errorCode).m30944a(str));
    }

    /* renamed from: r */
    public static String m31229r(Source source) throws IOException {
        Buffer buffer = new Buffer();
        while (source.read(buffer, 1L) != -1) {
            if (buffer.m34539e(buffer.f68742c - 1) == 10) {
                return buffer.mo34520M0();
            }
        }
        StringBuilder m24u = C0000a.m24u("\\n not found: ");
        m24u.append(buffer.mo34515B0().mo34577e());
        throw new EOFException(m24u.toString());
    }

    @VisibleForTesting
    /* renamed from: y */
    public static Status m31230y(ErrorCode errorCode) {
        Status status = f59236O.get(errorCode);
        if (status != null) {
            return status;
        }
        Status status2 = Status.f58280g;
        StringBuilder m24u = C0000a.m24u("Unknown http2 error code: ");
        m24u.append(errorCode.f59421b);
        return status2.m30947g(m24u.toString());
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: a */
    public void mo30968a(Status status) {
        ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.PROCESSED;
        mo30969b(status);
        synchronized (this.f59262j) {
            Iterator<Map.Entry<Integer, OkHttpClientStream>> it = this.f59265m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, OkHttpClientStream> next = it.next();
                it.remove();
                next.getValue().f59216n.m31017k(status, rpcProgress, false, new Metadata());
                m31239q(next.getValue());
            }
            for (OkHttpClientStream okHttpClientStream : this.f59240B) {
                okHttpClientStream.f59216n.m31017k(status, rpcProgress, true, new Metadata());
                m31239q(okHttpClientStream);
            }
            this.f59240B.clear();
            m31245x();
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: b */
    public void mo30969b(Status status) {
        synchronized (this.f59262j) {
            if (this.f59271s != null) {
                return;
            }
            this.f59271s = status;
            this.f59259g.mo31128b(status);
            m31245x();
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: c */
    public Runnable mo30970c(ManagedClientTransport.Listener listener) {
        Preconditions.m11187k(listener, "listener");
        this.f59259g = listener;
        if (this.f59244F) {
            this.f59242D = (ScheduledExecutorService) SharedResourceHolder.m31195a(GrpcUtil.f58671q);
            KeepAliveManager keepAliveManager = new KeepAliveManager(new KeepAliveManager.ClientKeepAlivePinger(this), this.f59242D, this.f59245G, this.f59246H, this.f59247I);
            this.f59243E = keepAliveManager;
            synchronized (keepAliveManager) {
                if (keepAliveManager.f58793d) {
                    keepAliveManager.m31132b();
                }
            }
        }
        if (this.f59253a == null) {
            synchronized (this.f59262j) {
                ExceptionHandlingFrameWriter exceptionHandlingFrameWriter = new ExceptionHandlingFrameWriter(this, null, null);
                this.f59260h = exceptionHandlingFrameWriter;
                this.f59261i = new OutboundFlowController(this, exceptionHandlingFrameWriter);
            }
            this.f59267o.execute(new Runnable() { // from class: io.grpc.okhttp.OkHttpClientTransport.3
                @Override // java.lang.Runnable
                public void run() {
                    Objects.requireNonNull(OkHttpClientTransport.this);
                    OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                    Objects.requireNonNull(okHttpClientTransport);
                    Objects.requireNonNull(OkHttpClientTransport.this);
                    okHttpClientTransport.f59269q = okHttpClientTransport.new ClientFrameHandler(null, null);
                    OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
                    okHttpClientTransport2.f59266n.execute(okHttpClientTransport2.f59269q);
                    synchronized (OkHttpClientTransport.this.f59262j) {
                        OkHttpClientTransport okHttpClientTransport3 = OkHttpClientTransport.this;
                        okHttpClientTransport3.f59239A = Integer.MAX_VALUE;
                        okHttpClientTransport3.m31243v();
                    }
                    Objects.requireNonNull(OkHttpClientTransport.this);
                    throw null;
                }
            });
            return null;
        }
        final AsyncSink asyncSink = new AsyncSink(this.f59267o, this);
        final Http2 http2 = new Http2();
        FrameWriter m31314f = http2.m31314f(Okio.m34601c(asyncSink), true);
        synchronized (this.f59262j) {
            ExceptionHandlingFrameWriter exceptionHandlingFrameWriter2 = new ExceptionHandlingFrameWriter(this, m31314f, new OkHttpFrameLogger(Level.FINE, OkHttpClientTransport.class));
            this.f59260h = exceptionHandlingFrameWriter2;
            this.f59261i = new OutboundFlowController(this, exceptionHandlingFrameWriter2);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f59267o.execute(new Runnable() { // from class: io.grpc.okhttp.OkHttpClientTransport.4
            @Override // java.lang.Runnable
            public void run() {
                OkHttpClientTransport okHttpClientTransport;
                ClientFrameHandler clientFrameHandler;
                Socket m31227g;
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                BufferedSource m34602d = Okio.m34602d(new Source(this) { // from class: io.grpc.okhttp.OkHttpClientTransport.4.1
                    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                    }

                    @Override // okio.Source
                    public long read(Buffer buffer, long j2) {
                        return -1L;
                    }

                    @Override // okio.Source
                    /* renamed from: timeout */
                    public Timeout getTimeout() {
                        return Timeout.NONE;
                    }
                });
                SSLSession sSLSession = null;
                try {
                    try {
                        OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
                        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = okHttpClientTransport2.f59252N;
                        if (httpConnectProxiedSocketAddress == null) {
                            m31227g = okHttpClientTransport2.f59276x.createSocket(okHttpClientTransport2.f59253a.getAddress(), OkHttpClientTransport.this.f59253a.getPort());
                        } else {
                            SocketAddress socketAddress = httpConnectProxiedSocketAddress.f58145b;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new StatusException(Status.f58286m.m30947g("Unsupported SocketAddress implementation " + OkHttpClientTransport.this.f59252N.f58145b.getClass()));
                            }
                            m31227g = OkHttpClientTransport.m31227g(okHttpClientTransport2, httpConnectProxiedSocketAddress.f58146c, (InetSocketAddress) socketAddress, httpConnectProxiedSocketAddress.f58147d, httpConnectProxiedSocketAddress.f58148e);
                        }
                        Socket socket = m31227g;
                        OkHttpClientTransport okHttpClientTransport3 = OkHttpClientTransport.this;
                        SSLSocketFactory sSLSocketFactory = okHttpClientTransport3.f59277y;
                        Socket socket2 = socket;
                        if (sSLSocketFactory != null) {
                            SSLSocket m31262a = OkHttpTlsUpgrader.m31262a(sSLSocketFactory, okHttpClientTransport3.f59278z, socket, okHttpClientTransport3.m31234l(), OkHttpClientTransport.this.m31235m(), OkHttpClientTransport.this.f59241C);
                            sSLSession = m31262a.getSession();
                            socket2 = m31262a;
                        }
                        socket2.setTcpNoDelay(true);
                        BufferedSource m34602d2 = Okio.m34602d(Okio.m34608j(socket2));
                        asyncSink.m31213a(Okio.m34604f(socket2), socket2);
                        OkHttpClientTransport okHttpClientTransport4 = OkHttpClientTransport.this;
                        Attributes.Builder m30800b = okHttpClientTransport4.f59270r.m30800b();
                        m30800b.m30802b(Grpc.f58142a, socket2.getRemoteSocketAddress());
                        m30800b.m30802b(Grpc.f58143b, socket2.getLocalSocketAddress());
                        m30800b.m30802b(Grpc.f58144c, sSLSession);
                        m30800b.m30802b(GrpcAttributes.f58653a, sSLSession == null ? SecurityLevel.NONE : SecurityLevel.PRIVACY_AND_INTEGRITY);
                        okHttpClientTransport4.f59270r = m30800b.m30801a();
                        OkHttpClientTransport okHttpClientTransport5 = OkHttpClientTransport.this;
                        okHttpClientTransport5.f59269q = new ClientFrameHandler(okHttpClientTransport5, http2.mo31313a(m34602d2, true));
                        synchronized (OkHttpClientTransport.this.f59262j) {
                            Objects.requireNonNull(OkHttpClientTransport.this);
                            if (sSLSession != null) {
                                OkHttpClientTransport okHttpClientTransport6 = OkHttpClientTransport.this;
                                new InternalChannelz.Tls(sSLSession);
                                Objects.requireNonNull(okHttpClientTransport6);
                            }
                        }
                    } catch (StatusException e2) {
                        OkHttpClientTransport okHttpClientTransport7 = OkHttpClientTransport.this;
                        ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
                        Status status = e2.f58315b;
                        Map<ErrorCode, Status> map = OkHttpClientTransport.f59236O;
                        okHttpClientTransport7.m31242u(0, errorCode, status);
                        okHttpClientTransport = OkHttpClientTransport.this;
                        clientFrameHandler = new ClientFrameHandler(okHttpClientTransport, http2.mo31313a(m34602d, true));
                        okHttpClientTransport.f59269q = clientFrameHandler;
                    } catch (Exception e3) {
                        OkHttpClientTransport.this.mo31220d(e3);
                        okHttpClientTransport = OkHttpClientTransport.this;
                        clientFrameHandler = new ClientFrameHandler(okHttpClientTransport, http2.mo31313a(m34602d, true));
                        okHttpClientTransport.f59269q = clientFrameHandler;
                    }
                } catch (Throwable th) {
                    OkHttpClientTransport okHttpClientTransport8 = OkHttpClientTransport.this;
                    okHttpClientTransport8.f59269q = new ClientFrameHandler(okHttpClientTransport8, http2.mo31313a(m34602d, true));
                    throw th;
                }
            }
        });
        try {
            m31240s();
            countDownLatch.countDown();
            this.f59267o.execute(new Runnable() { // from class: io.grpc.okhttp.OkHttpClientTransport.5
                @Override // java.lang.Runnable
                public void run() {
                    OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                    okHttpClientTransport.f59266n.execute(okHttpClientTransport.f59269q);
                    synchronized (OkHttpClientTransport.this.f59262j) {
                        OkHttpClientTransport okHttpClientTransport2 = OkHttpClientTransport.this;
                        okHttpClientTransport2.f59239A = Integer.MAX_VALUE;
                        okHttpClientTransport2.m31243v();
                    }
                }
            });
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // io.grpc.okhttp.ExceptionHandlingFrameWriter.TransportExceptionHandler
    /* renamed from: d */
    public void mo31220d(Throwable th) {
        m31242u(0, ErrorCode.INTERNAL_ERROR, Status.f58287n.m30946f(th));
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return this.f59263k;
    }

    @Override // io.grpc.internal.ClientTransport
    /* renamed from: f */
    public void mo30971f(ClientTransport.PingCallback pingCallback, Executor executor) {
        long nextLong;
        synchronized (this.f59262j) {
            boolean z = true;
            Preconditions.m11191o(this.f59260h != null);
            if (this.f59274v) {
                Http2Ping.m31110e(pingCallback, executor, m31236n());
                return;
            }
            Http2Ping http2Ping = this.f59273u;
            if (http2Ping != null) {
                nextLong = 0;
                z = false;
            } else {
                nextLong = this.f59256d.nextLong();
                Stopwatch stopwatch = this.f59257e.get();
                stopwatch.m11216d();
                Http2Ping http2Ping2 = new Http2Ping(nextLong, stopwatch);
                this.f59273u = http2Ping2;
                this.f59250L.f59172e++;
                http2Ping = http2Ping2;
            }
            if (z) {
                this.f59260h.ping(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            http2Ping.m31111a(pingCallback, executor);
        }
    }

    /* renamed from: i */
    public final Request m31231i(InetSocketAddress inetSocketAddress, String str, String str2) {
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.m13920g("https");
        builder.m13917d(inetSocketAddress.getHostName());
        builder.m13918e(inetSocketAddress.getPort());
        HttpUrl m13915a = builder.m13915a();
        Request.Builder builder2 = new Request.Builder();
        builder2.m13927c(m13915a);
        builder2.m13926b("Host", m13915a.f24855d + ":" + m13915a.f24856e);
        builder2.m13926b("User-Agent", this.f59255c);
        if (str != null && str2 != null) {
            builder2.m13926b("Proxy-Authorization", Credentials.m13889a(str, str2));
        }
        return builder2.m13925a();
    }

    /* renamed from: j */
    public void m31232j(int i2, @Nullable Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z, @Nullable ErrorCode errorCode, @Nullable Metadata metadata) {
        synchronized (this.f59262j) {
            OkHttpClientStream remove = this.f59265m.remove(Integer.valueOf(i2));
            if (remove != null) {
                if (errorCode != null) {
                    this.f59260h.mo31217d(i2, ErrorCode.CANCEL);
                }
                if (status != null) {
                    OkHttpClientStream.TransportState transportState = remove.f59216n;
                    if (metadata == null) {
                        metadata = new Metadata();
                    }
                    transportState.m31017k(status, rpcProgress, z, metadata);
                }
                if (!m31243v()) {
                    m31245x();
                    m31239q(remove);
                }
            }
        }
    }

    /* renamed from: k */
    public OkHttpClientStream[] m31233k() {
        OkHttpClientStream[] okHttpClientStreamArr;
        synchronized (this.f59262j) {
            okHttpClientStreamArr = (OkHttpClientStream[]) this.f59265m.values().toArray(f59238Q);
        }
        return okHttpClientStreamArr;
    }

    @VisibleForTesting
    /* renamed from: l */
    public String m31234l() {
        URI m31090a = GrpcUtil.m31090a(this.f59254b);
        return m31090a.getHost() != null ? m31090a.getHost() : this.f59254b;
    }

    @VisibleForTesting
    /* renamed from: m */
    public int m31235m() {
        URI m31090a = GrpcUtil.m31090a(this.f59254b);
        return m31090a.getPort() != -1 ? m31090a.getPort() : this.f59253a.getPort();
    }

    /* renamed from: n */
    public final Throwable m31236n() {
        synchronized (this.f59262j) {
            Status status = this.f59271s;
            if (status == null) {
                return new StatusException(Status.f58287n.m30947g("Connection closed"));
            }
            Objects.requireNonNull(status);
            return new StatusException(status);
        }
    }

    /* renamed from: o */
    public OkHttpClientStream m31237o(int i2) {
        OkHttpClientStream okHttpClientStream;
        synchronized (this.f59262j) {
            okHttpClientStream = this.f59265m.get(Integer.valueOf(i2));
        }
        return okHttpClientStream;
    }

    /* renamed from: p */
    public boolean m31238p(int i2) {
        boolean z;
        synchronized (this.f59262j) {
            z = true;
            if (i2 >= this.f59264l || (i2 & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    @GuardedBy
    /* renamed from: q */
    public final void m31239q(OkHttpClientStream okHttpClientStream) {
        if (this.f59275w && this.f59240B.isEmpty() && this.f59265m.isEmpty()) {
            this.f59275w = false;
            KeepAliveManager keepAliveManager = this.f59243E;
            if (keepAliveManager != null) {
                keepAliveManager.m31133c();
            }
        }
        if (okHttpClientStream.f58392c) {
            this.f59251M.m31114c(okHttpClientStream, false);
        }
    }

    @VisibleForTesting
    /* renamed from: s */
    public void m31240s() {
        synchronized (this.f59262j) {
            ExceptionHandlingFrameWriter exceptionHandlingFrameWriter = this.f59260h;
            Objects.requireNonNull(exceptionHandlingFrameWriter);
            try {
                exceptionHandlingFrameWriter.f59191c.connectionPreface();
            } catch (IOException e2) {
                exceptionHandlingFrameWriter.f59190b.mo31220d(e2);
            }
            Settings settings = new Settings();
            settings.m31321b(7, 0, this.f59258f);
            ExceptionHandlingFrameWriter exceptionHandlingFrameWriter2 = this.f59260h;
            exceptionHandlingFrameWriter2.f59192d.m31256f(OkHttpFrameLogger.Direction.OUTBOUND, settings);
            try {
                exceptionHandlingFrameWriter2.f59191c.mo31215C0(settings);
            } catch (IOException e3) {
                exceptionHandlingFrameWriter2.f59190b.mo31220d(e3);
            }
            if (this.f59258f > 65535) {
                this.f59260h.windowUpdate(0, r1 - okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
    }

    @GuardedBy
    /* renamed from: t */
    public final void m31241t(OkHttpClientStream okHttpClientStream) {
        if (!this.f59275w) {
            this.f59275w = true;
            KeepAliveManager keepAliveManager = this.f59243E;
            if (keepAliveManager != null) {
                keepAliveManager.m31132b();
            }
        }
        if (okHttpClientStream.f58392c) {
            this.f59251M.m31114c(okHttpClientStream, true);
        }
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11169c("logId", this.f59263k.f58180c);
        m11166b.m11171e("address", this.f59253a);
        return m11166b.toString();
    }

    /* renamed from: u */
    public final void m31242u(int i2, ErrorCode errorCode, Status status) {
        ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.REFUSED;
        synchronized (this.f59262j) {
            if (this.f59271s == null) {
                this.f59271s = status;
                this.f59259g.mo31128b(status);
            }
            if (errorCode != null && !this.f59272t) {
                this.f59272t = true;
                this.f59260h.mo31218l1(0, errorCode, new byte[0]);
            }
            Iterator<Map.Entry<Integer, OkHttpClientStream>> it = this.f59265m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, OkHttpClientStream> next = it.next();
                if (next.getKey().intValue() > i2) {
                    it.remove();
                    next.getValue().f59216n.m31017k(status, rpcProgress, false, new Metadata());
                    m31239q(next.getValue());
                }
            }
            for (OkHttpClientStream okHttpClientStream : this.f59240B) {
                okHttpClientStream.f59216n.m31017k(status, rpcProgress, true, new Metadata());
                m31239q(okHttpClientStream);
            }
            this.f59240B.clear();
            m31245x();
        }
    }

    @GuardedBy
    /* renamed from: v */
    public final boolean m31243v() {
        boolean z = false;
        while (!this.f59240B.isEmpty() && this.f59265m.size() < this.f59239A) {
            m31244w(this.f59240B.poll());
            z = true;
        }
        return z;
    }

    @GuardedBy
    /* renamed from: w */
    public final void m31244w(OkHttpClientStream okHttpClientStream) {
        Preconditions.m11192p(okHttpClientStream.f59215m == -1, "StreamId already assigned");
        this.f59265m.put(Integer.valueOf(this.f59264l), okHttpClientStream);
        m31241t(okHttpClientStream);
        OkHttpClientStream.TransportState transportState = okHttpClientStream.f59216n;
        int i2 = this.f59264l;
        Preconditions.m11193q(transportState.f59232L.f59215m == -1, "the stream has been started with id %s", i2);
        transportState.f59232L.f59215m = i2;
        OkHttpClientStream.TransportState transportState2 = transportState.f59232L.f59216n;
        Preconditions.m11191o(transportState2.f58403j != null);
        synchronized (transportState2.f58418b) {
            Preconditions.m11192p(!transportState2.f58422f, "Already allocated");
            transportState2.f58422f = true;
        }
        transportState2.m31028h();
        TransportTracer transportTracer = transportState2.f58419c;
        transportTracer.f59169b++;
        transportTracer.f59168a.mo31206a();
        if (transportState.f59230J) {
            ExceptionHandlingFrameWriter exceptionHandlingFrameWriter = transportState.f59227G;
            OkHttpClientStream okHttpClientStream2 = transportState.f59232L;
            exceptionHandlingFrameWriter.mo31216b1(okHttpClientStream2.f59219q, false, okHttpClientStream2.f59215m, 0, transportState.f59235z);
            transportState.f59232L.f59212j.m31199b();
            transportState.f59235z = null;
            if (transportState.f59221A.f68742c > 0) {
                transportState.f59228H.m31263a(transportState.f59222B, transportState.f59232L.f59215m, transportState.f59221A, transportState.f59223C);
            }
            transportState.f59230J = false;
        }
        MethodDescriptor.MethodType methodType = okHttpClientStream.f59210h.f58221a;
        if ((methodType != MethodDescriptor.MethodType.UNARY && methodType != MethodDescriptor.MethodType.SERVER_STREAMING) || okHttpClientStream.f59219q) {
            this.f59260h.flush();
        }
        int i3 = this.f59264l;
        if (i3 < 2147483645) {
            this.f59264l = i3 + 2;
        } else {
            this.f59264l = Integer.MAX_VALUE;
            m31242u(Integer.MAX_VALUE, ErrorCode.NO_ERROR, Status.f58287n.m30947g("Stream ids exhausted"));
        }
    }

    @GuardedBy
    /* renamed from: x */
    public final void m31245x() {
        if (this.f59271s == null || !this.f59265m.isEmpty() || !this.f59240B.isEmpty() || this.f59274v) {
            return;
        }
        this.f59274v = true;
        KeepAliveManager keepAliveManager = this.f59243E;
        if (keepAliveManager != null) {
            keepAliveManager.m31134d();
            SharedResourceHolder.m31196b(GrpcUtil.f58671q, this.f59242D);
            this.f59242D = null;
        }
        Http2Ping http2Ping = this.f59273u;
        if (http2Ping != null) {
            http2Ping.m31113d(m31236n());
            this.f59273u = null;
        }
        if (!this.f59272t) {
            this.f59272t = true;
            this.f59260h.mo31218l1(0, ErrorCode.NO_ERROR, new byte[0]);
        }
        this.f59260h.close();
    }

    @VisibleForTesting
    public class ClientFrameHandler implements FrameReader.Handler, Runnable {

        /* renamed from: b */
        public final OkHttpFrameLogger f59286b;

        /* renamed from: c */
        public FrameReader f59287c;

        /* renamed from: d */
        public boolean f59288d;

        public ClientFrameHandler(OkHttpClientTransport okHttpClientTransport, FrameReader frameReader) {
            OkHttpFrameLogger okHttpFrameLogger = new OkHttpFrameLogger(Level.FINE, OkHttpClientTransport.class);
            OkHttpClientTransport.this = okHttpClientTransport;
            this.f59288d = true;
            this.f59287c = frameReader;
            this.f59286b = okHttpFrameLogger;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /* renamed from: d */
        public void mo31246d(int i2, ErrorCode errorCode) {
            this.f59286b.m31255e(OkHttpFrameLogger.Direction.INBOUND, i2, errorCode);
            Status m30944a = OkHttpClientTransport.m31230y(errorCode).m30944a("Rst Stream");
            Status.Code code = m30944a.f58291a;
            boolean z = code == Status.Code.CANCELLED || code == Status.Code.DEADLINE_EXCEEDED;
            synchronized (OkHttpClientTransport.this.f59262j) {
                OkHttpClientStream okHttpClientStream = OkHttpClientTransport.this.f59265m.get(Integer.valueOf(i2));
                if (okHttpClientStream != null) {
                    Tag tag = okHttpClientStream.f59216n.f59231K;
                    Objects.requireNonNull(PerfMark.f59566a);
                    OkHttpClientTransport.this.m31232j(i2, m30944a, errorCode == ErrorCode.REFUSED_STREAM ? ClientStreamListener.RpcProgress.REFUSED : ClientStreamListener.RpcProgress.PROCESSED, z, null, null);
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public void data(boolean z, int i2, BufferedSource bufferedSource, int i3) throws IOException {
            this.f59286b.m31252b(OkHttpFrameLogger.Direction.INBOUND, i2, bufferedSource.getF68789b(), i3, z);
            OkHttpClientStream m31237o = OkHttpClientTransport.this.m31237o(i2);
            if (m31237o != null) {
                long j2 = i3;
                bufferedSource.mo34537c1(j2);
                Buffer buffer = new Buffer();
                buffer.write(bufferedSource.getF68789b(), j2);
                Tag tag = m31237o.f59216n.f59231K;
                Objects.requireNonNull(PerfMark.f59566a);
                synchronized (OkHttpClientTransport.this.f59262j) {
                    m31237o.f59216n.m31225r(buffer, z);
                }
            } else {
                if (!OkHttpClientTransport.this.m31238p(i2)) {
                    OkHttpClientTransport.m31228h(OkHttpClientTransport.this, ErrorCode.PROTOCOL_ERROR, C0000a.m7d("Received data for unknown stream: ", i2));
                    return;
                }
                synchronized (OkHttpClientTransport.this.f59262j) {
                    OkHttpClientTransport.this.f59260h.mo31217d(i2, ErrorCode.INVALID_STREAM);
                }
                bufferedSource.skip(i3);
            }
            OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
            int i4 = okHttpClientTransport.f59268p + i3;
            okHttpClientTransport.f59268p = i4;
            if (i4 >= okHttpClientTransport.f59258f * 0.5f) {
                synchronized (okHttpClientTransport.f59262j) {
                    OkHttpClientTransport.this.f59260h.windowUpdate(0, r8.f59268p);
                }
                OkHttpClientTransport.this.f59268p = 0;
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /* renamed from: e */
        public void mo31247e(int i2, ErrorCode errorCode, ByteString byteString) {
            Status status;
            this.f59286b.m31253c(OkHttpFrameLogger.Direction.INBOUND, i2, errorCode, byteString);
            if (errorCode == ErrorCode.ENHANCE_YOUR_CALM) {
                String m34586p = byteString.m34586p();
                OkHttpClientTransport.f59237P.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, m34586p));
                if ("too_many_pings".equals(m34586p)) {
                    OkHttpClientTransport.this.f59248J.run();
                }
            }
            long j2 = errorCode.f59421b;
            GrpcUtil.Http2Error[] http2ErrorArr = GrpcUtil.Http2Error.f58675e;
            GrpcUtil.Http2Error http2Error = (j2 >= ((long) http2ErrorArr.length) || j2 < 0) ? null : http2ErrorArr[(int) j2];
            if (http2Error == null) {
                status = Status.m30942c(GrpcUtil.Http2Error.f58674d.f58678c.f58291a.f58312b).m30947g("Unrecognized HTTP/2 error code: " + j2);
            } else {
                status = http2Error.f58678c;
            }
            Status m30944a = status.m30944a("Received Goaway");
            if (byteString.mo34576d() > 0) {
                m30944a = m30944a.m30944a(byteString.m34586p());
            }
            OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
            Map<ErrorCode, Status> map = OkHttpClientTransport.f59236O;
            okHttpClientTransport.m31242u(i2, null, m30944a);
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /* renamed from: f */
        public void mo31248f(boolean z, Settings settings) {
            boolean z2;
            this.f59286b.m31256f(OkHttpFrameLogger.Direction.INBOUND, settings);
            synchronized (OkHttpClientTransport.this.f59262j) {
                if (settings.m31320a(4)) {
                    OkHttpClientTransport.this.f59239A = settings.f59481d[4];
                }
                if (settings.m31320a(7)) {
                    z2 = OkHttpClientTransport.this.f59261i.m31265c(settings.f59481d[7]);
                } else {
                    z2 = false;
                }
                if (this.f59288d) {
                    OkHttpClientTransport.this.f59259g.mo31129c();
                    this.f59288d = false;
                }
                OkHttpClientTransport.this.f59260h.mo31219v0(settings);
                if (z2) {
                    OkHttpClientTransport.this.f59261i.m31268f();
                }
                OkHttpClientTransport.this.m31243v();
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        /* renamed from: g */
        public void mo31249g(boolean z, boolean z2, int i2, int i3, List<Header> list, HeadersMode headersMode) {
            OkHttpFrameLogger okHttpFrameLogger = this.f59286b;
            OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.INBOUND;
            if (okHttpFrameLogger.m31251a()) {
                okHttpFrameLogger.f59290a.log(okHttpFrameLogger.f59291b, direction + " HEADERS: streamId=" + i2 + " headers=" + list + " endStream=" + z2);
            }
            Status status = null;
            boolean z3 = true;
            if (OkHttpClientTransport.this.f59249K != Integer.MAX_VALUE) {
                long j2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    Header header = list.get(i4);
                    j2 += header.f59428b.mo34576d() + header.f59427a.mo34576d() + 32;
                }
                int min = (int) Math.min(j2, ParserMinimalBase.MAX_INT_L);
                int i5 = OkHttpClientTransport.this.f59249K;
                if (min > i5) {
                    Status status2 = Status.f58284k;
                    Object[] objArr = new Object[3];
                    objArr[0] = z2 ? "trailer" : "header";
                    objArr[1] = Integer.valueOf(i5);
                    objArr[2] = Integer.valueOf(min);
                    status = status2.m30947g(String.format("Response %s metadata larger than %d: %d", objArr));
                }
            }
            synchronized (OkHttpClientTransport.this.f59262j) {
                OkHttpClientStream okHttpClientStream = OkHttpClientTransport.this.f59265m.get(Integer.valueOf(i2));
                if (okHttpClientStream == null) {
                    if (OkHttpClientTransport.this.m31238p(i2)) {
                        OkHttpClientTransport.this.f59260h.mo31217d(i2, ErrorCode.INVALID_STREAM);
                    }
                } else if (status == null) {
                    Tag tag = okHttpClientStream.f59216n.f59231K;
                    Objects.requireNonNull(PerfMark.f59566a);
                    okHttpClientStream.f59216n.m31226s(list, z2);
                } else {
                    if (!z2) {
                        OkHttpClientTransport.this.f59260h.mo31217d(i2, ErrorCode.CANCEL);
                    }
                    okHttpClientStream.f59216n.m31017k(status, ClientStreamListener.RpcProgress.PROCESSED, false, new Metadata());
                }
                z3 = false;
            }
            if (z3) {
                OkHttpClientTransport.m31228h(OkHttpClientTransport.this, ErrorCode.PROTOCOL_ERROR, C0000a.m7d("Received header for unknown stream: ", i2));
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public void ping(boolean z, int i2, int i3) {
            Http2Ping http2Ping;
            long j2 = (i2 << 32) | (i3 & 4294967295L);
            this.f59286b.m31254d(OkHttpFrameLogger.Direction.INBOUND, j2);
            if (!z) {
                synchronized (OkHttpClientTransport.this.f59262j) {
                    OkHttpClientTransport.this.f59260h.ping(true, i2, i3);
                }
                return;
            }
            synchronized (OkHttpClientTransport.this.f59262j) {
                OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                http2Ping = okHttpClientTransport.f59273u;
                if (http2Ping != null) {
                    long j3 = http2Ping.f58717a;
                    if (j3 == j2) {
                        okHttpClientTransport.f59273u = null;
                    } else {
                        OkHttpClientTransport.f59237P.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j3), Long.valueOf(j2)));
                    }
                } else {
                    OkHttpClientTransport.f59237P.warning("Received unexpected ping ack. No ping outstanding");
                }
                http2Ping = null;
            }
            if (http2Ping != null) {
                http2Ping.m31112b();
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public void priority(int i2, int i3, int i4, boolean z) {
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public void pushPromise(int i2, int i3, List<Header> list) throws IOException {
            OkHttpFrameLogger okHttpFrameLogger = this.f59286b;
            OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.INBOUND;
            if (okHttpFrameLogger.m31251a()) {
                okHttpFrameLogger.f59290a.log(okHttpFrameLogger.f59291b, direction + " PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + list);
            }
            synchronized (OkHttpClientTransport.this.f59262j) {
                OkHttpClientTransport.this.f59260h.mo31217d(i2, ErrorCode.PROTOCOL_ERROR);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Status status;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f59287c.mo31297W(this)) {
                try {
                    KeepAliveManager keepAliveManager = OkHttpClientTransport.this.f59243E;
                    if (keepAliveManager != null) {
                        keepAliveManager.m31131a();
                    }
                } catch (Throwable th) {
                    try {
                        OkHttpClientTransport okHttpClientTransport = OkHttpClientTransport.this;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Status m30946f = Status.f58286m.m30947g("error in frame handler").m30946f(th);
                        Map<ErrorCode, Status> map = OkHttpClientTransport.f59236O;
                        okHttpClientTransport.m31242u(0, errorCode, m30946f);
                        try {
                            this.f59287c.close();
                        } catch (IOException e2) {
                            e = e2;
                            OkHttpClientTransport.f59237P.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            OkHttpClientTransport.this.f59259g.mo31127a();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f59287c.close();
                        } catch (IOException e3) {
                            OkHttpClientTransport.f59237P.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                        }
                        OkHttpClientTransport.this.f59259g.mo31127a();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (OkHttpClientTransport.this.f59262j) {
                status = OkHttpClientTransport.this.f59271s;
            }
            if (status == null) {
                status = Status.f58287n.m30947g("End of stream or IOException");
            }
            OkHttpClientTransport.this.m31242u(0, ErrorCode.INTERNAL_ERROR, status);
            try {
                this.f59287c.close();
            } catch (IOException e4) {
                e = e4;
                OkHttpClientTransport.f59237P.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                OkHttpClientTransport.this.f59259g.mo31127a();
                Thread.currentThread().setName(name);
            }
            OkHttpClientTransport.this.f59259g.mo31127a();
            Thread.currentThread().setName(name);
        }

        @Override // io.grpc.okhttp.internal.framed.FrameReader.Handler
        public void windowUpdate(int i2, long j2) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            this.f59286b.m31257g(OkHttpFrameLogger.Direction.INBOUND, i2, j2);
            if (j2 == 0) {
                if (i2 == 0) {
                    OkHttpClientTransport.m31228h(OkHttpClientTransport.this, errorCode, "Received 0 flow control window increment.");
                    return;
                } else {
                    OkHttpClientTransport.this.m31232j(i2, Status.f58286m.m30947g("Received 0 flow control window increment."), ClientStreamListener.RpcProgress.PROCESSED, false, errorCode, null);
                    return;
                }
            }
            boolean z = false;
            synchronized (OkHttpClientTransport.this.f59262j) {
                if (i2 == 0) {
                    OkHttpClientTransport.this.f59261i.m31267e(null, (int) j2);
                    return;
                }
                OkHttpClientStream okHttpClientStream = OkHttpClientTransport.this.f59265m.get(Integer.valueOf(i2));
                if (okHttpClientStream != null) {
                    OkHttpClientTransport.this.f59261i.m31267e(okHttpClientStream, (int) j2);
                } else if (!OkHttpClientTransport.this.m31238p(i2)) {
                    z = true;
                }
                if (z) {
                    OkHttpClientTransport.m31228h(OkHttpClientTransport.this, errorCode, C0000a.m7d("Received window_update for unknown stream: ", i2));
                }
            }
        }

        @VisibleForTesting
        public ClientFrameHandler(FrameReader frameReader, OkHttpFrameLogger okHttpFrameLogger) {
            this.f59288d = true;
            this.f59287c = null;
            this.f59286b = null;
        }
    }
}
