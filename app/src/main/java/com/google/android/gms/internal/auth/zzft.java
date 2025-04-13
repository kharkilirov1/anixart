package com.google.android.gms.internal.auth;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.KotlinVersion;
import p000a.C0000a;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzft<T> implements zzgb<T> {

    /* renamed from: l */
    public static final int[] f16122l = new int[0];

    /* renamed from: m */
    public static final Unsafe f16123m = zzgz.m8514g();

    /* renamed from: a */
    public final int[] f16124a;

    /* renamed from: b */
    public final Object[] f16125b;

    /* renamed from: c */
    public final int f16126c;

    /* renamed from: d */
    public final int f16127d;

    /* renamed from: e */
    public final zzfq f16128e;

    /* renamed from: f */
    public final boolean f16129f;

    /* renamed from: g */
    public final int[] f16130g;

    /* renamed from: h */
    public final int f16131h;

    /* renamed from: i */
    public final int f16132i;

    /* renamed from: j */
    public final zzfe f16133j;

    /* renamed from: k */
    public final zzgp<?, ?> f16134k;

    public zzft(int[] iArr, Object[] objArr, int i2, int i3, zzfq zzfqVar, boolean z, int[] iArr2, int i4, int i5, zzfv zzfvVar, zzfe zzfeVar, zzgp zzgpVar, zzeh zzehVar, zzfl zzflVar) {
        this.f16124a = iArr;
        this.f16125b = objArr;
        this.f16126c = i2;
        this.f16127d = i3;
        this.f16129f = z;
        this.f16130g = iArr2;
        this.f16131h = i4;
        this.f16132i = i5;
        this.f16133j = zzfeVar;
        this.f16134k = zzgpVar;
        this.f16128e = zzfqVar;
    }

    /* renamed from: C */
    public static <T> long m8437C(T t, long j2) {
        return ((Long) zzgz.m8513f(t, j2)).longValue();
    }

    /* renamed from: g */
    public static Field m8438g(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            C0000a.m2C(sb, "Field ", str, " for ", name);
            throw new RuntimeException(C0000a.m20q(sb, " not found. Known fields are ", arrays));
        }
    }

    /* renamed from: q */
    public static zzgq m8439q(Object obj) {
        zzeq zzeqVar = (zzeq) obj;
        zzgq zzgqVar = zzeqVar.zzc;
        if (zzgqVar != zzgq.f16170e) {
            return zzgqVar;
        }
        zzgq m8490a = zzgq.m8490a();
        zzeqVar.zzc = m8490a;
        return m8490a;
    }

    /* renamed from: r */
    public static zzft m8440r(zzfn zzfnVar, zzfv zzfvVar, zzfe zzfeVar, zzgp zzgpVar, zzeh zzehVar, zzfl zzflVar) {
        if (zzfnVar instanceof zzga) {
            return m8441s((zzga) zzfnVar, zzfvVar, zzfeVar, zzgpVar, zzehVar, zzflVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.auth.zzft<T> m8441s(com.google.android.gms.internal.auth.zzga r32, com.google.android.gms.internal.auth.zzfv r33, com.google.android.gms.internal.auth.zzfe r34, com.google.android.gms.internal.auth.zzgp<?, ?> r35, com.google.android.gms.internal.auth.zzeh<?> r36, com.google.android.gms.internal.auth.zzfl r37) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.m8441s(com.google.android.gms.internal.auth.zzga, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl):com.google.android.gms.internal.auth.zzft");
    }

    /* renamed from: t */
    public static <T> int m8442t(T t, long j2) {
        return ((Integer) zzgz.m8513f(t, j2)).intValue();
    }

    /* renamed from: A */
    public final int m8443A(int i2, int i3) {
        int length = (this.f16124a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f16124a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* renamed from: B */
    public final int m8444B(int i2) {
        return this.f16124a[i2 + 1];
    }

    /* renamed from: D */
    public final zzet m8445D(int i2) {
        int i3 = i2 / 3;
        return (zzet) this.f16125b[i3 + i3 + 1];
    }

    /* renamed from: E */
    public final zzgb m8446E(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f16125b;
        zzgb zzgbVar = (zzgb) objArr[i4];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        zzgb<T> m8469a = zzfy.f16140c.m8469a((Class) objArr[i4 + 1]);
        this.f16125b[i4] = m8469a;
        return m8469a;
    }

    /* renamed from: F */
    public final Object m8447F(int i2) {
        int i3 = i2 / 3;
        return this.f16125b[i3 + i3];
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: a */
    public final int mo8448a(T t) {
        int i2;
        int m8412b;
        int i3;
        int m8510c;
        int length = this.f16124a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int m8444B = m8444B(i5);
            int i6 = this.f16124a[i5];
            long j2 = 1048575 & m8444B;
            int i7 = 37;
            switch ((m8444B >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(Double.doubleToLongBits(zzgz.m8508a(t, j2)));
                    i4 = m8412b + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    m8412b = Float.floatToIntBits(zzgz.m8509b(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(zzgz.m8511d(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(zzgz.m8511d(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 5:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(zzgz.m8511d(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 7:
                    i2 = i4 * 53;
                    m8412b = zzev.m8411a(zzgz.m8523p(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    m8412b = ((String) zzgz.m8513f(t, j2)).hashCode();
                    i4 = m8412b + i2;
                    break;
                case 9:
                    Object m8513f = zzgz.m8513f(t, j2);
                    if (m8513f != null) {
                        i7 = m8513f.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    m8412b = zzgz.m8513f(t, j2).hashCode();
                    i4 = m8412b + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 12:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 13:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 14:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(zzgz.m8511d(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    m8510c = zzgz.m8510c(t, j2);
                    i4 = i3 + m8510c;
                    break;
                case 16:
                    i2 = i4 * 53;
                    m8412b = zzev.m8412b(zzgz.m8511d(t, j2));
                    i4 = m8412b + i2;
                    break;
                case 17:
                    Object m8513f2 = zzgz.m8513f(t, j2);
                    if (m8513f2 != null) {
                        i7 = m8513f2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    i2 = i4 * 53;
                    m8412b = zzgz.m8513f(t, j2).hashCode();
                    i4 = m8412b + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    m8412b = zzgz.m8513f(t, j2).hashCode();
                    i4 = m8412b + i2;
                    break;
                case 51:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(Double.doubleToLongBits(((Double) zzgz.m8513f(t, j2)).doubleValue()));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = Float.floatToIntBits(((Float) zzgz.m8513f(t, j2)).floatValue());
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(m8437C(t, j2));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(m8437C(t, j2));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(m8437C(t, j2));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8411a(((Boolean) zzgz.m8513f(t, j2)).booleanValue());
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = ((String) zzgz.m8513f(t, j2)).hashCode();
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzgz.m8513f(t, j2).hashCode();
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzgz.m8513f(t, j2).hashCode();
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(m8437C(t, j2));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m8461o(t, i6, i5)) {
                        i3 = i4 * 53;
                        m8510c = m8442t(t, j2);
                        i4 = i3 + m8510c;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzev.m8412b(m8437C(t, j2));
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m8461o(t, i6, i5)) {
                        i2 = i4 * 53;
                        m8412b = zzgz.m8513f(t, j2).hashCode();
                        i4 = m8412b + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.f16134k.mo8484a(t).hashCode() + (i4 * 53);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: b */
    public final void mo8449b(T t) {
        int i2;
        int i3 = this.f16131h;
        while (true) {
            i2 = this.f16132i;
            if (i3 >= i2) {
                break;
            }
            long m8444B = m8444B(this.f16130g[i3]) & 1048575;
            Object m8513f = zzgz.m8513f(t, m8444B);
            if (m8513f != null) {
                ((zzfk) m8513f).f16119b = false;
                zzgz.f16181c.m8507o(t, m8444B, m8513f);
            }
            i3++;
        }
        int length = this.f16130g.length;
        while (i2 < length) {
            this.f16133j.mo8422a(t, this.f16130g[i2]);
            i2++;
        }
        this.f16134k.mo8488e(t);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: c */
    public final void mo8450c(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.f16124a.length; i2 += 3) {
            int m8444B = m8444B(i2);
            long j2 = 1048575 & m8444B;
            int i3 = this.f16124a[i2];
            switch ((m8444B >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (m8459m(t2, i2)) {
                        zzgz.m8518k(t, j2, zzgz.m8508a(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.mo8497e(t, j2, zzgz.m8509b(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8459m(t2, i2)) {
                        zzgz.m8519l(t, j2, zzgz.m8511d(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8459m(t2, i2)) {
                        zzgz.m8519l(t, j2, zzgz.m8511d(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8459m(t2, i2)) {
                        zzgz.m8519l(t, j2, zzgz.m8511d(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.mo8495c(t, j2, zzgz.m8523p(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8507o(t, j2, zzgz.m8513f(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m8454h(t, t2, i2);
                    break;
                case 10:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8507o(t, j2, zzgz.m8513f(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8459m(t2, i2)) {
                        zzgz.m8519l(t, j2, zzgz.m8511d(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8459m(t2, i2)) {
                        zzgz.f16181c.m8505m(t, j2, zzgz.m8510c(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8459m(t2, i2)) {
                        zzgz.m8519l(t, j2, zzgz.m8511d(t2, j2));
                        m8456j(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m8454h(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.f16133j.mo8423b(t, t2, j2);
                    break;
                case 50:
                    Class<?> cls = zzgd.f16149a;
                    zzgz.f16181c.m8507o(t, j2, zzfl.m8430a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                case 58:
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8461o(t2, i3, i2)) {
                        zzgz.f16181c.m8507o(t, j2, zzgz.m8513f(t2, j2));
                        m8457k(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    m8455i(t, t2, i2);
                    break;
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8461o(t2, i3, i2)) {
                        zzgz.f16181c.m8507o(t, j2, zzgz.m8513f(t2, j2));
                        m8457k(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    m8455i(t, t2, i2);
                    break;
            }
        }
        zzgp<?, ?> zzgpVar = this.f16134k;
        Class<?> cls2 = zzgd.f16149a;
        zzgpVar.mo8489f(t, zzgpVar.mo8485b(zzgpVar.mo8484a(t), zzgpVar.mo8484a(t2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: d */
    public final boolean mo8451d(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f16131h) {
            int i7 = this.f16130g[i6];
            int i8 = this.f16124a[i7];
            int m8444B = m8444B(i7);
            int i9 = this.f16124a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f16123m.getInt(t, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & m8444B) != 0 && !m8460n(t, i7, i2, i3, i11)) {
                return false;
            }
            int i12 = (m8444B >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (m8461o(t, i8, i7) && !m8446E(i7).mo8451d(zzgz.m8513f(t, m8444B & 1048575))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !((zzfk) zzgz.m8513f(t, m8444B & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.m8513f(t, m8444B & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgb m8446E = m8446E(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m8446E.mo8451d(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (m8460n(t, i7, i2, i3, i11) && !m8446E(i7).mo8451d(zzgz.m8513f(t, m8444B & 1048575))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: e */
    public final boolean mo8452e(T t, T t2) {
        boolean m8472a;
        int length = this.f16124a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int m8444B = m8444B(i2);
            long j2 = m8444B & 1048575;
            switch ((m8444B >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (m8458l(t, t2, i2) && Double.doubleToLongBits(zzgz.m8508a(t, j2)) == Double.doubleToLongBits(zzgz.m8508a(t2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m8458l(t, t2, i2) && Float.floatToIntBits(zzgz.m8509b(t, j2)) == Float.floatToIntBits(zzgz.m8509b(t2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m8458l(t, t2, i2) && zzgz.m8511d(t, j2) == zzgz.m8511d(t2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m8458l(t, t2, i2) && zzgz.m8511d(t, j2) == zzgz.m8511d(t2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m8458l(t, t2, i2) && zzgz.m8511d(t, j2) == zzgz.m8511d(t2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m8458l(t, t2, i2) && zzgz.m8523p(t, j2) == zzgz.m8523p(t2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m8458l(t, t2, i2) && zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m8458l(t, t2, i2) && zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m8458l(t, t2, i2) && zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m8458l(t, t2, i2) && zzgz.m8511d(t, j2) == zzgz.m8511d(t2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m8458l(t, t2, i2) && zzgz.m8510c(t, j2) == zzgz.m8510c(t2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m8458l(t, t2, i2) && zzgz.m8511d(t, j2) == zzgz.m8511d(t2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m8458l(t, t2, i2) && zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    m8472a = zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2));
                    break;
                case 50:
                    m8472a = zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                case 58:
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long m8468z = m8468z(i2) & 1048575;
                    if (zzgz.m8510c(t, m8468z) == zzgz.m8510c(t2, m8468z) && zzgd.m8472a(zzgz.m8513f(t, j2), zzgz.m8513f(t2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m8472a) {
                return false;
            }
        }
        return this.f16134k.mo8484a(t).equals(this.f16134k.mo8484a(t2));
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: f */
    public final void mo8453f(T t, byte[] bArr, int i2, int i3, zzdp zzdpVar) throws IOException {
        if (this.f16129f) {
            m8465w(t, bArr, i2, i3, zzdpVar);
        } else {
            m8462p(t, bArr, i2, i3, 0, zzdpVar);
        }
    }

    /* renamed from: h */
    public final void m8454h(T t, T t2, int i2) {
        long j2 = this.f16124a[i2 + 1] & 1048575;
        if (m8459m(t2, i2)) {
            Object m8513f = zzgz.m8513f(t, j2);
            Object m8513f2 = zzgz.m8513f(t2, j2);
            if (m8513f != null && m8513f2 != null) {
                zzgz.f16181c.m8507o(t, j2, zzev.m8413c(m8513f, m8513f2));
                m8456j(t, i2);
            } else if (m8513f2 != null) {
                zzgz.f16181c.m8507o(t, j2, m8513f2);
                m8456j(t, i2);
            }
        }
    }

    /* renamed from: i */
    public final void m8455i(T t, T t2, int i2) {
        int[] iArr = this.f16124a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = i3 & 1048575;
        if (m8461o(t2, i4, i2)) {
            Object m8513f = m8461o(t, i4, i2) ? zzgz.m8513f(t, j2) : null;
            Object m8513f2 = zzgz.m8513f(t2, j2);
            if (m8513f != null && m8513f2 != null) {
                zzgz.f16181c.m8507o(t, j2, zzev.m8413c(m8513f, m8513f2));
                m8457k(t, i4, i2);
            } else if (m8513f2 != null) {
                zzgz.f16181c.m8507o(t, j2, m8513f2);
                m8457k(t, i4, i2);
            }
        }
    }

    /* renamed from: j */
    public final void m8456j(T t, int i2) {
        int i3 = this.f16124a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        zzgz.f16181c.m8505m(t, j2, (1 << (i3 >>> 20)) | zzgz.m8510c(t, j2));
    }

    /* renamed from: k */
    public final void m8457k(T t, int i2, int i3) {
        zzgz.f16181c.m8505m(t, this.f16124a[i3 + 2] & 1048575, i2);
    }

    /* renamed from: l */
    public final boolean m8458l(T t, T t2, int i2) {
        return m8459m(t, i2) == m8459m(t2, i2);
    }

    /* renamed from: m */
    public final boolean m8459m(T t, int i2) {
        int[] iArr = this.f16124a;
        int i3 = iArr[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return (zzgz.m8510c(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long j3 = i4 & 1048575;
        switch ((i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
            case 0:
                return zzgz.m8508a(t, j3) != 0.0d;
            case 1:
                return zzgz.m8509b(t, j3) != 0.0f;
            case 2:
                return zzgz.m8511d(t, j3) != 0;
            case 3:
                return zzgz.m8511d(t, j3) != 0;
            case 4:
                return zzgz.m8510c(t, j3) != 0;
            case 5:
                return zzgz.m8511d(t, j3) != 0;
            case 6:
                return zzgz.m8510c(t, j3) != 0;
            case 7:
                return zzgz.m8523p(t, j3);
            case 8:
                Object m8513f = zzgz.m8513f(t, j3);
                if (m8513f instanceof String) {
                    return !((String) m8513f).isEmpty();
                }
                if (m8513f instanceof zzeb) {
                    return !zzeb.f16083c.equals(m8513f);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.m8513f(t, j3) != null;
            case 10:
                return !zzeb.f16083c.equals(zzgz.m8513f(t, j3));
            case 11:
                return zzgz.m8510c(t, j3) != 0;
            case 12:
                return zzgz.m8510c(t, j3) != 0;
            case 13:
                return zzgz.m8510c(t, j3) != 0;
            case 14:
                return zzgz.m8511d(t, j3) != 0;
            case 15:
                return zzgz.m8510c(t, j3) != 0;
            case 16:
                return zzgz.m8511d(t, j3) != 0;
            case 17:
                return zzgz.m8513f(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: n */
    public final boolean m8460n(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? m8459m(t, i2) : (i4 & i5) != 0;
    }

    /* renamed from: o */
    public final boolean m8461o(T t, int i2, int i3) {
        return zzgz.m8510c(t, (long) (this.f16124a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c3, code lost:
    
        if (r0 != r16) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x041e, code lost:
    
        r6 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0413, code lost:
    
        r1 = r36;
        r5 = r18;
        r9 = r25;
        r7 = r26;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0411, code lost:
    
        if (r0 != r15) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0461, code lost:
    
        if (r5 == 1048575) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0463, code lost:
    
        r3 = r5;
        r5 = r32;
        r29.putInt(r5, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x046e, code lost:
    
        r4 = r31.f16131h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0477, code lost:
    
        if (r4 >= r31.f16132i) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0479, code lost:
    
        r6 = r31.f16130g[r4];
        r7 = r31.f16124a[r6];
        r7 = com.google.android.gms.internal.auth.zzgz.m8513f(r5, m8444B(r6) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x048b, code lost:
    
        if (r7 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0492, code lost:
    
        if (m8445D(r6) != null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0497, code lost:
    
        r7 = (com.google.android.gms.internal.auth.zzfk) r7;
        r0 = (com.google.android.gms.internal.auth.zzfj) m8447F(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x049f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0494, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04a0, code lost:
    
        if (r1 != 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04a4, code lost:
    
        if (r0 != r35) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x04ab, code lost:
    
        throw com.google.android.gms.internal.auth.zzew.m8416c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x04b2, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x04ae, code lost:
    
        if (r0 > r35) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x04b0, code lost:
    
        if (r9 != r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x04b7, code lost:
    
        throw com.google.android.gms.internal.auth.zzew.m8416c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x046c, code lost:
    
        r5 = r32;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m8462p(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.auth.zzdp r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.m8462p(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    /* renamed from: u */
    public final int m8463u(Object obj, byte[] bArr, int i2, int i3, int i4, long j2) throws IOException {
        Unsafe unsafe = f16123m;
        Object m8447F = m8447F(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzfk) object).f16119b) {
            zzfk zzfkVar = zzfk.f16118c;
            zzfk zzfkVar2 = zzfkVar.isEmpty() ? new zzfk() : new zzfk(zzfkVar);
            zzfl.m8430a(zzfkVar2, object);
            unsafe.putObject(obj, j2, zzfkVar2);
        }
        throw null;
    }

    /* renamed from: v */
    public final int m8464v(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzdp zzdpVar) throws IOException {
        Unsafe unsafe = f16123m;
        long j3 = this.f16124a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(zzdq.m8363n(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(zzdq.m8351b(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int m8362m = zzdq.m8362m(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzdpVar.f16074b));
                    unsafe.putInt(t, j3, i5);
                    return m8362m;
                }
                break;
            case 55:
            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i6 == 0) {
                    int m8359j = zzdq.m8359j(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzdpVar.f16073a));
                    unsafe.putInt(t, j3, i5);
                    return m8359j;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(zzdq.m8363n(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(zzdq.m8351b(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int m8362m2 = zzdq.m8362m(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Boolean.valueOf(zzdpVar.f16074b != 0));
                    unsafe.putInt(t, j3, i5);
                    return m8362m2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i6 == 2) {
                    int m8359j2 = zzdq.m8359j(bArr, i2, zzdpVar);
                    int i10 = zzdpVar.f16073a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else {
                        if ((i7 & 536870912) != 0 && !zzhd.m8531b(bArr, m8359j2, m8359j2 + i10)) {
                            throw zzew.m8414a();
                        }
                        unsafe.putObject(t, j2, new String(bArr, m8359j2, i10, zzev.f16107a));
                        m8359j2 += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return m8359j2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i6 == 2) {
                    int m8353d = zzdq.m8353d(m8446E(i9), bArr, i2, i3, zzdpVar);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, zzdpVar.f16075c);
                    } else {
                        unsafe.putObject(t, j2, zzev.m8413c(object, zzdpVar.f16075c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m8353d;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i6 == 2) {
                    int m8350a = zzdq.m8350a(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, zzdpVar.f16075c);
                    unsafe.putInt(t, j3, i5);
                    return m8350a;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i6 == 0) {
                    int m8359j3 = zzdq.m8359j(bArr, i2, zzdpVar);
                    int i11 = zzdpVar.f16073a;
                    zzet m8445D = m8445D(i9);
                    if (m8445D == null || m8445D.m8410u()) {
                        unsafe.putObject(t, j2, Integer.valueOf(i11));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        m8439q(t).m8491b(i4, Long.valueOf(i11));
                    }
                    return m8359j3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i6 == 0) {
                    int m8359j4 = zzdq.m8359j(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Integer.valueOf(zzee.m8379a(zzdpVar.f16073a)));
                    unsafe.putInt(t, j3, i5);
                    return m8359j4;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i6 == 0) {
                    int m8362m3 = zzdq.m8362m(bArr, i2, zzdpVar);
                    unsafe.putObject(t, j2, Long.valueOf(zzee.m8380b(zzdpVar.f16074b)));
                    unsafe.putInt(t, j3, i5);
                    return m8362m3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i6 == 3) {
                    int m8352c = zzdq.m8352c(m8446E(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzdpVar);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, zzdpVar.f16075c);
                    } else {
                        unsafe.putObject(t, j2, zzev.m8413c(object2, zzdpVar.f16075c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return m8352c;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e7, code lost:
    
        if (r0 != r15) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ea, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0331, code lost:
    
        r5 = r0;
        r2 = r19;
        r10 = r26;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x032f, code lost:
    
        if (r0 != r15) goto L128;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m8465w(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.auth.zzdp r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.m8465w(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: x */
    public final T mo8466x() {
        return (T) ((zzeq) this.f16128e).mo8405d(4, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final int m8467y(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, zzdp zzdpVar) throws IOException {
        int i9;
        int i10;
        int i11;
        int i12;
        int m8361l;
        int i13 = i2;
        Unsafe unsafe = f16123m;
        zzeu zzeuVar = (zzeu) unsafe.getObject(t, j3);
        if (!zzeuVar.mo8347v()) {
            int size = zzeuVar.size();
            zzeuVar = zzeuVar.mo8364c(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j3, zzeuVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    zzef zzefVar = (zzef) zzeuVar;
                    int m8359j = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i14 = zzdpVar.f16073a + m8359j;
                    while (m8359j < i14) {
                        zzefVar.m8381d(Double.longBitsToDouble(zzdq.m8363n(bArr, m8359j)));
                        m8359j += 8;
                    }
                    if (m8359j == i14) {
                        return m8359j;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 1) {
                    zzef zzefVar2 = (zzef) zzeuVar;
                    zzefVar2.m8381d(Double.longBitsToDouble(zzdq.m8363n(bArr, i2)));
                    while (true) {
                        i9 = i13 + 8;
                        if (i9 < i3) {
                            int m8359j2 = zzdq.m8359j(bArr, i9, zzdpVar);
                            if (i4 == zzdpVar.f16073a) {
                                zzefVar2.m8381d(Double.longBitsToDouble(zzdq.m8363n(bArr, m8359j2)));
                                i13 = m8359j2;
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 19:
            case 36:
                if (i6 == 2) {
                    zzem zzemVar = (zzem) zzeuVar;
                    int m8359j3 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i15 = zzdpVar.f16073a + m8359j3;
                    while (m8359j3 < i15) {
                        zzemVar.m8393d(Float.intBitsToFloat(zzdq.m8351b(bArr, m8359j3)));
                        m8359j3 += 4;
                    }
                    if (m8359j3 == i15) {
                        return m8359j3;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 5) {
                    zzem zzemVar2 = (zzem) zzeuVar;
                    zzemVar2.m8393d(Float.intBitsToFloat(zzdq.m8351b(bArr, i2)));
                    while (true) {
                        i10 = i13 + 4;
                        if (i10 < i3) {
                            int m8359j4 = zzdq.m8359j(bArr, i10, zzdpVar);
                            if (i4 == zzdpVar.f16073a) {
                                zzemVar2.m8393d(Float.intBitsToFloat(zzdq.m8351b(bArr, m8359j4)));
                                i13 = m8359j4;
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 20:
            case 21:
            case 37:
            case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i6 == 2) {
                    zzff zzffVar = (zzff) zzeuVar;
                    int m8359j5 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i16 = zzdpVar.f16073a + m8359j5;
                    while (m8359j5 < i16) {
                        m8359j5 = zzdq.m8362m(bArr, m8359j5, zzdpVar);
                        zzffVar.m8424d(zzdpVar.f16074b);
                    }
                    if (m8359j5 == i16) {
                        return m8359j5;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 0) {
                    zzff zzffVar2 = (zzff) zzeuVar;
                    int m8362m = zzdq.m8362m(bArr, i13, zzdpVar);
                    zzffVar2.m8424d(zzdpVar.f16074b);
                    while (m8362m < i3) {
                        int m8359j6 = zzdq.m8359j(bArr, m8362m, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8362m;
                        }
                        m8362m = zzdq.m8362m(bArr, m8359j6, zzdpVar);
                        zzffVar2.m8424d(zzdpVar.f16074b);
                    }
                    return m8362m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return zzdq.m8355f(bArr, i13, zzeuVar, zzdpVar);
                }
                if (i6 == 0) {
                    return zzdq.m8361l(i4, bArr, i2, i3, zzeuVar, zzdpVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    zzff zzffVar3 = (zzff) zzeuVar;
                    int m8359j7 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i17 = zzdpVar.f16073a + m8359j7;
                    while (m8359j7 < i17) {
                        zzffVar3.m8424d(zzdq.m8363n(bArr, m8359j7));
                        m8359j7 += 8;
                    }
                    if (m8359j7 == i17) {
                        return m8359j7;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 1) {
                    zzff zzffVar4 = (zzff) zzeuVar;
                    zzffVar4.m8424d(zzdq.m8363n(bArr, i2));
                    while (true) {
                        i11 = i13 + 8;
                        if (i11 < i3) {
                            int m8359j8 = zzdq.m8359j(bArr, i11, zzdpVar);
                            if (i4 == zzdpVar.f16073a) {
                                zzffVar4.m8424d(zzdq.m8363n(bArr, m8359j8));
                                i13 = m8359j8;
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    zzer zzerVar = (zzer) zzeuVar;
                    int m8359j9 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i18 = zzdpVar.f16073a + m8359j9;
                    while (m8359j9 < i18) {
                        zzerVar.m8407d(zzdq.m8351b(bArr, m8359j9));
                        m8359j9 += 4;
                    }
                    if (m8359j9 == i18) {
                        return m8359j9;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 5) {
                    zzer zzerVar2 = (zzer) zzeuVar;
                    zzerVar2.m8407d(zzdq.m8351b(bArr, i2));
                    while (true) {
                        i12 = i13 + 4;
                        if (i12 < i3) {
                            int m8359j10 = zzdq.m8359j(bArr, i12, zzdpVar);
                            if (i4 == zzdpVar.f16073a) {
                                zzerVar2.m8407d(zzdq.m8351b(bArr, m8359j10));
                                i13 = m8359j10;
                            }
                        }
                    }
                    return i12;
                }
                break;
            case 25:
            case 42:
                if (i6 == 2) {
                    zzdr zzdrVar = (zzdr) zzeuVar;
                    int m8359j11 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i19 = zzdpVar.f16073a + m8359j11;
                    while (m8359j11 < i19) {
                        m8359j11 = zzdq.m8362m(bArr, m8359j11, zzdpVar);
                        zzdrVar.m8365d(zzdpVar.f16074b != 0);
                    }
                    if (m8359j11 == i19) {
                        return m8359j11;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 0) {
                    zzdr zzdrVar2 = (zzdr) zzeuVar;
                    int m8362m2 = zzdq.m8362m(bArr, i13, zzdpVar);
                    zzdrVar2.m8365d(zzdpVar.f16074b != 0);
                    while (m8362m2 < i3) {
                        int m8359j12 = zzdq.m8359j(bArr, m8362m2, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8362m2;
                        }
                        m8362m2 = zzdq.m8362m(bArr, m8359j12, zzdpVar);
                        zzdrVar2.m8365d(zzdpVar.f16074b != 0);
                    }
                    return m8362m2;
                }
                break;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) != 0) {
                        i13 = zzdq.m8359j(bArr, i13, zzdpVar);
                        int i20 = zzdpVar.f16073a;
                        if (i20 < 0) {
                            throw zzew.m8415b();
                        }
                        if (i20 == 0) {
                            zzeuVar.add("");
                        } else {
                            int i21 = i13 + i20;
                            if (!zzhd.m8531b(bArr, i13, i21)) {
                                throw zzew.m8414a();
                            }
                            zzeuVar.add(new String(bArr, i13, i20, zzev.f16107a));
                            i13 = i21;
                        }
                        while (i13 < i3) {
                            int m8359j13 = zzdq.m8359j(bArr, i13, zzdpVar);
                            if (i4 != zzdpVar.f16073a) {
                                break;
                            } else {
                                i13 = zzdq.m8359j(bArr, m8359j13, zzdpVar);
                                int i22 = zzdpVar.f16073a;
                                if (i22 < 0) {
                                    throw zzew.m8415b();
                                }
                                if (i22 == 0) {
                                    zzeuVar.add("");
                                } else {
                                    int i23 = i13 + i22;
                                    if (!zzhd.m8531b(bArr, i13, i23)) {
                                        throw zzew.m8414a();
                                    }
                                    zzeuVar.add(new String(bArr, i13, i22, zzev.f16107a));
                                    i13 = i23;
                                }
                            }
                        }
                        break;
                    } else {
                        i13 = zzdq.m8359j(bArr, i13, zzdpVar);
                        int i24 = zzdpVar.f16073a;
                        if (i24 < 0) {
                            throw zzew.m8415b();
                        }
                        if (i24 == 0) {
                            zzeuVar.add("");
                        } else {
                            zzeuVar.add(new String(bArr, i13, i24, zzev.f16107a));
                            i13 += i24;
                        }
                        while (i13 < i3) {
                            int m8359j14 = zzdq.m8359j(bArr, i13, zzdpVar);
                            if (i4 != zzdpVar.f16073a) {
                                break;
                            } else {
                                i13 = zzdq.m8359j(bArr, m8359j14, zzdpVar);
                                int i25 = zzdpVar.f16073a;
                                if (i25 < 0) {
                                    throw zzew.m8415b();
                                }
                                if (i25 == 0) {
                                    zzeuVar.add("");
                                } else {
                                    zzeuVar.add(new String(bArr, i13, i25, zzev.f16107a));
                                    i13 += i25;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i6 == 2) {
                    return zzdq.m8354e(m8446E(i7), i4, bArr, i2, i3, zzeuVar, zzdpVar);
                }
                break;
            case 28:
                if (i6 == 2) {
                    int m8359j15 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i26 = zzdpVar.f16073a;
                    if (i26 < 0) {
                        throw zzew.m8415b();
                    }
                    if (i26 > bArr.length - m8359j15) {
                        throw zzew.m8417d();
                    }
                    if (i26 == 0) {
                        zzeuVar.add(zzeb.f16083c);
                    } else {
                        zzeuVar.add(zzeb.m8378t(bArr, m8359j15, i26));
                        m8359j15 += i26;
                    }
                    while (m8359j15 < i3) {
                        int m8359j16 = zzdq.m8359j(bArr, m8359j15, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8359j15;
                        }
                        m8359j15 = zzdq.m8359j(bArr, m8359j16, zzdpVar);
                        int i27 = zzdpVar.f16073a;
                        if (i27 < 0) {
                            throw zzew.m8415b();
                        }
                        if (i27 > bArr.length - m8359j15) {
                            throw zzew.m8417d();
                        }
                        if (i27 == 0) {
                            zzeuVar.add(zzeb.f16083c);
                        } else {
                            zzeuVar.add(zzeb.m8378t(bArr, m8359j15, i27));
                            m8359j15 += i27;
                        }
                    }
                    return m8359j15;
                }
                break;
            case 30:
            case 44:
                if (i6 == 2) {
                    m8361l = zzdq.m8355f(bArr, i13, zzeuVar, zzdpVar);
                } else if (i6 == 0) {
                    m8361l = zzdq.m8361l(i4, bArr, i2, i3, zzeuVar, zzdpVar);
                }
                zzeq zzeqVar = (zzeq) t;
                Object obj = zzeqVar.zzc;
                if (obj == zzgq.f16170e) {
                    obj = null;
                }
                zzet m8445D = m8445D(i7);
                zzgp<?, ?> zzgpVar = this.f16134k;
                Class<?> cls = zzgd.f16149a;
                if (m8445D != null) {
                    if (zzeuVar instanceof RandomAccess) {
                        int size2 = zzeuVar.size();
                        int i28 = 0;
                        for (int i29 = 0; i29 < size2; i29++) {
                            int intValue = ((Integer) zzeuVar.get(i29)).intValue();
                            if (m8445D.m8410u()) {
                                if (i29 != i28) {
                                    zzeuVar.set(i28, Integer.valueOf(intValue));
                                }
                                i28++;
                            } else {
                                if (obj == null) {
                                    obj = zzgpVar.mo8486c();
                                }
                                zzgpVar.mo8487d(obj, i5, intValue);
                            }
                        }
                        if (i28 != size2) {
                            zzeuVar.subList(i28, size2).clear();
                        }
                    } else {
                        Iterator<E> it = zzeuVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m8445D.m8410u()) {
                                if (obj == null) {
                                    obj = zzgpVar.mo8486c();
                                }
                                zzgpVar.mo8487d(obj, i5, intValue2);
                                it.remove();
                            }
                        }
                    }
                }
                if (obj == null) {
                    return m8361l;
                }
                zzeqVar.zzc = (zzgq) obj;
                return m8361l;
            case 33:
            case 47:
                if (i6 == 2) {
                    zzer zzerVar3 = (zzer) zzeuVar;
                    int m8359j17 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i30 = zzdpVar.f16073a + m8359j17;
                    while (m8359j17 < i30) {
                        m8359j17 = zzdq.m8359j(bArr, m8359j17, zzdpVar);
                        zzerVar3.m8407d(zzee.m8379a(zzdpVar.f16073a));
                    }
                    if (m8359j17 == i30) {
                        return m8359j17;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 0) {
                    zzer zzerVar4 = (zzer) zzeuVar;
                    int m8359j18 = zzdq.m8359j(bArr, i13, zzdpVar);
                    zzerVar4.m8407d(zzee.m8379a(zzdpVar.f16073a));
                    while (m8359j18 < i3) {
                        int m8359j19 = zzdq.m8359j(bArr, m8359j18, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8359j18;
                        }
                        m8359j18 = zzdq.m8359j(bArr, m8359j19, zzdpVar);
                        zzerVar4.m8407d(zzee.m8379a(zzdpVar.f16073a));
                    }
                    return m8359j18;
                }
                break;
            case 34:
            case 48:
                if (i6 == 2) {
                    zzff zzffVar5 = (zzff) zzeuVar;
                    int m8359j20 = zzdq.m8359j(bArr, i13, zzdpVar);
                    int i31 = zzdpVar.f16073a + m8359j20;
                    while (m8359j20 < i31) {
                        m8359j20 = zzdq.m8362m(bArr, m8359j20, zzdpVar);
                        zzffVar5.m8424d(zzee.m8380b(zzdpVar.f16074b));
                    }
                    if (m8359j20 == i31) {
                        return m8359j20;
                    }
                    throw zzew.m8417d();
                }
                if (i6 == 0) {
                    zzff zzffVar6 = (zzff) zzeuVar;
                    int m8362m3 = zzdq.m8362m(bArr, i13, zzdpVar);
                    zzffVar6.m8424d(zzee.m8380b(zzdpVar.f16074b));
                    while (m8362m3 < i3) {
                        int m8359j21 = zzdq.m8359j(bArr, m8362m3, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8362m3;
                        }
                        m8362m3 = zzdq.m8362m(bArr, m8359j21, zzdpVar);
                        zzffVar6.m8424d(zzee.m8380b(zzdpVar.f16074b));
                    }
                    return m8362m3;
                }
                break;
            default:
                if (i6 == 3) {
                    zzgb m8446E = m8446E(i7);
                    int i32 = (i4 & (-8)) | 4;
                    int m8352c = zzdq.m8352c(m8446E, bArr, i2, i3, i32, zzdpVar);
                    zzeuVar.add(zzdpVar.f16075c);
                    while (m8352c < i3) {
                        int m8359j22 = zzdq.m8359j(bArr, m8352c, zzdpVar);
                        if (i4 != zzdpVar.f16073a) {
                            return m8352c;
                        }
                        m8352c = zzdq.m8352c(m8446E, bArr, m8359j22, i3, i32, zzdpVar);
                        zzeuVar.add(zzdpVar.f16075c);
                    }
                    return m8352c;
                }
                break;
        }
        return i13;
    }

    /* renamed from: z */
    public final int m8468z(int i2) {
        return this.f16124a[i2 + 2];
    }
}
