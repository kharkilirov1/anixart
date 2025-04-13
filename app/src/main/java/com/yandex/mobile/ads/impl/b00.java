package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C6096yy;
import com.yandex.mobile.ads.impl.EnumC5708rr;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class b00 implements Closeable {

    /* renamed from: e */
    @NotNull
    private static final Logger f48704e;

    /* renamed from: f */
    public static final /* synthetic */ int f48705f = 0;

    /* renamed from: a */
    @NotNull
    private final BufferedSource f48706a;

    /* renamed from: b */
    private final boolean f48707b;

    /* renamed from: c */
    @NotNull
    private final C4834b f48708c;

    /* renamed from: d */
    @NotNull
    private final C6096yy.a f48709d;

    /* renamed from: com.yandex.mobile.ads.impl.b00$a */
    public static final class C4833a {
        @NotNull
        /* renamed from: a */
        public static Logger m22671a() {
            return b00.f48704e;
        }

        /* renamed from: a */
        public static int m22670a(int i2, int i3, int i4) throws IOException {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException(C0000a.m9f("PROTOCOL_ERROR padding ", i4, " > remaining length ", i2));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b00$b */
    public static final class C4834b implements Source {

        /* renamed from: a */
        @NotNull
        private final BufferedSource f48710a;

        /* renamed from: b */
        private int f48711b;

        /* renamed from: c */
        private int f48712c;

        /* renamed from: d */
        private int f48713d;

        /* renamed from: e */
        private int f48714e;

        /* renamed from: f */
        private int f48715f;

        public C4834b(@NotNull BufferedSource source) {
            Intrinsics.m32179h(source, "source");
            this.f48710a = source;
        }

        /* renamed from: a */
        public final void m22673a(int i2) {
            this.f48712c = i2;
        }

        /* renamed from: b */
        public final void m22674b(int i2) {
            this.f48714e = i2;
        }

        /* renamed from: c */
        public final void m22675c(int i2) {
            this.f48711b = i2;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        /* renamed from: d */
        public final void m22676d(int i2) {
            this.f48715f = i2;
        }

        /* renamed from: e */
        public final void m22677e(int i2) {
            this.f48713d = i2;
        }

        @Override // okio.Source
        public final long read(@NotNull Buffer sink, long j2) throws IOException {
            int i2;
            int readInt;
            Intrinsics.m32179h(sink, "sink");
            do {
                int i3 = this.f48714e;
                if (i3 != 0) {
                    long read = this.f48710a.read(sink, Math.min(j2, i3));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f48714e -= (int) read;
                    return read;
                }
                this.f48710a.skip(this.f48715f);
                this.f48715f = 0;
                if ((this.f48712c & 4) != 0) {
                    return -1L;
                }
                i2 = this.f48713d;
                int m28492a = t91.m28492a(this.f48710a);
                this.f48714e = m28492a;
                this.f48711b = m28492a;
                int m28483a = t91.m28483a(this.f48710a.readByte());
                this.f48712c = t91.m28483a(this.f48710a.readByte());
                int i4 = b00.f48705f;
                if (C4833a.m22671a().isLoggable(Level.FINE)) {
                    Logger m22671a = C4833a.m22671a();
                    C5893uz c5893uz = C5893uz.f55704a;
                    int i5 = this.f48713d;
                    int i6 = this.f48711b;
                    int i7 = this.f48712c;
                    Objects.requireNonNull(c5893uz);
                    m22671a.fine(C5893uz.m29149a(true, i5, i6, m28483a, i7));
                }
                readInt = this.f48710a.readInt() & Integer.MAX_VALUE;
                this.f48713d = readInt;
                if (m28483a != 9) {
                    throw new IOException(m28483a + " != TYPE_CONTINUATION");
                }
            } while (readInt == i2);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // okio.Source
        @NotNull
        /* renamed from: timeout */
        public final Timeout getTimeout() {
            return this.f48710a.getTimeout();
        }

        /* renamed from: a */
        public final int m22672a() {
            return this.f48714e;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.b00$c */
    public interface InterfaceC4835c {
        /* renamed from: a */
        void mo22678a();

        /* renamed from: a */
        void mo22679a(int i2, int i3, @NotNull BufferedSource bufferedSource, boolean z) throws IOException;

        /* renamed from: a */
        void mo22680a(int i2, int i3, boolean z);

        /* renamed from: a */
        void mo22681a(int i2, long j2);

        /* renamed from: a */
        void mo22682a(int i2, @NotNull EnumC5708rr enumC5708rr);

        /* renamed from: a */
        void mo22683a(int i2, @NotNull EnumC5708rr enumC5708rr, @NotNull ByteString byteString);

        /* renamed from: a */
        void mo22684a(int i2, @NotNull List list) throws IOException;

        /* renamed from: a */
        void mo22685a(@NotNull t01 t01Var);

        /* renamed from: a */
        void mo22686a(boolean z, int i2, @NotNull List list);

        /* renamed from: b */
        void mo22687b();
    }

    static {
        Logger logger = Logger.getLogger(C5893uz.class.getName());
        Intrinsics.m32178g(logger, "getLogger(Http2::class.java.name)");
        f48704e = logger;
    }

    public b00(@NotNull BufferedSource source, boolean z) {
        Intrinsics.m32179h(source, "source");
        this.f48706a = source;
        this.f48707b = z;
        C4834b c4834b = new C4834b(source);
        this.f48708c = c4834b;
        this.f48709d = new C6096yy.a(c4834b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48706a.close();
    }

    /* renamed from: a */
    public final void m22668a(@NotNull InterfaceC4835c handler) throws IOException {
        Intrinsics.m32179h(handler, "handler");
        if (this.f48707b) {
            if (!m22669a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.f48706a;
        ByteString byteString = C5893uz.f55705b;
        ByteString mo34518G = bufferedSource.mo34518G(byteString.mo34576d());
        Logger logger = f48704e;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder m26356a = l60.m26356a("<< CONNECTION ");
            m26356a.append(mo34518G.mo34577e());
            logger.fine(t91.m28503a(m26356a.toString(), new Object[0]));
        }
        if (Intrinsics.m32174c(byteString, mo34518G)) {
            return;
        }
        StringBuilder m26356a2 = l60.m26356a("Expected a connection header but was ");
        m26356a2.append(mo34518G.m34586p());
        throw new IOException(m26356a2.toString());
    }

    /* renamed from: a */
    public final boolean m22669a(boolean z, @NotNull InterfaceC4835c handler) throws IOException {
        int readInt;
        Intrinsics.m32179h(handler, "handler");
        try {
            this.f48706a.mo34537c1(9L);
            int m28492a = t91.m28492a(this.f48706a);
            if (m28492a <= 16384) {
                int m28483a = t91.m28483a(this.f48706a.readByte());
                int m28483a2 = t91.m28483a(this.f48706a.readByte());
                int readInt2 = this.f48706a.readInt() & Integer.MAX_VALUE;
                Logger logger = f48704e;
                if (logger.isLoggable(Level.FINE)) {
                    Objects.requireNonNull(C5893uz.f55704a);
                    logger.fine(C5893uz.m29149a(true, readInt2, m28492a, m28483a, m28483a2));
                }
                if (z && m28483a != 4) {
                    StringBuilder m26356a = l60.m26356a("Expected a SETTINGS frame but was ");
                    Objects.requireNonNull(C5893uz.f55704a);
                    m26356a.append(C5893uz.m29148a(m28483a));
                    throw new IOException(m26356a.toString());
                }
                switch (m28483a) {
                    case 0:
                        if (readInt2 == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                        boolean z2 = (m28483a2 & 1) != 0;
                        if (!((m28483a2 & 32) != 0)) {
                            int m28483a3 = (m28483a2 & 8) != 0 ? t91.m28483a(this.f48706a.readByte()) : 0;
                            handler.mo22679a(readInt2, C4833a.m22670a(m28492a, m28483a2, m28483a3), this.f48706a, z2);
                            this.f48706a.skip(m28483a3);
                            return true;
                        }
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    case 1:
                        if (readInt2 != 0) {
                            boolean z3 = (m28483a2 & 1) != 0;
                            int m28483a4 = (m28483a2 & 8) != 0 ? t91.m28483a(this.f48706a.readByte()) : 0;
                            if ((m28483a2 & 32) != 0) {
                                this.f48706a.readInt();
                                t91.m28483a(this.f48706a.readByte());
                                handler.mo22687b();
                                m28492a -= 5;
                            }
                            this.f48708c.m22674b(C4833a.m22670a(m28492a, m28483a2, m28483a4));
                            C4834b c4834b = this.f48708c;
                            c4834b.m22675c(c4834b.m22672a());
                            this.f48708c.m22676d(m28483a4);
                            this.f48708c.m22673a(m28483a2);
                            this.f48708c.m22677e(readInt2);
                            this.f48709d.m29994c();
                            handler.mo22686a(z3, readInt2, this.f48709d.m29992a());
                            return true;
                        }
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    case 2:
                        if (m28492a != 5) {
                            throw new IOException(C0000a.m8e("TYPE_PRIORITY length: ", m28492a, " != 5"));
                        }
                        if (readInt2 != 0) {
                            this.f48706a.readInt();
                            t91.m28483a(this.f48706a.readByte());
                            handler.mo22687b();
                            return true;
                        }
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    case 3:
                        if (m28492a != 4) {
                            throw new IOException(C0000a.m8e("TYPE_RST_STREAM length: ", m28492a, " != 4"));
                        }
                        if (readInt2 != 0) {
                            int readInt3 = this.f48706a.readInt();
                            EnumC5708rr m27979a = EnumC5708rr.a.m27979a(readInt3);
                            if (m27979a != null) {
                                handler.mo22682a(readInt2, m27979a);
                                return true;
                            }
                            throw new IOException(k60.m26036a("TYPE_RST_STREAM unexpected error code: ", readInt3));
                        }
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    case 4:
                        if (readInt2 != 0) {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                        if ((m28483a2 & 1) != 0) {
                            if (m28492a == 0) {
                                handler.mo22678a();
                            } else {
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            }
                        } else if (m28492a % 6 == 0) {
                            t01 t01Var = new t01();
                            IntProgression m32242i = RangesKt.m32242i(RangesKt.m32243j(0, m28492a), 6);
                            int i2 = m32242i.f63380b;
                            int i3 = m32242i.f63381c;
                            int i4 = m32242i.f63382d;
                            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                                while (true) {
                                    int m28493a = t91.m28493a(this.f48706a.readShort());
                                    readInt = this.f48706a.readInt();
                                    if (m28493a != 2) {
                                        if (m28493a == 3) {
                                            m28493a = 4;
                                        } else if (m28493a == 4) {
                                            m28493a = 7;
                                            if (readInt < 0) {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (m28493a == 5 && (readInt < 16384 || readInt > 16777215)) {
                                        }
                                    } else if (readInt != 0 && readInt != 1) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    }
                                    t01Var.m28430a(m28493a, readInt);
                                    if (i2 != i3) {
                                        i2 += i4;
                                    }
                                }
                                throw new IOException(k60.m26036a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                            }
                            handler.mo22685a(t01Var);
                        } else {
                            throw new IOException(k60.m26036a("TYPE_SETTINGS length % 6 != 0: ", m28492a));
                        }
                        return true;
                    case 5:
                        if (readInt2 != 0) {
                            int m28483a5 = (m28483a2 & 8) != 0 ? t91.m28483a(this.f48706a.readByte()) : 0;
                            int readInt4 = this.f48706a.readInt() & Integer.MAX_VALUE;
                            this.f48708c.m22674b(C4833a.m22670a(m28492a - 4, m28483a2, m28483a5));
                            C4834b c4834b2 = this.f48708c;
                            c4834b2.m22675c(c4834b2.m22672a());
                            this.f48708c.m22676d(m28483a5);
                            this.f48708c.m22673a(m28483a2);
                            this.f48708c.m22677e(readInt2);
                            this.f48709d.m29994c();
                            handler.mo22684a(readInt4, this.f48709d.m29992a());
                            return true;
                        }
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    case 6:
                        if (m28492a != 8) {
                            throw new IOException(k60.m26036a("TYPE_PING length != 8: ", m28492a));
                        }
                        if (readInt2 == 0) {
                            handler.mo22680a(this.f48706a.readInt(), this.f48706a.readInt(), (m28483a2 & 1) != 0);
                            return true;
                        }
                        throw new IOException("TYPE_PING streamId != 0");
                    case 7:
                        if (m28492a < 8) {
                            throw new IOException(k60.m26036a("TYPE_GOAWAY length < 8: ", m28492a));
                        }
                        if (readInt2 == 0) {
                            int readInt5 = this.f48706a.readInt();
                            int readInt6 = this.f48706a.readInt();
                            int i5 = m28492a - 8;
                            EnumC5708rr m27979a2 = EnumC5708rr.a.m27979a(readInt6);
                            if (m27979a2 != null) {
                                ByteString byteString = ByteString.f68752e;
                                if (i5 > 0) {
                                    byteString = this.f48706a.mo34518G(i5);
                                }
                                handler.mo22683a(readInt5, m27979a2, byteString);
                                return true;
                            }
                            throw new IOException(k60.m26036a("TYPE_GOAWAY unexpected error code: ", readInt6));
                        }
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    case 8:
                        if (m28492a == 4) {
                            long m28495a = t91.m28495a(this.f48706a.readInt());
                            if (m28495a != 0) {
                                handler.mo22681a(readInt2, m28495a);
                                return true;
                            }
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        throw new IOException(k60.m26036a("TYPE_WINDOW_UPDATE length !=4: ", m28492a));
                    default:
                        this.f48706a.skip(m28492a);
                        return true;
                }
            }
            throw new IOException(k60.m26036a("FRAME_SIZE_ERROR: ", m28492a));
        } catch (EOFException unused) {
            return false;
        }
    }
}
