package com.google.android.gms.internal.auth;

import androidx.room.util.C0576a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzeb implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final zzeb f16083c = new zzdz(zzev.f16108b);

    /* renamed from: b */
    public int f16084b = 0;

    static {
        int i2 = zzdo.f16072a;
    }

    /* renamed from: s */
    public static int m8377s(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 >= 0) {
            if (i3 < i2) {
                throw new IndexOutOfBoundsException(C0576a.m4112k(66, "Beginning index larger than ending index: ", i2, ", ", i3));
            }
            throw new IndexOutOfBoundsException(C0576a.m4112k(37, "End index: ", i3, " >= ", i4));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Beginning index: ");
        sb.append(i2);
        sb.append(" < 0");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: t */
    public static zzeb m8378t(byte[] bArr, int i2, int i3) {
        m8377s(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzdz(bArr2);
    }

    /* renamed from: a */
    public abstract byte mo8369a(int i2);

    /* renamed from: b */
    public abstract byte mo8370b(int i2);

    /* renamed from: d */
    public abstract int mo8371d();

    /* renamed from: e */
    public abstract int mo8373e(int i2, int i3, int i4);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract zzeb mo8374f(int i2, int i3);

    /* renamed from: g */
    public abstract String mo8375g(Charset charset);

    public final int hashCode() {
        int i2 = this.f16084b;
        if (i2 == 0) {
            int mo8371d = mo8371d();
            i2 = mo8373e(mo8371d, 0, mo8371d);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f16084b = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new zzds(this);
    }

    /* renamed from: r */
    public abstract boolean mo8376r();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo8371d());
        objArr[2] = mo8371d() <= 50 ? zzgn.m8483a(this) : String.valueOf(zzgn.m8483a(mo8374f(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
