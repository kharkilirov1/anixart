package com.squareup.okhttp.internal.framed;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader;
import com.squareup.okhttp.internal.framed.FramedConnection;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import kotlin.KotlinVersion;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Spdy3 implements Variant {

    /* renamed from: a */
    public static final byte[] f25129a;

    public static final class Reader implements FrameReader {

        /* renamed from: b */
        public final BufferedSource f25130b;

        /* renamed from: c */
        public final boolean f25131c;

        /* renamed from: d */
        public final NameValueBlockReader f25132d;

        /* renamed from: a */
        public static IOException m14000a(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        /* renamed from: H0 */
        public void mo13944H0() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f25132d.f25120c.close();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        /* renamed from: m0 */
        public boolean mo13945m0(FrameReader.Handler handler) throws IOException {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            try {
                int readInt = this.f25130b.readInt();
                int readInt2 = this.f25130b.readInt();
                int i2 = (readInt2 & (-16777216)) >>> 24;
                int i3 = readInt2 & 16777215;
                if (!((Integer.MIN_VALUE & readInt) != 0)) {
                    ((FramedConnection.Reader) handler).m13959b((i2 & 1) != 0, readInt & Integer.MAX_VALUE, this.f25130b, i3);
                    return true;
                }
                int i4 = (2147418112 & readInt) >>> 16;
                int i5 = readInt & okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i4 != 3) {
                    throw new ProtocolException(C0000a.m7d("version != 3: ", i4));
                }
                switch (i5) {
                    case 1:
                        int readInt3 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        int readInt4 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        this.f25130b.readShort();
                        ((FramedConnection.Reader) handler).m13961d((i2 & 2) != 0, (i2 & 1) != 0, readInt3, readInt4, this.f25132d.m13994a(i3 - 10), HeadersMode.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        ((FramedConnection.Reader) handler).m13961d(false, (i2 & 1) != 0, this.f25130b.readInt() & Integer.MAX_VALUE, -1, this.f25132d.m13994a(i3 - 4), HeadersMode.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i3 != 8) {
                            m14000a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i3));
                            throw null;
                        }
                        int readInt5 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        int readInt6 = this.f25130b.readInt();
                        ErrorCode[] values = ErrorCode.values();
                        int length = values.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 < length) {
                                errorCode = values[i6];
                                if (errorCode.f24991c != readInt6) {
                                    i6++;
                                }
                            } else {
                                errorCode = null;
                            }
                        }
                        if (errorCode != null) {
                            ((FramedConnection.Reader) handler).m13964g(readInt5, errorCode);
                            return true;
                        }
                        m14000a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt6));
                        throw null;
                    case 4:
                        int readInt7 = this.f25130b.readInt();
                        if (i3 != (readInt7 * 8) + 4) {
                            m14000a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i3), Integer.valueOf(readInt7));
                            throw null;
                        }
                        Settings settings = new Settings();
                        for (int i7 = 0; i7 < readInt7; i7++) {
                            int readInt8 = this.f25130b.readInt();
                            settings.m13999d(readInt8 & 16777215, (readInt8 & (-16777216)) >>> 24, this.f25130b.readInt());
                        }
                        ((FramedConnection.Reader) handler).m13965h((i2 & 1) != 0, settings);
                        return true;
                    case 5:
                    default:
                        this.f25130b.skip(i3);
                        return true;
                    case 6:
                        if (i3 != 4) {
                            m14000a("TYPE_PING length: %d != 4", Integer.valueOf(i3));
                            throw null;
                        }
                        int readInt9 = this.f25130b.readInt();
                        ((FramedConnection.Reader) handler).m13962e(this.f25131c == ((readInt9 & 1) == 1), readInt9, 0);
                        return true;
                    case 7:
                        if (i3 != 8) {
                            m14000a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i3));
                            throw null;
                        }
                        int readInt10 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        int readInt11 = this.f25130b.readInt();
                        ErrorCode[] values2 = ErrorCode.values();
                        int length2 = values2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 < length2) {
                                errorCode2 = values2[i8];
                                if (errorCode2.f24992d != readInt11) {
                                    i8++;
                                }
                            } else {
                                errorCode2 = null;
                            }
                        }
                        if (errorCode2 != null) {
                            ((FramedConnection.Reader) handler).m13960c(readInt10, errorCode2, ByteString.f68752e);
                            return true;
                        }
                        m14000a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt11));
                        throw null;
                    case 8:
                        ((FramedConnection.Reader) handler).m13961d(false, false, this.f25130b.readInt() & Integer.MAX_VALUE, -1, this.f25132d.m13994a(i3 - 4), HeadersMode.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i3 != 8) {
                            m14000a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i3));
                            throw null;
                        }
                        int readInt12 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        long readInt13 = this.f25130b.readInt() & Integer.MAX_VALUE;
                        if (readInt13 != 0) {
                            ((FramedConnection.Reader) handler).m13966i(readInt12, readInt13);
                            return true;
                        }
                        m14000a("windowSizeIncrement was 0", Long.valueOf(readInt13));
                        throw null;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public static final class Writer implements FrameWriter {

        /* renamed from: b */
        public final BufferedSink f25133b;

        /* renamed from: c */
        public final BufferedSink f25134c;

        /* renamed from: d */
        public final boolean f25135d;

        /* renamed from: e */
        public boolean f25136e;

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: G0 */
        public synchronized void mo13946G0(int i2, ErrorCode errorCode) throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            if (errorCode.f24991c == -1) {
                throw new IllegalArgumentException();
            }
            this.f25133b.writeInt(-2147287037);
            this.f25133b.writeInt(8);
            this.f25133b.writeInt(i2 & Integer.MAX_VALUE);
            this.f25133b.writeInt(errorCode.f24991c);
            this.f25133b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: M */
        public synchronized void mo13947M(int i2, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            if (errorCode.f24992d == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.f25133b.writeInt(-2147287033);
            this.f25133b.writeInt(8);
            this.f25133b.writeInt(i2);
            this.f25133b.writeInt(errorCode.f24992d);
            this.f25133b.flush();
        }

        /* renamed from: a */
        public void m14001a(int i2, int i3, Buffer buffer, int i4) throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            long j2 = i4;
            if (j2 > 16777215) {
                throw new IllegalArgumentException(C0000a.m7d("FRAME_TOO_LARGE max size is 16Mib: ", i4));
            }
            this.f25133b.writeInt(i2 & Integer.MAX_VALUE);
            this.f25133b.writeInt(((i3 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (16777215 & i4));
            if (i4 > 0) {
                this.f25133b.write(buffer, j2);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f25136e = true;
            Util.m13934b(this.f25133b, this.f25134c);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z, int i2, Buffer buffer, int i3) throws IOException {
            m14001a(i2, z ? 1 : 0, buffer, i3);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            this.f25133b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return 16383;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z, int i2, int i3) throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            if (z != (this.f25135d != ((i2 & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f25133b.writeInt(-2147287034);
            this.f25133b.writeInt(4);
            this.f25133b.writeInt(i2);
            this.f25133b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i2, long j2) throws IOException {
            if (this.f25136e) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > ParserMinimalBase.MAX_INT_L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j2);
            }
            this.f25133b.writeInt(-2147287031);
            this.f25133b.writeInt(8);
            this.f25133b.writeInt(i2);
            this.f25133b.writeInt((int) j2);
            this.f25133b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: y0 */
        public void mo13948y0(Settings settings) {
        }
    }

    static {
        try {
            f25129a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.f24978c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
