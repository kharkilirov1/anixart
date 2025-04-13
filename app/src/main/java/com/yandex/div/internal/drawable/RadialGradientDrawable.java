package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: RadialGradientDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Center", "Companion", "Radius", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RadialGradientDrawable extends Drawable {

    /* renamed from: g */
    @NotNull
    public static final Companion f33761g = new Companion(null);

    /* renamed from: a */
    @NotNull
    public Radius f33762a;

    /* renamed from: b */
    @NotNull
    public Center f33763b;

    /* renamed from: c */
    @NotNull
    public Center f33764c;

    /* renamed from: d */
    @NotNull
    public int[] f33765d;

    /* renamed from: e */
    @NotNull
    public final Paint f33766e = new Paint();

    /* renamed from: f */
    @NotNull
    public RectF f33767f = new RectF();

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "", "Fixed", "Relative", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Fixed;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class Center {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Fixed extends Center {

            /* renamed from: a */
            public final float f33768a;

            public Fixed(float f2) {
                super(null);
                this.f33768a = f2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Intrinsics.m32174c(Float.valueOf(this.f33768a), Float.valueOf(((Fixed) obj).f33768a));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f33768a);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Fixed(value=");
                m24u.append(this.f33768a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Center;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Relative extends Center {

            /* renamed from: a */
            public final float f33769a;

            public Relative(float f2) {
                super(null);
                this.f33769a = f2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Intrinsics.m32174c(Float.valueOf(this.f33769a), Float.valueOf(((Relative) obj).f33769a));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f33769a);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Relative(value=");
                m24u.append(this.f33769a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        public Center() {
        }

        public Center(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\nX\u008a\u0084\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Companion;", "", "", "MIN_GRADIENT_RADIUS", "F", "", "distancesToCorners", "distancesToSides", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
            }
        }

        public Companion() {
        }

        /* renamed from: a */
        public static final float m17305a(float f2, float f3, float f4, float f5) {
            double d = 2;
            return (float) Math.sqrt(((float) Math.pow(f2 - f4, d)) + ((float) Math.pow(f3 - f5, d)));
        }

        /* renamed from: c */
        public static final float m17306c(Center center, int i2) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).f33768a;
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).f33769a * i2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        /* renamed from: b */
        public final RadialGradient m17307b(@NotNull Radius radius, @NotNull Center centerX, @NotNull Center centerY, @NotNull int[] colors, int i2, int i3) {
            float floatValue;
            Intrinsics.m32179h(radius, "radius");
            Intrinsics.m32179h(centerX, "centerX");
            Intrinsics.m32179h(centerY, "centerY");
            Intrinsics.m32179h(colors, "colors");
            final float m17306c = m17306c(centerX, i2);
            final float m17306c2 = m17306c(centerY, i3);
            final float f2 = i2;
            final float f3 = i3;
            final float f4 = 0.0f;
            final float f5 = 0.0f;
            Lazy m31881b = LazyKt.m31881b(new Function0<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.m17305a(m17306c, m17306c2, f4, f5)), Float.valueOf(RadialGradientDrawable.Companion.m17305a(m17306c, m17306c2, f2, f5)), Float.valueOf(RadialGradientDrawable.Companion.m17305a(m17306c, m17306c2, f2, f3)), Float.valueOf(RadialGradientDrawable.Companion.m17305a(m17306c, m17306c2, f4, f3))};
                }
            });
            final float f6 = 0.0f;
            Lazy m31881b2 = LazyKt.m31881b(new Function0<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Float[] invoke() {
                    return new Float[]{Float.valueOf(Math.abs(m17306c - f4)), Float.valueOf(Math.abs(m17306c - f2)), Float.valueOf(Math.abs(m17306c2 - f3)), Float.valueOf(Math.abs(m17306c2 - f6))};
                }
            });
            if (radius instanceof Radius.Fixed) {
                floatValue = ((Radius.Fixed) radius).f33782a;
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                int ordinal = ((Radius.Relative) radius).f33783a.ordinal();
                if (ordinal == 0) {
                    Float m31946V = ArraysKt.m31946V((Float[]) m31881b.getValue());
                    Intrinsics.m32176e(m31946V);
                    floatValue = m31946V.floatValue();
                } else if (ordinal == 1) {
                    Float m31945U = ArraysKt.m31945U((Float[]) m31881b.getValue());
                    Intrinsics.m32176e(m31945U);
                    floatValue = m31945U.floatValue();
                } else if (ordinal == 2) {
                    Float m31946V2 = ArraysKt.m31946V((Float[]) m31881b2.getValue());
                    Intrinsics.m32176e(m31946V2);
                    floatValue = m31946V2.floatValue();
                } else {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Float m31945U2 = ArraysKt.m31945U((Float[]) m31881b2.getValue());
                    Intrinsics.m32176e(m31945U2);
                    floatValue = m31945U2.floatValue();
                }
            }
            return new RadialGradient(m17306c, m17306c2, floatValue > 0.0f ? floatValue : 0.01f, colors, (float[]) null, Shader.TileMode.CLAMP);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: RadialGradientDrawable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "", "Fixed", "Relative", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Fixed;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class Radius {

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Fixed;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Fixed extends Radius {

            /* renamed from: a */
            public final float f33782a;

            public Fixed(float f2) {
                super(null);
                this.f33782a = f2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Intrinsics.m32174c(Float.valueOf(this.f33782a), Float.valueOf(((Fixed) obj).f33782a));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f33782a);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Fixed(value=");
                m24u.append(this.f33782a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: RadialGradientDrawable.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative;", "Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius;", "Type", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Relative extends Radius {

            /* renamed from: a */
            @NotNull
            public final Type f33783a;

            /* compiled from: RadialGradientDrawable.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/drawable/RadialGradientDrawable$Radius$Relative$Type;", "", "NEAREST_CORNER", "FARTHEST_CORNER", "NEAREST_SIDE", "FARTHEST_SIDE", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(@NotNull Type type) {
                super(null);
                this.f33783a = type;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.f33783a == ((Relative) obj).f33783a;
            }

            public int hashCode() {
                return this.f33783a.hashCode();
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Relative(type=");
                m24u.append(this.f33783a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        public Radius() {
        }

        public Radius(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public RadialGradientDrawable(@NotNull Radius radius, @NotNull Center center, @NotNull Center center2, @NotNull int[] iArr) {
        this.f33762a = radius;
        this.f33763b = center;
        this.f33764c = center2;
        this.f33765d = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        canvas.drawRect(this.f33767f, this.f33766e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33766e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.m32179h(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f33766e.setShader(f33761g.m17307b(this.f33762a, this.f33763b, this.f33764c, this.f33765d, bounds.width(), bounds.height()));
        this.f33767f.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f33766e.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
