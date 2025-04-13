package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class SsaStyle {

    /* renamed from: a */
    public final String f13689a;

    /* renamed from: b */
    public final int f13690b;

    /* renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f13691c;

    /* renamed from: d */
    public final float f13692d;

    /* renamed from: e */
    public final boolean f13693e;

    /* renamed from: f */
    public final boolean f13694f;

    /* renamed from: g */
    public final boolean f13695g;

    /* renamed from: h */
    public final boolean f13696h;

    public static final class Format {

        /* renamed from: a */
        public final int f13697a;

        /* renamed from: b */
        public final int f13698b;

        /* renamed from: c */
        public final int f13699c;

        /* renamed from: d */
        public final int f13700d;

        /* renamed from: e */
        public final int f13701e;

        /* renamed from: f */
        public final int f13702f;

        /* renamed from: g */
        public final int f13703g;

        /* renamed from: h */
        public final int f13704h;

        /* renamed from: i */
        public final int f13705i;

        public Format(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f13697a = i2;
            this.f13698b = i3;
            this.f13699c = i4;
            this.f13700d = i5;
            this.f13701e = i6;
            this.f13702f = i7;
            this.f13703g = i8;
            this.f13704h = i9;
            this.f13705i = i10;
        }
    }

    public static final class Overrides {

        /* renamed from: a */
        public static final Pattern f13706a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b */
        public static final Pattern f13707b = Pattern.compile(Util.m7747p("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c */
        public static final Pattern f13708c = Pattern.compile(Util.m7747p("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d */
        public static final Pattern f13709d = Pattern.compile("\\\\an(\\d+)");

        @Nullable
        /* renamed from: a */
        public static PointF m7239a(String str) {
            String group;
            String group2;
            Matcher matcher = f13707b.matcher(str);
            Matcher matcher2 = f13708c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb = new StringBuilder(str.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            Objects.requireNonNull(group);
            float parseFloat = Float.parseFloat(group.trim());
            Objects.requireNonNull(group2);
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    public SsaStyle(String str, int i2, @Nullable @ColorInt Integer num, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13689a = str;
        this.f13690b = i2;
        this.f13691c = num;
        this.f13692d = f2;
        this.f13693e = z;
        this.f13694f = z2;
        this.f13695g = z3;
        this.f13696h = z4;
    }

    /* renamed from: a */
    public static int m7236a(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        Log.w("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    /* renamed from: b */
    public static boolean m7237b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            com.google.android.exoplayer2.util.Log.m7588e("SsaStyle", C0576a.m4115n(C0576a.m4106e(str, 33), "Failed to parse boolean value: '", str, "'"), e2);
            return false;
        }
    }

    @Nullable
    @ColorInt
    /* renamed from: c */
    public static Integer m7238c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.m7513a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.m12080b(((parseLong >> 24) & 255) ^ 255), Ints.m12080b(parseLong & 255), Ints.m12080b((parseLong >> 8) & 255), Ints.m12080b((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            com.google.android.exoplayer2.util.Log.m7588e("SsaStyle", C0576a.m4115n(C0576a.m4106e(str, 36), "Failed to parse color expression: '", str, "'"), e2);
            return null;
        }
    }
}
