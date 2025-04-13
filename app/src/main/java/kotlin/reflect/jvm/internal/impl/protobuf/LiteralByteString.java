package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.room.util.C0576a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p000a.C0000a;

/* loaded from: classes3.dex */
class LiteralByteString extends ByteString {

    /* renamed from: c */
    public final byte[] f65681c;

    /* renamed from: d */
    public int f65682d = 0;

    public class LiteralByteIterator implements ByteString.ByteIterator {

        /* renamed from: b */
        public int f65683b = 0;

        /* renamed from: c */
        public final int f65684c;

        public LiteralByteIterator(C66981 c66981) {
            this.f65684c = LiteralByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65683b < this.f65684c;
        }

        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = LiteralByteString.this.f65681c;
                int i2 = this.f65683b;
                this.f65683b = i2 + 1;
                return bArr[i2];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public LiteralByteString(byte[] bArr) {
        this.f65681c = bArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: A */
    public int mo33227A() {
        return this.f65682d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: C */
    public String mo33228C(String str) throws UnsupportedEncodingException {
        return new String(this.f65681c, mo33220H(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: E */
    public void mo33230E(OutputStream outputStream, int i2, int i3) throws IOException {
        outputStream.write(this.f65681c, mo33220H() + i2, i3);
    }

    /* renamed from: F */
    public byte mo33219F(int i2) {
        return this.f65681c[i2];
    }

    /* renamed from: G */
    public boolean m33337G(LiteralByteString literalByteString, int i2, int i3) {
        if (i3 > literalByteString.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 + i3 > literalByteString.size()) {
            int size2 = literalByteString.size();
            StringBuilder m4120s = C0576a.m4120s(59, "Ran off end of other: ", i2, ", ", i3);
            m4120s.append(", ");
            m4120s.append(size2);
            throw new IllegalArgumentException(m4120s.toString());
        }
        byte[] bArr = this.f65681c;
        byte[] bArr2 = literalByteString.f65681c;
        int mo33220H = mo33220H() + i3;
        int mo33220H2 = mo33220H();
        int mo33220H3 = literalByteString.mo33220H() + i2;
        while (mo33220H2 < mo33220H) {
            if (bArr[mo33220H2] != bArr2[mo33220H3]) {
                return false;
            }
            mo33220H2++;
            mo33220H3++;
        }
        return true;
    }

    /* renamed from: H */
    public int mo33220H() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof LiteralByteString) {
            return m33337G((LiteralByteString) obj, 0, size());
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(C0000a.m20q(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: g */
    public void mo33221g(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f65681c, i2, bArr, i3, i4);
    }

    public int hashCode() {
        int i2 = this.f65682d;
        if (i2 == 0) {
            int size = size();
            i2 = mo33236y(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f65682d = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: r */
    public int mo33233r() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: s */
    public boolean mo33234s() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65681c.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: t */
    public boolean mo33235t() {
        int mo33220H = mo33220H();
        return Utf8.m33357d(this.f65681c, mo33220H, size() + mo33220H);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ByteString.ByteIterator iterator() {
        return new LiteralByteIterator(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: y */
    public int mo33236y(int i2, int i3, int i4) {
        byte[] bArr = this.f65681c;
        int mo33220H = mo33220H() + i3;
        for (int i5 = mo33220H; i5 < mo33220H + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r9[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r9[r0] > (-65)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r9[r0] > (-65)) goto L14;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo33237z(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.mo33220H()
            int r0 = r0 + r9
            byte[] r9 = r7.f65681c
            int r10 = r10 + r0
            if (r8 == 0) goto L8d
            if (r0 < r10) goto Le
            goto L91
        Le:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L27
            r8 = -62
            if (r1 < r8) goto L24
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r4) goto L21
            goto L24
        L21:
            r0 = r8
            goto L8d
        L24:
            r8 = -1
            goto L91
        L27:
            r5 = -16
            if (r1 >= r5) goto L54
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L3f
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r8 < r10) goto L3c
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.m33354a(r1, r0)
            goto L91
        L3c:
            r6 = r0
            r0 = r8
            r8 = r6
        L3f:
            if (r8 > r4) goto L24
            r5 = -96
            if (r1 != r2) goto L47
            if (r8 < r5) goto L24
        L47:
            r2 = -19
            if (r1 != r2) goto L4d
            if (r8 >= r5) goto L24
        L4d:
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r4) goto L21
            goto L24
        L54:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            r5 = 0
            if (r2 != 0) goto L68
            int r8 = r0 + 1
            r2 = r9[r0]
            if (r8 < r10) goto L66
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.m33354a(r1, r2)
            goto L91
        L66:
            r0 = r8
            goto L6b
        L68:
            int r8 = r8 >> 16
            byte r5 = (byte) r8
        L6b:
            if (r5 != 0) goto L79
            int r8 = r0 + 1
            r5 = r9[r0]
            if (r8 < r10) goto L78
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.m33355b(r1, r2, r5)
            goto L91
        L78:
            r0 = r8
        L79:
            if (r2 > r4) goto L24
            int r8 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r8
            int r8 = r2 >> 30
            if (r8 != 0) goto L24
            if (r5 > r4) goto L24
            int r8 = r0 + 1
            r0 = r9[r0]
            if (r0 <= r4) goto L21
            goto L24
        L8d:
            int r8 = kotlin.reflect.jvm.internal.impl.protobuf.Utf8.m33358e(r9, r0, r10)
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString.mo33237z(int, int, int):int");
    }
}
