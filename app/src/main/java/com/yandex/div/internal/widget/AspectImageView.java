package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import com.yandex.div.C2806R;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AspectImageView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m31884d2 = {"Lcom/yandex/div/internal/widget/AspectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/yandex/div/core/widget/AspectView;", "Landroid/widget/ImageView$ScaleType;", "scaleType", "", "setScaleType", "", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "getGravity", "()I", "setGravity", "(I)V", "gravity", "", "f", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "g", "getImageScale", "()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "setImageScale", "(Lcom/yandex/div/internal/widget/AspectImageView$Scale;)V", "imageScale", "Scale", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {

    /* renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f33940j = {Reflection.m32195c(new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0)), Reflection.m32195c(new MutablePropertyReference1Impl(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), Reflection.m32195c(new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty gravity;

    /* renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty aspectRatio;

    /* renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ReadWriteProperty imageScale;

    /* renamed from: h */
    @NotNull
    public final Matrix f33944h;

    /* renamed from: i */
    public boolean f33945i;

    /* compiled from: AspectImageView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "", "NO_SCALE", "FIT", "FILL", "STRETCH", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: AspectImageView.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33951a;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f33951a = iArr;
        }
    }

    @JvmOverloads
    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.gravity = ViewsKt.m17186a(0, null, 2);
        this.aspectRatio = ViewsKt.m17187b(Float.valueOf(0.0f), new Function1<Float, Float>() { // from class: com.yandex.div.internal.widget.AspectImageView$aspectRatio$2
            @Override // kotlin.jvm.functions.Function1
            public Float invoke(Float f2) {
                return Float.valueOf(RangesKt.m32234a(f2.floatValue(), 0.0f));
            }
        });
        this.imageScale = ViewsKt.m17188c(Scale.NO_SCALE, null, 2);
        this.f33944h = new Matrix();
        this.f33945i = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2806R.styleable.f30860a, i2, 0);
            Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
            try {
                setGravity(obtainStyledAttributes.getInt(0, 0));
                setAspectRatio(obtainStyledAttributes.getFloat(2, 0.0f));
                setImageScale(Scale.values()[obtainStyledAttributes.getInteger(3, 0)]);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: g */
    public boolean mo17101g(int i2) {
        return View.MeasureSpec.getMode(i2) != 1073741824;
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, f33940j[1])).floatValue();
    }

    public final int getGravity() {
        return ((Number) this.gravity.getValue(this, f33940j[0])).intValue();
    }

    @NotNull
    public final Scale getImageScale() {
        return (Scale) this.imageScale.getValue(this, f33940j[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.f33945i = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f2;
        Intrinsics.m32179h(canvas, "canvas");
        if ((getImageMatrix() == null || Intrinsics.m32174c(getImageMatrix(), this.f33944h)) && this.f33945i && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                float paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (height - getPaddingTop()) - getPaddingBottom();
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(getGravity(), ViewCompat.m2231w(this));
                int ordinal = getImageScale().ordinal();
                if (ordinal == 0) {
                    f2 = 1.0f;
                } else if (ordinal == 1) {
                    f2 = Math.min(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else if (ordinal == 2) {
                    f2 = Math.max(paddingLeft / intrinsicWidth, paddingTop / intrinsicHeight);
                } else {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = paddingLeft / intrinsicWidth;
                }
                float f3 = WhenMappings.f33951a[getImageScale().ordinal()] == 4 ? paddingTop / intrinsicHeight : f2;
                int i2 = absoluteGravity & 7;
                float f4 = 0.0f;
                float f5 = i2 != 1 ? i2 != 5 ? 0.0f : paddingLeft - (intrinsicWidth * f2) : (paddingLeft - (intrinsicWidth * f2)) / 2;
                int i3 = absoluteGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                if (i3 == 16) {
                    f4 = (paddingTop - (intrinsicHeight * f3)) / 2;
                } else if (i3 == 80) {
                    f4 = paddingTop - (intrinsicHeight * f3);
                }
                Matrix matrix = this.f33944h;
                matrix.reset();
                matrix.postScale(f2, f3);
                matrix.postTranslate(f5, f4);
                setImageMatrix(this.f33944h);
            }
            this.f33945i = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f33945i = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        boolean mo17101g = mo17101g(i2);
        boolean z = View.MeasureSpec.getMode(i3) != 1073741824;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!mo17101g && !z) {
            measuredHeight = MathKt.m32223c(measuredWidth / aspectRatio);
        } else if (!mo17101g && z) {
            measuredHeight = MathKt.m32223c(measuredWidth / aspectRatio);
        } else if (mo17101g && !z) {
            measuredWidth = MathKt.m32223c(measuredHeight * aspectRatio);
        } else if (mo17101g && z) {
            measuredHeight = MathKt.m32223c(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f33945i = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f2) {
        this.aspectRatio.setValue(this, f33940j[1], Float.valueOf(f2));
    }

    public final void setGravity(int i2) {
        this.gravity.setValue(this, f33940j[0], Integer.valueOf(i2));
    }

    public final void setImageScale(@NotNull Scale scale) {
        Intrinsics.m32179h(scale, "<set-?>");
        this.imageScale.setValue(this, f33940j[2], scale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }
}
