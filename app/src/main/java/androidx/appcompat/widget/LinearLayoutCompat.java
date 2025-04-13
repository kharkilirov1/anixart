package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.C4632R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: b */
    public boolean f1336b;

    /* renamed from: c */
    public int f1337c;

    /* renamed from: d */
    public int f1338d;

    /* renamed from: e */
    public int f1339e;

    /* renamed from: f */
    public int f1340f;

    /* renamed from: g */
    public int f1341g;

    /* renamed from: h */
    public float f1342h;

    /* renamed from: i */
    public boolean f1343i;

    /* renamed from: j */
    public int[] f1344j;

    /* renamed from: k */
    public int[] f1345k;

    /* renamed from: l */
    public Drawable f1346l;

    /* renamed from: m */
    public int f1347m;

    /* renamed from: n */
    public int f1348n;

    /* renamed from: o */
    public int f1349o;

    /* renamed from: p */
    public int f1350p;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: e */
    public void mo859e(Canvas canvas, int i2) {
        this.f1346l.setBounds(getPaddingLeft() + this.f1350p, i2, (getWidth() - getPaddingRight()) - this.f1350p, this.f1348n + i2);
        this.f1346l.draw(canvas);
    }

    /* renamed from: g */
    public void mo860g(Canvas canvas, int i2) {
        this.f1346l.setBounds(i2, getPaddingTop() + this.f1350p, this.f1347m + i2, (getHeight() - getPaddingBottom()) - this.f1350p);
        this.f1346l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f1337c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f1337c;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1337c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f1338d;
        if (this.f1339e == 1 && (i2 = this.f1340f & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i2 == 16) {
                i4 = C0000a.m5b(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f1341g, 2, i4);
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1341g;
            }
        }
        return i4 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1337c;
    }

    public Drawable getDividerDrawable() {
        return this.f1346l;
    }

    public int getDividerPadding() {
        return this.f1350p;
    }

    @RestrictTo
    public int getDividerWidth() {
        return this.f1347m;
    }

    @GravityInt
    public int getGravity() {
        return this.f1340f;
    }

    public int getOrientation() {
        return this.f1339e;
    }

    public int getShowDividers() {
        return this.f1349o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1342h;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i2 = this.f1339e;
        if (i2 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @RestrictTo
    /* renamed from: k */
    public boolean m861k(int i2) {
        if (i2 == 0) {
            return (this.f1349o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f1349o & 4) != 0;
        }
        if ((this.f1349o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f1346l == null) {
            return;
        }
        int i3 = 0;
        if (this.f1339e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && m861k(i3)) {
                    mo859e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f1348n);
                }
                i3++;
            }
            if (m861k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                mo859e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1348n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m1007b = ViewUtils.m1007b(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m861k(i3)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                mo860g(canvas, m1007b ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f1347m);
            }
            i3++;
        }
        if (m861k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (m1007b) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i2 = this.f1347m;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (m1007b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f1347m;
                right = left - i2;
            }
            mo860g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06e1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1336b = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f1337c = i2;
            return;
        }
        StringBuilder m24u = C0000a.m24u("base aligned child index out of range (0, ");
        m24u.append(getChildCount());
        m24u.append(")");
        throw new IllegalArgumentException(m24u.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1346l) {
            return;
        }
        this.f1346l = drawable;
        if (drawable != null) {
            this.f1347m = drawable.getIntrinsicWidth();
            this.f1348n = drawable.getIntrinsicHeight();
        } else {
            this.f1347m = 0;
            this.f1348n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f1350p = i2;
    }

    public void setGravity(@GravityInt int i2) {
        if (this.f1340f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i2 |= 48;
            }
            this.f1340f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f1340f;
        if ((8388615 & i4) != i3) {
            this.f1340f = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1343i = z;
    }

    public void setOrientation(int i2) {
        if (this.f1339e != i2) {
            this.f1339e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f1349o) {
            requestLayout();
        }
        this.f1349o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i4 = this.f1340f;
        if ((i4 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i3) {
            this.f1340f = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f1342h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1336b = true;
        this.f1337c = -1;
        this.f1338d = 0;
        this.f1340f = 8388659;
        int[] iArr = C0055R.styleable.f304o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, obtainStyledAttributes);
        ViewCompat.m2194d0(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int m961j = tintTypedArray.m961j(1, -1);
        if (m961j >= 0) {
            setOrientation(m961j);
        }
        int m961j2 = tintTypedArray.m961j(0, -1);
        if (m961j2 >= 0) {
            setGravity(m961j2);
        }
        boolean m952a = tintTypedArray.m952a(2, true);
        if (!m952a) {
            setBaselineAligned(m952a);
        }
        this.f1342h = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1337c = tintTypedArray.m961j(3, -1);
        this.f1343i = tintTypedArray.m952a(7, false);
        setDividerDrawable(tintTypedArray.m958g(5));
        this.f1349o = tintTypedArray.m961j(8, 0);
        this.f1350p = tintTypedArray.m957f(6, 0);
        obtainStyledAttributes.recycle();
    }
}
