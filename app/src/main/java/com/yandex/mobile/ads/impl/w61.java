package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class w61 implements InterfaceC5589pf {

    /* renamed from: f */
    public static final InterfaceC5589pf.a<w61> f56027f = kq1.f52058c;

    /* renamed from: a */
    public final int f56028a;

    /* renamed from: b */
    public final String f56029b;

    /* renamed from: c */
    public final int f56030c;

    /* renamed from: d */
    private final C5606pv[] f56031d;

    /* renamed from: e */
    private int f56032e;

    public w61(String str, C5606pv... c5606pvArr) {
        C5220ia.m25473a(c5606pvArr.length > 0);
        this.f56029b = str;
        this.f56031d = c5606pvArr;
        this.f56028a = c5606pvArr.length;
        int m25138a = he0.m25138a(c5606pvArr[0].f53820l);
        this.f56030c = m25138a == -1 ? he0.m25138a(c5606pvArr[0].f53819k) : m25138a;
        m29390a();
    }

    /* renamed from: a */
    public final C5606pv m29393a(int i2) {
        return this.f56031d[i2];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w61.class != obj.getClass()) {
            return false;
        }
        w61 w61Var = (w61) obj;
        return this.f56029b.equals(w61Var.f56029b) && Arrays.equals(this.f56031d, w61Var.f56031d);
    }

    public final int hashCode() {
        if (this.f56032e == 0) {
            this.f56032e = o11.m26984a(this.f56029b, 527, 31) + Arrays.hashCode(this.f56031d);
        }
        return this.f56032e;
    }

    /* renamed from: a */
    public final int m29392a(C5606pv c5606pv) {
        int i2 = 0;
        while (true) {
            C5606pv[] c5606pvArr = this.f56031d;
            if (i2 >= c5606pvArr.length) {
                return -1;
            }
            if (c5606pv == c5606pvArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static w61 m29389a(Bundle bundle) {
        AbstractC4698p m27717a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m27717a = AbstractC4698p.m22055i();
        } else {
            m27717a = C5637qf.m27717a(C5606pv.f53802H, parcelableArrayList);
        }
        return new w61(bundle.getString(Integer.toString(1, 36), ""), (C5606pv[]) m27717a.toArray(new C5606pv[0]));
    }

    /* renamed from: a */
    private void m29390a() {
        String str = this.f56031d[0].f53811c;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i2 = this.f56031d[0].f53813e | 16384;
        int i3 = 1;
        while (true) {
            C5606pv[] c5606pvArr = this.f56031d;
            if (i3 >= c5606pvArr.length) {
                return;
            }
            String str2 = c5606pvArr[i3].f53811c;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                C5606pv[] c5606pvArr2 = this.f56031d;
                String str3 = c5606pvArr2[0].f53811c;
                String str4 = c5606pvArr2[i3].f53811c;
                StringBuilder m29z = C0000a.m29z("Different ", "languages", " combined in one TrackGroup: '", str3, "' (track 0) and '");
                m29z.append(str4);
                m29z.append("' (track ");
                m29z.append(i3);
                m29z.append(")");
                d90.m23838a("TrackGroup", "", new IllegalStateException(m29z.toString()));
                return;
            }
            C5606pv[] c5606pvArr3 = this.f56031d;
            if (i2 != (c5606pvArr3[i3].f53813e | 16384)) {
                String binaryString = Integer.toBinaryString(c5606pvArr3[0].f53813e);
                String binaryString2 = Integer.toBinaryString(this.f56031d[i3].f53813e);
                StringBuilder m29z2 = C0000a.m29z("Different ", "role flags", " combined in one TrackGroup: '", binaryString, "' (track 0) and '");
                m29z2.append(binaryString2);
                m29z2.append("' (track ");
                m29z2.append(i3);
                m29z2.append(")");
                d90.m23838a("TrackGroup", "", new IllegalStateException(m29z2.toString()));
                return;
            }
            i3++;
        }
    }
}
