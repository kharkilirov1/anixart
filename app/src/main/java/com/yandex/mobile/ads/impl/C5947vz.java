package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b00;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.vz */
/* loaded from: classes3.dex */
public final class C5947vz implements Closeable {

    /* renamed from: C */
    @NotNull
    private static final t01 f55901C;

    /* renamed from: D */
    public static final /* synthetic */ int f55902D = 0;

    /* renamed from: A */
    @NotNull
    private final d f55903A;

    /* renamed from: B */
    @NotNull
    private final LinkedHashSet f55904B;

    /* renamed from: a */
    private final boolean f55905a;

    /* renamed from: b */
    @NotNull
    private final c f55906b;

    /* renamed from: c */
    @NotNull
    private final LinkedHashMap f55907c;

    /* renamed from: d */
    @NotNull
    private final String f55908d;

    /* renamed from: e */
    private int f55909e;

    /* renamed from: f */
    private int f55910f;

    /* renamed from: g */
    private boolean f55911g;

    /* renamed from: h */
    @NotNull
    private final r51 f55912h;

    /* renamed from: i */
    @NotNull
    private final q51 f55913i;

    /* renamed from: j */
    @NotNull
    private final q51 f55914j;

    /* renamed from: k */
    @NotNull
    private final q51 f55915k;

    /* renamed from: l */
    @NotNull
    private final qt0 f55916l;

    /* renamed from: m */
    private long f55917m;

    /* renamed from: n */
    private long f55918n;

    /* renamed from: o */
    private long f55919o;

    /* renamed from: p */
    private long f55920p;

    /* renamed from: q */
    private long f55921q;

    /* renamed from: r */
    private long f55922r;

    /* renamed from: s */
    @NotNull
    private final t01 f55923s;

    /* renamed from: t */
    @NotNull
    private t01 f55924t;

    /* renamed from: u */
    private long f55925u;

    /* renamed from: v */
    private long f55926v;

    /* renamed from: w */
    private long f55927w;

    /* renamed from: x */
    private long f55928x;

    /* renamed from: y */
    @NotNull
    private final Socket f55929y;

    /* renamed from: z */
    @NotNull
    private final d00 f55930z;

