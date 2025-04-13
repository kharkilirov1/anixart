package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f17348a = new ChildrenAlphaProperty("childrenAlpha");

    public ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @NonNull
    public Float get(@NonNull ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(C2507R.id.mtrl_internal_children_alpha_tag);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(@NonNull ViewGroup viewGroup, @NonNull Float f2) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f2.floatValue();
        viewGroup2.setTag(C2507R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup2.getChildAt(i2).setAlpha(floatValue);
        }
    }
}
