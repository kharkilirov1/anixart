package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final /* synthetic */ class sf0 {
    /* renamed from: a */
    public static int m28242a(String str) {
        for (int i2 : C5782t5.m28465b(8)) {
            if (m28243a(i2).equals(str)) {
                return i2;
            }
        }
        return 8;
    }

    /* renamed from: a */
    public static /* synthetic */ String m28243a(int i2) {
        if (i2 == 1) {
            return "advideocomplete";
        }
        if (i2 == 2) {
            return "impressionTrackingStart";
        }
        if (i2 == 3) {
            return "impressionTrackingSuccess";
        }
        if (i2 == 4) {
            return "close";
        }
        if (i2 == 5) {
            return "open";
        }
        if (i2 == 6) {
            return "rewardedAdComplete";
        }
        if (i2 == 7) {
            return "usecustomclose";
        }
        if (i2 == 8) {
            return "";
        }
        throw null;
    }
}
