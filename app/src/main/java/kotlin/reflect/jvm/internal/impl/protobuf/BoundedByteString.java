package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.room.util.C0576a;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes3.dex */
class BoundedByteString extends LiteralByteString {

    /* renamed from: e */
    public final int f65618e;

    /* renamed from: f */
    public final int f65619f;

    public class BoundedByteIterator implements ByteString.ByteIterator {

        /* renamed from: b */
        public int f65620b;

        /* renamed from: c */
        public final int f65621c;

        public BoundedByteIterator(C66941 c66941) {
            int i2 = BoundedByteString.this.f65618e;
            this.f65620b = i2;
            this.f65621c = i2 + BoundedByteString.this.f65619f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65620b < this.f65621c;
        }

        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i2 = this.f65620b;
            if (i2 >= this.f65621c) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.f65681c;
            this.f65620b = i2 + 1;
            return bArr[i2];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    /* renamed from: F */
    public byte mo33219F(int i2) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C0576a.m4111j(28, "Index too small: ", i2));
        }
        if (i2 < this.f65619f) {
            return this.f65681c[this.f65618e + i2];
        }
        throw new ArrayIndexOutOfBoundsException(C0576a.m4112k(41, "Index too large: ", i2, ", ", this.f65619f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    /* renamed from: H */
    public int mo33220H() {
        return this.f65618e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: g */
    public void mo33221g(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f65681c, this.f65618e + i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f65619f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    /* renamed from: u */
    public ByteString.ByteIterator iterator() {
        return new BoundedByteIterator(null);
    }
}
