package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.impl.n11;
import com.yandex.mobile.ads.impl.tg1;

/* renamed from: com.yandex.mobile.ads.nativeads.template.a */
/* loaded from: classes3.dex */
abstract class AbstractC6242a {

    /* renamed from: a */
    public final float f57852a;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$a */
    public static class a extends AbstractC6242a {
        public a(float f2) {
            super(f2);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final float mo30675a(float f2) {
            if (f2 < 10.0f) {
                return 10.0f;
            }
            return f2;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final d mo30676a(Context context, int i2, int i3, int i4) {
            float f2 = this.f57852a;
            int i5 = tg1.f55120b;
            int min = Math.min(Math.round(TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics())), i2);
            return new d(min, Math.round(i4 * (min / i3)));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$b */
    public static class b extends AbstractC6242a {
        public b(float f2) {
            super(f2);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final float mo30675a(float f2) {
            if (f2 < 0.01f) {
                return 0.01f;
            }
            if (f2 > 1.0f) {
                return 1.0f;
            }
            return f2;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final d mo30676a(Context context, int i2, int i3, int i4) {
            int round = Math.round(i2 * this.f57852a);
            return new d(round, Math.round(i4 * (round / i3)));
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$c */
    public static class c extends AbstractC6242a {
        public c(float f2) {
            super(f2);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final float mo30675a(float f2) {
            if (f2 < 0.01f) {
                return 0.01f;
            }
            if (f2 > 1.0f) {
                return 1.0f;
            }
            return f2;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.AbstractC6242a
        /* renamed from: a */
        public final d mo30676a(Context context, int i2, int i3, int i4) {
            int i5 = tg1.f55120b;
            int m26789a = n11.m26789a(context, 1, 140.0f);
            int round = Math.round(i2 * this.f57852a);
            if (i3 > round) {
                i4 = Math.round(i4 / (i3 / round));
                i3 = round;
            }
            if (i4 > m26789a) {
                i3 = Math.round(i3 / (i4 / m26789a));
            } else {
                m26789a = i4;
            }
            return new d(i3, m26789a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$d */
    public static class d {

        /* renamed from: a */
        private final int f57853a;

        /* renamed from: b */
        private final int f57854b;

        public d(int i2, int i3) {
            this.f57853a = i2;
            this.f57854b = i3;
        }

        /* renamed from: a */
        public final int m30677a() {
            return this.f57854b;
        }

        /* renamed from: b */
        public final int m30678b() {
            return this.f57853a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f57853a == dVar.f57853a && this.f57854b == dVar.f57854b;
        }

        public final int hashCode() {
            return (this.f57853a * 31) + this.f57854b;
        }
    }

    public AbstractC6242a(float f2) {
        this.f57852a = mo30675a(f2);
    }

    /* renamed from: a */
    public abstract float mo30675a(float f2);

    /* renamed from: a */
    public abstract d mo30676a(Context context, int i2, int i3, int i4);
}
