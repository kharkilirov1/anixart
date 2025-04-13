package com.google.protobuf;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Logger;
import p000a.C0000a;

@CheckReturnValue
/* loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final ByteString f23981c = new LiteralByteString(Internal.f24212c);

    /* renamed from: d */
    public static final ByteArrayCopier f23982d;

    /* renamed from: b */
    public int f23983b = 0;

    /* renamed from: com.google.protobuf.ByteString$1 */
    public class C23481 extends AbstractByteIterator {

        /* renamed from: b */
        public int f23984b = 0;

        /* renamed from: c */
        public final int f23985c;

        public C23481() {
            this.f23985c = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23984b < this.f23985c;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i2 = this.f23984b;
            if (i2 >= this.f23985c) {
                throw new NoSuchElementException();
            }
            this.f23984b = i2 + 1;
            return ByteString.this.mo13163u(i2);
        }
    }

    /* renamed from: com.google.protobuf.ByteString$2 */
    public static class C23492 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(it.nextByte() & 255, it2.nextByte() & 255);
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
        }
    }

    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        public ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        /* renamed from: a */
        public byte[] mo13167a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }

        public ArraysByteArrayCopier(C23481 c23481) {
        }
    }

    public static final class BoundedByteString extends LiteralByteString {

        /* renamed from: f */
        public final int f23987f;

        /* renamed from: g */
        public final int f23988g;

        public BoundedByteString(byte[] bArr, int i2, int i3) {
            super(bArr);
            ByteString.m13150f(i2, i2 + i3, bArr.length);
            this.f23987f = i2;
            this.f23988g = i3;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        /* renamed from: I */
        public int mo13168I() {
            return this.f23987f;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        /* renamed from: d */
        public byte mo13159d(int i2) {
            ByteString.m13149e(i2, this.f23988g);
            return this.f23991e[this.f23987f + i2];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        /* renamed from: s */
        public void mo13161s(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f23991e, this.f23987f + i2, bArr, i3, i4);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.f23988g;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        /* renamed from: u */
        public byte mo13163u(int i2) {
            return this.f23991e[this.f23987f + i2];
        }
    }

    public interface ByteArrayCopier {
        /* renamed from: a */
        byte[] mo13167a(byte[] bArr, int i2, int i3);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class CodedBuilder {

        /* renamed from: a */
        public final CodedOutputStream f23989a;

        /* renamed from: b */
        public final byte[] f23990b;

        public CodedBuilder(int i2, C23481 c23481) {
            byte[] bArr = new byte[i2];
            this.f23990b = bArr;
            Logger logger = CodedOutputStream.f24038b;
            this.f23989a = new CodedOutputStream.ArrayEncoder(bArr, 0, i2);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        @Override // com.google.protobuf.ByteString
        /* renamed from: G */
        public void mo13157G(ByteOutput byteOutput) throws IOException {
            mo13156F(byteOutput);
        }

        /* renamed from: H */
        public abstract boolean mo13169H(ByteString byteString, int i2, int i3);

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public Iterator<Byte> iterator() {
            return new C23481();
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: t */
        public final int mo13162t() {
            return 0;
        }
    }

    public static class LiteralByteString extends LeafByteString {

        /* renamed from: e */
        public final byte[] f23991e;

        public LiteralByteString(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f23991e = bArr;
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: A */
        public final int mo13152A(int i2, int i3, int i4) {
            int mo13168I = mo13168I() + i3;
            return Utf8.f24397a.mo13747f(i2, this.f23991e, mo13168I, i4 + mo13168I);
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: C */
        public final ByteString mo13153C(int i2, int i3) {
            int m13150f = ByteString.m13150f(i2, i3, size());
            return m13150f == 0 ? ByteString.f23981c : new BoundedByteString(this.f23991e, mo13168I() + i2, m13150f);
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: E */
        public final String mo13155E(Charset charset) {
            return new String(this.f23991e, mo13168I(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: F */
        public final void mo13156F(ByteOutput byteOutput) throws IOException {
            byteOutput.mo13124R(this.f23991e, mo13168I(), size());
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        /* renamed from: H */
        public final boolean mo13169H(ByteString byteString, int i2, int i3) {
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
            int i4 = i2 + i3;
            if (i4 > byteString.size()) {
                StringBuilder m26w = C0000a.m26w("Ran off end of other: ", i2, ", ", i3, ", ");
                m26w.append(byteString.size());
                throw new IllegalArgumentException(m26w.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.mo13153C(i2, i4).equals(mo13153C(0, i3));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.f23991e;
            byte[] bArr2 = literalByteString.f23991e;
            int mo13168I = mo13168I() + i3;
            int mo13168I2 = mo13168I();
            int mo13168I3 = literalByteString.mo13168I() + i2;
            while (mo13168I2 < mo13168I) {
                if (bArr[mo13168I2] != bArr2[mo13168I3]) {
                    return false;
                }
                mo13168I2++;
                mo13168I3++;
            }
            return true;
        }

        /* renamed from: I */
        public int mo13168I() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: b */
        public final ByteBuffer mo13158b() {
            return ByteBuffer.wrap(this.f23991e, mo13168I(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: d */
        public byte mo13159d(int i2) {
            return this.f23991e[i2];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i2 = this.f23983b;
            int i3 = literalByteString.f23983b;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                return mo13169H(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: s */
        public void mo13161s(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f23991e, i2, bArr, i3, i4);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.f23991e.length;
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: u */
        public byte mo13163u(int i2) {
            return this.f23991e[i2];
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: x */
        public final boolean mo13164x() {
            int mo13168I = mo13168I();
            return Utf8.m13734j(this.f23991e, mo13168I, size() + mo13168I);
        }

        @Override // com.google.protobuf.ByteString
        /* renamed from: z */
        public final int mo13166z(int i2, int i3, int i4) {
            byte[] bArr = this.f23991e;
            int mo13168I = mo13168I() + i3;
            Charset charset = Internal.f24210a;
            for (int i5 = mo13168I; i5 < mo13168I + i4; i5++) {
                i2 = (i2 * 31) + bArr[i5];
            }
            return i2;
        }
    }

    public static final class Output extends OutputStream {
        public String toString() {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            objArr[1] = 0;
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        public SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        /* renamed from: a */
        public byte[] mo13167a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }

        public SystemByteArrayCopier(C23481 c23481) {
        }
    }

    static {
        f23982d = Android.m12992a() ? new SystemByteArrayCopier(null) : new ArraysByteArrayCopier(null);
    }

    /* renamed from: e */
    public static void m13149e(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(C0000a.m9f("Index > length: ", i2, ", ", i3));
            }
            throw new ArrayIndexOutOfBoundsException(C0000a.m7d("Index < 0: ", i2));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: f */
    public static int m13150f(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0000a.m8e("Beginning index: ", i2, " < 0"));
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException(C0000a.m9f("Beginning index larger than ending index: ", i2, ", ", i3));
        }
        throw new IndexOutOfBoundsException(C0000a.m9f("End index: ", i3, " >= ", i4));
    }

    /* renamed from: g */
    public static ByteString m13151g(byte[] bArr, int i2, int i3) {
        m13150f(i2, i2 + i3, bArr.length);
        return new LiteralByteString(f23982d.mo13167a(bArr, i2, i3));
    }

    /* renamed from: A */
    public abstract int mo13152A(int i2, int i3, int i4);

    /* renamed from: C */
    public abstract ByteString mo13153C(int i2, int i3);

    /* renamed from: D */
    public final byte[] m13154D() {
        int size = size();
        if (size == 0) {
            return Internal.f24212c;
        }
        byte[] bArr = new byte[size];
        mo13161s(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: E */
    public abstract String mo13155E(Charset charset);

    /* renamed from: F */
    public abstract void mo13156F(ByteOutput byteOutput) throws IOException;

    /* renamed from: G */
    public abstract void mo13157G(ByteOutput byteOutput) throws IOException;

    /* renamed from: b */
    public abstract ByteBuffer mo13158b();

    /* renamed from: d */
    public abstract byte mo13159d(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.f23983b;
        if (i2 == 0) {
            int size = size();
            i2 = mo13166z(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f23983b = i2;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    /* renamed from: r */
    public final void m13160r(byte[] bArr, int i2, int i3, int i4) {
        m13150f(i2, i2 + i4, size());
        m13150f(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            mo13161s(bArr, i2, i3, i4);
        }
    }

    /* renamed from: s */
    public abstract void mo13161s(byte[] bArr, int i2, int i3, int i4);

    public abstract int size();

    /* renamed from: t */
    public abstract int mo13162t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? TextFormatEscaper.m13637a(this) : C0000a.m20q(new StringBuilder(), TextFormatEscaper.m13637a(mo13153C(0, 47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract byte mo13163u(int i2);

    /* renamed from: x */
    public abstract boolean mo13164x();

    @Override // java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new C23481();
    }

    /* renamed from: z */
    public abstract int mo13166z(int i2, int i3, int i4);
}
