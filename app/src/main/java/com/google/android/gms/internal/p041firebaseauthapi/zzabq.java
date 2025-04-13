package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabq {

    /* renamed from: a */
    public static final Class f16323a;

    /* renamed from: b */
    public static final zzacf f16324b;

    /* renamed from: c */
    public static final zzacf f16325c;

    /* renamed from: d */
    public static final zzacf f16326d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f16323a = cls;
        f16324b = m8727w(false);
        f16325c = m8727w(true);
        f16326d = new zzach();
    }

    /* renamed from: A */
    public static int m8685A(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9612e(i2 << 3) + 4) * size;
    }

    /* renamed from: B */
    public static int m8686B(List list) {
        return list.size() * 4;
    }

    /* renamed from: C */
    public static int m8687C(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9612e(i2 << 3) + 8) * size;
    }

    /* renamed from: D */
    public static int m8688D(List list) {
        return list.size() * 8;
    }

    /* renamed from: E */
    public static int m8689E(int i2, List list, zzabo zzaboVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzzf.m9615y(i2, (zzabc) list.get(i4), zzaboVar);
        }
        return i3;
    }

    /* renamed from: F */
    public static int m8690F(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8691G(list);
    }

    /* renamed from: G */
    public static int m8691G(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzyVar = (zzzy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9616z(zzzyVar.m9658d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9616z(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: H */
    public static int m8692H(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * list.size()) + m8693I(list);
    }

    /* renamed from: I */
    public static int m8693I(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaarVar = (zzaar) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9613f(zzaarVar.m8598d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9613f(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: J */
    public static int m8694J(int i2, Object obj, zzabo zzaboVar) {
        if (!(obj instanceof zzaai)) {
            return zzzf.m9609b((zzabc) obj, zzaboVar) + zzzf.m9612e(i2 << 3);
        }
        int m9612e = zzzf.m9612e(i2 << 3);
        int m8585a = ((zzaai) obj).m8585a();
        return zzzf.m9612e(m8585a) + m8585a + m9612e;
    }

    /* renamed from: K */
    public static int m8695K(int i2, List list, zzabo zzaboVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9611d = zzzf.m9611d(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzaai) {
                int m8585a = ((zzaai) obj).m8585a();
                m9611d += zzzf.m9612e(m8585a) + m8585a;
            } else {
                m9611d = zzzf.m9609b((zzabc) obj, zzaboVar) + m9611d;
            }
        }
        return m9611d;
    }

    /* renamed from: L */
    public static int m8696L(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8697M(list);
    }

    /* renamed from: M */
    public static int m8697M(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzyVar = (zzzy) list;
            i2 = 0;
            while (i3 < size) {
                int m9658d = zzzyVar.m9658d(i3);
                i2 += zzzf.m9612e((m9658d >> 31) ^ (m9658d + m9658d));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzzf.m9612e((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: N */
    public static int m8698N(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8699O(list);
    }

    /* renamed from: O */
    public static int m8699O(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaarVar = (zzaar) list;
            i2 = 0;
            while (i3 < size) {
                long m8598d = zzaarVar.m8598d(i3);
                i2 += zzzf.m9613f((m8598d >> 63) ^ (m8598d + m8598d));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzzf.m9613f((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: P */
    public static int m8700P(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int m9611d = zzzf.m9611d(i2) * size;
        if (list instanceof zzaak) {
            zzaak zzaakVar = (zzaak) list;
            while (i3 < size) {
                Object mo8589Z = zzaakVar.mo8589Z(i3);
                m9611d = (mo8589Z instanceof zzyu ? zzzf.m9614x((zzyu) mo8589Z) : zzzf.m9610c((String) mo8589Z)) + m9611d;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                m9611d = (obj instanceof zzyu ? zzzf.m9614x((zzyu) obj) : zzzf.m9610c((String) obj)) + m9611d;
                i3++;
            }
        }
        return m9611d;
    }

    /* renamed from: Q */
    public static int m8701Q(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8702R(list);
    }

    /* renamed from: R */
    public static int m8702R(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzyVar = (zzzy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9612e(zzzyVar.m9658d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9612e(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: S */
    public static int m8703S(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8704T(list);
    }

    /* renamed from: T */
    public static int m8704T(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaarVar = (zzaar) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9613f(zzaarVar.m8598d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9613f(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static Object m8705a(int i2, List list, zzaab zzaabVar, Object obj, zzacf zzacfVar) {
        if (zzaabVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                if (zzaabVar.m8571u()) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    if (obj == null) {
                        obj = zzacfVar.mo8747f();
                    }
                    zzacfVar.mo8753l(obj, i2, intValue);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaabVar.m8571u()) {
                    if (obj == null) {
                        obj = zzacfVar.mo8747f();
                    }
                    zzacfVar.mo8753l(obj, i2, intValue2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static Object m8706b(int i2, int i3, Object obj, zzacf zzacfVar) {
        if (obj == null) {
            obj = zzacfVar.mo8747f();
        }
        zzacfVar.mo8753l(obj, i2, i3);
        return obj;
    }

    /* renamed from: c */
    public static boolean m8707c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static void m8708d(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9591i(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).booleanValue();
            i4++;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9590h(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    /* renamed from: e */
    public static void m8709e(int i2, List list, zzzg zzzgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzzgVar.f17145a.mo9592j(i2, (zzyu) list.get(i3));
        }
    }

    /* renamed from: f */
    public static void m8710f(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9595m(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).doubleValue();
            i4 += 8;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9596n(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    /* renamed from: g */
    public static void m8711g(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9597o(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzzf.m9616z(((Integer) list.get(i5)).intValue());
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9598p(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* renamed from: h */
    public static void m8712h(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9593k(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9594l(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* renamed from: i */
    public static void m8713i(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9595m(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9596n(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* renamed from: j */
    public static void m8714j(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9593k(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).floatValue();
            i4 += 4;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9594l(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    /* renamed from: k */
    public static void m8715k(int i2, List list, zzzg zzzgVar, zzabo zzaboVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzzgVar.m9622e(i2, list.get(i3), zzaboVar);
        }
    }

    /* renamed from: l */
    public static void m8716l(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9597o(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzzf.m9616z(((Integer) list.get(i5)).intValue());
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9598p(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* renamed from: m */
    public static void m8717m(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9604v(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzzf.m9613f(((Long) list.get(i5)).longValue());
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9605w(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* renamed from: n */
    public static void m8718n(int i2, List list, zzzg zzzgVar, zzabo zzaboVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzzgVar.f17145a.mo9599q(i2, (zzabc) list.get(i3), zzaboVar);
        }
    }

    /* renamed from: o */
    public static void m8719o(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9593k(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).intValue();
            i4 += 4;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9594l(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* renamed from: p */
    public static void m8720p(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9595m(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).longValue();
            i4 += 8;
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9596n(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* renamed from: q */
    public static void m8721q(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzf zzzfVar = zzzgVar.f17145a;
                int intValue = ((Integer) list.get(i3)).intValue();
                zzzfVar.mo9602t(i2, (intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            i4 += zzzf.m9612e((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzf zzzfVar2 = zzzgVar.f17145a;
            int intValue3 = ((Integer) list.get(i3)).intValue();
            zzzfVar2.mo9603u((intValue3 >> 31) ^ (intValue3 + intValue3));
            i3++;
        }
    }

    /* renamed from: r */
    public static void m8722r(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzf zzzfVar = zzzgVar.f17145a;
                long longValue = ((Long) list.get(i3)).longValue();
                zzzfVar.mo9604v(i2, (longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((Long) list.get(i5)).longValue();
            i4 += zzzf.m9613f((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzf zzzfVar2 = zzzgVar.f17145a;
            long longValue3 = ((Long) list.get(i3)).longValue();
            zzzfVar2.mo9605w((longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    /* renamed from: s */
    public static void m8723s(int i2, List list, zzzg zzzgVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!(list instanceof zzaak)) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9600r(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzaak zzaakVar = (zzaak) list;
        while (i3 < list.size()) {
            Object mo8589Z = zzaakVar.mo8589Z(i3);
            if (mo8589Z instanceof String) {
                zzzgVar.f17145a.mo9600r(i2, (String) mo8589Z);
            } else {
                zzzgVar.f17145a.mo9592j(i2, (zzyu) mo8589Z);
            }
            i3++;
        }
    }

    /* renamed from: t */
    public static void m8724t(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9602t(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzzf.m9612e(((Integer) list.get(i5)).intValue());
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9603u(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* renamed from: u */
    public static int m8725u(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9612e(i2 << 3) + 1) * size;
    }

    /* renamed from: v */
    public static void m8726v(int i2, List list, zzzg zzzgVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Objects.requireNonNull(zzzgVar);
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                zzzgVar.f17145a.mo9604v(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        zzzgVar.f17145a.mo9601s(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzzf.m9613f(((Long) list.get(i5)).longValue());
        }
        zzzgVar.f17145a.mo9603u(i4);
        while (i3 < list.size()) {
            zzzgVar.f17145a.mo9605w(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* renamed from: w */
    public static zzacf m8727w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzacf) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: x */
    public static int m8728x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m9611d = zzzf.m9611d(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            m9611d += zzzf.m9614x((zzyu) list.get(i3));
        }
        return m9611d;
    }

    /* renamed from: y */
    public static int m8729y(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzzf.m9611d(i2) * size) + m8730z(list);
    }

    /* renamed from: z */
    public static int m8730z(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzyVar = (zzzy) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9616z(zzzyVar.m9658d(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzzf.m9616z(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }
}
