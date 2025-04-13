package com.swiftsoft.anixartd.utils.p016ui.snowfall;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snowflake.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/Snowflake;", "", "Params", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Snowflake {

    /* renamed from: a */
    @NotNull
    public final Randomizer f30576a;

    /* renamed from: b */
    @NotNull
    public final Params f30577b;

    /* renamed from: c */
    public int f30578c;

    /* renamed from: e */
    @Nullable
    public Bitmap f30580e;

    /* renamed from: f */
    public double f30581f;

    /* renamed from: g */
    public double f30582g;

    /* renamed from: h */
    public double f30583h;

    /* renamed from: i */
    public double f30584i;

    /* renamed from: j */
    @Nullable
    public Paint f30585j;

    /* renamed from: l */
    public boolean f30587l;

    /* renamed from: d */
    public int f30579d = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: k */
    public boolean f30586k = true;

    /* compiled from: Snowflake.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/ui/snowfall/Snowflake$Params;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Params {

        /* renamed from: a */
        public final int f30588a;

        /* renamed from: b */
        public final int f30589b;

        /* renamed from: c */
        @Nullable
        public final Bitmap f30590c;

        /* renamed from: d */
        public final int f30591d;

        /* renamed from: e */
        public final int f30592e;

        /* renamed from: f */
        public final int f30593f;

        /* renamed from: g */
        public final int f30594g;

        /* renamed from: h */
        public final int f30595h;

        /* renamed from: i */
        public final int f30596i;

        /* renamed from: j */
        public final float f30597j;

        /* renamed from: k */
        public final float f30598k;

        /* renamed from: l */
        public final boolean f30599l;

        /* renamed from: m */
        public final boolean f30600m;

        /* renamed from: n */
        public final boolean f30601n;

        public Params(int i2, int i3, @Nullable Bitmap bitmap, int i4, int i5, int i6, int i7, int i8, int i9, float f2, float f3, boolean z, boolean z2, boolean z3) {
            this.f30588a = i2;
            this.f30589b = i3;
            this.f30590c = bitmap;
            this.f30591d = i4;
            this.f30592e = i5;
            this.f30593f = i6;
            this.f30594g = i7;
            this.f30595h = i8;
            this.f30596i = i9;
            this.f30597j = f2;
            this.f30598k = f3;
            this.f30599l = z;
            this.f30600m = z2;
            this.f30601n = z3;
        }
    }

    public Snowflake(@NotNull Randomizer randomizer, @NotNull Params params) {
        this.f30576a = randomizer;
        this.f30577b = params;
        m16481d(null);
    }

    /* renamed from: a */
    public final void m16478a(@NotNull Canvas canvas) {
        Bitmap bitmap = this.f30580e;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (float) this.f30583h, (float) this.f30584i, m16479b());
        } else {
            canvas.drawCircle((float) this.f30583h, (float) this.f30584i, this.f30578c, m16479b());
        }
    }

    /* renamed from: b */
    public final Paint m16479b() {
        if (this.f30585j == null) {
            Paint paint = new Paint(1);
            paint.setColor(this.f30577b.f30591d);
            paint.setStyle(Paint.Style.FILL);
            this.f30585j = paint;
        }
        Paint paint2 = this.f30585j;
        Intrinsics.m32176e(paint2);
        return paint2;
    }

    /* renamed from: c */
    public final boolean m16480c() {
        if (!this.f30586k) {
            double d = this.f30584i;
            if (d <= 0.0d || d >= this.f30577b.f30589b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m16481d(@Nullable Double d) {
        Params params = this.f30577b;
        this.f30586k = params.f30601n;
        int m16474c = this.f30576a.m16474c(params.f30595h, params.f30596i, true);
        this.f30578c = m16474c;
        Bitmap bitmap = this.f30577b.f30590c;
        if (bitmap != null) {
            this.f30580e = Bitmap.createScaledBitmap(bitmap, m16474c, m16474c, false);
        }
        int i2 = this.f30578c;
        Params params2 = this.f30577b;
        int i3 = params2.f30595h;
        float f2 = (i2 - i3) / (params2.f30596i - i3);
        float f3 = params2.f30598k;
        float f4 = params2.f30597j;
        float f5 = ((f3 - f4) * f2) + f4;
        double radians = Math.toRadians(this.f30576a.m16472a(params2.f30594g) * (this.f30576a.f30558a.nextBoolean() ? 1 : -1));
        double d2 = f5;
        this.f30581f = Math.sin(radians) * d2;
        this.f30582g = Math.cos(radians) * d2;
        Randomizer randomizer = this.f30576a;
        Params params3 = this.f30577b;
        this.f30579d = randomizer.m16474c(params3.f30592e, params3.f30593f, false);
        m16479b().setAlpha(this.f30579d);
        this.f30583h = this.f30576a.m16472a(this.f30577b.f30588a);
        if (d != null) {
            this.f30584i = d.doubleValue();
            return;
        }
        double m16472a = this.f30576a.m16472a(this.f30577b.f30589b);
        this.f30584i = m16472a;
        if (this.f30577b.f30600m) {
            return;
        }
        this.f30584i = (m16472a - r8.f30589b) - this.f30578c;
    }
}
