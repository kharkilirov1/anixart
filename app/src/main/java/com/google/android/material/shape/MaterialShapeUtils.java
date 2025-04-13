package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes.dex */
public class MaterialShapeUtils {
    @NonNull
    /* renamed from: a */
    public static CornerTreatment m10307a(int i2) {
        return i2 != 0 ? i2 != 1 ? new RoundedCornerTreatment() : new CutCornerTreatment() : new RoundedCornerTreatment();
    }

    /* renamed from: b */
    public static void m10308b(@NonNull View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) background;
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.f18633b;
            if (materialShapeDrawableState.f18672o != f2) {
                materialShapeDrawableState.f18672o = f2;
                materialShapeDrawable.m10279K();
            }
        }
    }

    /* renamed from: c */
    public static void m10309c(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.f18633b.f18659b;
        if (elevationOverlayProvider != null && elevationOverlayProvider.f18074a) {
            float m10169f = ViewUtils.m10169f(view);
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.f18633b;
            if (materialShapeDrawableState.f18671n != m10169f) {
                materialShapeDrawableState.f18671n = m10169f;
                materialShapeDrawable.m10279K();
            }
        }
    }
}
