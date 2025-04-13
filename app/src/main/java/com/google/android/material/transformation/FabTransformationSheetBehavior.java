package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.swiftsoft.anixartd.C2507R;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    @Nullable
    public Map<View, Integer> f19336i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    /* renamed from: A */
    public FabTransformationBehavior.FabTransformationSpec mo10569A(Context context, boolean z) {
        int i2 = z ? C2507R.animator.mtrl_fab_transformation_sheet_expand_spec : C2507R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.f19330a = MotionSpec.m9744b(context, i2);
        fabTransformationSpec.f19331b = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationSpec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    /* renamed from: t */
    public boolean mo10567t(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f19336i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).f3070a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (z) {
                        this.f19336i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.m2216o0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f19336i;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.m2216o0(childAt, this.f19336i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (!z) {
                this.f19336i = null;
            }
        }
        super.mo10567t(view, view2, z, z2);
        return true;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
