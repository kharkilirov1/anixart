package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

/* loaded from: classes.dex */
public final class UrlTemplate {

    /* renamed from: a */
    public final String[] f13008a;

    /* renamed from: b */
    public final int[] f13009b;

    /* renamed from: c */
    public final String[] f13010c;

    /* renamed from: d */
    public final int f13011d;

    public UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.f13008a = strArr;
        this.f13009b = iArr;
        this.f13010c = strArr2;
        this.f13011d = i2;
    }

    /* renamed from: a */
    public String m7081a(String str, long j2, int i2, long j3) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.f13011d;
            if (i3 >= i4) {
                sb.append(this.f13008a[i4]);
                return sb.toString();
            }
            sb.append(this.f13008a[i3]);
            int[] iArr = this.f13009b;
            if (iArr[i3] == 1) {
                sb.append(str);
            } else if (iArr[i3] == 2) {
                sb.append(String.format(Locale.US, this.f13010c[i3], Long.valueOf(j2)));
            } else if (iArr[i3] == 3) {
                sb.append(String.format(Locale.US, this.f13010c[i3], Integer.valueOf(i2)));
            } else if (iArr[i3] == 4) {
                sb.append(String.format(Locale.US, this.f13010c[i3], Long.valueOf(j3)));
            }
            i3++;
        }
    }
}
