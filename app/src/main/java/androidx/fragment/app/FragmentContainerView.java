package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.C0326R;
import com.fasterxml.jackson.core.JsonFactory;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: FragmentContainerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31884d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "Api20Impl", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b */
    @NotNull
    public final List<View> f4305b;

    /* renamed from: c */
    @NotNull
    public final List<View> f4306c;

    /* renamed from: d */
    @Nullable
    public View.OnApplyWindowInsetsListener f4307d;

    /* renamed from: e */
    public boolean f4308e;

    /* compiled from: FragmentContainerView.kt */
    @RequiresApi
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "fragment_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Api20Impl {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.m32179h(context, "context");
        this.f4305b = new ArrayList();
        this.f4306c = new ArrayList();
        this.f4308e = true;
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i2, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.m32179h(child, "child");
        Object tag = child.getTag(C2507R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(child, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets insets) {
        WindowInsetsCompat m2180T;
        Intrinsics.m32179h(insets, "insets");
        WindowInsetsCompat m2419p = WindowInsetsCompat.m2419p(insets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4307d;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.m32176e(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            Intrinsics.m32178g(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            m2180T = WindowInsetsCompat.m2419p(onApplyWindowInsets, null);
        } else {
            m2180T = ViewCompat.m2180T(this, m2419p);
        }
        Intrinsics.m32178g(m2180T, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!m2180T.m2430l()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewCompat.m2197f(getChildAt(i2), m2180T);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if (this.f4308e) {
            Iterator<T> it = this.f4305b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j2) {
        Intrinsics.m32179h(canvas, "canvas");
        Intrinsics.m32179h(child, "child");
        if (this.f4308e && (!this.f4305b.isEmpty()) && this.f4305b.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j2);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        this.f4306c.remove(view);
        if (this.f4305b.remove(view)) {
            this.f4308e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager supportFragmentManager;
        FragmentActivity fragmentActivity = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(C2507R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fragmentActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) supportFragmentManager.m2999G(getId());
    }

    @Override // android.view.View
    @RequiresApi
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.m32179h(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View view = getChildAt(childCount);
            Intrinsics.m32178g(view, "view");
            if (this.f4306c.contains(view)) {
                this.f4305b.add(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (this.f4306c.contains(view)) {
            this.f4305b.add(view);
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        View view = getChildAt(i2);
        Intrinsics.m32178g(view, "view");
        if (this.f4306c.contains(view)) {
            this.f4305b.add(view);
        }
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (this.f4306c.contains(view)) {
            this.f4305b.add(view);
        }
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View view = getChildAt(i5);
            Intrinsics.m32178g(view, "view");
            if (this.f4306c.contains(view)) {
                this.f4305b.add(view);
            }
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View view = getChildAt(i5);
            Intrinsics.m32178g(view, "view");
            if (this.f4306c.contains(view)) {
                this.f4305b.add(view);
            }
        }
        super.removeViewsInLayout(i2, i3);
    }

    @JvmName
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f4308e = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f4307d = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (view.getParent() == this) {
            this.f4306c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Intrinsics.m32179h(context, "context");
        this.f4305b = new ArrayList();
        this.f4306c = new ArrayList();
        this.f4308e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0326R.styleable.f4196b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + JsonFactory.DEFAULT_QUOTE_CHAR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attrs, @NotNull FragmentManager fm) {
        super(context, attrs);
        View view;
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(attrs, "attrs");
        Intrinsics.m32179h(fm, "fm");
        this.f4305b = new ArrayList();
        this.f4306c = new ArrayList();
        this.f4308e = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, C0326R.styleable.f4196b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m2999G = fm.m2999G(id2);
        if (classAttribute != null && m2999G == null) {
            if (id2 == -1) {
                throw new IllegalStateException(C0000a.m16m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? C0000a.m14k(" with tag ", string) : ""));
            }
            Fragment mo2977a = fm.m3005M().mo2977a(context.getClassLoader(), classAttribute);
            Intrinsics.m32178g(mo2977a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            mo2977a.onInflate(context, attrs, (Bundle) null);
            BackStackRecord backStackRecord = new BackStackRecord(fm);
            backStackRecord.f4441p = true;
            mo2977a.mContainer = this;
            backStackRecord.mo2941k(getId(), mo2977a, string, 1);
            backStackRecord.mo2939h();
        }
        Iterator it = ((ArrayList) fm.f4339c.m3106e()).iterator();
        while (it.hasNext()) {
            FragmentStateManager fragmentStateManager = (FragmentStateManager) it.next();
            Fragment fragment = fragmentStateManager.f4408c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                fragmentStateManager.m3083b();
            }
        }
    }
}
