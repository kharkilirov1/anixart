package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class BinaryReader implements Reader {

    /* renamed from: com.google.protobuf.BinaryReader$1 */
    public static /* synthetic */ class C23441 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23965a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23965a = iArr;
            try {
                iArr[WireFormat.FieldType.f24408k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23965a[WireFormat.FieldType.f24412o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23965a[WireFormat.FieldType.f24401d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23965a[WireFormat.FieldType.f24414q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23965a[WireFormat.FieldType.f24407j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23965a[WireFormat.FieldType.f24406i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23965a[WireFormat.FieldType.f24402e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23965a[WireFormat.FieldType.f24405h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23965a[WireFormat.FieldType.f24403f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23965a[WireFormat.FieldType.f24411n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23965a[WireFormat.FieldType.f24415r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23965a[WireFormat.FieldType.f24416s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23965a[WireFormat.FieldType.f24417t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23965a[WireFormat.FieldType.f24418u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23965a[WireFormat.FieldType.f24409l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23965a[WireFormat.FieldType.f24413p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23965a[WireFormat.FieldType.f24404g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeHeapReader extends BinaryReader {

        /* renamed from: a */
        public final boolean f23966a;

        /* renamed from: b */
        public final byte[] f23967b;

        /* renamed from: c */
        public int f23968c;

        /* renamed from: d */
        public int f23969d;

        /* renamed from: e */
        public int f23970e;

        /* renamed from: f */
        public int f23971f;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f23966a = z;
            this.f23967b = byteBuffer.array();
            this.f23968c = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f23969d = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: A */
        public <T> T mo13018A(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m13057g0(3);
            return (T) m13037T(Protobuf.f24310c.m13567a(cls), extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: B */
        public int mo13019B() throws IOException {
            if (m13034Q()) {
                return Integer.MAX_VALUE;
            }
            int m13047b0 = m13047b0();
            this.f23970e = m13047b0;
            if (m13047b0 == this.f23971f) {
                return Integer.MAX_VALUE;
            }
            return m13047b0 >>> 3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: C */
        public void mo13020C(List<String> list) throws IOException {
            m13045a0(list, false);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: D */
        public <T> T mo13021D(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m13057g0(2);
            return (T) m13042Y(schema, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        /* renamed from: E */
        public <K, V> void mo13022E(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m13057g0(2);
            int m13047b0 = m13047b0();
            m13053e0(m13047b0);
            int i2 = this.f23969d;
            this.f23969d = this.f23968c + m13047b0;
            try {
                Object obj = metadata.f24266b;
                Object obj2 = metadata.f24268d;
                while (true) {
                    int mo13019B = mo13019B();
                    if (mo13019B == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (mo13019B == 1) {
                        obj = m13036S(metadata.f24265a, null, null);
                    } else if (mo13019B != 2) {
                        try {
                            if (!mo13027J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo13027J()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m13036S(metadata.f24267c, metadata.f24268d.getClass(), extensionRegistryLite);
                    }
                }
            } finally {
                this.f23969d = i2;
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: F */
        public void mo13023F(List<String> list) throws IOException {
            m13045a0(list, true);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: G */
        public ByteString mo13024G() throws IOException {
            ByteString m13151g;
            m13057g0(2);
            int m13047b0 = m13047b0();
            if (m13047b0 == 0) {
                return ByteString.f23981c;
            }
            m13053e0(m13047b0);
            if (this.f23966a) {
                byte[] bArr = this.f23967b;
                int i2 = this.f23968c;
                ByteString byteString = ByteString.f23981c;
                m13151g = new ByteString.BoundedByteString(bArr, i2, m13047b0);
            } else {
                m13151g = ByteString.m13151g(this.f23967b, this.f23968c, m13047b0);
            }
            this.f23968c += m13047b0;
            return m13151g;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: H */
        public void mo13025H(List<Float> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof FloatArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 2) {
                    int m13047b0 = m13047b0();
                    m13061i0(m13047b0);
                    int i5 = this.f23968c + m13047b0;
                    while (this.f23968c < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m13039V())));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 2) {
                int m13047b02 = m13047b0();
                m13061i0(m13047b02);
                int i7 = this.f23968c + m13047b02;
                while (this.f23968c < i7) {
                    floatArrayList.m13406d(Float.intBitsToFloat(m13039V()));
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                floatArrayList.m13406d(readFloat());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: I */
        public int mo13026I() throws IOException {
            m13057g0(0);
            return m13047b0();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: J */
        public boolean mo13027J() throws IOException {
            int i2;
            int i3;
            if (m13034Q() || (i2 = this.f23970e) == (i3 = this.f23971f)) {
                return false;
            }
            int i4 = i2 & 7;
            if (i4 == 0) {
                int i5 = this.f23969d;
                int i6 = this.f23968c;
                if (i5 - i6 >= 10) {
                    byte[] bArr = this.f23967b;
                    int i7 = 0;
                    while (i7 < 10) {
                        int i8 = i6 + 1;
                        if (bArr[i6] >= 0) {
                            this.f23968c = i8;
                            break;
                        }
                        i7++;
                        i6 = i8;
                    }
                }
                for (int i9 = 0; i9 < 10; i9++) {
                    if (m13035R() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.m13460e();
            }
            if (i4 == 1) {
                m13059h0(8);
                return true;
            }
            if (i4 == 2) {
                m13059h0(m13047b0());
                return true;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                m13059h0(4);
                return true;
            }
            this.f23971f = ((i2 >>> 3) << 3) | 4;
            while (mo13019B() != Integer.MAX_VALUE && mo13027J()) {
            }
            if (this.f23970e != this.f23971f) {
                throw InvalidProtocolBufferException.m13462g();
            }
            this.f23971f = i3;
            return true;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: K */
        public int mo13028K() throws IOException {
            m13057g0(5);
            return m13038U();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: L */
        public void mo13029L(List<ByteString> list) throws IOException {
            int i2;
            if ((this.f23970e & 7) != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(mo13024G());
                if (m13034Q()) {
                    return;
                } else {
                    i2 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i2;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: M */
        public void mo13030M(List<Double> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof DoubleArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = m13047b0();
                m13063j0(m13047b0);
                int i5 = this.f23968c + m13047b0;
                while (this.f23968c < i5) {
                    list.add(Double.valueOf(Double.longBitsToDouble(m13041X())));
                }
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 1) {
                do {
                    doubleArrayList.m13359d(readDouble());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i6 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = m13047b0();
            m13063j0(m13047b02);
            int i7 = this.f23968c + m13047b02;
            while (this.f23968c < i7) {
                doubleArrayList.m13359d(Double.longBitsToDouble(m13041X()));
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: N */
        public long mo13031N() throws IOException {
            m13057g0(0);
            return m13049c0();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: O */
        public String mo13032O() throws IOException {
            return m13043Z(true);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: P */
        public void mo13033P(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 1) {
                    do {
                        list.add(Long.valueOf(mo13048c()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = m13047b0();
                m13063j0(m13047b0);
                int i5 = this.f23968c + m13047b0;
                while (this.f23968c < i5) {
                    list.add(Long.valueOf(m13041X()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 1) {
                do {
                    longArrayList.m13483d(mo13048c());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i6 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = m13047b0();
            m13063j0(m13047b02);
            int i7 = this.f23968c + m13047b02;
            while (this.f23968c < i7) {
                longArrayList.m13483d(m13041X());
            }
        }

        /* renamed from: Q */
        public final boolean m13034Q() {
            return this.f23968c == this.f23969d;
        }

        /* renamed from: R */
        public final byte m13035R() throws IOException {
            int i2 = this.f23968c;
            if (i2 == this.f23969d) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23967b;
            this.f23968c = i2 + 1;
            return bArr[i2];
        }

        /* renamed from: S */
        public final Object m13036S(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            switch (fieldType.ordinal()) {
                case 0:
                    return Double.valueOf(readDouble());
                case 1:
                    return Float.valueOf(readFloat());
                case 2:
                    return Long.valueOf(mo13031N());
                case 3:
                    return Long.valueOf(mo13046b());
                case 4:
                    return Integer.valueOf(mo13026I());
                case 5:
                    return Long.valueOf(mo13048c());
                case 6:
                    return Integer.valueOf(mo13062j());
                case 7:
                    return Boolean.valueOf(mo13064k());
                case 8:
                    return m13043Z(true);
                case 9:
                default:
                    throw new RuntimeException("unsupported field type.");
                case 10:
                    return mo13060i(cls, extensionRegistryLite);
                case 11:
                    return mo13024G();
                case 12:
                    return Integer.valueOf(mo13069p());
                case 13:
                    return Integer.valueOf(mo13074u());
                case 14:
                    return Integer.valueOf(mo13028K());
                case 15:
                    return Long.valueOf(mo13066m());
                case 16:
                    return Integer.valueOf(mo13076w());
                case 17:
                    return Long.valueOf(mo13077x());
            }
        }

        /* renamed from: T */
        public final <T> T m13037T(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2 = this.f23971f;
            this.f23971f = ((this.f23970e >>> 3) << 3) | 4;
            try {
                T mo13545i = schema.mo13545i();
                schema.mo13541e(mo13545i, this, extensionRegistryLite);
                schema.mo13539c(mo13545i);
                if (this.f23970e == this.f23971f) {
                    return mo13545i;
                }
                throw InvalidProtocolBufferException.m13462g();
            } finally {
                this.f23971f = i2;
            }
        }

        /* renamed from: U */
        public final int m13038U() throws IOException {
            m13053e0(4);
            return m13039V();
        }

        /* renamed from: V */
        public final int m13039V() {
            int i2 = this.f23968c;
            byte[] bArr = this.f23967b;
            this.f23968c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        /* renamed from: W */
        public final long m13040W() throws IOException {
            m13053e0(8);
            return m13041X();
        }

        /* renamed from: X */
        public final long m13041X() {
            int i2 = this.f23968c;
            byte[] bArr = this.f23967b;
            this.f23968c = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        /* renamed from: Y */
        public final <T> T m13042Y(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int m13047b0 = m13047b0();
            m13053e0(m13047b0);
            int i2 = this.f23969d;
            int i3 = this.f23968c + m13047b0;
            this.f23969d = i3;
            try {
                T mo13545i = schema.mo13545i();
                schema.mo13541e(mo13545i, this, extensionRegistryLite);
                schema.mo13539c(mo13545i);
                if (this.f23968c == i3) {
                    return mo13545i;
                }
                throw InvalidProtocolBufferException.m13462g();
            } finally {
                this.f23969d = i2;
            }
        }

        /* renamed from: Z */
        public String m13043Z(boolean z) throws IOException {
            m13057g0(2);
            int m13047b0 = m13047b0();
            if (m13047b0 == 0) {
                return "";
            }
            m13053e0(m13047b0);
            if (z) {
                byte[] bArr = this.f23967b;
                int i2 = this.f23968c;
                if (!Utf8.m13734j(bArr, i2, i2 + m13047b0)) {
                    throw InvalidProtocolBufferException.m13458c();
                }
            }
            String str = new String(this.f23967b, this.f23968c, m13047b0, Internal.f24211b);
            this.f23968c += m13047b0;
            return str;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: a */
        public void mo13044a(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.m13459d();
                    }
                    int m13047b0 = this.f23968c + m13047b0();
                    while (this.f23968c < m13047b0) {
                        list.add(Integer.valueOf(CodedInputStream.m13171b(m13047b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo13076w()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b02 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b02) {
                    intArrayList.m13449d(CodedInputStream.m13171b(m13047b0()));
                }
                return;
            }
            do {
                intArrayList.m13449d(mo13076w());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        /* renamed from: a0 */
        public void m13045a0(List<String> list, boolean z) throws IOException {
            int i2;
            int i3;
            if ((this.f23970e & 7) != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            if (!(list instanceof LazyStringList) || z) {
                do {
                    list.add(m13043Z(z));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.mo13472Q(mo13024G());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: b */
        public long mo13046b() throws IOException {
            m13057g0(0);
            return m13049c0();
        }

        /* renamed from: b0 */
        public final int m13047b0() throws IOException {
            int i2;
            int i3 = this.f23968c;
            int i4 = this.f23969d;
            if (i4 == i3) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23967b;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f23968c = i5;
                return b;
            }
            if (i4 - i5 < 9) {
                return (int) m13051d0();
            }
            int i6 = i5 + 1;
            int i7 = b ^ (bArr[i5] << 7);
            if (i7 < 0) {
                i2 = i7 ^ (-128);
            } else {
                int i8 = i6 + 1;
                int i9 = i7 ^ (bArr[i6] << 14);
                if (i9 >= 0) {
                    i2 = i9 ^ 16256;
                } else {
                    i6 = i8 + 1;
                    int i10 = i9 ^ (bArr[i8] << 21);
                    if (i10 < 0) {
                        i2 = i10 ^ (-2080896);
                    } else {
                        i8 = i6 + 1;
                        byte b2 = bArr[i6];
                        i2 = (i10 ^ (b2 << 28)) ^ 266354560;
                        if (b2 < 0) {
                            i6 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i6 + 1;
                                if (bArr[i6] < 0) {
                                    i6 = i8 + 1;
                                    if (bArr[i8] < 0) {
                                        i8 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i8 + 1;
                                            if (bArr[i8] < 0) {
                                                throw InvalidProtocolBufferException.m13460e();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i6 = i8;
            }
            this.f23968c = i6;
            return i2;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: c */
        public long mo13048c() throws IOException {
            m13057g0(1);
            return m13040W();
        }

        /* renamed from: c0 */
        public long m13049c0() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2;
            int i3 = this.f23968c;
            int i4 = this.f23969d;
            if (i4 == i3) {
                throw InvalidProtocolBufferException.m13463h();
            }
            byte[] bArr = this.f23967b;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b >= 0) {
                this.f23968c = i5;
                return b;
            }
            if (i4 - i5 < 9) {
                return m13051d0();
            }
            int i6 = i5 + 1;
            int i7 = b ^ (bArr[i5] << 7);
            if (i7 >= 0) {
                int i8 = i6 + 1;
                int i9 = i7 ^ (bArr[i6] << 14);
                if (i9 >= 0) {
                    i6 = i8;
                    j2 = i9 ^ 16256;
                } else {
                    i6 = i8 + 1;
                    int i10 = i9 ^ (bArr[i8] << 21);
                    if (i10 < 0) {
                        i2 = i10 ^ (-2080896);
                    } else {
                        long j5 = i10;
                        int i11 = i6 + 1;
                        long j6 = j5 ^ (bArr[i6] << 28);
                        if (j6 >= 0) {
                            j4 = 266354560;
                        } else {
                            i6 = i11 + 1;
                            long j7 = j6 ^ (bArr[i11] << 35);
                            if (j7 < 0) {
                                j3 = -34093383808L;
                            } else {
                                i11 = i6 + 1;
                                j6 = j7 ^ (bArr[i6] << 42);
                                if (j6 >= 0) {
                                    j4 = 4363953127296L;
                                } else {
                                    i6 = i11 + 1;
                                    j7 = j6 ^ (bArr[i11] << 49);
                                    if (j7 < 0) {
                                        j3 = -558586000294016L;
                                    } else {
                                        int i12 = i6 + 1;
                                        long j8 = (j7 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            i6 = i12 + 1;
                                            if (bArr[i12] < 0) {
                                                throw InvalidProtocolBufferException.m13460e();
                                            }
                                        } else {
                                            i6 = i12;
                                        }
                                        j2 = j8;
                                    }
                                }
                            }
                            j2 = j7 ^ j3;
                        }
                        j2 = j6 ^ j4;
                        i6 = i11;
                    }
                }
                this.f23968c = i6;
                return j2;
            }
            i2 = i7 ^ (-128);
            j2 = i2;
            this.f23968c = i6;
            return j2;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: d */
        public void mo13050d(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 2) {
                    int m13047b0 = m13047b0();
                    m13061i0(m13047b0);
                    int i5 = this.f23968c + m13047b0;
                    while (this.f23968c < i5) {
                        list.add(Integer.valueOf(m13039V()));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                do {
                    list.add(Integer.valueOf(mo13028K()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 2) {
                int m13047b02 = m13047b0();
                m13061i0(m13047b02);
                int i7 = this.f23968c + m13047b02;
                while (this.f23968c < i7) {
                    intArrayList.m13449d(m13039V());
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                intArrayList.m13449d(mo13028K());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        /* renamed from: d0 */
        public final long m13051d0() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                j2 |= (r3 & Byte.MAX_VALUE) << i2;
                if ((m13035R() & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.m13460e();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: e */
        public int mo13052e() {
            return this.f23970e;
        }

        /* renamed from: e0 */
        public final void m13053e0(int i2) throws IOException {
            if (i2 < 0 || i2 > this.f23969d - this.f23968c) {
                throw InvalidProtocolBufferException.m13463h();
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: f */
        public void mo13054f(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.m13459d();
                    }
                    int m13047b0 = this.f23968c + m13047b0();
                    while (this.f23968c < m13047b0) {
                        list.add(Long.valueOf(CodedInputStream.m13172c(m13049c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo13077x()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b02 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b02) {
                    longArrayList.m13483d(CodedInputStream.m13172c(m13049c0()));
                }
                return;
            }
            do {
                longArrayList.m13483d(mo13077x());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        /* renamed from: f0 */
        public final void m13055f0(int i2) throws IOException {
            if (this.f23968c != i2) {
                throw InvalidProtocolBufferException.m13463h();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        /* renamed from: g */
        public <T> void mo13056g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2;
            int i3 = this.f23970e;
            if ((i3 & 7) != 3) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(m13037T(schema, extensionRegistryLite));
                if (m13034Q()) {
                    return;
                } else {
                    i2 = this.f23968c;
                }
            } while (m13047b0() == i3);
            this.f23968c = i2;
        }

        /* renamed from: g0 */
        public final void m13057g0(int i2) throws IOException {
            if ((this.f23970e & 7) != i2) {
                throw InvalidProtocolBufferException.m13459d();
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: h */
        public void mo13058h(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.m13459d();
                    }
                    int m13047b0 = this.f23968c + m13047b0();
                    while (this.f23968c < m13047b0) {
                        list.add(Integer.valueOf(m13047b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo13069p()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b02 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b02) {
                    intArrayList.m13449d(m13047b0());
                }
                return;
            }
            do {
                intArrayList.m13449d(mo13069p());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        /* renamed from: h0 */
        public final void m13059h0(int i2) throws IOException {
            m13053e0(i2);
            this.f23968c += i2;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: i */
        public <T> T mo13060i(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m13057g0(2);
            return (T) m13042Y(Protobuf.f24310c.m13567a(cls), extensionRegistryLite);
        }

        /* renamed from: i0 */
        public final void m13061i0(int i2) throws IOException {
            m13053e0(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.m13462g();
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: j */
        public int mo13062j() throws IOException {
            m13057g0(5);
            return m13038U();
        }

        /* renamed from: j0 */
        public final void m13063j0(int i2) throws IOException {
            m13053e0(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.m13462g();
            }
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: k */
        public boolean mo13064k() throws IOException {
            m13057g0(0);
            return m13047b0() != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.Reader
        /* renamed from: l */
        public <T> void mo13065l(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i2;
            int i3 = this.f23970e;
            if ((i3 & 7) != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                list.add(m13042Y(schema, extensionRegistryLite));
                if (m13034Q()) {
                    return;
                } else {
                    i2 = this.f23968c;
                }
            } while (m13047b0() == i3);
            this.f23968c = i2;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: m */
        public long mo13066m() throws IOException {
            m13057g0(1);
            return m13040W();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: n */
        public void mo13067n(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo13046b()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b0) {
                    list.add(Long.valueOf(m13049c0()));
                }
                m13055f0(m13047b0);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 == 0) {
                do {
                    longArrayList.m13483d(mo13046b());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = this.f23968c + m13047b0();
            while (this.f23968c < m13047b02) {
                longArrayList.m13483d(m13049c0());
            }
            m13055f0(m13047b02);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: o */
        public <T> T mo13068o(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            m13057g0(3);
            return (T) m13037T(schema, extensionRegistryLite);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: p */
        public int mo13069p() throws IOException {
            m13057g0(0);
            return m13047b0();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: q */
        public void mo13070q(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Long.valueOf(mo13031N()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b0) {
                    list.add(Long.valueOf(m13049c0()));
                }
                m13055f0(m13047b0);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 == 0) {
                do {
                    longArrayList.m13483d(mo13031N());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = this.f23968c + m13047b0();
            while (this.f23968c < m13047b02) {
                longArrayList.m13483d(m13049c0());
            }
            m13055f0(m13047b02);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: r */
        public void mo13071r(List<Long> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof LongArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 1) {
                    do {
                        list.add(Long.valueOf(mo13066m()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = m13047b0();
                m13063j0(m13047b0);
                int i5 = this.f23968c + m13047b0;
                while (this.f23968c < i5) {
                    list.add(Long.valueOf(m13041X()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 1) {
                do {
                    longArrayList.m13483d(mo13066m());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i6 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = m13047b0();
            m13063j0(m13047b02);
            int i7 = this.f23968c + m13047b02;
            while (this.f23968c < i7) {
                longArrayList.m13483d(m13041X());
            }
        }

        @Override // com.google.protobuf.Reader
        public double readDouble() throws IOException {
            m13057g0(1);
            return Double.longBitsToDouble(m13040W());
        }

        @Override // com.google.protobuf.Reader
        public float readFloat() throws IOException {
            m13057g0(5);
            return Float.intBitsToFloat(m13038U());
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: s */
        public void mo13072s(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 0) {
                    do {
                        list.add(Integer.valueOf(mo13026I()));
                        if (m13034Q()) {
                            return;
                        } else {
                            i2 = this.f23968c;
                        }
                    } while (m13047b0() == this.f23970e);
                    this.f23968c = i2;
                    return;
                }
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b0 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b0) {
                    list.add(Integer.valueOf(m13047b0()));
                }
                m13055f0(m13047b0);
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 == 0) {
                do {
                    intArrayList.m13449d(mo13026I());
                    if (m13034Q()) {
                        return;
                    } else {
                        i3 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i3;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.m13459d();
            }
            int m13047b02 = this.f23968c + m13047b0();
            while (this.f23968c < m13047b02) {
                intArrayList.m13449d(m13047b0());
            }
            m13055f0(m13047b02);
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: t */
        public void mo13073t(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.m13459d();
                    }
                    int m13047b0 = this.f23968c + m13047b0();
                    while (this.f23968c < m13047b0) {
                        list.add(Integer.valueOf(m13047b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo13074u()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b02 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b02) {
                    intArrayList.m13449d(m13047b0());
                }
                return;
            }
            do {
                intArrayList.m13449d(mo13074u());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: u */
        public int mo13074u() throws IOException {
            m13057g0(0);
            return m13047b0();
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: v */
        public void mo13075v(List<Integer> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof IntArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 == 2) {
                    int m13047b0 = m13047b0();
                    m13061i0(m13047b0);
                    int i5 = this.f23968c + m13047b0;
                    while (this.f23968c < i5) {
                        list.add(Integer.valueOf(m13039V()));
                    }
                    return;
                }
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                do {
                    list.add(Integer.valueOf(mo13062j()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i6 = this.f23970e & 7;
            if (i6 == 2) {
                int m13047b02 = m13047b0();
                m13061i0(m13047b02);
                int i7 = this.f23968c + m13047b02;
                while (this.f23968c < i7) {
                    intArrayList.m13449d(m13039V());
                }
                return;
            }
            if (i6 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            do {
                intArrayList.m13449d(mo13062j());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: w */
        public int mo13076w() throws IOException {
            m13057g0(0);
            return CodedInputStream.m13171b(m13047b0());
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: x */
        public long mo13077x() throws IOException {
            m13057g0(0);
            return CodedInputStream.m13172c(m13049c0());
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: y */
        public void mo13078y(List<Boolean> list) throws IOException {
            int i2;
            int i3;
            if (!(list instanceof BooleanArrayList)) {
                int i4 = this.f23970e & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw InvalidProtocolBufferException.m13459d();
                    }
                    int m13047b0 = this.f23968c + m13047b0();
                    while (this.f23968c < m13047b0) {
                        list.add(Boolean.valueOf(m13047b0() != 0));
                    }
                    m13055f0(m13047b0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(mo13064k()));
                    if (m13034Q()) {
                        return;
                    } else {
                        i2 = this.f23968c;
                    }
                } while (m13047b0() == this.f23970e);
                this.f23968c = i2;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int i5 = this.f23970e & 7;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw InvalidProtocolBufferException.m13459d();
                }
                int m13047b02 = this.f23968c + m13047b0();
                while (this.f23968c < m13047b02) {
                    booleanArrayList.m13145d(m13047b0() != 0);
                }
                m13055f0(m13047b02);
                return;
            }
            do {
                booleanArrayList.m13145d(mo13064k());
                if (m13034Q()) {
                    return;
                } else {
                    i3 = this.f23968c;
                }
            } while (m13047b0() == this.f23970e);
            this.f23968c = i3;
        }

        @Override // com.google.protobuf.Reader
        /* renamed from: z */
        public String mo13079z() throws IOException {
            return m13043Z(false);
        }
    }

    public BinaryReader() {
    }

    public BinaryReader(C23441 c23441) {
    }
}
