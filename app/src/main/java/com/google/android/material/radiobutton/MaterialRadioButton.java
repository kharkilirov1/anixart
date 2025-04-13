package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.C1195R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: h */
    public static final int[][] f18580h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    @Nullable
    public ColorStateList f18581f;

    /* renamed from: g */
    public boolean f18582g;

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.radioButtonStyle, C2507R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, C2507R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray m10159d = ThemeEnforcement.m10159d(context2, attributeSet, C1195R.styleable.f17340y, C2507R.attr.radioButtonStyle, C2507R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (m10159d.hasValue(0)) {
            CompoundButtonCompat.m2578d(this, MaterialResources.m10240a(context2, m10159d, 0));
        }
        this.f18582g = m10159d.getBoolean(1, false);
        m10159d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f18581f == null) {
            int m9971d = MaterialColors.m9971d(this, C2507R.attr.colorControlActivated);
            int m9971d2 = MaterialColors.m9971d(this, C2507R.attr.colorOnSurface);
            int m9971d3 = MaterialColors.m9971d(this, C2507R.attr.colorSurface);
            int[][] iArr = f18580h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.m9973f(m9971d3, m9971d, 1.0f);
            iArr2[1] = MaterialColors.m9973f(m9971d3, m9971d2, 0.54f);
            iArr2[2] = MaterialColors.m9973f(m9971d3, m9971d2, 0.38f);
            iArr2[3] = MaterialColors.m9973f(m9971d3, m9971d2, 0.38f);
            this.f18581f = new ColorStateList(iArr, iArr2);
        }
        return this.f18581f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18582g && CompoundButtonCompat.m2576b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f18582g = z;
        if (z) {
            CompoundButtonCompat.m2578d(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.m2578d(this, null);
        }
    }
}
