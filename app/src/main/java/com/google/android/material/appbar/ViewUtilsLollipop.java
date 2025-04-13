package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.swiftsoft.anixartd.C2507R;

@RequiresApi
/* loaded from: classes.dex */
class ViewUtilsLollipop {

    /* renamed from: a */
    public static final int[] f17466a = {R.attr.stateListAnimator};

    /* renamed from: a */
    public static void m9799a(@NonNull View view, float f2) {
        int integer = view.getResources().getInteger(C2507R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C2507R.attr.state_liftable, -2130969748}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
