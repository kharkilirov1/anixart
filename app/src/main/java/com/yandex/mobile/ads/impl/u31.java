package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class u31 {

    /* renamed from: a */
    public final String f55358a;

    /* renamed from: b */
    public final int f55359b;

    /* renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f55360c;

    /* renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f55361d;

    /* renamed from: e */
    public final float f55362e;

    /* renamed from: f */
    public final boolean f55363f;

    /* renamed from: g */
    public final boolean f55364g;

    /* renamed from: h */
    public final boolean f55365h;

    /* renamed from: i */
    public final boolean f55366i;

    /* renamed from: j */
    public final int f55367j;

    /* renamed from: com.yandex.mobile.ads.impl.u31$a */
    public static final class C5839a {

        /* renamed from: a */
        public final int f55368a;

        /* renamed from: b */
        public final int f55369b;

        /* renamed from: c */
        public final int f55370c;

        /* renamed from: d */
        public final int f55371d;

        /* renamed from: e */
        public final int f55372e;

        /* renamed from: f */
        public final int f55373f;

        /* renamed from: g */
        public final int f55374g;

        /* renamed from: h */
        public final int f55375h;

        /* renamed from: i */
        public final int f55376i;

        /* renamed from: j */
        public final int f55377j;

        /* renamed from: k */
        public final int f55378k;

        private C5839a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f55368a = i2;
            this.f55369b = i3;
            this.f55370c = i4;
            this.f55371d = i5;
            this.f55372e = i6;
            this.f55373f = i7;
            this.f55374g = i8;
            this.f55375h = i9;
            this.f55376i = i10;
            this.f55377j = i11;
            this.f55378k = i12;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        /* renamed from: a */
        public static C5839a m28877a(String str) {
            char c2;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < split.length; i12++) {
                String m24832b = C5114ga.m24832b(split[i12].trim());
                Objects.requireNonNull(m24832b);
                switch (m24832b.hashCode()) {
                    case -1178781136:
                        if (m24832b.equals("italic")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1026963764:
                        if (m24832b.equals("underline")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -192095652:
                        if (m24832b.equals("strikeout")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -70925746:
                        if (m24832b.equals("primarycolour")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3029637:
                        if (m24832b.equals("bold")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3373707:
                        if (m24832b.equals("name")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 366554320:
                        if (m24832b.equals("fontsize")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 767321349:
                        if (m24832b.equals("borderstyle")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1767875043:
                        if (m24832b.equals("alignment")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1988365454:
                        if (m24832b.equals("outlinecolour")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i8 = i12;
                        break;
                    case 1:
                        i9 = i12;
                        break;
                    case 2:
                        i10 = i12;
                        break;
                    case 3:
                        i4 = i12;
                        break;
                    case 4:
                        i7 = i12;
                        break;
                    case 5:
                        i2 = i12;
                        break;
                    case 6:
                        i6 = i12;
                        break;
                    case 7:
                        i11 = i12;
                        break;
                    case '\b':
                        i3 = i12;
                        break;
                    case '\t':
                        i5 = i12;
                        break;
                }
            }
            if (i2 != -1) {
                return new C5839a(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, split.length);
            }
            return null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.u31$b */
    public static final class C5840b {

        /* renamed from: c */
        private static final Pattern f55379c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f55380d;

        /* renamed from: e */
        private static final Pattern f55381e;

        /* renamed from: f */
        private static final Pattern f55382f;

        /* renamed from: a */
        public final int f55383a;

        /* renamed from: b */
        @Nullable
        public final PointF f55384b;

        static {
            int i2 = s91.f54530a;
            Locale locale = Locale.US;
            f55380d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f55381e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f55382f = Pattern.compile("\\\\an(\\d+)");
        }

        private C5840b(int i2, @Nullable PointF pointF) {
            this.f55383a = i2;
            this.f55384b = pointF;
        }

        /* renamed from: a */
        public static C5840b m28878a(String str) {
            int i2;
            Matcher matcher = f55379c.matcher(str);
            PointF pointF = null;
            int i3 = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                Objects.requireNonNull(group);
                try {
                    PointF m28879b = m28879b(group);
                    if (m28879b != null) {
                        pointF = m28879b;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f55382f.matcher(group);
                    if (matcher2.find()) {
                        String group2 = matcher2.group(1);
                        Objects.requireNonNull(group2);
                        i2 = u31.m28873a(group2);
                    } else {
                        i2 = -1;
                    }
                    if (i2 != -1) {
                        i3 = i2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new C5840b(i3, pointF);
        }

        @Nullable
        /* renamed from: b */
        private static PointF m28879b(String str) {
            String group;
            String group2;
            Matcher matcher = f55380d.matcher(str);
            Matcher matcher2 = f55381e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    d90.m23841c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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

        /* renamed from: c */
        public static String m28880c(String str) {
            return f55379c.matcher(str).replaceAll("");
        }
    }

    private u31(String str, int i2, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.f55358a = str;
        this.f55359b = i2;
        this.f55360c = num;
        this.f55361d = num2;
        this.f55362e = f2;
        this.f55363f = z;
        this.f55364g = z2;
        this.f55365h = z3;
        this.f55366i = z4;
        this.f55367j = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        if ((r4 == 1 || r4 == 3) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[Catch: RuntimeException -> 0x0162, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4 A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7 A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c A[Catch: RuntimeException -> 0x0162, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[Catch: RuntimeException -> 0x0162, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0162, blocks: (B:7:0x0045, B:9:0x0054, B:11:0x005a, B:16:0x0080, B:18:0x0084, B:19:0x0091, B:21:0x0095, B:22:0x00a2, B:24:0x00a6, B:26:0x00ac, B:27:0x00cd, B:29:0x00d1, B:32:0x00e0, B:34:0x00e4, B:37:0x00f3, B:39:0x00f7, B:42:0x0108, B:44:0x010c, B:47:0x011d, B:49:0x0121, B:51:0x0127, B:58:0x014f, B:57:0x013a, B:72:0x00b3, B:15:0x006b), top: B:6:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0090  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.u31 m28874a(java.lang.String r20, com.yandex.mobile.ads.impl.u31.C5839a r21) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.u31.m28874a(java.lang.String, com.yandex.mobile.ads.impl.u31$a):com.yandex.mobile.ads.impl.u31");
    }

    /* renamed from: b */
    private static boolean m28875b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            d90.m23840b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    @Nullable
    @ColorInt
    /* renamed from: c */
    public static Integer m28876c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C5220ia.m25473a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(w60.m29384a(((parseLong >> 24) & 255) ^ 255), w60.m29384a(parseLong & 255), w60.m29384a((parseLong >> 8) & 255), w60.m29384a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            d90.m23840b("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static int m28873a(String str) {
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
        ai1.m22527a("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }
}
