package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {

    /* renamed from: j */
    public boolean f2563j;

    /* renamed from: k */
    public boolean f2564k;

    /* renamed from: l */
    public float f2565l;

    /* renamed from: m */
    public View[] f2566m;

    /* renamed from: a */
    public void mo1373a(MotionLayout motionLayout, int i2, int i3, float f2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    /* renamed from: b */
    public void mo1393b(MotionLayout motionLayout, int i2, int i3) {
    }

    public float getProgress() {
        return this.f2565l;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3032h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f2563j = obtainStyledAttributes.getBoolean(index, this.f2563j);
                } else if (index == 0) {
                    this.f2564k = obtainStyledAttributes.getBoolean(index, this.f2564k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f2) {
        this.f2565l = f2;
        int i2 = 0;
        if (this.f2757c > 0) {
            this.f2566m = m1428k((ConstraintLayout) getParent());
            while (i2 < this.f2757c) {
                View view = this.f2566m[i2];
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            boolean z = viewGroup.getChildAt(i2) instanceof MotionHelper;
            i2++;
        }
    }
}
