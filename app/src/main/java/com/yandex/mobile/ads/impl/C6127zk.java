package com.yandex.mobile.ads.impl;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zk */
/* loaded from: classes3.dex */
public final class C6127zk {

    /* renamed from: j */
    private static final Pattern f57210j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f57211k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f57212l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f57213m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final /* synthetic */ int f57214n = 0;

    /* renamed from: a */
    @NotNull
    private final String f57215a;

    /* renamed from: b */
    @NotNull
    private final String f57216b;

    /* renamed from: c */
    private final long f57217c;

    /* renamed from: d */
    @NotNull
    private final String f57218d;

    /* renamed from: e */
    @NotNull
    private final String f57219e;

    /* renamed from: f */
    private final boolean f57220f;

    /* renamed from: g */
    private final boolean f57221g;

    /* renamed from: h */
    private final boolean f57222h;

    /* renamed from: i */
    private final boolean f57223i;

    private C6127zk(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f57215a = str;
        this.f57216b = str2;
        this.f57217c = j2;
        this.f57218d = str3;
        this.f57219e = str4;
        this.f57220f = z;
        this.f57221g = z2;
        this.f57222h = z3;
        this.f57223i = z4;
    }

    public /* synthetic */ C6127zk(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this(str, str2, j2, str3, str4, z, z2, z3, z4);
    }

    @JvmName
    @NotNull
    /* renamed from: e */
    public final String m30202e() {
        return this.f57215a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C6127zk) {
            C6127zk c6127zk = (C6127zk) obj;
            if (Intrinsics.m32174c(c6127zk.f57215a, this.f57215a) && Intrinsics.m32174c(c6127zk.f57216b, this.f57216b) && c6127zk.f57217c == this.f57217c && Intrinsics.m32174c(c6127zk.f57218d, this.f57218d) && Intrinsics.m32174c(c6127zk.f57219e, this.f57219e) && c6127zk.f57220f == this.f57220f && c6127zk.f57221g == this.f57221g && c6127zk.f57222h == this.f57222h && c6127zk.f57223i == this.f57223i) {
                return true;
            }
        }
        return false;
    }

    @JvmName
    @NotNull
    /* renamed from: f */
    public final String m30203f() {
        return this.f57216b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int m26984a = o11.m26984a(this.f57216b, o11.m26984a(this.f57215a, 527, 31), 31);
        long j2 = this.f57217c;
        return (this.f57223i ? 1231 : 1237) + (((this.f57222h ? 1231 : 1237) + (((this.f57221g ? 1231 : 1237) + (((this.f57220f ? 1231 : 1237) + o11.m26984a(this.f57219e, o11.m26984a(this.f57218d, (((int) (j2 ^ (j2 >>> 32))) + m26984a) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57215a);
        sb.append('=');
        sb.append(this.f57216b);
        if (this.f57222h) {
            if (this.f57217c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C5348km.m26164a(new Date(this.f57217c)));
            }
        }
        if (!this.f57223i) {
            sb.append("; domain=");
            sb.append(this.f57218d);
        }
        sb.append("; path=");
        sb.append(this.f57219e);
        if (this.f57220f) {
            sb.append("; secure");
        }
        if (this.f57221g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "toString()");
        return sb2;
    }

    /* renamed from: com.yandex.mobile.ads.impl.zk$a */
    public static final class a {
        /* renamed from: a */
        private static long m30205a(int i2, String str) {
            int m30204a = m30204a(0, i2, str, false);
            Matcher matcher = C6127zk.f57213m.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (m30204a < i2) {
                int m30204a2 = m30204a(m30204a + 1, i2, str, true);
                matcher.region(m30204a, m30204a2);
                if (i4 == -1 && matcher.usePattern(C6127zk.f57213m).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.m32178g(group, "matcher.group(1)");
                    i4 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.m32178g(group2, "matcher.group(2)");
                    i7 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.m32178g(group3, "matcher.group(3)");
                    i8 = Integer.parseInt(group3);
                } else if (i5 == -1 && matcher.usePattern(C6127zk.f57212l).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.m32178g(group4, "matcher.group(1)");
                    i5 = Integer.parseInt(group4);
                } else if (i6 == -1 && matcher.usePattern(C6127zk.f57211k).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.m32178g(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.m32178g(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    Intrinsics.m32178g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = C6127zk.f57211k.pattern();
                    Intrinsics.m32178g(pattern, "MONTH_PATTERN.pattern()");
                    i6 = StringsKt.m33878D(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i3 == -1 && matcher.usePattern(C6127zk.f57210j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.m32178g(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
                m30204a = m30204a(m30204a2 + 1, i2, str, false);
            }
            if (70 <= i3 && i3 < 100) {
                i3 += 1900;
            }
            if (i3 >= 0 && i3 < 70) {
                i3 += 2000;
            }
            if (!(i3 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i6 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i5 && i5 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i4 >= 0 && i4 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && i7 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i8 >= 0 && i8 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(t91.f54982d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x003d, code lost:
        
            if (r0 != ':') goto L33;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int m30204a(int r4, int r5, java.lang.String r6, boolean r7) {
            /*
            L0:
                if (r4 >= r5) goto L48
                char r0 = r6.charAt(r4)
                r1 = 32
                r2 = 0
                r3 = 1
                if (r0 >= r1) goto L10
                r1 = 9
                if (r0 != r1) goto L3f
            L10:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L3f
                r1 = 57
                if (r0 > r1) goto L1e
                r1 = 48
                if (r1 > r0) goto L1e
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                r1 = 122(0x7a, float:1.71E-43)
                if (r0 > r1) goto L2b
                r1 = 97
                if (r1 > r0) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 0
            L2c:
                if (r1 != 0) goto L3f
                r1 = 90
                if (r0 > r1) goto L38
                r1 = 65
                if (r1 > r0) goto L38
                r1 = 1
                goto L39
            L38:
                r1 = 0
            L39:
                if (r1 != 0) goto L3f
                r1 = 58
                if (r0 != r1) goto L40
            L3f:
                r2 = 1
            L40:
                r0 = r7 ^ 1
                if (r2 != r0) goto L45
                return r4
            L45:
                int r4 = r4 + 1
                goto L0
            L48:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6127zk.a.m30204a(int, int, java.lang.String, boolean):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x01aa, code lost:
        
            if (r9 == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x01a6, code lost:
        
            if (com.yandex.mobile.ads.impl.t91.m28514a(r0) == false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
        
            if (r21 <= 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01c2, code lost:
        
            if (com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase.C4711a.m22087a().m22086a(r5) == null) goto L6;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List m30206a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.t00 r36, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C5204hy r37) {
            /*
                Method dump skipped, instructions count: 558
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6127zk.a.m30206a(com.yandex.mobile.ads.impl.t00, com.yandex.mobile.ads.impl.hy):java.util.List");
        }
    }
}
