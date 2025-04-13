package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Joiner;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Format implements Bundleable {

    /* renamed from: H */
    public static final Format f9639H = new Builder().m5833a();

    /* renamed from: I */
    public static final Bundleable.Creator<Format> f9640I = C1026l.f11804g;

    /* renamed from: A */
    public final int f9641A;

    /* renamed from: B */
    public final int f9642B;

    /* renamed from: C */
    public final int f9643C;

    /* renamed from: D */
    public final int f9644D;

    /* renamed from: E */
    public final int f9645E;

    /* renamed from: F */
    public final int f9646F;

    /* renamed from: G */
    public int f9647G;

    /* renamed from: b */
    @Nullable
    public final String f9648b;

    /* renamed from: c */
    @Nullable
    public final String f9649c;

    /* renamed from: d */
    @Nullable
    public final String f9650d;

    /* renamed from: e */
    public final int f9651e;

    /* renamed from: f */
    public final int f9652f;

    /* renamed from: g */
    public final int f9653g;

    /* renamed from: h */
    public final int f9654h;

    /* renamed from: i */
    public final int f9655i;

    /* renamed from: j */
    @Nullable
    public final String f9656j;

    /* renamed from: k */
    @Nullable
    public final Metadata f9657k;

    /* renamed from: l */
    @Nullable
    public final String f9658l;

    /* renamed from: m */
    @Nullable
    public final String f9659m;

    /* renamed from: n */
    public final int f9660n;

    /* renamed from: o */
    public final List<byte[]> f9661o;

    /* renamed from: p */
    @Nullable
    public final DrmInitData f9662p;

    /* renamed from: q */
    public final long f9663q;

    /* renamed from: r */
    public final int f9664r;

    /* renamed from: s */
    public final int f9665s;

    /* renamed from: t */
    public final float f9666t;

    /* renamed from: u */
    public final int f9667u;

    /* renamed from: v */
    public final float f9668v;

    /* renamed from: w */
    @Nullable
    public final byte[] f9669w;

    /* renamed from: x */
    public final int f9670x;

    /* renamed from: y */
    @Nullable
    public final ColorInfo f9671y;

    /* renamed from: z */
    public final int f9672z;

    public Format(Builder builder, C09351 c09351) {
        this.f9648b = builder.f9677a;
        this.f9649c = builder.f9678b;
        this.f9650d = Util.m7718Q(builder.f9679c);
        this.f9651e = builder.f9680d;
        this.f9652f = builder.f9681e;
        int i2 = builder.f9682f;
        this.f9653g = i2;
        int i3 = builder.f9683g;
        this.f9654h = i3;
        this.f9655i = i3 != -1 ? i3 : i2;
        this.f9656j = builder.f9684h;
        this.f9657k = builder.f9685i;
        this.f9658l = builder.f9686j;
        this.f9659m = builder.f9687k;
        this.f9660n = builder.f9688l;
        List<byte[]> list = builder.f9689m;
        this.f9661o = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = builder.f9690n;
        this.f9662p = drmInitData;
        this.f9663q = builder.f9691o;
        this.f9664r = builder.f9692p;
        this.f9665s = builder.f9693q;
        this.f9666t = builder.f9694r;
        int i4 = builder.f9695s;
        this.f9667u = i4 == -1 ? 0 : i4;
        float f2 = builder.f9696t;
        this.f9668v = f2 == -1.0f ? 1.0f : f2;
        this.f9669w = builder.f9697u;
        this.f9670x = builder.f9698v;
        this.f9671y = builder.f9699w;
        this.f9672z = builder.f9700x;
        this.f9641A = builder.f9701y;
        this.f9642B = builder.f9702z;
        int i5 = builder.f9673A;
        this.f9643C = i5 == -1 ? 0 : i5;
        int i6 = builder.f9674B;
        this.f9644D = i6 != -1 ? i6 : 0;
        this.f9645E = builder.f9675C;
        int i7 = builder.f9676D;
        if (i7 != 0 || drmInitData == null) {
            this.f9646F = i7;
        } else {
            this.f9646F = 1;
        }
    }

    @Nullable
    /* renamed from: d */
    public static <T> T m5825d(@Nullable T t, @Nullable T t2) {
        return t != null ? t : t2;
    }

    /* renamed from: f */
    public static String m5826f(int i2) {
        return Integer.toString(i2, 36);
    }

    /* renamed from: g */
    public static String m5827g(int i2) {
        String m5826f = m5826f(12);
        String num = Integer.toString(i2, 36);
        return C0576a.m4115n(C0576a.m4106e(num, C0576a.m4106e(m5826f, 1)), m5826f, "_", num);
    }

    /* renamed from: h */
    public static String m5828h(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder m24u = C0000a.m24u("id=");
        m24u.append(format.f9648b);
        m24u.append(", mimeType=");
        m24u.append(format.f9659m);
        if (format.f9655i != -1) {
            m24u.append(", bitrate=");
            m24u.append(format.f9655i);
        }
        if (format.f9656j != null) {
            m24u.append(", codecs=");
            m24u.append(format.f9656j);
        }
        if (format.f9662p != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                DrmInitData drmInitData = format.f9662p;
                if (i2 >= drmInitData.f10711e) {
                    break;
                }
                UUID uuid = drmInitData.f10708b[i2].f10713c;
                if (uuid.equals(C0932C.f9457b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C0932C.f9458c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C0932C.f9460e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C0932C.f9459d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C0932C.f9456a)) {
                    linkedHashSet.add("universal");
                } else {
                    String valueOf = String.valueOf(uuid);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 10);
                    sb.append("unknown (");
                    sb.append(valueOf);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
                i2++;
            }
            m24u.append(", drm=[");
            m24u.append(Joiner.m11159c(',').m11161b(linkedHashSet));
            m24u.append(']');
        }
        if (format.f9664r != -1 && format.f9665s != -1) {
            m24u.append(", res=");
            m24u.append(format.f9664r);
            m24u.append("x");
            m24u.append(format.f9665s);
        }
        if (format.f9666t != -1.0f) {
            m24u.append(", fps=");
            m24u.append(format.f9666t);
        }
        if (format.f9672z != -1) {
            m24u.append(", channels=");
            m24u.append(format.f9672z);
        }
        if (format.f9641A != -1) {
            m24u.append(", sample_rate=");
            m24u.append(format.f9641A);
        }
        if (format.f9650d != null) {
            m24u.append(", language=");
            m24u.append(format.f9650d);
        }
        if (format.f9649c != null) {
            m24u.append(", label=");
            m24u.append(format.f9649c);
        }
        if ((format.f9652f & 16384) != 0) {
            m24u.append(", trick-play-track");
        }
        return m24u.toString();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putString(m5826f(0), this.f9648b);
        bundle.putString(m5826f(1), this.f9649c);
        bundle.putString(m5826f(2), this.f9650d);
        bundle.putInt(m5826f(3), this.f9651e);
        bundle.putInt(m5826f(4), this.f9652f);
        bundle.putInt(m5826f(5), this.f9653g);
        bundle.putInt(m5826f(6), this.f9654h);
        bundle.putString(m5826f(7), this.f9656j);
        bundle.putParcelable(m5826f(8), this.f9657k);
        bundle.putString(m5826f(9), this.f9658l);
        bundle.putString(m5826f(10), this.f9659m);
        bundle.putInt(m5826f(11), this.f9660n);
        for (int i2 = 0; i2 < this.f9661o.size(); i2++) {
            bundle.putByteArray(m5827g(i2), this.f9661o.get(i2));
        }
        bundle.putParcelable(m5826f(13), this.f9662p);
        bundle.putLong(m5826f(14), this.f9663q);
        bundle.putInt(m5826f(15), this.f9664r);
        bundle.putInt(m5826f(16), this.f9665s);
        bundle.putFloat(m5826f(17), this.f9666t);
        bundle.putInt(m5826f(18), this.f9667u);
        bundle.putFloat(m5826f(19), this.f9668v);
        bundle.putByteArray(m5826f(20), this.f9669w);
        bundle.putInt(m5826f(21), this.f9670x);
        bundle.putBundle(m5826f(22), BundleableUtil.m7526e(this.f9671y));
        bundle.putInt(m5826f(23), this.f9672z);
        bundle.putInt(m5826f(24), this.f9641A);
        bundle.putInt(m5826f(25), this.f9642B);
        bundle.putInt(m5826f(26), this.f9643C);
        bundle.putInt(m5826f(27), this.f9644D);
        bundle.putInt(m5826f(28), this.f9645E);
        bundle.putInt(m5826f(29), this.f9646F);
        return bundle;
    }

    /* renamed from: b */
    public Builder m5829b() {
        return new Builder(this, null);
    }

    /* renamed from: c */
    public Format m5830c(int i2) {
        Builder m5829b = m5829b();
        m5829b.f9676D = i2;
        return m5829b.m5833a();
    }

    /* renamed from: e */
    public boolean m5831e(Format format) {
        if (this.f9661o.size() != format.f9661o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f9661o.size(); i2++) {
            if (!Arrays.equals(this.f9661o.get(i2), format.f9661o.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i3 = this.f9647G;
        return (i3 == 0 || (i2 = format.f9647G) == 0 || i3 == i2) && this.f9651e == format.f9651e && this.f9652f == format.f9652f && this.f9653g == format.f9653g && this.f9654h == format.f9654h && this.f9660n == format.f9660n && this.f9663q == format.f9663q && this.f9664r == format.f9664r && this.f9665s == format.f9665s && this.f9667u == format.f9667u && this.f9670x == format.f9670x && this.f9672z == format.f9672z && this.f9641A == format.f9641A && this.f9642B == format.f9642B && this.f9643C == format.f9643C && this.f9644D == format.f9644D && this.f9645E == format.f9645E && this.f9646F == format.f9646F && Float.compare(this.f9666t, format.f9666t) == 0 && Float.compare(this.f9668v, format.f9668v) == 0 && Util.m7728a(this.f9648b, format.f9648b) && Util.m7728a(this.f9649c, format.f9649c) && Util.m7728a(this.f9656j, format.f9656j) && Util.m7728a(this.f9658l, format.f9658l) && Util.m7728a(this.f9659m, format.f9659m) && Util.m7728a(this.f9650d, format.f9650d) && Arrays.equals(this.f9669w, format.f9669w) && Util.m7728a(this.f9657k, format.f9657k) && Util.m7728a(this.f9671y, format.f9671y) && Util.m7728a(this.f9662p, format.f9662p) && m5831e(format);
    }

    public int hashCode() {
        if (this.f9647G == 0) {
            String str = this.f9648b;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9649c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9650d;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9651e) * 31) + this.f9652f) * 31) + this.f9653g) * 31) + this.f9654h) * 31;
            String str4 = this.f9656j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f9657k;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f9658l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9659m;
            this.f9647G = ((((((((((((((((Float.floatToIntBits(this.f9668v) + ((((Float.floatToIntBits(this.f9666t) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f9660n) * 31) + ((int) this.f9663q)) * 31) + this.f9664r) * 31) + this.f9665s) * 31)) * 31) + this.f9667u) * 31)) * 31) + this.f9670x) * 31) + this.f9672z) * 31) + this.f9641A) * 31) + this.f9642B) * 31) + this.f9643C) * 31) + this.f9644D) * 31) + this.f9645E) * 31) + this.f9646F;
        }
        return this.f9647G;
    }

    /* renamed from: i */
    public Format m5832i(Format format) {
        String str;
        String str2;
        int i2;
        DrmInitData.SchemeData[] schemeDataArr;
        String str3;
        boolean z;
        if (this == format) {
            return this;
        }
        int m7601i = MimeTypes.m7601i(this.f9659m);
        String str4 = format.f9648b;
        String str5 = format.f9649c;
        if (str5 == null) {
            str5 = this.f9649c;
        }
        String str6 = this.f9650d;
        if ((m7601i == 3 || m7601i == 1) && (str = format.f9650d) != null) {
            str6 = str;
        }
        int i3 = this.f9653g;
        if (i3 == -1) {
            i3 = format.f9653g;
        }
        int i4 = this.f9654h;
        if (i4 == -1) {
            i4 = format.f9654h;
        }
        String str7 = this.f9656j;
        if (str7 == null) {
            String m7752u = Util.m7752u(format.f9656j, m7601i);
            if (Util.m7727Z(m7752u).length == 1) {
                str7 = m7752u;
            }
        }
        Metadata metadata = this.f9657k;
        Metadata m6697c = metadata == null ? format.f9657k : metadata.m6697c(format.f9657k);
        float f2 = this.f9666t;
        if (f2 == -1.0f && m7601i == 2) {
            f2 = format.f9666t;
        }
        int i5 = this.f9651e | format.f9651e;
        int i6 = this.f9652f | format.f9652f;
        DrmInitData drmInitData = format.f9662p;
        DrmInitData drmInitData2 = this.f9662p;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str2 = drmInitData.f10710d;
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData.f10708b;
            int length = schemeDataArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr2[i7];
                if (schemeData.m6298c()) {
                    arrayList.add(schemeData);
                }
                i7++;
                length = i8;
            }
        } else {
            str2 = null;
        }
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f10710d;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f10708b;
            int length2 = schemeDataArr3.length;
            int i9 = 0;
            while (i9 < length2) {
                int i10 = length2;
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i9];
                if (schemeData2.m6298c()) {
                    schemeDataArr = schemeDataArr3;
                    UUID uuid = schemeData2.f10713c;
                    str3 = str2;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i2 = size;
                            z = false;
                            break;
                        }
                        i2 = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i11)).f10713c.equals(uuid)) {
                            z = true;
                            break;
                        }
                        i11++;
                        size = i2;
                    }
                    if (!z) {
                        arrayList.add(schemeData2);
                    }
                } else {
                    i2 = size;
                    schemeDataArr = schemeDataArr3;
                    str3 = str2;
                }
                i9++;
                length2 = i10;
                schemeDataArr3 = schemeDataArr;
                str2 = str3;
                size = i2;
            }
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        Builder m5829b = m5829b();
        m5829b.f9677a = str4;
        m5829b.f9678b = str5;
        m5829b.f9679c = str6;
        m5829b.f9680d = i5;
        m5829b.f9681e = i6;
        m5829b.f9682f = i3;
        m5829b.f9683g = i4;
        m5829b.f9684h = str7;
        m5829b.f9685i = m6697c;
        m5829b.f9690n = drmInitData3;
        m5829b.f9694r = f2;
        return m5829b.m5833a();
    }

    public String toString() {
        String str = this.f9648b;
        String str2 = this.f9649c;
        String str3 = this.f9658l;
        String str4 = this.f9659m;
        String str5 = this.f9656j;
        int i2 = this.f9655i;
        String str6 = this.f9650d;
        int i3 = this.f9664r;
        int i4 = this.f9665s;
        float f2 = this.f9666t;
        int i5 = this.f9672z;
        int i6 = this.f9641A;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str6, C0576a.m4106e(str5, C0576a.m4106e(str4, C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary)))))), "Format(", str, ", ", str2);
        C0000a.m2C(m4122u, ", ", str3, ", ", str4);
        m4122u.append(", ");
        m4122u.append(str5);
        m4122u.append(", ");
        m4122u.append(i2);
        m4122u.append(", ");
        m4122u.append(str6);
        m4122u.append(", [");
        m4122u.append(i3);
        m4122u.append(", ");
        m4122u.append(i4);
        m4122u.append(", ");
        m4122u.append(f2);
        m4122u.append("], [");
        m4122u.append(i5);
        m4122u.append(", ");
        m4122u.append(i6);
        m4122u.append("])");
        return m4122u.toString();
    }

    public static final class Builder {

        /* renamed from: A */
        public int f9673A;

        /* renamed from: B */
        public int f9674B;

        /* renamed from: C */
        public int f9675C;

        /* renamed from: D */
        public int f9676D;

        /* renamed from: a */
        @Nullable
        public String f9677a;

        /* renamed from: b */
        @Nullable
        public String f9678b;

        /* renamed from: c */
        @Nullable
        public String f9679c;

        /* renamed from: d */
        public int f9680d;

        /* renamed from: e */
        public int f9681e;

        /* renamed from: f */
        public int f9682f;

        /* renamed from: g */
        public int f9683g;

        /* renamed from: h */
        @Nullable
        public String f9684h;

        /* renamed from: i */
        @Nullable
        public Metadata f9685i;

        /* renamed from: j */
        @Nullable
        public String f9686j;

        /* renamed from: k */
        @Nullable
        public String f9687k;

        /* renamed from: l */
        public int f9688l;

        /* renamed from: m */
        @Nullable
        public List<byte[]> f9689m;

        /* renamed from: n */
        @Nullable
        public DrmInitData f9690n;

        /* renamed from: o */
        public long f9691o;

        /* renamed from: p */
        public int f9692p;

        /* renamed from: q */
        public int f9693q;

        /* renamed from: r */
        public float f9694r;

        /* renamed from: s */
        public int f9695s;

        /* renamed from: t */
        public float f9696t;

        /* renamed from: u */
        @Nullable
        public byte[] f9697u;

        /* renamed from: v */
        public int f9698v;

        /* renamed from: w */
        @Nullable
        public ColorInfo f9699w;

        /* renamed from: x */
        public int f9700x;

        /* renamed from: y */
        public int f9701y;

        /* renamed from: z */
        public int f9702z;

        public Builder() {
            this.f9682f = -1;
            this.f9683g = -1;
            this.f9688l = -1;
            this.f9691o = Long.MAX_VALUE;
            this.f9692p = -1;
            this.f9693q = -1;
            this.f9694r = -1.0f;
            this.f9696t = 1.0f;
            this.f9698v = -1;
            this.f9700x = -1;
            this.f9701y = -1;
            this.f9702z = -1;
            this.f9675C = -1;
            this.f9676D = 0;
        }

        /* renamed from: a */
        public Format m5833a() {
            return new Format(this, null);
        }

        /* renamed from: b */
        public Builder m5834b(int i2) {
            this.f9677a = Integer.toString(i2);
            return this;
        }

        public Builder(Format format, C09351 c09351) {
            this.f9677a = format.f9648b;
            this.f9678b = format.f9649c;
            this.f9679c = format.f9650d;
            this.f9680d = format.f9651e;
            this.f9681e = format.f9652f;
            this.f9682f = format.f9653g;
            this.f9683g = format.f9654h;
            this.f9684h = format.f9656j;
            this.f9685i = format.f9657k;
            this.f9686j = format.f9658l;
            this.f9687k = format.f9659m;
            this.f9688l = format.f9660n;
            this.f9689m = format.f9661o;
            this.f9690n = format.f9662p;
            this.f9691o = format.f9663q;
            this.f9692p = format.f9664r;
            this.f9693q = format.f9665s;
            this.f9694r = format.f9666t;
            this.f9695s = format.f9667u;
            this.f9696t = format.f9668v;
            this.f9697u = format.f9669w;
            this.f9698v = format.f9670x;
            this.f9699w = format.f9671y;
            this.f9700x = format.f9672z;
            this.f9701y = format.f9641A;
            this.f9702z = format.f9642B;
            this.f9673A = format.f9643C;
            this.f9674B = format.f9644D;
            this.f9675C = format.f9645E;
            this.f9676D = format.f9646F;
        }
    }
}
