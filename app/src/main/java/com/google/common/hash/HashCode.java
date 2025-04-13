package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public abstract class HashCode {

    /* renamed from: b */
    public static final char[] f21776b = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        public final byte[] f21777c;

        @Override // com.google.common.hash.HashCode
        /* renamed from: a */
        public byte[] mo12017a() {
            return (byte[]) this.f21777c.clone();
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        public int mo12018b() {
            byte[] bArr = this.f21777c;
            Preconditions.m11193q(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f21777c;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: c */
        public long mo12019c() {
            byte[] bArr = this.f21777c;
            Preconditions.m11193q(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            long j2 = this.f21777c[0] & 255;
            for (int i2 = 1; i2 < Math.min(this.f21777c.length, 8); i2++) {
                j2 |= (this.f21777c[i2] & 255) << (i2 * 8);
            }
            return j2;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: d */
        public int mo12020d() {
            return this.f21777c.length * 8;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        public boolean mo12021e(HashCode hashCode) {
            if (this.f21777c.length != hashCode.mo12022f().length) {
                return false;
            }
            int i2 = 0;
            boolean z = true;
            while (true) {
                byte[] bArr = this.f21777c;
                if (i2 >= bArr.length) {
                    return z;
                }
                z &= bArr[i2] == hashCode.mo12022f()[i2];
                i2++;
            }
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: f */
        public byte[] mo12022f() {
            return this.f21777c;
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        public final int f21778c;

        @Override // com.google.common.hash.HashCode
        /* renamed from: a */
        public byte[] mo12017a() {
            int i2 = this.f21778c;
            return new byte[]{(byte) i2, (byte) (i2 >> 8), (byte) (i2 >> 16), (byte) (i2 >> 24)};
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        public int mo12018b() {
            return this.f21778c;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: c */
        public long mo12019c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: d */
        public int mo12020d() {
            return 32;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        public boolean mo12021e(HashCode hashCode) {
            return this.f21778c == hashCode.mo12018b();
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {

        /* renamed from: c */
        public final long f21779c;

        @Override // com.google.common.hash.HashCode
        /* renamed from: a */
        public byte[] mo12017a() {
            return new byte[]{(byte) this.f21779c, (byte) (r2 >> 8), (byte) (r2 >> 16), (byte) (r2 >> 24), (byte) (r2 >> 32), (byte) (r2 >> 40), (byte) (r2 >> 48), (byte) (r2 >> 56)};
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: b */
        public int mo12018b() {
            return (int) this.f21779c;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: c */
        public long mo12019c() {
            return this.f21779c;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: d */
        public int mo12020d() {
            return 64;
        }

        @Override // com.google.common.hash.HashCode
        /* renamed from: e */
        public boolean mo12021e(HashCode hashCode) {
            return this.f21779c == hashCode.mo12019c();
        }
    }

    /* renamed from: a */
    public abstract byte[] mo12017a();

    /* renamed from: b */
    public abstract int mo12018b();

    /* renamed from: c */
    public abstract long mo12019c();

    /* renamed from: d */
    public abstract int mo12020d();

    /* renamed from: e */
    public abstract boolean mo12021e(HashCode hashCode);

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return mo12020d() == hashCode.mo12020d() && mo12021e(hashCode);
    }

    /* renamed from: f */
    public byte[] mo12022f() {
        return mo12017a();
    }

    public final int hashCode() {
        if (mo12020d() >= 32) {
            return mo12018b();
        }
        byte[] mo12022f = mo12022f();
        int i2 = mo12022f[0] & 255;
        for (int i3 = 1; i3 < mo12022f.length; i3++) {
            i2 |= (mo12022f[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    public final String toString() {
        byte[] mo12022f = mo12022f();
        StringBuilder sb = new StringBuilder(mo12022f.length * 2);
        for (byte b : mo12022f) {
            char[] cArr = f21776b;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
