package io.grpc.okhttp.internal.framed;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import io.grpc.okhttp.internal.framed.FrameReader;
import io.grpc.okhttp.internal.framed.Hpack;
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

/* loaded from: classes3.dex */
public final class Http2 implements Variant {

    /* renamed from: a */
    public static final Logger f59451a = Logger.getLogger(FrameLogger.class.getName());

    /* renamed from: b */
    public static final ByteString f59452b = ByteString.m34572c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class ContinuationSource implements Source {

        /* renamed from: b */
        public final BufferedSource f59453b;

        /* renamed from: c */
        public int f59454c;

        /* renamed from: d */
        public byte f59455d;

        /* renamed from: e */
        public int f59456e;

        /* renamed from: f */
        public int f59457f;

        /* renamed from: g */
        public short f59458g;

        public ContinuationSource(BufferedSource bufferedSource) {
            this.f59453b = bufferedSource;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            int i2;
            int readInt;
            do {
                int i3 = this.f59457f;
                if (i3 != 0) {
                    long read = this.f59453b.read(buffer, Math.min(j2, i3));
                    if (read == -1) {
                        return -1L;
                    }
                    this.f59457f -= (int) read;
                    return read;
                }
                this.f59453b.skip(this.f59458g);
                this.f59458g = (short) 0;
                if ((this.f59455d & 4) != 0) {
                    return -1L;
                }
                i2 = this.f59456e;
                int m31310c = Http2.m31310c(this.f59453b);
                this.f59457f = m31310c;
                this.f59454c = m31310c;
                byte readByte = (byte) (this.f59453b.readByte() & 255);
                this.f59455d = (byte) (this.f59453b.readByte() & 255);
                Logger logger = Http2.f59451a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrameLogger.m31315a(true, this.f59456e, this.f59454c, readByte, this.f59455d));
                }
                readInt = this.f59453b.readInt() & Integer.MAX_VALUE;
                this.f59456e = readInt;
                if (readByte != 9) {
                    Http2.m31309b("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                    throw null;
                }
            } while (readInt == i2);
            Http2.m31309b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // okio.Source
        /* renamed from: timeout */
        public Timeout getF68772c() {
            return this.f59453b.getF68772c();
        }
    }

    public static final class FrameLogger {

        /* renamed from: a */
        public static final String[] f59459a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        public static final String[] f59460b = new String[64];

        /* renamed from: c */
        public static final String[] f59461c = new String[256];

