package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzyu implements Iterable, Serializable {

    /* renamed from: c */
    public static final zzyu f17120c = new zzyr(zzaad.f16260b);

    /* renamed from: b */
    public int f17121b = 0;

    static {
        int i2 = zzyg.f17108a;
    }

    /* renamed from: x */
    public static int m9521x(int i2, int i3, int i4) {
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

    /* renamed from: y */
    public static zzyu m9522y(byte[] bArr) {
        return m9523z(bArr, 0, bArr.length);
    }

    /* renamed from: z */
    public static zzyu m9523z(byte[] bArr, int i2, int i3) {
        m9521x(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzyr(bArr2);
    }

    /* renamed from: A */
    public final boolean m9524A() {
        return mo9513d() == 0;
    }

    /* renamed from: C */
    public final byte[] m9525C() {
        int mo9513d = mo9513d();
        if (mo9513d == 0) {
            return zzaad.f16260b;
        }
        byte[] bArr = new byte[mo9513d];
        mo9514e(bArr, 0, 0, mo9513d);
        return bArr;
    }

    /* renamed from: a */
    public abstract byte mo9511a(int i2);

    /* renamed from: b */
    public abstract byte mo9512b(int i2);

    /* renamed from: d */
    public abstract int mo9513d();

    /* renamed from: e */
    public abstract void mo9514e(byte[] bArr, int i2, int i3, int i4);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo9515f(int i2, int i3, int i4);

    /* renamed from: g */
    public abstract zzyu mo9516g(int i2, int i3);

    public final int hashCode() {
        int i2 = this.f17121b;
        if (i2 == 0) {
            int mo9513d = mo9513d();
            i2 = mo9515f(mo9513d, 0, mo9513d);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f17121b = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzyl(this);
    }

    /* renamed from: r */
    public abstract zzyy mo9517r();

    /* renamed from: s */
    public abstract String mo9518s(Charset charset);

    /* renamed from: t */
    public abstract void mo9519t(zzyk zzykVar) throws IOException;

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo9513d());
        objArr[2] = mo9513d() <= 50 ? zzacd.m8740a(this) : zzacd.m8740a(mo9516g(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract boolean mo9520u();
}
