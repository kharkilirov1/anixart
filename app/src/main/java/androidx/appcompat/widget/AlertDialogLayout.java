package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: l */
    public static int m713l(View view) {
        int m2233x = ViewCompat.m2233x(view);
        if (m2233x > 0) {
            return m2233x;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m713l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = 0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Laf
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lac
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lac
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = androidx.core.view.ViewCompat.m2231w(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8c
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L97
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L96
        L8c:
            r7 = 2
            int r7 = p000a.C0000a.m5b(r13, r4, r7, r10)
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L96:
            int r7 = r7 - r8
        L97:
            boolean r8 = r9.m861k(r0)
            if (r8 == 0) goto L9e
            int r12 = r12 + r14
        L9e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lac:
            int r0 = r0 + 1
            goto L50
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == C2507R.id.topPanel) {
                    view = childAt;
                } else if (id2 == C2507R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id2 != C2507R.id.contentPanel && id2 != C2507R.id.customPanel) || view3 != null) {
                    break;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            i4 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i4 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i5 = m713l(view2);
            i6 = view2.getMeasuredHeight() - i5;
            paddingBottom += i5;
            i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i7 = view3.getMeasuredHeight();
            paddingBottom += i7;
            i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
        } else {
            i7 = 0;
        }
        int i9 = size - paddingBottom;
        if (view2 != null) {
            int i10 = paddingBottom - i5;
            int min = Math.min(i9, i6);
            if (min > 0) {
                i9 -= min;
                i5 += min;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingBottom = i10 + view2.getMeasuredHeight();
            i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
            paddingBottom = (paddingBottom - i7) + view3.getMeasuredHeight();
            i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i2, i4), View.resolveSizeAndState(paddingBottom, i3, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                        int i14 = ((LinearLayout.LayoutParams) layoutParams).height;
                        ((LinearLayout.LayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i3, 0);
                        ((LinearLayout.LayoutParams) layoutParams).height = i14;
                    }
                }
            }
        }
        z = true;
        if (z) {
            return;
        }
        super.onMeasure(i2, i3);
    }
}
