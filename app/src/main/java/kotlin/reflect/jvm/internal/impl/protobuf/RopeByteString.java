package kotlin.reflect.jvm.internal.impl.protobuf;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p000a.C0000a;

/* loaded from: classes3.dex */
class RopeByteString extends ByteString {

    /* renamed from: i */
    public static final int[] f65686i;

    /* renamed from: c */
    public final int f65687c;

    /* renamed from: d */
    public final ByteString f65688d;

    /* renamed from: e */
    public final ByteString f65689e;

    /* renamed from: f */
    public final int f65690f;

    /* renamed from: g */
    public final int f65691g;

    /* renamed from: h */
    public int f65692h = 0;

    public static class PieceIterator implements Iterator<LiteralByteString> {

        /* renamed from: b */
        public final Stack<RopeByteString> f65694b = new Stack<>();

        /* renamed from: c */
        public LiteralByteString f65695c;

        public PieceIterator(ByteString byteString, C66991 c66991) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f65694b.push(ropeByteString);
                byteString = ropeByteString.f65688d;
            }
            this.f65695c = (LiteralByteString) byteString;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LiteralByteString next() {
            LiteralByteString literalByteString;
            LiteralByteString literalByteString2 = this.f65695c;
            if (literalByteString2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (this.f65694b.isEmpty()) {
                    literalByteString = null;
                    break;
                }
                ByteString byteString = this.f65694b.pop().f65689e;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    this.f65694b.push(ropeByteString);
                    byteString = ropeByteString.f65688d;
                }
                literalByteString = (LiteralByteString) byteString;
                if (!(literalByteString.size() == 0)) {
                    break;
                }
            }
            this.f65695c = literalByteString;
            return literalByteString2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65695c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class RopeByteIterator implements ByteString.ByteIterator {

        /* renamed from: b */
        public final PieceIterator f65696b;

        /* renamed from: c */
        public ByteString.ByteIterator f65697c;

        /* renamed from: d */
        public int f65698d;

        public RopeByteIterator(RopeByteString ropeByteString, C66991 c66991) {
            PieceIterator pieceIterator = new PieceIterator(ropeByteString, null);
            this.f65696b = pieceIterator;
            this.f65697c = pieceIterator.next().iterator();
            this.f65698d = ropeByteString.f65687c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65698d > 0;
        }

        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f65697c.hasNext()) {
                this.f65697c = this.f65696b.next().iterator();
            }
            this.f65698d--;
            return this.f65697c.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        f65686i = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = f65686i;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            i5++;
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f65688d = byteString;
        this.f65689e = byteString2;
        int size = byteString.size();
        this.f65690f = size;
        this.f65687c = byteString2.size() + size;
        this.f65691g = Math.max(byteString.mo33233r(), byteString2.mo33233r()) + 1;
    }

    /* renamed from: F */
    public static LiteralByteString m33338F(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.m33232f(bArr, 0, 0, size);
        byteString2.m33232f(bArr, 0, size, size2);
        return new LiteralByteString(bArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: A */
    public int mo33227A() {
        return this.f65692h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: C */
    public String mo33228C(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        int i2 = this.f65687c;
        if (i2 == 0) {
            bArr = Internal.f65673a;
        } else {
            byte[] bArr2 = new byte[i2];
            mo33221g(bArr2, 0, 0, i2);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: E */
    public void mo33230E(OutputStream outputStream, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        int i5 = this.f65690f;
        if (i4 <= i5) {
            this.f65688d.mo33230E(outputStream, i2, i3);
        } else {
            if (i2 >= i5) {
                this.f65689e.mo33230E(outputStream, i2 - i5, i3);
                return;
            }
            int i6 = i5 - i2;
            this.f65688d.mo33230E(outputStream, i2, i6);
            this.f65689e.mo33230E(outputStream, 0, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int mo33227A;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f65687c != byteString.size()) {
            return false;
        }
        if (this.f65687c == 0) {
            return true;
        }
        if (this.f65692h != 0 && (mo33227A = byteString.mo33227A()) != 0 && this.f65692h != mo33227A) {
            return false;
        }
        PieceIterator pieceIterator = new PieceIterator(this, null);
        LiteralByteString literalByteString = (LiteralByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString, null);
        LiteralByteString literalByteString2 = (LiteralByteString) pieceIterator2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = literalByteString.size() - i2;
            int size2 = literalByteString2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? literalByteString.m33337G(literalByteString2, i3, min) : literalByteString2.m33337G(literalByteString, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f65687c;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                literalByteString = (LiteralByteString) pieceIterator.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == size2) {
                literalByteString2 = (LiteralByteString) pieceIterator2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: g */
    public void mo33221g(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.f65690f;
        if (i5 <= i6) {
            this.f65688d.mo33221g(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.f65689e.mo33221g(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.f65688d.mo33221g(bArr, i2, i3, i7);
            this.f65689e.mo33221g(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    public int hashCode() {
        int i2 = this.f65692h;
        if (i2 == 0) {
            int i3 = this.f65687c;
            i2 = mo33236y(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f65692h = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new RopeByteIterator(this, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: r */
    public int mo33233r() {
        return this.f65691g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: s */
    public boolean mo33234s() {
        return this.f65687c >= f65686i[this.f65691g];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65687c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: t */
    public boolean mo33235t() {
        int mo33237z = this.f65688d.mo33237z(0, 0, this.f65690f);
        ByteString byteString = this.f65689e;
        return byteString.mo33237z(mo33237z, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: u */
    public ByteString.ByteIterator iterator() {
        return new RopeByteIterator(this, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: y */
    public int mo33236y(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f65690f;
        if (i5 <= i6) {
            return this.f65688d.mo33236y(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f65689e.mo33236y(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f65689e.mo33236y(this.f65688d.mo33236y(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: z */
    public int mo33237z(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f65690f;
        if (i5 <= i6) {
            return this.f65688d.mo33237z(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f65689e.mo33237z(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f65689e.mo33237z(this.f65688d.mo33237z(i2, i3, i7), 0, i4 - i7);
    }

    public static class Balancer {

        /* renamed from: a */
        public final Stack<ByteString> f65693a = new Stack<>();

        public Balancer() {
        }

        /* renamed from: a */
        public final void m33339a(ByteString byteString) {
            if (!byteString.mo33234s()) {
                if (!(byteString instanceof RopeByteString)) {
                    String valueOf = String.valueOf(byteString.getClass());
                    throw new IllegalArgumentException(C0000a.m20q(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
                }
                RopeByteString ropeByteString = (RopeByteString) byteString;
                m33339a(ropeByteString.f65688d);
                m33339a(ropeByteString.f65689e);
                return;
            }
            int size = byteString.size();
            int[] iArr = RopeByteString.f65686i;
            int binarySearch = Arrays.binarySearch(iArr, size);
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i2 = iArr[binarySearch + 1];
            if (this.f65693a.isEmpty() || this.f65693a.peek().size() >= i2) {
                this.f65693a.push(byteString);
                return;
            }
            int i3 = iArr[binarySearch];
            ByteString pop = this.f65693a.pop();
            while (!this.f65693a.isEmpty() && this.f65693a.peek().size() < i3) {
                pop = new RopeByteString(this.f65693a.pop(), pop);
            }
            RopeByteString ropeByteString2 = new RopeByteString(pop, byteString);
            while (!this.f65693a.isEmpty()) {
                int i4 = ropeByteString2.f65687c;
                int[] iArr2 = RopeByteString.f65686i;
                int binarySearch2 = Arrays.binarySearch(iArr2, i4);
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (this.f65693a.peek().size() >= iArr2[binarySearch2 + 1]) {
                    break;
                } else {
                    ropeByteString2 = new RopeByteString(this.f65693a.pop(), ropeByteString2);
                }
            }
            this.f65693a.push(ropeByteString2);
        }

        public Balancer(C66991 c66991) {
        }
    }

    public class RopeInputStream extends InputStream {

        /* renamed from: b */
        public PieceIterator f65699b;

        /* renamed from: c */
        public LiteralByteString f65700c;

        /* renamed from: d */
        public int f65701d;

        /* renamed from: e */
        public int f65702e;

        /* renamed from: f */
        public int f65703f;

        /* renamed from: g */
        public int f65704g;

        /* renamed from: h */
        public final /* synthetic */ RopeByteString f65705h;

        /* renamed from: a */
        public final void m33341a() {
            if (this.f65700c != null) {
                int i2 = this.f65702e;
                int i3 = this.f65701d;
                if (i2 == i3) {
                    this.f65703f += i3;
                    this.f65702e = 0;
                    if (!this.f65699b.hasNext()) {
                        this.f65700c = null;
                        this.f65701d = 0;
                    } else {
                        LiteralByteString next = this.f65699b.next();
                        this.f65700c = next;
                        this.f65701d = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f65705h.f65687c - (this.f65703f + this.f65702e);
        }

        /* renamed from: b */
        public final void m33342b() {
            PieceIterator pieceIterator = new PieceIterator(this.f65705h, null);
            this.f65699b = pieceIterator;
            LiteralByteString next = pieceIterator.next();
            this.f65700c = next;
            this.f65701d = next.size();
            this.f65702e = 0;
            this.f65703f = 0;
        }

        /* renamed from: c */
        public final int m33343c(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                m33341a();
                if (this.f65700c != null) {
                    int min = Math.min(this.f65701d - this.f65702e, i4);
                    if (bArr != null) {
                        this.f65700c.m33232f(bArr, this.f65702e, i2, min);
                        i2 += min;
                    }
                    this.f65702e += min;
                    i4 -= min;
                } else if (i4 == i3) {
                    return -1;
                }
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f65704g = this.f65703f + this.f65702e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            Objects.requireNonNull(bArr);
            if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            return m33343c(bArr, i2, i3);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m33342b();
            m33343c(null, 0, this.f65704g);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > ParserMinimalBase.MAX_INT_L) {
                j2 = 2147483647L;
            }
            return m33343c(null, 0, (int) j2);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m33341a();
            LiteralByteString literalByteString = this.f65700c;
            if (literalByteString == null) {
                return -1;
            }
            int i2 = this.f65702e;
            this.f65702e = i2 + 1;
            return literalByteString.mo33219F(i2) & 255;
        }
    }
}
