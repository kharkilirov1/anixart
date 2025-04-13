package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class bz0 extends l51 {

    /* renamed from: b */
    private long f49031b;

    /* renamed from: c */
    private long[] f49032c;

    /* renamed from: d */
    private long[] f49033d;

    public bz0() {
        super(new C5757sq());
        this.f49031b = -9223372036854775807L;
        this.f49032c = new long[0];
        this.f49033d = new long[0];
    }

    /* renamed from: a */
    public final long m22949a() {
        return this.f49031b;
    }

    /* renamed from: b */
    public final long[] m22951b() {
        return this.f49033d;
    }

    /* renamed from: c */
    public final long[] m22952c() {
        return this.f49032c;
    }

    /* renamed from: a */
    public final boolean m22950a(long j2, ap0 ap0Var) {
        if (ap0Var.m22607t() != 2) {
            return false;
        }
        int m22613z = ap0Var.m22613z();
        int m22588d = ap0Var.m22588d();
        ap0Var.m22593f(m22613z);
        if (!"onMetaData".equals(new String(ap0Var.m22587c(), m22588d, m22613z)) || ap0Var.m22579a() == 0 || ap0Var.m22607t() != 8) {
            return false;
        }
        HashMap<String, Object> m22948a = m22948a(ap0Var);
        Object obj = m22948a.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f49031b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m22948a.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f49032c = new long[size];
                this.f49033d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f49032c = new long[0];
                        this.f49033d = new long[0];
                        break;
                    }
                    this.f49032c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f49033d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    private static Serializable m22947a(int i2, ap0 ap0Var) {
        if (i2 == 8) {
            return m22948a(ap0Var);
        }
        if (i2 == 10) {
            int m22611x = ap0Var.m22611x();
            ArrayList arrayList = new ArrayList(m22611x);
            for (int i3 = 0; i3 < m22611x; i3++) {
                Serializable m22947a = m22947a(ap0Var.m22607t(), ap0Var);
                if (m22947a != null) {
                    arrayList.add(m22947a);
                }
            }
            return arrayList;
        }
        if (i2 == 11) {
            Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(ap0Var.m22603p())).doubleValue());
            ap0Var.m22593f(2);
            return date;
        }
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(ap0Var.m22603p()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(ap0Var.m22607t() == 1);
        }
        if (i2 == 2) {
            int m22613z = ap0Var.m22613z();
            int m22588d = ap0Var.m22588d();
            ap0Var.m22593f(m22613z);
            return new String(ap0Var.m22587c(), m22588d, m22613z);
        }
        if (i2 != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            int m22613z2 = ap0Var.m22613z();
            int m22588d2 = ap0Var.m22588d();
            ap0Var.m22593f(m22613z2);
            String str = new String(ap0Var.m22587c(), m22588d2, m22613z2);
            int m22607t = ap0Var.m22607t();
            if (m22607t == 9) {
                return hashMap;
            }
            Serializable m22947a2 = m22947a(m22607t, ap0Var);
            if (m22947a2 != null) {
                hashMap.put(str, m22947a2);
            }
        }
    }

    /* renamed from: a */
    private static HashMap<String, Object> m22948a(ap0 ap0Var) {
        int m22611x = ap0Var.m22611x();
        HashMap<String, Object> hashMap = new HashMap<>(m22611x);
        for (int i2 = 0; i2 < m22611x; i2++) {
            int m22613z = ap0Var.m22613z();
            int m22588d = ap0Var.m22588d();
            ap0Var.m22593f(m22613z);
            String str = new String(ap0Var.m22587c(), m22588d, m22613z);
            Serializable m22947a = m22947a(ap0Var.m22607t(), ap0Var);
            if (m22947a != null) {
                hashMap.put(str, m22947a);
            }
        }
        return hashMap;
    }
}
