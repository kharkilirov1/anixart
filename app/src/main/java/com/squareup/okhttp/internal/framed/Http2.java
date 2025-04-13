package com.squareup.okhttp.internal.framed;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.squareup.okhttp.internal.framed.FrameReader;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.Hpack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Http2 implements Variant {

    /* renamed from: a */
    public static final Logger f25093a = Logger.getLogger(FrameLogger.class.getName());

    /* renamed from: b */
    public static final ByteString f25094b = ByteString.m34572c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class ContinuationSource implements Source {

        /* renamed from: b */
        public final BufferedSource f25095b;

        /* renamed from: c */
        public int f25096c;

        /* renamed from: d */
        public byte f25097d;

        /* renamed from: e */
        public int f25098e;

        /* renamed from: f */
        public int f25099f;

        /* renamed from: g */
        public short f25100g;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            int i2;
            int readInt;
            do {
                int i3 = this.f25099f;
                if (i3 != 0) {
                    long read = this.f25095b.read(buffer, Math.min(j2, i3));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f25099f = (int) (this.f25099f - read);
                    return read;
                }
                this.f25095b.skip(this.f25100g);
                this.f25100g = (short) 0;
                if ((this.f25097d & 4) != 0) {
                    return -1L;
                }
                i2 = this.f25098e;
                int m13987b = Http2.m13987b(this.f25095b);
                this.f25099f = m13987b;
                this.f25096c = m13987b;
                byte readByte = (byte) (this.f25095b.readByte() & 255);
                this.f25097d = (byte) (this.f25095b.readByte() & 255);
                Logger logger = Http2.f25093a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrameLogger.m13990a(true, this.f25098e, this.f25096c, readByte, this.f25097d));
                }
                readInt = this.f25095b.readInt() & Integer.MAX_VALUE;
                this.f25098e = readInt;
                if (readByte != 9) {
                    Http2.m13986a("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                    throw null;
                }
            } while (readInt == i2);
            Http2.m13986a("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getTimeout() {
            return this.f25095b.getTimeout();
        }
    }

    public static final class FrameLogger {

        /* renamed from: a */
        public static final String[] f25101a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        public static final String[] f25102b = new String[64];

        /* renamed from: c */
        public static final String[] f25103c = new String[256];

        static {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = f25103c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f25102b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = f25102b;
                strArr3[i5 | 8] = C0000a.m20q(new StringBuilder(), strArr3[i5], "|PADDED");
            }
            String[] strArr4 = f25102b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                for (int i8 = 0; i8 < 1; i8++) {
                    int i9 = iArr[i8];
                    String[] strArr5 = f25102b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i9]);
                    sb.append('|');
                    strArr5[i10 | 8] = C0000a.m20q(sb, strArr5[i7], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f25102b;
                if (i2 >= strArr6.length) {
                    return;
                }
                if (strArr6[i2] == null) {
                    strArr6[i2] = f25103c[i2];
                }
                i2++;
            }
        }

        /* renamed from: a */
        public static String m13990a(boolean z, int i2, int i3, byte b, byte b2) {
            String str;
            String[] strArr = f25101a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b));
            if (b2 == 0) {
                str = "";
            } else {
                if (b != 2 && b != 3) {
                    if (b == 4 || b == 6) {
                        str = b2 == 1 ? "ACK" : f25103c[b2];
                    } else if (b != 7 && b != 8) {
                        String[] strArr2 = f25102b;
                        String str2 = b2 < strArr2.length ? strArr2[b2] : f25103c[b2];
                        str = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                    }
                }
                str = f25103c[b2];
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(i3);
            objArr[3] = format;
            objArr[4] = str;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    public static final class Reader implements FrameReader {

        /* renamed from: b */
        public final BufferedSource f25104b;

        /* renamed from: c */
        public final ContinuationSource f25105c;

        /* renamed from: d */
        public final boolean f25106d;

        /* renamed from: e */
        public final Hpack.Reader f25107e;

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        /* renamed from: H0 */
        public void mo13944H0() throws IOException {
            if (this.f25106d) {
                return;
            }
            BufferedSource bufferedSource = this.f25104b;
            ByteString byteString = Http2.f25094b;
            ByteString mo34518G = bufferedSource.mo34518G(byteString.mo34576d());
            Logger logger = Http2.f25093a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("<< CONNECTION %s", mo34518G.mo34577e()));
            }
            if (byteString.equals(mo34518G)) {
                return;
            }
            Http2.m13986a("Expected a connection header but was %s", new Object[]{mo34518G.m34586p()});
            throw null;
        }

        /* renamed from: a */
        public final List<Header> m13991a(int i2, short s, byte b, int i3) throws IOException {
            ContinuationSource continuationSource = this.f25105c;
            continuationSource.f25099f = i2;
            continuationSource.f25096c = i2;
            continuationSource.f25100g = s;
            continuationSource.f25097d = b;
            continuationSource.f25098e = i3;
            Hpack.Reader reader = this.f25107e;
            while (!reader.f25086b.mo34529V()) {
                int readByte = reader.f25086b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    int m13985g = reader.m13985g(readByte, 127) - 1;
                    if (!(m13985g >= 0 && m13985g <= Hpack.f25083a.length + (-1))) {
                        int m13980b = reader.m13980b(m13985g - Hpack.f25083a.length);
                        if (m13980b >= 0) {
                            Header[] headerArr = reader.f25089e;
                            if (m13980b <= headerArr.length - 1) {
                                reader.f25085a.add(headerArr[m13980b]);
                            }
                        }
                        StringBuilder m24u = C0000a.m24u("Header index too large ");
                        m24u.append(m13985g + 1);
                        throw new IOException(m24u.toString());
                    }
                    reader.f25085a.add(Hpack.f25083a[m13985g]);
                } else if (readByte == 64) {
                    ByteString m13984f = reader.m13984f();
                    Hpack.m13978a(m13984f);
                    reader.m13983e(-1, new Header(m13984f, reader.m13984f()));
                } else if ((readByte & 64) == 64) {
                    reader.m13983e(-1, new Header(reader.m13982d(reader.m13985g(readByte, 63) - 1), reader.m13984f()));
                } else if ((readByte & 32) == 32) {
                    int m13985g2 = reader.m13985g(readByte, 31);
                    reader.f25088d = m13985g2;
                    if (m13985g2 < 0 || m13985g2 > reader.f25087c) {
                        StringBuilder m24u2 = C0000a.m24u("Invalid dynamic table size update ");
                        m24u2.append(reader.f25088d);
                        throw new IOException(m24u2.toString());
                    }
                    int i4 = reader.f25092h;
                    if (m13985g2 < i4) {
                        if (m13985g2 == 0) {
                            reader.m13979a();
                        } else {
                            reader.m13981c(i4 - m13985g2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    ByteString m13984f2 = reader.m13984f();
                    Hpack.m13978a(m13984f2);
                    reader.f25085a.add(new Header(m13984f2, reader.m13984f()));
                } else {
                    reader.f25085a.add(new Header(reader.m13982d(reader.m13985g(readByte, 15) - 1), reader.m13984f()));
                }
            }
            Hpack.Reader reader2 = this.f25107e;
            Objects.requireNonNull(reader2);
            ArrayList arrayList = new ArrayList(reader2.f25085a);
            reader2.f25085a.clear();
            return arrayList;
        }

        /* renamed from: b */
        public final void m13992b(FrameReader.Handler handler, int i2) throws IOException {
            int readInt = this.f25104b.readInt();
            handler.priority(i2, readInt & Integer.MAX_VALUE, (this.f25104b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f25104b.close();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.okhttp.internal.framed.FrameReader
        /* renamed from: m0 */
        public boolean mo13945m0(FrameReader.Handler handler) throws IOException {
            try {
                this.f25104b.mo34537c1(9L);
                int m13987b = Http2.m13987b(this.f25104b);
                if (m13987b < 0 || m13987b > 16384) {
                    Http2.m13986a("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(m13987b)});
                    throw null;
                }
                byte readByte = (byte) (this.f25104b.readByte() & 255);
                byte readByte2 = (byte) (this.f25104b.readByte() & 255);
                int readInt = this.f25104b.readInt() & Integer.MAX_VALUE;
                Logger logger = Http2.f25093a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrameLogger.m13990a(true, readInt, m13987b, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        boolean z = (readByte2 & 1) != 0;
                        if ((readByte2 & 32) != 0) {
                            Http2.m13986a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f25104b.readByte() & 255) : (short) 0;
                        ((FramedConnection.Reader) handler).m13959b(z, readInt, this.f25104b, Http2.m13988c(m13987b, readByte2, readByte3));
                        this.f25104b.skip(readByte3);
                        return true;
                    case 1:
                        if (readInt == 0) {
                            Http2.m13986a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z2 = (readByte2 & 1) != 0;
                        short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f25104b.readByte() & 255) : (short) 0;
                        if ((readByte2 & 32) != 0) {
                            m13992b(handler, readInt);
                            m13987b -= 5;
                        }
                        ((FramedConnection.Reader) handler).m13961d(false, z2, readInt, -1, m13991a(Http2.m13988c(m13987b, readByte2, readByte4), readByte4, readByte2, readInt), HeadersMode.HTTP_20_HEADERS);
                        return true;
                    case 2:
                        if (m13987b != 5) {
                            Http2.m13986a("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(m13987b)});
                            throw null;
                        }
                        if (readInt != 0) {
                            m13992b(handler, readInt);
                            return true;
                        }
                        Http2.m13986a("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    case 3:
                        if (m13987b != 4) {
                            Http2.m13986a("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(m13987b)});
                            throw null;
                        }
                        if (readInt == 0) {
                            Http2.m13986a("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int readInt2 = this.f25104b.readInt();
                        ErrorCode m13943a = ErrorCode.m13943a(readInt2);
                        if (m13943a != null) {
                            ((FramedConnection.Reader) handler).m13964g(readInt, m13943a);
                            return true;
                        }
                        Http2.m13986a("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
                        throw null;
                    case 4:
                        if (readInt != 0) {
                            Http2.m13986a("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((readByte2 & 1) == 0) {
                            if (m13987b % 6 != 0) {
                                Http2.m13986a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(m13987b)});
                                throw null;
                            }
                            Settings settings = new Settings();
                            for (int i2 = 0; i2 < m13987b; i2 += 6) {
                                short readShort = this.f25104b.readShort();
                                int readInt3 = this.f25104b.readInt();
                                switch (readShort) {
                                    case 1:
                                    case 6:
                                        break;
                                    case 2:
                                        if (readInt3 != 0 && readInt3 != 1) {
                                            Http2.m13986a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                    case 3:
                                        readShort = 4;
                                        break;
                                    case 4:
                                        readShort = 7;
                                        if (readInt3 < 0) {
                                            Http2.m13986a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        break;
                                    case 5:
                                        if (readInt3 < 16384 || readInt3 > 16777215) {
                                            Http2.m13986a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt3)});
                                            throw null;
                                        }
                                        break;
                                        break;
                                    default:
                                        Http2.m13986a("PROTOCOL_ERROR invalid settings id: %s", new Object[]{Short.valueOf(readShort)});
                                        throw null;
                                }
                                settings.m13999d(readShort, 0, readInt3);
                            }
                            ((FramedConnection.Reader) handler).m13965h(false, settings);
                            int i3 = settings.f25125a & 2;
                            if ((i3 != 0 ? settings.f25128d[1] : -1) >= 0) {
                                Hpack.Reader reader = this.f25107e;
                                int i4 = i3 != 0 ? settings.f25128d[1] : -1;
                                reader.f25087c = i4;
                                reader.f25088d = i4;
                                int i5 = reader.f25092h;
                                if (i4 < i5) {
                                    if (i4 == 0) {
                                        reader.m13979a();
                                    } else {
                                        reader.m13981c(i5 - i4);
                                    }
                                }
                            }
                        } else if (m13987b != 0) {
                            Http2.m13986a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    case 5:
                        if (readInt == 0) {
                            Http2.m13986a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short readByte5 = (readByte2 & 8) != 0 ? (short) (this.f25104b.readByte() & 255) : (short) 0;
                        ((FramedConnection.Reader) handler).m13963f(readInt, this.f25104b.readInt() & Integer.MAX_VALUE, m13991a(Http2.m13988c(m13987b - 4, readByte2, readByte5), readByte5, readByte2, readInt));
                        return true;
                    case 6:
                        if (m13987b != 8) {
                            Http2.m13986a("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(m13987b)});
                            throw null;
                        }
                        if (readInt != 0) {
                            Http2.m13986a("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        ((FramedConnection.Reader) handler).m13962e((readByte2 & 1) != 0, this.f25104b.readInt(), this.f25104b.readInt());
                        return true;
                    case 7:
                        if (m13987b < 8) {
                            Http2.m13986a("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(m13987b)});
                            throw null;
                        }
                        if (readInt != 0) {
                            Http2.m13986a("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int readInt4 = this.f25104b.readInt();
                        int readInt5 = this.f25104b.readInt();
                        int i6 = m13987b - 8;
                        ErrorCode m13943a2 = ErrorCode.m13943a(readInt5);
                        if (m13943a2 == null) {
                            Http2.m13986a("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt5)});
                            throw null;
                        }
                        ByteString byteString = ByteString.f68752e;
                        if (i6 > 0) {
                            byteString = this.f25104b.mo34518G(i6);
                        }
                        ((FramedConnection.Reader) handler).m13960c(readInt4, m13943a2, byteString);
                        return true;
                    case 8:
                        if (m13987b != 4) {
                            Http2.m13986a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(m13987b)});
                            throw null;
                        }
                        long readInt6 = this.f25104b.readInt() & ParserMinimalBase.MAX_INT_L;
                        if (readInt6 != 0) {
                            ((FramedConnection.Reader) handler).m13966i(readInt, readInt6);
                            return true;
                        }
                        Http2.m13986a("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt6)});
                        throw null;
                    default:
                        this.f25104b.skip(m13987b);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public static final class Writer implements FrameWriter {

        /* renamed from: b */
        public final BufferedSink f25108b;

        /* renamed from: c */
        public int f25109c;

        /* renamed from: d */
        public boolean f25110d;

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: G0 */
        public synchronized void mo13946G0(int i2, ErrorCode errorCode) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            if (errorCode.f24990b == -1) {
                throw new IllegalArgumentException();
            }
            m13993a(i2, 4, (byte) 3, (byte) 0);
            this.f25108b.writeInt(errorCode.f24990b);
            this.f25108b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: M */
        public synchronized void mo13947M(int i2, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            if (errorCode.f24990b == -1) {
                Http2.m13989d("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            m13993a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f25108b.writeInt(i2);
            this.f25108b.writeInt(errorCode.f24990b);
            if (bArr.length > 0) {
                this.f25108b.write(bArr);
            }
            this.f25108b.flush();
        }

        /* renamed from: a */
        public void m13993a(int i2, int i3, byte b, byte b2) throws IOException {
            Logger logger = Http2.f25093a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(FrameLogger.m13990a(false, i2, i3, b, b2));
            }
            int i4 = this.f25109c;
            if (i3 > i4) {
                Http2.m13989d("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)});
                throw null;
            }
            if ((Integer.MIN_VALUE & i2) != 0) {
                Http2.m13989d("reserved bit set: %s", new Object[]{Integer.valueOf(i2)});
                throw null;
            }
            BufferedSink bufferedSink = this.f25108b;
            bufferedSink.writeByte((i3 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bufferedSink.writeByte((i3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bufferedSink.writeByte(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f25108b.writeByte(b & 255);
            this.f25108b.writeByte(b2 & 255);
            this.f25108b.writeInt(i2 & Integer.MAX_VALUE);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f25110d = true;
            this.f25108b.close();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z, int i2, Buffer buffer, int i3) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            m13993a(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i3 > 0) {
                this.f25108b.write(buffer, i3);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            this.f25108b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return this.f25109c;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z, int i2, int i3) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            m13993a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f25108b.writeInt(i2);
            this.f25108b.writeInt(i3);
            this.f25108b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i2, long j2) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > ParserMinimalBase.MAX_INT_L) {
                Http2.m13989d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j2)});
                throw null;
            }
            m13993a(i2, 4, (byte) 8, (byte) 0);
            this.f25108b.writeInt((int) j2);
            this.f25108b.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        /* renamed from: y0 */
        public synchronized void mo13948y0(Settings settings) throws IOException {
            if (this.f25110d) {
                throw new IOException("closed");
            }
            int i2 = this.f25109c;
            if ((settings.f25125a & 32) != 0) {
                i2 = settings.f25128d[5];
            }
            this.f25109c = i2;
            m13993a(0, 0, (byte) 4, (byte) 1);
            this.f25108b.flush();
        }
    }

    /* renamed from: a */
    public static IOException m13986a(String str, Object[] objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: b */
    public static int m13987b(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: c */
    public static int m13988c(int i2, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2)));
    }

    /* renamed from: d */
    public static IllegalArgumentException m13989d(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
