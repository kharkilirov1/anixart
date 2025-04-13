package com.google.android.gms.internal.p041firebaseauthapi;

import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import p000a.C0000a;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabf<T> implements zzabo<T> {

    /* renamed from: o */
    public static final int[] f16291o = new int[0];

    /* renamed from: p */
    public static final Unsafe f16292p = zzacp.m8791k();

    /* renamed from: a */
    public final int[] f16293a;

    /* renamed from: b */
    public final Object[] f16294b;

    /* renamed from: c */
    public final int f16295c;

    /* renamed from: d */
    public final int f16296d;

    /* renamed from: e */
    public final zzabc f16297e;

    /* renamed from: f */
    public final boolean f16298f;

    /* renamed from: g */
    public final boolean f16299g;

    /* renamed from: h */
    public final boolean f16300h;

    /* renamed from: i */
    public final int[] f16301i;

    /* renamed from: j */
    public final int f16302j;

    /* renamed from: k */
    public final int f16303k;

    /* renamed from: l */
    public final zzaaq f16304l;

    /* renamed from: m */
    public final zzacf f16305m;

    /* renamed from: n */
    public final zzzl f16306n;

    public zzabf(int[] iArr, Object[] objArr, int i2, int i3, zzabc zzabcVar, boolean z, int[] iArr2, int i4, int i5, zzabh zzabhVar, zzaaq zzaaqVar, zzacf zzacfVar, zzzl zzzlVar, zzaax zzaaxVar) {
        this.f16293a = iArr;
        this.f16294b = objArr;
        this.f16295c = i2;
        this.f16296d = i3;
        this.f16299g = zzabcVar instanceof zzzx;
        this.f16300h = z;
        this.f16298f = zzzlVar != null && zzzlVar.mo9635h(zzabcVar);
        this.f16301i = iArr2;
        this.f16302j = i4;
        this.f16303k = i5;
        this.f16304l = zzaaqVar;
        this.f16305m = zzacfVar;
        this.f16306n = zzzlVar;
        this.f16297e = zzabcVar;
    }

    /* renamed from: A */
    public static boolean m8628A(Object obj, int i2, zzabo zzaboVar) {
        return zzaboVar.mo8654e(zzacp.m8790j(obj, i2 & 1048575));
    }

    /* renamed from: C */
    public static boolean m8629C(Object obj, long j2) {
        return ((Boolean) zzacp.m8790j(obj, j2)).booleanValue();
    }

    /* renamed from: E */
    public static final void m8630E(int i2, Object obj, zzzg zzzgVar) throws IOException {
        if (obj instanceof String) {
            zzzgVar.f17145a.mo9600r(i2, (String) obj);
        } else {
            zzzgVar.f17145a.mo9592j(i2, (zzyu) obj);
        }
    }

    /* renamed from: G */
    public static zzacg m8631G(Object obj) {
        zzzx zzzxVar = (zzzx) obj;
        zzacg zzacgVar = zzzxVar.zzc;
        if (zzacgVar != zzacg.f16345f) {
            return zzacgVar;
        }
        zzacg m8760b = zzacg.m8760b();
        zzzxVar.zzc = m8760b;
        return m8760b;
    }

    /* renamed from: H */
    public static zzabf m8632H(zzaaz zzaazVar, zzabh zzabhVar, zzaaq zzaaqVar, zzacf zzacfVar, zzzl zzzlVar, zzaax zzaaxVar) {
        if (zzaazVar instanceof zzabm) {
            return m8633I((zzabm) zzaazVar, zzabhVar, zzaaqVar, zzacfVar, zzzlVar, zzaaxVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.p041firebaseauthapi.zzabf m8633I(com.google.android.gms.internal.p041firebaseauthapi.zzabm r35, com.google.android.gms.internal.p041firebaseauthapi.zzabh r36, com.google.android.gms.internal.p041firebaseauthapi.zzaaq r37, com.google.android.gms.internal.p041firebaseauthapi.zzacf r38, com.google.android.gms.internal.p041firebaseauthapi.zzzl r39, com.google.android.gms.internal.p041firebaseauthapi.zzaax r40) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzabf.m8633I(com.google.android.gms.internal.firebase-auth-api.zzabm, com.google.android.gms.internal.firebase-auth-api.zzabh, com.google.android.gms.internal.firebase-auth-api.zzaaq, com.google.android.gms.internal.firebase-auth-api.zzacf, com.google.android.gms.internal.firebase-auth-api.zzzl, com.google.android.gms.internal.firebase-auth-api.zzaax):com.google.android.gms.internal.firebase-auth-api.zzabf");
    }

    /* renamed from: J */
    public static double m8634J(Object obj, long j2) {
        return ((Double) zzacp.m8790j(obj, j2)).doubleValue();
    }

    /* renamed from: K */
    public static float m8635K(Object obj, long j2) {
        return ((Float) zzacp.m8790j(obj, j2)).floatValue();
    }

    /* renamed from: N */
    public static int m8636N(Object obj, long j2) {
        return ((Integer) zzacp.m8790j(obj, j2)).intValue();
    }

    /* renamed from: m */
    public static long m8637m(Object obj, long j2) {
        return ((Long) zzacp.m8790j(obj, j2)).longValue();
    }

    /* renamed from: r */
    public static Field m8638r(Class cls, String str) {
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
            StringBuilder m29z = C0000a.m29z("Field ", str, " for ", name, " not found. Known fields are ");
            m29z.append(arrays);
            throw new RuntimeException(m29z.toString());
        }
    }

    /* renamed from: B */
    public final boolean m8639B(Object obj, int i2, int i3) {
        return zzacp.m8787g(obj, (long) (this.f16293a[i3 + 2] & 1048575)) == i2;
    }

    /* renamed from: D */
    public final void m8640D(Object obj, zzzg zzzgVar) throws IOException {
        int i2;
        if (this.f16298f) {
            this.f16306n.mo9628a(obj);
            throw null;
        }
        int length = this.f16293a.length;
        Unsafe unsafe = f16292p;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 1048575;
        int i6 = 0;
        while (i4 < length) {
            int m8661l = m8661l(i4);
            int[] iArr = this.f16293a;
            int i7 = iArr[i4];
            int i8 = (m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i8 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i3;
                if (i10 != i5) {
                    i6 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = m8661l & i3;
            switch (i8) {
                case 0:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9620c(i7, zzacp.m8785e(obj, j2));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9621d(i7, zzacp.m8786f(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 2:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9604v(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 3:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9604v(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 4:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9597o(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 5:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9595m(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 6:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9593k(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 7:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9591i(i7, zzacp.m8801u(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 8:
                    if ((i6 & i2) != 0) {
                        m8630E(i7, unsafe.getObject(obj, j2), zzzgVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 9:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9623f(i7, unsafe.getObject(obj, j2), m8663o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9592j(i7, (zzyu) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 11:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9602t(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 12:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9597o(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 13:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9593k(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 14:
                    if ((i6 & i2) != 0) {
                        zzzgVar.f17145a.mo9595m(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 15:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9618a(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 16:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9619b(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 17:
                    if ((i6 & i2) != 0) {
                        zzzgVar.m9622e(i7, unsafe.getObject(obj, j2), m8663o(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 18:
                    zzabq.m8710f(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    zzabq.m8714j(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    zzabq.m8717m(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 21:
                    zzabq.m8726v(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    zzabq.m8716l(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 23:
                    zzabq.m8713i(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 24:
                    zzabq.m8712h(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    zzabq.m8708d(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    zzabq.m8723s(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar);
                    break;
                case 27:
                    zzabq.m8718n(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, m8663o(i4));
                    break;
                case 28:
                    zzabq.m8709e(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar);
                    break;
                case 29:
                    zzabq.m8724t(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 30:
                    zzabq.m8711g(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 31:
                    zzabq.m8719o(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 32:
                    zzabq.m8720p(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 33:
                    zzabq.m8721q(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 34:
                    zzabq.m8722r(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, false);
                    break;
                case 35:
                    zzabq.m8710f(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 36:
                    zzabq.m8714j(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 37:
                    zzabq.m8717m(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    zzabq.m8726v(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 39:
                    zzabq.m8716l(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 40:
                    zzabq.m8713i(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 41:
                    zzabq.m8712h(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 42:
                    zzabq.m8708d(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 43:
                    zzabq.m8724t(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 44:
                    zzabq.m8711g(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 45:
                    zzabq.m8719o(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 46:
                    zzabq.m8720p(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 47:
                    zzabq.m8721q(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case 48:
                    zzabq.m8722r(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, true);
                    break;
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zzabq.m8715k(this.f16293a[i4], (List) unsafe.getObject(obj, j2), zzzgVar, m8663o(i4));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9620c(i7, m8634J(obj, j2));
                        break;
                    }
                    break;
                case 52:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9621d(i7, m8635K(obj, j2));
                        break;
                    }
                    break;
                case 53:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9604v(i7, m8637m(obj, j2));
                        break;
                    }
                    break;
                case 54:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9604v(i7, m8637m(obj, j2));
                        break;
                    }
                    break;
                case 55:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9597o(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9595m(i7, m8637m(obj, j2));
                        break;
                    }
                    break;
                case 57:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9593k(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case 58:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9591i(i7, m8629C(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8639B(obj, i7, i4)) {
                        m8630E(i7, unsafe.getObject(obj, j2), zzzgVar);
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9623f(i7, unsafe.getObject(obj, j2), m8663o(i4));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9592j(i7, (zzyu) unsafe.getObject(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9602t(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9597o(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case 64:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9593k(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.f17145a.mo9595m(i7, m8637m(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9618a(i7, m8636N(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9619b(i7, m8637m(obj, j2));
                        break;
                    }
                    break;
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m8639B(obj, i7, i4)) {
                        zzzgVar.m9622e(i7, unsafe.getObject(obj, j2), m8663o(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzacf zzacfVar = this.f16305m;
        zzacfVar.mo8759r(zzacfVar.mo8745d(obj), zzzgVar);
    }

    /* renamed from: F */
    public final int m8641F(Object obj, byte[] bArr, int i2, int i3, int i4, zzyh zzyhVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        zzabf<T> zzabfVar;
        Throwable th;
        int i5;
        int i6;
        int i7;
        Throwable th2;
        int i8;
        int i9;
        int i10;
        Object obj3;
        zzyh zzyhVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int m9503m;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        zzabf<T> zzabfVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i28 = i3;
        zzyh zzyhVar3 = zzyhVar;
        Unsafe unsafe2 = f16292p;
        int i29 = i2;
        int i30 = i4;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        while (true) {
            if (i29 < i28) {
                int i36 = i29 + 1;
                int i37 = bArr2[i29];
                if (i37 < 0) {
                    i36 = zzyi.m9501k(i37, bArr2, i36, zzyhVar3);
                    i37 = zzyhVar3.f17109a;
                }
                int i38 = i37 >>> 3;
                int i39 = i37 & 7;
                int m8660k = i38 > i31 ? (i38 < zzabfVar2.f16295c || i38 > zzabfVar2.f16296d) ? -1 : zzabfVar2.m8660k(i38, i32 / 3) : zzabfVar2.m8648S(i38);
                if (m8660k == -1) {
                    i5 = i36;
                    i6 = i34;
                    i7 = i38;
                    unsafe = unsafe2;
                    th2 = null;
                    i8 = 0;
                    i9 = i37;
                    i10 = i30;
                } else {
                    int[] iArr = zzabfVar2.f16293a;
                    int i40 = iArr[m8660k + 1];
                    int i41 = (i40 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i42 = i37;
                    int i43 = i36;
                    long j2 = i40 & 1048575;
                    i7 = i38;
                    if (i41 <= 17) {
                        int i44 = iArr[m8660k + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i34) {
                            i12 = m8660k;
                            if (i34 != 1048575) {
                                unsafe2.putInt(obj4, i34, i35);
                            }
                            i35 = unsafe2.getInt(obj4, i46);
                            i34 = i46;
                        } else {
                            i12 = m8660k;
                        }
                        switch (i41) {
                            case 0:
                                i13 = i12;
                                i14 = i42;
                                i15 = i43;
                                if (i39 == 1) {
                                    zzacp.m8794n(obj4, j2, Double.longBitsToDouble(zzyi.m9504n(bArr2, i15)));
                                    i16 = i15 + 8;
                                    i17 = i14;
                                    i35 |= i45;
                                    i29 = i16;
                                    i22 = i17;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 1:
                                i13 = i12;
                                i14 = i42;
                                i15 = i43;
                                if (i39 == 5) {
                                    zzacp.f16357c.mo8770f(obj4, j2, Float.intBitsToFloat(zzyi.m9492b(bArr2, i15)));
                                    i18 = i15 + 4;
                                    i35 |= i45;
                                    m9503m = i18;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                i13 = i12;
                                i19 = i42;
                                i15 = i43;
                                if (i39 == 0) {
                                    m9503m = zzyi.m9503m(bArr2, i15, zzyhVar3);
                                    i20 = i19;
                                    unsafe2.putLong(obj, j2, zzyhVar3.f17110b);
                                    i35 |= i45;
                                    i14 = i20;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i14 = i19;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = i12;
                                i19 = i42;
                                i15 = i43;
                                if (i39 == 0) {
                                    i18 = zzyi.m9500j(bArr2, i15, zzyhVar3);
                                    unsafe2.putInt(obj4, j2, zzyhVar3.f17109a);
                                    i14 = i19;
                                    i35 |= i45;
                                    m9503m = i18;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i14 = i19;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 1) {
                                    unsafe2.putLong(obj, j2, zzyi.m9504n(bArr2, i21));
                                    i18 = i21 + 8;
                                    i14 = i14;
                                    i35 |= i45;
                                    m9503m = i18;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 5) {
                                    unsafe2.putInt(obj4, j2, zzyi.m9492b(bArr2, i21));
                                    i29 = i21 + 4;
                                    i35 |= i45;
                                    i30 = i4;
                                    i33 = i14;
                                    i32 = i13;
                                    i31 = i7;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 7:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 0) {
                                    int m9503m2 = zzyi.m9503m(bArr2, i21, zzyhVar3);
                                    zzacp.f16357c.mo8767c(obj4, j2, zzyhVar3.f17110b != 0);
                                    i29 = m9503m2;
                                    i35 |= i45;
                                    i30 = i4;
                                    i33 = i14;
                                    i32 = i13;
                                    i31 = i7;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 8:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 2) {
                                    i29 = (i40 & 536870912) == 0 ? zzyi.m9497g(bArr2, i21, zzyhVar3) : zzyi.m9498h(bArr2, i21, zzyhVar3);
                                    unsafe2.putObject(obj4, j2, zzyhVar3.f17111c);
                                    i35 |= i45;
                                    i30 = i4;
                                    i33 = i14;
                                    i32 = i13;
                                    i31 = i7;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 9:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 2) {
                                    i29 = zzyi.m9494d(zzabfVar2.m8663o(i13), bArr2, i21, i28, zzyhVar3);
                                    if ((i35 & i45) == 0) {
                                        unsafe2.putObject(obj4, j2, zzyhVar3.f17111c);
                                    } else {
                                        unsafe2.putObject(obj4, j2, zzaad.m8577c(unsafe2.getObject(obj4, j2), zzyhVar3.f17111c));
                                    }
                                    i35 |= i45;
                                    i30 = i4;
                                    i33 = i14;
                                    i32 = i13;
                                    i31 = i7;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 10:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 2) {
                                    i18 = zzyi.m9491a(bArr2, i21, zzyhVar3);
                                    unsafe2.putObject(obj4, j2, zzyhVar3.f17111c);
                                    i35 |= i45;
                                    m9503m = i18;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 12:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 != 0) {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                } else {
                                    i18 = zzyi.m9500j(bArr2, i21, zzyhVar3);
                                    int i47 = zzyhVar3.f17109a;
                                    zzaab m8662n = zzabfVar2.m8662n(i13);
                                    if (m8662n == null || m8662n.m8571u()) {
                                        unsafe2.putInt(obj4, j2, i47);
                                        i35 |= i45;
                                        m9503m = i18;
                                        i22 = i14;
                                        i29 = m9503m;
                                        i28 = i3;
                                        i30 = i4;
                                        i32 = i13;
                                        i33 = i22;
                                        i31 = i7;
                                        bArr2 = bArr;
                                        break;
                                    } else {
                                        m8631G(obj).m8762c(i14, Long.valueOf(i47));
                                        m9503m = i18;
                                        i22 = i14;
                                        i29 = m9503m;
                                        i28 = i3;
                                        i30 = i4;
                                        i32 = i13;
                                        i33 = i22;
                                        i31 = i7;
                                        bArr2 = bArr;
                                    }
                                }
                                break;
                            case 15:
                                i13 = i12;
                                i14 = i42;
                                i21 = i43;
                                if (i39 == 0) {
                                    i18 = zzyi.m9500j(bArr2, i21, zzyhVar3);
                                    unsafe2.putInt(obj4, j2, zzyy.m9545l(zzyhVar3.f17109a));
                                    i35 |= i45;
                                    m9503m = i18;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i15 = i21;
                                    i23 = i14;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            case 16:
                                if (i39 == 0) {
                                    int m9503m3 = zzyi.m9503m(bArr2, i43, zzyhVar3);
                                    i13 = i12;
                                    unsafe2.putLong(obj, j2, zzyy.m9546m(zzyhVar3.f17110b));
                                    i20 = i42;
                                    m9503m = m9503m3;
                                    i35 |= i45;
                                    i14 = i20;
                                    i22 = i14;
                                    i29 = m9503m;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i13 = i12;
                                    i23 = i42;
                                    i15 = i43;
                                    i14 = i23;
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                            default:
                                i13 = i12;
                                i14 = i42;
                                i15 = i43;
                                if (i39 == 3) {
                                    i17 = i14;
                                    i16 = zzyi.m9493c(zzabfVar2.m8663o(i13), bArr, i15, i3, (i7 << 3) | 4, zzyhVar);
                                    if ((i35 & i45) == 0) {
                                        unsafe2.putObject(obj4, j2, zzyhVar3.f17111c);
                                    } else {
                                        unsafe2.putObject(obj4, j2, zzaad.m8577c(unsafe2.getObject(obj4, j2), zzyhVar3.f17111c));
                                    }
                                    i35 |= i45;
                                    i29 = i16;
                                    i22 = i17;
                                    i28 = i3;
                                    i30 = i4;
                                    i32 = i13;
                                    i33 = i22;
                                    i31 = i7;
                                    bArr2 = bArr;
                                    break;
                                } else {
                                    i6 = i34;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i15;
                                    th2 = null;
                                    i10 = i4;
                                    i9 = i14;
                                    break;
                                }
                        }
                    } else {
                        i13 = m8660k;
                        if (i41 != 27) {
                            i6 = i34;
                            if (i41 <= 49) {
                                i24 = i42;
                                i25 = i35;
                                i8 = i13;
                                unsafe = unsafe2;
                                i27 = m8647R(obj, bArr, i43, i3, i42, i7, i39, i13, i40, i41, j2, zzyhVar);
                                if (i27 != i43) {
                                    i29 = i27;
                                } else {
                                    i9 = i24;
                                    i10 = i4;
                                    i5 = i27;
                                    i35 = i25;
                                    th2 = null;
                                }
                            } else {
                                i24 = i42;
                                i8 = i13;
                                unsafe = unsafe2;
                                i26 = i43;
                                i25 = i35;
                                if (i41 != 50) {
                                    th2 = null;
                                    i29 = m8645P(obj, bArr, i26, i3, i24, i7, i39, i40, i41, j2, i8, zzyhVar);
                                    if (i29 == i26) {
                                        i9 = i24;
                                        i10 = i4;
                                        i5 = i29;
                                        i35 = i25;
                                    }
                                } else if (i39 == 2) {
                                    m8644O(obj, bArr, i26, i3, i8, j2);
                                    throw null;
                                }
                            }
                            zzabfVar2 = this;
                            obj4 = obj;
                            bArr2 = bArr;
                            i33 = i24;
                            i28 = i3;
                            i30 = i4;
                            zzyhVar3 = zzyhVar;
                            i32 = i8;
                            i34 = i6;
                            i35 = i25;
                            i31 = i7;
                            unsafe2 = unsafe;
                        } else if (i39 == 2) {
                            zzaac zzaacVar = (zzaac) unsafe2.getObject(obj4, j2);
                            if (!zzaacVar.mo8573v()) {
                                int size = zzaacVar.size();
                                zzaacVar = zzaacVar.mo8572c(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j2, zzaacVar);
                            }
                            i22 = i42;
                            m9503m = zzyi.m9495e(zzabfVar2.m8663o(i13), i42, bArr, i43, i3, zzaacVar, zzyhVar);
                            i34 = i34;
                            i29 = m9503m;
                            i28 = i3;
                            i30 = i4;
                            i32 = i13;
                            i33 = i22;
                            i31 = i7;
                            bArr2 = bArr;
                        } else {
                            i6 = i34;
                            i24 = i42;
                            i25 = i35;
                            i8 = i13;
                            unsafe = unsafe2;
                            i26 = i43;
                        }
                        i27 = i26;
                        i9 = i24;
                        i10 = i4;
                        i5 = i27;
                        i35 = i25;
                        th2 = null;
                    }
                }
                if (i9 != i10 || i10 == 0) {
                    Throwable th3 = th2;
                    if (this.f16298f) {
                        zzyhVar2 = zzyhVar;
                        if (zzyhVar2.f17112d != zzzk.m9627a()) {
                            i11 = i7;
                            if (((zzzv) zzyhVar2.f17112d.f17152a.get(new zzzj(this.f16297e, i11))) != null) {
                                throw th3;
                            }
                            i29 = zzyi.m9499i(i9, bArr, i5, i3, m8631G(obj), zzyhVar);
                            obj3 = obj;
                            i28 = i3;
                            i30 = i10;
                            i33 = i9;
                            zzabfVar2 = this;
                            i31 = i11;
                            obj4 = obj3;
                            i32 = i8;
                            i34 = i6;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            zzyhVar3 = zzyhVar2;
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        zzyhVar2 = zzyhVar;
                    }
                    i11 = i7;
                    i29 = zzyi.m9499i(i9, bArr, i5, i3, m8631G(obj), zzyhVar);
                    i28 = i3;
                    i30 = i10;
                    i33 = i9;
                    zzabfVar2 = this;
                    i31 = i11;
                    obj4 = obj3;
                    i32 = i8;
                    i34 = i6;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    zzyhVar3 = zzyhVar2;
                } else {
                    zzabfVar = this;
                    obj2 = obj;
                    i29 = i5;
                    i30 = i10;
                    i33 = i9;
                    th = th2;
                    i34 = i6;
                }
            } else {
                unsafe = unsafe2;
                obj2 = obj4;
                zzabfVar = zzabfVar2;
                th = null;
            }
        }
        if (i34 != 1048575) {
            unsafe.putInt(obj2, i34, i35);
        }
        for (int i48 = zzabfVar.f16302j; i48 < zzabfVar.f16303k; i48++) {
            zzabfVar.m8664p(obj2, zzabfVar.f16301i[i48], th);
        }
        if (i30 == 0) {
            if (i29 != i3) {
                throw zzaaf.m8583f();
            }
        } else if (i29 > i3 || i33 != i30) {
            throw zzaaf.m8583f();
        }
        return i29;
    }

    /* renamed from: L */
    public final int m8642L(Object obj) {
        int i2;
        int m9612e;
        int m9612e2;
        int m9612e3;
        int m9613f;
        int m9612e4;
        int m9616z;
        int m9612e5;
        int m9612e6;
        int mo9513d;
        int m9612e7;
        int m8694J;
        int m9612e8;
        int m9613f2;
        int m8688D;
        int m9611d;
        int m9612e9;
        int i3;
        int m9612e10;
        int mo9513d2;
        int m9612e11;
        Unsafe unsafe = f16292p;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        int i8 = 0;
        while (i5 < this.f16293a.length) {
            int m8661l = m8661l(i5);
            int[] iArr = this.f16293a;
            int i9 = iArr[i5];
            int i10 = (m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 <= 17) {
                int i11 = iArr[i5 + 2];
                int i12 = i11 & i4;
                i2 = 1 << (i11 >>> 20);
                if (i12 != i7) {
                    i8 = unsafe.getInt(obj, i12);
                    i7 = i12;
                }
            } else {
                i2 = 0;
            }
            long j2 = i4 & m8661l;
            switch (i10) {
                case 0:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case 1:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case 2:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j2);
                        m9612e3 = zzzf.m9612e(i9 << 3);
                        m9613f = zzzf.m9613f(j3);
                        m8694J = m9612e3 + m9613f;
                        i6 += m8694J;
                        break;
                    }
                case 3:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j2);
                        m9612e3 = zzzf.m9612e(i9 << 3);
                        m9613f = zzzf.m9613f(j4);
                        m8694J = m9612e3 + m9613f;
                        i6 += m8694J;
                        break;
                    }
                case 4:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9616z(i13);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case 5:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case 6:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case 7:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e5 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e5 + 1;
                        i6 += m8694J;
                        break;
                    }
                case 8:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        if (!(object instanceof zzyu)) {
                            m9612e4 = zzzf.m9612e(i9 << 3);
                            m9616z = zzzf.m9610c((String) object);
                            m8694J = m9616z + m9612e4;
                            i6 += m8694J;
                            break;
                        } else {
                            m9612e6 = zzzf.m9612e(i9 << 3);
                            mo9513d = ((zzyu) object).mo9513d();
                            m9612e7 = zzzf.m9612e(mo9513d);
                            i6 = m9612e7 + mo9513d + m9612e6 + i6;
                            break;
                        }
                    }
                case 9:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m8694J = zzabq.m8694J(i9, unsafe.getObject(obj, j2), m8663o(i5));
                        i6 += m8694J;
                        break;
                    }
                case 10:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        zzyu zzyuVar = (zzyu) unsafe.getObject(obj, j2);
                        m9612e6 = zzzf.m9612e(i9 << 3);
                        mo9513d = zzyuVar.mo9513d();
                        m9612e7 = zzzf.m9612e(mo9513d);
                        i6 = m9612e7 + mo9513d + m9612e6 + i6;
                        break;
                    }
                case 11:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9612e(i14);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case 12:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9616z(i15);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case 13:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case 14:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case 15:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9612e((i16 >> 31) ^ (i16 + i16));
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case 16:
                    if ((i2 & i8) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j2);
                        m9612e8 = zzzf.m9612e(i9 << 3);
                        m9613f2 = zzzf.m9613f((j5 >> 63) ^ (j5 + j5));
                        m8694J = m9613f2 + m9612e8;
                        i6 += m8694J;
                        break;
                    }
                case 17:
                    if ((i8 & i2) == 0) {
                        break;
                    } else {
                        m8694J = zzzf.m9615y(i9, (zzabc) unsafe.getObject(obj, j2), m8663o(i5));
                        i6 += m8694J;
                        break;
                    }
                case 18:
                    m8694J = zzabq.m8687C(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 19:
                    m8694J = zzabq.m8685A(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 20:
                    m8694J = zzabq.m8692H(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 21:
                    m8694J = zzabq.m8703S(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 22:
                    m8694J = zzabq.m8690F(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 23:
                    m8694J = zzabq.m8687C(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 24:
                    m8694J = zzabq.m8685A(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 25:
                    m8694J = zzabq.m8725u(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 26:
                    m8694J = zzabq.m8700P(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 27:
                    m8694J = zzabq.m8695K(i9, (List) unsafe.getObject(obj, j2), m8663o(i5));
                    i6 += m8694J;
                    break;
                case 28:
                    m8694J = zzabq.m8728x(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 29:
                    m8694J = zzabq.m8701Q(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 30:
                    m8694J = zzabq.m8729y(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 31:
                    m8694J = zzabq.m8685A(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 32:
                    m8694J = zzabq.m8687C(i9, (List) unsafe.getObject(obj, j2));
                    i6 += m8694J;
                    break;
                case 33:
                    m8694J = zzabq.m8696L(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 34:
                    m8694J = zzabq.m8698N(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += m8694J;
                    break;
                case 35:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 36:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 37:
                    m8688D = zzabq.m8693I((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    m8688D = zzabq.m8704T((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 39:
                    m8688D = zzabq.m8691G((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 40:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 41:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = zzabq.f16323a;
                    m8688D = list.size();
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 43:
                    m8688D = zzabq.m8702R((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 44:
                    m8688D = zzabq.m8730z((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 45:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 46:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 47:
                    m8688D = zzabq.m8697M((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case 48:
                    m8688D = zzabq.m8699O((List) unsafe.getObject(obj, j2));
                    if (m8688D <= 0) {
                        break;
                    } else {
                        m9611d = zzzf.m9611d(i9);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i3 = m9612e9 + m9611d + m8688D;
                        i6 += i3;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    m8694J = zzabq.m8689E(i9, (List) unsafe.getObject(obj, j2), m8663o(i5));
                    i6 += m8694J;
                    break;
                case 50:
                    zzaax.m8609a(i9, unsafe.getObject(obj, j2), m8665q(i5));
                    break;
                case 51:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case 52:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case 53:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        long m8637m = m8637m(obj, j2);
                        m9612e3 = zzzf.m9612e(i9 << 3);
                        m9613f = zzzf.m9613f(m8637m);
                        m8694J = m9612e3 + m9613f;
                        i6 += m8694J;
                        break;
                    }
                case 54:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        long m8637m2 = m8637m(obj, j2);
                        m9612e3 = zzzf.m9612e(i9 << 3);
                        m9613f = zzzf.m9613f(m8637m2);
                        m8694J = m9612e3 + m9613f;
                        i6 += m8694J;
                        break;
                    }
                case 55:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        int m8636N = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9616z(m8636N);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case 57:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case 58:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e5 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e5 + 1;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (!(object2 instanceof zzyu)) {
                            m9612e4 = zzzf.m9612e(i9 << 3);
                            m9616z = zzzf.m9610c((String) object2);
                            m8694J = m9616z + m9612e4;
                            i6 += m8694J;
                            break;
                        } else {
                            m9612e10 = zzzf.m9612e(i9 << 3);
                            mo9513d2 = ((zzyu) object2).mo9513d();
                            m9612e11 = zzzf.m9612e(mo9513d2);
                            i3 = m9612e11 + mo9513d2 + m9612e10;
                            i6 += i3;
                            break;
                        }
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m8694J = zzabq.m8694J(i9, unsafe.getObject(obj, j2), m8663o(i5));
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        zzyu zzyuVar2 = (zzyu) unsafe.getObject(obj, j2);
                        m9612e10 = zzzf.m9612e(i9 << 3);
                        mo9513d2 = zzyuVar2.mo9513d();
                        m9612e11 = zzzf.m9612e(mo9513d2);
                        i3 = m9612e11 + mo9513d2 + m9612e10;
                        i6 += i3;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        int m8636N2 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9612e(m8636N2);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        int m8636N3 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9616z(m8636N3);
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case 64:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e2 = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e2 + 4;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m9612e = zzzf.m9612e(i9 << 3);
                        m8694J = m9612e + 8;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        int m8636N4 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i9 << 3);
                        m9616z = zzzf.m9612e((m8636N4 >> 31) ^ (m8636N4 + m8636N4));
                        m8694J = m9616z + m9612e4;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        long m8637m3 = m8637m(obj, j2);
                        m9612e8 = zzzf.m9612e(i9 << 3);
                        m9613f2 = zzzf.m9613f((m8637m3 >> 63) ^ (m8637m3 + m8637m3));
                        m8694J = m9613f2 + m9612e8;
                        i6 += m8694J;
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (!m8639B(obj, i9, i5)) {
                        break;
                    } else {
                        m8694J = zzzf.m9615y(i9, (zzabc) unsafe.getObject(obj, j2), m8663o(i5));
                        i6 += m8694J;
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
        }
        zzacf zzacfVar = this.f16305m;
        int mo8742a = i6 + zzacfVar.mo8742a(zzacfVar.mo8745d(obj));
        if (!this.f16298f) {
            return mo8742a;
        }
        this.f16306n.mo9628a(obj);
        throw null;
    }

    /* renamed from: M */
    public final int m8643M(Object obj) {
        int m9612e;
        int m9612e2;
        int m9612e3;
        int m9613f;
        int m9612e4;
        int m9616z;
        int m9612e5;
        int m9612e6;
        int mo9513d;
        int m9612e7;
        int m8694J;
        int m9612e8;
        int m9613f2;
        int m8688D;
        int m9611d;
        int m9612e9;
        int i2;
        Unsafe unsafe = f16292p;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f16293a.length; i4 += 3) {
            int m8661l = m8661l(i4);
            int i5 = (m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            int[] iArr = this.f16293a;
            int i6 = iArr[i4];
            long j2 = m8661l & 1048575;
            if (i5 >= zzzq.f17159c.f17163b && i5 <= zzzq.f17160d.f17163b) {
                int i7 = iArr[i4 + 2];
            }
            switch (i5) {
                case 0:
                    if (m8672y(obj, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8672y(obj, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8672y(obj, i4)) {
                        long m8788h = zzacp.m8788h(obj, j2);
                        m9612e3 = zzzf.m9612e(i6 << 3);
                        m9613f = zzzf.m9613f(m8788h);
                        m8694J = m9613f + m9612e3;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8672y(obj, i4)) {
                        long m8788h2 = zzacp.m8788h(obj, j2);
                        m9612e3 = zzzf.m9612e(i6 << 3);
                        m9613f = zzzf.m9613f(m8788h2);
                        m8694J = m9613f + m9612e3;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8672y(obj, i4)) {
                        int m8787g = zzacp.m8787g(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9616z(m8787g);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8672y(obj, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8672y(obj, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8672y(obj, i4)) {
                        m9612e5 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e5 + 1;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m8672y(obj, i4)) {
                        Object m8790j = zzacp.m8790j(obj, j2);
                        if (m8790j instanceof zzyu) {
                            m9612e6 = zzzf.m9612e(i6 << 3);
                            mo9513d = ((zzyu) m8790j).mo9513d();
                            m9612e7 = zzzf.m9612e(mo9513d);
                            i2 = m9612e7 + mo9513d + m9612e6;
                            i3 += i2;
                            break;
                        } else {
                            m9612e4 = zzzf.m9612e(i6 << 3);
                            m9616z = zzzf.m9610c((String) m8790j);
                            m8694J = m9616z + m9612e4;
                            i3 += m8694J;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m8672y(obj, i4)) {
                        m8694J = zzabq.m8694J(i6, zzacp.m8790j(obj, j2), m8663o(i4));
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m8672y(obj, i4)) {
                        zzyu zzyuVar = (zzyu) zzacp.m8790j(obj, j2);
                        m9612e6 = zzzf.m9612e(i6 << 3);
                        mo9513d = zzyuVar.mo9513d();
                        m9612e7 = zzzf.m9612e(mo9513d);
                        i2 = m9612e7 + mo9513d + m9612e6;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8672y(obj, i4)) {
                        int m8787g2 = zzacp.m8787g(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9612e(m8787g2);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8672y(obj, i4)) {
                        int m8787g3 = zzacp.m8787g(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9616z(m8787g3);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8672y(obj, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8672y(obj, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8672y(obj, i4)) {
                        int m8787g4 = zzacp.m8787g(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9612e((m8787g4 >> 31) ^ (m8787g4 + m8787g4));
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8672y(obj, i4)) {
                        long m8788h3 = zzacp.m8788h(obj, j2);
                        m9612e8 = zzzf.m9612e(i6 << 3);
                        m9613f2 = zzzf.m9613f((m8788h3 >> 63) ^ (m8788h3 + m8788h3));
                        m8694J = m9613f2 + m9612e8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m8672y(obj, i4)) {
                        m8694J = zzzf.m9615y(i6, (zzabc) zzacp.m8790j(obj, j2), m8663o(i4));
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m8694J = zzabq.m8687C(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 19:
                    m8694J = zzabq.m8685A(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 20:
                    m8694J = zzabq.m8692H(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 21:
                    m8694J = zzabq.m8703S(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 22:
                    m8694J = zzabq.m8690F(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 23:
                    m8694J = zzabq.m8687C(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 24:
                    m8694J = zzabq.m8685A(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 25:
                    m8694J = zzabq.m8725u(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 26:
                    m8694J = zzabq.m8700P(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 27:
                    m8694J = zzabq.m8695K(i6, (List) zzacp.m8790j(obj, j2), m8663o(i4));
                    i3 += m8694J;
                    break;
                case 28:
                    m8694J = zzabq.m8728x(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 29:
                    m8694J = zzabq.m8701Q(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 30:
                    m8694J = zzabq.m8729y(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 31:
                    m8694J = zzabq.m8685A(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 32:
                    m8694J = zzabq.m8687C(i6, (List) zzacp.m8790j(obj, j2));
                    i3 += m8694J;
                    break;
                case 33:
                    m8694J = zzabq.m8696L(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 34:
                    m8694J = zzabq.m8698N(i6, (List) zzacp.m8790j(obj, j2), false);
                    i3 += m8694J;
                    break;
                case 35:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m8688D = zzabq.m8693I((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    m8688D = zzabq.m8704T((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m8688D = zzabq.m8691G((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = zzabq.f16323a;
                    m8688D = list.size();
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m8688D = zzabq.m8702R((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m8688D = zzabq.m8730z((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m8688D = zzabq.m8686B((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m8688D = zzabq.m8688D((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m8688D = zzabq.m8697M((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m8688D = zzabq.m8699O((List) unsafe.getObject(obj, j2));
                    if (m8688D > 0) {
                        m9611d = zzzf.m9611d(i6);
                        m9612e9 = zzzf.m9612e(m8688D);
                        i2 = m9612e9 + m9611d + m8688D;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    m8694J = zzabq.m8689E(i6, (List) zzacp.m8790j(obj, j2), m8663o(i4));
                    i3 += m8694J;
                    break;
                case 50:
                    zzaax.m8609a(i6, zzacp.m8790j(obj, j2), m8665q(i4));
                    break;
                case 51:
                    if (m8639B(obj, i6, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8639B(obj, i6, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8639B(obj, i6, i4)) {
                        long m8637m = m8637m(obj, j2);
                        m9612e3 = zzzf.m9612e(i6 << 3);
                        m9613f = zzzf.m9613f(m8637m);
                        m8694J = m9613f + m9612e3;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8639B(obj, i6, i4)) {
                        long m8637m2 = m8637m(obj, j2);
                        m9612e3 = zzzf.m9612e(i6 << 3);
                        m9613f = zzzf.m9613f(m8637m2);
                        m8694J = m9613f + m9612e3;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8639B(obj, i6, i4)) {
                        int m8636N = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9616z(m8636N);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m8639B(obj, i6, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8639B(obj, i6, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8639B(obj, i6, i4)) {
                        m9612e5 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e5 + 1;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8639B(obj, i6, i4)) {
                        Object m8790j2 = zzacp.m8790j(obj, j2);
                        if (m8790j2 instanceof zzyu) {
                            m9612e6 = zzzf.m9612e(i6 << 3);
                            mo9513d = ((zzyu) m8790j2).mo9513d();
                            m9612e7 = zzzf.m9612e(mo9513d);
                            i2 = m9612e7 + mo9513d + m9612e6;
                            i3 += i2;
                            break;
                        } else {
                            m9612e4 = zzzf.m9612e(i6 << 3);
                            m9616z = zzzf.m9610c((String) m8790j2);
                            m8694J = m9616z + m9612e4;
                            i3 += m8694J;
                            break;
                        }
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m8639B(obj, i6, i4)) {
                        m8694J = zzabq.m8694J(i6, zzacp.m8790j(obj, j2), m8663o(i4));
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m8639B(obj, i6, i4)) {
                        zzyu zzyuVar2 = (zzyu) zzacp.m8790j(obj, j2);
                        m9612e6 = zzzf.m9612e(i6 << 3);
                        mo9513d = zzyuVar2.mo9513d();
                        m9612e7 = zzzf.m9612e(mo9513d);
                        i2 = m9612e7 + mo9513d + m9612e6;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m8639B(obj, i6, i4)) {
                        int m8636N2 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9612e(m8636N2);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m8639B(obj, i6, i4)) {
                        int m8636N3 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9616z(m8636N3);
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8639B(obj, i6, i4)) {
                        m9612e2 = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e2 + 4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m8639B(obj, i6, i4)) {
                        m9612e = zzzf.m9612e(i6 << 3);
                        m8694J = m9612e + 8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m8639B(obj, i6, i4)) {
                        int m8636N4 = m8636N(obj, j2);
                        m9612e4 = zzzf.m9612e(i6 << 3);
                        m9616z = zzzf.m9612e((m8636N4 >> 31) ^ (m8636N4 + m8636N4));
                        m8694J = m9616z + m9612e4;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8639B(obj, i6, i4)) {
                        long m8637m3 = m8637m(obj, j2);
                        m9612e8 = zzzf.m9612e(i6 << 3);
                        m9613f2 = zzzf.m9613f((m8637m3 >> 63) ^ (m8637m3 + m8637m3));
                        m8694J = m9613f2 + m9612e8;
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m8639B(obj, i6, i4)) {
                        m8694J = zzzf.m9615y(i6, (zzabc) zzacp.m8790j(obj, j2), m8663o(i4));
                        i3 += m8694J;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzacf zzacfVar = this.f16305m;
        return i3 + zzacfVar.mo8742a(zzacfVar.mo8745d(obj));
    }

    /* renamed from: O */
    public final int m8644O(Object obj, byte[] bArr, int i2, int i3, int i4, long j2) throws IOException {
        Unsafe unsafe = f16292p;
        Object m8665q = m8665q(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzaaw) object).f16287b) {
            zzaaw m8607b = zzaaw.f16286c.m8607b();
            zzaax.m8611c(m8607b, object);
            unsafe.putObject(obj, j2, m8607b);
        }
        throw null;
    }

    /* renamed from: P */
    public final int m8645P(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzyh zzyhVar) throws IOException {
        Unsafe unsafe = f16292p;
        long j3 = this.f16293a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(zzyi.m9504n(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(zzyi.m9492b(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int m9503m = zzyi.m9503m(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzyhVar.f17110b));
                    unsafe.putInt(obj, j3, i5);
                    return m9503m;
                }
                break;
            case 55:
            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i6 == 0) {
                    int m9500j = zzyi.m9500j(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzyhVar.f17109a));
                    unsafe.putInt(obj, j3, i5);
                    return m9500j;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Long.valueOf(zzyi.m9504n(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Integer.valueOf(zzyi.m9492b(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int m9503m2 = zzyi.m9503m(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, Boolean.valueOf(zzyhVar.f17110b != 0));
                    unsafe.putInt(obj, j3, i5);
                    return m9503m2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i6 == 2) {
                    int m9500j2 = zzyi.m9500j(bArr, i2, zzyhVar);
                    int i10 = zzyhVar.f17109a;
                    if (i10 == 0) {
                        unsafe.putObject(obj, j2, "");
                    } else {
                        if ((i7 & 536870912) != 0 && !zzacu.m8810e(bArr, m9500j2, m9500j2 + i10)) {
                            throw zzaaf.m8580c();
                        }
                        unsafe.putObject(obj, j2, new String(bArr, m9500j2, i10, zzaad.f16259a));
                        m9500j2 += i10;
                    }
                    unsafe.putInt(obj, j3, i5);
                    return m9500j2;
                }
                break;
            case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                if (i6 == 2) {
                    int m9494d = zzyi.m9494d(m8663o(i9), bArr, i2, i3, zzyhVar);
                    Object object = unsafe.getInt(obj, j3) == i5 ? unsafe.getObject(obj, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j2, zzyhVar.f17111c);
                    } else {
                        unsafe.putObject(obj, j2, zzaad.m8577c(object, zzyhVar.f17111c));
                    }
                    unsafe.putInt(obj, j3, i5);
                    return m9494d;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                if (i6 == 2) {
                    int m9491a = zzyi.m9491a(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, zzyhVar.f17111c);
                    unsafe.putInt(obj, j3, i5);
                    return m9491a;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                if (i6 == 0) {
                    int m9500j3 = zzyi.m9500j(bArr, i2, zzyhVar);
                    int i11 = zzyhVar.f17109a;
                    zzaab m8662n = m8662n(i9);
                    if (m8662n == null || m8662n.m8571u()) {
                        unsafe.putObject(obj, j2, Integer.valueOf(i11));
                        unsafe.putInt(obj, j3, i5);
                    } else {
                        m8631G(obj).m8762c(i4, Long.valueOf(i11));
                    }
                    return m9500j3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i6 == 0) {
                    int m9500j4 = zzyi.m9500j(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzyy.m9545l(zzyhVar.f17109a)));
                    unsafe.putInt(obj, j3, i5);
                    return m9500j4;
                }
                break;
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i6 == 0) {
                    int m9503m3 = zzyi.m9503m(bArr, i2, zzyhVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzyy.m9546m(zzyhVar.f17110b)));
                    unsafe.putInt(obj, j3, i5);
                    return m9503m3;
                }
                break;
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i6 == 3) {
                    int m9493c = zzyi.m9493c(m8663o(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzyhVar);
                    Object object2 = unsafe.getInt(obj, j3) == i5 ? unsafe.getObject(obj, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j2, zzyhVar.f17111c);
                    } else {
                        unsafe.putObject(obj, j2, zzaad.m8577c(object2, zzyhVar.f17111c));
                    }
                    unsafe.putInt(obj, j3, i5);
                    return m9493c;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0270, code lost:
    
        if (r0 != r10) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0273, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b1, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02af, code lost:
    
        if (r0 != r10) goto L118;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0090. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m8646Q(java.lang.Object r33, byte[] r34, int r35, int r36, com.google.android.gms.internal.p041firebaseauthapi.zzyh r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzabf.m8646Q(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    /* renamed from: R */
    public final int m8647R(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, zzyh zzyhVar) throws IOException {
        int i9;
        int i10;
        int i11;
        int i12;
        int m9500j;
        int i13 = i2;
        Unsafe unsafe = f16292p;
        zzaac zzaacVar = (zzaac) unsafe.getObject(obj, j3);
        if (!zzaacVar.mo8573v()) {
            int size = zzaacVar.size();
            zzaacVar = zzaacVar.mo8572c(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j3, zzaacVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    zzzh zzzhVar = (zzzh) zzaacVar;
                    int m9500j2 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i14 = zzyhVar.f17109a + m9500j2;
                    while (m9500j2 < i14) {
                        zzzhVar.m9624d(Double.longBitsToDouble(zzyi.m9504n(bArr, m9500j2)));
                        m9500j2 += 8;
                    }
                    if (m9500j2 == i14) {
                        return m9500j2;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 1) {
                    zzzh zzzhVar2 = (zzzh) zzaacVar;
                    zzzhVar2.m9624d(Double.longBitsToDouble(zzyi.m9504n(bArr, i2)));
                    while (true) {
                        i9 = i13 + 8;
                        if (i9 < i3) {
                            int m9500j3 = zzyi.m9500j(bArr, i9, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                zzzhVar2.m9624d(Double.longBitsToDouble(zzyi.m9504n(bArr, m9500j3)));
                                i13 = m9500j3;
                            }
                        }
                    }
                    return i9;
                }
                return i13;
            case 19:
            case 36:
                if (i6 == 2) {
                    zzzr zzzrVar = (zzzr) zzaacVar;
                    int m9500j4 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i15 = zzyhVar.f17109a + m9500j4;
                    while (m9500j4 < i15) {
                        zzzrVar.m9641d(Float.intBitsToFloat(zzyi.m9492b(bArr, m9500j4)));
                        m9500j4 += 4;
                    }
                    if (m9500j4 == i15) {
                        return m9500j4;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 5) {
                    zzzr zzzrVar2 = (zzzr) zzaacVar;
                    zzzrVar2.m9641d(Float.intBitsToFloat(zzyi.m9492b(bArr, i2)));
                    while (true) {
                        i10 = i13 + 4;
                        if (i10 < i3) {
                            int m9500j5 = zzyi.m9500j(bArr, i10, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                zzzrVar2.m9641d(Float.intBitsToFloat(zzyi.m9492b(bArr, m9500j5)));
                                i13 = m9500j5;
                            }
                        }
                    }
                    return i10;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                if (i6 == 2) {
                    zzaar zzaarVar = (zzaar) zzaacVar;
                    int m9500j6 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i16 = zzyhVar.f17109a + m9500j6;
                    while (m9500j6 < i16) {
                        m9500j6 = zzyi.m9503m(bArr, m9500j6, zzyhVar);
                        zzaarVar.m8599e(zzyhVar.f17110b);
                    }
                    if (m9500j6 == i16) {
                        return m9500j6;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 0) {
                    zzaar zzaarVar2 = (zzaar) zzaacVar;
                    int m9503m = zzyi.m9503m(bArr, i13, zzyhVar);
                    zzaarVar2.m8599e(zzyhVar.f17110b);
                    while (m9503m < i3) {
                        int m9500j7 = zzyi.m9500j(bArr, m9503m, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9503m;
                        }
                        m9503m = zzyi.m9503m(bArr, m9500j7, zzyhVar);
                        zzaarVar2.m8599e(zzyhVar.f17110b);
                    }
                    return m9503m;
                }
                return i13;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return zzyi.m9496f(bArr, i13, zzaacVar, zzyhVar);
                }
                if (i6 == 0) {
                    return zzyi.m9502l(i4, bArr, i2, i3, zzaacVar, zzyhVar);
                }
                return i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    zzaar zzaarVar3 = (zzaar) zzaacVar;
                    int m9500j8 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i17 = zzyhVar.f17109a + m9500j8;
                    while (m9500j8 < i17) {
                        zzaarVar3.m8599e(zzyi.m9504n(bArr, m9500j8));
                        m9500j8 += 8;
                    }
                    if (m9500j8 == i17) {
                        return m9500j8;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 1) {
                    zzaar zzaarVar4 = (zzaar) zzaacVar;
                    zzaarVar4.m8599e(zzyi.m9504n(bArr, i2));
                    while (true) {
                        i11 = i13 + 8;
                        if (i11 < i3) {
                            int m9500j9 = zzyi.m9500j(bArr, i11, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                zzaarVar4.m8599e(zzyi.m9504n(bArr, m9500j9));
                                i13 = m9500j9;
                            }
                        }
                    }
                    return i11;
                }
                return i13;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    zzzy zzzyVar = (zzzy) zzaacVar;
                    int m9500j10 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i18 = zzyhVar.f17109a + m9500j10;
                    while (m9500j10 < i18) {
                        zzzyVar.m9659e(zzyi.m9492b(bArr, m9500j10));
                        m9500j10 += 4;
                    }
                    if (m9500j10 == i18) {
                        return m9500j10;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 5) {
                    zzzy zzzyVar2 = (zzzy) zzaacVar;
                    zzzyVar2.m9659e(zzyi.m9492b(bArr, i2));
                    while (true) {
                        i12 = i13 + 4;
                        if (i12 < i3) {
                            int m9500j11 = zzyi.m9500j(bArr, i12, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                zzzyVar2.m9659e(zzyi.m9492b(bArr, m9500j11));
                                i13 = m9500j11;
                            }
                        }
                    }
                    return i12;
                }
                return i13;
            case 25:
            case 42:
                if (i6 == 2) {
                    zzyj zzyjVar = (zzyj) zzaacVar;
                    m9500j = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i19 = zzyhVar.f17109a + m9500j;
                    while (m9500j < i19) {
                        m9500j = zzyi.m9503m(bArr, m9500j, zzyhVar);
                        zzyjVar.m9505d(zzyhVar.f17110b != 0);
                    }
                    if (m9500j != i19) {
                        throw zzaaf.m8584g();
                    }
                    return m9500j;
                }
                if (i6 == 0) {
                    zzyj zzyjVar2 = (zzyj) zzaacVar;
                    int m9503m2 = zzyi.m9503m(bArr, i13, zzyhVar);
                    zzyjVar2.m9505d(zzyhVar.f17110b != 0);
                    while (m9503m2 < i3) {
                        int m9500j12 = zzyi.m9500j(bArr, m9503m2, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9503m2;
                        }
                        m9503m2 = zzyi.m9503m(bArr, m9500j12, zzyhVar);
                        zzyjVar2.m9505d(zzyhVar.f17110b != 0);
                    }
                    return m9503m2;
                }
                return i13;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        i13 = zzyi.m9500j(bArr, i13, zzyhVar);
                        int i20 = zzyhVar.f17109a;
                        if (i20 < 0) {
                            throw zzaaf.m8582e();
                        }
                        if (i20 == 0) {
                            zzaacVar.add("");
                        } else {
                            zzaacVar.add(new String(bArr, i13, i20, zzaad.f16259a));
                            i13 += i20;
                        }
                        while (i13 < i3) {
                            int m9500j13 = zzyi.m9500j(bArr, i13, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                i13 = zzyi.m9500j(bArr, m9500j13, zzyhVar);
                                int i21 = zzyhVar.f17109a;
                                if (i21 < 0) {
                                    throw zzaaf.m8582e();
                                }
                                if (i21 == 0) {
                                    zzaacVar.add("");
                                } else {
                                    zzaacVar.add(new String(bArr, i13, i21, zzaad.f16259a));
                                    i13 += i21;
                                }
                            }
                        }
                    } else {
                        i13 = zzyi.m9500j(bArr, i13, zzyhVar);
                        int i22 = zzyhVar.f17109a;
                        if (i22 < 0) {
                            throw zzaaf.m8582e();
                        }
                        if (i22 == 0) {
                            zzaacVar.add("");
                        } else {
                            int i23 = i13 + i22;
                            if (!zzacu.m8810e(bArr, i13, i23)) {
                                throw zzaaf.m8580c();
                            }
                            zzaacVar.add(new String(bArr, i13, i22, zzaad.f16259a));
                            i13 = i23;
                        }
                        while (i13 < i3) {
                            int m9500j14 = zzyi.m9500j(bArr, i13, zzyhVar);
                            if (i4 == zzyhVar.f17109a) {
                                i13 = zzyi.m9500j(bArr, m9500j14, zzyhVar);
                                int i24 = zzyhVar.f17109a;
                                if (i24 < 0) {
                                    throw zzaaf.m8582e();
                                }
                                if (i24 == 0) {
                                    zzaacVar.add("");
                                } else {
                                    int i25 = i13 + i24;
                                    if (!zzacu.m8810e(bArr, i13, i25)) {
                                        throw zzaaf.m8580c();
                                    }
                                    zzaacVar.add(new String(bArr, i13, i24, zzaad.f16259a));
                                    i13 = i25;
                                }
                            }
                        }
                    }
                }
                return i13;
            case 27:
                if (i6 == 2) {
                    return zzyi.m9495e(m8663o(i7), i4, bArr, i2, i3, zzaacVar, zzyhVar);
                }
                return i13;
            case 28:
                if (i6 == 2) {
                    int m9500j15 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i26 = zzyhVar.f17109a;
                    if (i26 < 0) {
                        throw zzaaf.m8582e();
                    }
                    if (i26 > bArr.length - m9500j15) {
                        throw zzaaf.m8584g();
                    }
                    if (i26 == 0) {
                        zzaacVar.add(zzyu.f17120c);
                    } else {
                        zzaacVar.add(zzyu.m9523z(bArr, m9500j15, i26));
                        m9500j15 += i26;
                    }
                    while (m9500j15 < i3) {
                        int m9500j16 = zzyi.m9500j(bArr, m9500j15, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9500j15;
                        }
                        m9500j15 = zzyi.m9500j(bArr, m9500j16, zzyhVar);
                        int i27 = zzyhVar.f17109a;
                        if (i27 < 0) {
                            throw zzaaf.m8582e();
                        }
                        if (i27 > bArr.length - m9500j15) {
                            throw zzaaf.m8584g();
                        }
                        if (i27 == 0) {
                            zzaacVar.add(zzyu.f17120c);
                        } else {
                            zzaacVar.add(zzyu.m9523z(bArr, m9500j15, i27));
                            m9500j15 += i27;
                        }
                    }
                    return m9500j15;
                }
                return i13;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        m9500j = zzyi.m9502l(i4, bArr, i2, i3, zzaacVar, zzyhVar);
                    }
                    return i13;
                }
                m9500j = zzyi.m9496f(bArr, i13, zzaacVar, zzyhVar);
                zzzx zzzxVar = (zzzx) obj;
                zzacg zzacgVar = zzzxVar.zzc;
                if (zzacgVar == zzacg.f16345f) {
                    zzacgVar = null;
                }
                Object m8705a = zzabq.m8705a(i5, zzaacVar, m8662n(i7), zzacgVar, this.f16305m);
                if (m8705a != null) {
                    zzzxVar.zzc = (zzacg) m8705a;
                    return m9500j;
                }
                return m9500j;
            case 33:
            case 47:
                if (i6 == 2) {
                    zzzy zzzyVar3 = (zzzy) zzaacVar;
                    int m9500j17 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i28 = zzyhVar.f17109a + m9500j17;
                    while (m9500j17 < i28) {
                        m9500j17 = zzyi.m9500j(bArr, m9500j17, zzyhVar);
                        zzzyVar3.m9659e(zzyy.m9545l(zzyhVar.f17109a));
                    }
                    if (m9500j17 == i28) {
                        return m9500j17;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 0) {
                    zzzy zzzyVar4 = (zzzy) zzaacVar;
                    int m9500j18 = zzyi.m9500j(bArr, i13, zzyhVar);
                    zzzyVar4.m9659e(zzyy.m9545l(zzyhVar.f17109a));
                    while (m9500j18 < i3) {
                        int m9500j19 = zzyi.m9500j(bArr, m9500j18, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9500j18;
                        }
                        m9500j18 = zzyi.m9500j(bArr, m9500j19, zzyhVar);
                        zzzyVar4.m9659e(zzyy.m9545l(zzyhVar.f17109a));
                    }
                    return m9500j18;
                }
                return i13;
            case 34:
            case 48:
                if (i6 == 2) {
                    zzaar zzaarVar5 = (zzaar) zzaacVar;
                    int m9500j20 = zzyi.m9500j(bArr, i13, zzyhVar);
                    int i29 = zzyhVar.f17109a + m9500j20;
                    while (m9500j20 < i29) {
                        m9500j20 = zzyi.m9503m(bArr, m9500j20, zzyhVar);
                        zzaarVar5.m8599e(zzyy.m9546m(zzyhVar.f17110b));
                    }
                    if (m9500j20 == i29) {
                        return m9500j20;
                    }
                    throw zzaaf.m8584g();
                }
                if (i6 == 0) {
                    zzaar zzaarVar6 = (zzaar) zzaacVar;
                    int m9503m3 = zzyi.m9503m(bArr, i13, zzyhVar);
                    zzaarVar6.m8599e(zzyy.m9546m(zzyhVar.f17110b));
                    while (m9503m3 < i3) {
                        int m9500j21 = zzyi.m9500j(bArr, m9503m3, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9503m3;
                        }
                        m9503m3 = zzyi.m9503m(bArr, m9500j21, zzyhVar);
                        zzaarVar6.m8599e(zzyy.m9546m(zzyhVar.f17110b));
                    }
                    return m9503m3;
                }
                return i13;
            default:
                if (i6 == 3) {
                    zzabo m8663o = m8663o(i7);
                    int i30 = (i4 & (-8)) | 4;
                    int m9493c = zzyi.m9493c(m8663o, bArr, i2, i3, i30, zzyhVar);
                    zzaacVar.add(zzyhVar.f17111c);
                    while (m9493c < i3) {
                        int m9500j22 = zzyi.m9500j(bArr, m9493c, zzyhVar);
                        if (i4 != zzyhVar.f17109a) {
                            return m9493c;
                        }
                        m9493c = zzyi.m9493c(m8663o, bArr, m9500j22, i3, i30, zzyhVar);
                        zzaacVar.add(zzyhVar.f17111c);
                    }
                    return m9493c;
                }
                return i13;
        }
    }

    /* renamed from: S */
    public final int m8648S(int i2) {
        if (i2 < this.f16295c || i2 > this.f16296d) {
            return -1;
        }
        return m8660k(i2, 0);
    }

    /* renamed from: T */
    public final int m8649T(int i2) {
        return this.f16293a[i2 + 2];
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: a */
    public final int mo8650a(Object obj) {
        return this.f16300h ? m8643M(obj) : m8642L(obj);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: b */
    public final int mo8651b(Object obj) {
        int i2;
        int m8576b;
        int i3;
        int m8787g;
        int length = this.f16293a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int m8661l = m8661l(i5);
            int i6 = this.f16293a[i5];
            long j2 = 1048575 & m8661l;
            int i7 = 37;
            switch ((m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(Double.doubleToLongBits(zzacp.m8785e(obj, j2)));
                    i4 = m8576b + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    m8576b = Float.floatToIntBits(zzacp.m8786f(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(zzacp.m8788h(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(zzacp.m8788h(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 5:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(zzacp.m8788h(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 7:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8575a(zzacp.m8801u(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    m8576b = ((String) zzacp.m8790j(obj, j2)).hashCode();
                    i4 = m8576b + i2;
                    break;
                case 9:
                    Object m8790j = zzacp.m8790j(obj, j2);
                    if (m8790j != null) {
                        i7 = m8790j.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    m8576b = zzacp.m8790j(obj, j2).hashCode();
                    i4 = m8576b + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 12:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 13:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 14:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(zzacp.m8788h(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    m8787g = zzacp.m8787g(obj, j2);
                    i4 = i3 + m8787g;
                    break;
                case 16:
                    i2 = i4 * 53;
                    m8576b = zzaad.m8576b(zzacp.m8788h(obj, j2));
                    i4 = m8576b + i2;
                    break;
                case 17:
                    Object m8790j2 = zzacp.m8790j(obj, j2);
                    if (m8790j2 != null) {
                        i7 = m8790j2.hashCode();
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
                    m8576b = zzacp.m8790j(obj, j2).hashCode();
                    i4 = m8576b + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    m8576b = zzacp.m8790j(obj, j2).hashCode();
                    i4 = m8576b + i2;
                    break;
                case 51:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(Double.doubleToLongBits(m8634J(obj, j2)));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = Float.floatToIntBits(m8635K(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(m8637m(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(m8637m(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(m8637m(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8575a(m8629C(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = ((String) zzacp.m8790j(obj, j2)).hashCode();
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzacp.m8790j(obj, j2).hashCode();
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzacp.m8790j(obj, j2).hashCode();
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(m8637m(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m8639B(obj, i6, i5)) {
                        i3 = i4 * 53;
                        m8787g = m8636N(obj, j2);
                        i4 = i3 + m8787g;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzaad.m8576b(m8637m(obj, j2));
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m8639B(obj, i6, i5)) {
                        i2 = i4 * 53;
                        m8576b = zzacp.m8790j(obj, j2).hashCode();
                        i4 = m8576b + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f16305m.mo8745d(obj).hashCode() + (i4 * 53);
        if (!this.f16298f) {
            return hashCode;
        }
        this.f16306n.mo9628a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: c */
    public final void mo8652c(Object obj) {
        int i2;
        int i3 = this.f16302j;
        while (true) {
            i2 = this.f16303k;
            if (i3 >= i2) {
                break;
            }
            long m8661l = m8661l(this.f16301i[i3]) & 1048575;
            Object m8790j = zzacp.m8790j(obj, m8661l);
            if (m8790j != null) {
                ((zzaaw) m8790j).f16287b = false;
                zzacp.f16357c.m8780p(obj, m8661l, m8790j);
            }
            i3++;
        }
        int length = this.f16301i.length;
        while (i2 < length) {
            this.f16304l.mo8596b(obj, this.f16301i[i2]);
            i2++;
        }
        this.f16305m.mo8754m(obj);
        if (this.f16298f) {
            this.f16306n.mo9632e(obj);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: d */
    public final void mo8653d(Object obj, zzzg zzzgVar) throws IOException {
        if (!this.f16300h) {
            m8640D(obj, zzzgVar);
            return;
        }
        if (this.f16298f) {
            this.f16306n.mo9628a(obj);
            throw null;
        }
        int length = this.f16293a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int m8661l = m8661l(i2);
            int i3 = this.f16293a[i2];
            switch ((m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9620c(i3, zzacp.m8785e(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9621d(i3, zzacp.m8786f(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9604v(i3, zzacp.m8788h(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9604v(i3, zzacp.m8788h(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9597o(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9595m(i3, zzacp.m8788h(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9593k(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9591i(i3, zzacp.m8801u(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m8672y(obj, i2)) {
                        m8630E(i3, zzacp.m8790j(obj, m8661l & 1048575), zzzgVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9623f(i3, zzacp.m8790j(obj, m8661l & 1048575), m8663o(i2));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9592j(i3, (zzyu) zzacp.m8790j(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9602t(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9597o(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9593k(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8672y(obj, i2)) {
                        zzzgVar.f17145a.mo9595m(i3, zzacp.m8788h(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9618a(i3, zzacp.m8787g(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9619b(i3, zzacp.m8788h(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m8672y(obj, i2)) {
                        zzzgVar.m9622e(i3, zzacp.m8790j(obj, m8661l & 1048575), m8663o(i2));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzabq.m8710f(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 19:
                    zzabq.m8714j(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 20:
                    zzabq.m8717m(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 21:
                    zzabq.m8726v(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 22:
                    zzabq.m8716l(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 23:
                    zzabq.m8713i(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 24:
                    zzabq.m8712h(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 25:
                    zzabq.m8708d(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 26:
                    zzabq.m8723s(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar);
                    break;
                case 27:
                    zzabq.m8718n(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, m8663o(i2));
                    break;
                case 28:
                    zzabq.m8709e(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar);
                    break;
                case 29:
                    zzabq.m8724t(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 30:
                    zzabq.m8711g(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 31:
                    zzabq.m8719o(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 32:
                    zzabq.m8720p(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 33:
                    zzabq.m8721q(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 34:
                    zzabq.m8722r(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, false);
                    break;
                case 35:
                    zzabq.m8710f(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 36:
                    zzabq.m8714j(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 37:
                    zzabq.m8717m(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    zzabq.m8726v(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 39:
                    zzabq.m8716l(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 40:
                    zzabq.m8713i(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 41:
                    zzabq.m8712h(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 42:
                    zzabq.m8708d(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 43:
                    zzabq.m8724t(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 44:
                    zzabq.m8711g(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 45:
                    zzabq.m8719o(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 46:
                    zzabq.m8720p(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 47:
                    zzabq.m8721q(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case 48:
                    zzabq.m8722r(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, true);
                    break;
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    zzabq.m8715k(i3, (List) zzacp.m8790j(obj, m8661l & 1048575), zzzgVar, m8663o(i2));
                    break;
                case 50:
                    if (zzacp.m8790j(obj, m8661l & 1048575) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9620c(i3, m8634J(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9621d(i3, m8635K(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9604v(i3, m8637m(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9604v(i3, m8637m(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9597o(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9595m(i3, m8637m(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9593k(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9591i(i3, m8629C(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (m8639B(obj, i3, i2)) {
                        m8630E(i3, zzacp.m8790j(obj, m8661l & 1048575), zzzgVar);
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9623f(i3, zzacp.m8790j(obj, m8661l & 1048575), m8663o(i2));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9592j(i3, (zzyu) zzacp.m8790j(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9602t(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9597o(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9593k(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.f17145a.mo9595m(i3, m8637m(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9618a(i3, m8636N(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9619b(i3, m8637m(obj, m8661l & 1048575));
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (m8639B(obj, i3, i2)) {
                        zzzgVar.m9622e(i3, zzacp.m8790j(obj, m8661l & 1048575), m8663o(i2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzacf zzacfVar = this.f16305m;
        zzacfVar.mo8759r(zzacfVar.mo8745d(obj), zzzgVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: e */
    public final boolean mo8654e(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f16302j) {
            int i7 = this.f16301i[i6];
            int i8 = this.f16293a[i7];
            int m8661l = m8661l(i7);
            int i9 = this.f16293a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f16292p.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & m8661l) != 0 && !m8673z(obj, i7, i2, i3, i11)) {
                return false;
            }
            int i12 = (m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (m8639B(obj, i8, i7) && !m8628A(obj, m8661l, m8663o(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !((zzaaw) zzacp.m8790j(obj, m8661l & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzacp.m8790j(obj, m8661l & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzabo m8663o = m8663o(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m8663o.mo8654e(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (m8673z(obj, i7, i2, i3, i11) && !m8628A(obj, m8661l, m8663o(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        if (!this.f16298f) {
            return true;
        }
        this.f16306n.mo9628a(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0604 A[Catch: all -> 0x04cb, TryCatch #3 {all -> 0x04cb, blocks: (B:3:0x0012, B:254:0x003a, B:277:0x004b, B:278:0x004f, B:259:0x005e, B:261:0x0063, B:262:0x0068, B:280:0x0040, B:6:0x0084, B:42:0x0096, B:28:0x05e3, B:46:0x05ff, B:48:0x0604, B:49:0x0609, B:64:0x009e, B:68:0x00ae, B:70:0x00c0, B:72:0x00d2, B:74:0x00e4, B:9:0x00f6, B:11:0x0100, B:14:0x0107, B:19:0x010d, B:76:0x011a, B:78:0x012b, B:80:0x0138, B:82:0x013e, B:83:0x0164, B:84:0x0154, B:86:0x0168, B:88:0x0172, B:90:0x0183, B:92:0x0194, B:94:0x01a5, B:96:0x01b6, B:98:0x01c7, B:100:0x01d8, B:102:0x01e9, B:104:0x01fb, B:106:0x020b, B:108:0x0211, B:109:0x022c, B:110:0x0230, B:113:0x0221, B:115:0x0231, B:117:0x0243, B:119:0x0251, B:121:0x025f, B:123:0x026d, B:125:0x027b, B:130:0x028e, B:144:0x029d, B:146:0x02ab, B:148:0x02b9, B:150:0x02c7, B:152:0x02d5, B:154:0x02e3, B:156:0x02f1, B:158:0x02ff, B:160:0x030d, B:162:0x031b, B:164:0x0329, B:166:0x0337, B:168:0x0345, B:170:0x0353, B:172:0x0359, B:174:0x036e, B:176:0x037e, B:178:0x038e, B:180:0x03a2, B:184:0x03b0, B:185:0x03c1, B:188:0x03d2, B:190:0x03e2, B:192:0x03f2, B:194:0x0402, B:196:0x0412, B:198:0x0422, B:200:0x0432, B:202:0x0442, B:204:0x0452, B:206:0x045a, B:207:0x0472, B:209:0x0485, B:211:0x0496, B:213:0x04a7, B:215:0x04b8, B:217:0x04ce, B:219:0x04da, B:222:0x04e1, B:223:0x04e7, B:225:0x04f2, B:227:0x0505, B:229:0x0518, B:231:0x0520, B:232:0x0538, B:234:0x054b, B:236:0x0555, B:238:0x0568, B:240:0x057a, B:242:0x058a, B:244:0x059c, B:246:0x05ac, B:248:0x05bc, B:250:0x05ce), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x060f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo8655f(java.lang.Object r18, com.google.android.gms.internal.p041firebaseauthapi.zzabn r19, com.google.android.gms.internal.p041firebaseauthapi.zzzk r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzabf.mo8655f(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzabn, com.google.android.gms.internal.firebase-auth-api.zzzk):void");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: g */
    public final void mo8656g(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i2 = 0; i2 < this.f16293a.length; i2 += 3) {
            int m8661l = m8661l(i2);
            long j2 = 1048575 & m8661l;
            int i3 = this.f16293a[i2];
            switch ((m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8794n(obj, j2, zzacp.m8785e(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.mo8770f(obj, j2, zzacp.m8786f(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8796p(obj, j2, zzacp.m8788h(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8796p(obj, j2, zzacp.m8788h(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8796p(obj, j2, zzacp.m8788h(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.mo8767c(obj, j2, zzacp.m8801u(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8780p(obj, j2, zzacp.m8790j(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m8666s(obj, obj2, i2);
                    break;
                case 10:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8780p(obj, j2, zzacp.m8790j(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8796p(obj, j2, zzacp.m8788h(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8672y(obj2, i2)) {
                        zzacp.f16357c.m8778n(obj, j2, zzacp.m8787g(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8672y(obj2, i2)) {
                        zzacp.m8796p(obj, j2, zzacp.m8788h(obj2, j2));
                        m8669v(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m8666s(obj, obj2, i2);
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
                    this.f16304l.mo8597c(obj, obj2, j2);
                    break;
                case 50:
                    Class cls = zzabq.f16323a;
                    zzacp.f16357c.m8780p(obj, j2, zzaax.m8611c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2)));
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
                    if (m8639B(obj2, i3, i2)) {
                        zzacp.f16357c.m8780p(obj, j2, zzacp.m8790j(obj2, j2));
                        m8670w(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    m8667t(obj, obj2, i2);
                    break;
                case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case 64:
                case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (m8639B(obj2, i3, i2)) {
                        zzacp.f16357c.m8780p(obj, j2, zzacp.m8790j(obj2, j2));
                        m8670w(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    m8667t(obj, obj2, i2);
                    break;
            }
        }
        zzacf zzacfVar = this.f16305m;
        Class cls2 = zzabq.f16323a;
        zzacfVar.mo8756o(obj, zzacfVar.mo8746e(zzacfVar.mo8745d(obj), zzacfVar.mo8745d(obj2)));
        if (this.f16298f) {
            this.f16306n.mo9628a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: h */
    public final void mo8657h(Object obj, byte[] bArr, int i2, int i3, zzyh zzyhVar) throws IOException {
        if (this.f16300h) {
            m8646Q(obj, bArr, i2, i3, zzyhVar);
        } else {
            m8641F(obj, bArr, i2, i3, 0, zzyhVar);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: i */
    public final boolean mo8658i(Object obj, Object obj2) {
        boolean m8707c;
        int length = this.f16293a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int m8661l = m8661l(i2);
            long j2 = m8661l & 1048575;
            switch ((m8661l >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
                case 0:
                    if (m8671x(obj, obj2, i2) && Double.doubleToLongBits(zzacp.m8785e(obj, j2)) == Double.doubleToLongBits(zzacp.m8785e(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m8671x(obj, obj2, i2) && Float.floatToIntBits(zzacp.m8786f(obj, j2)) == Float.floatToIntBits(zzacp.m8786f(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m8671x(obj, obj2, i2) && zzacp.m8788h(obj, j2) == zzacp.m8788h(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m8671x(obj, obj2, i2) && zzacp.m8788h(obj, j2) == zzacp.m8788h(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m8671x(obj, obj2, i2) && zzacp.m8788h(obj, j2) == zzacp.m8788h(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m8671x(obj, obj2, i2) && zzacp.m8801u(obj, j2) == zzacp.m8801u(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m8671x(obj, obj2, i2) && zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m8671x(obj, obj2, i2) && zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m8671x(obj, obj2, i2) && zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m8671x(obj, obj2, i2) && zzacp.m8788h(obj, j2) == zzacp.m8788h(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m8671x(obj, obj2, i2) && zzacp.m8787g(obj, j2) == zzacp.m8787g(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m8671x(obj, obj2, i2) && zzacp.m8788h(obj, j2) == zzacp.m8788h(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m8671x(obj, obj2, i2) && zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2))) {
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
                    m8707c = zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2));
                    break;
                case 50:
                    m8707c = zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2));
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
                    long m8649T = m8649T(i2) & 1048575;
                    if (zzacp.m8787g(obj, m8649T) == zzacp.m8787g(obj2, m8649T) && zzabq.m8707c(zzacp.m8790j(obj, j2), zzacp.m8790j(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m8707c) {
                return false;
            }
        }
        if (!this.f16305m.mo8745d(obj).equals(this.f16305m.mo8745d(obj2))) {
            return false;
        }
        if (!this.f16298f) {
            return true;
        }
        this.f16306n.mo9628a(obj);
        this.f16306n.mo9628a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: j */
    public final Object mo8659j() {
        return ((zzzx) this.f16297e).mo8970l(4, null, null);
    }

    /* renamed from: k */
    public final int m8660k(int i2, int i3) {
        int length = (this.f16293a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f16293a[i5];
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

    /* renamed from: l */
    public final int m8661l(int i2) {
        return this.f16293a[i2 + 1];
    }

    /* renamed from: n */
    public final zzaab m8662n(int i2) {
        int i3 = i2 / 3;
        return (zzaab) this.f16294b[i3 + i3 + 1];
    }

    /* renamed from: o */
    public final zzabo m8663o(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f16294b;
        zzabo zzaboVar = (zzabo) objArr[i4];
        if (zzaboVar != null) {
            return zzaboVar;
        }
        zzabo m8674a = zzabk.f16313c.m8674a((Class) objArr[i4 + 1]);
        this.f16294b[i4] = m8674a;
        return m8674a;
    }

    /* renamed from: p */
    public final Object m8664p(Object obj, int i2, Object obj2) {
        int i3 = this.f16293a[i2];
        Object m8790j = zzacp.m8790j(obj, r0[i2 + 1] & 1048575);
        if (m8790j == null || m8662n(i2) == null) {
            return obj2;
        }
        throw null;
    }

    /* renamed from: q */
    public final Object m8665q(int i2) {
        int i3 = i2 / 3;
        return this.f16294b[i3 + i3];
    }

    /* renamed from: s */
    public final void m8666s(Object obj, Object obj2, int i2) {
        long j2 = this.f16293a[i2 + 1] & 1048575;
        if (m8672y(obj2, i2)) {
            Object m8790j = zzacp.m8790j(obj, j2);
            Object m8790j2 = zzacp.m8790j(obj2, j2);
            if (m8790j != null && m8790j2 != null) {
                zzacp.f16357c.m8780p(obj, j2, zzaad.m8577c(m8790j, m8790j2));
                m8669v(obj, i2);
            } else if (m8790j2 != null) {
                zzacp.f16357c.m8780p(obj, j2, m8790j2);
                m8669v(obj, i2);
            }
        }
    }

    /* renamed from: t */
    public final void m8667t(Object obj, Object obj2, int i2) {
        int[] iArr = this.f16293a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = i3 & 1048575;
        if (m8639B(obj2, i4, i2)) {
            Object m8790j = m8639B(obj, i4, i2) ? zzacp.m8790j(obj, j2) : null;
            Object m8790j2 = zzacp.m8790j(obj2, j2);
            if (m8790j != null && m8790j2 != null) {
                zzacp.f16357c.m8780p(obj, j2, zzaad.m8577c(m8790j, m8790j2));
                m8670w(obj, i4, i2);
            } else if (m8790j2 != null) {
                zzacp.f16357c.m8780p(obj, j2, m8790j2);
                m8670w(obj, i4, i2);
            }
        }
    }

    /* renamed from: u */
    public final void m8668u(Object obj, int i2, zzabn zzabnVar) throws IOException {
        if ((536870912 & i2) != 0) {
            zzacp.f16357c.m8780p(obj, i2 & 1048575, zzabnVar.mo8677C());
        } else if (this.f16299g) {
            zzacp.f16357c.m8780p(obj, i2 & 1048575, zzabnVar.mo8678F());
        } else {
            zzacp.f16357c.m8780p(obj, i2 & 1048575, zzabnVar.mo8680d());
        }
    }

    /* renamed from: v */
    public final void m8669v(Object obj, int i2) {
        int i3 = this.f16293a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        zzacp.f16357c.m8778n(obj, j2, (1 << (i3 >>> 20)) | zzacp.m8787g(obj, j2));
    }

    /* renamed from: w */
    public final void m8670w(Object obj, int i2, int i3) {
        zzacp.f16357c.m8778n(obj, this.f16293a[i3 + 2] & 1048575, i2);
    }

    /* renamed from: x */
    public final boolean m8671x(Object obj, Object obj2, int i2) {
        return m8672y(obj, i2) == m8672y(obj2, i2);
    }

    /* renamed from: y */
    public final boolean m8672y(Object obj, int i2) {
        int[] iArr = this.f16293a;
        int i3 = iArr[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return (zzacp.m8787g(obj, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long j3 = i4 & 1048575;
        switch ((i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE) {
            case 0:
                return Double.doubleToRawLongBits(zzacp.m8785e(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzacp.m8786f(obj, j3)) != 0;
            case 2:
                return zzacp.m8788h(obj, j3) != 0;
            case 3:
                return zzacp.m8788h(obj, j3) != 0;
            case 4:
                return zzacp.m8787g(obj, j3) != 0;
            case 5:
                return zzacp.m8788h(obj, j3) != 0;
            case 6:
                return zzacp.m8787g(obj, j3) != 0;
            case 7:
                return zzacp.m8801u(obj, j3);
            case 8:
                Object m8790j = zzacp.m8790j(obj, j3);
                if (m8790j instanceof String) {
                    return !((String) m8790j).isEmpty();
                }
                if (m8790j instanceof zzyu) {
                    return !zzyu.f17120c.equals(m8790j);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzacp.m8790j(obj, j3) != null;
            case 10:
                return !zzyu.f17120c.equals(zzacp.m8790j(obj, j3));
            case 11:
                return zzacp.m8787g(obj, j3) != 0;
            case 12:
                return zzacp.m8787g(obj, j3) != 0;
            case 13:
                return zzacp.m8787g(obj, j3) != 0;
            case 14:
                return zzacp.m8788h(obj, j3) != 0;
            case 15:
                return zzacp.m8787g(obj, j3) != 0;
            case 16:
                return zzacp.m8788h(obj, j3) != 0;
            case 17:
                return zzacp.m8790j(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: z */
    public final boolean m8673z(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? m8672y(obj, i2) : (i4 & i5) != 0;
    }
}
