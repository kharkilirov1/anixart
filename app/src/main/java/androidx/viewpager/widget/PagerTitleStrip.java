package androidx.viewpager.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: b */
    public ViewPager f6512b;

    /* renamed from: c */
    public int f6513c;

    /* renamed from: d */
    public float f6514d;

    /* renamed from: e */
    public int f6515e;

    /* renamed from: f */
    public boolean f6516f;

    /* renamed from: g */
    public WeakReference<PagerAdapter> f6517g;

    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        public int f6518a;

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        /* renamed from: a */
        public void mo4342a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: b */
        public void mo4343b(int i2) {
            if (this.f6518a == 0) {
                throw null;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
            throw null;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
            this.f6518a = i2;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            throw null;
        }
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {

        /* renamed from: b */
        public Locale f6519b;

        public SingleLineAllCapsTransform(Context context) {
            this.f6519b = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f6519b);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    /* renamed from: a */
    public void m4340a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.f6504a.unregisterObserver(null);
            this.f6517g = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.f6504a.registerObserver(null);
            this.f6517g = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.f6512b;
        if (viewPager == null) {
            return;
        }
        this.f6513c = -1;
        this.f6514d = -1.0f;
        m4341b(viewPager.getCurrentItem(), pagerAdapter2);
        throw null;
    }

    /* renamed from: b */
    public void m4341b(int i2, PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter.mo4336c();
        }
        this.f6516f = true;
        if (i2 >= 1 && pagerAdapter != null) {
            pagerAdapter.mo4338e(i2 - 1);
        }
        throw null;
    }

    /* renamed from: c */
    public void mo4339c(int i2, float f2, boolean z) {
        if (i2 != this.f6513c) {
            m4341b(i2, this.f6512b.getAdapter());
            throw null;
        }
        if (z) {
            throw null;
        }
        if (f2 != this.f6514d) {
            throw null;
        }
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f6515e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.f6544U = null;
        if (viewPager.f6545V == null) {
            viewPager.f6545V = new ArrayList();
        }
        viewPager.f6545V.add(null);
        this.f6512b = viewPager;
        WeakReference<PagerAdapter> weakReference = this.f6517g;
        m4340a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f6512b;
        if (viewPager != null) {
            m4340a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f6512b;
            ViewPager.OnPageChangeListener onPageChangeListener = viewPager2.f6544U;
            viewPager2.f6544U = null;
            List<ViewPager.OnAdapterChangeListener> list = viewPager2.f6545V;
            if (list != null) {
                list.remove((Object) null);
            }
            this.f6512b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f6512b != null) {
            float f2 = this.f6514d;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            mo4339c(this.f6513c, f2, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), -2);
        ViewGroup.getChildMeasureSpec(i2, (int) (View.MeasureSpec.getSize(i2) * 0.2f), -2);
        throw null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f6516f) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i2) {
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange float f2) {
        throw null;
    }

    public void setTextColor(@ColorInt int i2) {
        throw null;
    }

    public void setTextSpacing(int i2) {
        this.f6515e = i2;
        requestLayout();
    }
}
