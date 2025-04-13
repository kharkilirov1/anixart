package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class UnknownFieldSetLite {

    /* renamed from: f */
    public static final UnknownFieldSetLite f24377f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f24378a;

    /* renamed from: b */
    public int[] f24379b;

    /* renamed from: c */
    public Object[] f24380c;

    /* renamed from: d */
    public int f24381d;

    /* renamed from: e */
    public boolean f24382e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public static UnknownFieldSetLite m13666b() {
        return new UnknownFieldSetLite(0, new int[8], new Object[8], true);
    }

    /* renamed from: d */
    public static void m13667d(int i2, Object obj, Writer writer) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            writer.mo13116r(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            writer.mo13131k(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            writer.mo13138w(i3, (ByteString) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.m13459d());
            }
            writer.mo13126f(i3, ((Integer) obj).intValue());
        } else if (writer.mo13113l() == Writer.FieldOrder.ASCENDING) {
            writer.mo13137v(i3);
            ((UnknownFieldSetLite) obj).m13670e(writer);
            writer.mo13121I(i3);
        } else {
            writer.mo13121I(i3);
            ((UnknownFieldSetLite) obj).m13670e(writer);
            writer.mo13137v(i3);
        }
    }

    /* renamed from: a */
    public int m13668a() {
        int m13277s0;
        int i2 = this.f24381d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f24378a; i4++) {
            int i5 = this.f24379b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                m13277s0 = CodedOutputStream.m13277s0(i6, ((Long) this.f24380c[i4]).longValue());
            } else if (i7 == 1) {
                m13277s0 = CodedOutputStream.m13258Z(i6, ((Long) this.f24380c[i4]).longValue());
            } else if (i7 == 2) {
                m13277s0 = CodedOutputStream.m13253U(i6, (ByteString) this.f24380c[i4]);
            } else if (i7 == 3) {
                i3 = ((UnknownFieldSetLite) this.f24380c[i4]).m13668a() + (CodedOutputStream.m13274p0(i6) * 2) + i3;
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.m13459d());
                }
                m13277s0 = CodedOutputStream.m13257Y(i6, ((Integer) this.f24380c[i4]).intValue());
            }
            i3 = m13277s0 + i3;
        }
        this.f24381d = i3;
        return i3;
    }

    /* renamed from: c */
    public void m13669c(int i2, Object obj) {
        if (!this.f24382e) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f24378a;
        int[] iArr = this.f24379b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f24379b = Arrays.copyOf(iArr, i4);
            this.f24380c = Arrays.copyOf(this.f24380c, i4);
        }
        int[] iArr2 = this.f24379b;
        int i5 = this.f24378a;
        iArr2[i5] = i2;
        this.f24380c[i5] = obj;
        this.f24378a = i5 + 1;
    }

    /* renamed from: e */
    public void m13670e(Writer writer) throws IOException {
        if (this.f24378a == 0) {
            return;
        }
        if (writer.mo13113l() == Writer.FieldOrder.ASCENDING) {
            for (int i2 = 0; i2 < this.f24378a; i2++) {
                m13667d(this.f24379b[i2], this.f24380c[i2], writer);
            }
            return;
        }
        for (int i3 = this.f24378a - 1; i3 >= 0; i3--) {
            m13667d(this.f24379b[i3], this.f24380c[i3], writer);
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.f24378a;
        if (i2 == unknownFieldSetLite.f24378a) {
            int[] iArr = this.f24379b;
            int[] iArr2 = unknownFieldSetLite.f24379b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                Object[] objArr = this.f24380c;
                Object[] objArr2 = unknownFieldSetLite.f24380c;
                int i4 = this.f24378a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f24378a;
        int i3 = (527 + i2) * 31;
        int[] iArr = this.f24379b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f24380c;
        int i8 = this.f24378a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f24381d = -1;
        this.f24378a = i2;
        this.f24379b = iArr;
        this.f24380c = objArr;
        this.f24382e = z;
    }
}