        static {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = f59461c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f59460b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = f59460b;
                strArr3[i5 | 8] = C0000a.m20q(new StringBuilder(), strArr3[i5], "|PADDED");
            }
            String[] strArr4 = f59460b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                for (int i8 = 0; i8 < 1; i8++) {
                    int i9 = iArr[i8];
                    String[] strArr5 = f59460b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i9]);
                    sb.append('|');
                    strArr5[i10 | 8] = C0000a.m20q(sb, strArr5[i7], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f59460b;
                if (i2 >= strArr6.length) {
                    return;
                }
                if (strArr6[i2] == null) {
                    strArr6[i2] = f59461c[i2];
                }
                i2++;
            }
        }

        /* renamed from: a */
        public static String m31315a(boolean z, int i2, int i3, byte b, byte b2) {
            String str;
            String[] strArr = f59459a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", Byte.valueOf(b));
            if (b2 == 0) {
                str = "";
            } else {
                if (b != 2 && b != 3) {
                    if (b == 4 || b == 6) {
                        str = b2 == 1 ? "ACK" : f59461c[b2];
                    } else if (b != 7 && b != 8) {
                        String[] strArr2 = f59460b;
                        String str2 = b2 < strArr2.length ? strArr2[b2] : f59461c[b2];
                        str = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                    }
                }
                str = f59461c[b2];
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
        public final BufferedSource f59462b;

        /* renamed from: c */
        public final ContinuationSource f59463c;

        /* renamed from: d */
        public final Hpack.Reader f59464d;

        public Reader(BufferedSource bufferedSource, int i2, boolean z) {
            this.f59462b = bufferedSource;
            ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
            this.f59463c = continuationSource;
            this.f59464d = new Hpack.Reader(i2, continuationSource);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.okhttp.internal.framed.FrameReader
        /* renamed from: W */
        public boolean mo31297W(FrameReader.Handler handler) throws IOException {
            try {
                this.f59462b.mo34537c1(9L);
                int m31310c = Http2.m31310c(this.f59462b);
                if (m31310c < 0 || m31310c > 16384) {
                    Http2.m31309b("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(m31310c)});
                    throw null;
                }
                byte readByte = (byte) (this.f59462b.readByte() & 255);
                byte readByte2 = (byte) (this.f59462b.readByte() & 255);
                int readInt = this.f59462b.readInt() & Integer.MAX_VALUE;
                Logger logger = Http2.f59451a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrameLogger.m31315a(true, readInt, m31310c, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        boolean z = (readByte2 & 1) != 0;
                        if ((readByte2 & 32) != 0) {
                            Http2.m31309b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                        short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f59462b.readByte() & 255) : (short) 0;
                        handler.data(z, readInt, this.f59462b, Http2.m31311d(m31310c, readByte2, readByte3));
                        this.f59462b.skip(readByte3);
                        return true;
                    case 1:
                        if (readInt == 0) {
                            Http2.m31309b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        boolean z2 = (readByte2 & 1) != 0;
                        short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f59462b.readByte() & 255) : (short) 0;
                        if ((readByte2 & 32) != 0) {
                            m31317b(handler, readInt);
                            m31310c -= 5;
                        }
                        handler.mo31249g(false, z2, readInt, -1, m31316a(Http2.m31311d(m31310c, readByte2, readByte4), readByte4, readByte2, readInt), HeadersMode.HTTP_20_HEADERS);
                        return true;
                    case 2:
                        if (m31310c != 5) {
                            Http2.m31309b("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(m31310c)});
                            throw null;
                        }
                        if (readInt != 0) {
                            m31317b(handler, readInt);
                            return true;
                        }
                        Http2.m31309b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    case 3:
                        if (m31310c != 4) {
                            Http2.m31309b("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(m31310c)});
                            throw null;
                        }
                        if (readInt == 0) {
                            Http2.m31309b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        int readInt2 = this.f59462b.readInt();
                        ErrorCode m31296a = ErrorCode.m31296a(readInt2);
                        if (m31296a != null) {
                            handler.mo31246d(readInt, m31296a);
                            return true;
                        }
                        Http2.m31309b("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
                        throw null;
                    case 4:
                        if (readInt != 0) {
                            Http2.m31309b("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        }
                        if ((readByte2 & 1) == 0) {
                            if (m31310c % 6 != 0) {
                                Http2.m31309b("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(m31310c)});
                                throw null;
                            }
                            Settings settings = new Settings();
                            for (int i2 = 0; i2 < m31310c; i2 += 6) {
                                short readShort = this.f59462b.readShort();
                                int readInt3 = this.f59462b.readInt();
                                switch (readShort) {
                                    case 1:
                                    case 6:
                                        settings.m31321b(readShort, 0, readInt3);
                                    case 2:
                                        if (readInt3 != 0 && readInt3 != 1) {
                                            Http2.m31309b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        settings.m31321b(readShort, 0, readInt3);
                                    case 3:
                                        readShort = 4;
                                        settings.m31321b(readShort, 0, readInt3);
                                    case 4:
                                        readShort = 7;
                                        if (readInt3 < 0) {
                                            Http2.m31309b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                        settings.m31321b(readShort, 0, readInt3);
                                    case 5:
                                        if (readInt3 < 16384 || readInt3 > 16777215) {
                                            Http2.m31309b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt3)});
                                            throw null;
                                        }
                                        settings.m31321b(readShort, 0, readInt3);
                                        break;
                                    default:
                                }
                            }
                            handler.mo31248f(false, settings);
                            int i3 = settings.f59478a & 2;
                            if ((i3 != 0 ? settings.f59481d[1] : -1) >= 0) {
                                Hpack.Reader reader = this.f59464d;
                                int i4 = i3 != 0 ? settings.f59481d[1] : -1;
                                reader.f59437c = i4;
                                reader.f59438d = i4;
                                int i5 = reader.f59442h;
                                if (i4 < i5) {
                                    if (i4 == 0) {
                                        reader.m31299a();
                                    } else {
                                        reader.m31301c(i5 - i4);
                                    }
                                }
                            }
                        } else if (m31310c != 0) {
                            Http2.m31309b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                        return true;
                    case 5:
                        if (readInt == 0) {
                            Http2.m31309b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                        short readByte5 = (readByte2 & 8) != 0 ? (short) (this.f59462b.readByte() & 255) : (short) 0;
                        handler.pushPromise(readInt, this.f59462b.readInt() & Integer.MAX_VALUE, m31316a(Http2.m31311d(m31310c - 4, readByte2, readByte5), readByte5, readByte2, readInt));
                        return true;
                    case 6:
                        if (m31310c != 8) {
                            Http2.m31309b("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(m31310c)});
                            throw null;
                        }
                        if (readInt != 0) {
                            Http2.m31309b("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        handler.ping((readByte2 & 1) != 0, this.f59462b.readInt(), this.f59462b.readInt());
                        return true;
                    case 7:
                        if (m31310c < 8) {
                            Http2.m31309b("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(m31310c)});
                            throw null;
                        }
                        if (readInt != 0) {
                            Http2.m31309b("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        int readInt4 = this.f59462b.readInt();
                        int readInt5 = this.f59462b.readInt();
                        int i6 = m31310c - 8;
                        ErrorCode m31296a2 = ErrorCode.m31296a(readInt5);
                        if (m31296a2 == null) {
                            Http2.m31309b("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt5)});
                            throw null;
                        }
                        ByteString byteString = ByteString.f68752e;
                        if (i6 > 0) {
                            byteString = this.f59462b.mo34518G(i6);
                        }
                        handler.mo31247e(readInt4, m31296a2, byteString);
                        return true;
                    case 8:
                        if (m31310c != 4) {
                            Http2.m31309b("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(m31310c)});
                            throw null;
                        }
                        long readInt6 = this.f59462b.readInt() & ParserMinimalBase.MAX_INT_L;
                        if (readInt6 != 0) {
                            handler.windowUpdate(readInt, readInt6);
                            return true;
                        }
                        Http2.m31309b("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    default:
                        this.f59462b.skip(m31310c);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final List<Header> m31316a(int i2, short s, byte b, int i3) throws IOException {
            ContinuationSource continuationSource = this.f59463c;
            continuationSource.f59457f = i2;
            continuationSource.f59454c = i2;
            continuationSource.f59458g = s;
            continuationSource.f59455d = b;
            continuationSource.f59456e = i3;
            Hpack.Reader reader = this.f59464d;
            while (!reader.f59436b.mo34529V()) {
                int readByte = reader.f59436b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    int m31305g = reader.m31305g(readByte, 127) - 1;
                    if (!(m31305g >= 0 && m31305g <= Hpack.f59433b.length + (-1))) {
                        int m31300b = reader.m31300b(m31305g - Hpack.f59433b.length);
                        if (m31300b >= 0) {
                            Header[] headerArr = reader.f59439e;
                            if (m31300b <= headerArr.length - 1) {
                                reader.f59435a.add(headerArr[m31300b]);
                            }
                        }
                        StringBuilder m24u = C0000a.m24u("Header index too large ");
                        m24u.append(m31305g + 1);
                        throw new IOException(m24u.toString());
                    }
                    reader.f59435a.add(Hpack.f59433b[m31305g]);
                } else if (readByte == 64) {
                    ByteString m31304f = reader.m31304f();
                    Hpack.m31298a(m31304f);
                    reader.m31303e(-1, new Header(m31304f, reader.m31304f()));
                } else if ((readByte & 64) == 64) {
                    reader.m31303e(-1, new Header(reader.m31302d(reader.m31305g(readByte, 63) - 1), reader.m31304f()));
                } else if ((readByte & 32) == 32) {
                    int m31305g2 = reader.m31305g(readByte, 31);
                    reader.f59438d = m31305g2;
                    if (m31305g2 < 0 || m31305g2 > reader.f59437c) {
                        StringBuilder m24u2 = C0000a.m24u("Invalid dynamic table size update ");
                        m24u2.append(reader.f59438d);
                        throw new IOException(m24u2.toString());
                    }
                    int i4 = reader.f59442h;
                    if (m31305g2 < i4) {
                        if (m31305g2 == 0) {
                            reader.m31299a();
                        } else {
                            reader.m31301c(i4 - m31305g2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    ByteString m31304f2 = reader.m31304f();
                    Hpack.m31298a(m31304f2);
                    reader.f59435a.add(new Header(m31304f2, reader.m31304f()));
                } else {
                    reader.f59435a.add(new Header(reader.m31302d(reader.m31305g(readByte, 15) - 1), reader.m31304f()));
                }
            }
            Hpack.Reader reader2 = this.f59464d;
            Objects.requireNonNull(reader2);
            ArrayList arrayList = new ArrayList(reader2.f59435a);
            reader2.f59435a.clear();
            return arrayList;
        }

        /* renamed from: b */
        public final void m31317b(FrameReader.Handler handler, int i2) throws IOException {
            int readInt = this.f59462b.readInt();
            handler.priority(i2, readInt & Integer.MAX_VALUE, (this.f59462b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f59462b.close();
        }
    }

    public static final class Writer implements FrameWriter {

        /* renamed from: b */
        public final BufferedSink f59465b;

        /* renamed from: c */
        public final boolean f59466c;

        /* renamed from: d */
        public final Buffer f59467d;

        /* renamed from: e */
        public final Hpack.Writer f59468e;

        /* renamed from: f */
        public int f59469f;

        /* renamed from: g */
        public boolean f59470g;

        public Writer(BufferedSink bufferedSink, boolean z) {
            this.f59465b = bufferedSink;
            this.f59466c = z;
            Buffer buffer = new Buffer();
            this.f59467d = buffer;
            this.f59468e = new Hpack.Writer(buffer);
            this.f59469f = 16384;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        /* renamed from: C0 */
        public synchronized void mo31215C0(Settings settings) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            int i2 = 0;
            m31318a(0, Integer.bitCount(settings.f59478a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (settings.m31320a(i2)) {
                    this.f59465b.writeShort(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                    this.f59465b.writeInt(settings.f59481d[i2]);
                }
                i2++;
            }
            this.f59465b.flush();
        }

        /* renamed from: a */
        public void m31318a(int i2, int i3, byte b, byte b2) throws IOException {
            Logger logger = Http2.f59451a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(FrameLogger.m31315a(false, i2, i3, b, b2));
            }
            int i4 = this.f59469f;
            if (i3 > i4) {
                Http2.m31312e("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)});
                throw null;
            }
            if ((Integer.MIN_VALUE & i2) != 0) {
                Http2.m31312e("reserved bit set: %s", new Object[]{Integer.valueOf(i2)});
                throw null;
            }
            BufferedSink bufferedSink = this.f59465b;
            bufferedSink.writeByte((i3 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bufferedSink.writeByte((i3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bufferedSink.writeByte(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f59465b.writeByte(b & 255);
            this.f59465b.writeByte(b2 & 255);
            this.f59465b.writeInt(i2 & Integer.MAX_VALUE);
        }

        /* renamed from: b */
        public void m31319b(boolean z, int i2, List<Header> list) throws IOException {
            int i3;
            int i4;
            if (this.f59470g) {
                throw new IOException("closed");
            }
            Hpack.Writer writer = this.f59468e;
            Objects.requireNonNull(writer);
            int size = list.size();
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i5 >= size) {
                    break;
                }
                Header header = list.get(i5);
                ByteString mo34584n = header.f59427a.mo34584n();
                ByteString byteString = header.f59428b;
                Integer num = Hpack.f59434c.get(mo34584n);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 >= 2 && i3 <= 7) {
                        Header[] headerArr = Hpack.f59433b;
                        if (headerArr[i3 - 1].f59428b.equals(byteString)) {
                            i4 = i3;
                        } else if (headerArr[i3].f59428b.equals(byteString)) {
                            i4 = i3;
                            i3++;
                        }
                    }
                    i4 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i4 = -1;
                }
                if (i3 == -1) {
                    int i7 = writer.f59449g;
                    while (true) {
                        i7 += i6;
                        Header[] headerArr2 = writer.f59447e;
                        if (i7 >= headerArr2.length) {
                            break;
                        }
                        if (headerArr2[i7].f59427a.equals(mo34584n)) {
                            if (writer.f59447e[i7].f59428b.equals(byteString)) {
                                i3 = Hpack.f59433b.length + (i7 - writer.f59449g);
                                break;
                            } else if (i4 == -1) {
                                i4 = (i7 - writer.f59449g) + Hpack.f59433b.length;
                            }
                        }
                        i6 = 1;
                    }
                }
                if (i3 != -1) {
                    writer.m31308c(i3, 127, 128);
                } else if (i4 == -1) {
                    writer.f59443a.m34524Q(64);
                    writer.m31307b(mo34584n);
                    writer.m31307b(byteString);
                    writer.m31306a(header);
                } else if (!mo34584n.m34583m(Hpack.f59432a) || Header.f59426h.equals(mo34584n)) {
                    writer.m31308c(i4, 63, 64);
                    writer.m31307b(byteString);
                    writer.m31306a(header);
                } else {
                    writer.m31308c(i4, 15, 0);
                    writer.m31307b(byteString);
                }
                i5++;
            }
            long j2 = this.f59467d.f68742c;
            int min = (int) Math.min(this.f59469f, j2);
            long j3 = min;
            byte b = j2 == j3 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m31318a(i2, min, (byte) 1, b);
            this.f59465b.write(this.f59467d, j3);
            if (j2 > j3) {
                long j4 = j2 - j3;
                while (j4 > 0) {
                    int min2 = (int) Math.min(this.f59469f, j4);
                    long j5 = min2;
                    j4 -= j5;
                    m31318a(i2, min2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                    this.f59465b.write(this.f59467d, j5);
                }
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        /* renamed from: b1 */
        public synchronized void mo31216b1(boolean z, boolean z2, int i2, int i3, List<Header> list) throws IOException {
            try {
                if (z2) {
                    throw new UnsupportedOperationException();
                }
                if (this.f59470g) {
                    throw new IOException("closed");
                }
                m31319b(z, i2, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f59470g = true;
            this.f59465b.close();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public synchronized void connectionPreface() throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            if (this.f59466c) {
                Logger logger = Http2.f59451a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", Http2.f59452b.mo34577e()));
                }
                this.f59465b.write(Http2.f59452b.mo34585o());
                this.f59465b.flush();
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        /* renamed from: d */
        public synchronized void mo31217d(int i2, ErrorCode errorCode) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            if (errorCode.f59421b == -1) {
                throw new IllegalArgumentException();
            }
            m31318a(i2, 4, (byte) 3, (byte) 0);
            this.f59465b.writeInt(errorCode.f59421b);
            this.f59465b.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z, int i2, Buffer buffer, int i3) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            m31318a(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i3 > 0) {
                this.f59465b.write(buffer, i3);
            }
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            this.f59465b.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        /* renamed from: l1 */
        public synchronized void mo31218l1(int i2, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            if (errorCode.f59421b == -1) {
                Http2.m31312e("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            m31318a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f59465b.writeInt(i2);
            this.f59465b.writeInt(errorCode.f59421b);
            if (bArr.length > 0) {
                this.f59465b.write(bArr);
            }
            this.f59465b.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return this.f59469f;
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z, int i2, int i3) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            m31318a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f59465b.writeInt(i2);
            this.f59465b.writeInt(i3);
            this.f59465b.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        /* renamed from: v0 */
        public synchronized void mo31219v0(Settings settings) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            int i2 = this.f59469f;
            if ((settings.f59478a & 32) != 0) {
                i2 = settings.f59481d[5];
            }
            this.f59469f = i2;
            m31318a(0, 0, (byte) 4, (byte) 1);
            this.f59465b.flush();
        }

        @Override // io.grpc.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i2, long j2) throws IOException {
            if (this.f59470g) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > ParserMinimalBase.MAX_INT_L) {
                Http2.m31312e("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j2)});
                throw null;
            }
            m31318a(i2, 4, (byte) 8, (byte) 0);
            this.f59465b.writeInt((int) j2);
            this.f59465b.flush();
        }
    }

    /* renamed from: b */
    public static IOException m31309b(String str, Object[] objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: c */
    public static int m31310c(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* renamed from: d */
    public static int m31311d(int i2, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2)));
    }

    /* renamed from: e */
    public static IllegalArgumentException m31312e(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    @Override // io.grpc.okhttp.internal.framed.Variant
    /* renamed from: a */
    public FrameReader mo31313a(BufferedSource bufferedSource, boolean z) {
        return new Reader(bufferedSource, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, z);
    }

    /* renamed from: f */
    public FrameWriter m31314f(BufferedSink bufferedSink, boolean z) {
        return new Writer(bufferedSink, z);
    }
}
