package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yf */
/* loaded from: classes3.dex */
public final class C6074yf {

    /* renamed from: n */
    public static final /* synthetic */ int f56815n = 0;

    /* renamed from: a */
    private final boolean f56816a;

    /* renamed from: b */
    private final boolean f56817b;

    /* renamed from: c */
    private final int f56818c;

    /* renamed from: d */
    private final int f56819d;

    /* renamed from: e */
    private final boolean f56820e;

    /* renamed from: f */
    private final boolean f56821f;

    /* renamed from: g */
    private final boolean f56822g;

    /* renamed from: h */
    private final int f56823h;

    /* renamed from: i */
    private final int f56824i;

    /* renamed from: j */
    private final boolean f56825j;

    /* renamed from: k */
    private final boolean f56826k;

    /* renamed from: l */
    private final boolean f56827l;

    /* renamed from: m */
    @Nullable
    private String f56828m;

    /* renamed from: com.yandex.mobile.ads.impl.yf$a */
    public static final class a {
        @NotNull
        /* renamed from: a */
        public final a m29932a() {
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final a m29933a(@NotNull TimeUnit timeUnit) {
            Intrinsics.m32179h(timeUnit, "timeUnit");
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final a m29934b() {
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.yf$b */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.C6074yf m29935a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C5204hy r31) {
            /*
                Method dump skipped, instructions count: 618
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6074yf.b.m29935a(com.yandex.mobile.ads.impl.hy):com.yandex.mobile.ads.impl.yf");
        }
    }

    static {
        new a().m29932a();
        new a().m29934b().m29933a(TimeUnit.SECONDS);
    }

    private C6074yf(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.f56816a = z;
        this.f56817b = z2;
        this.f56818c = i2;
        this.f56819d = i3;
        this.f56820e = z3;
        this.f56821f = z4;
        this.f56822g = z5;
        this.f56823h = i4;
        this.f56824i = i5;
        this.f56825j = z6;
        this.f56826k = z7;
        this.f56827l = z8;
        this.f56828m = str;
    }

    public /* synthetic */ C6074yf(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, int i6) {
        this(z, z2, i2, i3, z3, z4, z5, i4, i5, z6, z7, z8, str);
    }

    /* renamed from: a */
    public final boolean m29923a() {
        return this.f56820e;
    }

    /* renamed from: b */
    public final boolean m29924b() {
        return this.f56821f;
    }

    @JvmName
    /* renamed from: c */
    public final int m29925c() {
        return this.f56818c;
    }

    @JvmName
    /* renamed from: d */
    public final int m29926d() {
        return this.f56823h;
    }

    @JvmName
    /* renamed from: e */
    public final int m29927e() {
        return this.f56824i;
    }

    @JvmName
    /* renamed from: f */
    public final boolean m29928f() {
        return this.f56822g;
    }

    @JvmName
    /* renamed from: g */
    public final boolean m29929g() {
        return this.f56816a;
    }

    @JvmName
    /* renamed from: h */
    public final boolean m29930h() {
        return this.f56817b;
    }

    @JvmName
    /* renamed from: i */
    public final boolean m29931i() {
        return this.f56825j;
    }

    @NotNull
    public final String toString() {
        String str = this.f56828m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f56816a) {
            sb.append("no-cache, ");
        }
        if (this.f56817b) {
            sb.append("no-store, ");
        }
        if (this.f56818c != -1) {
            sb.append("max-age=");
            sb.append(this.f56818c);
            sb.append(", ");
        }
        if (this.f56819d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f56819d);
            sb.append(", ");
        }
        if (this.f56820e) {
            sb.append("private, ");
        }
        if (this.f56821f) {
            sb.append("public, ");
        }
        if (this.f56822g) {
            sb.append("must-revalidate, ");
        }
        if (this.f56823h != -1) {
            sb.append("max-stale=");
            sb.append(this.f56823h);
            sb.append(", ");
        }
        if (this.f56824i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f56824i);
            sb.append(", ");
        }
        if (this.f56825j) {
            sb.append("only-if-cached, ");
        }
        if (this.f56826k) {
            sb.append("no-transform, ");
        }
        if (this.f56827l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f56828m = sb2;
        return sb2;
    }
}
