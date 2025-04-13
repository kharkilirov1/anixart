package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u41 extends i11 {

    /* renamed from: o */
    private static final Pattern f55390o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p */
    private static final Pattern f55391p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m */
    private final StringBuilder f55392m = new StringBuilder();

    /* renamed from: n */
    private final ArrayList<String> f55393n = new ArrayList<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026f, code lost:
    
        return new com.yandex.mobile.ads.impl.v41((com.yandex.mobile.ads.impl.C5751sl[]) r2.toArray(new com.yandex.mobile.ads.impl.C5751sl[0]), r3.m24048b());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.w41 mo23247a(byte[] r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u41.mo23247a(byte[], int, boolean):com.yandex.mobile.ads.impl.w41");
    }

    /* renamed from: a */
    private static long m28884a(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L;
        String group2 = matcher.group(i2 + 2);
        Objects.requireNonNull(group2);
        long parseLong2 = (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group3 = matcher.group(i2 + 3);
        Objects.requireNonNull(group3);
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i2 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }
}
