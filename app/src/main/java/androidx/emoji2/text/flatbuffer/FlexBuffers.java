package androidx.emoji2.text.flatbuffer;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class FlexBuffers {

    /* renamed from: a */
    public static final ReadBuf f4084a = new ArrayReadWriteBuf(new byte[]{0}, 1);

    public static class Blob extends Sized {

        /* renamed from: e */
        public static final Blob f4085e = new Blob(FlexBuffers.f4084a, 1, 1);

        public Blob(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* renamed from: a */
        public StringBuilder mo2857a(StringBuilder sb) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            sb.append(this.f4089a.mo2850a(this.f4090b, this.f4098d));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.f4089a.mo2850a(this.f4090b, this.f4098d);
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {

        /* renamed from: d */
        public static final Key f4086d = new Key(FlexBuffers.f4084a, 0, 0);

        public Key(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* renamed from: a */
        public StringBuilder mo2857a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f4090b == this.f4090b && key.f4091c == this.f4091c;
        }

        public int hashCode() {
            return this.f4090b ^ this.f4091c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i2 = this.f4090b;
            while (this.f4089a.get(i2) != 0) {
                i2++;
            }
            int i3 = this.f4090b;
            return this.f4089a.mo2850a(i3, i2 - i3);
        }
    }

    public static class KeyVector {

        /* renamed from: a */
        public final TypedVector f4087a;

        public KeyVector(TypedVector typedVector) {
            this.f4087a = typedVector;
        }

        public String toString() {
            StringBuilder m2872a = C0321a.m2872a('[');
            int i2 = 0;
            while (true) {
                TypedVector typedVector = this.f4087a;
                if (i2 >= typedVector.f4098d) {
                    m2872a.append("]");
                    return m2872a.toString();
                }
                typedVector.mo2862b(i2).m2861d(m2872a);
                if (i2 != this.f4087a.f4098d - 1) {
                    m2872a.append(", ");
                }
                i2++;
            }
        }
    }

    public static class Map extends Vector {

        /* renamed from: f */
        public static final Map f4088f = new Map(FlexBuffers.f4084a, 1, 1);

        public Map(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* renamed from: a */
        public StringBuilder mo2857a(StringBuilder sb) {
            Key key;
            sb.append("{ ");
            int i2 = this.f4090b - (this.f4091c * 3);
            ReadBuf readBuf = this.f4089a;
            int m2853b = FlexBuffers.m2853b(readBuf, i2, this.f4091c);
            ReadBuf readBuf2 = this.f4089a;
            int i3 = this.f4091c;
            KeyVector keyVector = new KeyVector(new TypedVector(readBuf, m2853b, FlexBuffers.m2852a(readBuf2, i2 + i3, i3), 4));
            int i4 = this.f4098d;
            Vector vector = new Vector(this.f4089a, this.f4090b, this.f4091c);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                TypedVector typedVector = keyVector.f4087a;
                if (i5 >= typedVector.f4098d) {
                    Key key2 = Key.f4086d;
                    key = Key.f4086d;
                } else {
                    int i6 = (typedVector.f4091c * i5) + typedVector.f4090b;
                    TypedVector typedVector2 = keyVector.f4087a;
                    ReadBuf readBuf3 = typedVector2.f4089a;
                    key = new Key(readBuf3, FlexBuffers.m2853b(readBuf3, i6, typedVector2.f4091c), 1);
                }
                sb.append(key.toString());
                sb.append("\" : ");
                sb.append(vector.mo2862b(i5).toString());
                if (i5 != i4 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }
    }

    public static abstract class Object {

        /* renamed from: a */
        public ReadBuf f4089a;

        /* renamed from: b */
        public int f4090b;

        /* renamed from: c */
        public int f4091c;

        public Object(ReadBuf readBuf, int i2, int i3) {
            this.f4089a = readBuf;
            this.f4090b = i2;
            this.f4091c = i3;
        }

        /* renamed from: a */
        public abstract StringBuilder mo2857a(StringBuilder sb);

        public String toString() {
            return mo2857a(new StringBuilder(128)).toString();
        }
    }

    public static abstract class Sized extends Object {

        /* renamed from: d */
        public final int f4098d;

        public Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.f4098d = FlexBuffers.m2852a(readBuf, i2 - i3, i3);
        }
    }

    public static class TypedVector extends Vector {

        /* renamed from: f */
        public final int f4099f;

        static {
            new TypedVector(FlexBuffers.f4084a, 1, 1, 1);
        }

        public TypedVector(ReadBuf readBuf, int i2, int i3, int i4) {
            super(readBuf, i2, i3);
            this.f4099f = i4;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        /* renamed from: b */
        public Reference mo2862b(int i2) {
            if (i2 >= this.f4098d) {
                Reference reference = Reference.f4092f;
                return Reference.f4092f;
            }
            return new Reference(this.f4089a, (i2 * this.f4091c) + this.f4090b, this.f4091c, 1, this.f4099f);
        }
    }

    public static class Unsigned {
    }

    public static class Vector extends Sized {

        /* renamed from: e */
        public static final Vector f4100e = new Vector(FlexBuffers.f4084a, 1, 1);

        public Vector(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        /* renamed from: a */
        public StringBuilder mo2857a(StringBuilder sb) {
            sb.append("[ ");
            int i2 = this.f4098d;
            for (int i3 = 0; i3 < i2; i3++) {
                mo2862b(i3).m2861d(sb);
                if (i3 != i2 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        /* renamed from: b */
        public Reference mo2862b(int i2) {
            long j2 = this.f4098d;
            long j3 = i2;
            if (j3 >= j2) {
                Reference reference = Reference.f4092f;
                return Reference.f4092f;
            }
            return new Reference(this.f4089a, (i2 * this.f4091c) + this.f4090b, this.f4091c, this.f4089a.get((int) ((j2 * this.f4091c) + this.f4090b + j3)) & 255);
        }
    }

    /* renamed from: a */
    public static int m2852a(ReadBuf readBuf, int i2, int i3) {
        return (int) m2855d(readBuf, i2, i3);
    }

    /* renamed from: b */
    public static int m2853b(ReadBuf readBuf, int i2, int i3) {
        return (int) (i2 - m2856e(readBuf, i2, i3));
    }

    /* renamed from: c */
    public static double m2854c(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 4) {
            return readBuf.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i2);
    }

    /* renamed from: d */
    public static long m2855d(ReadBuf readBuf, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = readBuf.get(i2);
        } else if (i3 == 2) {
            i4 = readBuf.getShort(i2);
        } else {
            if (i3 != 4) {
                if (i3 != 8) {
                    return -1L;
                }
                return readBuf.getLong(i2);
            }
            i4 = readBuf.getInt(i2);
        }
        return i4;
    }

    /* renamed from: e */
    public static long m2856e(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 1) {
            return readBuf.get(i2) & 255;
        }
        if (i3 == 2) {
            return readBuf.getShort(i2) & 65535;
        }
        if (i3 == 4) {
            return readBuf.getInt(i2) & 4294967295L;
        }
        if (i3 != 8) {
            return -1L;
        }
        return readBuf.getLong(i2);
    }

    public static class Reference {

        /* renamed from: f */
        public static final Reference f4092f = new Reference(FlexBuffers.f4084a, 0, 1, 0);

        /* renamed from: a */
        public ReadBuf f4093a;

        /* renamed from: b */
        public int f4094b;

        /* renamed from: c */
        public int f4095c;

        /* renamed from: d */
        public int f4096d;

        /* renamed from: e */
        public int f4097e;

        public Reference(ReadBuf readBuf, int i2, int i3, int i4) {
            this.f4093a = readBuf;
            this.f4094b = i2;
            this.f4095c = i3;
            this.f4096d = 1 << (i4 & 3);
            this.f4097e = i4 >> 2;
        }

        /* renamed from: a */
        public String m2858a() {
            int i2 = this.f4097e;
            if (i2 == 5) {
                int m2853b = FlexBuffers.m2853b(this.f4093a, this.f4094b, this.f4095c);
                ReadBuf readBuf = this.f4093a;
                int i3 = this.f4096d;
                return this.f4093a.mo2850a(m2853b, (int) FlexBuffers.m2856e(readBuf, m2853b - i3, i3));
            }
            if (!(i2 == 4)) {
                return "";
            }
            int m2853b2 = FlexBuffers.m2853b(this.f4093a, this.f4094b, this.f4096d);
            int i4 = m2853b2;
            while (this.f4093a.get(i4) != 0) {
                i4++;
            }
            return this.f4093a.mo2850a(m2853b2, i4 - m2853b2);
        }

        /* renamed from: b */
        public long m2859b() {
            int i2 = this.f4097e;
            if (i2 == 2) {
                return FlexBuffers.m2856e(this.f4093a, this.f4094b, this.f4095c);
            }
            if (i2 == 1) {
                return FlexBuffers.m2855d(this.f4093a, this.f4094b, this.f4095c);
            }
            if (i2 == 3) {
                return (long) FlexBuffers.m2854c(this.f4093a, this.f4094b, this.f4095c);
            }
            if (i2 == 10) {
                return m2860c().f4098d;
            }
            if (i2 == 26) {
                return FlexBuffers.m2852a(this.f4093a, this.f4094b, this.f4095c);
            }
            if (i2 == 5) {
                return Long.parseLong(m2858a());
            }
            if (i2 == 6) {
                ReadBuf readBuf = this.f4093a;
                return FlexBuffers.m2855d(readBuf, FlexBuffers.m2853b(readBuf, this.f4094b, this.f4095c), this.f4096d);
            }
            if (i2 == 7) {
                ReadBuf readBuf2 = this.f4093a;
                return FlexBuffers.m2856e(readBuf2, FlexBuffers.m2853b(readBuf2, this.f4094b, this.f4095c), this.f4096d);
            }
            if (i2 != 8) {
                return 0L;
            }
            ReadBuf readBuf3 = this.f4093a;
            return (long) FlexBuffers.m2854c(readBuf3, FlexBuffers.m2853b(readBuf3, this.f4094b, this.f4095c), this.f4095c);
        }

        /* renamed from: c */
        public Vector m2860c() {
            int i2 = this.f4097e;
            if (i2 == 10 || i2 == 9) {
                ReadBuf readBuf = this.f4093a;
                return new Vector(readBuf, FlexBuffers.m2853b(readBuf, this.f4094b, this.f4095c), this.f4096d);
            }
            if (i2 == 15) {
                ReadBuf readBuf2 = this.f4093a;
                return new TypedVector(readBuf2, FlexBuffers.m2853b(readBuf2, this.f4094b, this.f4095c), this.f4096d, 4);
            }
            if (!((i2 >= 11 && i2 <= 15) || i2 == 36)) {
                return Vector.f4100e;
            }
            ReadBuf readBuf3 = this.f4093a;
            return new TypedVector(readBuf3, FlexBuffers.m2853b(readBuf3, this.f4094b, this.f4095c), this.f4096d, (this.f4097e - 11) + 1);
        }

        /* renamed from: d */
        public StringBuilder m2861d(StringBuilder sb) {
            double m2854c;
            int i2;
            int m2852a;
            double d;
            long m2856e;
            Key key;
            Map map;
            Blob blob;
            int i3 = this.f4097e;
            if (i3 != 36) {
                long j2 = 0;
                switch (i3) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        if (i3 == 1) {
                            j2 = FlexBuffers.m2855d(this.f4093a, this.f4094b, this.f4095c);
                        } else if (i3 != 2) {
                            if (i3 == 3) {
                                m2854c = FlexBuffers.m2854c(this.f4093a, this.f4094b, this.f4095c);
                            } else if (i3 == 5) {
                                try {
                                    j2 = Long.parseLong(m2858a());
                                } catch (NumberFormatException unused) {
                                }
                            } else if (i3 == 6) {
                                ReadBuf readBuf = this.f4093a;
                                j2 = FlexBuffers.m2855d(readBuf, FlexBuffers.m2853b(readBuf, this.f4094b, this.f4095c), this.f4096d);
                            } else if (i3 == 7) {
                                ReadBuf readBuf2 = this.f4093a;
                                j2 = FlexBuffers.m2856e(readBuf2, FlexBuffers.m2853b(readBuf2, this.f4094b, this.f4095c), this.f4095c);
                            } else if (i3 != 8) {
                                if (i3 == 10) {
                                    i2 = m2860c().f4098d;
                                } else if (i3 == 26) {
                                    i2 = FlexBuffers.m2852a(this.f4093a, this.f4094b, this.f4095c);
                                }
                                j2 = i2;
                            } else {
                                ReadBuf readBuf3 = this.f4093a;
                                m2854c = FlexBuffers.m2854c(readBuf3, FlexBuffers.m2853b(readBuf3, this.f4094b, this.f4095c), this.f4096d);
                            }
                            j2 = (long) m2854c;
                        } else {
                            j2 = FlexBuffers.m2856e(this.f4093a, this.f4094b, this.f4095c);
                        }
                        sb.append(j2);
                        return sb;
                    case 2:
                    case 7:
                        sb.append(m2859b());
                        return sb;
                    case 3:
                    case 8:
                        if (i3 == 3) {
                            d = FlexBuffers.m2854c(this.f4093a, this.f4094b, this.f4095c);
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 5) {
                                        d = Double.parseDouble(m2858a());
                                    } else if (i3 == 6) {
                                        ReadBuf readBuf4 = this.f4093a;
                                        m2852a = FlexBuffers.m2852a(readBuf4, FlexBuffers.m2853b(readBuf4, this.f4094b, this.f4095c), this.f4096d);
                                    } else if (i3 == 7) {
                                        ReadBuf readBuf5 = this.f4093a;
                                        m2856e = FlexBuffers.m2856e(readBuf5, FlexBuffers.m2853b(readBuf5, this.f4094b, this.f4095c), this.f4096d);
                                        d = m2856e;
                                    } else if (i3 == 8) {
                                        ReadBuf readBuf6 = this.f4093a;
                                        d = FlexBuffers.m2854c(readBuf6, FlexBuffers.m2853b(readBuf6, this.f4094b, this.f4095c), this.f4096d);
                                    } else if (i3 == 10) {
                                        m2852a = m2860c().f4098d;
                                    } else if (i3 != 26) {
                                        d = 0.0d;
                                    }
                                }
                                m2856e = FlexBuffers.m2856e(this.f4093a, this.f4094b, this.f4095c);
                                d = m2856e;
                            } else {
                                m2852a = FlexBuffers.m2852a(this.f4093a, this.f4094b, this.f4095c);
                            }
                            d = m2852a;
                        }
                        sb.append(d);
                        return sb;
                    case 4:
                        if (i3 == 4) {
                            ReadBuf readBuf7 = this.f4093a;
                            key = new Key(readBuf7, FlexBuffers.m2853b(readBuf7, this.f4094b, this.f4095c), this.f4096d);
                        } else {
                            Key key2 = Key.f4086d;
                            key = Key.f4086d;
                        }
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        sb.append(key.toString());
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        return sb;
                    case 5:
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        sb.append(m2858a());
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        return sb;
                    case 9:
                        if (i3 == 9) {
                            ReadBuf readBuf8 = this.f4093a;
                            map = new Map(readBuf8, FlexBuffers.m2853b(readBuf8, this.f4094b, this.f4095c), this.f4096d);
                        } else {
                            map = Map.f4088f;
                        }
                        map.mo2857a(sb);
                        return sb;
                    case 10:
                        return m2860c().mo2857a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        StringBuilder m24u = C0000a.m24u("not_implemented:");
                        m24u.append(this.f4097e);
                        throw new FlexBufferException(m24u.toString());
                    case 25:
                        if (!(i3 == 25)) {
                            if (!(i3 == 5)) {
                                blob = Blob.f4085e;
                                Objects.requireNonNull(blob);
                                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                                sb.append(blob.f4089a.mo2850a(blob.f4090b, blob.f4098d));
                                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                                return sb;
                            }
                        }
                        ReadBuf readBuf9 = this.f4093a;
                        blob = new Blob(readBuf9, FlexBuffers.m2853b(readBuf9, this.f4094b, this.f4095c), this.f4096d);
                        Objects.requireNonNull(blob);
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        sb.append(blob.f4089a.mo2850a(blob.f4090b, blob.f4098d));
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        return sb;
                    case 26:
                        if (!(i3 == 26) ? m2859b() != 0 : this.f4093a.get(this.f4094b) != 0) {
                            r12 = true;
                        }
                        sb.append(r12);
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(m2860c());
            return sb;
        }

        public String toString() {
            return m2861d(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i2, int i3, int i4, int i5) {
            this.f4093a = readBuf;
            this.f4094b = i2;
            this.f4095c = i3;
            this.f4096d = i4;
            this.f4097e = i5;
        }
    }
}
