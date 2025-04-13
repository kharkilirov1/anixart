package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 {
    /* renamed from: a */
    public static int m26099a(String str) {
        for (int i2 : C5782t5.m28465b(2)) {
            if (m26100a(i2).equals(str)) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static /* synthetic */ String m26100a(int i2) {
        if (i2 == 1) {
            return "streaming";
        }
        if (i2 == 2) {
            return "progressive";
        }
        throw null;
    }
}
