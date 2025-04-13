package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class AdPlaybackState implements Bundleable {

    /* renamed from: h */
    public static final AdPlaybackState f12599h = new AdPlaybackState(null, new AdGroup[0], 0, -9223372036854775807L, 0);

    /* renamed from: i */
    public static final AdGroup f12600i = new AdGroup(0).m6938g(0);

    /* renamed from: j */
    public static final Bundleable.Creator<AdPlaybackState> f12601j = C0954j.f10226s;

    /* renamed from: b */
    @Nullable
    public final Object f12602b;

    /* renamed from: c */
    public final int f12603c;

    /* renamed from: d */
    public final long f12604d;

    /* renamed from: e */
    public final long f12605e;

    /* renamed from: f */
    public final int f12606f;

    /* renamed from: g */
    public final AdGroup[] f12607g;

    public static final class AdGroup implements Bundleable {

        /* renamed from: i */
        public static final Bundleable.Creator<AdGroup> f12608i = C0954j.f10227t;

        /* renamed from: b */
        public final long f12609b;

        /* renamed from: c */
        public final int f12610c;

        /* renamed from: d */
        public final Uri[] f12611d;

        /* renamed from: e */
        public final int[] f12612e;

        /* renamed from: f */
        public final long[] f12613f;

        /* renamed from: g */
        public final long f12614g;

        /* renamed from: h */
        public final boolean f12615h;

        public AdGroup(long j2) {
            this(j2, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        @CheckResult
        /* renamed from: b */
        public static long[] m6933b(long[] jArr, int i2) {
            int length = jArr.length;
            int max = Math.max(i2, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        @CheckResult
        /* renamed from: c */
        public static int[] m6934c(int[] iArr, int i2) {
            int length = iArr.length;
            int max = Math.max(i2, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: f */
        public static String m6935f(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putLong(m6935f(0), this.f12609b);
            bundle.putInt(m6935f(1), this.f12610c);
            bundle.putParcelableArrayList(m6935f(2), new ArrayList<>(Arrays.asList(this.f12611d)));
            bundle.putIntArray(m6935f(3), this.f12612e);
            bundle.putLongArray(m6935f(4), this.f12613f);
            bundle.putLong(m6935f(5), this.f12614g);
            bundle.putBoolean(m6935f(6), this.f12615h);
            return bundle;
        }

        /* renamed from: d */
        public int m6936d(@IntRange int i2) {
            int i3 = i2 + 1;
            while (true) {
                int[] iArr = this.f12612e;
                if (i3 >= iArr.length || this.f12615h || iArr[i3] == 0 || iArr[i3] == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: e */
        public boolean m6937e() {
            if (this.f12610c == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.f12610c; i2++) {
                int[] iArr = this.f12612e;
                if (iArr[i2] == 0 || iArr[i2] == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.f12609b == adGroup.f12609b && this.f12610c == adGroup.f12610c && Arrays.equals(this.f12611d, adGroup.f12611d) && Arrays.equals(this.f12612e, adGroup.f12612e) && Arrays.equals(this.f12613f, adGroup.f12613f) && this.f12614g == adGroup.f12614g && this.f12615h == adGroup.f12615h;
        }

        @CheckResult
        /* renamed from: g */
        public AdGroup m6938g(int i2) {
            int[] m6934c = m6934c(this.f12612e, i2);
            long[] m6933b = m6933b(this.f12613f, i2);
            return new AdGroup(this.f12609b, i2, m6934c, (Uri[]) Arrays.copyOf(this.f12611d, i2), m6933b, this.f12614g, this.f12615h);
        }

        @CheckResult
        /* renamed from: h */
        public AdGroup m6939h(int i2, @IntRange int i3) {
            int i4 = this.f12610c;
            Assertions.m7513a(i4 == -1 || i3 < i4);
            int[] m6934c = m6934c(this.f12612e, i3 + 1);
            Assertions.m7513a(m6934c[i3] == 0 || m6934c[i3] == 1 || m6934c[i3] == i2);
            long[] jArr = this.f12613f;
            if (jArr.length != m6934c.length) {
                jArr = m6933b(jArr, m6934c.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.f12611d;
            if (uriArr.length != m6934c.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, m6934c.length);
            }
            m6934c[i3] = i2;
            return new AdGroup(this.f12609b, this.f12610c, m6934c, uriArr, jArr2, this.f12614g, this.f12615h);
        }

        public int hashCode() {
            int i2 = this.f12610c * 31;
            long j2 = this.f12609b;
            int hashCode = (Arrays.hashCode(this.f12613f) + ((Arrays.hashCode(this.f12612e) + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f12611d)) * 31)) * 31)) * 31;
            long j3 = this.f12614g;
            return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f12615h ? 1 : 0);
        }

        public AdGroup(long j2, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
            Assertions.m7513a(iArr.length == uriArr.length);
            this.f12609b = j2;
            this.f12610c = i2;
            this.f12612e = iArr;
            this.f12611d = uriArr;
            this.f12613f = jArr;
            this.f12614g = j3;
            this.f12615h = z;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(@Nullable Object obj, AdGroup[] adGroupArr, long j2, long j3, int i2) {
        this.f12602b = obj;
        this.f12604d = j2;
        this.f12605e = j3;
        this.f12603c = adGroupArr.length + i2;
        this.f12607g = adGroupArr;
        this.f12606f = i2;
    }

    /* renamed from: f */
    public static String m6924f(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.f12607g) {
            arrayList.add(adGroup.mo5679a());
        }
        bundle.putParcelableArrayList(m6924f(1), arrayList);
        bundle.putLong(m6924f(2), this.f12604d);
        bundle.putLong(m6924f(3), this.f12605e);
        bundle.putInt(m6924f(4), this.f12606f);
        return bundle;
    }

    /* renamed from: b */
    public AdGroup m6925b(@IntRange int i2) {
        int i3 = this.f12606f;
        return i2 < i3 ? f12600i : this.f12607g[i2 - i3];
    }

    /* renamed from: c */
    public int m6926c(long j2, long j3) {
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i2 = this.f12606f;
        while (i2 < this.f12603c) {
            if (m6925b(i2).f12609b == Long.MIN_VALUE || m6925b(i2).f12609b > j2) {
                AdGroup m6925b = m6925b(i2);
                if (m6925b.f12610c == -1 || m6925b.m6936d(-1) < m6925b.f12610c) {
                    break;
                }
            }
            i2++;
        }
        if (i2 < this.f12603c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: d */
    public int m6927d(long j2, long j3) {
        int i2 = this.f12603c - 1;
        while (i2 >= 0) {
            boolean z = false;
            if (j2 != Long.MIN_VALUE) {
                long j4 = m6925b(i2).f12609b;
                if (j4 != Long.MIN_VALUE ? j2 < j4 : !(j3 != -9223372036854775807L && j2 >= j3)) {
                    z = true;
                }
            }
            if (!z) {
                break;
            }
            i2--;
        }
        if (i2 < 0 || !m6925b(i2).m6937e()) {
            return -1;
        }
        return i2;
    }

    /* renamed from: e */
    public boolean m6928e(@IntRange int i2, @IntRange int i3) {
        AdGroup m6925b;
        int i4;
        return i2 < this.f12603c && (i4 = (m6925b = m6925b(i2)).f12610c) != -1 && i3 < i4 && m6925b.f12612e[i3] == 4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return Util.m7728a(this.f12602b, adPlaybackState.f12602b) && this.f12603c == adPlaybackState.f12603c && this.f12604d == adPlaybackState.f12604d && this.f12605e == adPlaybackState.f12605e && this.f12606f == adPlaybackState.f12606f && Arrays.equals(this.f12607g, adPlaybackState.f12607g);
    }

    @CheckResult
    /* renamed from: g */
    public AdPlaybackState m6929g(@IntRange int i2, @IntRange int i3) {
        Assertions.m7513a(i3 > 0);
        int i4 = i2 - this.f12606f;
        AdGroup[] adGroupArr = this.f12607g;
        if (adGroupArr[i4].f12610c == i3) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
        adGroupArr2[i4] = this.f12607g[i4].m6938g(i3);
        return new AdPlaybackState(this.f12602b, adGroupArr2, this.f12604d, this.f12605e, this.f12606f);
    }

    @CheckResult
    /* renamed from: h */
    public AdPlaybackState m6930h(long j2) {
        return this.f12604d == j2 ? this : new AdPlaybackState(this.f12602b, this.f12607g, j2, this.f12605e, this.f12606f);
    }

    public int hashCode() {
        int i2 = this.f12603c * 31;
        Object obj = this.f12602b;
        return ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12604d)) * 31) + ((int) this.f12605e)) * 31) + this.f12606f) * 31) + Arrays.hashCode(this.f12607g);
    }

    @CheckResult
    /* renamed from: i */
    public AdPlaybackState m6931i(@IntRange int i2, @IntRange int i3) {
        int i4 = i2 - this.f12606f;
        AdGroup[] adGroupArr = this.f12607g;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
        adGroupArr2[i4] = adGroupArr2[i4].m6939h(2, i3);
        return new AdPlaybackState(this.f12602b, adGroupArr2, this.f12604d, this.f12605e, this.f12606f);
    }

    @CheckResult
    /* renamed from: j */
    public AdPlaybackState m6932j(@IntRange int i2) {
        AdGroup adGroup;
        int i3 = i2 - this.f12606f;
        AdGroup[] adGroupArr = this.f12607g;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.m7719R(adGroupArr, adGroupArr.length);
        AdGroup adGroup2 = adGroupArr2[i3];
        if (adGroup2.f12610c == -1) {
            adGroup = new AdGroup(adGroup2.f12609b, 0, new int[0], new Uri[0], new long[0], adGroup2.f12614g, adGroup2.f12615h);
        } else {
            int[] iArr = adGroup2.f12612e;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i4 = 0; i4 < length; i4++) {
                if (copyOf[i4] == 1 || copyOf[i4] == 0) {
                    copyOf[i4] = 2;
                }
            }
            adGroup = new AdGroup(adGroup2.f12609b, length, copyOf, adGroup2.f12611d, adGroup2.f12613f, adGroup2.f12614g, adGroup2.f12615h);
        }
        adGroupArr2[i3] = adGroup;
        return new AdPlaybackState(this.f12602b, adGroupArr2, this.f12604d, this.f12605e, this.f12606f);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("AdPlaybackState(adsId=");
        m24u.append(this.f12602b);
        m24u.append(", adResumePositionUs=");
        m24u.append(this.f12604d);
        m24u.append(", adGroups=[");
        for (int i2 = 0; i2 < this.f12607g.length; i2++) {
            m24u.append("adGroup(timeUs=");
            m24u.append(this.f12607g[i2].f12609b);
            m24u.append(", ads=[");
            for (int i3 = 0; i3 < this.f12607g[i2].f12612e.length; i3++) {
                m24u.append("ad(state=");
                int i4 = this.f12607g[i2].f12612e[i3];
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
                m24u.append(this.f12607g[i2].f12613f[i3]);
                m24u.append(')');
                if (i3 < this.f12607g[i2].f12612e.length - 1) {
                    m24u.append(", ");
                }
            }
            m24u.append("])");
            if (i2 < this.f12607g.length - 1) {
                m24u.append(", ");
            }
        }
        m24u.append("])");
        return m24u.toString();
    }
}
