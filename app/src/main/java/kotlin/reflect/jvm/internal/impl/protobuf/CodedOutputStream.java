package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.room.util.C0576a;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class CodedOutputStream {

    /* renamed from: a */
    public final byte[] f65640a;

    /* renamed from: b */
    public final int f65641b;

    /* renamed from: e */
    public final OutputStream f65644e;

    /* renamed from: d */
    public int f65643d = 0;

    /* renamed from: c */
    public int f65642c = 0;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f65644e = outputStream;
        this.f65640a = bArr;
        this.f65641b = bArr.length;
    }

    /* renamed from: a */
    public static int m33261a(ByteString byteString) {
        return byteString.size() + m33267g(byteString.size());
    }

    /* renamed from: b */
    public static int m33262b(int i2, int i3) {
        return m33269i(i2) + m33264d(i3);
    }

    /* renamed from: c */
    public static int m33263c(int i2, int i3) {
        return m33264d(i3) + m33269i(i2);
    }

    /* renamed from: d */
    public static int m33264d(int i2) {
        if (i2 >= 0) {
            return m33267g(i2);
        }
        return 10;
    }

    /* renamed from: e */
    public static int m33265e(int i2, MessageLite messageLite) {
        int m33269i = m33269i(i2);
        int mo32957c = messageLite.mo32957c();
        return m33269i + m33267g(mo32957c) + mo32957c;
    }

    /* renamed from: f */
    public static int m33266f(MessageLite messageLite) {
        int mo32957c = messageLite.mo32957c();
        return m33267g(mo32957c) + mo32957c;
    }

    /* renamed from: g */
    public static int m33267g(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: h */
    public static int m33268h(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: i */
    public static int m33269i(int i2) {
        return m33267g((i2 << 3) | 0);
    }

    /* renamed from: k */
    public static CodedOutputStream m33270k(OutputStream outputStream, int i2) {
        return new CodedOutputStream(outputStream, new byte[i2]);
    }

    /* renamed from: A */
    public void m33271A(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            m33283u((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        m33283u((int) j2);
    }

    /* renamed from: B */
    public void m33272B(int i2, int i3) throws IOException {
        m33288z((i2 << 3) | i3);
    }

    /* renamed from: j */
    public void m33273j() throws IOException {
        if (this.f65644e != null) {
            m33274l();
        }
    }

    /* renamed from: l */
    public final void m33274l() throws IOException {
        OutputStream outputStream = this.f65644e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f65640a, 0, this.f65642c);
        this.f65642c = 0;
    }

    /* renamed from: m */
    public void m33275m(int i2, ByteString byteString) throws IOException {
        m33288z((i2 << 3) | 2);
        m33276n(byteString);
    }

    /* renamed from: n */
    public void m33276n(ByteString byteString) throws IOException {
        m33288z(byteString.size());
        m33284v(byteString);
    }

    /* renamed from: o */
    public void m33277o(int i2, int i3) throws IOException {
        m33288z((i2 << 3) | 0);
        if (i3 >= 0) {
            m33288z(i3);
        } else {
            m33271A(i3);
        }
    }

    /* renamed from: p */
    public void m33278p(int i2) throws IOException {
        if (i2 >= 0) {
            m33288z(i2);
        } else {
            m33271A(i2);
        }
    }

    /* renamed from: q */
    public void m33279q(int i2, int i3) throws IOException {
        m33288z((i2 << 3) | 0);
        if (i3 >= 0) {
            m33288z(i3);
        } else {
            m33271A(i3);
        }
    }

    /* renamed from: r */
    public void m33280r(int i2) throws IOException {
        if (i2 >= 0) {
            m33288z(i2);
        } else {
            m33271A(i2);
        }
    }

    /* renamed from: s */
    public void m33281s(int i2, MessageLite messageLite) throws IOException {
        m33288z((i2 << 3) | 2);
        m33288z(messageLite.mo32957c());
        messageLite.mo32960f(this);
    }

    /* renamed from: t */
    public void m33282t(MessageLite messageLite) throws IOException {
        m33288z(messageLite.mo32957c());
        messageLite.mo32960f(this);
    }

    /* renamed from: u */
    public void m33283u(int i2) throws IOException {
        byte b = (byte) i2;
        if (this.f65642c == this.f65641b) {
            m33274l();
        }
        byte[] bArr = this.f65640a;
        int i3 = this.f65642c;
        this.f65642c = i3 + 1;
        bArr[i3] = b;
        this.f65643d++;
    }

    /* renamed from: v */
    public void m33284v(ByteString byteString) throws IOException {
        int size = byteString.size();
        int i2 = this.f65641b;
        int i3 = this.f65642c;
        int i4 = i2 - i3;
        if (i4 >= size) {
            byteString.m33232f(this.f65640a, 0, i3, size);
            this.f65642c += size;
            this.f65643d += size;
            return;
        }
        byteString.m33232f(this.f65640a, 0, i3, i4);
        int i5 = i4 + 0;
        int i6 = size - i4;
        this.f65642c = this.f65641b;
        this.f65643d += i4;
        m33274l();
        if (i6 <= this.f65641b) {
            byteString.m33232f(this.f65640a, i5, 0, i6);
            this.f65642c = i6;
        } else {
            OutputStream outputStream = this.f65644e;
            if (i5 < 0) {
                throw new IndexOutOfBoundsException(C0576a.m4111j(30, "Source offset < 0: ", i5));
            }
            if (i6 < 0) {
                throw new IndexOutOfBoundsException(C0576a.m4111j(23, "Length < 0: ", i6));
            }
            int i7 = i5 + i6;
            if (i7 > byteString.size()) {
                throw new IndexOutOfBoundsException(C0576a.m4111j(39, "Source end offset exceeded: ", i7));
            }
            if (i6 > 0) {
                byteString.mo33230E(outputStream, i5, i6);
            }
        }
        this.f65643d += i6;
    }

    /* renamed from: w */
    public void m33285w(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i2 = this.f65641b;
        int i3 = this.f65642c;
        int i4 = i2 - i3;
        if (i4 >= length) {
            System.arraycopy(bArr, 0, this.f65640a, i3, length);
            this.f65642c += length;
            this.f65643d += length;
            return;
        }
        System.arraycopy(bArr, 0, this.f65640a, i3, i4);
        int i5 = i4 + 0;
        int i6 = length - i4;
        this.f65642c = this.f65641b;
        this.f65643d += i4;
        m33274l();
        if (i6 <= this.f65641b) {
            System.arraycopy(bArr, i5, this.f65640a, 0, i6);
            this.f65642c = i6;
        } else {
            this.f65644e.write(bArr, i5, i6);
        }
        this.f65643d += i6;
    }

    /* renamed from: x */
    public void m33286x(int i2) throws IOException {
        m33283u(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: y */
    public void m33287y(long j2) throws IOException {
        m33283u(((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        m33283u(((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: z */
    public void m33288z(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            m33283u((i2 & 127) | 128);
            i2 >>>= 7;
        }
        m33283u(i2);
    }
}
