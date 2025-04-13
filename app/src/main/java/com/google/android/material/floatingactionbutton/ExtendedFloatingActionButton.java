package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.C1195R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.List;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: A */
    public static final Property<View, Float> f18101A;

    /* renamed from: B */
    public static final Property<View, Float> f18102B;

    /* renamed from: C */
    public static final Property<View, Float> f18103C;

    /* renamed from: z */
    public static final Property<View, Float> f18104z;

    /* renamed from: t */
    public int f18105t;

    /* renamed from: u */
    public int f18106u;

    /* renamed from: v */
    public boolean f18107v;

    /* renamed from: w */
    public boolean f18108w;

    /* renamed from: x */
    public boolean f18109x;

    /* renamed from: y */
    @NonNull
    public ColorStateList f18110y;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 */
    class C12981 implements Size {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 */
    class C12992 implements Size {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 */
    class C13003 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f18111a;

        /* renamed from: b */
        public final /* synthetic */ MotionStrategy f18112b;

        /* renamed from: c */
        public final /* synthetic */ OnChangedCallback f18113c;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f18111a = true;
            this.f18112b.mo10049a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f18112b.mo10050b();
            if (this.f18111a) {
                return;
            }
            this.f18112b.mo10053c(this.f18113c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f18112b.onAnimationStart(animator);
            this.f18111a = false;
        }
    }

    public class ChangeSizeStrategy extends BaseMotionStrategy {
        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: b */
        public void mo10050b() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: c */
        public void mo10053c(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    public class HideStrategy extends BaseMotionStrategy {
        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: a */
        public void mo10049a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: b */
        public void mo10050b() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: c */
        public void mo10053c(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    public static abstract class OnChangedCallback {
    }

    public class ShowStrategy extends BaseMotionStrategy {
        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: b */
        public void mo10050b() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        /* renamed from: c */
        public void mo10053c(@Nullable OnChangedCallback onChangedCallback) {
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    public interface Size {
    }

    static {
        Class<Float> cls = Float.class;
        f18104z = new Property<View, Float>(cls, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f2) {
                View view2 = view;
                view2.getLayoutParams().width = f2.intValue();
                view2.requestLayout();
            }
        };
        f18101A = new Property<View, Float>(cls, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.5
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f2) {
                View view2 = view;
                view2.getLayoutParams().height = f2.intValue();
                view2.requestLayout();
            }
        };
        f18102B = new Property<View, Float>(cls, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(ViewCompat.m2159B(view));
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f2) {
                View view2 = view;
                ViewCompat.m2226t0(view2, f2.intValue(), view2.getPaddingTop(), ViewCompat.m2157A(view2), view2.getPaddingBottom());
            }
        };
        f18103C = new Property<View, Float>(cls, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.7
            @Override // android.util.Property
            @NonNull
            public Float get(@NonNull View view) {
                return Float.valueOf(ViewCompat.m2157A(view));
            }

            @Override // android.util.Property
            public void set(@NonNull View view, @NonNull Float f2) {
                View view2 = view;
                ViewCompat.m2226t0(view2, ViewCompat.m2159B(view2), view2.getPaddingTop(), f2.intValue(), view2.getPaddingBottom());
            }
        };
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        return 0;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        throw null;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        throw null;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        throw null;
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18107v && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f18107v = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f18109x = z;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        throw null;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i2) {
        setExtendMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    public void setExtended(boolean z) {
        if (this.f18107v != z) {
            throw null;
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        throw null;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
        setHideMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.f18107v || this.f18108w) {
            return;
        }
        this.f18105t = ViewCompat.m2159B(this);
        this.f18106u = ViewCompat.m2157A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.f18107v || this.f18108w) {
            return;
        }
        this.f18105t = i2;
        this.f18106u = i4;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        throw null;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
        setShowMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        throw null;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i2) {
        setShrinkMotionSpec(MotionSpec.m9744b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        this.f18110y = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f18114a;

        /* renamed from: b */
        public boolean f18115b;

        /* renamed from: c */
        public boolean f18116c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f18115b = false;
            this.f18116c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo1492a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: c */
        public void mo1494c(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.f3077h == 0) {
                layoutParams.f3077h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: d */
        public boolean mo1495d(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m10055t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f3070a instanceof BottomSheetBehavior : false) {
                    m10056u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h */
        public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> m1478h = coordinatorLayout.m1478h(extendedFloatingActionButton);
            int size = m1478h.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = m1478h.get(i3);
                if (view2 instanceof AppBarLayout) {
                    m10055t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f3070a instanceof BottomSheetBehavior : false) {
                        m10056u(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.m1486u(extendedFloatingActionButton, i2);
            return true;
        }

        /* renamed from: s */
        public final boolean m10054s(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f18115b || this.f18116c) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).f3075f == view.getId();
        }

        /* renamed from: t */
        public final boolean m10055t(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10054s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f18114a == null) {
                this.f18114a = new Rect();
            }
            Rect rect = this.f18114a;
            DescendantOffsetUtils.m10143a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.f18116c) {
                    Property<View, Float> property = ExtendedFloatingActionButton.f18104z;
                    throw null;
                }
                Property<View, Float> property2 = ExtendedFloatingActionButton.f18104z;
                throw null;
            }
            if (this.f18116c) {
                Property<View, Float> property3 = ExtendedFloatingActionButton.f18104z;
                throw null;
            }
            Property<View, Float> property4 = ExtendedFloatingActionButton.f18104z;
            throw null;
        }

        /* renamed from: u */
        public final boolean m10056u(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10054s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (this.f18116c) {
                    Property<View, Float> property = ExtendedFloatingActionButton.f18104z;
                    throw null;
                }
                Property<View, Float> property2 = ExtendedFloatingActionButton.f18104z;
                throw null;
            }
            if (this.f18116c) {
                Property<View, Float> property3 = ExtendedFloatingActionButton.f18104z;
                throw null;
            }
            Property<View, Float> property4 = ExtendedFloatingActionButton.f18104z;
            throw null;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1195R.styleable.f17328m);
            this.f18115b = obtainStyledAttributes.getBoolean(0, false);
            this.f18116c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f18110y = getTextColors();
    }
}
