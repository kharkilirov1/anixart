package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;
import java.util.Arrays;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.y3 */
/* loaded from: classes3.dex */
public final class C6054y3 implements InterfaceC5589pf {

    /* renamed from: g */
    public static final C6054y3 f56644g = new C6054y3(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    private static final a f56645h = new a().m29858a();

    /* renamed from: i */
    public static final InterfaceC5589pf.a<C6054y3> f56646i = kq1.f52060e;

    /* renamed from: a */
    @Nullable
    public final Object f56647a;

    /* renamed from: b */
    public final int f56648b;

    /* renamed from: c */
    public final long f56649c;

    /* renamed from: d */
    public final long f56650d;

    /* renamed from: e */
    public final int f56651e;

    /* renamed from: f */
    private final a[] f56652f;

    /* renamed from: com.yandex.mobile.ads.impl.y3$a */
    public static final class a implements InterfaceC5589pf {

        /* renamed from: h */
        public static final InterfaceC5589pf.a<a> f56653h = kq1.f52061f;

        /* renamed from: a */
        public final long f56654a;

        /* renamed from: b */
        public final int f56655b;

        /* renamed from: c */
        public final Uri[] f56656c;

        /* renamed from: d */
        public final int[] f56657d;

        /* renamed from: e */
        public final long[] f56658e;

        /* renamed from: f */
        public final long f56659f;

        /* renamed from: g */
        public final boolean f56660g;

        public a() {
            this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        /* renamed from: a */
        public final int m29857a(@IntRange int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.f56657d;
                if (i4 >= iArr.length || this.f56660g || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f56654a == aVar.f56654a && this.f56655b == aVar.f56655b && Arrays.equals(this.f56656c, aVar.f56656c) && Arrays.equals(this.f56657d, aVar.f56657d) && Arrays.equals(this.f56658e, aVar.f56658e) && this.f56659f == aVar.f56659f && this.f56660g == aVar.f56660g;
        }

        public final int hashCode() {
            int i2 = this.f56655b * 31;
            long j2 = this.f56654a;
            int hashCode = (Arrays.hashCode(this.f56658e) + ((Arrays.hashCode(this.f56657d) + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f56656c)) * 31)) * 31)) * 31;
            long j3 = this.f56659f;
            return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f56660g ? 1 : 0);
        }

        private a(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
            C5220ia.m25473a(iArr.length == uriArr.length);
            this.f56654a = j2;
            this.f56655b = i2;
            this.f56657d = iArr;
            this.f56656c = uriArr;
            this.f56658e = jArr;
            this.f56659f = j3;
            this.f56660g = z;
        }

        @CheckResult
        /* renamed from: a */
        public final a m29858a() {
            int[] iArr = this.f56657d;
            int length = iArr.length;
            int max = Math.max(0, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.f56658e;
            int length2 = jArr.length;
            int max2 = Math.max(0, length2);
            long[] copyOf2 = Arrays.copyOf(jArr, max2);
            Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
            return new a(this.f56654a, 0, copyOf, (Uri[]) Arrays.copyOf(this.f56656c, 0), copyOf2, this.f56659f, this.f56660g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static a m29855a(Bundle bundle) {
            long j2 = bundle.getLong(Integer.toString(0, 36));
            int i2 = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            return new a(j2, i2, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    private C6054y3(@Nullable Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.f56647a = obj;
        this.f56649c = j2;
        this.f56650d = j3;
        this.f56648b = aVarArr.length + i2;
        this.f56652f = aVarArr;
        this.f56651e = i2;
    }

    /* renamed from: a */
    public final a m29854a(@IntRange int i2) {
        int i3 = this.f56651e;
        return i2 < i3 ? f56645h : this.f56652f[i2 - i3];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6054y3.class != obj.getClass()) {
            return false;
        }
        C6054y3 c6054y3 = (C6054y3) obj;
        return s91.m28112a(this.f56647a, c6054y3.f56647a) && this.f56648b == c6054y3.f56648b && this.f56649c == c6054y3.f56649c && this.f56650d == c6054y3.f56650d && this.f56651e == c6054y3.f56651e && Arrays.equals(this.f56652f, c6054y3.f56652f);
    }

    public final int hashCode() {
        int i2 = this.f56648b * 31;
        Object obj = this.f56647a;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f56649c)) * 31) + ((int) this.f56650d)) * 31) + this.f56651e) * 31) + Arrays.hashCode(this.f56652f);
    }

    public final String toString() {
        StringBuilder m24u = C0000a.m24u("AdPlaybackState(adsId=");
        m24u.append(this.f56647a);
        m24u.append(", adResumePositionUs=");
        m24u.append(this.f56649c);
        m24u.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f56652f.length; i2++) {
            m24u.append("adGroup(timeUs=");
            m24u.append(this.f56652f[i2].f56654a);
            m24u.append(", ads=[");
            for (int i3 = 0; i3 < this.f56652f[i2].f56657d.length; i3++) {
                m24u.append("ad(state=");
                int i4 = this.f56652f[i2].f56657d[i3];
                if (i4 == 0) {
                    m24u.append('_');
                } else if (i4 == 1) {
                    m24u.append('R');
                } else if (i4 == 2) {
                    m24u.append('S');
                } else if (i4 == 3) {
                    m24u.append('P');
                } else if (i4 != 4) {
                    m24u.append('?');
                } else {
                    m24u.append('!');
                }
                m24u.append(", durationUs=");
                m24u.append(this.f56652f[i2].f56658e[i3]);
                m24u.append(')');
                if (i3 < this.f56652f[i2].f56657d.length - 1) {
                    m24u.append(", ");
                }
            }
            m24u.append("])");
            if (i2 < this.f56652f.length - 1) {
                m24u.append(", ");
            }
        }
        m24u.append("])");
        return m24u.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C6054y3 m29852a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = a.f56653h.fromBundle((Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new C6054y3(null, aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }
}
