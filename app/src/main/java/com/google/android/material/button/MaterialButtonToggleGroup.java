package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C1195R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l */
    public static final /* synthetic */ int f17722l = 0;

    /* renamed from: b */
    public final List<CornerData> f17723b;

    /* renamed from: c */
    public final PressedStateTracker f17724c;

    /* renamed from: d */
    public final LinkedHashSet<OnButtonCheckedListener> f17725d;

    /* renamed from: e */
    public final Comparator<MaterialButton> f17726e;

    /* renamed from: f */
    public Integer[] f17727f;

    /* renamed from: g */
    public boolean f17728g;

    /* renamed from: h */
    public boolean f17729h;

    /* renamed from: i */
    public boolean f17730i;

    /* renamed from: j */
    @IdRes
    public final int f17731j;

    /* renamed from: k */
    public Set<Integer> f17732k;

    public static class CornerData {

        /* renamed from: e */
        public static final CornerSize f17735e = new AbsoluteCornerSize(0.0f);

        /* renamed from: a */
        public CornerSize f17736a;

        /* renamed from: b */
        public CornerSize f17737b;

        /* renamed from: c */
        public CornerSize f17738c;

        /* renamed from: d */
        public CornerSize f17739d;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f17736a = cornerSize;
            this.f17737b = cornerSize3;
            this.f17738c = cornerSize4;
            this.f17739d = cornerSize2;
        }
    }

    public interface OnButtonCheckedListener {
        /* renamed from: a */
        void mo9895a(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i2, boolean z);
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public PressedStateTracker(C12421 c12421) {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        /* renamed from: a */
        public void mo9880a(@NonNull MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2507R.attr.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m9892d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m9892d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m9892d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.m2203i());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f17724c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m9889a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton m9891c = m9891c(i2);
            int min = Math.min(m9891c.getStrokeWidth(), m9891c(i2 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = m9891c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.m2092c(layoutParams2, 0);
                MarginLayoutParamsCompat.m2093d(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                MarginLayoutParamsCompat.m2093d(layoutParams2, 0);
            }
            m9891c.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.m2092c(layoutParams3, 0);
            MarginLayoutParamsCompat.m2093d(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m9890b(materialButton.getId(), materialButton.isChecked());
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f17723b.add(new CornerData(shapeAppearanceModel.f18688e, shapeAppearanceModel.f18691h, shapeAppearanceModel.f18689f, shapeAppearanceModel.f18690g));
        ViewCompat.m2196e0(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f3743a);
                MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                int i3 = MaterialButtonToggleGroup.f17722l;
                Objects.requireNonNull(materialButtonToggleGroup);
                int i4 = -1;
                if (view2 instanceof MaterialButton) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= materialButtonToggleGroup.getChildCount()) {
                            break;
                        }
                        if (materialButtonToggleGroup.getChildAt(i5) == view2) {
                            i4 = i6;
                            break;
                        }
                        if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.m9892d(i5)) {
                            i6++;
                        }
                        i5++;
                    }
                }
                accessibilityNodeInfoCompat.m2512r(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m2519a(0, 1, i4, 1, false, ((MaterialButton) view2).isChecked()));
            }
        });
    }

    /* renamed from: b */
    public final void m9890b(@IdRes int i2, boolean z) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f17732k);
        if (z && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f17729h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f17730i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        m9893e(hashSet);
    }

    /* renamed from: c */
    public final MaterialButton m9891c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    /* renamed from: d */
    public final boolean m9892d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f17726e);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(m9891c(i2), Integer.valueOf(i2));
        }
        this.f17727f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m9893e(Set<Integer> set) {
        Set<Integer> set2 = this.f17732k;
        this.f17732k = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id2 = m9891c(i2).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f17728g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f17728g = false;
            }
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                boolean contains2 = set.contains(Integer.valueOf(id2));
                Iterator<OnButtonCheckedListener> it = this.f17725d.iterator();
                while (it.hasNext()) {
                    it.next().mo9895a(this, id2, contains2);
                }
            }
        }
        invalidate();
    }

    @VisibleForTesting
    /* renamed from: f */
    public void m9894f() {
        CornerData cornerData;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton m9891c = m9891c(i2);
            if (m9891c.getVisibility() != 8) {
                ShapeAppearanceModel shapeAppearanceModel = m9891c.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder(shapeAppearanceModel);
                CornerData cornerData2 = this.f17723b.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z) {
                            CornerSize cornerSize = cornerData2.f17736a;
                            CornerSize cornerSize2 = CornerData.f17735e;
                            cornerData = new CornerData(cornerSize, cornerSize2, cornerData2.f17737b, cornerSize2);
                        } else if (ViewUtils.m10171h(this)) {
                            CornerSize cornerSize3 = CornerData.f17735e;
                            cornerData = new CornerData(cornerSize3, cornerSize3, cornerData2.f17737b, cornerData2.f17738c);
                        } else {
                            CornerSize cornerSize4 = cornerData2.f17736a;
                            CornerSize cornerSize5 = cornerData2.f17739d;
                            CornerSize cornerSize6 = CornerData.f17735e;
                            cornerData = new CornerData(cornerSize4, cornerSize5, cornerSize6, cornerSize6);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        cornerData2 = null;
                    } else if (!z) {
                        CornerSize cornerSize7 = CornerData.f17735e;
                        cornerData = new CornerData(cornerSize7, cornerData2.f17739d, cornerSize7, cornerData2.f17738c);
                    } else if (ViewUtils.m10171h(this)) {
                        CornerSize cornerSize8 = cornerData2.f17736a;
                        CornerSize cornerSize9 = cornerData2.f17739d;
                        CornerSize cornerSize10 = CornerData.f17735e;
                        cornerData = new CornerData(cornerSize8, cornerSize9, cornerSize10, cornerSize10);
                    } else {
                        CornerSize cornerSize11 = CornerData.f17735e;
                        cornerData = new CornerData(cornerSize11, cornerSize11, cornerData2.f17737b, cornerData2.f17738c);
                    }
                    cornerData2 = cornerData;
                }
                if (cornerData2 == null) {
                    builder.m10321c(0.0f);
                } else {
                    builder.f18700e = cornerData2.f17736a;
                    builder.f18703h = cornerData2.f17739d;
                    builder.f18701f = cornerData2.f17737b;
                    builder.f18702g = cornerData2.f17738c;
                }
                m9891c.setShapeAppearanceModel(builder.m10320a());
            }
        }
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f17729h || this.f17732k.isEmpty()) {
            return -1;
        }
        return this.f17732k.iterator().next().intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id2 = m9891c(i2).getId();
            if (this.f17732k.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f17727f;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f17731j;
        if (i2 != -1) {
            m9893e(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(1, getVisibleButtonCount(), false, this.f17729h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        m9894f();
        m9889a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f17723b.remove(indexOfChild);
        }
        m9894f();
        m9889a();
    }

    public void setSelectionRequired(boolean z) {
        this.f17730i = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f17729h != z) {
            this.f17729h = z;
            m9893e(new HashSet());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, i2, C2507R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i2);
        this.f17723b = new ArrayList();
        this.f17724c = new PressedStateTracker(null);
        this.f17725d = new LinkedHashSet<>();
        this.f17726e = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                MaterialButton materialButton3 = materialButton;
                MaterialButton materialButton4 = materialButton2;
                int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
            }
        };
        this.f17728g = false;
        this.f17732k = new HashSet();
        TypedArray m10159d = ThemeEnforcement.m10159d(getContext(), attributeSet, C1195R.styleable.f17336u, i2, C2507R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(m10159d.getBoolean(2, false));
        this.f17731j = m10159d.getResourceId(0, -1);
        this.f17730i = m10159d.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        m10159d.recycle();
        ViewCompat.m2216o0(this, 1);
    }

    public void setSingleSelection(@BoolRes int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
