package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l2 */
/* loaded from: classes3.dex */
public final class C5372l2 extends qh1 {

    /* renamed from: c */
    public static final /* synthetic */ int f52212c = 0;
    private static final long serialVersionUID = 9076708591501334094L;

    /* renamed from: b */
    private final int f52213b;

    /* renamed from: com.yandex.mobile.ads.impl.l2$a */
    public static final class a {
        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static C5372l2 m26319a(@Nullable km0 km0Var) {
            C5372l2 c5372l2;
            int i2 = km0Var != null ? km0Var.f52032a : -1;
            if (204 == i2) {
                c5372l2 = new C5372l2(km0Var, 6);
            } else {
                Map<String, String> map = km0Var != null ? km0Var.f52034c : null;
                Integer valueOf = km0Var != null ? Integer.valueOf(km0Var.f52032a) : null;
                if ((valueOf == null || 400 != valueOf.intValue() || map == null) ? false : C5150gy.m24997a(map, 48)) {
                    c5372l2 = new C5372l2(km0Var, 12);
                } else if (403 == i2) {
                    c5372l2 = new C5372l2(km0Var, 10);
                } else if (404 == i2) {
                    c5372l2 = new C5372l2(km0Var, 4);
                } else {
                    c5372l2 = 500 <= i2 && i2 < 600 ? new C5372l2(km0Var, 9) : -1 == i2 ? new C5372l2(km0Var, 7) : new C5372l2(km0Var, 8);
                }
            }
            n60.m26810c("Returned server HTTP status code: %d", Integer.valueOf(i2));
            return c5372l2;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public static C5372l2 m26320b(@Nullable km0 km0Var) {
            int i2 = km0Var != null ? km0Var.f52032a : -1;
            int i3 = 500 <= i2 && i2 < 600 ? 9 : -1 == i2 ? 7 : 8;
            n60.m26810c("Returned server HTTP status code: %d", Integer.valueOf(i2));
            return new C5372l2(km0Var, i3);
        }
    }

    public C5372l2(@Nullable km0 km0Var, int i2) {
        super(km0Var);
        this.f52213b = i2;
    }

    /* renamed from: a */
    public final int m26318a() {
        return this.f52213b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Intrinsics.m32174c(C5372l2.class, obj.getClass()) && this.f52213b == ((C5372l2) obj).f52213b;
    }

    public final int hashCode() {
        return this.f52213b;
    }
}
