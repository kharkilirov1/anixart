package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public int f1418b;

    /* renamed from: c */
    public int f1419c;

    /* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$1 */
    class RunnableC01221 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f1420b;

        /* renamed from: c */
        public final /* synthetic */ ScrollingTabContainerView f1421c;

        @Override // java.lang.Runnable
        public void run() {
            this.f1421c.smoothScrollTo(this.f1420b.getLeft() - ((this.f1421c.getWidth() - this.f1420b.getWidth()) / 2), 0);
            Objects.requireNonNull(this.f1421c);
        }
    }

    public class TabAdapter extends BaseAdapter {

        /* renamed from: b */
        public final /* synthetic */ ScrollingTabContainerView f1422b;

        @Override // android.widget.Adapter
        public int getCount() {
            Objects.requireNonNull(this.f1422b);
            throw null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            Objects.requireNonNull(this.f1422b);
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view != null) {
                TabView tabView = (TabView) view;
                tabView.f1424b = (ActionBar.Tab) getItem(i2);
                tabView.m898a();
                return view;
            }
            ScrollingTabContainerView scrollingTabContainerView = this.f1422b;
            ActionBar.Tab tab = (ActionBar.Tab) getItem(i2);
            Objects.requireNonNull(scrollingTabContainerView);
            TabView tabView2 = scrollingTabContainerView.new TabView(scrollingTabContainerView.getContext(), tab, true);
            tabView2.setBackgroundDrawable(null);
            tabView2.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.f1418b));
            return tabView2;
        }
    }

    public class TabClickListener implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ ScrollingTabContainerView f1423b;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).f1424b.mo353e();
            Objects.requireNonNull(this.f1423b);
            throw null;
        }
    }

    public class TabView extends LinearLayout {

        /* renamed from: b */
        public ActionBar.Tab f1424b;

        /* renamed from: c */
        public TextView f1425c;

        /* renamed from: d */
        public ImageView f1426d;

        /* renamed from: e */
        public View f1427e;

        public TabView(Context context, ActionBar.Tab tab, boolean z) {
            super(context, null, C2507R.attr.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.f1424b = tab;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, C2507R.attr.actionBarTabStyle, 0);
            TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
            if (tintTypedArray.m967p(0)) {
                setBackgroundDrawable(tintTypedArray.m958g(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            m898a();
        }

        /* renamed from: a */
        public void m898a() {
            ActionBar.Tab tab = this.f1424b;
            View mo350b = tab.mo350b();
            if (mo350b != null) {
                ViewParent parent = mo350b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(mo350b);
                    }
                    addView(mo350b);
                }
                this.f1427e = mo350b;
                TextView textView = this.f1425c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1426d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1426d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1427e;
            if (view != null) {
                removeView(view);
                this.f1427e = null;
            }
            Drawable mo351c = tab.mo351c();
            CharSequence mo352d = tab.mo352d();
            if (mo351c != null) {
                if (this.f1426d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1426d = appCompatImageView;
                }
                this.f1426d.setImageDrawable(mo351c);
                this.f1426d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1426d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1426d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(mo352d);
            if (z) {
                if (this.f1425c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C2507R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1425c = appCompatTextView;
                }
                this.f1425c.setText(mo352d);
                this.f1425c.setVisibility(0);
            } else {
                TextView textView2 = this.f1425c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1425c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1426d;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.mo349a());
            }
            TooltipCompat.m998a(this, z ? null : tab.mo349a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            Objects.requireNonNull(ScrollingTabContainerView.this);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f1429a;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1429a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1429a) {
                return;
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0055R.styleable.f290a, C2507R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = actionBarPolicy.f678a.getResources();
        if (!actionBarPolicy.m526b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C2507R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        actionBarPolicy.f678a.getResources().getDimensionPixelSize(C2507R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((TabView) view).f1424b.mo353e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        setFillViewport(View.MeasureSpec.getMode(i2) == 1073741824);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    public void setContentHeight(int i2) {
        this.f1418b = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1419c = i2;
        throw null;
    }
}
