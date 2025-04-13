package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
class MaterialButtonHelper {

    /* renamed from: u */
    @ChecksSdkIntAtLeast
    public static final boolean f17700u;

    /* renamed from: v */
    public static final boolean f17701v;

    /* renamed from: a */
    public final MaterialButton f17702a;

    /* renamed from: b */
    @NonNull
    public ShapeAppearanceModel f17703b;

    /* renamed from: c */
    public int f17704c;

    /* renamed from: d */
    public int f17705d;

    /* renamed from: e */
    public int f17706e;

    /* renamed from: f */
    public int f17707f;

    /* renamed from: g */
    public int f17708g;

    /* renamed from: h */
    public int f17709h;

    /* renamed from: i */
    @Nullable
    public PorterDuff.Mode f17710i;

    /* renamed from: j */
    @Nullable
    public ColorStateList f17711j;

    /* renamed from: k */
    @Nullable
    public ColorStateList f17712k;

    /* renamed from: l */
    @Nullable
    public ColorStateList f17713l;

    /* renamed from: m */
    @Nullable
    public Drawable f17714m;

    /* renamed from: q */
    public boolean f17718q;

    /* renamed from: s */
    public LayerDrawable f17720s;

    /* renamed from: t */
    public int f17721t;

    /* renamed from: n */
    public boolean f17715n = false;

    /* renamed from: o */
    public boolean f17716o = false;

    /* renamed from: p */
    public boolean f17717p = false;

    /* renamed from: r */
    public boolean f17719r = true;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f17700u = true;
        f17701v = i2 <= 22;
    }

    public MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f17702a = materialButton;
        this.f17703b = shapeAppearanceModel;
    }

    @Nullable
    /* renamed from: a */
    public Shapeable m9881a() {
        LayerDrawable layerDrawable = this.f17720s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f17720s.getNumberOfLayers() > 2 ? (Shapeable) this.f17720s.getDrawable(2) : (Shapeable) this.f17720s.getDrawable(1);
    }

    @Nullable
    /* renamed from: b */
    public MaterialShapeDrawable m9882b() {
        return m9883c(false);
    }

    @Nullable
    /* renamed from: c */
    public final MaterialShapeDrawable m9883c(boolean z) {
        LayerDrawable layerDrawable = this.f17720s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f17700u ? (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f17720s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (MaterialShapeDrawable) this.f17720s.getDrawable(!z ? 1 : 0);
    }

    @Nullable
    /* renamed from: d */
    public final MaterialShapeDrawable m9884d() {
        return m9883c(true);
    }

    /* renamed from: e */
    public void m9885e(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f17703b = shapeAppearanceModel;
        if (f17701v && !this.f17716o) {
            int m2159B = ViewCompat.m2159B(this.f17702a);
            int paddingTop = this.f17702a.getPaddingTop();
            int m2157A = ViewCompat.m2157A(this.f17702a);
            int paddingBottom = this.f17702a.getPaddingBottom();
            m9887g();
            ViewCompat.m2226t0(this.f17702a, m2159B, paddingTop, m2157A, paddingBottom);
            return;
        }
        if (m9882b() != null) {
            m9882b().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m9884d() != null) {
            m9884d().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (m9881a() != null) {
            m9881a().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: f */
    public final void m9886f(@Dimension int i2, @Dimension int i3) {
        int m2159B = ViewCompat.m2159B(this.f17702a);
        int paddingTop = this.f17702a.getPaddingTop();
        int m2157A = ViewCompat.m2157A(this.f17702a);
        int paddingBottom = this.f17702a.getPaddingBottom();
        int i4 = this.f17706e;
        int i5 = this.f17707f;
        this.f17707f = i3;
        this.f17706e = i2;
        if (!this.f17716o) {
            m9887g();
        }
        ViewCompat.m2226t0(this.f17702a, m2159B, (paddingTop + i2) - i4, m2157A, (paddingBottom + i3) - i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* renamed from: g */
    public final void m9887g() {
        InsetDrawable insetDrawable;
        MaterialButton materialButton = this.f17702a;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f17703b);
        materialShapeDrawable.m10296s(this.f17702a.getContext());
        DrawableCompat.m1842n(materialShapeDrawable, this.f17711j);
        PorterDuff.Mode mode = this.f17710i;
        if (mode != null) {
            DrawableCompat.m1843o(materialShapeDrawable, mode);
        }
        materialShapeDrawable.m10274F(this.f17709h, this.f17712k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f17703b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.m10273E(this.f17709h, this.f17715n ? MaterialColors.m9971d(this.f17702a, C2507R.attr.colorSurface) : 0);
        if (f17700u) {
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f17703b);
            this.f17714m = materialShapeDrawable3;
            DrawableCompat.m1841m(materialShapeDrawable3, -1);
            ?? rippleDrawable = new RippleDrawable(RippleUtils.m10258d(this.f17713l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f17704c, this.f17706e, this.f17705d, this.f17707f), this.f17714m);
            this.f17720s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f17703b);
            this.f17714m = rippleDrawableCompat;
            DrawableCompat.m1842n(rippleDrawableCompat, RippleUtils.m10258d(this.f17713l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable, this.f17714m});
            this.f17720s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.f17704c, this.f17706e, this.f17705d, this.f17707f);
        }
        materialButton.setInternalBackground(insetDrawable);
        MaterialShapeDrawable m9882b = m9882b();
        if (m9882b != null) {
            m9882b.m10300w(this.f17721t);
            m9882b.setState(this.f17702a.getDrawableState());
        }
    }

    /* renamed from: h */
    public final void m9888h() {
        MaterialShapeDrawable m9882b = m9882b();
        MaterialShapeDrawable m9884d = m9884d();
        if (m9882b != null) {
            m9882b.m10274F(this.f17709h, this.f17712k);
            if (m9884d != null) {
                m9884d.m10273E(this.f17709h, this.f17715n ? MaterialColors.m9971d(this.f17702a, C2507R.attr.colorSurface) : 0);
            }
        }
    }
}
