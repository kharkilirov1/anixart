package com.google.protobuf;

import com.google.firebase.auth.C2052a;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a */
    public int f23972a;

    /* renamed from: com.google.protobuf.BinaryWriter$1 */
    public static /* synthetic */ class C23451 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23973a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23973a = iArr;
            try {
                iArr[WireFormat.FieldType.f24408k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23973a[WireFormat.FieldType.f24407j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23973a[WireFormat.FieldType.f24406i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23973a[WireFormat.FieldType.f24405h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23973a[WireFormat.FieldType.f24403f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23973a[WireFormat.FieldType.f24415r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23973a[WireFormat.FieldType.f24416s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23973a[WireFormat.FieldType.f24417t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23973a[WireFormat.FieldType.f24418u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23973a[WireFormat.FieldType.f24409l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23973a[WireFormat.FieldType.f24413p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23973a[WireFormat.FieldType.f24404g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23973a[WireFormat.FieldType.f24402e.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23973a[WireFormat.FieldType.f24401d.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23973a[WireFormat.FieldType.f24411n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23973a[WireFormat.FieldType.f24412o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23973a[WireFormat.FieldType.f24414q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {

        /* renamed from: b */
        public int f23974b;

        @Override // com.google.protobuf.Writer
        /* renamed from: G */
        public void mo13120G(int i2, long j2) {
            mo13096U(15);
            mo13104b0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: I */
        public void mo13121I(int i2) {
            mo13107d0((i2 << 3) | 4);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: O */
        public void mo13122O(int i2, int i3) {
            mo13096U(10);
            mo13102a0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f23974b;
            if (i2 + 1 >= remaining) {
                this.f23974b = i2 - remaining;
                throw null;
            }
            this.f23972a += remaining;
            AllocatedBuffer.m12990a(byteBuffer);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) {
            int i4 = this.f23974b;
            if (i4 + 1 >= i3) {
                this.f23974b = i4 - i3;
                throw null;
            }
            this.f23972a += i3;
            AllocatedBuffer.m12991b(bArr, i2, i3);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: T */
        public int mo13095T() {
            return this.f23972a + (0 - this.f23974b);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: U */
        public void mo13096U(int i2) {
            if (this.f23974b + 1 >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: V */
        public void mo13097V(boolean z) {
            this.f23974b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: W */
        public void mo13098W(int i2) {
            this.f23974b -= 4;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: X */
        public void mo13099X(long j2) {
            this.f23974b -= 8;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: Y */
        public void mo13100Y(int i2) {
            if (i2 >= 0) {
                mo13107d0(i2);
            } else {
                mo13109e0(i2);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: a0 */
        public void mo13102a0(int i2) {
            mo13107d0(CodedOutputStream.m13279u0(i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: b0 */
        public void mo13104b0(long j2) {
            mo13109e0(CodedOutputStream.m13280v0(j2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: c0 */
        public void mo13106c0(int i2, int i3) {
            mo13107d0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: d */
        public void mo13125d(int i2, int i3) {
            mo13096U(10);
            mo13107d0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: d0 */
        public void mo13107d0(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f23974b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                this.f23974b -= 2;
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                this.f23974b -= 3;
                throw null;
            }
            if ((i2 & (-268435456)) == 0) {
                this.f23974b -= 4;
                throw null;
            }
            this.f23974b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: e0 */
        public void mo13109e0(long j2) {
            switch (BinaryWriter.m13080S(j2)) {
                case 1:
                    this.f23974b--;
                    throw null;
                case 2:
                    m13129h0((int) j2);
                    throw null;
                case 3:
                    m13128g0((int) j2);
                    throw null;
                case 4:
                    m13127f0((int) j2);
                    throw null;
                case 5:
                    this.f23974b -= 5;
                    throw null;
                case 6:
                    this.f23974b -= 6;
                    throw null;
                case 7:
                    this.f23974b -= 7;
                    throw null;
                case 8:
                    this.f23974b -= 8;
                    throw null;
                case 9:
                    this.f23974b--;
                    throw null;
                case 10:
                    this.f23974b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: f */
        public void mo13126f(int i2, int i3) {
            mo13096U(9);
            this.f23974b -= 4;
            throw null;
        }

        /* renamed from: f0 */
        public final void m13127f0(int i2) {
            this.f23974b -= 4;
            throw null;
        }

        /* renamed from: g0 */
        public final void m13128g0(int i2) {
            this.f23974b -= 3;
            throw null;
        }

        /* renamed from: h0 */
        public final void m13129h0(int i2) {
            this.f23974b -= 2;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: j */
        public void mo13130j(int i2, Object obj, Schema schema) throws IOException {
            int mo13095T = mo13095T();
            schema.mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: k */
        public void mo13131k(int i2, long j2) {
            mo13096U(13);
            this.f23974b -= 8;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: n */
        public void mo13132n(int i2, String str) {
            int i3;
            int i4;
            int i5;
            int mo13095T = mo13095T();
            mo13096U(str.length());
            int length = str.length() - 1;
            this.f23974b -= length;
            if (length >= 0 && str.charAt(length) < 128) {
                throw null;
            }
            if (length == -1) {
                this.f23974b--;
            } else {
                this.f23974b += length;
                while (length >= 0) {
                    char charAt = str.charAt(length);
                    if (charAt < 128 && (i5 = this.f23974b) >= 0) {
                        this.f23974b = i5 - 1;
                        throw null;
                    }
                    if (charAt < 2048 && (i4 = this.f23974b) > 0) {
                        this.f23974b = i4 - 1;
                        throw null;
                    }
                    if ((charAt < 55296 || 57343 < charAt) && (i3 = this.f23974b) > 1) {
                        this.f23974b = i3 - 1;
                        throw null;
                    }
                    if (this.f23974b > 2) {
                        if (length != 0) {
                            char charAt2 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt2, charAt)) {
                                Character.toCodePoint(charAt2, charAt);
                                this.f23974b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo13096U(length);
                    length = (length + 1) - 1;
                }
            }
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: o */
        public void mo13133o(int i2, long j2) {
            mo13096U(15);
            mo13109e0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: p */
        public void mo13134p(int i2, Object obj) throws IOException {
            int mo13095T = mo13095T();
            Protobuf.f24310c.m13568b(obj).mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: s */
        public void mo13135s(int i2, boolean z) {
            mo13096U(6);
            this.f23974b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: t */
        public void mo13136t(int i2, Object obj, Schema schema) throws IOException {
            int i3 = i2 << 3;
            mo13107d0(i3 | 4);
            schema.mo13537b(obj, this);
            mo13107d0(i3 | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: v */
        public void mo13137v(int i2) {
            mo13107d0((i2 << 3) | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: w */
        public void mo13138w(int i2, ByteString byteString) {
            try {
                byteString.mo13157G(this);
                mo13096U(10);
                mo13107d0(byteString.size());
                mo13107d0((i2 << 3) | 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: x */
        public void mo13139x(int i2, int i3) {
            mo13096U(15);
            if (i3 >= 0) {
                mo13107d0(i3);
            } else {
                mo13109e0(i3);
            }
            mo13107d0((i2 << 3) | 0);
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {

        /* renamed from: b */
        public int f23975b;

        @Override // com.google.protobuf.Writer
        /* renamed from: G */
        public void mo13120G(int i2, long j2) throws IOException {
            mo13096U(15);
            mo13104b0(j2);
            mo13107d0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: I */
        public void mo13121I(int i2) {
            mo13107d0((i2 << 3) | 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: O */
        public void mo13122O(int i2, int i3) throws IOException {
            mo13096U(10);
            mo13102a0(i3);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f23975b;
            if (i2 + 0 < remaining) {
                this.f23972a += remaining;
                AllocatedBuffer.m12990a(byteBuffer);
                throw null;
            }
            int i3 = i2 - remaining;
            this.f23975b = i3;
            byteBuffer.get(null, i3 + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) {
            int i4 = this.f23975b;
            if (i4 + 0 < i3) {
                this.f23972a += i3;
                AllocatedBuffer.m12991b(bArr, i2, i3);
                throw null;
            }
            int i5 = i4 - i3;
            this.f23975b = i5;
            System.arraycopy(bArr, i2, null, i5 + 1, i3);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: T */
        public int mo13095T() {
            return this.f23972a + (0 - this.f23975b);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: U */
        public void mo13096U(int i2) {
            if (this.f23975b + 0 >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: V */
        public void mo13097V(boolean z) {
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: W */
        public void mo13098W(int i2) {
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: X */
        public void mo13099X(long j2) {
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: Y */
        public void mo13100Y(int i2) {
            if (i2 < 0) {
                mo13109e0(i2);
            } else {
                mo13107d0(i2);
                throw null;
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: a0 */
        public void mo13102a0(int i2) {
            mo13107d0(CodedOutputStream.m13279u0(i2));
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: b0 */
        public void mo13104b0(long j2) {
            mo13109e0(CodedOutputStream.m13280v0(j2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: c0 */
        public void mo13106c0(int i2, int i3) {
            mo13107d0((i2 << 3) | i3);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: d */
        public void mo13125d(int i2, int i3) throws IOException {
            mo13096U(10);
            mo13107d0(i3);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: d0 */
        public void mo13107d0(int i2) {
            if ((i2 & (-128)) == 0) {
                this.f23975b--;
                throw null;
            }
            if ((i2 & (-16384)) == 0) {
                this.f23975b--;
                throw null;
            }
            if (((-2097152) & i2) == 0) {
                this.f23975b--;
                throw null;
            }
            if ((i2 & (-268435456)) == 0) {
                this.f23975b--;
                throw null;
            }
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: e0 */
        public void mo13109e0(long j2) {
            switch (BinaryWriter.m13080S(j2)) {
                case 1:
                    this.f23975b--;
                    throw null;
                case 2:
                    this.f23975b--;
                    throw null;
                case 3:
                    this.f23975b--;
                    throw null;
                case 4:
                    this.f23975b--;
                    throw null;
                case 5:
                    this.f23975b--;
                    throw null;
                case 6:
                    this.f23975b--;
                    throw null;
                case 7:
                    this.f23975b--;
                    throw null;
                case 8:
                    this.f23975b--;
                    throw null;
                case 9:
                    this.f23975b--;
                    throw null;
                case 10:
                    this.f23975b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: f */
        public void mo13126f(int i2, int i3) throws IOException {
            mo13096U(9);
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: j */
        public void mo13130j(int i2, Object obj, Schema schema) throws IOException {
            int mo13095T = mo13095T();
            schema.mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: k */
        public void mo13131k(int i2, long j2) throws IOException {
            mo13096U(13);
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: n */
        public void mo13132n(int i2, String str) throws IOException {
            int i3;
            int i4;
            int i5;
            int mo13095T = mo13095T();
            mo13096U(str.length());
            int length = str.length() - 1;
            this.f23975b -= length;
            if (length >= 0 && str.charAt(length) < 128) {
                throw null;
            }
            if (length != -1) {
                this.f23975b += length;
                while (length >= 0) {
                    char charAt = str.charAt(length);
                    if (charAt < 128 && (i5 = this.f23975b) > 0) {
                        this.f23975b = i5 - 1;
                        throw null;
                    }
                    if (charAt < 2048 && (i4 = this.f23975b) > 0) {
                        this.f23975b = i4 - 1;
                        throw null;
                    }
                    if ((charAt < 55296 || 57343 < charAt) && (i3 = this.f23975b) > 1) {
                        this.f23975b = i3 - 1;
                        throw null;
                    }
                    if (this.f23975b > 2) {
                        if (length != 0) {
                            char charAt2 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt2, charAt)) {
                                Character.toCodePoint(charAt2, charAt);
                                this.f23975b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo13096U(length);
                    length = (length + 1) - 1;
                }
            } else {
                this.f23975b--;
            }
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: o */
        public void mo13133o(int i2, long j2) throws IOException {
            mo13096U(15);
            mo13109e0(j2);
            mo13107d0((i2 << 3) | 0);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: p */
        public void mo13134p(int i2, Object obj) throws IOException {
            int mo13095T = mo13095T();
            Protobuf.f24310c.m13568b(obj).mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: s */
        public void mo13135s(int i2, boolean z) throws IOException {
            mo13096U(6);
            this.f23975b--;
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: t */
        public void mo13136t(int i2, Object obj, Schema schema) throws IOException {
            mo13107d0((i2 << 3) | 4);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: v */
        public void mo13137v(int i2) {
            mo13107d0((i2 << 3) | 3);
            throw null;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: w */
        public void mo13138w(int i2, ByteString byteString) throws IOException {
            try {
                byteString.mo13157G(this);
                mo13096U(10);
                mo13107d0(byteString.size());
                throw null;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: x */
        public void mo13139x(int i2, int i3) throws IOException {
            mo13096U(15);
            if (i3 >= 0) {
                mo13107d0(i3);
                throw null;
            }
            mo13109e0(i3);
            mo13107d0((i2 << 3) | 0);
            throw null;
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* renamed from: b */
        public long f23976b;

        @Override // com.google.protobuf.Writer
        /* renamed from: G */
        public void mo13120G(int i2, long j2) {
            mo13096U(15);
            mo13104b0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: I */
        public void mo13121I(int i2) {
            mo13107d0((i2 << 3) | 4);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: O */
        public void mo13122O(int i2, int i3) {
            mo13096U(10);
            mo13102a0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (m13141g0() >= remaining) {
                this.f23976b -= remaining;
                throw null;
            }
            this.f23972a += remaining;
            AllocatedBuffer.m12990a(byteBuffer);
            throw null;
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) {
            if (m13141g0() >= i3) {
                this.f23976b -= i3;
                throw null;
            }
            this.f23972a += i3;
            AllocatedBuffer.m12991b(bArr, i2, i3);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: T */
        public int mo13095T() {
            return this.f23972a + ((int) (0 - this.f23976b));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: U */
        public void mo13096U(int i2) {
            if (m13141g0() >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: V */
        public void mo13097V(boolean z) {
            byte b = z ? (byte) 1 : (byte) 0;
            long j2 = this.f23976b;
            this.f23976b = j2 - 1;
            UnsafeUtil.f24390e.mo13710p(j2, b);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: W */
        public void mo13098W(int i2) {
            long j2 = this.f23976b;
            this.f23976b = j2 - 1;
            byte b = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24390e;
            memoryAccessor.mo13710p(j2, b);
            long j3 = this.f23976b;
            this.f23976b = j3 - 1;
            memoryAccessor.mo13710p(j3, (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j4 = this.f23976b;
            this.f23976b = j4 - 1;
            memoryAccessor.mo13710p(j4, (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j5 = this.f23976b;
            this.f23976b = j5 - 1;
            memoryAccessor.mo13710p(j5, (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: X */
        public void mo13099X(long j2) {
            long j3 = this.f23976b;
            this.f23976b = j3 - 1;
            byte b = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24390e;
            memoryAccessor.mo13710p(j3, b);
            long j4 = this.f23976b;
            this.f23976b = j4 - 1;
            memoryAccessor.mo13710p(j4, (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j5 = this.f23976b;
            this.f23976b = j5 - 1;
            memoryAccessor.mo13710p(j5, (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j6 = this.f23976b;
            this.f23976b = j6 - 1;
            memoryAccessor.mo13710p(j6, (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j7 = this.f23976b;
            this.f23976b = j7 - 1;
            memoryAccessor.mo13710p(j7, (byte) (((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j8 = this.f23976b;
            this.f23976b = j8 - 1;
            memoryAccessor.mo13710p(j8, (byte) (((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j9 = this.f23976b;
            this.f23976b = j9 - 1;
            memoryAccessor.mo13710p(j9, (byte) (((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j10 = this.f23976b;
            this.f23976b = j10 - 1;
            memoryAccessor.mo13710p(j10, (byte) (((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: Y */
        public void mo13100Y(int i2) {
            if (i2 >= 0) {
                mo13107d0(i2);
            } else {
                mo13109e0(i2);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: a0 */
        public void mo13102a0(int i2) {
            mo13107d0(CodedOutputStream.m13279u0(i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: b0 */
        public void mo13104b0(long j2) {
            mo13109e0(CodedOutputStream.m13280v0(j2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: c0 */
        public void mo13106c0(int i2, int i3) {
            mo13107d0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: d */
        public void mo13125d(int i2, int i3) {
            mo13096U(10);
            mo13107d0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: d0 */
        public void mo13107d0(int i2) {
            if ((i2 & (-128)) == 0) {
                long j2 = this.f23976b;
                this.f23976b = j2 - 1;
                UnsafeUtil.f24390e.mo13710p(j2, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j3 = this.f23976b;
                this.f23976b = j3 - 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24390e;
                memoryAccessor.mo13710p(j3, (byte) (i2 >>> 7));
                long j4 = this.f23976b;
                this.f23976b = j4 - 1;
                memoryAccessor.mo13710p(j4, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j5 = this.f23976b;
                this.f23976b = j5 - 1;
                UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f24390e;
                memoryAccessor2.mo13710p(j5, (byte) (i2 >>> 14));
                long j6 = this.f23976b;
                this.f23976b = j6 - 1;
                memoryAccessor2.mo13710p(j6, (byte) (((i2 >>> 7) & 127) | 128));
                long j7 = this.f23976b;
                this.f23976b = j7 - 1;
                memoryAccessor2.mo13710p(j7, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j8 = this.f23976b;
                this.f23976b = j8 - 1;
                UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f24390e;
                memoryAccessor3.mo13710p(j8, (byte) (i2 >>> 21));
                long j9 = this.f23976b;
                this.f23976b = j9 - 1;
                memoryAccessor3.mo13710p(j9, (byte) (((i2 >>> 14) & 127) | 128));
                long j10 = this.f23976b;
                this.f23976b = j10 - 1;
                memoryAccessor3.mo13710p(j10, (byte) (((i2 >>> 7) & 127) | 128));
                long j11 = this.f23976b;
                this.f23976b = j11 - 1;
                memoryAccessor3.mo13710p(j11, (byte) ((i2 & 127) | 128));
                return;
            }
            long j12 = this.f23976b;
            this.f23976b = j12 - 1;
            UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f24390e;
            memoryAccessor4.mo13710p(j12, (byte) (i2 >>> 28));
            long j13 = this.f23976b;
            this.f23976b = j13 - 1;
            memoryAccessor4.mo13710p(j13, (byte) (((i2 >>> 21) & 127) | 128));
            long j14 = this.f23976b;
            this.f23976b = j14 - 1;
            memoryAccessor4.mo13710p(j14, (byte) (((i2 >>> 14) & 127) | 128));
            long j15 = this.f23976b;
            this.f23976b = j15 - 1;
            memoryAccessor4.mo13710p(j15, (byte) (((i2 >>> 7) & 127) | 128));
            long j16 = this.f23976b;
            this.f23976b = j16 - 1;
            memoryAccessor4.mo13710p(j16, (byte) ((i2 & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: e0 */
        public void mo13109e0(long j2) {
            switch (BinaryWriter.m13080S(j2)) {
                case 1:
                    long j3 = this.f23976b;
                    this.f23976b = j3 - 1;
                    UnsafeUtil.f24390e.mo13710p(j3, (byte) j2);
                    break;
                case 2:
                    long j4 = this.f23976b;
                    this.f23976b = j4 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24390e;
                    memoryAccessor.mo13710p(j4, (byte) (j2 >>> 7));
                    long j5 = this.f23976b;
                    this.f23976b = j5 - 1;
                    memoryAccessor.mo13710p(j5, (byte) ((((int) j2) & 127) | 128));
                    break;
                case 3:
                    long j6 = this.f23976b;
                    this.f23976b = j6 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f24390e;
                    memoryAccessor2.mo13710p(j6, (byte) (((int) j2) >>> 14));
                    long j7 = this.f23976b;
                    this.f23976b = j7 - 1;
                    memoryAccessor2.mo13710p(j7, (byte) (((j2 >>> 7) & 127) | 128));
                    long j8 = this.f23976b;
                    this.f23976b = j8 - 1;
                    memoryAccessor2.mo13710p(j8, (byte) ((j2 & 127) | 128));
                    break;
                case 4:
                    long j9 = this.f23976b;
                    this.f23976b = j9 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f24390e;
                    memoryAccessor3.mo13710p(j9, (byte) (j2 >>> 21));
                    long j10 = this.f23976b;
                    this.f23976b = j10 - 1;
                    memoryAccessor3.mo13710p(j10, (byte) (((j2 >>> 14) & 127) | 128));
                    long j11 = this.f23976b;
                    this.f23976b = j11 - 1;
                    memoryAccessor3.mo13710p(j11, (byte) (((j2 >>> 7) & 127) | 128));
                    long j12 = this.f23976b;
                    this.f23976b = j12 - 1;
                    memoryAccessor3.mo13710p(j12, (byte) ((j2 & 127) | 128));
                    break;
                case 5:
                    long j13 = this.f23976b;
                    this.f23976b = j13 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f24390e;
                    memoryAccessor4.mo13710p(j13, (byte) (j2 >>> 28));
                    long j14 = this.f23976b;
                    this.f23976b = j14 - 1;
                    memoryAccessor4.mo13710p(j14, (byte) (((j2 >>> 21) & 127) | 128));
                    long j15 = this.f23976b;
                    this.f23976b = j15 - 1;
                    memoryAccessor4.mo13710p(j15, (byte) (((j2 >>> 14) & 127) | 128));
                    long j16 = this.f23976b;
                    this.f23976b = j16 - 1;
                    memoryAccessor4.mo13710p(j16, (byte) (((j2 >>> 7) & 127) | 128));
                    long j17 = this.f23976b;
                    this.f23976b = j17 - 1;
                    memoryAccessor4.mo13710p(j17, (byte) ((j2 & 127) | 128));
                    break;
                case 6:
                    long j18 = this.f23976b;
                    this.f23976b = j18 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor5 = UnsafeUtil.f24390e;
                    memoryAccessor5.mo13710p(j18, (byte) (j2 >>> 35));
                    long j19 = this.f23976b;
                    this.f23976b = j19 - 1;
                    memoryAccessor5.mo13710p(j19, (byte) (((j2 >>> 28) & 127) | 128));
                    long j20 = this.f23976b;
                    this.f23976b = j20 - 1;
                    memoryAccessor5.mo13710p(j20, (byte) (((j2 >>> 21) & 127) | 128));
                    long j21 = this.f23976b;
                    this.f23976b = j21 - 1;
                    memoryAccessor5.mo13710p(j21, (byte) (((j2 >>> 14) & 127) | 128));
                    long j22 = this.f23976b;
                    this.f23976b = j22 - 1;
                    memoryAccessor5.mo13710p(j22, (byte) (((j2 >>> 7) & 127) | 128));
                    long j23 = this.f23976b;
                    this.f23976b = j23 - 1;
                    memoryAccessor5.mo13710p(j23, (byte) ((j2 & 127) | 128));
                    break;
                case 7:
                    long j24 = this.f23976b;
                    this.f23976b = j24 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor6 = UnsafeUtil.f24390e;
                    memoryAccessor6.mo13710p(j24, (byte) (j2 >>> 42));
                    long j25 = this.f23976b;
                    this.f23976b = j25 - 1;
                    memoryAccessor6.mo13710p(j25, (byte) (((j2 >>> 35) & 127) | 128));
                    long j26 = this.f23976b;
                    this.f23976b = j26 - 1;
                    memoryAccessor6.mo13710p(j26, (byte) (((j2 >>> 28) & 127) | 128));
                    long j27 = this.f23976b;
                    this.f23976b = j27 - 1;
                    memoryAccessor6.mo13710p(j27, (byte) (((j2 >>> 21) & 127) | 128));
                    long j28 = this.f23976b;
                    this.f23976b = j28 - 1;
                    memoryAccessor6.mo13710p(j28, (byte) (((j2 >>> 14) & 127) | 128));
                    long j29 = this.f23976b;
                    this.f23976b = j29 - 1;
                    memoryAccessor6.mo13710p(j29, (byte) (((j2 >>> 7) & 127) | 128));
                    long j30 = this.f23976b;
                    this.f23976b = j30 - 1;
                    memoryAccessor6.mo13710p(j30, (byte) ((j2 & 127) | 128));
                    break;
                case 8:
                    long j31 = this.f23976b;
                    this.f23976b = j31 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor7 = UnsafeUtil.f24390e;
                    memoryAccessor7.mo13710p(j31, (byte) (j2 >>> 49));
                    long j32 = this.f23976b;
                    this.f23976b = j32 - 1;
                    memoryAccessor7.mo13710p(j32, (byte) (((j2 >>> 42) & 127) | 128));
                    long j33 = this.f23976b;
                    this.f23976b = j33 - 1;
                    memoryAccessor7.mo13710p(j33, (byte) (((j2 >>> 35) & 127) | 128));
                    long j34 = this.f23976b;
                    this.f23976b = j34 - 1;
                    memoryAccessor7.mo13710p(j34, (byte) (((j2 >>> 28) & 127) | 128));
                    long j35 = this.f23976b;
                    this.f23976b = j35 - 1;
                    memoryAccessor7.mo13710p(j35, (byte) (((j2 >>> 21) & 127) | 128));
                    long j36 = this.f23976b;
                    this.f23976b = j36 - 1;
                    memoryAccessor7.mo13710p(j36, (byte) (((j2 >>> 14) & 127) | 128));
                    long j37 = this.f23976b;
                    this.f23976b = j37 - 1;
                    memoryAccessor7.mo13710p(j37, (byte) (((j2 >>> 7) & 127) | 128));
                    long j38 = this.f23976b;
                    this.f23976b = j38 - 1;
                    memoryAccessor7.mo13710p(j38, (byte) ((j2 & 127) | 128));
                    break;
                case 9:
                    long j39 = this.f23976b;
                    this.f23976b = j39 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor8 = UnsafeUtil.f24390e;
                    memoryAccessor8.mo13710p(j39, (byte) (j2 >>> 56));
                    long j40 = this.f23976b;
                    this.f23976b = j40 - 1;
                    memoryAccessor8.mo13710p(j40, (byte) (((j2 >>> 49) & 127) | 128));
                    long j41 = this.f23976b;
                    this.f23976b = j41 - 1;
                    memoryAccessor8.mo13710p(j41, (byte) (((j2 >>> 42) & 127) | 128));
                    long j42 = this.f23976b;
                    this.f23976b = j42 - 1;
                    memoryAccessor8.mo13710p(j42, (byte) (((j2 >>> 35) & 127) | 128));
                    long j43 = this.f23976b;
                    this.f23976b = j43 - 1;
                    memoryAccessor8.mo13710p(j43, (byte) (((j2 >>> 28) & 127) | 128));
                    long j44 = this.f23976b;
                    this.f23976b = j44 - 1;
                    memoryAccessor8.mo13710p(j44, (byte) (((j2 >>> 21) & 127) | 128));
                    long j45 = this.f23976b;
                    this.f23976b = j45 - 1;
                    memoryAccessor8.mo13710p(j45, (byte) (((j2 >>> 14) & 127) | 128));
                    long j46 = this.f23976b;
                    this.f23976b = j46 - 1;
                    memoryAccessor8.mo13710p(j46, (byte) (((j2 >>> 7) & 127) | 128));
                    long j47 = this.f23976b;
                    this.f23976b = j47 - 1;
                    memoryAccessor8.mo13710p(j47, (byte) ((j2 & 127) | 128));
                    break;
                case 10:
                    long j48 = this.f23976b;
                    this.f23976b = j48 - 1;
                    UnsafeUtil.MemoryAccessor memoryAccessor9 = UnsafeUtil.f24390e;
                    memoryAccessor9.mo13710p(j48, (byte) (j2 >>> 63));
                    long j49 = this.f23976b;
                    this.f23976b = j49 - 1;
                    memoryAccessor9.mo13710p(j49, (byte) (((j2 >>> 56) & 127) | 128));
                    long j50 = this.f23976b;
                    this.f23976b = j50 - 1;
                    memoryAccessor9.mo13710p(j50, (byte) (((j2 >>> 49) & 127) | 128));
                    long j51 = this.f23976b;
                    this.f23976b = j51 - 1;
                    memoryAccessor9.mo13710p(j51, (byte) (((j2 >>> 42) & 127) | 128));
                    long j52 = this.f23976b;
                    this.f23976b = j52 - 1;
                    memoryAccessor9.mo13710p(j52, (byte) (((j2 >>> 35) & 127) | 128));
                    long j53 = this.f23976b;
                    this.f23976b = j53 - 1;
                    memoryAccessor9.mo13710p(j53, (byte) (((j2 >>> 28) & 127) | 128));
                    long j54 = this.f23976b;
                    this.f23976b = j54 - 1;
                    memoryAccessor9.mo13710p(j54, (byte) (((j2 >>> 21) & 127) | 128));
                    long j55 = this.f23976b;
                    this.f23976b = j55 - 1;
                    memoryAccessor9.mo13710p(j55, (byte) (((j2 >>> 14) & 127) | 128));
                    long j56 = this.f23976b;
                    this.f23976b = j56 - 1;
                    memoryAccessor9.mo13710p(j56, (byte) (((j2 >>> 7) & 127) | 128));
                    long j57 = this.f23976b;
                    this.f23976b = j57 - 1;
                    memoryAccessor9.mo13710p(j57, (byte) ((j2 & 127) | 128));
                    break;
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: f */
        public void mo13126f(int i2, int i3) {
            mo13096U(9);
            mo13098W(i3);
            mo13107d0((i2 << 3) | 5);
        }

        /* renamed from: f0 */
        public final int m13140f0() {
            return (int) (this.f23976b - 0);
        }

        /* renamed from: g0 */
        public final int m13141g0() {
            return m13140f0() + 1;
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: j */
        public void mo13130j(int i2, Object obj, Schema schema) throws IOException {
            int mo13095T = mo13095T();
            schema.mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: k */
        public void mo13131k(int i2, long j2) {
            mo13096U(13);
            mo13099X(j2);
            mo13107d0((i2 << 3) | 1);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: n */
        public void mo13132n(int i2, String str) {
            char charAt;
            int mo13095T = mo13095T();
            mo13096U(str.length());
            int length = str.length() - 1;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                long j2 = this.f23976b;
                this.f23976b = j2 - 1;
                UnsafeUtil.f24390e.mo13710p(j2, (byte) charAt);
                length--;
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f23976b;
                        if (j3 >= 0) {
                            this.f23976b = j3 - 1;
                            UnsafeUtil.f24390e.mo13710p(j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f23976b;
                        if (j4 > 0) {
                            this.f23976b = j4 - 1;
                            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24390e;
                            memoryAccessor.mo13710p(j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f23976b;
                            this.f23976b = j5 - 1;
                            memoryAccessor.mo13710p(j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f23976b;
                        if (j6 > 1) {
                            this.f23976b = j6 - 1;
                            UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f24390e;
                            memoryAccessor2.mo13710p(j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f23976b;
                            this.f23976b = j7 - 1;
                            memoryAccessor2.mo13710p(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f23976b;
                            this.f23976b = j8 - 1;
                            memoryAccessor2.mo13710p(j8, (byte) ((charAt2 >>> '\f') | 480));
                            length--;
                        }
                    }
                    if (this.f23976b > 2) {
                        if (length != 0) {
                            int i3 = length - 1;
                            char charAt3 = str.charAt(i3);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f23976b;
                                this.f23976b = j9 - 1;
                                UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f24390e;
                                memoryAccessor3.mo13710p(j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f23976b;
                                this.f23976b = j10 - 1;
                                memoryAccessor3.mo13710p(j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f23976b;
                                this.f23976b = j11 - 1;
                                memoryAccessor3.mo13710p(j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f23976b;
                                this.f23976b = j12 - 1;
                                memoryAccessor3.mo13710p(j12, (byte) ((codePoint >>> 18) | 240));
                                length = i3;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo13096U(length);
                    length++;
                    length--;
                }
            }
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: o */
        public void mo13133o(int i2, long j2) {
            mo13096U(15);
            mo13109e0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: p */
        public void mo13134p(int i2, Object obj) throws IOException {
            int mo13095T = mo13095T();
            Protobuf.f24310c.m13568b(obj).mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: s */
        public void mo13135s(int i2, boolean z) {
            mo13096U(6);
            byte b = z ? (byte) 1 : (byte) 0;
            long j2 = this.f23976b;
            this.f23976b = j2 - 1;
            UnsafeUtil.f24390e.mo13710p(j2, b);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: t */
        public void mo13136t(int i2, Object obj, Schema schema) throws IOException {
            int i3 = i2 << 3;
            mo13107d0(i3 | 4);
            schema.mo13537b(obj, this);
            mo13107d0(i3 | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: v */
        public void mo13137v(int i2) {
            mo13107d0((i2 << 3) | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: w */
        public void mo13138w(int i2, ByteString byteString) {
            try {
                byteString.mo13157G(this);
                mo13096U(10);
                mo13107d0(byteString.size());
                mo13107d0((i2 << 3) | 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: x */
        public void mo13139x(int i2, int i3) {
            mo13096U(15);
            if (i3 >= 0) {
                mo13107d0(i3);
            } else {
                mo13109e0(i3);
            }
            mo13107d0((i2 << 3) | 0);
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* renamed from: b */
        public long f23977b;

        @Override // com.google.protobuf.Writer
        /* renamed from: G */
        public void mo13120G(int i2, long j2) {
            mo13096U(15);
            mo13104b0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: I */
        public void mo13121I(int i2) {
            mo13107d0((i2 << 3) | 4);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: O */
        public void mo13122O(int i2, int i3) {
            mo13096U(10);
            mo13102a0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: Q */
        public void mo13123Q(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (m13142f0() < remaining) {
                this.f23972a += remaining;
                AllocatedBuffer.m12990a(byteBuffer);
                throw null;
            }
            long j2 = this.f23977b - remaining;
            this.f23977b = j2;
            byteBuffer.get(null, ((int) j2) + 1, remaining);
        }

        @Override // com.google.protobuf.ByteOutput
        /* renamed from: R */
        public void mo13124R(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            if (m13142f0() < i3) {
                this.f23972a += i3;
                AllocatedBuffer.m12991b(bArr, i2, i3);
                throw null;
            }
            long j2 = this.f23977b - i3;
            this.f23977b = j2;
            System.arraycopy(bArr, i2, null, ((int) j2) + 1, i3);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: T */
        public int mo13095T() {
            return this.f23972a + ((int) (0 - this.f23977b));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: U */
        public void mo13096U(int i2) {
            if (m13142f0() >= i2) {
                return;
            }
            Math.max(i2, 0);
            throw null;
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: V */
        public void mo13097V(boolean z) {
            byte b = z ? (byte) 1 : (byte) 0;
            long j2 = this.f23977b;
            this.f23977b = j2 - 1;
            UnsafeUtil.m13695v(null, j2, b);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: W */
        public void mo13098W(int i2) {
            long j2 = this.f23977b;
            this.f23977b = j2 - 1;
            UnsafeUtil.m13695v(null, j2, (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j3 = this.f23977b;
            this.f23977b = j3 - 1;
            UnsafeUtil.m13695v(null, j3, (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j4 = this.f23977b;
            this.f23977b = j4 - 1;
            UnsafeUtil.m13695v(null, j4, (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j5 = this.f23977b;
            this.f23977b = j5 - 1;
            UnsafeUtil.m13695v(null, j5, (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: X */
        public void mo13099X(long j2) {
            long j3 = this.f23977b;
            this.f23977b = j3 - 1;
            UnsafeUtil.m13695v(null, j3, (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j4 = this.f23977b;
            this.f23977b = j4 - 1;
            UnsafeUtil.m13695v(null, j4, (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j5 = this.f23977b;
            this.f23977b = j5 - 1;
            UnsafeUtil.m13695v(null, j5, (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j6 = this.f23977b;
            this.f23977b = j6 - 1;
            UnsafeUtil.m13695v(null, j6, (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j7 = this.f23977b;
            this.f23977b = j7 - 1;
            UnsafeUtil.m13695v(null, j7, (byte) (((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j8 = this.f23977b;
            this.f23977b = j8 - 1;
            UnsafeUtil.m13695v(null, j8, (byte) (((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j9 = this.f23977b;
            this.f23977b = j9 - 1;
            UnsafeUtil.m13695v(null, j9, (byte) (((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE));
            long j10 = this.f23977b;
            this.f23977b = j10 - 1;
            UnsafeUtil.m13695v(null, j10, (byte) (((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: Y */
        public void mo13100Y(int i2) {
            if (i2 >= 0) {
                mo13107d0(i2);
            } else {
                mo13109e0(i2);
            }
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: a0 */
        public void mo13102a0(int i2) {
            mo13107d0(CodedOutputStream.m13279u0(i2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: b0 */
        public void mo13104b0(long j2) {
            mo13109e0(CodedOutputStream.m13280v0(j2));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: c0 */
        public void mo13106c0(int i2, int i3) {
            mo13107d0((i2 << 3) | i3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: d */
        public void mo13125d(int i2, int i3) {
            mo13096U(10);
            mo13107d0(i3);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: d0 */
        public void mo13107d0(int i2) {
            if ((i2 & (-128)) == 0) {
                long j2 = this.f23977b;
                this.f23977b = j2 - 1;
                UnsafeUtil.m13695v(null, j2, (byte) i2);
                return;
            }
            if ((i2 & (-16384)) == 0) {
                long j3 = this.f23977b;
                this.f23977b = j3 - 1;
                UnsafeUtil.m13695v(null, j3, (byte) (i2 >>> 7));
                long j4 = this.f23977b;
                this.f23977b = j4 - 1;
                UnsafeUtil.m13695v(null, j4, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-2097152) & i2) == 0) {
                long j5 = this.f23977b;
                this.f23977b = j5 - 1;
                UnsafeUtil.m13695v(null, j5, (byte) (i2 >>> 14));
                long j6 = this.f23977b;
                this.f23977b = j6 - 1;
                UnsafeUtil.m13695v(null, j6, (byte) (((i2 >>> 7) & 127) | 128));
                long j7 = this.f23977b;
                this.f23977b = j7 - 1;
                UnsafeUtil.m13695v(null, j7, (byte) ((i2 & 127) | 128));
                return;
            }
            if (((-268435456) & i2) == 0) {
                long j8 = this.f23977b;
                this.f23977b = j8 - 1;
                UnsafeUtil.m13695v(null, j8, (byte) (i2 >>> 21));
                long j9 = this.f23977b;
                this.f23977b = j9 - 1;
                UnsafeUtil.m13695v(null, j9, (byte) (((i2 >>> 14) & 127) | 128));
                long j10 = this.f23977b;
                this.f23977b = j10 - 1;
                UnsafeUtil.m13695v(null, j10, (byte) (((i2 >>> 7) & 127) | 128));
                long j11 = this.f23977b;
                this.f23977b = j11 - 1;
                UnsafeUtil.m13695v(null, j11, (byte) ((i2 & 127) | 128));
                return;
            }
            long j12 = this.f23977b;
            this.f23977b = j12 - 1;
            UnsafeUtil.m13695v(null, j12, (byte) (i2 >>> 28));
            long j13 = this.f23977b;
            this.f23977b = j13 - 1;
            UnsafeUtil.m13695v(null, j13, (byte) (((i2 >>> 21) & 127) | 128));
            long j14 = this.f23977b;
            this.f23977b = j14 - 1;
            UnsafeUtil.m13695v(null, j14, (byte) (((i2 >>> 14) & 127) | 128));
            long j15 = this.f23977b;
            this.f23977b = j15 - 1;
            UnsafeUtil.m13695v(null, j15, (byte) (((i2 >>> 7) & 127) | 128));
            long j16 = this.f23977b;
            this.f23977b = j16 - 1;
            UnsafeUtil.m13695v(null, j16, (byte) ((i2 & 127) | 128));
        }

        @Override // com.google.protobuf.BinaryWriter
        /* renamed from: e0 */
        public void mo13109e0(long j2) {
            switch (BinaryWriter.m13080S(j2)) {
                case 1:
                    long j3 = this.f23977b;
                    this.f23977b = j3 - 1;
                    UnsafeUtil.m13695v(null, j3, (byte) j2);
                    break;
                case 2:
                    long j4 = this.f23977b;
                    this.f23977b = j4 - 1;
                    UnsafeUtil.m13695v(null, j4, (byte) (j2 >>> 7));
                    long j5 = this.f23977b;
                    this.f23977b = j5 - 1;
                    UnsafeUtil.m13695v(null, j5, (byte) ((((int) j2) & 127) | 128));
                    break;
                case 3:
                    long j6 = this.f23977b;
                    this.f23977b = j6 - 1;
                    UnsafeUtil.m13695v(null, j6, (byte) (((int) j2) >>> 14));
                    long j7 = this.f23977b;
                    this.f23977b = j7 - 1;
                    UnsafeUtil.m13695v(null, j7, (byte) (((j2 >>> 7) & 127) | 128));
                    long j8 = this.f23977b;
                    this.f23977b = j8 - 1;
                    UnsafeUtil.m13695v(null, j8, (byte) ((j2 & 127) | 128));
                    break;
                case 4:
                    long j9 = this.f23977b;
                    this.f23977b = j9 - 1;
                    UnsafeUtil.m13695v(null, j9, (byte) (j2 >>> 21));
                    long j10 = this.f23977b;
                    this.f23977b = j10 - 1;
                    UnsafeUtil.m13695v(null, j10, (byte) (((j2 >>> 14) & 127) | 128));
                    long j11 = this.f23977b;
                    this.f23977b = j11 - 1;
                    UnsafeUtil.m13695v(null, j11, (byte) (((j2 >>> 7) & 127) | 128));
                    long j12 = this.f23977b;
                    this.f23977b = j12 - 1;
                    UnsafeUtil.m13695v(null, j12, (byte) ((j2 & 127) | 128));
                    break;
                case 5:
                    long j13 = this.f23977b;
                    this.f23977b = j13 - 1;
                    UnsafeUtil.m13695v(null, j13, (byte) (j2 >>> 28));
                    long j14 = this.f23977b;
                    this.f23977b = j14 - 1;
                    UnsafeUtil.m13695v(null, j14, (byte) (((j2 >>> 21) & 127) | 128));
                    long j15 = this.f23977b;
                    this.f23977b = j15 - 1;
                    UnsafeUtil.m13695v(null, j15, (byte) (((j2 >>> 14) & 127) | 128));
                    long j16 = this.f23977b;
                    this.f23977b = j16 - 1;
                    UnsafeUtil.m13695v(null, j16, (byte) (((j2 >>> 7) & 127) | 128));
                    long j17 = this.f23977b;
                    this.f23977b = j17 - 1;
                    UnsafeUtil.m13695v(null, j17, (byte) ((j2 & 127) | 128));
                    break;
                case 6:
                    long j18 = this.f23977b;
                    this.f23977b = j18 - 1;
                    UnsafeUtil.m13695v(null, j18, (byte) (j2 >>> 35));
                    long j19 = this.f23977b;
                    this.f23977b = j19 - 1;
                    UnsafeUtil.m13695v(null, j19, (byte) (((j2 >>> 28) & 127) | 128));
                    long j20 = this.f23977b;
                    this.f23977b = j20 - 1;
                    UnsafeUtil.m13695v(null, j20, (byte) (((j2 >>> 21) & 127) | 128));
                    long j21 = this.f23977b;
                    this.f23977b = j21 - 1;
                    UnsafeUtil.m13695v(null, j21, (byte) (((j2 >>> 14) & 127) | 128));
                    long j22 = this.f23977b;
                    this.f23977b = j22 - 1;
                    UnsafeUtil.m13695v(null, j22, (byte) (((j2 >>> 7) & 127) | 128));
                    long j23 = this.f23977b;
                    this.f23977b = j23 - 1;
                    UnsafeUtil.m13695v(null, j23, (byte) ((j2 & 127) | 128));
                    break;
                case 7:
                    long j24 = this.f23977b;
                    this.f23977b = j24 - 1;
                    UnsafeUtil.m13695v(null, j24, (byte) (j2 >>> 42));
                    long j25 = this.f23977b;
                    this.f23977b = j25 - 1;
                    UnsafeUtil.m13695v(null, j25, (byte) (((j2 >>> 35) & 127) | 128));
                    long j26 = this.f23977b;
                    this.f23977b = j26 - 1;
                    UnsafeUtil.m13695v(null, j26, (byte) (((j2 >>> 28) & 127) | 128));
                    long j27 = this.f23977b;
                    this.f23977b = j27 - 1;
                    UnsafeUtil.m13695v(null, j27, (byte) (((j2 >>> 21) & 127) | 128));
                    long j28 = this.f23977b;
                    this.f23977b = j28 - 1;
                    UnsafeUtil.m13695v(null, j28, (byte) (((j2 >>> 14) & 127) | 128));
                    long j29 = this.f23977b;
                    this.f23977b = j29 - 1;
                    UnsafeUtil.m13695v(null, j29, (byte) (((j2 >>> 7) & 127) | 128));
                    long j30 = this.f23977b;
                    this.f23977b = j30 - 1;
                    UnsafeUtil.m13695v(null, j30, (byte) ((j2 & 127) | 128));
                    break;
                case 8:
                    long j31 = this.f23977b;
                    this.f23977b = j31 - 1;
                    UnsafeUtil.m13695v(null, j31, (byte) (j2 >>> 49));
                    long j32 = this.f23977b;
                    this.f23977b = j32 - 1;
                    UnsafeUtil.m13695v(null, j32, (byte) (((j2 >>> 42) & 127) | 128));
                    long j33 = this.f23977b;
                    this.f23977b = j33 - 1;
                    UnsafeUtil.m13695v(null, j33, (byte) (((j2 >>> 35) & 127) | 128));
                    long j34 = this.f23977b;
                    this.f23977b = j34 - 1;
                    UnsafeUtil.m13695v(null, j34, (byte) (((j2 >>> 28) & 127) | 128));
                    long j35 = this.f23977b;
                    this.f23977b = j35 - 1;
                    UnsafeUtil.m13695v(null, j35, (byte) (((j2 >>> 21) & 127) | 128));
                    long j36 = this.f23977b;
                    this.f23977b = j36 - 1;
                    UnsafeUtil.m13695v(null, j36, (byte) (((j2 >>> 14) & 127) | 128));
                    long j37 = this.f23977b;
                    this.f23977b = j37 - 1;
                    UnsafeUtil.m13695v(null, j37, (byte) (((j2 >>> 7) & 127) | 128));
                    long j38 = this.f23977b;
                    this.f23977b = j38 - 1;
                    UnsafeUtil.m13695v(null, j38, (byte) ((j2 & 127) | 128));
                    break;
                case 9:
                    long j39 = this.f23977b;
                    this.f23977b = j39 - 1;
                    UnsafeUtil.m13695v(null, j39, (byte) (j2 >>> 56));
                    long j40 = this.f23977b;
                    this.f23977b = j40 - 1;
                    UnsafeUtil.m13695v(null, j40, (byte) (((j2 >>> 49) & 127) | 128));
                    long j41 = this.f23977b;
                    this.f23977b = j41 - 1;
                    UnsafeUtil.m13695v(null, j41, (byte) (((j2 >>> 42) & 127) | 128));
                    long j42 = this.f23977b;
                    this.f23977b = j42 - 1;
                    UnsafeUtil.m13695v(null, j42, (byte) (((j2 >>> 35) & 127) | 128));
                    long j43 = this.f23977b;
                    this.f23977b = j43 - 1;
                    UnsafeUtil.m13695v(null, j43, (byte) (((j2 >>> 28) & 127) | 128));
                    long j44 = this.f23977b;
                    this.f23977b = j44 - 1;
                    UnsafeUtil.m13695v(null, j44, (byte) (((j2 >>> 21) & 127) | 128));
                    long j45 = this.f23977b;
                    this.f23977b = j45 - 1;
                    UnsafeUtil.m13695v(null, j45, (byte) (((j2 >>> 14) & 127) | 128));
                    long j46 = this.f23977b;
                    this.f23977b = j46 - 1;
                    UnsafeUtil.m13695v(null, j46, (byte) (((j2 >>> 7) & 127) | 128));
                    long j47 = this.f23977b;
                    this.f23977b = j47 - 1;
                    UnsafeUtil.m13695v(null, j47, (byte) ((j2 & 127) | 128));
                    break;
                case 10:
                    long j48 = this.f23977b;
                    this.f23977b = j48 - 1;
                    UnsafeUtil.m13695v(null, j48, (byte) (j2 >>> 63));
                    long j49 = this.f23977b;
                    this.f23977b = j49 - 1;
                    UnsafeUtil.m13695v(null, j49, (byte) (((j2 >>> 56) & 127) | 128));
                    long j50 = this.f23977b;
                    this.f23977b = j50 - 1;
                    UnsafeUtil.m13695v(null, j50, (byte) (((j2 >>> 49) & 127) | 128));
                    long j51 = this.f23977b;
                    this.f23977b = j51 - 1;
                    UnsafeUtil.m13695v(null, j51, (byte) (((j2 >>> 42) & 127) | 128));
                    long j52 = this.f23977b;
                    this.f23977b = j52 - 1;
                    UnsafeUtil.m13695v(null, j52, (byte) (((j2 >>> 35) & 127) | 128));
                    long j53 = this.f23977b;
                    this.f23977b = j53 - 1;
                    UnsafeUtil.m13695v(null, j53, (byte) (((j2 >>> 28) & 127) | 128));
                    long j54 = this.f23977b;
                    this.f23977b = j54 - 1;
                    UnsafeUtil.m13695v(null, j54, (byte) (((j2 >>> 21) & 127) | 128));
                    long j55 = this.f23977b;
                    this.f23977b = j55 - 1;
                    UnsafeUtil.m13695v(null, j55, (byte) (((j2 >>> 14) & 127) | 128));
                    long j56 = this.f23977b;
                    this.f23977b = j56 - 1;
                    UnsafeUtil.m13695v(null, j56, (byte) (((j2 >>> 7) & 127) | 128));
                    long j57 = this.f23977b;
                    this.f23977b = j57 - 1;
                    UnsafeUtil.m13695v(null, j57, (byte) ((j2 & 127) | 128));
                    break;
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: f */
        public void mo13126f(int i2, int i3) {
            mo13096U(9);
            mo13098W(i3);
            mo13107d0((i2 << 3) | 5);
        }

        /* renamed from: f0 */
        public int m13142f0() {
            return (int) (this.f23977b - 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: j */
        public void mo13130j(int i2, Object obj, Schema schema) throws IOException {
            int mo13095T = mo13095T();
            schema.mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: k */
        public void mo13131k(int i2, long j2) {
            mo13096U(13);
            mo13099X(j2);
            mo13107d0((i2 << 3) | 1);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: n */
        public void mo13132n(int i2, String str) {
            char charAt;
            int mo13095T = mo13095T();
            mo13096U(str.length());
            int length = str.length() - 1;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                long j2 = this.f23977b;
                this.f23977b = j2 - 1;
                UnsafeUtil.m13695v(null, j2, (byte) charAt);
                length--;
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f23977b;
                        if (j3 > 0) {
                            this.f23977b = j3 - 1;
                            UnsafeUtil.m13695v(null, j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f23977b;
                        if (j4 > 0) {
                            this.f23977b = j4 - 1;
                            UnsafeUtil.m13695v(null, j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f23977b;
                            this.f23977b = j5 - 1;
                            UnsafeUtil.m13695v(null, j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f23977b;
                        if (j6 > 1) {
                            this.f23977b = j6 - 1;
                            UnsafeUtil.m13695v(null, j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f23977b;
                            this.f23977b = j7 - 1;
                            UnsafeUtil.m13695v(null, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f23977b;
                            this.f23977b = j8 - 1;
                            UnsafeUtil.m13695v(null, j8, (byte) ((charAt2 >>> '\f') | 480));
                            length--;
                        }
                    }
                    if (this.f23977b > 2) {
                        if (length != 0) {
                            int i3 = length - 1;
                            char charAt3 = str.charAt(i3);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f23977b;
                                this.f23977b = j9 - 1;
                                UnsafeUtil.m13695v(null, j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f23977b;
                                this.f23977b = j10 - 1;
                                UnsafeUtil.m13695v(null, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f23977b;
                                this.f23977b = j11 - 1;
                                UnsafeUtil.m13695v(null, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f23977b;
                                this.f23977b = j12 - 1;
                                UnsafeUtil.m13695v(null, j12, (byte) ((codePoint >>> 18) | 240));
                                length = i3;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    mo13096U(length);
                    length++;
                    length--;
                }
            }
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: o */
        public void mo13133o(int i2, long j2) {
            mo13096U(15);
            mo13109e0(j2);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: p */
        public void mo13134p(int i2, Object obj) throws IOException {
            int mo13095T = mo13095T();
            Protobuf.f24310c.m13568b(obj).mo13537b(obj, this);
            int mo13095T2 = mo13095T() - mo13095T;
            mo13096U(10);
            mo13107d0(mo13095T2);
            mo13107d0((i2 << 3) | 2);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: s */
        public void mo13135s(int i2, boolean z) {
            mo13096U(6);
            byte b = z ? (byte) 1 : (byte) 0;
            long j2 = this.f23977b;
            this.f23977b = j2 - 1;
            UnsafeUtil.m13695v(null, j2, b);
            mo13107d0((i2 << 3) | 0);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: t */
        public void mo13136t(int i2, Object obj, Schema schema) throws IOException {
            int i3 = i2 << 3;
            mo13107d0(i3 | 4);
            schema.mo13537b(obj, this);
            mo13107d0(i3 | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: v */
        public void mo13137v(int i2) {
            mo13107d0((i2 << 3) | 3);
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: w */
        public void mo13138w(int i2, ByteString byteString) {
            try {
                byteString.mo13157G(this);
                mo13096U(10);
                mo13107d0(byteString.size());
                mo13107d0((i2 << 3) | 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.google.protobuf.Writer
        /* renamed from: x */
        public void mo13139x(int i2, int i3) {
            mo13096U(15);
            if (i3 >= 0) {
                mo13107d0(i3);
            } else {
                mo13109e0(i3);
            }
            mo13107d0((i2 << 3) | 0);
        }
    }

    /* renamed from: S */
    public static byte m13080S(long j2) {
        byte b;
        if (((-128) & j2) == 0) {
            return (byte) 1;
        }
        if (j2 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j2) != 0) {
            b = (byte) 6;
            j2 >>>= 28;
        } else {
            b = 2;
        }
        if (((-2097152) & j2) != 0) {
            b = (byte) (b + 2);
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    /* renamed from: Z */
    public static final void m13081Z(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (fieldType.ordinal()) {
            case 0:
                ((BinaryWriter) writer).mo13110g(i2, ((Double) obj).doubleValue());
                return;
            case 1:
                ((BinaryWriter) writer).mo13088H(i2, ((Float) obj).floatValue());
                return;
            case 2:
                ((BinaryWriter) writer).mo13133o(i2, ((Long) obj).longValue());
                return;
            case 3:
                writer.mo13133o(i2, ((Long) obj).longValue());
                return;
            case 4:
                writer.mo13139x(i2, ((Integer) obj).intValue());
                return;
            case 5:
                writer.mo13131k(i2, ((Long) obj).longValue());
                return;
            case 6:
                writer.mo13126f(i2, ((Integer) obj).intValue());
                return;
            case 7:
                writer.mo13135s(i2, ((Boolean) obj).booleanValue());
                return;
            case 8:
                writer.mo13132n(i2, (String) obj);
                return;
            case 9:
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
            case 10:
                writer.mo13134p(i2, obj);
                return;
            case 11:
                writer.mo13138w(i2, (ByteString) obj);
                return;
            case 12:
                writer.mo13125d(i2, ((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof Internal.EnumLite) {
                    ((BinaryWriter) writer).mo13139x(i2, ((Internal.EnumLite) obj).mo11028x());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    ((BinaryWriter) writer).mo13139x(i2, ((Integer) obj).intValue());
                    return;
                }
            case 14:
                ((BinaryWriter) writer).mo13126f(i2, ((Integer) obj).intValue());
                return;
            case 15:
                ((BinaryWriter) writer).mo13131k(i2, ((Long) obj).longValue());
                return;
            case 16:
                writer.mo13122O(i2, ((Integer) obj).intValue());
                return;
            case 17:
                writer.mo13120G(i2, ((Long) obj).longValue());
                return;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: A */
    public final void mo13082A(int i2, long j2) throws IOException {
        mo13131k(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: B */
    public final void mo13083B(int i2, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            if (z) {
                mo13096U((intArrayList.f24209d * 4) + 10);
                int mo13095T = mo13095T();
                int i3 = intArrayList.f24209d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13098W(intArrayList.m13451f(i3));
                }
            } else {
                int i4 = intArrayList.f24209d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13126f(i2, intArrayList.m13451f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 4, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13098W(list.get(size).intValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13126f(i2, list.get(size2).intValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: C */
    public final void mo13084C(int i2, List<Boolean> list, boolean z) throws IOException {
        if (list instanceof BooleanArrayList) {
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            if (z) {
                mo13096U(booleanArrayList.f23980d + 10);
                int mo13095T = mo13095T();
                int i3 = booleanArrayList.f23980d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13097V(booleanArrayList.m13147f(i3));
                }
            } else {
                int i4 = booleanArrayList.f23980d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13135s(i2, booleanArrayList.m13147f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(list.size() + 10);
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13097V(list.get(size).booleanValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13135s(i2, list.get(size2).booleanValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: D */
    public <K, V> void mo13085D(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int mo13095T = mo13095T();
            m13081Z(this, 2, metadata.f24267c, entry.getValue());
            m13081Z(this, 1, metadata.f24265a, entry.getKey());
            mo13107d0(mo13095T() - mo13095T);
            mo13106c0(i2, 2);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: E */
    public final void mo13086E(int i2, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            if (z) {
                mo13096U((intArrayList.f24209d * 5) + 10);
                int mo13095T = mo13095T();
                int i3 = intArrayList.f24209d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13107d0(intArrayList.m13451f(i3));
                }
            } else {
                int i4 = intArrayList.f24209d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13125d(i2, intArrayList.m13451f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 5, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13107d0(list.get(size).intValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13125d(i2, list.get(size2).intValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: F */
    public final void mo13087F(int i2, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            if (z) {
                mo13096U((longArrayList.f24257d * 10) + 10);
                int mo13095T = mo13095T();
                int i3 = longArrayList.f24257d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13104b0(longArrayList.m13485f(i3));
                }
            } else {
                int i4 = longArrayList.f24257d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13120G(i2, longArrayList.m13485f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 10, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13104b0(list.get(size).longValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13120G(i2, list.get(size2).longValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: H */
    public final void mo13088H(int i2, float f2) throws IOException {
        mo13126f(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: J */
    public final void mo13089J(int i2, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            if (z) {
                mo13096U((intArrayList.f24209d * 5) + 10);
                int mo13095T = mo13095T();
                int i3 = intArrayList.f24209d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13102a0(intArrayList.m13451f(i3));
                }
            } else {
                int i4 = intArrayList.f24209d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13122O(i2, intArrayList.m13451f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 5, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13102a0(list.get(size).intValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13122O(i2, list.get(size2).intValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: K */
    public final void mo13090K(int i2, int i3) throws IOException {
        mo13139x(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: L */
    public final void mo13091L(int i2, List<Long> list, boolean z) throws IOException {
        mo13112i(i2, list, z);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: M */
    public final void mo13092M(int i2, List<Integer> list, boolean z) throws IOException {
        mo13115q(i2, list, z);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: N */
    public final void mo13093N(int i2, List<Double> list, boolean z) throws IOException {
        if (list instanceof DoubleArrayList) {
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            if (z) {
                mo13096U((doubleArrayList.f24107d * 8) + 10);
                int mo13095T = mo13095T();
                int i3 = doubleArrayList.f24107d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13099X(Double.doubleToRawLongBits(doubleArrayList.m13361f(i3)));
                }
            } else {
                int i4 = doubleArrayList.f24107d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13110g(i2, doubleArrayList.m13361f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 8, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13099X(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13110g(i2, list.get(size2).doubleValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: P */
    public final void mo13094P(int i2, List<ByteString> list) throws IOException {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                mo13138w(i2, list.get(size));
            }
        }
    }

    /* renamed from: T */
    public abstract int mo13095T();

    /* renamed from: U */
    public abstract void mo13096U(int i2);

    /* renamed from: V */
    public abstract void mo13097V(boolean z);

    /* renamed from: W */
    public abstract void mo13098W(int i2);

    /* renamed from: X */
    public abstract void mo13099X(long j2);

    /* renamed from: Y */
    public abstract void mo13100Y(int i2);

    @Override // com.google.protobuf.Writer
    /* renamed from: a */
    public final void mo13101a(int i2, List<?> list, Schema schema) throws IOException {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                mo13130j(i2, list.get(size), schema);
            }
        }
    }

    /* renamed from: a0 */
    public abstract void mo13102a0(int i2);

    @Override // com.google.protobuf.Writer
    /* renamed from: b */
    public final void mo13103b(int i2, List<?> list, Schema schema) throws IOException {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                mo13136t(i2, list.get(size), schema);
            }
        }
    }

    /* renamed from: b0 */
    public abstract void mo13104b0(long j2);

    @Override // com.google.protobuf.Writer
    /* renamed from: c */
    public final void mo13105c(int i2, List<Float> list, boolean z) throws IOException {
        if (list instanceof FloatArrayList) {
            FloatArrayList floatArrayList = (FloatArrayList) list;
            if (z) {
                mo13096U((floatArrayList.f24180d * 4) + 10);
                int mo13095T = mo13095T();
                int i3 = floatArrayList.f24180d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13098W(Float.floatToRawIntBits(floatArrayList.m13408f(i3)));
                }
            } else {
                int i4 = floatArrayList.f24180d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13088H(i2, floatArrayList.m13408f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 4, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13098W(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13088H(i2, list.get(size2).floatValue());
                }
            }
        }
    }

    /* renamed from: c0 */
    public abstract void mo13106c0(int i2, int i3);

    /* renamed from: d0 */
    public abstract void mo13107d0(int i2);

    @Override // com.google.protobuf.Writer
    /* renamed from: e */
    public final void mo13108e(int i2, Object obj) throws IOException {
        mo13106c0(1, 4);
        if (obj instanceof ByteString) {
            mo13138w(3, (ByteString) obj);
        } else {
            mo13134p(3, obj);
        }
        mo13125d(2, i2);
        mo13106c0(1, 3);
    }

    /* renamed from: e0 */
    public abstract void mo13109e0(long j2);

    @Override // com.google.protobuf.Writer
    /* renamed from: g */
    public final void mo13110g(int i2, double d) throws IOException {
        mo13131k(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: h */
    public final void mo13111h(int i2, List<Long> list, boolean z) throws IOException {
        mo13118y(i2, list, z);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: i */
    public final void mo13112i(int i2, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            if (z) {
                mo13096U((longArrayList.f24257d * 10) + 10);
                int mo13095T = mo13095T();
                int i3 = longArrayList.f24257d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13109e0(longArrayList.m13485f(i3));
                }
            } else {
                int i4 = longArrayList.f24257d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13133o(i2, longArrayList.m13485f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 10, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13109e0(list.get(size).longValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13133o(i2, list.get(size2).longValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: l */
    public final Writer.FieldOrder mo13113l() {
        return Writer.FieldOrder.DESCENDING;
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: m */
    public final void mo13114m(int i2, List<String> list) throws IOException {
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                Object mo13473Z0 = lazyStringList.mo13473Z0(size);
                if (mo13473Z0 instanceof String) {
                    mo13132n(i2, (String) mo13473Z0);
                } else {
                    mo13138w(i2, (ByteString) mo13473Z0);
                }
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13132n(i2, list.get(size2));
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: q */
    public final void mo13115q(int i2, List<Integer> list, boolean z) throws IOException {
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            if (z) {
                mo13096U((intArrayList.f24209d * 10) + 10);
                int mo13095T = mo13095T();
                int i3 = intArrayList.f24209d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13100Y(intArrayList.m13451f(i3));
                }
            } else {
                int i4 = intArrayList.f24209d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13139x(i2, intArrayList.m13451f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 10, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13100Y(list.get(size).intValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13139x(i2, list.get(size2).intValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: r */
    public final void mo13116r(int i2, long j2) throws IOException {
        mo13133o(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: u */
    public final void mo13117u(int i2, int i3) throws IOException {
        mo13126f(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: y */
    public final void mo13118y(int i2, List<Long> list, boolean z) throws IOException {
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            if (z) {
                mo13096U((longArrayList.f24257d * 8) + 10);
                int mo13095T = mo13095T();
                int i3 = longArrayList.f24257d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        mo13107d0(mo13095T() - mo13095T);
                        mo13106c0(i2, 2);
                        return;
                    }
                    mo13099X(longArrayList.m13485f(i3));
                }
            } else {
                int i4 = longArrayList.f24257d;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        return;
                    } else {
                        mo13131k(i2, longArrayList.m13485f(i4));
                    }
                }
            }
        } else if (z) {
            mo13096U(C2052a.m12266a(list, 8, 10));
            int mo13095T2 = mo13095T();
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    mo13107d0(mo13095T() - mo13095T2);
                    mo13106c0(i2, 2);
                    return;
                }
                mo13099X(list.get(size).longValue());
            }
        } else {
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return;
                } else {
                    mo13131k(i2, list.get(size2).longValue());
                }
            }
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: z */
    public final void mo13119z(int i2, List<Integer> list, boolean z) throws IOException {
        mo13083B(i2, list, z);
    }
}
