package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.yandex.mobile.ads.impl.w9 */
/* loaded from: classes3.dex */
public final class C5963w9 implements Comparable<C5963w9> {

    /* renamed from: f */
    private static final Pattern f56050f = Pattern.compile("^[\\d]*(\\.[\\d]*)*(\\-.*)?");

    /* renamed from: a */
    private final String f56051a;

    /* renamed from: b */
    private int[] f56052b;

    /* renamed from: c */
    private String f56053c;

    /* renamed from: d */
    private Integer f56054d;

    /* renamed from: e */
    private boolean f56055e = true;

    public C5963w9(String str) {
        this.f56051a = str.toLowerCase(Locale.US);
        m29407a();
    }

    /* renamed from: a */
    private void m29407a() {
        String[] split = this.f56051a.split("-");
        int i2 = 0;
        if (!f56050f.matcher(this.f56051a).matches()) {
            this.f56055e = false;
        }
        String[] split2 = split[0].split("\\.");
        if (this.f56055e) {
            this.f56052b = new int[split2.length];
            while (true) {
                int[] iArr = this.f56052b;
                if (i2 >= iArr.length) {
                    break;
                }
                iArr[i2] = Integer.parseInt(split2[i2]);
                i2++;
            }
            int indexOf = this.f56051a.indexOf(45);
            if (indexOf < 0 || indexOf >= this.f56051a.length() - 1) {
                this.f56054d = 2;
                return;
            }
            String substring = this.f56051a.substring(indexOf);
            this.f56053c = substring;
            this.f56054d = Integer.valueOf(!substring.endsWith("-snapshot") ? 1 : 0);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull C5963w9 c5963w9) {
        int compareTo;
        int i2;
        boolean z = this.f56055e;
        if (!z || !c5963w9.f56055e) {
            if (!z) {
                if (c5963w9.f56055e || (compareTo = this.f56051a.compareTo(c5963w9.f56051a)) < 0) {
                    return -1;
                }
                if (compareTo <= 0) {
                    return 0;
                }
            }
            return 1;
        }
        int max = Math.max(this.f56052b.length, c5963w9.f56052b.length);
        int i3 = 0;
        while (true) {
            if (i3 >= max) {
                i2 = 0;
                break;
            }
            int[] iArr = this.f56052b;
            int i4 = i3 >= iArr.length ? 0 : iArr[i3];
            int[] iArr2 = c5963w9.f56052b;
            int i5 = i3 >= iArr2.length ? 0 : iArr2[i3];
            if (i4 > i5) {
                i2 = 1;
                break;
            }
            if (i4 < i5) {
                i2 = -1;
                break;
            }
            i3++;
        }
        if (i2 != 0) {
            return i2;
        }
        if (this.f56054d.equals(c5963w9.f56054d)) {
            if (!this.f56054d.equals(2)) {
                int compareTo2 = this.f56053c.compareTo(c5963w9.f56053c);
                if (compareTo2 < 0) {
                    return -1;
                }
                if (compareTo2 > 0) {
                    return 1;
                }
            }
            return 0;
        }
        return this.f56054d.compareTo(c5963w9.f56054d);
    }
}
