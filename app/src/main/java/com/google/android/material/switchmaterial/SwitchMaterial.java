package com.google.android.material.switchmaterial;

import android.R;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.MaterialColors;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: W */
    public static final int[][] f18879W = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U */
    @Nullable
    public ColorStateList f18880U;

    /* renamed from: V */
    public boolean f18881V;

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        MaterialColors.m9971d(this, C2507R.attr.colorSurface);
        MaterialColors.m9971d(this, C2507R.attr.colorControlActivated);
        getResources().getDimension(C2507R.dimen.mtrl_switch_thumb_elevation);
        throw null;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f18880U == null) {
            int[][] iArr = f18879W;
            int[] iArr2 = new int[iArr.length];
            int m9971d = MaterialColors.m9971d(this, C2507R.attr.colorSurface);
            int m9971d2 = MaterialColors.m9971d(this, C2507R.attr.colorControlActivated);
            int m9971d3 = MaterialColors.m9971d(this, C2507R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.m9973f(m9971d, m9971d2, 0.54f);
            iArr2[1] = MaterialColors.m9973f(m9971d, m9971d3, 0.32f);
            iArr2[2] = MaterialColors.m9973f(m9971d, m9971d2, 0.12f);
            iArr2[3] = MaterialColors.m9973f(m9971d, m9971d3, 0.12f);
            this.f18880U = new ColorStateList(iArr, iArr2);
        }
        return this.f18880U;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18881V && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f18881V && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f18881V = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
