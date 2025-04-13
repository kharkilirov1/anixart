package com.yandex.div.internal.widget.indicator;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: IndicatorParams.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams;", "", "Animation", "ItemPlacement", "ItemSize", "Shape", "Style", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IndicatorParams {

    /* compiled from: IndicatorParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Animation;", "", "SCALE", "WORM", "SLIDER", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Animation {
        SCALE,
        WORM,
        SLIDER
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "", "Default", "Stretch", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Default;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Stretch;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
    public interface ItemPlacement {

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Default;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Default implements ItemPlacement {

            /* renamed from: a */
            public final float f34031a;

            public Default(float f2) {
                this.f34031a = f2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Default) && Intrinsics.m32174c(Float.valueOf(this.f34031a), Float.valueOf(((Default) obj).f34031a));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f34031a);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Default(spaceBetweenCenters=");
                m24u.append(this.f34031a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement$Stretch;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemPlacement;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Stretch implements ItemPlacement {

            /* renamed from: a */
            public final float f34032a;

            /* renamed from: b */
            public final int f34033b;

            public Stretch(float f2, int i2) {
                this.f34032a = f2;
                this.f34033b = i2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Stretch)) {
                    return false;
                }
                Stretch stretch = (Stretch) obj;
                return Intrinsics.m32174c(Float.valueOf(this.f34032a), Float.valueOf(stretch.f34032a)) && this.f34033b == stretch.f34033b;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.f34032a) * 31) + this.f34033b;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Stretch(itemSpacing=");
                m24u.append(this.f34032a);
                m24u.append(", maxVisibleItems=");
                return C0000a.m17n(m24u, this.f34033b, ')');
            }
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "", "Circle", "RoundedRect", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class ItemSize {

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Circle extends ItemSize {

            /* renamed from: a */
            public float f34034a;

            public Circle(float f2) {
                super(null);
                this.f34034a = f2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Circle) && Intrinsics.m32174c(Float.valueOf(this.f34034a), Float.valueOf(((Circle) obj).f34034a));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f34034a);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Circle(radius=");
                m24u.append(this.f34034a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$ItemSize;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class RoundedRect extends ItemSize {

            /* renamed from: a */
            public float f34035a;

            /* renamed from: b */
            public float f34036b;

            /* renamed from: c */
            public float f34037c;

            public RoundedRect(float f2, float f3, float f4) {
                super(null);
                this.f34035a = f2;
                this.f34036b = f3;
                this.f34037c = f4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RoundedRect)) {
                    return false;
                }
                RoundedRect roundedRect = (RoundedRect) obj;
                return Intrinsics.m32174c(Float.valueOf(this.f34035a), Float.valueOf(roundedRect.f34035a)) && Intrinsics.m32174c(Float.valueOf(this.f34036b), Float.valueOf(roundedRect.f34036b)) && Intrinsics.m32174c(Float.valueOf(this.f34037c), Float.valueOf(roundedRect.f34037c));
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f34037c) + ((Float.floatToIntBits(this.f34036b) + (Float.floatToIntBits(this.f34035a) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("RoundedRect(itemWidth=");
                m24u.append(this.f34035a);
                m24u.append(", itemHeight=");
                m24u.append(this.f34036b);
                m24u.append(", cornerRadius=");
                m24u.append(this.f34037c);
                m24u.append(')');
                return m24u.toString();
            }
        }

        public ItemSize() {
        }

        /* renamed from: a */
        public final float m17421a() {
            if (this instanceof RoundedRect) {
                return ((RoundedRect) this).f34036b;
            }
            if (this instanceof Circle) {
                return ((Circle) this).f34034a * 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: b */
        public final float m17422b() {
            if (this instanceof RoundedRect) {
                return ((RoundedRect) this).f34035a;
            }
            if (this instanceof Circle) {
                return ((Circle) this).f34034a * 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        public ItemSize(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "", "Circle", "RoundedRect", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$Circle;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class Shape {

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$Circle;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Circle extends Shape {

            /* renamed from: a */
            public final int f34038a;

            /* renamed from: b */
            @NotNull
            public final ItemSize.Circle f34039b;

            public Circle(int i2, @NotNull ItemSize.Circle circle) {
                super(null);
                this.f34038a = i2;
                this.f34039b = circle;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            /* renamed from: a, reason: from getter */
            public int getF34040a() {
                return this.f34038a;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            /* renamed from: b */
            public ItemSize mo17424b() {
                return this.f34039b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Circle)) {
                    return false;
                }
                Circle circle = (Circle) obj;
                return this.f34038a == circle.f34038a && Intrinsics.m32174c(this.f34039b, circle.f34039b);
            }

            public int hashCode() {
                return this.f34039b.hashCode() + (this.f34038a * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Circle(color=");
                m24u.append(this.f34038a);
                m24u.append(", itemSize=");
                m24u.append(this.f34039b);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: IndicatorParams.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape$RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Shape;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class RoundedRect extends Shape {

            /* renamed from: a */
            public final int f34040a;

            /* renamed from: b */
            @NotNull
            public final ItemSize.RoundedRect f34041b;

            /* renamed from: c */
            public final float f34042c;

            /* renamed from: d */
            public final int f34043d;

            public RoundedRect(int i2, @NotNull ItemSize.RoundedRect roundedRect, float f2, int i3) {
                super(null);
                this.f34040a = i2;
                this.f34041b = roundedRect;
                this.f34042c = f2;
                this.f34043d = i3;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            /* renamed from: a, reason: from getter */
            public int getF34040a() {
                return this.f34040a;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            /* renamed from: b */
            public ItemSize mo17424b() {
                return this.f34041b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RoundedRect)) {
                    return false;
                }
                RoundedRect roundedRect = (RoundedRect) obj;
                return this.f34040a == roundedRect.f34040a && Intrinsics.m32174c(this.f34041b, roundedRect.f34041b) && Intrinsics.m32174c(Float.valueOf(this.f34042c), Float.valueOf(roundedRect.f34042c)) && this.f34043d == roundedRect.f34043d;
            }

            public int hashCode() {
                return ((Float.floatToIntBits(this.f34042c) + ((this.f34041b.hashCode() + (this.f34040a * 31)) * 31)) * 31) + this.f34043d;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("RoundedRect(color=");
                m24u.append(this.f34040a);
                m24u.append(", itemSize=");
                m24u.append(this.f34041b);
                m24u.append(", strokeWidth=");
                m24u.append(this.f34042c);
                m24u.append(", strokeColor=");
                return C0000a.m17n(m24u, this.f34043d, ')');
            }
        }

        public Shape() {
        }

        /* renamed from: a */
        public abstract int getF34040a();

        @NotNull
        /* renamed from: b */
        public abstract ItemSize mo17424b();

        public Shape(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: IndicatorParams.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Style {

        /* renamed from: a */
        @NotNull
        public final Animation f34044a;

        /* renamed from: b */
        @NotNull
        public final Shape f34045b;

        /* renamed from: c */
        @NotNull
        public final Shape f34046c;

        /* renamed from: d */
        @NotNull
        public final Shape f34047d;

        /* renamed from: e */
        @NotNull
        public final ItemPlacement f34048e;

        public Style(@NotNull Animation animation, @NotNull Shape shape, @NotNull Shape shape2, @NotNull Shape shape3, @NotNull ItemPlacement itemPlacement) {
            this.f34044a = animation;
            this.f34045b = shape;
            this.f34046c = shape2;
            this.f34047d = shape3;
            this.f34048e = itemPlacement;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return this.f34044a == style.f34044a && Intrinsics.m32174c(this.f34045b, style.f34045b) && Intrinsics.m32174c(this.f34046c, style.f34046c) && Intrinsics.m32174c(this.f34047d, style.f34047d) && Intrinsics.m32174c(this.f34048e, style.f34048e);
        }

        public int hashCode() {
            return this.f34048e.hashCode() + ((this.f34047d.hashCode() + ((this.f34046c.hashCode() + ((this.f34045b.hashCode() + (this.f34044a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Style(animation=");
            m24u.append(this.f34044a);
            m24u.append(", activeShape=");
            m24u.append(this.f34045b);
            m24u.append(", inactiveShape=");
            m24u.append(this.f34046c);
            m24u.append(", minimumShape=");
            m24u.append(this.f34047d);
            m24u.append(", itemsPlacement=");
            m24u.append(this.f34048e);
            m24u.append(')');
            return m24u.toString();
        }
    }
}
