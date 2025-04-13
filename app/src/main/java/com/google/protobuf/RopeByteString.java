package com.google.protobuf;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
final class RopeByteString extends ByteString {

    /* renamed from: j */
    public static final int[] f24320j = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: e */
    public final int f24321e;

    /* renamed from: f */
    public final ByteString f24322f;

    /* renamed from: g */
    public final ByteString f24323g;

    /* renamed from: h */
    public final int f24324h;

    /* renamed from: i */
    public final int f24325i;

    /* renamed from: com.google.protobuf.RopeByteString$1 */
    public class C23921 extends ByteString.AbstractByteIterator {

        /* renamed from: b */
        public final PieceIterator f24326b;

        /* renamed from: c */
        public ByteString.ByteIterator f24327c = m13571a();

        public C23921(RopeByteString ropeByteString) {
            this.f24326b = new PieceIterator(ropeByteString, null);
        }

        /* renamed from: a */
        public final ByteString.ByteIterator m13571a() {
            if (!this.f24326b.hasNext()) {
                return null;
            }
            ByteString.LeafByteString next = this.f24326b.next();
            Objects.requireNonNull(next);
            return new ByteString.C23481();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24327c != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f24327c;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte nextByte = byteIterator.nextByte();
            if (!this.f24327c.hasNext()) {
                this.f24327c = m13571a();
            }
            return nextByte;
        }
    }

    public static class Balancer {

        /* renamed from: a */
        public final ArrayDeque<ByteString> f24328a = new ArrayDeque<>();
    }

    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* renamed from: b */
        public final ArrayDeque<RopeByteString> f24329b;

        /* renamed from: c */
        public ByteString.LeafByteString f24330c;

