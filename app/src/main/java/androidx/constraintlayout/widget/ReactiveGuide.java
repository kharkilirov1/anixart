package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {

    /* renamed from: b */
    public int f3037b;

    /* renamed from: c */
    public int f3038c;

    @Override // android.view.View
    @SuppressLint
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f3038c;
    }

    public int getAttributeId() {
        return this.f3037b;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
    }

    public void setApplyToConstraintSetId(int i2) {
        this.f3038c = i2;
    }

    public void setAttributeId(int i2) {
        HashSet<WeakReference<SharedValues.SharedValuesListener>> hashSet;
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i3 = this.f3037b;
        if (i3 != -1 && (hashSet = sharedValues.f3039a.get(Integer.valueOf(i3))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<SharedValues.SharedValuesListener>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<SharedValues.SharedValuesListener> next = it.next();
                SharedValues.SharedValuesListener sharedValuesListener = next.get();
                if (sharedValuesListener == null || sharedValuesListener == this) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f3037b = i2;
        if (i2 != -1) {
            HashSet<WeakReference<SharedValues.SharedValuesListener>> hashSet2 = sharedValues.f3039a.get(Integer.valueOf(i2));
            if (hashSet2 == null) {
                hashSet2 = new HashSet<>();
                sharedValues.f3039a.put(Integer.valueOf(i2), hashSet2);
            }
            hashSet2.add(new WeakReference<>(this));
        }
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2809a = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2811b = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2813c = f2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
