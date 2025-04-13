package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class ArrayDecoders {

    /* renamed from: com.google.protobuf.ArrayDecoders$1 */
    public static /* synthetic */ class C23431 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23960a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23960a = iArr;
            try {
                iArr[WireFormat.FieldType.f24401d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23960a[WireFormat.FieldType.f24402e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23960a[WireFormat.FieldType.f24403f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23960a[WireFormat.FieldType.f24404g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23960a[WireFormat.FieldType.f24405h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23960a[WireFormat.FieldType.f24413p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23960a[WireFormat.FieldType.f24406i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23960a[WireFormat.FieldType.f24416s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23960a[WireFormat.FieldType.f24407j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23960a[WireFormat.FieldType.f24415r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23960a[WireFormat.FieldType.f24408k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23960a[WireFormat.FieldType.f24417t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23960a[WireFormat.FieldType.f24418u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23960a[WireFormat.FieldType.f24414q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23960a[WireFormat.FieldType.f24412o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23960a[WireFormat.FieldType.f24409l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23960a[WireFormat.FieldType.f24410m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23960a[WireFormat.FieldType.f24411n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: a */
    public static int m12995a(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.m13461f();
        }
        if (i3 > bArr.length - m13014t) {
            throw InvalidProtocolBufferException.m13463h();
        }
        if (i3 == 0) {
            registers.f23963c = ByteString.f23981c;
            return m13014t;
        }
        registers.f23963c = ByteString.m13151g(bArr, m13014t, i3);
        return m13014t + i3;
    }

    /* renamed from: b */
    public static int m12996b(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static long m12997c(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* renamed from: d */
    public static int m12998d(Schema schema, byte[] bArr, int i2, int i3, int i4, Registers registers) throws IOException {
        MessageSchema messageSchema = (MessageSchema) schema;
        Object mo13545i = messageSchema.mo13545i();
        int m13522L = messageSchema.m13522L(mo13545i, bArr, i2, i3, i4, registers);
        messageSchema.mo13539c(mo13545i);
        registers.f23963c = mo13545i;
        return m13522L;
    }

    /* renamed from: e */
    public static int m12999e(Schema schema, byte[] bArr, int i2, int i3, Registers registers) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = m13013s(i5, bArr, i4, registers);
            i5 = registers.f23961a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw InvalidProtocolBufferException.m13463h();
        }
        Object mo13545i = schema.mo13545i();
        int i7 = i5 + i6;
        schema.mo13542f(mo13545i, bArr, i6, i7, registers);
        schema.mo13539c(mo13545i);
        registers.f23963c = mo13545i;
        return i7;
    }

    /* renamed from: f */
    public static int m13000f(Schema<?> schema, int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int m12999e = m12999e(schema, bArr, i3, i4, registers);
        protobufList.add(registers.f23963c);
        while (m12999e < i4) {
            int m13014t = m13014t(bArr, m12999e, registers);
            if (i2 != registers.f23961a) {
                break;
            }
            m12999e = m12999e(schema, bArr, m13014t, i4, registers);
            protobufList.add(registers.f23963c);
        }
        return m12999e;
    }

    /* renamed from: g */
    public static int m13001g(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            m13014t = m13016v(bArr, m13014t, registers);
            booleanArrayList.m13145d(registers.f23962b != 0);
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: h */
    public static int m13002h(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            doubleArrayList.m13359d(Double.longBitsToDouble(m12997c(bArr, m13014t)));
            m13014t += 8;
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: i */
    public static int m13003i(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            intArrayList.m13449d(m12996b(bArr, m13014t));
            m13014t += 4;
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: j */
    public static int m13004j(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            longArrayList.m13483d(m12997c(bArr, m13014t));
            m13014t += 8;
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: k */
    public static int m13005k(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            floatArrayList.m13406d(Float.intBitsToFloat(m12996b(bArr, m13014t)));
            m13014t += 4;
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: l */
    public static int m13006l(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            m13014t = m13014t(bArr, m13014t, registers);
            intArrayList.m13449d(CodedInputStream.m13171b(registers.f23961a));
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: m */
    public static int m13007m(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            m13014t = m13016v(bArr, m13014t, registers);
            longArrayList.m13483d(CodedInputStream.m13172c(registers.f23962b));
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: n */
    public static int m13008n(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            m13014t = m13014t(bArr, m13014t, registers);
            intArrayList.m13449d(registers.f23961a);
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: o */
    public static int m13009o(byte[] bArr, int i2, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a + m13014t;
        while (m13014t < i3) {
            m13014t = m13016v(bArr, m13014t, registers);
            longArrayList.m13483d(registers.f23962b);
        }
        if (m13014t == i3) {
            return m13014t;
        }
        throw InvalidProtocolBufferException.m13463h();
    }

    /* renamed from: p */
    public static int m13010p(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.m13461f();
        }
        if (i3 == 0) {
            registers.f23963c = "";
            return m13014t;
        }
        registers.f23963c = new String(bArr, m13014t, i3, Internal.f24211b);
        return m13014t + i3;
    }

    /* renamed from: q */
    public static int m13011q(byte[] bArr, int i2, Registers registers) throws InvalidProtocolBufferException {
        int m13014t = m13014t(bArr, i2, registers);
        int i3 = registers.f23961a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.m13461f();
        }
        if (i3 == 0) {
            registers.f23963c = "";
            return m13014t;
        }
        registers.f23963c = Utf8.m13728d(bArr, m13014t, i3);
        return m13014t + i3;
    }

    /* renamed from: r */
    public static int m13012r(int i2, byte[] bArr, int i3, int i4, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if ((i2 >>> 3) == 0) {
            throw InvalidProtocolBufferException.m13457b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int m13016v = m13016v(bArr, i3, registers);
            unknownFieldSetLite.m13669c(i2, Long.valueOf(registers.f23962b));
            return m13016v;
        }
        if (i5 == 1) {
            unknownFieldSetLite.m13669c(i2, Long.valueOf(m12997c(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int m13014t = m13014t(bArr, i3, registers);
            int i6 = registers.f23961a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.m13461f();
            }
            if (i6 > bArr.length - m13014t) {
                throw InvalidProtocolBufferException.m13463h();
            }
            if (i6 == 0) {
                unknownFieldSetLite.m13669c(i2, ByteString.f23981c);
            } else {
                unknownFieldSetLite.m13669c(i2, ByteString.m13151g(bArr, m13014t, i6));
            }
            return m13014t + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.m13457b();
            }
            unknownFieldSetLite.m13669c(i2, Integer.valueOf(m12996b(bArr, i3)));
            return i3 + 4;
        }
        UnknownFieldSetLite m13666b = UnknownFieldSetLite.m13666b();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int m13014t2 = m13014t(bArr, i3, registers);
            int i9 = registers.f23961a;
            if (i9 == i7) {
                i8 = i9;
                i3 = m13014t2;
                break;
            }
            i8 = i9;
            i3 = m13012r(i9, bArr, m13014t2, i4, m13666b, registers);
        }
        if (i3 > i4 || i8 != i7) {
            throw InvalidProtocolBufferException.m13462g();
        }
        unknownFieldSetLite.m13669c(i2, m13666b);
        return i3;
    }

    /* renamed from: s */
    public static int m13013s(int i2, byte[] bArr, int i3, Registers registers) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            registers.f23961a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            registers.f23961a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            registers.f23961a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            registers.f23961a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                registers.f23961a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* renamed from: t */
    public static int m13014t(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m13013s(b, bArr, i3, registers);
        }
        registers.f23961a = b;
        return i3;
    }

    /* renamed from: u */
    public static int m13015u(int i2, byte[] bArr, int i3, int i4, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int m13014t = m13014t(bArr, i3, registers);
        intArrayList.m13449d(registers.f23961a);
        while (m13014t < i4) {
            int m13014t2 = m13014t(bArr, m13014t, registers);
            if (i2 != registers.f23961a) {
                break;
            }
            m13014t = m13014t(bArr, m13014t2, registers);
            intArrayList.m13449d(registers.f23961a);
        }
        return m13014t;
    }

    /* renamed from: v */
    public static int m13016v(byte[] bArr, int i2, Registers registers) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            registers.f23962b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b = bArr[i4];
            i4 = i6;
        }
        registers.f23962b = j3;
        return i4;
    }

    /* renamed from: w */
    public static int m13017w(int i2, byte[] bArr, int i3, int i4, Registers registers) throws InvalidProtocolBufferException {
        if ((i2 >>> 3) == 0) {
            throw InvalidProtocolBufferException.m13457b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m13016v(bArr, i3, registers);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m13014t(bArr, i3, registers) + registers.f23961a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw InvalidProtocolBufferException.m13457b();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = m13014t(bArr, i3, registers);
            i7 = registers.f23961a;
            if (i7 == i6) {
                break;
            }
            i3 = m13017w(i7, bArr, i3, i4, registers);
        }
        if (i3 > i4 || i7 != i6) {
            throw InvalidProtocolBufferException.m13462g();
        }
        return i3;
    }

    public static final class Registers {

        /* renamed from: a */
        public int f23961a;

        /* renamed from: b */
        public long f23962b;

        /* renamed from: c */
        public Object f23963c;

        /* renamed from: d */
        public final ExtensionRegistryLite f23964d;

        public Registers() {
            this.f23964d = ExtensionRegistryLite.m13368a();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            Objects.requireNonNull(extensionRegistryLite);
            this.f23964d = extensionRegistryLite;
        }
    }
}
