package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes2.dex */
public final class Bytes {

    @GwtCompatible
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final byte[] f21915b;

        /* renamed from: c */
        public final int f21916c;

        /* renamed from: d */
        public final int f21917d;

        public ByteArrayAsList(byte[] bArr, int i2, int i3) {
            this.f21915b = bArr;
            this.f21916c = i2;
            this.f21917d = i3;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (obj instanceof Byte) {
                byte[] bArr = this.f21915b;
                byte byteValue = ((Byte) obj).byteValue();
                int i2 = this.f21916c;
                int i3 = this.f21917d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (bArr[i2] == byteValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f21915b[this.f21916c + i2] != byteArrayAsList.f21915b[byteArrayAsList.f21916c + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Byte.valueOf(this.f21915b[this.f21916c + i2]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f21916c; i3 < this.f21917d; i3++) {
                i2 = (i2 * 31) + this.f21915b[i3];
            }
            return i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Byte) {
                byte[] bArr = this.f21915b;
                byte byteValue = ((Byte) obj).byteValue();
                int i2 = this.f21916c;
                int i3 = this.f21917d;
                while (true) {
                    if (i2 >= i3) {
                        i2 = -1;
                        break;
                    }
                    if (bArr[i2] == byteValue) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return i2 - this.f21916c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                byte[] bArr = this.f21915b;
                byte byteValue = ((Byte) obj).byteValue();
                int i2 = this.f21916c;
                int i3 = this.f21917d - 1;
                while (true) {
                    if (i3 < i2) {
                        i3 = -1;
                        break;
                    }
                    if (bArr[i3] == byteValue) {
                        break;
                    }
                    i3--;
                }
                if (i3 >= 0) {
                    return i3 - this.f21916c;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            Byte b = (Byte) obj;
            Preconditions.m11186j(i2, size());
            byte[] bArr = this.f21915b;
            int i3 = this.f21916c + i2;
            byte b2 = bArr[i3];
            Objects.requireNonNull(b);
            bArr[i3] = b.byteValue();
            return Byte.valueOf(b2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21917d - this.f21916c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f21915b;
            int i4 = this.f21916c;
            return new ByteArrayAsList(bArr, i2 + i4, i4 + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.f21915b[this.f21916c]);
            int i2 = this.f21916c;
            while (true) {
                i2++;
                if (i2 >= this.f21917d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.f21915b[i2]);
            }
        }
    }
}
