package com.google.android.exoplayer2.p009ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: b */
    public final AspectRatioUpdateDispatcher f14064b;

    /* renamed from: c */
    @Nullable
    public AspectRatioListener f14065c;

    /* renamed from: d */
    public float f14066d;

    /* renamed from: e */
    public int f14067e;

    public interface AspectRatioListener {
        /* renamed from: a */
        void m7343a(float f2, float f3, boolean z);
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {

        /* renamed from: b */
        public float f14068b;

        /* renamed from: c */
        public float f14069c;

        /* renamed from: d */
        public boolean f14070d;

        /* renamed from: e */
        public boolean f14071e;

        public AspectRatioUpdateDispatcher(C11371 c11371) {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14071e = false;
            AspectRatioListener aspectRatioListener = AspectRatioFrameLayout.this.f14065c;
            if (aspectRatioListener == null) {
                return;
            }
            aspectRatioListener.m7343a(this.f14068b, this.f14069c, this.f14070d);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14067e = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1140R.styleable.f14215a, 0, 0);
            try {
                this.f14067e = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14064b = new AspectRatioUpdateDispatcher(null);
    }

    public int getResizeMode() {
        return this.f14067e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.f14066d <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = f4 / f5;
        float f7 = (this.f14066d / f6) - 1.0f;
        if (Math.abs(f7) <= 0.01f) {
            AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher = this.f14064b;
            aspectRatioUpdateDispatcher.f14068b = this.f14066d;
            aspectRatioUpdateDispatcher.f14069c = f6;
            aspectRatioUpdateDispatcher.f14070d = false;
            if (aspectRatioUpdateDispatcher.f14071e) {
                return;
            }
            aspectRatioUpdateDispatcher.f14071e = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher);
            return;
        }
        int i4 = this.f14067e;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f2 = this.f14066d;
                } else if (i4 == 4) {
                    if (f7 > 0.0f) {
                        f2 = this.f14066d;
                    } else {
                        f3 = this.f14066d;
                    }
                }
                measuredWidth = (int) (f5 * f2);
            } else {
                f3 = this.f14066d;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f7 > 0.0f) {
            f3 = this.f14066d;
            measuredHeight = (int) (f4 / f3);
        } else {
            f2 = this.f14066d;
            measuredWidth = (int) (f5 * f2);
        }
        AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher2 = this.f14064b;
        aspectRatioUpdateDispatcher2.f14068b = this.f14066d;
        aspectRatioUpdateDispatcher2.f14069c = f6;
        aspectRatioUpdateDispatcher2.f14070d = true;
        if (!aspectRatioUpdateDispatcher2.f14071e) {
            aspectRatioUpdateDispatcher2.f14071e = true;
            AspectRatioFrameLayout.this.post(aspectRatioUpdateDispatcher2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f2) {
        if (this.f14066d != f2) {
            this.f14066d = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.f14065c = aspectRatioListener;
    }

    public void setResizeMode(int i2) {
        if (this.f14067e != i2) {
            this.f14067e = i2;
            requestLayout();
        }
    }
}
