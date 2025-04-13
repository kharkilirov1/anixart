package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f19310a;

    public ExpandableBehavior() {
        this.f19310a = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    /* renamed from: d */
    public boolean mo1495d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!m10566s(expandableWidget.mo10048a())) {
            return false;
        }
        this.f19310a = expandableWidget.mo10048a() ? 1 : 2;
        return mo10567t((View) expandableWidget, view, expandableWidget.mo10048a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    /* renamed from: h */
    public boolean mo1499h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final View view, int i2) {
        final ExpandableWidget expandableWidget;
        if (!ViewCompat.m2174N(view)) {
            List<View> m1478h = coordinatorLayout.m1478h(view);
            int size = m1478h.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = m1478h.get(i3);
                if (mo1493b(coordinatorLayout, view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i3++;
            }
            if (expandableWidget != null && m10566s(expandableWidget.mo10048a())) {
                final int i4 = expandableWidget.mo10048a() ? 1 : 2;
                this.f19310a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                        if (expandableBehavior.f19310a == i4) {
                            ExpandableWidget expandableWidget2 = expandableWidget;
                            expandableBehavior.mo10567t((View) expandableWidget2, view, expandableWidget2.mo10048a(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m10566s(boolean z) {
        if (!z) {
            return this.f19310a == 1;
        }
        int i2 = this.f19310a;
        return i2 == 0 || i2 == 2;
    }

    /* renamed from: t */
    public abstract boolean mo10567t(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19310a = 0;
    }
}
