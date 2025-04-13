package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString;

/* loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte> {

    /* renamed from: b */
    public static final ByteString f65623b = new LiteralByteString(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: a */
    public static ByteString m33223a(Iterator<ByteString> it, int i2) {
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return m33223a(it, i3).m33231b(m33223a(it, i2 - i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* renamed from: d */
    public static ByteString m33224d(Iterable<ByteString> iterable) {
        ?? r0;
        if (iterable instanceof Collection) {
            r0 = (Collection) iterable;
        } else {
            r0 = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                r0.add(it.next());
            }
        }
        return r0.isEmpty() ? f65623b : m33223a(r0.iterator(), r0.size());
    }

    /* renamed from: e */
    public static ByteString m33225e(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* renamed from: x */
    public static Output m33226x() {
        return new Output(128);
    }

    /* renamed from: A */
    public abstract int mo33227A();

    /* renamed from: C */
    public abstract String mo33228C(String str) throws UnsupportedEncodingException;

    /* renamed from: D */
    public String m33229D() {
        try {
            return mo33228C("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* renamed from: E */
    public abstract void mo33230E(OutputStream outputStream, int i2, int i3) throws IOException;

    /* renamed from: b */
    public ByteString m33231b(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 >= ParserMinimalBase.MAX_INT_L) {
            throw new IllegalArgumentException(C0576a.m4112k(53, "ByteString would be too long: ", size, "+", size2));
        }
        int[] iArr = RopeByteString.f65686i;
        RopeByteString ropeByteString = this instanceof RopeByteString ? (RopeByteString) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            return RopeByteString.m33338F(this, byteString);
        }
        if (ropeByteString != null) {
            if (byteString.size() + ropeByteString.f65689e.size() < 128) {
                return new RopeByteString(ropeByteString.f65688d, RopeByteString.m33338F(ropeByteString.f65689e, byteString));
            }
        }
        if (ropeByteString != null && ropeByteString.f65688d.mo33233r() > ropeByteString.f65689e.mo33233r() && ropeByteString.f65691g > byteString.mo33233r()) {
            return new RopeByteString(ropeByteString.f65688d, new RopeByteString(ropeByteString.f65689e, byteString));
        }
        if (size3 >= RopeByteString.f65686i[Math.max(mo33233r(), byteString.mo33233r()) + 1]) {
            return new RopeByteString(this, byteString);
        }
        RopeByteString.Balancer balancer = new RopeByteString.Balancer(null);
        balancer.m33339a(this);
        balancer.m33339a(byteString);
        ByteString pop = balancer.f65693a.pop();
        while (!balancer.f65693a.isEmpty()) {
            pop = new RopeByteString(balancer.f65693a.pop(), pop);
        }
        return pop;
    }

    /* renamed from: f */
    public void m33232f(byte[] bArr, int i2, int i3, int i4) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0576a.m4111j(30, "Source offset < 0: ", i2));
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(C0576a.m4111j(30, "Target offset < 0: ", i3));
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(C0576a.m4111j(23, "Length < 0: ", i4));
        }
        int i5 = i2 + i4;
        if (i5 > size()) {
            throw new IndexOutOfBoundsException(C0576a.m4111j(34, "Source end offset < 0: ", i5));
        }
        int i6 = i3 + i4;
        if (i6 > bArr.length) {
            throw new IndexOutOfBoundsException(C0576a.m4111j(34, "Target end offset < 0: ", i6));
        }
        if (i4 > 0) {
            mo33221g(bArr, i2, i3, i4);
        }
    }

    /* renamed from: g */
    public abstract void mo33221g(byte[] bArr, int i2, int i3, int i4);

    /* renamed from: r */
    public abstract int mo33233r();

    /* renamed from: s */
    public abstract boolean mo33234s();

    public abstract int size();

    /* renamed from: t */
    public abstract boolean mo33235t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public abstract ByteIterator iterator();

    /* renamed from: y */
    public abstract int mo33236y(int i2, int i3, int i4);

    /* renamed from: z */
    public abstract int mo33237z(int i2, int i3, int i4);

    public static final class Output extends OutputStream {

        /* renamed from: g */
        public static final byte[] f65624g = new byte[0];

        /* renamed from: b */
        public final int f65625b;

        /* renamed from: c */
        public final ArrayList<ByteString> f65626c;

        /* renamed from: d */
        public int f65627d;

        /* renamed from: e */
        public byte[] f65628e;

        /* renamed from: f */
        public int f65629f;

        public Output(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f65625b = i2;
            this.f65626c = new ArrayList<>();
            this.f65628e = new byte[i2];
        }

        /* renamed from: a */
        public final void m33238a(int i2) {
            this.f65626c.add(new LiteralByteString(this.f65628e));
            int length = this.f65627d + this.f65628e.length;
            this.f65627d = length;
            this.f65628e = new byte[Math.max(this.f65625b, Math.max(i2, length >>> 1))];
            this.f65629f = 0;
        }

        /* renamed from: b */
        public final void m33239b() {
            int i2 = this.f65629f;
            byte[] bArr = this.f65628e;
            if (i2 >= bArr.length) {
                this.f65626c.add(new LiteralByteString(this.f65628e));
                this.f65628e = f65624g;
            } else if (i2 > 0) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
                this.f65626c.add(new LiteralByteString(bArr2));
            }
            this.f65627d += this.f65629f;
            this.f65629f = 0;
        }

        /* renamed from: c */
        public synchronized ByteString m33240c() {
            m33239b();
            return ByteString.m33224d(this.f65626c);
        }

        public String toString() {
            int i2;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i2 = this.f65627d + this.f65629f;
            }
            objArr[1] = Integer.valueOf(i2);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            if (this.f65629f == this.f65628e.length) {
                m33238a(1);
            }
            byte[] bArr = this.f65628e;
            int i3 = this.f65629f;
            this.f65629f = i3 + 1;
            bArr[i3] = (byte) i2;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = this.f65628e;
            int length = bArr2.length;
            int i4 = this.f65629f;
            if (i3 <= length - i4) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f65629f += i3;
            } else {
                int length2 = bArr2.length - i4;
                System.arraycopy(bArr, i2, bArr2, i4, length2);
                int i5 = i3 - length2;
                m33238a(i5);
                System.arraycopy(bArr, i2 + length2, this.f65628e, 0, i5);
                this.f65629f = i5;
            }
        }
    }
}
