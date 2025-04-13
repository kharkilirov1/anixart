package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: b */
    public boolean f3021b;

    public Guideline(Context context) {
        super(context);
        this.f3021b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f3021b = z;
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f3021b && layoutParams.f2809a == i2) {
            return;
        }
        layoutParams.f2809a = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f3021b && layoutParams.f2811b == i2) {
            return;
        }
        layoutParams.f2811b = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f3021b && layoutParams.f2813c == f2) {
            return;
        }
        layoutParams.f2813c = f2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
