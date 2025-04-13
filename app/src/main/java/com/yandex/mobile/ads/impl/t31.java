package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
final class t31 {

    /* renamed from: a */
    public final int f54938a;

    /* renamed from: b */
    public final int f54939b;

    /* renamed from: c */
    public final int f54940c;

    /* renamed from: d */
    public final int f54941d;

    /* renamed from: e */
    public final int f54942e;

    private t31(int i2, int i3, int i4, int i5, int i6) {
        this.f54938a = i2;
        this.f54939b = i3;
        this.f54940c = i4;
        this.f54941d = i5;
        this.f54942e = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: a */
    public static t31 m28457a(String str) {
        char c2;
        C5220ia.m25473a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String m24832b = C5114ga.m24832b(split[i6].trim());
            Objects.requireNonNull(m24832b);
            switch (m24832b.hashCode()) {
                case 100571:
                    if (m24832b.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556653:
                    if (m24832b.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (m24832b.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (m24832b.equals("style")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i2 = i6;
                    break;
                case 3:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new t31(i2, i3, i4, i5, split.length);
    }
}
