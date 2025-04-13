package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class MediaMetadata implements Bundleable {

    /* renamed from: I */
    public static final MediaMetadata f9790I = new Builder().m5848a();

    /* renamed from: J */
    public static final Bundleable.Creator<MediaMetadata> f9791J = C1026l.f11809l;

    /* renamed from: A */
    @Nullable
    public final CharSequence f9792A;

    /* renamed from: B */
    @Nullable
    public final CharSequence f9793B;

    /* renamed from: C */
    @Nullable
    public final Integer f9794C;

    /* renamed from: D */
    @Nullable
    public final Integer f9795D;

    /* renamed from: E */
    @Nullable
    public final CharSequence f9796E;

    /* renamed from: F */
    @Nullable
    public final CharSequence f9797F;

    /* renamed from: G */
    @Nullable
    public final CharSequence f9798G;

    /* renamed from: H */
    @Nullable
    public final Bundle f9799H;

    /* renamed from: b */
    @Nullable
    public final CharSequence f9800b;

    /* renamed from: c */
    @Nullable
    public final CharSequence f9801c;

    /* renamed from: d */
    @Nullable
    public final CharSequence f9802d;

    /* renamed from: e */
    @Nullable
    public final CharSequence f9803e;

    /* renamed from: f */
    @Nullable
    public final CharSequence f9804f;

    /* renamed from: g */
    @Nullable
    public final CharSequence f9805g;

    /* renamed from: h */
    @Nullable
    public final CharSequence f9806h;

    /* renamed from: i */
    @Nullable
    public final Uri f9807i;

    /* renamed from: j */
    @Nullable
    public final Rating f9808j;

    /* renamed from: k */
    @Nullable
    public final Rating f9809k;

    /* renamed from: l */
    @Nullable
    public final byte[] f9810l;

    /* renamed from: m */
    @Nullable
    public final Integer f9811m;

    /* renamed from: n */
    @Nullable
    public final Uri f9812n;

    /* renamed from: o */
    @Nullable
    public final Integer f9813o;

    /* renamed from: p */
    @Nullable
    public final Integer f9814p;

    /* renamed from: q */
    @Nullable
    public final Integer f9815q;

    /* renamed from: r */
    @Nullable
    public final Boolean f9816r;

    /* renamed from: s */
    @Nullable
    @Deprecated
    public final Integer f9817s;

    /* renamed from: t */
    @Nullable
    public final Integer f9818t;

    /* renamed from: u */
    @Nullable
    public final Integer f9819u;

    /* renamed from: v */
    @Nullable
    public final Integer f9820v;

    /* renamed from: w */
    @Nullable
    public final Integer f9821w;

    /* renamed from: x */
    @Nullable
    public final Integer f9822x;

    /* renamed from: y */
    @Nullable
    public final Integer f9823y;

    /* renamed from: z */
    @Nullable
    public final CharSequence f9824z;

    public static final class Builder {

        /* renamed from: A */
        @Nullable
        public Integer f9825A;

        /* renamed from: B */
        @Nullable
        public Integer f9826B;

        /* renamed from: C */
        @Nullable
        public CharSequence f9827C;

        /* renamed from: D */
        @Nullable
        public CharSequence f9828D;

        /* renamed from: E */
        @Nullable
        public CharSequence f9829E;

        /* renamed from: F */
        @Nullable
        public Bundle f9830F;

        /* renamed from: a */
        @Nullable
        public CharSequence f9831a;

        /* renamed from: b */
        @Nullable
        public CharSequence f9832b;

        /* renamed from: c */
        @Nullable
        public CharSequence f9833c;

        /* renamed from: d */
        @Nullable
        public CharSequence f9834d;

        /* renamed from: e */
        @Nullable
        public CharSequence f9835e;

        /* renamed from: f */
        @Nullable
        public CharSequence f9836f;

        /* renamed from: g */
        @Nullable
        public CharSequence f9837g;

        /* renamed from: h */
        @Nullable
        public Uri f9838h;

        /* renamed from: i */
        @Nullable
        public Rating f9839i;

        /* renamed from: j */
        @Nullable
        public Rating f9840j;

        /* renamed from: k */
        @Nullable
        public byte[] f9841k;

        /* renamed from: l */
        @Nullable
        public Integer f9842l;

        /* renamed from: m */
        @Nullable
        public Uri f9843m;

        /* renamed from: n */
        @Nullable
        public Integer f9844n;

        /* renamed from: o */
        @Nullable
        public Integer f9845o;

        /* renamed from: p */
        @Nullable
        public Integer f9846p;

        /* renamed from: q */
        @Nullable
        public Boolean f9847q;

        /* renamed from: r */
        @Nullable
        public Integer f9848r;

        /* renamed from: s */
        @Nullable
        public Integer f9849s;

        /* renamed from: t */
        @Nullable
        public Integer f9850t;

        /* renamed from: u */
        @Nullable
        public Integer f9851u;

        /* renamed from: v */
        @Nullable
        public Integer f9852v;

        /* renamed from: w */
        @Nullable
        public Integer f9853w;

        /* renamed from: x */
        @Nullable
        public CharSequence f9854x;

        /* renamed from: y */
        @Nullable
        public CharSequence f9855y;

        /* renamed from: z */
        @Nullable
        public CharSequence f9856z;

        public Builder() {
        }

        /* renamed from: a */
        public MediaMetadata m5848a() {
            return new MediaMetadata(this, null);
        }

        /* renamed from: b */
        public Builder m5849b(byte[] bArr, int i2) {
            if (this.f9841k == null || Util.m7728a(Integer.valueOf(i2), 3) || !Util.m7728a(this.f9842l, 3)) {
                this.f9841k = (byte[]) bArr.clone();
                this.f9842l = Integer.valueOf(i2);
            }
            return this;
        }

        public Builder(MediaMetadata mediaMetadata, C09381 c09381) {
            this.f9831a = mediaMetadata.f9800b;
            this.f9832b = mediaMetadata.f9801c;
            this.f9833c = mediaMetadata.f9802d;
            this.f9834d = mediaMetadata.f9803e;
            this.f9835e = mediaMetadata.f9804f;
            this.f9836f = mediaMetadata.f9805g;
            this.f9837g = mediaMetadata.f9806h;
            this.f9838h = mediaMetadata.f9807i;
            this.f9839i = mediaMetadata.f9808j;
            this.f9840j = mediaMetadata.f9809k;
            this.f9841k = mediaMetadata.f9810l;
            this.f9842l = mediaMetadata.f9811m;
            this.f9843m = mediaMetadata.f9812n;
            this.f9844n = mediaMetadata.f9813o;
            this.f9845o = mediaMetadata.f9814p;
            this.f9846p = mediaMetadata.f9815q;
            this.f9847q = mediaMetadata.f9816r;
            this.f9848r = mediaMetadata.f9818t;
            this.f9849s = mediaMetadata.f9819u;
            this.f9850t = mediaMetadata.f9820v;
            this.f9851u = mediaMetadata.f9821w;
            this.f9852v = mediaMetadata.f9822x;
            this.f9853w = mediaMetadata.f9823y;
            this.f9854x = mediaMetadata.f9824z;
            this.f9855y = mediaMetadata.f9792A;
            this.f9856z = mediaMetadata.f9793B;
            this.f9825A = mediaMetadata.f9794C;
            this.f9826B = mediaMetadata.f9795D;
            this.f9827C = mediaMetadata.f9796E;
            this.f9828D = mediaMetadata.f9797F;
            this.f9829E = mediaMetadata.f9798G;
            this.f9830F = mediaMetadata.f9799H;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    public MediaMetadata(Builder builder, C09381 c09381) {
        this.f9800b = builder.f9831a;
        this.f9801c = builder.f9832b;
        this.f9802d = builder.f9833c;
        this.f9803e = builder.f9834d;
        this.f9804f = builder.f9835e;
        this.f9805g = builder.f9836f;
        this.f9806h = builder.f9837g;
        this.f9807i = builder.f9838h;
        this.f9808j = builder.f9839i;
        this.f9809k = builder.f9840j;
        this.f9810l = builder.f9841k;
        this.f9811m = builder.f9842l;
        this.f9812n = builder.f9843m;
        this.f9813o = builder.f9844n;
        this.f9814p = builder.f9845o;
        this.f9815q = builder.f9846p;
        this.f9816r = builder.f9847q;
        Integer num = builder.f9848r;
        this.f9817s = num;
        this.f9818t = num;
        this.f9819u = builder.f9849s;
        this.f9820v = builder.f9850t;
        this.f9821w = builder.f9851u;
        this.f9822x = builder.f9852v;
        this.f9823y = builder.f9853w;
        this.f9824z = builder.f9854x;
        this.f9792A = builder.f9855y;
        this.f9793B = builder.f9856z;
        this.f9794C = builder.f9825A;
        this.f9795D = builder.f9826B;
        this.f9796E = builder.f9827C;
        this.f9797F = builder.f9828D;
        this.f9798G = builder.f9829E;
        this.f9799H = builder.f9830F;
    }

    /* renamed from: c */
    public static String m5846c(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(m5846c(0), this.f9800b);
        bundle.putCharSequence(m5846c(1), this.f9801c);
        bundle.putCharSequence(m5846c(2), this.f9802d);
        bundle.putCharSequence(m5846c(3), this.f9803e);
        bundle.putCharSequence(m5846c(4), this.f9804f);
        bundle.putCharSequence(m5846c(5), this.f9805g);
        bundle.putCharSequence(m5846c(6), this.f9806h);
        bundle.putParcelable(m5846c(7), this.f9807i);
        bundle.putByteArray(m5846c(10), this.f9810l);
        bundle.putParcelable(m5846c(11), this.f9812n);
        bundle.putCharSequence(m5846c(22), this.f9824z);
        bundle.putCharSequence(m5846c(23), this.f9792A);
        bundle.putCharSequence(m5846c(24), this.f9793B);
        bundle.putCharSequence(m5846c(27), this.f9796E);
        bundle.putCharSequence(m5846c(28), this.f9797F);
        bundle.putCharSequence(m5846c(30), this.f9798G);
        if (this.f9808j != null) {
            bundle.putBundle(m5846c(8), this.f9808j.mo5679a());
        }
        if (this.f9809k != null) {
            bundle.putBundle(m5846c(9), this.f9809k.mo5679a());
        }
        if (this.f9813o != null) {
            bundle.putInt(m5846c(12), this.f9813o.intValue());
        }
        if (this.f9814p != null) {
            bundle.putInt(m5846c(13), this.f9814p.intValue());
        }
        if (this.f9815q != null) {
            bundle.putInt(m5846c(14), this.f9815q.intValue());
        }
        if (this.f9816r != null) {
            bundle.putBoolean(m5846c(15), this.f9816r.booleanValue());
        }
        if (this.f9818t != null) {
            bundle.putInt(m5846c(16), this.f9818t.intValue());
        }
        if (this.f9819u != null) {
            bundle.putInt(m5846c(17), this.f9819u.intValue());
        }
        if (this.f9820v != null) {
            bundle.putInt(m5846c(18), this.f9820v.intValue());
        }
        if (this.f9821w != null) {
            bundle.putInt(m5846c(19), this.f9821w.intValue());
        }
        if (this.f9822x != null) {
            bundle.putInt(m5846c(20), this.f9822x.intValue());
        }
        if (this.f9823y != null) {
            bundle.putInt(m5846c(21), this.f9823y.intValue());
        }
        if (this.f9794C != null) {
            bundle.putInt(m5846c(25), this.f9794C.intValue());
        }
        if (this.f9795D != null) {
            bundle.putInt(m5846c(26), this.f9795D.intValue());
        }
        if (this.f9811m != null) {
            bundle.putInt(m5846c(29), this.f9811m.intValue());
        }
        if (this.f9799H != null) {
            bundle.putBundle(m5846c(1000), this.f9799H);
        }
        return bundle;
    }

    /* renamed from: b */
    public Builder m5847b() {
        return new Builder(this, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Util.m7728a(this.f9800b, mediaMetadata.f9800b) && Util.m7728a(this.f9801c, mediaMetadata.f9801c) && Util.m7728a(this.f9802d, mediaMetadata.f9802d) && Util.m7728a(this.f9803e, mediaMetadata.f9803e) && Util.m7728a(this.f9804f, mediaMetadata.f9804f) && Util.m7728a(this.f9805g, mediaMetadata.f9805g) && Util.m7728a(this.f9806h, mediaMetadata.f9806h) && Util.m7728a(this.f9807i, mediaMetadata.f9807i) && Util.m7728a(this.f9808j, mediaMetadata.f9808j) && Util.m7728a(this.f9809k, mediaMetadata.f9809k) && Arrays.equals(this.f9810l, mediaMetadata.f9810l) && Util.m7728a(this.f9811m, mediaMetadata.f9811m) && Util.m7728a(this.f9812n, mediaMetadata.f9812n) && Util.m7728a(this.f9813o, mediaMetadata.f9813o) && Util.m7728a(this.f9814p, mediaMetadata.f9814p) && Util.m7728a(this.f9815q, mediaMetadata.f9815q) && Util.m7728a(this.f9816r, mediaMetadata.f9816r) && Util.m7728a(this.f9818t, mediaMetadata.f9818t) && Util.m7728a(this.f9819u, mediaMetadata.f9819u) && Util.m7728a(this.f9820v, mediaMetadata.f9820v) && Util.m7728a(this.f9821w, mediaMetadata.f9821w) && Util.m7728a(this.f9822x, mediaMetadata.f9822x) && Util.m7728a(this.f9823y, mediaMetadata.f9823y) && Util.m7728a(this.f9824z, mediaMetadata.f9824z) && Util.m7728a(this.f9792A, mediaMetadata.f9792A) && Util.m7728a(this.f9793B, mediaMetadata.f9793B) && Util.m7728a(this.f9794C, mediaMetadata.f9794C) && Util.m7728a(this.f9795D, mediaMetadata.f9795D) && Util.m7728a(this.f9796E, mediaMetadata.f9796E) && Util.m7728a(this.f9797F, mediaMetadata.f9797F) && Util.m7728a(this.f9798G, mediaMetadata.f9798G);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9800b, this.f9801c, this.f9802d, this.f9803e, this.f9804f, this.f9805g, this.f9806h, this.f9807i, this.f9808j, this.f9809k, Integer.valueOf(Arrays.hashCode(this.f9810l)), this.f9811m, this.f9812n, this.f9813o, this.f9814p, this.f9815q, this.f9816r, this.f9818t, this.f9819u, this.f9820v, this.f9821w, this.f9822x, this.f9823y, this.f9824z, this.f9792A, this.f9793B, this.f9794C, this.f9795D, this.f9796E, this.f9797F, this.f9798G});
    }
}
