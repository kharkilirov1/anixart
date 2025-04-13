package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Cue implements Bundleable {

    /* renamed from: s */
    public static final Cue f13435s;

    /* renamed from: t */
    public static final Bundleable.Creator<Cue> f13436t;

    /* renamed from: b */
    @Nullable
    public final CharSequence f13437b;

    /* renamed from: c */
    @Nullable
    public final Layout.Alignment f13438c;

    /* renamed from: d */
    @Nullable
    public final Layout.Alignment f13439d;

    /* renamed from: e */
    @Nullable
    public final Bitmap f13440e;

    /* renamed from: f */
    public final float f13441f;

    /* renamed from: g */
    public final int f13442g;

    /* renamed from: h */
    public final int f13443h;

    /* renamed from: i */
    public final float f13444i;

    /* renamed from: j */
    public final int f13445j;

    /* renamed from: k */
    public final float f13446k;

    /* renamed from: l */
    public final float f13447l;

    /* renamed from: m */
    public final boolean f13448m;

    /* renamed from: n */
    public final int f13449n;

    /* renamed from: o */
    public final int f13450o;

    /* renamed from: p */
    public final float f13451p;

    /* renamed from: q */
    public final int f13452q;

    /* renamed from: r */
    public final float f13453r;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        Builder builder = new Builder();
        builder.f13454a = "";
        f13435s = builder.m7178a();
        f13436t = C0954j.f10232y;
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, C11251 c11251) {
        if (charSequence == null) {
            Objects.requireNonNull(bitmap);
        } else {
            Assertions.m7513a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f13437b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13437b = charSequence.toString();
        } else {
            this.f13437b = null;
        }
        this.f13438c = alignment;
        this.f13439d = alignment2;
        this.f13440e = bitmap;
        this.f13441f = f2;
        this.f13442g = i2;
        this.f13443h = i3;
        this.f13444i = f3;
        this.f13445j = i4;
        this.f13446k = f5;
        this.f13447l = f6;
        this.f13448m = z;
        this.f13449n = i6;
        this.f13450o = i5;
        this.f13451p = f4;
        this.f13452q = i7;
        this.f13453r = f7;
    }

    /* renamed from: c */
    public static String m7176c(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(m7176c(0), this.f13437b);
        bundle.putSerializable(m7176c(1), this.f13438c);
        bundle.putSerializable(m7176c(2), this.f13439d);
        bundle.putParcelable(m7176c(3), this.f13440e);
        bundle.putFloat(m7176c(4), this.f13441f);
        bundle.putInt(m7176c(5), this.f13442g);
        bundle.putInt(m7176c(6), this.f13443h);
        bundle.putFloat(m7176c(7), this.f13444i);
        bundle.putInt(m7176c(8), this.f13445j);
        bundle.putInt(m7176c(9), this.f13450o);
        bundle.putFloat(m7176c(10), this.f13451p);
        bundle.putFloat(m7176c(11), this.f13446k);
        bundle.putFloat(m7176c(12), this.f13447l);
        bundle.putBoolean(m7176c(14), this.f13448m);
        bundle.putInt(m7176c(13), this.f13449n);
        bundle.putInt(m7176c(15), this.f13452q);
        bundle.putFloat(m7176c(16), this.f13453r);
        return bundle;
    }

    /* renamed from: b */
    public Builder m7177b() {
        return new Builder(this, null);
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        return TextUtils.equals(this.f13437b, cue.f13437b) && this.f13438c == cue.f13438c && this.f13439d == cue.f13439d && ((bitmap = this.f13440e) != null ? !((bitmap2 = cue.f13440e) == null || !bitmap.sameAs(bitmap2)) : cue.f13440e == null) && this.f13441f == cue.f13441f && this.f13442g == cue.f13442g && this.f13443h == cue.f13443h && this.f13444i == cue.f13444i && this.f13445j == cue.f13445j && this.f13446k == cue.f13446k && this.f13447l == cue.f13447l && this.f13448m == cue.f13448m && this.f13449n == cue.f13449n && this.f13450o == cue.f13450o && this.f13451p == cue.f13451p && this.f13452q == cue.f13452q && this.f13453r == cue.f13453r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13437b, this.f13438c, this.f13439d, this.f13440e, Float.valueOf(this.f13441f), Integer.valueOf(this.f13442g), Integer.valueOf(this.f13443h), Float.valueOf(this.f13444i), Integer.valueOf(this.f13445j), Float.valueOf(this.f13446k), Float.valueOf(this.f13447l), Boolean.valueOf(this.f13448m), Integer.valueOf(this.f13449n), Integer.valueOf(this.f13450o), Float.valueOf(this.f13451p), Integer.valueOf(this.f13452q), Float.valueOf(this.f13453r)});
    }

    public static final class Builder {

        /* renamed from: a */
        @Nullable
        public CharSequence f13454a;

        /* renamed from: b */
        @Nullable
        public Bitmap f13455b;

        /* renamed from: c */
        @Nullable
        public Layout.Alignment f13456c;

        /* renamed from: d */
        @Nullable
        public Layout.Alignment f13457d;

        /* renamed from: e */
        public float f13458e;

        /* renamed from: f */
        public int f13459f;

        /* renamed from: g */
        public int f13460g;

        /* renamed from: h */
        public float f13461h;

        /* renamed from: i */
        public int f13462i;

        /* renamed from: j */
        public int f13463j;

        /* renamed from: k */
        public float f13464k;

        /* renamed from: l */
        public float f13465l;

        /* renamed from: m */
        public float f13466m;

        /* renamed from: n */
        public boolean f13467n;

        /* renamed from: o */
        @ColorInt
        public int f13468o;

        /* renamed from: p */
        public int f13469p;

        /* renamed from: q */
        public float f13470q;

        public Builder() {
            this.f13454a = null;
            this.f13455b = null;
            this.f13456c = null;
            this.f13457d = null;
            this.f13458e = -3.4028235E38f;
            this.f13459f = Integer.MIN_VALUE;
            this.f13460g = Integer.MIN_VALUE;
            this.f13461h = -3.4028235E38f;
            this.f13462i = Integer.MIN_VALUE;
            this.f13463j = Integer.MIN_VALUE;
            this.f13464k = -3.4028235E38f;
            this.f13465l = -3.4028235E38f;
            this.f13466m = -3.4028235E38f;
            this.f13467n = false;
            this.f13468o = -16777216;
            this.f13469p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public Cue m7178a() {
            return new Cue(this.f13454a, this.f13456c, this.f13457d, this.f13455b, this.f13458e, this.f13459f, this.f13460g, this.f13461h, this.f13462i, this.f13463j, this.f13464k, this.f13465l, this.f13466m, this.f13467n, this.f13468o, this.f13469p, this.f13470q, null);
        }

        public Builder(Cue cue, C11251 c11251) {
            this.f13454a = cue.f13437b;
            this.f13455b = cue.f13440e;
            this.f13456c = cue.f13438c;
            this.f13457d = cue.f13439d;
            this.f13458e = cue.f13441f;
            this.f13459f = cue.f13442g;
            this.f13460g = cue.f13443h;
            this.f13461h = cue.f13444i;
            this.f13462i = cue.f13445j;
            this.f13463j = cue.f13450o;
            this.f13464k = cue.f13451p;
            this.f13465l = cue.f13446k;
            this.f13466m = cue.f13447l;
            this.f13467n = cue.f13448m;
            this.f13468o = cue.f13449n;
            this.f13469p = cue.f13452q;
            this.f13470q = cue.f13453r;
        }
    }
}