    /* renamed from: com.yandex.mobile.ads.impl.vz$b */
    public static final class b {
        @NotNull
        /* renamed from: a */
        public static t01 m29347a() {
            return C5947vz.f55901C;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$c */
    public static abstract class c {

        /* renamed from: a */
        @JvmField
        @NotNull
        public static final a f55940a = new a();

        /* renamed from: com.yandex.mobile.ads.impl.vz$c$a */
        public static final class a extends c {
            @Override // com.yandex.mobile.ads.impl.C5947vz.c
            /* renamed from: a */
            public final void mo26266a(@NotNull c00 stream) throws IOException {
                Intrinsics.m32179h(stream, "stream");
                stream.m22963a(EnumC5708rr.f54405f, (IOException) null);
            }
        }

        /* renamed from: a */
        public abstract void mo26266a(@NotNull c00 c00Var) throws IOException;

        /* renamed from: a */
        public void mo26268a(@NotNull C5947vz connection, @NotNull t01 settings) {
            Intrinsics.m32179h(connection, "connection");
            Intrinsics.m32179h(settings, "settings");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$e */
    public static final class e extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55945e;

        /* renamed from: f */
        public final /* synthetic */ int f55946f;

        /* renamed from: g */
        public final /* synthetic */ List f55947g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C5947vz c5947vz, int i2, List list, boolean z) {
            super(str, true);
            this.f55945e = c5947vz;
            this.f55946f = i2;
            this.f55947g = list;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            ((pt0) this.f55945e.f55916l).m27376a(this.f55947g);
            try {
                this.f55945e.m29332k().m23739a(this.f55946f, EnumC5708rr.f54406g);
                synchronized (this.f55945e) {
                    this.f55945e.f55904B.remove(Integer.valueOf(this.f55946f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$f */
    public static final class f extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55948e;

        /* renamed from: f */
        public final /* synthetic */ int f55949f;

        /* renamed from: g */
        public final /* synthetic */ List f55950g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C5947vz c5947vz, int i2, List list) {
            super(str, true);
            this.f55948e = c5947vz;
            this.f55949f = i2;
            this.f55950g = list;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            ((pt0) this.f55948e.f55916l).m27377b(this.f55950g);
            try {
                this.f55948e.m29332k().m23739a(this.f55949f, EnumC5708rr.f54406g);
                synchronized (this.f55948e) {
                    this.f55948e.f55904B.remove(Integer.valueOf(this.f55949f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$g */
    public static final class g extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55951e;

        /* renamed from: f */
        public final /* synthetic */ int f55952f;

        /* renamed from: g */
        public final /* synthetic */ EnumC5708rr f55953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, C5947vz c5947vz, int i2, EnumC5708rr enumC5708rr) {
            super(str, true);
            this.f55951e = c5947vz;
            this.f55952f = i2;
            this.f55953g = enumC5708rr;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            ((pt0) this.f55951e.f55916l).m27375a(this.f55953g);
            synchronized (this.f55951e) {
                this.f55951e.f55904B.remove(Integer.valueOf(this.f55952f));
            }
            return -1L;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$h */
    public static final class h extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55954e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C5947vz c5947vz) {
            super(str, true);
            this.f55954e = c5947vz;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            this.f55954e.m29309a(2, 0, false);
            return -1L;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$i */
    public static final class i extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55955e;

        /* renamed from: f */
        public final /* synthetic */ long f55956f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, C5947vz c5947vz, long j2) {
            super(str);
            this.f55955e = c5947vz;
            this.f55956f = j2;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            boolean z;
            synchronized (this.f55955e) {
                if (this.f55955e.f55918n < this.f55955e.f55917m) {
                    z = true;
                } else {
                    this.f55955e.f55917m++;
                    z = false;
                }
            }
            if (!z) {
                this.f55955e.m29309a(1, 0, false);
                return this.f55956f;
            }
            C5947vz c5947vz = this.f55955e;
            EnumC5708rr enumC5708rr = EnumC5708rr.f54402c;
            c5947vz.m29315a(enumC5708rr, enumC5708rr, (IOException) null);
            return -1L;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$j */
    public static final class j extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55957e;

        /* renamed from: f */
        public final /* synthetic */ int f55958f;

        /* renamed from: g */
        public final /* synthetic */ EnumC5708rr f55959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C5947vz c5947vz, int i2, EnumC5708rr enumC5708rr) {
            super(str, true);
            this.f55957e = c5947vz;
            this.f55958f = i2;
            this.f55959g = enumC5708rr;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            try {
                this.f55957e.m29318b(this.f55958f, this.f55959g);
                return -1L;
            } catch (IOException e2) {
                C5947vz c5947vz = this.f55957e;
                EnumC5708rr enumC5708rr = EnumC5708rr.f54402c;
                c5947vz.m29315a(enumC5708rr, enumC5708rr, e2);
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$k */
    public static final class k extends n51 {

        /* renamed from: e */
        public final /* synthetic */ C5947vz f55960e;

        /* renamed from: f */
        public final /* synthetic */ int f55961f;

        /* renamed from: g */
        public final /* synthetic */ long f55962g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, C5947vz c5947vz, int i2, long j2) {
            super(str, true);
            this.f55960e = c5947vz;
            this.f55961f = i2;
            this.f55962g = j2;
        }

        @Override // com.yandex.mobile.ads.impl.n51
        /* renamed from: e */
        public final long mo26804e() {
            try {
                this.f55960e.m29332k().m23738a(this.f55961f, this.f55962g);
                return -1L;
            } catch (IOException e2) {
                C5947vz c5947vz = this.f55960e;
                EnumC5708rr enumC5708rr = EnumC5708rr.f54402c;
                c5947vz.m29315a(enumC5708rr, enumC5708rr, e2);
                return -1L;
            }
        }
    }

    static {
        t01 t01Var = new t01();
        t01Var.m28430a(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        t01Var.m28430a(5, 16384);
        f55901C = t01Var;
    }

    public C5947vz(@NotNull a builder) {
        Intrinsics.m32179h(builder, "builder");
        boolean m29337b = builder.m29337b();
        this.f55905a = m29337b;
        this.f55906b = builder.m29339d();
        this.f55907c = new LinkedHashMap();
        String m29338c = builder.m29338c();
        this.f55908d = m29338c;
        this.f55910f = builder.m29337b() ? 3 : 2;
        r51 m29345j = builder.m29345j();
        this.f55912h = m29345j;
        q51 m27850e = m29345j.m27850e();
        this.f55913i = m27850e;
        this.f55914j = m29345j.m27850e();
        this.f55915k = m29345j.m27850e();
        this.f55916l = builder.m29341f();
        t01 t01Var = new t01();
        if (builder.m29337b()) {
            t01Var.m28430a(7, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.f55923s = t01Var;
        this.f55924t = f55901C;
        this.f55928x = r2.m28432b();
        this.f55929y = builder.m29343h();
        this.f55930z = new d00(builder.m29342g(), m29337b);
        this.f55903A = new d(this, new b00(builder.m29344i(), m29337b));
        this.f55904B = new LinkedHashSet();
        if (builder.m29340e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m29340e());
            m27850e.m27634a(new i(um1.m29049a(m29338c, " ping"), this, nanos), nanos);
        }
    }

    /* renamed from: b */
    public static boolean m29292b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* renamed from: l */
    public static void m29305l(C5947vz c5947vz) throws IOException {
        r51 taskRunner = r51.f54199h;
        Intrinsics.m32179h(taskRunner, "taskRunner");
        c5947vz.f55930z.m23735a();
        c5947vz.f55930z.m23745b(c5947vz.f55923s);
        if (c5947vz.f55923s.m28432b() != 65535) {
            c5947vz.f55930z.m23738a(0, r1 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        taskRunner.m27850e().m27634a(new p51(c5947vz.f55908d, c5947vz.f55903A), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m29315a(EnumC5708rr.f54401b, EnumC5708rr.f54406g, (IOException) null);
    }

    public final void flush() throws IOException {
        this.f55930z.flush();
    }

    /* renamed from: f */
    public final int m29327f() {
        return this.f55910f;
    }

    @NotNull
    /* renamed from: g */
    public final t01 m29328g() {
        return this.f55923s;
    }

    @NotNull
    /* renamed from: h */
    public final t01 m29329h() {
        return this.f55924t;
    }

    @NotNull
    /* renamed from: i */
    public final LinkedHashMap m29330i() {
        return this.f55907c;
    }

    /* renamed from: j */
    public final long m29331j() {
        return this.f55928x;
    }

    @NotNull
    /* renamed from: k */
    public final d00 m29332k() {
        return this.f55930z;
    }

    /* renamed from: b */
    public final boolean m29320b() {
        return this.f55905a;
    }

    @NotNull
    /* renamed from: c */
    public final String m29322c() {
        return this.f55908d;
    }

    /* renamed from: d */
    public final int m29324d() {
        return this.f55909e;
    }

    @NotNull
    /* renamed from: e */
    public final c m29326e() {
        return this.f55906b;
    }

    /* renamed from: a */
    public final void m29316a(@NotNull t01 t01Var) {
        Intrinsics.m32179h(t01Var, "<set-?>");
        this.f55924t = t01Var;
    }

    /* renamed from: b */
    public final synchronized void m29319b(long j2) {
        long j3 = this.f55925u + j2;
        this.f55925u = j3;
        long j4 = j3 - this.f55926v;
        if (j4 >= this.f55923s.m28432b() / 2) {
            m29310a(0, j4);
            this.f55926v += j4;
        }
    }

    @Nullable
    /* renamed from: c */
    public final synchronized c00 m29321c(int i2) {
        c00 c00Var;
        c00Var = (c00) this.f55907c.remove(Integer.valueOf(i2));
        notifyAll();
        return c00Var;
    }

    /* renamed from: d */
    public final void m29325d(int i2) {
        this.f55909e = i2;
    }

    @Nullable
    /* renamed from: a */
    public final synchronized c00 m29306a(int i2) {
        return (c00) this.f55907c.get(Integer.valueOf(i2));
    }

    @NotNull
    /* renamed from: a */
    public final c00 m29307a(@NotNull ArrayList requestHeaders, boolean z) throws IOException {
        boolean z2;
        int i2;
        c00 c00Var;
        Intrinsics.m32179h(requestHeaders, "requestHeaders");
        boolean z3 = !z;
        synchronized (this.f55930z) {
            synchronized (this) {
                z2 = true;
                if (this.f55910f > 1073741823) {
                    EnumC5708rr statusCode = EnumC5708rr.f54405f;
                    Intrinsics.m32179h(statusCode, "statusCode");
                    synchronized (this.f55930z) {
                        Ref.IntRef intRef = new Ref.IntRef();
                        synchronized (this) {
                            if (!this.f55911g) {
                                this.f55911g = true;
                                int i3 = this.f55909e;
                                intRef.f63349b = i3;
                                this.f55930z.m23740a(i3, statusCode, t91.f54979a);
                            }
                        }
                    }
                }
                if (!this.f55911g) {
                    i2 = this.f55910f;
                    this.f55910f = i2 + 2;
                    c00Var = new c00(i2, this, z3, false, null);
                    if (z && this.f55927w < this.f55928x && c00Var.m22981n() < c00Var.m22980m()) {
                        z2 = false;
                    }
                    if (c00Var.m22984q()) {
                        this.f55907c.put(Integer.valueOf(i2), c00Var);
                    }
                } else {
                    throw new C5131gk();
                }
            }
            this.f55930z.m23741a(i2, requestHeaders, z3);
        }
        if (z2) {
            this.f55930z.flush();
        }
        return c00Var;
    }

    /* renamed from: c */
    public final void m29323c(int i2, @NotNull EnumC5708rr errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        this.f55913i.m27634a(new j(this.f55908d + '[' + i2 + "] writeSynReset", this, i2, errorCode), 0L);
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$a */
    public static final class a {

        /* renamed from: a */
        private boolean f55931a;

        /* renamed from: b */
        @NotNull
        private final r51 f55932b;

        /* renamed from: c */
        public Socket f55933c;

        /* renamed from: d */
        public String f55934d;

        /* renamed from: e */
        public BufferedSource f55935e;

        /* renamed from: f */
        public BufferedSink f55936f;

        /* renamed from: g */
        @NotNull
        private c f55937g;

        /* renamed from: h */
        @NotNull
        private qt0 f55938h;

        /* renamed from: i */
        private int f55939i;

        public a(@NotNull r51 taskRunner) {
            Intrinsics.m32179h(taskRunner, "taskRunner");
            this.f55931a = true;
            this.f55932b = taskRunner;
            this.f55937g = c.f55940a;
            this.f55938h = qt0.f54131a;
        }

        @JvmOverloads
        @NotNull
        /* renamed from: a */
        public final a m29335a(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source, @NotNull BufferedSink sink) throws IOException {
            String m29049a;
            Intrinsics.m32179h(socket, "socket");
            Intrinsics.m32179h(peerName, "peerName");
            Intrinsics.m32179h(source, "source");
            Intrinsics.m32179h(sink, "sink");
            this.f55933c = socket;
            if (this.f55931a) {
                m29049a = t91.f54985g + ' ' + peerName;
            } else {
                m29049a = um1.m29049a("MockWebServer ", peerName);
            }
            Intrinsics.m32179h(m29049a, "<set-?>");
            this.f55934d = m29049a;
            this.f55935e = source;
            this.f55936f = sink;
            return this;
        }

        /* renamed from: b */
        public final boolean m29337b() {
            return this.f55931a;
        }

        @NotNull
        /* renamed from: c */
        public final String m29338c() {
            String str = this.f55934d;
            if (str != null) {
                return str;
            }
            Intrinsics.m32189r("connectionName");
            throw null;
        }

        @NotNull
        /* renamed from: d */
        public final c m29339d() {
            return this.f55937g;
        }

        /* renamed from: e */
        public final int m29340e() {
            return this.f55939i;
        }

        @NotNull
        /* renamed from: f */
        public final qt0 m29341f() {
            return this.f55938h;
        }

        @NotNull
        /* renamed from: g */
        public final BufferedSink m29342g() {
            BufferedSink bufferedSink = this.f55936f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.m32189r("sink");
            throw null;
        }

        @NotNull
        /* renamed from: h */
        public final Socket m29343h() {
            Socket socket = this.f55933c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.m32189r("socket");
            throw null;
        }

        @NotNull
        /* renamed from: i */
        public final BufferedSource m29344i() {
            BufferedSource bufferedSource = this.f55935e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.m32189r("source");
            throw null;
        }

        @NotNull
        /* renamed from: j */
        public final r51 m29345j() {
            return this.f55932b;
        }

        @NotNull
        /* renamed from: k */
        public final a m29346k() {
            this.f55939i = 0;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final a m29334a(@NotNull c listener) {
            Intrinsics.m32179h(listener, "listener");
            this.f55937g = listener;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5947vz m29336a() {
            return new C5947vz(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vz$d */
    public final class d implements b00.InterfaceC4835c, Function0<Unit> {

        /* renamed from: a */
        @NotNull
        private final b00 f55941a;

        /* renamed from: b */
        public final /* synthetic */ C5947vz f55942b;

        /* renamed from: com.yandex.mobile.ads.impl.vz$d$a */
        public static final class a extends n51 {

            /* renamed from: e */
            public final /* synthetic */ C5947vz f55943e;

            /* renamed from: f */
            public final /* synthetic */ Ref.ObjectRef f55944f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, C5947vz c5947vz, Ref.ObjectRef objectRef) {
                super(str, true);
                this.f55943e = c5947vz;
                this.f55944f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.mobile.ads.impl.n51
            /* renamed from: e */
            public final long mo26804e() {
                this.f55943e.m29326e().mo26268a(this.f55943e, (t01) this.f55944f.f63351b);
                return -1L;
            }
        }

        public d(C5947vz c5947vz, @NotNull b00 reader) {
            Intrinsics.m32179h(reader, "reader");
            this.f55942b = c5947vz;
            this.f55941a = reader;
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22678a() {
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22679a(int i2, int i3, @NotNull BufferedSource source, boolean z) throws IOException {
            Intrinsics.m32179h(source, "source");
            Objects.requireNonNull(this.f55942b);
            if (C5947vz.m29292b(i2)) {
                this.f55942b.m29308a(i2, i3, source, z);
                return;
            }
            c00 m29306a = this.f55942b.m29306a(i2);
            if (m29306a == null) {
                this.f55942b.m29323c(i2, EnumC5708rr.f54402c);
                long j2 = i3;
                this.f55942b.m29319b(j2);
                source.skip(j2);
                return;
            }
            m29306a.m22964a(source, i3);
            if (z) {
                m29306a.m22961a(t91.f54980b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: b */
        public final void mo22687b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.rr] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EnumC5708rr enumC5708rr;
            EnumC5708rr enumC5708rr2;
            EnumC5708rr enumC5708rr3;
            ?? r0 = EnumC5708rr.f54403d;
            IOException e2 = null;
            try {
                try {
                    this.f55941a.m22668a(this);
                    while (this.f55941a.m22669a(false, this)) {
                    }
                    EnumC5708rr enumC5708rr4 = EnumC5708rr.f54401b;
                    try {
                        this.f55942b.m29315a(enumC5708rr4, EnumC5708rr.f54406g, (IOException) null);
                        t91.m28509a(this.f55941a);
                        enumC5708rr3 = enumC5708rr4;
                    } catch (IOException e3) {
                        e2 = e3;
                        EnumC5708rr enumC5708rr5 = EnumC5708rr.f54402c;
                        C5947vz c5947vz = this.f55942b;
                        c5947vz.m29315a(enumC5708rr5, enumC5708rr5, e2);
                        t91.m28509a(this.f55941a);
                        enumC5708rr3 = c5947vz;
                        r0 = Unit.f63088a;
                        return r0;
                    }
                } catch (Throwable th) {
                    enumC5708rr = enumC5708rr3;
                    th = th;
                    enumC5708rr2 = r0;
                    this.f55942b.m29315a(enumC5708rr, enumC5708rr2, e2);
                    t91.m28509a(this.f55941a);
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
            } catch (Throwable th2) {
                th = th2;
                enumC5708rr = r0;
                enumC5708rr2 = r0;
                this.f55942b.m29315a(enumC5708rr, enumC5708rr2, e2);
                t91.m28509a(this.f55941a);
                throw th;
            }
            r0 = Unit.f63088a;
            return r0;
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22686a(boolean z, int i2, @NotNull List headerBlock) {
            Intrinsics.m32179h(headerBlock, "headerBlock");
            Objects.requireNonNull(this.f55942b);
            if (C5947vz.m29292b(i2)) {
                this.f55942b.m29313a(i2, (List<C5096fy>) headerBlock, z);
                return;
            }
            C5947vz c5947vz = this.f55942b;
            synchronized (c5947vz) {
                c00 m29306a = c5947vz.m29306a(i2);
                if (m29306a == null) {
                    if (c5947vz.f55911g) {
                        return;
                    }
                    if (i2 <= c5947vz.m29324d()) {
                        return;
                    }
                    if (i2 % 2 == c5947vz.m29327f() % 2) {
                        return;
                    }
                    c00 c00Var = new c00(i2, c5947vz, false, z, t91.m28497a((List<C5096fy>) headerBlock));
                    c5947vz.m29325d(i2);
                    c5947vz.m29330i().put(Integer.valueOf(i2), c00Var);
                    c5947vz.f55912h.m27850e().m27634a(new C5997wz(c5947vz.m29322c() + '[' + i2 + "] onStream", c5947vz, c00Var), 0L);
                    return;
                }
                m29306a.m22961a(t91.m28497a((List<C5096fy>) headerBlock), z);
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22683a(int i2, @NotNull EnumC5708rr errorCode, @NotNull ByteString debugData) {
            int i3;
            Object[] array;
            Intrinsics.m32179h(errorCode, "errorCode");
            Intrinsics.m32179h(debugData, "debugData");
            debugData.mo34576d();
            C5947vz c5947vz = this.f55942b;
            synchronized (c5947vz) {
                array = c5947vz.m29330i().values().toArray(new c00[0]);
                Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                c5947vz.f55911g = true;
            }
            for (c00 c00Var : (c00[]) array) {
                if (c00Var.m22973f() > i2 && c00Var.m22983p()) {
                    c00Var.m22967b(EnumC5708rr.f54405f);
                    this.f55942b.m29321c(c00Var.m22973f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22682a(int i2, @NotNull EnumC5708rr errorCode) {
            Intrinsics.m32179h(errorCode, "errorCode");
            Objects.requireNonNull(this.f55942b);
            if (C5947vz.m29292b(i2)) {
                this.f55942b.m29311a(i2, errorCode);
                return;
            }
            c00 m29321c = this.f55942b.m29321c(i2);
            if (m29321c != null) {
                m29321c.m22967b(errorCode);
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22685a(@NotNull t01 settings) {
            Intrinsics.m32179h(settings, "settings");
            this.f55942b.f55913i.m27634a(new C6097yz(this.f55942b.m29322c() + " applyAndAckSettings", this, settings), 0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, com.yandex.mobile.ads.impl.t01] */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* renamed from: a */
        public final void m29348a(boolean z, @NotNull t01 settings) {
            ?? r12;
            long m28432b;
            int i2;
            c00[] c00VarArr;
            Intrinsics.m32179h(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            d00 m29332k = this.f55942b.m29332k();
            C5947vz c5947vz = this.f55942b;
            synchronized (m29332k) {
                synchronized (c5947vz) {
                    t01 m29329h = c5947vz.m29329h();
                    if (z) {
                        r12 = settings;
                    } else {
                        t01 t01Var = new t01();
                        t01Var.m28431a(m29329h);
                        t01Var.m28431a(settings);
                        r12 = t01Var;
                    }
                    objectRef.f63351b = r12;
                    m28432b = r12.m28432b() - m29329h.m28432b();
                    if (m28432b != 0 && !c5947vz.m29330i().isEmpty()) {
                        Object[] array = c5947vz.m29330i().values().toArray(new c00[0]);
                        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        c00VarArr = (c00[]) array;
                        c5947vz.m29316a((t01) objectRef.f63351b);
                        c5947vz.f55915k.m27634a(new a(c5947vz.m29322c() + " onSettings", c5947vz, objectRef), 0L);
                    }
                    c00VarArr = null;
                    c5947vz.m29316a((t01) objectRef.f63351b);
                    c5947vz.f55915k.m27634a(new a(c5947vz.m29322c() + " onSettings", c5947vz, objectRef), 0L);
                }
                try {
                    c5947vz.m29332k().m23742a((t01) objectRef.f63351b);
                } catch (IOException e2) {
                    C5947vz.m29289a(c5947vz, e2);
                }
            }
            if (c00VarArr != null) {
                for (c00 c00Var : c00VarArr) {
                    synchronized (c00Var) {
                        c00Var.m22960a(m28432b);
                    }
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22680a(int i2, int i3, boolean z) {
            if (!z) {
                this.f55942b.f55913i.m27634a(new C6047xz(this.f55942b.m29322c() + " ping", this.f55942b, i2, i3), 0L);
                return;
            }
            C5947vz c5947vz = this.f55942b;
            synchronized (c5947vz) {
                if (i2 == 1) {
                    c5947vz.f55918n++;
                } else if (i2 == 2) {
                    c5947vz.f55920p++;
                } else if (i2 == 3) {
                    c5947vz.f55921q++;
                    c5947vz.notifyAll();
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22681a(int i2, long j2) {
            if (i2 == 0) {
                C5947vz c5947vz = this.f55942b;
                synchronized (c5947vz) {
                    c5947vz.f55928x = c5947vz.m29331j() + j2;
                    c5947vz.notifyAll();
                }
                return;
            }
            c00 m29306a = this.f55942b.m29306a(i2);
            if (m29306a != null) {
                synchronized (m29306a) {
                    m29306a.m22960a(j2);
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.b00.InterfaceC4835c
        /* renamed from: a */
        public final void mo22684a(int i2, @NotNull List requestHeaders) {
            Intrinsics.m32179h(requestHeaders, "requestHeaders");
            this.f55942b.m29312a(i2, (List<C5096fy>) requestHeaders);
        }
    }

    /* renamed from: b */
    public final void m29318b(int i2, @NotNull EnumC5708rr statusCode) throws IOException {
        Intrinsics.m32179h(statusCode, "statusCode");
        this.f55930z.m23739a(i2, statusCode);
    }

    /* renamed from: l */
    public final void m29333l() {
        synchronized (this) {
            long j2 = this.f55920p;
            long j3 = this.f55919o;
            if (j2 < j3) {
                return;
            }
            this.f55919o = j3 + 1;
            this.f55922r = System.nanoTime() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            this.f55913i.m27634a(new h(C0000a.m20q(new StringBuilder(), this.f55908d, " ping"), this), 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f55930z.m23744b());
        r6 = r3;
        r8.f55927w += r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29314a(int r9, boolean r10, @org.jetbrains.annotations.Nullable okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            com.yandex.mobile.ads.impl.d00 r12 = r8.f55930z
            r12.m23743a(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r3 = r8.f55927w     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            long r5 = r8.f55928x     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.LinkedHashMap r3 = r8.f55907c     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L59
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L59
            com.yandex.mobile.ads.impl.d00 r3 = r8.f55930z     // Catch: java.lang.Throwable -> L59
            int r3 = r3.m23744b()     // Catch: java.lang.Throwable -> L59
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L59
            long r4 = r8.f55927w     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L59
            long r4 = r4 + r6
            r8.f55927w = r4     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.d00 r4 = r8.f55930z
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.m23743a(r5, r9, r11, r3)
            goto Ld
        L59:
            r9 = move-exception
            goto L68
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            r9.interrupt()     // Catch: java.lang.Throwable -> L59
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            throw r9     // Catch: java.lang.Throwable -> L59
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5947vz.m29314a(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: a */
    public final void m29310a(int i2, long j2) {
        this.f55913i.m27634a(new k(this.f55908d + '[' + i2 + "] windowUpdate", this, i2, j2), 0L);
    }

    /* renamed from: a */
    public final void m29309a(int i2, int i3, boolean z) {
        try {
            this.f55930z.m23737a(i2, i3, z);
        } catch (IOException e2) {
            EnumC5708rr enumC5708rr = EnumC5708rr.f54402c;
            m29315a(enumC5708rr, enumC5708rr, e2);
        }
    }

    /* renamed from: a */
    public static final void m29289a(C5947vz c5947vz, IOException iOException) {
        EnumC5708rr enumC5708rr = EnumC5708rr.f54402c;
        c5947vz.m29315a(enumC5708rr, enumC5708rr, iOException);
    }

    /* renamed from: a */
    public final synchronized boolean m29317a(long j2) {
        if (this.f55911g) {
            return false;
        }
        if (this.f55920p < this.f55919o) {
            if (j2 >= this.f55922r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m29312a(int i2, @NotNull List<C5096fy> requestHeaders) {
        Intrinsics.m32179h(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f55904B.contains(Integer.valueOf(i2))) {
                m29323c(i2, EnumC5708rr.f54402c);
                return;
            }
            this.f55904B.add(Integer.valueOf(i2));
            this.f55914j.m27634a(new f(this.f55908d + '[' + i2 + "] onRequest", this, i2, requestHeaders), 0L);
        }
    }

    /* renamed from: a */
    public final void m29313a(int i2, @NotNull List<C5096fy> requestHeaders, boolean z) {
        Intrinsics.m32179h(requestHeaders, "requestHeaders");
        this.f55914j.m27634a(new e(this.f55908d + '[' + i2 + "] onHeaders", this, i2, requestHeaders, z), 0L);
    }

    /* renamed from: a */
    public final void m29308a(int i2, int i3, @NotNull BufferedSource source, boolean z) throws IOException {
        Intrinsics.m32179h(source, "source");
        Buffer buffer = new Buffer();
        long j2 = i3;
        source.mo34537c1(j2);
        source.read(buffer, j2);
        this.f55914j.m27634a(new C6148zz(this.f55908d + '[' + i2 + "] onData", this, i2, buffer, i3, z), 0L);
    }

    /* renamed from: a */
    public final void m29311a(int i2, @NotNull EnumC5708rr errorCode) {
        Intrinsics.m32179h(errorCode, "errorCode");
        this.f55914j.m27634a(new g(this.f55908d + '[' + i2 + "] onReset", this, i2, errorCode), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29315a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.EnumC5708rr r6, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.EnumC5708rr r7, @org.jetbrains.annotations.Nullable java.io.IOException r8) {
        /*
            r5 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.Intrinsics.m32179h(r7, r0)
            boolean r0 = com.yandex.mobile.ads.impl.t91.f54984f
            if (r0 == 0) goto L38
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "Thread "
            java.lang.StringBuilder r7 = com.yandex.mobile.ads.impl.l60.m26356a(r7)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r7.append(r8)
            java.lang.String r8 = " MUST NOT hold lock on "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L38:
            r0 = 1
            com.yandex.mobile.ads.impl.d00 r1 = r5.f55930z     // Catch: java.io.IOException -> L5f
            monitor-enter(r1)     // Catch: java.io.IOException -> L5f
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef     // Catch: java.lang.Throwable -> L5c
            r2.<init>()     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L5c
            boolean r3 = r5.f55911g     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L49
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r1)     // Catch: java.io.IOException -> L5f
            goto L5f
        L49:
            r5.f55911g = r0     // Catch: java.lang.Throwable -> L59
            int r3 = r5.f55909e     // Catch: java.lang.Throwable -> L59
            r2.f63349b = r3     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            com.yandex.mobile.ads.impl.d00 r2 = r5.f55930z     // Catch: java.lang.Throwable -> L5c
            byte[] r4 = com.yandex.mobile.ads.impl.t91.f54979a     // Catch: java.lang.Throwable -> L5c
            r2.m23740a(r3, r6, r4)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r1)     // Catch: java.io.IOException -> L5f
            goto L5f
        L59:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5c
            throw r6     // Catch: java.lang.Throwable -> L5c
        L5c:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.io.IOException -> L5f
            throw r6     // Catch: java.io.IOException -> L5f
        L5f:
            r6 = 0
            monitor-enter(r5)
            java.util.LinkedHashMap r1 = r5.f55907c     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lab
            r0 = r0 ^ r1
            r1 = 0
            if (r0 == 0) goto L81
            java.util.LinkedHashMap r6 = r5.f55907c     // Catch: java.lang.Throwable -> Lab
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> Lab
            com.yandex.mobile.ads.impl.c00[] r0 = new com.yandex.mobile.ads.impl.c00[r1]     // Catch: java.lang.Throwable -> Lab
            java.lang.Object[] r6 = r6.toArray(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.Intrinsics.m32177f(r6, r0)     // Catch: java.lang.Throwable -> Lab
            java.util.LinkedHashMap r0 = r5.f55907c     // Catch: java.lang.Throwable -> Lab
            r0.clear()     // Catch: java.lang.Throwable -> Lab
        L81:
            monitor-exit(r5)
            com.yandex.mobile.ads.impl.c00[] r6 = (com.yandex.mobile.ads.impl.c00[]) r6
            if (r6 == 0) goto L91
            int r0 = r6.length
        L87:
            if (r1 >= r0) goto L91
            r2 = r6[r1]
            r2.m22963a(r7, r8)     // Catch: java.io.IOException -> L8e
        L8e:
            int r1 = r1 + 1
            goto L87
        L91:
            com.yandex.mobile.ads.impl.d00 r6 = r5.f55930z     // Catch: java.io.IOException -> L96
            r6.close()     // Catch: java.io.IOException -> L96
        L96:
            java.net.Socket r6 = r5.f55929y     // Catch: java.io.IOException -> L9b
            r6.close()     // Catch: java.io.IOException -> L9b
        L9b:
            com.yandex.mobile.ads.impl.q51 r6 = r5.f55913i
            r6.m27644j()
            com.yandex.mobile.ads.impl.q51 r6 = r5.f55914j
            r6.m27644j()
            com.yandex.mobile.ads.impl.q51 r6 = r5.f55915k
            r6.m27644j()
            return
        Lab:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5947vz.m29315a(com.yandex.mobile.ads.impl.rr, com.yandex.mobile.ads.impl.rr, java.io.IOException):void");
    }
}
