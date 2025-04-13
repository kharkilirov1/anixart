package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import androidx.room.util.C0576a;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.widgets.ImageUtilsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientFixedCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivSolidBackground;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DivBackgroundBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder;", "", "DivBackgroundState", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public class DivBackgroundBinder {

    /* renamed from: a */
    @NotNull
    public final DivImageLoader f31864a;

    /* compiled from: DivBackgroundBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "", "Image", "LinearGradient", "NinePatch", "RadialGradient", "Solid", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class DivBackgroundState {

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "Filter", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Image extends DivBackgroundState {

            /* renamed from: a */
            public final double f31865a;

            /* renamed from: b */
            @NotNull
            public final DivAlignmentHorizontal f31866b;

            /* renamed from: c */
            @NotNull
            public final DivAlignmentVertical f31867c;

            /* renamed from: d */
            @NotNull
            public final Uri f31868d;

            /* renamed from: e */
            public final boolean f31869e;

            /* renamed from: f */
            @NotNull
            public final DivImageScale f31870f;

            /* renamed from: g */
            @Nullable
            public final List<Filter> f31871g;

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "", "Blur", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static abstract class Filter {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter$Blur;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Image$Filter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final /* data */ class Blur extends Filter {

                    /* renamed from: a */
                    public final int f31872a;

                    /* renamed from: b */
                    @NotNull
                    public final DivFilter.Blur f31873b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Blur(int i2, @NotNull DivFilter.Blur div) {
                        super(null);
                        Intrinsics.m32179h(div, "div");
                        this.f31872a = i2;
                        this.f31873b = div;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) obj;
                        return this.f31872a == blur.f31872a && Intrinsics.m32174c(this.f31873b, blur.f31873b);
                    }

                    public int hashCode() {
                        return this.f31873b.hashCode() + (this.f31872a * 31);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder m24u = C0000a.m24u("Blur(radius=");
                        m24u.append(this.f31872a);
                        m24u.append(", div=");
                        m24u.append(this.f31873b);
                        m24u.append(')');
                        return m24u.toString();
                    }
                }

                public Filter() {
                }

                public Filter(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d, @NotNull DivAlignmentHorizontal contentAlignmentHorizontal, @NotNull DivAlignmentVertical contentAlignmentVertical, @NotNull Uri imageUrl, boolean z, @NotNull DivImageScale scale, @Nullable List<? extends Filter> list) {
                super(null);
                Intrinsics.m32179h(contentAlignmentHorizontal, "contentAlignmentHorizontal");
                Intrinsics.m32179h(contentAlignmentVertical, "contentAlignmentVertical");
                Intrinsics.m32179h(imageUrl, "imageUrl");
                Intrinsics.m32179h(scale, "scale");
                this.f31865a = d;
                this.f31866b = contentAlignmentHorizontal;
                this.f31867c = contentAlignmentVertical;
                this.f31868d = imageUrl;
                this.f31869e = z;
                this.f31870f = scale;
                this.f31871g = list;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Intrinsics.m32174c(Double.valueOf(this.f31865a), Double.valueOf(image.f31865a)) && this.f31866b == image.f31866b && this.f31867c == image.f31867c && Intrinsics.m32174c(this.f31868d, image.f31868d) && this.f31869e == image.f31869e && this.f31870f == image.f31870f && Intrinsics.m32174c(this.f31871g, image.f31871g);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                long doubleToLongBits = Double.doubleToLongBits(this.f31865a);
                int hashCode = (this.f31868d.hashCode() + ((this.f31867c.hashCode() + ((this.f31866b.hashCode() + (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31)) * 31)) * 31)) * 31;
                boolean z = this.f31869e;
                int i2 = z;
                if (z != 0) {
                    i2 = 1;
                }
                int hashCode2 = (this.f31870f.hashCode() + ((hashCode + i2) * 31)) * 31;
                List<Filter> list = this.f31871g;
                return hashCode2 + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Image(alpha=");
                m24u.append(this.f31865a);
                m24u.append(", contentAlignmentHorizontal=");
                m24u.append(this.f31866b);
                m24u.append(", contentAlignmentVertical=");
                m24u.append(this.f31867c);
                m24u.append(", imageUrl=");
                m24u.append(this.f31868d);
                m24u.append(", preloadRequired=");
                m24u.append(this.f31869e);
                m24u.append(", scale=");
                m24u.append(this.f31870f);
                m24u.append(", filters=");
                return C0576a.m4119r(m24u, this.f31871g, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$LinearGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class LinearGradient extends DivBackgroundState {

            /* renamed from: a */
            public final int f31880a;

            /* renamed from: b */
            @NotNull
            public final List<Integer> f31881b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LinearGradient(int i2, @NotNull List<Integer> colors) {
                super(null);
                Intrinsics.m32179h(colors, "colors");
                this.f31880a = i2;
                this.f31881b = colors;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) obj;
                return this.f31880a == linearGradient.f31880a && Intrinsics.m32174c(this.f31881b, linearGradient.f31881b);
            }

            public int hashCode() {
                return this.f31881b.hashCode() + (this.f31880a * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("LinearGradient(angle=");
                m24u.append(this.f31880a);
                m24u.append(", colors=");
                return C0576a.m4119r(m24u, this.f31881b, ')');
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$NinePatch;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class NinePatch extends DivBackgroundState {

            /* renamed from: a */
            @NotNull
            public final Uri f31882a;

            /* renamed from: b */
            @NotNull
            public final Rect f31883b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NinePatch(@NotNull Uri imageUrl, @NotNull Rect rect) {
                super(null);
                Intrinsics.m32179h(imageUrl, "imageUrl");
                this.f31882a = imageUrl;
                this.f31883b = rect;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) obj;
                return Intrinsics.m32174c(this.f31882a, ninePatch.f31882a) && Intrinsics.m32174c(this.f31883b, ninePatch.f31883b);
            }

            public int hashCode() {
                return this.f31883b.hashCode() + (this.f31882a.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("NinePatch(imageUrl=");
                m24u.append(this.f31882a);
                m24u.append(", insets=");
                m24u.append(this.f31883b);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "Center", "Radius", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class RadialGradient extends DivBackgroundState {

            /* renamed from: a */
            @NotNull
            public final Center f31886a;

            /* renamed from: b */
            @NotNull
            public final Center f31887b;

            /* renamed from: c */
            @NotNull
            public final List<Integer> f31888c;

            /* renamed from: d */
            @NotNull
            public final Radius f31889d;

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static abstract class Center {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final /* data */ class Fixed extends Center {

                    /* renamed from: a */
                    public final float f31890a;

                    public Fixed(float f2) {
                        super(null);
                        this.f31890a = f2;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Intrinsics.m32174c(Float.valueOf(this.f31890a), Float.valueOf(((Fixed) obj).f31890a));
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.f31890a);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder m24u = C0000a.m24u("Fixed(valuePx=");
                        m24u.append(this.f31890a);
                        m24u.append(')');
                        return m24u.toString();
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Center;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final /* data */ class Relative extends Center {

                    /* renamed from: a */
                    public final float f31891a;

                    public Relative(float f2) {
                        super(null);
                        this.f31891a = f2;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && Intrinsics.m32174c(Float.valueOf(this.f31891a), Float.valueOf(((Relative) obj).f31891a));
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.f31891a);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder m24u = C0000a.m24u("Relative(value=");
                        m24u.append(this.f31891a);
                        m24u.append(')');
                        return m24u.toString();
                    }
                }

                public Center() {
                }

                @NotNull
                /* renamed from: a */
                public final RadialGradientDrawable.Center m16979a() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).f31890a);
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).f31891a);
                    }
                    throw new NoWhenBranchMatchedException();
                }

                public Center(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            /* compiled from: DivBackgroundBinder.kt */
            @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "", "Fixed", "Relative", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
            public static abstract class Radius {

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Fixed;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final /* data */ class Fixed extends Radius {

                    /* renamed from: a */
                    public final float f31892a;

                    public Fixed(float f2) {
                        super(null);
                        this.f31892a = f2;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Intrinsics.m32174c(Float.valueOf(this.f31892a), Float.valueOf(((Fixed) obj).f31892a));
                    }

                    public int hashCode() {
                        return Float.floatToIntBits(this.f31892a);
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder m24u = C0000a.m24u("Fixed(valuePx=");
                        m24u.append(this.f31892a);
                        m24u.append(')');
                        return m24u.toString();
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius$Relative;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$RadialGradient$Radius;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
                public static final /* data */ class Relative extends Radius {

                    /* renamed from: a */
                    @NotNull
                    public final DivRadialGradientRelativeRadius.Value f31893a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Relative(@NotNull DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        Intrinsics.m32179h(value, "value");
                        this.f31893a = value;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && this.f31893a == ((Relative) obj).f31893a;
                    }

                    public int hashCode() {
                        return this.f31893a.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        StringBuilder m24u = C0000a.m24u("Relative(value=");
                        m24u.append(this.f31893a);
                        m24u.append(')');
                        return m24u.toString();
                    }
                }

                /* compiled from: DivBackgroundBinder.kt */
                @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        DivRadialGradientRelativeRadius.Value value = DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER;
                        iArr[1] = 1;
                        DivRadialGradientRelativeRadius.Value value2 = DivRadialGradientRelativeRadius.Value.NEAREST_CORNER;
                        iArr[0] = 2;
                        DivRadialGradientRelativeRadius.Value value3 = DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE;
                        iArr[3] = 3;
                        DivRadialGradientRelativeRadius.Value value4 = DivRadialGradientRelativeRadius.Value.NEAREST_SIDE;
                        iArr[2] = 4;
                    }
                }

                public Radius() {
                }

                public Radius(DefaultConstructorMarker defaultConstructorMarker) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RadialGradient(@NotNull Center center, @NotNull Center center2, @NotNull List<Integer> colors, @NotNull Radius radius) {
                super(null);
                Intrinsics.m32179h(colors, "colors");
                this.f31886a = center;
                this.f31887b = center2;
                this.f31888c = colors;
                this.f31889d = radius;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) obj;
                return Intrinsics.m32174c(this.f31886a, radialGradient.f31886a) && Intrinsics.m32174c(this.f31887b, radialGradient.f31887b) && Intrinsics.m32174c(this.f31888c, radialGradient.f31888c) && Intrinsics.m32174c(this.f31889d, radialGradient.f31889d);
            }

            public int hashCode() {
                return this.f31889d.hashCode() + ((this.f31888c.hashCode() + ((this.f31887b.hashCode() + (this.f31886a.hashCode() * 31)) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("RadialGradient(centerX=");
                m24u.append(this.f31886a);
                m24u.append(", centerY=");
                m24u.append(this.f31887b);
                m24u.append(", colors=");
                m24u.append(this.f31888c);
                m24u.append(", radius=");
                m24u.append(this.f31889d);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: DivBackgroundBinder.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState$Solid;", "Lcom/yandex/div/core/view2/divs/DivBackgroundBinder$DivBackgroundState;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Solid extends DivBackgroundState {

            /* renamed from: a */
            public final int f31894a;

            public Solid(int i2) {
                super(null);
                this.f31894a = i2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solid) && this.f31894a == ((Solid) obj).f31894a;
            }

            /* renamed from: hashCode, reason: from getter */
            public int getF31894a() {
                return this.f31894a;
            }

            @NotNull
            public String toString() {
                return C0000a.m17n(C0000a.m24u("Solid(color="), this.f31894a, ')');
            }
        }

        public DivBackgroundState() {
        }

        public DivBackgroundState(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Inject
    public DivBackgroundBinder(@NotNull DivImageLoader imageLoader) {
        Intrinsics.m32179h(imageLoader, "imageLoader");
        this.f31864a = imageLoader;
    }

    /* renamed from: a */
    public static final DivBackgroundState m16974a(DivBackgroundBinder divBackgroundBinder, DivBackground divBackground, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        ArrayList arrayList;
        DivBackgroundState.RadialGradient.Radius relative;
        Objects.requireNonNull(divBackgroundBinder);
        if (divBackground instanceof DivBackground.LinearGradient) {
            DivBackground.LinearGradient linearGradient = (DivBackground.LinearGradient) divBackground;
            long longValue = linearGradient.f34754c.f37694a.mo17535b(expressionResolver).longValue();
            long j2 = longValue >> 31;
            return new DivBackgroundState.LinearGradient((j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE, linearGradient.f34754c.f37695b.mo17531a(expressionResolver));
        }
        if (divBackground instanceof DivBackground.RadialGradient) {
            DivBackground.RadialGradient radialGradient = (DivBackground.RadialGradient) divBackground;
            DivBackgroundState.RadialGradient.Center m16978e = divBackgroundBinder.m16978e(radialGradient.f34756c.f38083a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center m16978e2 = divBackgroundBinder.m16978e(radialGradient.f34756c.f38084b, displayMetrics, expressionResolver);
            List<Integer> mo17531a = radialGradient.f34756c.f38085c.mo17531a(expressionResolver);
            DivRadialGradientRadius divRadialGradientRadius = radialGradient.f34756c.f38086d;
            if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
                relative = new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.m16938a0(((DivRadialGradientRadius.FixedSize) divRadialGradientRadius).f38119c, displayMetrics, expressionResolver));
            } else {
                if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                relative = new DivBackgroundState.RadialGradient.Radius.Relative(((DivRadialGradientRadius.Relative) divRadialGradientRadius).f38120c.f38136a.mo17535b(expressionResolver));
            }
            return new DivBackgroundState.RadialGradient(m16978e, m16978e2, mo17531a, relative);
        }
        if (divBackground instanceof DivBackground.Image) {
            DivBackground.Image image = (DivBackground.Image) divBackground;
            double doubleValue = image.f34753c.f36759a.mo17535b(expressionResolver).doubleValue();
            DivAlignmentHorizontal mo17535b = image.f34753c.f36760b.mo17535b(expressionResolver);
            DivAlignmentVertical mo17535b2 = image.f34753c.f36761c.mo17535b(expressionResolver);
            Uri mo17535b3 = image.f34753c.f36763e.mo17535b(expressionResolver);
            boolean booleanValue = image.f34753c.f36764f.mo17535b(expressionResolver).booleanValue();
            DivImageScale mo17535b4 = image.f34753c.f36765g.mo17535b(expressionResolver);
            List<DivFilter> list = image.f34753c.f36762d;
            if (list == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
                for (DivFilter divFilter : list) {
                    if (!(divFilter instanceof DivFilter.Blur)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivFilter.Blur blur = (DivFilter.Blur) divFilter;
                    long longValue2 = blur.f35719c.f34778a.mo17535b(expressionResolver).longValue();
                    long j3 = longValue2 >> 31;
                    arrayList2.add(new DivBackgroundState.Image.Filter.Blur((j3 == 0 || j3 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE, blur));
                }
                arrayList = arrayList2;
            }
            return new DivBackgroundState.Image(doubleValue, mo17535b, mo17535b2, mo17535b3, booleanValue, mo17535b4, arrayList);
        }
        if (divBackground instanceof DivBackground.Solid) {
            return new DivBackgroundState.Solid(((DivBackground.Solid) divBackground).f34757c.f39186a.mo17535b(expressionResolver).intValue());
        }
        if (!(divBackground instanceof DivBackground.NinePatch)) {
            throw new NoWhenBranchMatchedException();
        }
        DivBackground.NinePatch ninePatch = (DivBackground.NinePatch) divBackground;
        Uri mo17535b5 = ninePatch.f34755c.f37728a.mo17535b(expressionResolver);
        long longValue3 = ninePatch.f34755c.f37729b.f34448b.mo17535b(expressionResolver).longValue();
        long j4 = longValue3 >> 31;
        int i2 = (j4 == 0 || j4 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue4 = ninePatch.f34755c.f37729b.f34450d.mo17535b(expressionResolver).longValue();
        long j5 = longValue4 >> 31;
        int i3 = (j5 == 0 || j5 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue5 = ninePatch.f34755c.f37729b.f34449c.mo17535b(expressionResolver).longValue();
        long j6 = longValue5 >> 31;
        int i4 = (j6 == 0 || j6 == -1) ? (int) longValue5 : longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        long longValue6 = ninePatch.f34755c.f37729b.f34447a.mo17535b(expressionResolver).longValue();
        long j7 = longValue6 >> 31;
        return new DivBackgroundState.NinePatch(mo17535b5, new Rect(i2, i3, i4, (j7 == 0 || j7 == -1) ? (int) longValue6 : longValue6 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.yandex.div.internal.drawable.ScalingDrawable] */
    /* renamed from: b */
    public static final Drawable m16975b(DivBackgroundBinder divBackgroundBinder, List list, final View target, final Div2View divView, Drawable drawable, final ExpressionResolver resolver) {
        Iterator it;
        RadialGradientDrawable.Radius relative;
        RadialGradientDrawable.Radius.Relative.Type type;
        Object obj;
        final ?? r15;
        Objects.requireNonNull(divBackgroundBinder);
        if (drawable != null) {
            drawable.mutate();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DivBackgroundState divBackgroundState = (DivBackgroundState) it2.next();
            DivImageLoader imageLoader = divBackgroundBinder.f31864a;
            Objects.requireNonNull(divBackgroundState);
            Intrinsics.m32179h(divView, "divView");
            Intrinsics.m32179h(target, "target");
            Intrinsics.m32179h(imageLoader, "imageLoader");
            Intrinsics.m32179h(resolver, "resolver");
            if (divBackgroundState instanceof DivBackgroundState.Image) {
                final DivBackgroundState.Image image = (DivBackgroundState.Image) divBackgroundState;
                r15 = new ScalingDrawable();
                String uri = image.f31868d.toString();
                Intrinsics.m32178g(uri, "imageUrl.toString()");
                it = it2;
                LoadReference loadImage = imageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(target, image, resolver, r15) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1

                    /* renamed from: b */
                    public final /* synthetic */ View f31875b;

                    /* renamed from: c */
                    public final /* synthetic */ DivBackgroundBinder.DivBackgroundState.Image f31876c;

                    /* renamed from: d */
                    public final /* synthetic */ ExpressionResolver f31877d;

                    /* renamed from: e */
                    public final /* synthetic */ ScalingDrawable f31878e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(Div2View.this);
                        this.f31875b = target;
                        this.f31876c = image;
                        this.f31877d = resolver;
                        this.f31878e = r15;
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    /* renamed from: b */
                    public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
                        ArrayList arrayList2;
                        Bitmap bitmap = cachedBitmap.f31288a;
                        Intrinsics.m32178g(bitmap, "cachedBitmap.bitmap");
                        View view = this.f31875b;
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> list2 = this.f31876c.f31871g;
                        if (list2 == null) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList(CollectionsKt.m32032m(list2, 10));
                            for (DivBackgroundBinder.DivBackgroundState.Image.Filter filter : list2) {
                                Objects.requireNonNull(filter);
                                if (!(filter instanceof DivBackgroundBinder.DivBackgroundState.Image.Filter.Blur)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList2.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter.Blur) filter).f31873b);
                            }
                        }
                        Div2Component div2Component = Div2View.this.getDiv2Component();
                        ExpressionResolver expressionResolver = this.f31877d;
                        final ScalingDrawable scalingDrawable = this.f31878e;
                        ImageUtilsKt.m17106a(bitmap, view, arrayList2, div2Component, expressionResolver, new Function1<Bitmap, Unit>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public Unit invoke(Bitmap bitmap2) {
                                Bitmap it3 = bitmap2;
                                Intrinsics.m32179h(it3, "it");
                                ScalingDrawable scalingDrawable2 = ScalingDrawable.this;
                                Objects.requireNonNull(scalingDrawable2);
                                scalingDrawable2.f33802d = it3;
                                scalingDrawable2.f33805g = true;
                                scalingDrawable2.invalidateSelf();
                                return Unit.f63088a;
                            }
                        });
                        this.f31878e.setAlpha((int) (this.f31876c.f31865a * KotlinVersion.MAX_COMPONENT_VALUE));
                        ScalingDrawable scalingDrawable2 = this.f31878e;
                        DivImageScale divImageScale = this.f31876c.f31870f;
                        Intrinsics.m32179h(divImageScale, "<this>");
                        int ordinal = divImageScale.ordinal();
                        ScalingDrawable.ScaleType scaleType = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL;
                        Objects.requireNonNull(scalingDrawable2);
                        scalingDrawable2.f33799a = scaleType;
                        ScalingDrawable scalingDrawable3 = this.f31878e;
                        DivAlignmentHorizontal divAlignmentHorizontal = this.f31876c.f31866b;
                        Intrinsics.m32179h(divAlignmentHorizontal, "<this>");
                        int ordinal2 = divAlignmentHorizontal.ordinal();
                        ScalingDrawable.AlignmentHorizontal alignmentHorizontal = ordinal2 != 1 ? ordinal2 != 2 ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.CENTER;
                        Objects.requireNonNull(scalingDrawable3);
                        scalingDrawable3.f33800b = alignmentHorizontal;
                        ScalingDrawable scalingDrawable4 = this.f31878e;
                        DivAlignmentVertical divAlignmentVertical = this.f31876c.f31867c;
                        Intrinsics.m32179h(divAlignmentVertical, "<this>");
                        int ordinal3 = divAlignmentVertical.ordinal();
                        ScalingDrawable.AlignmentVertical alignmentVertical = ordinal3 != 1 ? ordinal3 != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER;
                        Objects.requireNonNull(scalingDrawable4);
                        scalingDrawable4.f33801c = alignmentVertical;
                    }
                });
                Intrinsics.m32178g(loadImage, "fun getDivImageBackgroun…aleDrawable\n            }");
                divView.m16811l(loadImage, target);
            } else {
                it = it2;
                if (divBackgroundState instanceof DivBackgroundState.NinePatch) {
                    final DivBackgroundState.NinePatch ninePatch = (DivBackgroundState.NinePatch) divBackgroundState;
                    final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                    String uri2 = ninePatch.f31882a.toString();
                    Intrinsics.m32178g(uri2, "imageUrl.toString()");
                    LoadReference loadImage2 = imageLoader.loadImage(uri2, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                        @Override // com.yandex.div.core.images.DivImageDownloadCallback
                        @UiThread
                        /* renamed from: b */
                        public void mo16591b(@NotNull CachedBitmap cachedBitmap) {
                            NinePatch ninePatch2;
                            NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                            DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch3 = ninePatch;
                            ninePatchDrawable2.f33755a = ninePatch3.f31883b.bottom;
                            ninePatchDrawable2.invalidateSelf();
                            ninePatchDrawable2.f33756b = ninePatch3.f31883b.left;
                            ninePatchDrawable2.invalidateSelf();
                            ninePatchDrawable2.f33757c = ninePatch3.f31883b.right;
                            ninePatchDrawable2.invalidateSelf();
                            ninePatchDrawable2.f33758d = ninePatch3.f31883b.top;
                            ninePatchDrawable2.invalidateSelf();
                            Bitmap bitmap = cachedBitmap.f31288a;
                            if (bitmap == null) {
                                ninePatch2 = null;
                            } else {
                                int width = bitmap.getWidth();
                                int height = bitmap.getHeight();
                                int i2 = ninePatchDrawable2.f33755a;
                                int i3 = ninePatchDrawable2.f33756b;
                                int i4 = ninePatchDrawable2.f33757c;
                                int i5 = ninePatchDrawable2.f33758d;
                                int i6 = height - i2;
                                ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                                order.put((byte) 1);
                                order.put((byte) 2);
                                order.put((byte) 2);
                                order.put((byte) 9);
                                int i7 = 0;
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                C2052a.m12289x(order, 0, 0, 0, 0);
                                C2052a.m12289x(order, i3, width - i4, i5, i6);
                                while (i7 < 9) {
                                    i7++;
                                    order.putInt(1);
                                }
                                byte[] array = order.array();
                                Intrinsics.m32178g(array, "allocate(allocationSize)…   }\n            .array()");
                                ninePatch2 = new NinePatch(bitmap, array);
                            }
                            ninePatchDrawable2.f33759e = ninePatch2;
                            ninePatchDrawable2.invalidateSelf();
                        }
                    });
                    Intrinsics.m32178g(loadImage2, "fun getNinePatchDrawable…tchDrawable\n            }");
                    divView.m16811l(loadImage2, target);
                    obj = ninePatchDrawable;
                } else if (divBackgroundState instanceof DivBackgroundState.Solid) {
                    obj = new ColorDrawable(((DivBackgroundState.Solid) divBackgroundState).f31894a);
                } else if (divBackgroundState instanceof DivBackgroundState.LinearGradient) {
                    obj = new LinearGradientDrawable(r0.f31880a, CollectionsKt.m32025i0(((DivBackgroundState.LinearGradient) divBackgroundState).f31881b));
                } else {
                    if (!(divBackgroundState instanceof DivBackgroundState.RadialGradient)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivBackgroundState.RadialGradient radialGradient = (DivBackgroundState.RadialGradient) divBackgroundState;
                    DivBackgroundState.RadialGradient.Radius radius = radialGradient.f31889d;
                    Objects.requireNonNull(radius);
                    if (radius instanceof DivBackgroundState.RadialGradient.Radius.Fixed) {
                        relative = new RadialGradientDrawable.Radius.Fixed(((DivBackgroundState.RadialGradient.Radius.Fixed) radius).f31892a);
                    } else {
                        if (!(radius instanceof DivBackgroundState.RadialGradient.Radius.Relative)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int ordinal = ((DivBackgroundState.RadialGradient.Radius.Relative) radius).f31893a.ordinal();
                        if (ordinal == 0) {
                            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                        } else if (ordinal == 1) {
                            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                        } else if (ordinal == 2) {
                            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                        } else {
                            if (ordinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                        }
                        relative = new RadialGradientDrawable.Radius.Relative(type);
                    }
                    obj = new RadialGradientDrawable(relative, radialGradient.f31886a.m16979a(), radialGradient.f31887b.m16979a(), CollectionsKt.m32025i0(radialGradient.f31888c));
                }
                r15 = obj;
            }
            Drawable mutate = r15.mutate();
            if (mutate != null) {
                arrayList.add(mutate);
            }
            it2 = it;
        }
        List m32031l0 = CollectionsKt.m32031l0(arrayList);
        if (drawable != null) {
            ((ArrayList) m32031l0).add(drawable);
        }
        ArrayList arrayList2 = (ArrayList) m32031l0;
        if (!(!arrayList2.isEmpty())) {
            return null;
        }
        Object[] array = arrayList2.toArray(new Drawable[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new LayerDrawable((Drawable[]) array);
    }

    /* renamed from: c */
    public static final void m16976c(DivBackgroundBinder divBackgroundBinder, View view, Drawable drawable) {
        boolean z;
        Objects.requireNonNull(divBackgroundBinder);
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(C2507R.drawable.native_animation_background) : null) != null) {
            Drawable m1671d = ContextCompat.m1671d(view.getContext(), C2507R.drawable.native_animation_background);
            if (m1671d != null) {
                arrayList.add(m1671d);
            }
            z = true;
        } else {
            z = false;
        }
        Object[] array = arrayList.toArray(new Drawable[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        view.setBackground(new LayerDrawable((Drawable[]) array));
        if (z) {
            Drawable background2 = view.getBackground();
            Objects.requireNonNull(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            Objects.requireNonNull(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, C2507R.drawable.native_animation_background);
        }
    }

    /* renamed from: d */
    public final void m16977d(List<? extends DivBackground> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, Function1<Object, Unit> function1) {
        JSONSerializable jSONSerializable;
        if (list == null) {
            return;
        }
        for (DivBackground divBackground : list) {
            Objects.requireNonNull(divBackground);
            if (divBackground instanceof DivBackground.LinearGradient) {
                jSONSerializable = ((DivBackground.LinearGradient) divBackground).f34754c;
            } else if (divBackground instanceof DivBackground.RadialGradient) {
                jSONSerializable = ((DivBackground.RadialGradient) divBackground).f34756c;
            } else if (divBackground instanceof DivBackground.Image) {
                jSONSerializable = ((DivBackground.Image) divBackground).f34753c;
            } else if (divBackground instanceof DivBackground.Solid) {
                jSONSerializable = ((DivBackground.Solid) divBackground).f34757c;
            } else {
                if (!(divBackground instanceof DivBackground.NinePatch)) {
                    throw new NoWhenBranchMatchedException();
                }
                jSONSerializable = ((DivBackground.NinePatch) divBackground).f34755c;
            }
            if (jSONSerializable instanceof DivSolidBackground) {
                expressionSubscriber.mo16763e(((DivSolidBackground) jSONSerializable).f39186a.mo17537e(expressionResolver, function1));
            } else if (jSONSerializable instanceof DivLinearGradient) {
                DivLinearGradient divLinearGradient = (DivLinearGradient) jSONSerializable;
                expressionSubscriber.mo16763e(divLinearGradient.f37694a.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divLinearGradient.f37695b.mo17532b(expressionResolver, function1));
            } else if (jSONSerializable instanceof DivRadialGradient) {
                DivRadialGradient divRadialGradient = (DivRadialGradient) jSONSerializable;
                BaseDivViewExtensionsKt.m16919I(divRadialGradient.f38083a, expressionResolver, expressionSubscriber, function1);
                BaseDivViewExtensionsKt.m16919I(divRadialGradient.f38084b, expressionResolver, expressionSubscriber, function1);
                BaseDivViewExtensionsKt.m16920J(divRadialGradient.f38086d, expressionResolver, expressionSubscriber, function1);
                expressionSubscriber.mo16763e(divRadialGradient.f38085c.mo17532b(expressionResolver, function1));
            } else if (jSONSerializable instanceof DivImageBackground) {
                DivImageBackground divImageBackground = (DivImageBackground) jSONSerializable;
                expressionSubscriber.mo16763e(divImageBackground.f36759a.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divImageBackground.f36763e.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divImageBackground.f36760b.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divImageBackground.f36761c.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divImageBackground.f36764f.mo17537e(expressionResolver, function1));
                expressionSubscriber.mo16763e(divImageBackground.f36765g.mo17537e(expressionResolver, function1));
                List<DivFilter> list2 = divImageBackground.f36762d;
                if (list2 == null) {
                    list2 = EmptyList.f63144b;
                }
                for (DivFilter divFilter : list2) {
                    if (divFilter instanceof DivFilter.Blur) {
                        expressionSubscriber.mo16763e(((DivFilter.Blur) divFilter).f35719c.f34778a.mo17537e(expressionResolver, function1));
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final DivBackgroundState.RadialGradient.Center m16978e(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics metrics, ExpressionResolver resolver) {
        if (!(divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed)) {
            if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
                return new DivBackgroundState.RadialGradient.Center.Relative((float) ((DivRadialGradientCenter.Relative) divRadialGradientCenter).f38092c.f38127a.mo17535b(resolver).doubleValue());
            }
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientFixedCenter divRadialGradientFixedCenter = ((DivRadialGradientCenter.Fixed) divRadialGradientCenter).f38091c;
        Intrinsics.m32179h(divRadialGradientFixedCenter, "<this>");
        Intrinsics.m32179h(metrics, "metrics");
        Intrinsics.m32179h(resolver, "resolver");
        return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.m16966z(divRadialGradientFixedCenter.f38102b.mo17535b(resolver).longValue(), divRadialGradientFixedCenter.f38101a.mo17535b(resolver), metrics));
    }
}
