package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;

/* loaded from: classes.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {

    /* renamed from: a */
    public byte[] f4081a;

    public ArrayReadWriteBuf(int i2) {
        this.f4081a = new byte[i2];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    /* renamed from: a */
    public String mo2850a(int i2, int i3) {
        byte[] bArr = this.f4081a;
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (!Utf8.DecodeUtil.m2871e(b)) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b2 = bArr[i2];
            if (Utf8.DecodeUtil.m2871e(b2)) {
                int i8 = i6 + 1;
                cArr[i6] = (char) b2;
                i2 = i7;
                while (true) {
                    i6 = i8;
                    if (i2 < i4) {
                        byte b3 = bArr[i2];
                        if (!Utf8.DecodeUtil.m2871e(b3)) {
                            break;
                        }
                        i2++;
                        i8 = i6 + 1;
                        cArr[i6] = (char) b3;
                    }
                }
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i7 >= i4 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        int i9 = i7 + 1;
                        Utf8.DecodeUtil.m2868b(b2, bArr[i7], bArr[i9], cArr, i6);
                        i2 = i9 + 1;
                        i6++;
                    } else {
                        if (i7 >= i4 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        int i10 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i11 = i10 + 1;
                        Utf8.DecodeUtil.m2867a(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                        i6 = i6 + 1 + 1;
                        i2 = i11 + 1;
                    }
                } else {
                    if (i7 >= i4) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    Utf8.DecodeUtil.m2869c(b2, bArr[i7], cArr, i6);
                    i2 = i7 + 1;
                    i6++;
                }
            }
        }
        return new String(cArr, 0, i6);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i2) {
        return this.f4081a[i2];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i2) {
        byte[] bArr = this.f4081a;
        return (bArr[i2] & 255) | (bArr[i2 + 3] << 24) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i2) {
        byte[] bArr = this.f4081a;
        long j2 = bArr[i2] & 255;
        int i3 = i2 + 1 + 1 + 1;
        long j3 = j2 | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j4 = j3 | ((bArr[i3] & 255) << 24);
        long j5 = j4 | ((bArr[r9] & 255) << 32);
        int i4 = i3 + 1 + 1 + 1;
        return j5 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i4]) << 48) | (bArr[i4 + 1] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i2) {
        byte[] bArr = this.f4081a;
        return (short) ((bArr[i2] & 255) | (bArr[i2 + 1] << 8));
    }

    public ArrayReadWriteBuf() {
        this.f4081a = new byte[10];
    }

    public ArrayReadWriteBuf(byte[] bArr, int i2) {
        this.f4081a = bArr;
    }
}
