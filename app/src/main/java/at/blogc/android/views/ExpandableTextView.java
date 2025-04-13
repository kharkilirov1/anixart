package at.blogc.android.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import at.blogc.expandabletextview.C0693R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ExpandableTextView extends TextView {

    /* renamed from: b */
    public final List<OnExpandListener> f6821b;

    /* renamed from: c */
    public TimeInterpolator f6822c;

    /* renamed from: d */
    public TimeInterpolator f6823d;

    /* renamed from: e */
    public final int f6824e;

    /* renamed from: f */
    public long f6825f;

    /* renamed from: g */
    public boolean f6826g;

    /* renamed from: h */
    public boolean f6827h;

    /* renamed from: i */
    public int f6828i;

    public interface OnExpandListener {
        /* renamed from: a */
        void mo4471a(@NonNull ExpandableTextView expandableTextView);

        /* renamed from: b */
        void mo4472b(@NonNull ExpandableTextView expandableTextView);
    }

    public static class SimpleOnExpandListener implements OnExpandListener {
        @Override // at.blogc.android.views.ExpandableTextView.OnExpandListener
        /* renamed from: a */
        public void mo4471a(@NonNull ExpandableTextView expandableTextView) {
        }

        @Override // at.blogc.android.views.ExpandableTextView.OnExpandListener
        /* renamed from: b */
        public void mo4472b(@NonNull ExpandableTextView expandableTextView) {
        }
    }

    public ExpandableTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0693R.styleable.f6833a, 0, 0);
        this.f6825f = obtainStyledAttributes.getInt(0, 750);
        obtainStyledAttributes.recycle();
        this.f6824e = getMaxLines();
        this.f6821b = new ArrayList();
        this.f6822c = new AccelerateDecelerateInterpolator();
        this.f6823d = new AccelerateDecelerateInterpolator();
    }

    /* renamed from: a */
    public boolean m4470a() {
        boolean z = this.f6827h;
        if (z) {
            if (z && !this.f6826g && this.f6824e >= 0) {
                Iterator<OnExpandListener> it = this.f6821b.iterator();
                while (it.hasNext()) {
                    it.next().mo4472b(this);
                }
                int measuredHeight = getMeasuredHeight();
                this.f6826g = true;
                ValueAnimator ofInt = ValueAnimator.ofInt(measuredHeight, this.f6828i);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: at.blogc.android.views.ExpandableTextView.3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ExpandableTextView.this.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                ofInt.addListener(new AnimatorListenerAdapter() { // from class: at.blogc.android.views.ExpandableTextView.4
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ExpandableTextView expandableTextView = ExpandableTextView.this;
                        expandableTextView.f6827h = false;
                        expandableTextView.f6826g = false;
                        expandableTextView.setMaxLines(expandableTextView.f6824e);
                        ViewGroup.LayoutParams layoutParams = ExpandableTextView.this.getLayoutParams();
                        layoutParams.height = -2;
                        ExpandableTextView.this.setLayoutParams(layoutParams);
                    }
                });
                ofInt.setInterpolator(this.f6823d);
                ofInt.setDuration(this.f6825f).start();
                return true;
            }
        } else if (!z && !this.f6826g && this.f6824e >= 0) {
            Iterator<OnExpandListener> it2 = this.f6821b.iterator();
            while (it2.hasNext()) {
                it2.next().mo4471a(this);
            }
            measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f6828i = getMeasuredHeight();
            this.f6826g = true;
            setMaxLines(Integer.MAX_VALUE);
            measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f6828i, getMeasuredHeight());
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: at.blogc.android.views.ExpandableTextView.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ExpandableTextView.this.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            ofInt2.addListener(new AnimatorListenerAdapter() { // from class: at.blogc.android.views.ExpandableTextView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ExpandableTextView.this.setMaxHeight(Integer.MAX_VALUE);
                    ExpandableTextView.this.setMinHeight(0);
                    ViewGroup.LayoutParams layoutParams = ExpandableTextView.this.getLayoutParams();
                    layoutParams.height = -2;
                    ExpandableTextView.this.setLayoutParams(layoutParams);
                    ExpandableTextView expandableTextView = ExpandableTextView.this;
                    expandableTextView.f6827h = true;
                    expandableTextView.f6826g = false;
                }
            });
            ofInt2.setInterpolator(this.f6822c);
            ofInt2.setDuration(this.f6825f).start();
            return true;
        }
        return false;
    }

    public TimeInterpolator getCollapseInterpolator() {
        return this.f6823d;
    }

    public TimeInterpolator getExpandInterpolator() {
        return this.f6822c;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f6824e == 0 && !this.f6827h && !this.f6826g) {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public void setAnimationDuration(long j2) {
        this.f6825f = j2;
    }

    public void setCollapseInterpolator(TimeInterpolator timeInterpolator) {
        this.f6823d = timeInterpolator;
    }

    public void setExpandInterpolator(TimeInterpolator timeInterpolator) {
        this.f6822c = timeInterpolator;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f6822c = timeInterpolator;
        this.f6823d = timeInterpolator;
    }
}
