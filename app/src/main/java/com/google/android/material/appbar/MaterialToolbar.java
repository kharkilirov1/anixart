package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: S */
    @Nullable
    public Integer f17454S;

    /* renamed from: T */
    public boolean f17455T;

    /* renamed from: U */
    public boolean f17456U;

    /* renamed from: V */
    @Nullable
    public ImageView.ScaleType f17457V;

    /* renamed from: W */
    @Nullable
    public Boolean f17458W;

    static {
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.FIT_XY;
        ImageView.ScaleType scaleType3 = ImageView.ScaleType.FIT_START;
        ImageView.ScaleType scaleType4 = ImageView.ScaleType.FIT_CENTER;
        ImageView.ScaleType scaleType5 = ImageView.ScaleType.FIT_END;
        ImageView.ScaleType scaleType6 = ImageView.ScaleType.CENTER;
        ImageView.ScaleType scaleType7 = ImageView.ScaleType.CENTER_CROP;
        ImageView.ScaleType scaleType8 = ImageView.ScaleType.CENTER_INSIDE;
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f17457V;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f17454S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeUtils.m10309c(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f17455T || this.f17456U) {
            List<TextView> m10161a = ToolbarUtils.m10161a(this, getTitle());
            TextView textView = ((ArrayList) m10161a).isEmpty() ? null : (TextView) Collections.min(m10161a, ToolbarUtils.f18361a);
            List<TextView> m10161a2 = ToolbarUtils.m10161a(this, getSubtitle());
            TextView textView2 = ((ArrayList) m10161a2).isEmpty() ? null : (TextView) Collections.max(m10161a2, ToolbarUtils.f18361a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f17455T && textView != null) {
                    m9794x(textView, pair);
                }
                if (this.f17456U && textView2 != null) {
                    m9794x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f17458W;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f17457V;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f2) {
        super.setElevation(f2);
        MaterialShapeUtils.m10308b(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f17458W;
        if (bool == null || bool.booleanValue() != z) {
            this.f17458W = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f17457V != scaleType) {
            this.f17457V = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f17454S != null) {
            drawable = DrawableCompat.m1845q(drawable.mutate());
            DrawableCompat.m1841m(drawable, this.f17454S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i2) {
        this.f17454S = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f17456U != z) {
            this.f17456U = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f17455T != z) {
            this.f17455T = z;
            requestLayout();
        }
    }

    /* renamed from: x */
    public final void m9794x(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }
}
