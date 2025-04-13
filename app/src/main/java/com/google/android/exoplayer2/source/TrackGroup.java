package com.google.android.exoplayer2.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.Lists;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TrackGroup implements Bundleable {

    /* renamed from: e */
    public static final Bundleable.Creator<TrackGroup> f12588e = C1123j.f13404f;

    /* renamed from: b */
    public final int f12589b;

    /* renamed from: c */
    public final Format[] f12590c;

    /* renamed from: d */
    public int f12591d;

    public TrackGroup(Format... formatArr) {
        int i2 = 1;
        Assertions.m7513a(formatArr.length > 0);
        this.f12590c = formatArr;
        this.f12589b = formatArr.length;
        String str = formatArr[0].f9650d;
        str = (str == null || str.equals("und")) ? "" : str;
        int i3 = formatArr[0].f9652f | 16384;
        while (true) {
            Format[] formatArr2 = this.f12590c;
            if (i2 >= formatArr2.length) {
                return;
            }
            String str2 = formatArr2[i2].f9650d;
            if (!str.equals((str2 == null || str2.equals("und")) ? "" : str2)) {
                Format[] formatArr3 = this.f12590c;
                m6921c("languages", formatArr3[0].f9650d, formatArr3[i2].f9650d, i2);
                return;
            } else {
                Format[] formatArr4 = this.f12590c;
                if (i3 != (formatArr4[i2].f9652f | 16384)) {
                    m6921c("role flags", Integer.toBinaryString(formatArr4[0].f9652f), Integer.toBinaryString(this.f12590c[i2].f9652f), i2);
                    return;
                }
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m6921c(String str, @Nullable String str2, @Nullable String str3, int i2) {
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, str.length() + 78)), "Different ", str, " combined in one TrackGroup: '", str2);
        m4122u.append("' (track 0) and '");
        m4122u.append(str3);
        m4122u.append("' (track ");
        m4122u.append(i2);
        m4122u.append(")");
        Log.m7585b("TrackGroup", "", new IllegalStateException(m4122u.toString()));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), BundleableUtil.m7525d(Lists.m11737d(this.f12590c)));
        return bundle;
    }

    /* renamed from: b */
    public int m6922b(Format format) {
        int i2 = 0;
        while (true) {
            Format[] formatArr = this.f12590c;
            if (i2 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f12589b == trackGroup.f12589b && Arrays.equals(this.f12590c, trackGroup.f12590c);
    }

    public int hashCode() {
        if (this.f12591d == 0) {
            this.f12591d = 527 + Arrays.hashCode(this.f12590c);
        }
        return this.f12591d;
    }
}
