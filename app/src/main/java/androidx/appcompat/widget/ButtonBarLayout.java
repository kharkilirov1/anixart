package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f1284b;

    /* renamed from: c */
    public boolean f1285c;

    /* renamed from: d */
    public int f1286d;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1286d = -1;
        int[] iArr = C0055R.styleable.f301l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1284b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1284b);
        }
    }

    private void setStacked(boolean z) {
        if (this.f1285c != z) {
            if (!z || this.f1284b) {
                this.f1285c = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(C2507R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* renamed from: a */
    public final int m824a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f1284b) {
            if (size > this.f1286d && this.f1285c) {
                setStacked(false);
            }
            this.f1286d = size;
        }
        if (this.f1285c || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i4, i3);
        if (this.f1284b && !this.f1285c) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i2, i3);
        }
        int m824a = m824a(0);
        if (m824a >= 0) {
            View childAt = getChildAt(m824a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f1285c) {
                int m824a2 = m824a(m824a + 1);
                i5 = m824a2 >= 0 ? getChildAt(m824a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        if (ViewCompat.m2233x(this) != i5) {
            setMinimumHeight(i5);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1284b != z) {
            this.f1284b = z;
            if (!z && this.f1285c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
