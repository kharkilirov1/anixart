package okio;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.p006io.NumberInput;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.yandex.div2.C3033a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.connection.RealConnection;
import okio.internal.BufferKt;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Buffer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "UnsafeCursor", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: b */
    @JvmField
    @Nullable
    public Segment f68741b;

    /* renamed from: c */
    public long f68742c;

    /* compiled from: Buffer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class UnsafeCursor implements Closeable {

        /* renamed from: b */
        @JvmField
        @Nullable
        public Buffer f68743b;

        /* renamed from: c */
        @JvmField
        public boolean f68744c;

        /* renamed from: d */
        public Segment f68745d;

        /* renamed from: f */
        @JvmField
        @Nullable
        public byte[] f68747f;

        /* renamed from: e */
        @JvmField
        public long f68746e = -1;

        /* renamed from: g */
        @JvmField
        public int f68748g = -1;

        /* renamed from: h */
        @JvmField
        public int f68749h = -1;

        /* renamed from: a */
        public final long m34570a(long j2) {
            Buffer buffer = this.f68743b;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f68744c) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long j3 = buffer.f68742c;
            int i2 = 1;
            if (j2 <= j3) {
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(C0000a.m11h("newSize < 0: ", j2).toString());
                }
                long j4 = j3 - j2;
                while (true) {
                    if (j4 <= 0) {
                        break;
                    }
                    Segment segment = buffer.f68741b;
                    Intrinsics.m32176e(segment);
                    Segment segment2 = segment.f68799g;
                    Intrinsics.m32176e(segment2);
                    int i3 = segment2.f68795c;
                    long j5 = i3 - segment2.f68794b;
                    if (j5 > j4) {
                        segment2.f68795c = i3 - ((int) j4);
                        break;
                    }
                    buffer.f68741b = segment2.m34613a();
                    SegmentPool.m34617b(segment2);
                    j4 -= j5;
                }
                this.f68745d = null;
                this.f68746e = j2;
                this.f68747f = null;
                this.f68748g = -1;
                this.f68749h = -1;
            } else if (j2 > j3) {
                long j6 = j2 - j3;
                boolean z = true;
                while (j6 > 0) {
                    Segment m34565u = buffer.m34565u(i2);
                    int min = (int) Math.min(j6, 8192 - m34565u.f68795c);
                    int i4 = m34565u.f68795c + min;
                    m34565u.f68795c = i4;
                    j6 -= min;
                    if (z) {
                        this.f68745d = m34565u;
                        this.f68746e = j3;
                        this.f68747f = m34565u.f68793a;
                        this.f68748g = i4 - min;
                        this.f68749h = i4;
                        z = false;
                    }
                    i2 = 1;
                }
            }
            buffer.f68742c = j2;
            return j3;
        }

        /* renamed from: b */
        public final int m34571b(long j2) {
            long j3;
            Segment segment;
            Buffer buffer = this.f68743b;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 >= -1) {
                long j4 = buffer.f68742c;
                if (j2 <= j4) {
                    if (j2 == -1 || j2 == j4) {
                        this.f68745d = null;
                        this.f68746e = j2;
                        this.f68747f = null;
                        this.f68748g = -1;
                        this.f68749h = -1;
                        return -1;
                    }
                    long j5 = 0;
                    Segment segment2 = buffer.f68741b;
                    Segment segment3 = this.f68745d;
                    if (segment3 != null) {
                        long j6 = this.f68746e;
                        int i2 = this.f68748g;
                        Intrinsics.m32176e(segment3);
                        j3 = j6 - (i2 - segment3.f68794b);
                        if (j3 > j2) {
                            segment = this.f68745d;
                        } else {
                            segment = segment2;
                            segment2 = this.f68745d;
                            j5 = j3;
                            j3 = j4;
                        }
                    } else {
                        j3 = j4;
                        segment = segment2;
                    }
                    if (j3 - j2 > j2 - j5) {
                        while (true) {
                            Intrinsics.m32176e(segment2);
                            int i3 = segment2.f68795c;
                            int i4 = segment2.f68794b;
                            if (j2 < (i3 - i4) + j5) {
                                break;
                            }
                            j5 += i3 - i4;
                            segment2 = segment2.f68798f;
                        }
                    } else {
                        while (j3 > j2) {
                            Intrinsics.m32176e(segment);
                            segment = segment.f68799g;
                            Intrinsics.m32176e(segment);
                            j3 -= segment.f68795c - segment.f68794b;
                        }
                        segment2 = segment;
                        j5 = j3;
                    }
                    if (this.f68744c) {
                        Intrinsics.m32176e(segment2);
                        if (segment2.f68796d) {
                            byte[] bArr = segment2.f68793a;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.m32178g(copyOf, "java.util.Arrays.copyOf(this, size)");
                            Segment segment4 = new Segment(copyOf, segment2.f68794b, segment2.f68795c, false, true);
                            if (buffer.f68741b == segment2) {
                                buffer.f68741b = segment4;
                            }
                            segment2.m34614b(segment4);
                            Segment segment5 = segment4.f68799g;
                            Intrinsics.m32176e(segment5);
                            segment5.m34613a();
                            segment2 = segment4;
                        }
                    }
                    this.f68745d = segment2;
                    this.f68746e = j2;
                    Intrinsics.m32176e(segment2);
                    this.f68747f = segment2.f68793a;
                    int i5 = segment2.f68794b + ((int) (j2 - j5));
                    this.f68748g = i5;
                    int i6 = segment2.f68795c;
                    this.f68749h = i6;
                    return i6 - i5;
                }
            }
            throw new ArrayIndexOutOfBoundsException(C3033a.m17745g(new Object[]{Long.valueOf(j2), Long.valueOf(buffer.f68742c)}, 2, "offset=%s > size=%s", "java.lang.String.format(format, *args)"));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f68743b != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f68743b = null;
            this.f68745d = null;
            this.f68746e = -1L;
            this.f68747f = null;
            this.f68748g = -1;
            this.f68749h = -1;
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: B0 */
    public ByteString mo34515B0() {
        return mo34518G(this.f68742c);
    }

    @NotNull
    /* renamed from: D0 */
    public Buffer m34516D0(@NotNull String string) {
        Intrinsics.m32179h(string, "string");
        m34522O0(string, 0, string.length());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: F */
    public Buffer mo34517F() {
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: G */
    public ByteString mo34518G(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount: ", j2).toString());
        }
        if (this.f68742c < j2) {
            throw new EOFException();
        }
        if (j2 < RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT) {
            return new ByteString(mo34523P0(j2));
        }
        ByteString m34560q = m34560q((int) j2);
        skip(j2);
        return m34560q;
    }

    @Override // okio.BufferedSink
    /* renamed from: J */
    public BufferedSink mo34519J() {
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: M0 */
    public String mo34520M0() throws EOFException {
        return mo34546h0(Long.MAX_VALUE);
    }

    @NotNull
    /* renamed from: N */
    public Buffer m34521N(@NotNull byte[] source, int i2, int i3) {
        Intrinsics.m32179h(source, "source");
        long j2 = i3;
        Util.m34510b(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment m34565u = m34565u(1);
            int min = Math.min(i4 - i2, 8192 - m34565u.f68795c);
            int i5 = i2 + min;
            ArraysKt.m31967q(source, m34565u.f68793a, m34565u.f68795c, i2, i5);
            m34565u.f68795c += min;
            i2 = i5;
        }
        this.f68742c += j2;
        return this;
    }

    @NotNull
    /* renamed from: O0 */
    public Buffer m34522O0(@NotNull String string, int i2, int i3) {
        char charAt;
        Intrinsics.m32179h(string, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("beginIndex < 0: ", i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(C0000a.m9f("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        if (!(i3 <= string.length())) {
            StringBuilder m25v = C0000a.m25v("endIndex > string.length: ", i3, " > ");
            m25v.append(string.length());
            throw new IllegalArgumentException(m25v.toString().toString());
        }
        while (i2 < i3) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                Segment m34565u = m34565u(1);
                byte[] bArr = m34565u.f68793a;
                int i4 = m34565u.f68795c - i2;
                int min = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) charAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                }
                int i6 = m34565u.f68795c;
                int i7 = (i4 + i2) - i6;
                m34565u.f68795c = i6 + i7;
                this.f68742c += i7;
            } else {
                if (charAt2 < 2048) {
                    Segment m34565u2 = m34565u(2);
                    byte[] bArr2 = m34565u2.f68793a;
                    int i8 = m34565u2.f68795c;
                    bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    m34565u2.f68795c = i8 + 2;
                    this.f68742c += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment m34565u3 = m34565u(3);
                    byte[] bArr3 = m34565u3.f68793a;
                    int i9 = m34565u3.f68795c;
                    bArr3[i9] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                    m34565u3.f68795c = i9 + 3;
                    this.f68742c += 3;
                } else {
                    int i10 = i2 + 1;
                    char charAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        m34524Q(63);
                        i2 = i10;
                    } else {
                        int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + TextBuffer.MAX_SEGMENT_LEN;
                        Segment m34565u4 = m34565u(4);
                        byte[] bArr4 = m34565u4.f68793a;
                        int i12 = m34565u4.f68795c;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        m34565u4.f68795c = i12 + 4;
                        this.f68742c += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: P0 */
    public byte[] mo34523P0(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount: ", j2).toString());
        }
        if (this.f68742c < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @NotNull
    /* renamed from: Q */
    public Buffer m34524Q(int i2) {
        Segment m34565u = m34565u(1);
        byte[] bArr = m34565u.f68793a;
        int i3 = m34565u.f68795c;
        m34565u.f68795c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f68742c++;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Buffer mo34544g1(long j2) {
        if (j2 == 0) {
            m34524Q(48);
        } else {
            boolean z = false;
            int i2 = 1;
            if (j2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    m34516D0("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j2 >= 100000000) {
                i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < NumberInput.L_BILLION ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
            } else if (j2 >= 10000) {
                i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
            } else if (j2 >= 100) {
                i2 = j2 < 1000 ? 3 : 4;
            } else if (j2 >= 10) {
                i2 = 2;
            }
            if (z) {
                i2++;
            }
            Segment m34565u = m34565u(i2);
            byte[] bArr = m34565u.f68793a;
            int i3 = m34565u.f68795c + i2;
            while (j2 != 0) {
                long j3 = 10;
                i3--;
                bArr[i3] = BufferKt.f68807a[(int) (j2 % j3)];
                j2 /= j3;
            }
            if (z) {
                bArr[i3 - 1] = (byte) 45;
            }
            m34565u.f68795c += i2;
            this.f68742c += i2;
        }
        return this;
    }

    @NotNull
    /* renamed from: R0 */
    public Buffer m34526R0(int i2) {
        String str;
        if (i2 < 128) {
            m34524Q(i2);
        } else if (i2 < 2048) {
            Segment m34565u = m34565u(2);
            byte[] bArr = m34565u.f68793a;
            int i3 = m34565u.f68795c;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            m34565u.f68795c = i3 + 2;
            this.f68742c += 2;
        } else if (55296 <= i2 && 57343 >= i2) {
            m34524Q(63);
        } else if (i2 < 65536) {
            Segment m34565u2 = m34565u(3);
            byte[] bArr2 = m34565u2.f68793a;
            int i4 = m34565u2.f68795c;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            m34565u2.f68795c = i4 + 3;
            this.f68742c += 3;
        } else {
            if (i2 > 1114111) {
                StringBuilder m24u = C0000a.m24u("Unexpected code point: 0x");
                if (i2 != 0) {
                    char[] cArr = ByteStringKt.f68808a;
                    int i5 = 0;
                    char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
                    while (i5 < 8 && cArr2[i5] == '0') {
                        i5++;
                    }
                    str = new String(cArr2, i5, 8 - i5);
                } else {
                    str = "0";
                }
                m24u.append(str);
                throw new IllegalArgumentException(m24u.toString());
            }
            Segment m34565u3 = m34565u(4);
            byte[] bArr3 = m34565u3.f68793a;
            int i6 = m34565u3.f68795c;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[i6 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i6 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i6 + 3] = (byte) ((i2 & 63) | 128);
            m34565u3.f68795c = i6 + 4;
            this.f68742c += 4;
        }
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: T */
    public byte[] mo34527T() {
        return mo34523P0(this.f68742c);
    }

    @Override // okio.BufferedSink
    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ BufferedSink mo34528T0(ByteString byteString) {
        m34566v(byteString);
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: V */
    public boolean mo34529V() {
        return this.f68742c == 0;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Buffer mo34514A0(long j2) {
        if (j2 == 0) {
            m34524Q(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
            Segment m34565u = m34565u(i2);
            byte[] bArr = m34565u.f68793a;
            int i3 = m34565u.f68795c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = BufferKt.f68807a[(int) (15 & j2)];
                j2 >>>= 4;
            }
            m34565u.f68795c += i2;
            this.f68742c += i2;
        }
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: X0 */
    public long mo34531X0(@NotNull Sink sink) throws IOException {
        long j2 = this.f68742c;
        if (j2 > 0) {
            ((Buffer) sink).write(this, j2);
        }
        return j2;
    }

    @NotNull
    /* renamed from: Z */
    public Buffer m34532Z(int i2) {
        Segment m34565u = m34565u(4);
        byte[] bArr = m34565u.f68793a;
        int i3 = m34565u.f68795c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i6] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        m34565u.f68795c = i6 + 1;
        this.f68742c += 4;
        return this;
    }

    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.f68742c != 0) {
            Segment segment = this.f68741b;
            Intrinsics.m32176e(segment);
            Segment m34615c = segment.m34615c();
            buffer.f68741b = m34615c;
            m34615c.f68799g = m34615c;
            m34615c.f68798f = m34615c;
            for (Segment segment2 = segment.f68798f; segment2 != segment; segment2 = segment2.f68798f) {
                Segment segment3 = m34615c.f68799g;
                Intrinsics.m32176e(segment3);
                Intrinsics.m32176e(segment2);
                segment3.m34614b(segment2.m34615c());
            }
            buffer.f68742c = this.f68742c;
        }
        return buffer;
    }

    /* renamed from: b */
    public final long m34534b() {
        long j2 = this.f68742c;
        if (j2 == 0) {
            return 0L;
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        Segment segment2 = segment.f68799g;
        Intrinsics.m32176e(segment2);
        if (segment2.f68795c < 8192 && segment2.f68797e) {
            j2 -= r3 - segment2.f68794b;
        }
        return j2;
    }

    @NotNull
    /* renamed from: c */
    public final Buffer m34535c(@NotNull Buffer out, long j2, long j3) {
        Intrinsics.m32179h(out, "out");
        Util.m34510b(this.f68742c, j2, j3);
        if (j3 != 0) {
            out.f68742c += j3;
            Segment segment = this.f68741b;
            while (true) {
                Intrinsics.m32176e(segment);
                int i2 = segment.f68795c;
                int i3 = segment.f68794b;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= i2 - i3;
                segment = segment.f68798f;
            }
            while (j3 > 0) {
                Intrinsics.m32176e(segment);
                Segment m34615c = segment.m34615c();
                int i4 = m34615c.f68794b + ((int) j2);
                m34615c.f68794b = i4;
                m34615c.f68795c = Math.min(i4 + ((int) j3), m34615c.f68795c);
                Segment segment2 = out.f68741b;
                if (segment2 == null) {
                    m34615c.f68799g = m34615c;
                    m34615c.f68798f = m34615c;
                    out.f68741b = m34615c;
                } else {
                    Intrinsics.m32176e(segment2);
                    Segment segment3 = segment2.f68799g;
                    Intrinsics.m32176e(segment3);
                    segment3.m34614b(m34615c);
                }
                j3 -= m34615c.f68795c - m34615c.f68794b;
                segment = segment.f68798f;
                j2 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSource
    /* renamed from: c0 */
    public void mo34536c0(@NotNull Buffer sink, long j2) throws EOFException {
        Intrinsics.m32179h(sink, "sink");
        long j3 = this.f68742c;
        if (j3 >= j2) {
            sink.write(this, j2);
        } else {
            sink.write(this, j3);
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: c1 */
    public void mo34537c1(long j2) throws EOFException {
        if (this.f68742c < j2) {
            throw new EOFException();
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    /* renamed from: d0 */
    public Buffer m34538d0(long j2) {
        Segment m34565u = m34565u(8);
        byte[] bArr = m34565u.f68793a;
        int i2 = m34565u.f68795c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        m34565u.f68795c = i9 + 1;
        this.f68742c += 8;
        return this;
    }

    @JvmName
    /* renamed from: e */
    public final byte m34539e(long j2) {
        Util.m34510b(this.f68742c, j2, 1L);
        Segment segment = this.f68741b;
        if (segment == null) {
            Intrinsics.m32176e(null);
            throw null;
        }
        long j3 = this.f68742c;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                segment = segment.f68799g;
                Intrinsics.m32176e(segment);
                j3 -= segment.f68795c - segment.f68794b;
            }
            return segment.f68793a[(int) ((segment.f68794b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = segment.f68795c;
            int i3 = segment.f68794b;
            long j5 = (i2 - i3) + j4;
            if (j5 > j2) {
                return segment.f68793a[(int) ((i3 + j2) - j4)];
            }
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
            j4 = j5;
        }
    }

    @Override // okio.BufferedSource
    /* renamed from: e0 */
    public long mo34540e0(@NotNull ByteString targetBytes) {
        Intrinsics.m32179h(targetBytes, "targetBytes");
        return m34547i(targetBytes, 0L);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            long j2 = this.f68742c;
            Buffer buffer = (Buffer) obj;
            if (j2 != buffer.f68742c) {
                return false;
            }
            if (j2 != 0) {
                Segment segment = this.f68741b;
                Intrinsics.m32176e(segment);
                Segment segment2 = buffer.f68741b;
                Intrinsics.m32176e(segment2);
                int i2 = segment.f68794b;
                int i3 = segment2.f68794b;
                long j3 = 0;
                while (j3 < this.f68742c) {
                    long min = Math.min(segment.f68795c - i2, segment2.f68795c - i3);
                    long j4 = 0;
                    while (j4 < min) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (segment.f68793a[i2] != segment2.f68793a[i3]) {
                            return false;
                        }
                        j4++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == segment.f68795c) {
                        segment = segment.f68798f;
                        Intrinsics.m32176e(segment);
                        i2 = segment.f68794b;
                    }
                    if (i3 == segment2.f68795c) {
                        segment2 = segment2.f68798f;
                        Intrinsics.m32176e(segment2);
                        i3 = segment2.f68794b;
                    }
                    j3 += min;
                }
            }
        }
        return true;
    }

    @Override // okio.BufferedSink
    /* renamed from: f0 */
    public BufferedSink mo34541f0() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g */
    public long m34542g(byte b, long j2, long j3) {
        Segment segment;
        long j4 = 0;
        if (!(0 <= j2 && j3 >= j2)) {
            StringBuilder m24u = C0000a.m24u("size=");
            m24u.append(this.f68742c);
            m24u.append(" fromIndex=");
            m24u.append(j2);
            m24u.append(" toIndex=");
            m24u.append(j3);
            throw new IllegalArgumentException(m24u.toString().toString());
        }
        long j5 = this.f68742c;
        if (j3 > j5) {
            j3 = j5;
        }
        if (j2 != j3 && (segment = this.f68741b) != null) {
            if (j5 - j2 < j2) {
                while (j5 > j2) {
                    segment = segment.f68799g;
                    Intrinsics.m32176e(segment);
                    j5 -= segment.f68795c - segment.f68794b;
                }
                while (j5 < j3) {
                    byte[] bArr = segment.f68793a;
                    int min = (int) Math.min(segment.f68795c, (segment.f68794b + j3) - j5);
                    for (int i2 = (int) ((segment.f68794b + j2) - j5); i2 < min; i2++) {
                        if (bArr[i2] == b) {
                            return (i2 - segment.f68794b) + j5;
                        }
                    }
                    j5 += segment.f68795c - segment.f68794b;
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j2 = j5;
                }
            } else {
                while (true) {
                    long j6 = (segment.f68795c - segment.f68794b) + j4;
                    if (j6 > j2) {
                        break;
                    }
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j4 = j6;
                }
                while (j4 < j3) {
                    byte[] bArr2 = segment.f68793a;
                    int min2 = (int) Math.min(segment.f68795c, (segment.f68794b + j3) - j4);
                    for (int i3 = (int) ((segment.f68794b + j2) - j4); i3 < min2; i3++) {
                        if (bArr2[i3] == b) {
                            return (i3 - segment.f68794b) + j4;
                        }
                    }
                    j4 += segment.f68795c - segment.f68794b;
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j2 = j4;
                }
            }
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[EDGE_INSN: B:46:0x00a7->B:40:0x00a7 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // okio.BufferedSource
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo34543g0() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f68742c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lb2
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        Lf:
            okio.Segment r8 = r0.f68741b
            kotlin.jvm.internal.Intrinsics.m32176e(r8)
            byte[] r9 = r8.f68793a
            int r10 = r8.f68794b
            int r11 = r8.f68795c
        L1a:
            if (r10 >= r11) goto L93
            r12 = r9[r10]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L68
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L68
            int r13 = r13 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L41
            if (r16 != 0) goto L3a
            long r14 = (long) r13
            int r16 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r16 >= 0) goto L3a
            goto L41
        L3a:
            r14 = 10
            long r3 = r3 * r14
            long r12 = (long) r13
            long r3 = r3 + r12
            goto L73
        L41:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r1.mo34544g1(r3)
            r1.m34524Q(r12)
            if (r6 != 0) goto L51
            r1.readByte()
        L51:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = p000a.C0000a.m24u(r3)
            java.lang.String r1 = r1.m34553m()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L68:
            r13 = 45
            byte r13 = (byte) r13
            if (r12 != r13) goto L78
            if (r5 != 0) goto L78
            r12 = 1
            long r1 = r1 - r12
            r6 = 1
        L73:
            int r10 = r10 + 1
            int r5 = r5 + 1
            goto L1a
        L78:
            if (r5 == 0) goto L7c
            r7 = 1
            goto L93
        L7c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = p000a.C0000a.m24u(r2)
            java.lang.String r3 = okio.Util.m34512d(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L93:
            if (r10 != r11) goto L9f
            okio.Segment r9 = r8.m34613a()
            r0.f68741b = r9
            okio.SegmentPool.m34617b(r8)
            goto La1
        L9f:
            r8.f68794b = r10
        La1:
            if (r7 != 0) goto La7
            okio.Segment r8 = r0.f68741b
            if (r8 != 0) goto Lf
        La7:
            long r1 = r0.f68742c
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.f68742c = r1
            if (r6 == 0) goto Lb0
            goto Lb1
        Lb0:
            long r3 = -r3
        Lb1:
            return r3
        Lb2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo34543g0():long");
    }

    /* renamed from: h */
    public long m34545h(@NotNull ByteString byteString, long j2) throws IOException {
        long j3 = j2;
        if (!(byteString.mo34576d() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("fromIndex < 0: ", j3).toString());
        }
        Segment segment = this.f68741b;
        if (segment != null) {
            long j5 = this.f68742c;
            if (j5 - j3 < j3) {
                while (j5 > j3) {
                    segment = segment.f68799g;
                    Intrinsics.m32176e(segment);
                    j5 -= segment.f68795c - segment.f68794b;
                }
                byte[] f68756d = byteString.getF68756d();
                byte b = f68756d[0];
                int mo34576d = byteString.mo34576d();
                long j6 = (this.f68742c - mo34576d) + 1;
                while (j5 < j6) {
                    byte[] bArr = segment.f68793a;
                    long j7 = j6;
                    int min = (int) Math.min(segment.f68795c, (segment.f68794b + j6) - j5);
                    for (int i2 = (int) ((segment.f68794b + j3) - j5); i2 < min; i2++) {
                        if (bArr[i2] == b && BufferKt.m34623a(segment, i2 + 1, f68756d, 1, mo34576d)) {
                            return (i2 - segment.f68794b) + j5;
                        }
                    }
                    j5 += segment.f68795c - segment.f68794b;
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j3 = j5;
                    j6 = j7;
                }
            } else {
                while (true) {
                    long j8 = (segment.f68795c - segment.f68794b) + j4;
                    if (j8 > j3) {
                        break;
                    }
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j4 = j8;
                }
                byte[] f68756d2 = byteString.getF68756d();
                byte b2 = f68756d2[0];
                int mo34576d2 = byteString.mo34576d();
                long j9 = (this.f68742c - mo34576d2) + 1;
                while (j4 < j9) {
                    byte[] bArr2 = segment.f68793a;
                    long j10 = j9;
                    int min2 = (int) Math.min(segment.f68795c, (segment.f68794b + j9) - j4);
                    for (int i3 = (int) ((segment.f68794b + j3) - j4); i3 < min2; i3++) {
                        if (bArr2[i3] == b2 && BufferKt.m34623a(segment, i3 + 1, f68756d2, 1, mo34576d2)) {
                            return (i3 - segment.f68794b) + j4;
                        }
                    }
                    j4 += segment.f68795c - segment.f68794b;
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j3 = j4;
                    j9 = j10;
                }
            }
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: h0 */
    public String mo34546h0(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("limit < 0: ", j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long m34542g = m34542g(b, 0L, j3);
        if (m34542g != -1) {
            return BufferKt.m34624b(this, m34542g);
        }
        if (j3 < this.f68742c && m34539e(j3 - 1) == ((byte) 13) && m34539e(j3) == b) {
            return BufferKt.m34624b(this, j3);
        }
        Buffer buffer = new Buffer();
        m34535c(buffer, 0L, Math.min(32, this.f68742c));
        StringBuilder m24u = C0000a.m24u("\\n not found: limit=");
        m24u.append(Math.min(this.f68742c, j2));
        m24u.append(" content=");
        m24u.append(buffer.mo34515B0().mo34577e());
        m24u.append((char) 8230);
        throw new EOFException(m24u.toString());
    }

    public int hashCode() {
        Segment segment = this.f68741b;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.f68795c;
            for (int i4 = segment.f68794b; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.f68793a[i4];
            }
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
        } while (segment != this.f68741b);
        return i2;
    }

    /* renamed from: i */
    public long m34547i(@NotNull ByteString byteString, long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j3 = j2;
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("fromIndex < 0: ", j3).toString());
        }
        Segment segment = this.f68741b;
        if (segment == null) {
            return -1L;
        }
        long j5 = this.f68742c;
        if (j5 - j3 < j3) {
            while (j5 > j3) {
                segment = segment.f68799g;
                Intrinsics.m32176e(segment);
                j5 -= segment.f68795c - segment.f68794b;
            }
            if (byteString.mo34576d() == 2) {
                byte mo34579h = byteString.mo34579h(0);
                byte mo34579h2 = byteString.mo34579h(1);
                while (j5 < this.f68742c) {
                    byte[] bArr = segment.f68793a;
                    i4 = (int) ((segment.f68794b + j3) - j5);
                    int i6 = segment.f68795c;
                    while (i4 < i6) {
                        byte b = bArr[i4];
                        if (b == mo34579h || b == mo34579h2) {
                            i5 = segment.f68794b;
                        } else {
                            i4++;
                        }
                    }
                    j5 += segment.f68795c - segment.f68794b;
                    segment = segment.f68798f;
                    Intrinsics.m32176e(segment);
                    j3 = j5;
                }
                return -1L;
            }
            byte[] f68756d = byteString.getF68756d();
            while (j5 < this.f68742c) {
                byte[] bArr2 = segment.f68793a;
                i4 = (int) ((segment.f68794b + j3) - j5);
                int i7 = segment.f68795c;
                while (i4 < i7) {
                    byte b2 = bArr2[i4];
                    for (byte b3 : f68756d) {
                        if (b2 == b3) {
                            i5 = segment.f68794b;
                        }
                    }
                    i4++;
                }
                j5 += segment.f68795c - segment.f68794b;
                segment = segment.f68798f;
                Intrinsics.m32176e(segment);
                j3 = j5;
            }
            return -1L;
            return (i4 - i5) + j5;
        }
        while (true) {
            long j6 = (segment.f68795c - segment.f68794b) + j4;
            if (j6 > j3) {
                break;
            }
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
            j4 = j6;
        }
        if (byteString.mo34576d() == 2) {
            byte mo34579h3 = byteString.mo34579h(0);
            byte mo34579h4 = byteString.mo34579h(1);
            while (j4 < this.f68742c) {
                byte[] bArr3 = segment.f68793a;
                i2 = (int) ((segment.f68794b + j3) - j4);
                int i8 = segment.f68795c;
                while (i2 < i8) {
                    byte b4 = bArr3[i2];
                    if (b4 == mo34579h3 || b4 == mo34579h4) {
                        i3 = segment.f68794b;
                    } else {
                        i2++;
                    }
                }
                j4 += segment.f68795c - segment.f68794b;
                segment = segment.f68798f;
                Intrinsics.m32176e(segment);
                j3 = j4;
            }
            return -1L;
        }
        byte[] f68756d2 = byteString.getF68756d();
        while (j4 < this.f68742c) {
            byte[] bArr4 = segment.f68793a;
            i2 = (int) ((segment.f68794b + j3) - j4);
            int i9 = segment.f68795c;
            while (i2 < i9) {
                byte b5 = bArr4[i2];
                for (byte b6 : f68756d2) {
                    if (b5 == b6) {
                        i3 = segment.f68794b;
                    }
                }
                i2++;
            }
            j4 += segment.f68795c - segment.f68794b;
            segment = segment.f68798f;
            Intrinsics.m32176e(segment);
            j3 = j4;
        }
        return -1L;
        return (i2 - i3) + j4;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: i1 */
    public OutputStream mo34548i1() {
        return new Buffer$outputStream$1(this);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @JvmOverloads
    @NotNull
    /* renamed from: j */
    public final UnsafeCursor m34549j(@NotNull UnsafeCursor unsafeCursor) {
        Intrinsics.m32179h(unsafeCursor, "unsafeCursor");
        if (!(unsafeCursor.f68743b == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursor.f68743b = this;
        unsafeCursor.f68744c = true;
        return unsafeCursor;
    }

    /* renamed from: k */
    public short m34550k() throws EOFException {
        int readShort = readShort() & 65535;
        return (short) (((readShort & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((65280 & readShort) >>> 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[EDGE_INSN: B:39:0x00a1->B:36:0x00a1 BREAK  A[LOOP:0: B:4:0x000b->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    @Override // okio.BufferedSource
    /* renamed from: k1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo34551k1() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f68742c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La8
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            okio.Segment r6 = r15.f68741b
            kotlin.jvm.internal.Intrinsics.m32176e(r6)
            byte[] r7 = r6.f68793a
            int r8 = r6.f68794b
            int r9 = r6.f68795c
        L16:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L40
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L32
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L32
            goto L3c
        L32:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L72
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L72
        L3c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L40:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L50
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L50:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r0.mo34514A0(r4)
            r0.m34524Q(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p000a.C0000a.m24u(r2)
            java.lang.String r0 = r0.m34553m()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L8d
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p000a.C0000a.m24u(r1)
            java.lang.String r2 = okio.Util.m34512d(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            okio.Segment r7 = r6.m34613a()
            r15.f68741b = r7
            okio.SegmentPool.m34617b(r6)
            goto L9b
        L99:
            r6.f68794b = r8
        L9b:
            if (r1 != 0) goto La1
            okio.Segment r6 = r15.f68741b
            if (r6 != 0) goto Lb
        La1:
            long r1 = r15.f68742c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f68742c = r1
            return r4
        La8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo34551k1():long");
    }

    @NotNull
    /* renamed from: l */
    public String m34552l(long j2, @NotNull Charset charset) throws EOFException {
        Intrinsics.m32179h(charset, "charset");
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount: ", j2).toString());
        }
        if (this.f68742c < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68794b;
        if (i2 + j2 > segment.f68795c) {
            return new String(mo34523P0(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(segment.f68793a, i2, i3, charset);
        int i4 = segment.f68794b + i3;
        segment.f68794b = i4;
        this.f68742c -= j2;
        if (i4 == segment.f68795c) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        }
        return str;
    }

    @NotNull
    /* renamed from: m */
    public String m34553m() {
        return m34552l(this.f68742c, Charsets.f66855b);
    }

    @Override // okio.BufferedSource
    /* renamed from: m1 */
    public int mo34554m1(@NotNull Options options) {
        Intrinsics.m32179h(options, "options");
        int m34625c = BufferKt.m34625c(this, options, false);
        if (m34625c == -1) {
            return -1;
        }
        skip(options.f68775c[m34625c].mo34576d());
        return m34625c;
    }

    @NotNull
    /* renamed from: n */
    public String m34555n(long j2) throws EOFException {
        return m34552l(j2, Charsets.f66855b);
    }

    @NotNull
    /* renamed from: n0 */
    public Buffer m34556n0(int i2) {
        Segment m34565u = m34565u(2);
        byte[] bArr = m34565u.f68793a;
        int i3 = m34565u.f68795c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i4] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        m34565u.f68795c = i4 + 1;
        this.f68742c += 2;
        return this;
    }

    /* renamed from: o */
    public int m34557o() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (this.f68742c == 0) {
            throw new EOFException();
        }
        byte m34539e = m34539e(0L);
        if ((m34539e & 128) == 0) {
            i2 = m34539e & Byte.MAX_VALUE;
            i3 = 1;
            i4 = 0;
        } else if ((m34539e & 224) == 192) {
            i2 = m34539e & 31;
            i3 = 2;
            i4 = 128;
        } else if ((m34539e & 240) == 224) {
            i2 = m34539e & 15;
            i3 = 3;
            i4 = RecyclerView.ViewHolder.FLAG_MOVED;
        } else {
            if ((m34539e & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i2 = m34539e & 7;
            i3 = 4;
            i4 = TextBuffer.MAX_SEGMENT_LEN;
        }
        long j2 = i3;
        if (this.f68742c < j2) {
            StringBuilder m25v = C0000a.m25v("size < ", i3, ": ");
            m25v.append(this.f68742c);
            m25v.append(" (to read code point prefixed 0x");
            m25v.append(Util.m34512d(m34539e));
            m25v.append(')');
            throw new EOFException(m25v.toString());
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte m34539e2 = m34539e(j3);
            if ((m34539e2 & 192) != 128) {
                skip(j3);
                return 65533;
            }
            i2 = (i2 << 6) | (m34539e2 & 63);
        }
        skip(j2);
        if (i2 > 1114111) {
            return 65533;
        }
        if ((55296 <= i2 && 57343 >= i2) || i2 < i4) {
            return 65533;
        }
        return i2;
    }

    @NotNull
    /* renamed from: p */
    public final ByteString m34558p() {
        long j2 = this.f68742c;
        if (j2 <= ((long) Integer.MAX_VALUE)) {
            return m34560q((int) j2);
        }
        StringBuilder m24u = C0000a.m24u("size > Int.MAX_VALUE: ");
        m24u.append(this.f68742c);
        throw new IllegalStateException(m24u.toString().toString());
    }

    @Override // okio.BufferedSink
    /* renamed from: p0 */
    public /* bridge */ /* synthetic */ BufferedSink mo34559p0(String str) {
        m34516D0(str);
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.m34602d(new PeekSource(this));
    }

    @NotNull
    /* renamed from: q */
    public final ByteString m34560q(int i2) {
        if (i2 == 0) {
            return ByteString.f68752e;
        }
        Util.m34510b(this.f68742c, 0L, i2);
        Segment segment = this.f68741b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Intrinsics.m32176e(segment);
            int i6 = segment.f68795c;
            int i7 = segment.f68794b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            segment = segment.f68798f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        Segment segment2 = this.f68741b;
        int i8 = 0;
        while (i3 < i2) {
            Intrinsics.m32176e(segment2);
            bArr[i8] = segment2.f68793a;
            i3 += segment2.f68795c - segment2.f68794b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.f68794b;
            segment2.f68796d = true;
            i8++;
            segment2 = segment2.f68798f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSource
    /* renamed from: r0 */
    public boolean mo34561r0(long j2, @NotNull ByteString bytes) {
        Intrinsics.m32179h(bytes, "bytes");
        int mo34576d = bytes.mo34576d();
        if (j2 < 0 || mo34576d < 0 || this.f68742c - j2 < mo34576d || bytes.mo34576d() - 0 < mo34576d) {
            return false;
        }
        for (int i2 = 0; i2 < mo34576d; i2++) {
            if (m34539e(i2 + j2) != bytes.mo34579h(0 + i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j2) {
        Intrinsics.m32179h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m11h("byteCount < 0: ", j2).toString());
        }
        long j3 = this.f68742c;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.write(this, j2);
        return j2;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (this.f68742c == 0) {
            throw new EOFException();
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68794b;
        int i3 = segment.f68795c;
        int i4 = i2 + 1;
        byte b = segment.f68793a[i2];
        this.f68742c--;
        if (i4 == i3) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        } else {
            segment.f68794b = i4;
        }
        return b;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (this.f68742c < 4) {
            throw new EOFException();
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68794b;
        int i3 = segment.f68795c;
        if (i3 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.f68793a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        this.f68742c -= 4;
        if (i9 == i3) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        } else {
            segment.f68794b = i9;
        }
        return i10;
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (this.f68742c < 8) {
            throw new EOFException();
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68794b;
        int i3 = segment.f68795c;
        if (i3 - i2 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.f68793a;
        long j2 = (bArr[i2] & 255) << 56;
        long j3 = j2 | ((bArr[r6] & 255) << 48);
        long j4 = j3 | ((bArr[r1] & 255) << 40);
        int i4 = i2 + 1 + 1 + 1 + 1;
        long j5 = ((bArr[r6] & 255) << 32) | j4;
        long j6 = j5 | ((bArr[i4] & 255) << 24);
        long j7 = j6 | ((bArr[r8] & 255) << 16);
        long j8 = j7 | ((bArr[r1] & 255) << 8);
        int i5 = i4 + 1 + 1 + 1 + 1;
        long j9 = j8 | (bArr[r8] & 255);
        this.f68742c -= 8;
        if (i5 == i3) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        } else {
            segment.f68794b = i5;
        }
        return j9;
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (this.f68742c < 2) {
            throw new EOFException();
        }
        Segment segment = this.f68741b;
        Intrinsics.m32176e(segment);
        int i2 = segment.f68794b;
        int i3 = segment.f68795c;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = segment.f68793a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        this.f68742c -= 2;
        if (i5 == i3) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        } else {
            segment.f68794b = i5;
        }
        return (short) i6;
    }

    @Override // okio.BufferedSource
    public boolean request(long j2) {
        return this.f68742c >= j2;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* renamed from: s */
    public Buffer mo34562s() {
        return this;
    }

    @NotNull
    /* renamed from: s0 */
    public Buffer m34563s0(@NotNull String str, int i2, int i3, @NotNull Charset charset) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("beginIndex < 0: ", i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(C0000a.m9f("endIndex < beginIndex: ", i3, " < ", i2).toString());
        }
        if (!(i3 <= str.length())) {
            StringBuilder m25v = C0000a.m25v("endIndex > string.length: ", i3, " > ");
            m25v.append(str.length());
            throw new IllegalArgumentException(m25v.toString().toString());
        }
        if (Intrinsics.m32174c(charset, Charsets.f66855b)) {
            m34522O0(str, i2, i3);
            return this;
        }
        String substring = str.substring(i2, i3);
        Intrinsics.m32178g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
        m34521N(bytes, 0, bytes.length);
        return this;
    }

    @Override // okio.BufferedSource
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            Segment segment = this.f68741b;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, segment.f68795c - segment.f68794b);
            long j3 = min;
            this.f68742c -= j3;
            j2 -= j3;
            int i2 = segment.f68794b + min;
            segment.f68794b = i2;
            if (i2 == segment.f68795c) {
                this.f68741b = segment.m34613a();
                SegmentPool.m34617b(segment);
            }
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: t0 */
    public String mo34564t0(@NotNull Charset charset) {
        Intrinsics.m32179h(charset, "charset");
        return m34552l(this.f68742c, charset);
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return m34558p().toString();
    }

    @NotNull
    /* renamed from: u */
    public final Segment m34565u(int i2) {
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.f68741b;
        if (segment == null) {
            Segment m34618c = SegmentPool.m34618c();
            this.f68741b = m34618c;
            m34618c.f68799g = m34618c;
            m34618c.f68798f = m34618c;
            return m34618c;
        }
        Intrinsics.m32176e(segment);
        Segment segment2 = segment.f68799g;
        Intrinsics.m32176e(segment2);
        if (segment2.f68795c + i2 <= 8192 && segment2.f68797e) {
            return segment2;
        }
        Segment m34618c2 = SegmentPool.m34618c();
        segment2.m34614b(m34618c2);
        return m34618c2;
    }

    @NotNull
    /* renamed from: v */
    public Buffer m34566v(@NotNull ByteString byteString) {
        Intrinsics.m32179h(byteString, "byteString");
        byteString.mo34587q(this, 0, byteString.mo34576d());
        return this;
    }

    @NotNull
    /* renamed from: w */
    public Buffer m34567w(@NotNull byte[] source) {
        Intrinsics.m32179h(source, "source");
        m34521N(source, 0, source.length);
        return this;
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        m34567w(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ BufferedSink writeByte(int i2) {
        m34524Q(i2);
        return this;
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ BufferedSink writeInt(int i2) {
        m34532Z(i2);
        return this;
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ BufferedSink writeShort(int i2) {
        m34556n0(i2);
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    /* renamed from: x */
    public InputStream mo34568x() {
        return new Buffer$inputStream$1(this);
    }

    @Override // okio.BufferedSink
    /* renamed from: z0 */
    public long mo34569z0(@NotNull Source source) throws IOException {
        Intrinsics.m32179h(source, "source");
        long j2 = 0;
        while (true) {
            long read = source.read(this, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i2, int i3) {
        m34521N(bArr, i2, i3);
        return this;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j2) {
        int i2;
        Segment segment;
        Segment m34618c;
        Intrinsics.m32179h(source, "source");
        if (source != this) {
            Util.m34510b(source.f68742c, 0L, j2);
            long j3 = j2;
            while (j3 > 0) {
                Segment segment2 = source.f68741b;
                Intrinsics.m32176e(segment2);
                int i3 = segment2.f68795c;
                Intrinsics.m32176e(source.f68741b);
                if (j3 < i3 - r7.f68794b) {
                    Segment segment3 = this.f68741b;
                    if (segment3 != null) {
                        Intrinsics.m32176e(segment3);
                        segment = segment3.f68799g;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.f68797e) {
                        if ((segment.f68795c + j3) - (segment.f68796d ? 0 : segment.f68794b) <= RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) {
                            Segment segment4 = source.f68741b;
                            Intrinsics.m32176e(segment4);
                            segment4.m34616d(segment, (int) j3);
                            source.f68742c -= j3;
                            this.f68742c += j3;
                            return;
                        }
                    }
                    Segment segment5 = source.f68741b;
                    Intrinsics.m32176e(segment5);
                    int i4 = (int) j3;
                    if (i4 > 0 && i4 <= segment5.f68795c - segment5.f68794b) {
                        if (i4 >= 1024) {
                            m34618c = segment5.m34615c();
                        } else {
                            m34618c = SegmentPool.m34618c();
                            byte[] bArr = segment5.f68793a;
                            byte[] bArr2 = m34618c.f68793a;
                            int i5 = segment5.f68794b;
                            ArraysKt.m31969s(bArr, bArr2, 0, i5, i5 + i4, 2, null);
                        }
                        m34618c.f68795c = m34618c.f68794b + i4;
                        segment5.f68794b += i4;
                        Segment segment6 = segment5.f68799g;
                        Intrinsics.m32176e(segment6);
                        segment6.m34614b(m34618c);
                        source.f68741b = m34618c;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                Segment segment7 = source.f68741b;
                Intrinsics.m32176e(segment7);
                long j4 = segment7.f68795c - segment7.f68794b;
                source.f68741b = segment7.m34613a();
                Segment segment8 = this.f68741b;
                if (segment8 == null) {
                    this.f68741b = segment7;
                    segment7.f68799g = segment7;
                    segment7.f68798f = segment7;
                } else {
                    Intrinsics.m32176e(segment8);
                    Segment segment9 = segment8.f68799g;
                    Intrinsics.m32176e(segment9);
                    segment9.m34614b(segment7);
                    Segment segment10 = segment7.f68799g;
                    if (segment10 != segment7) {
                        Intrinsics.m32176e(segment10);
                        if (segment10.f68797e) {
                            int i6 = segment7.f68795c - segment7.f68794b;
                            Segment segment11 = segment7.f68799g;
                            Intrinsics.m32176e(segment11);
                            int i7 = RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST - segment11.f68795c;
                            Segment segment12 = segment7.f68799g;
                            Intrinsics.m32176e(segment12);
                            if (segment12.f68796d) {
                                i2 = 0;
                            } else {
                                Segment segment13 = segment7.f68799g;
                                Intrinsics.m32176e(segment13);
                                i2 = segment13.f68794b;
                            }
                            if (i6 <= i7 + i2) {
                                Segment segment14 = segment7.f68799g;
                                Intrinsics.m32176e(segment14);
                                segment7.m34616d(segment14, i6);
                                segment7.m34613a();
                                SegmentPool.m34617b(segment7);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f68742c -= j4;
                this.f68742c += j4;
                j3 -= j4;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.m32179h(sink, "sink");
        Segment segment = this.f68741b;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), segment.f68795c - segment.f68794b);
        sink.put(segment.f68793a, segment.f68794b, min);
        int i2 = segment.f68794b + min;
        segment.f68794b = i2;
        this.f68742c -= min;
        if (i2 == segment.f68795c) {
            this.f68741b = segment.m34613a();
            SegmentPool.m34617b(segment);
        }
        return min;
    }

    public int read(@NotNull byte[] sink, int i2, int i3) {
        Intrinsics.m32179h(sink, "sink");
        Util.m34510b(sink.length, i2, i3);
        Segment segment = this.f68741b;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i3, segment.f68795c - segment.f68794b);
        byte[] bArr = segment.f68793a;
        int i4 = segment.f68794b;
        ArraysKt.m31967q(bArr, sink, i2, i4, i4 + min);
        int i5 = segment.f68794b + min;
        segment.f68794b = i5;
        this.f68742c -= min;
        if (i5 != segment.f68795c) {
            return min;
        }
        this.f68741b = segment.m34613a();
        SegmentPool.m34617b(segment);
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.m32179h(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            Segment m34565u = m34565u(1);
            int min = Math.min(i2, 8192 - m34565u.f68795c);
            source.get(m34565u.f68793a, m34565u.f68795c, min);
            i2 -= min;
            m34565u.f68795c += min;
        }
        this.f68742c += remaining;
        return remaining;
    }
}