        public PieceIterator(ByteString byteString, C23921 c23921) {
            if (!(byteString instanceof RopeByteString)) {
                this.f24329b = null;
                this.f24330c = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.f24325i);
            this.f24329b = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.f24322f;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.f24329b.push(ropeByteString2);
                byteString2 = ropeByteString2.f24322f;
            }
            this.f24330c = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f24330c;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f24329b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = this.f24329b.pop().f24323g;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    this.f24329b.push(ropeByteString);
                    byteString = ropeByteString.f24322f;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.isEmpty());
            this.f24330c = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24330c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f24322f = byteString;
        this.f24323g = byteString2;
        int size = byteString.size();
        this.f24324h = size;
        this.f24321e = byteString2.size() + size;
        this.f24325i = Math.max(byteString.mo13162t(), byteString2.mo13162t()) + 1;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: A */
    public int mo13152A(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f24324h;
        if (i5 <= i6) {
            return this.f24322f.mo13152A(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f24323g.mo13152A(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f24323g.mo13152A(this.f24322f.mo13152A(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: C */
    public ByteString mo13153C(int i2, int i3) {
        int m13150f = ByteString.m13150f(i2, i3, this.f24321e);
        if (m13150f == 0) {
            return ByteString.f23981c;
        }
        if (m13150f == this.f24321e) {
            return this;
        }
        int i4 = this.f24324h;
        if (i3 <= i4) {
            return this.f24322f.mo13153C(i2, i3);
        }
        if (i2 >= i4) {
            return this.f24323g.mo13153C(i2 - i4, i3 - i4);
        }
        ByteString byteString = this.f24322f;
        return new RopeByteString(byteString.mo13153C(i2, byteString.size()), this.f24323g.mo13153C(0, i3 - this.f24324h));
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: E */
    public String mo13155E(Charset charset) {
        return new String(m13154D(), charset);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: F */
    public void mo13156F(ByteOutput byteOutput) throws IOException {
        this.f24322f.mo13156F(byteOutput);
        this.f24323g.mo13156F(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: G */
    public void mo13157G(ByteOutput byteOutput) throws IOException {
        this.f24323g.mo13157G(byteOutput);
        this.f24322f.mo13157G(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: b */
    public ByteBuffer mo13158b() {
        return ByteBuffer.wrap(m13154D()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: d */
    public byte mo13159d(int i2) {
        ByteString.m13149e(i2, this.f24321e);
        return mo13163u(i2);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f24321e != byteString.size()) {
            return false;
        }
        if (this.f24321e == 0) {
            return true;
        }
        int i2 = this.f23983b;
        int i3 = byteString.f23983b;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        PieceIterator pieceIterator = new PieceIterator(this, null);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString, null);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int size = leafByteString.size() - i4;
            int size2 = leafByteString2.size() - i5;
            int min = Math.min(size, size2);
            if (!(i4 == 0 ? leafByteString.mo13169H(leafByteString2, i5, min) : leafByteString2.mo13169H(leafByteString, i4, min))) {
                return false;
            }
            i6 += min;
            int i7 = this.f24321e;
            if (i6 >= i7) {
                if (i6 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                leafByteString = (ByteString.LeafByteString) pieceIterator.next();
                i4 = 0;
            } else {
                i4 += min;
                leafByteString = leafByteString;
            }
            if (min == size2) {
                leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
                i5 = 0;
            } else {
                i5 += min;
            }
        }
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C23921(this);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: s */
    public void mo13161s(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.f24324h;
        if (i5 <= i6) {
            this.f24322f.mo13161s(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.f24323g.mo13161s(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.f24322f.mo13161s(bArr, i2, i3, i7);
            this.f24323g.mo13161s(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f24321e;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: t */
    public int mo13162t() {
        return this.f24325i;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: u */
    public byte mo13163u(int i2) {
        int i3 = this.f24324h;
        return i2 < i3 ? this.f24322f.mo13163u(i2) : this.f24323g.mo13163u(i2 - i3);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: x */
    public boolean mo13164x() {
        int mo13152A = this.f24322f.mo13152A(0, 0, this.f24324h);
        ByteString byteString = this.f24323g;
        return byteString.mo13152A(mo13152A, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: y */
    public ByteString.ByteIterator iterator() {
        return new C23921(this);
    }

    @Override // com.google.protobuf.ByteString
    /* renamed from: z */
    public int mo13166z(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f24324h;
        if (i5 <= i6) {
            return this.f24322f.mo13166z(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f24323g.mo13166z(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f24323g.mo13166z(this.f24322f.mo13166z(i2, i3, i7), 0, i4 - i7);
    }

    public class RopeInputStream extends InputStream {

        /* renamed from: b */
        public PieceIterator f24331b;

        /* renamed from: c */
        public ByteString.LeafByteString f24332c;

        /* renamed from: d */
        public int f24333d;

        /* renamed from: e */
        public int f24334e;

        /* renamed from: f */
        public int f24335f;

        /* renamed from: g */
        public int f24336g;

        /* renamed from: a */
        public final void m13573a() {
            if (this.f24332c != null) {
                int i2 = this.f24334e;
                int i3 = this.f24333d;
                if (i2 == i3) {
                    this.f24335f += i3;
                    this.f24334e = 0;
                    if (!this.f24331b.hasNext()) {
                        this.f24332c = null;
                        this.f24333d = 0;
                    } else {
                        ByteString.LeafByteString next = this.f24331b.next();
                        this.f24332c = next;
                        this.f24333d = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            throw null;
        }

        /* renamed from: b */
        public final int m13574b(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (i4 > 0) {
                m13573a();
                if (this.f24332c == null) {
                    break;
                }
                int min = Math.min(this.f24333d - this.f24334e, i4);
                if (bArr != null) {
                    this.f24332c.m13160r(bArr, this.f24334e, i2, min);
                    i2 += min;
                }
                this.f24334e += min;
                i4 -= min;
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f24336g = this.f24335f + this.f24334e;
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
            int m13574b = m13574b(bArr, i2, i3);
            if (m13574b != 0) {
                return m13574b;
            }
            if (i3 > 0) {
                return -1;
            }
            throw null;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null, null);
            this.f24331b = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.f24332c = next;
            this.f24333d = next.size();
            this.f24334e = 0;
            this.f24335f = 0;
            m13574b(null, 0, this.f24336g);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j2 > ParserMinimalBase.MAX_INT_L) {
                j2 = 2147483647L;
            }
            return m13574b(null, 0, (int) j2);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            m13573a();
            ByteString.LeafByteString leafByteString = this.f24332c;
            if (leafByteString == null) {
                return -1;
            }
            int i2 = this.f24334e;
            this.f24334e = i2 + 1;
            return leafByteString.mo13159d(i2) & 255;
        }
    }
}
