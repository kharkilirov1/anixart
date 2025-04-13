package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C1195R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: f */
    @Dimension
    public int f17861f;

    /* renamed from: g */
    @Dimension
    public int f17862g;

    /* renamed from: h */
    @Nullable
    public OnCheckedStateChangeListener f17863h;

    /* renamed from: i */
    public final CheckableGroup<Chip> f17864i;

    /* renamed from: j */
    public final int f17865j;

    /* renamed from: k */
    @NonNull
    public final PassThroughHierarchyChangeListener f17866k;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void m9962a(@NonNull ChipGroup chipGroup, @IdRes int i2);
    }

    public interface OnCheckedStateChangeListener {
        /* renamed from: a */
        void mo9961a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        public ViewGroup.OnHierarchyChangeListener f17870b;

        public PassThroughHierarchyChangeListener(C12491 c12491) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.m2203i());
                }
                ChipGroup.this.f17864i.m10108a((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f17870b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                CheckableGroup<Chip> checkableGroup = chipGroup.f17864i;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(checkableGroup);
                chip.setInternalOnCheckedChangeListener(null);
                checkableGroup.f18213a.remove(Integer.valueOf(chip.getId()));
                checkableGroup.f18214b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f17870b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(MaterialThemeOverlay.m10534a(context, attributeSet, C2507R.attr.chipGroupStyle, C2507R.style.Widget_MaterialComponents_ChipGroup), attributeSet, C2507R.attr.chipGroupStyle);
        CheckableGroup<Chip> checkableGroup = new CheckableGroup<>();
        this.f17864i = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener(null);
        this.f17866k = passThroughHierarchyChangeListener;
        TypedArray m10159d = ThemeEnforcement.m10159d(getContext(), attributeSet, C1195R.styleable.f17323h, C2507R.attr.chipGroupStyle, C2507R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = m10159d.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(m10159d.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(m10159d.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(m10159d.getBoolean(5, false));
        setSingleSelection(m10159d.getBoolean(6, false));
        setSelectionRequired(m10159d.getBoolean(4, false));
        this.f17865j = m10159d.getResourceId(0, -1);
        m10159d.recycle();
        checkableGroup.f18215c = new CheckableGroup.OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.1
            @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
            /* renamed from: a */
            public void mo9960a(Set<Integer> set) {
                ChipGroup chipGroup = ChipGroup.this;
                OnCheckedStateChangeListener onCheckedStateChangeListener = chipGroup.f17863h;
                if (onCheckedStateChangeListener != null) {
                    onCheckedStateChangeListener.mo9961a(chipGroup, chipGroup.f17864i.m10110c(chipGroup));
                }
            }
        };
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        ViewCompat.m2216o0(this, 1);
    }

    private int getVisibleChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                if (getChildAt(i3).getVisibility() == 0) {
                    i2++;
                }
            }
        }
        return i2;
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: a */
    public boolean mo9959a() {
        return this.f18301d;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f17864i.m10111d();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f17864i.m10110c(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f17861f;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f17862g;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f17865j;
        if (i2 != -1) {
            CheckableGroup<Chip> checkableGroup = this.f17864i;
            Chip chip = checkableGroup.f18213a.get(Integer.valueOf(i2));
            if (chip != null && checkableGroup.m10109b(chip)) {
                checkableGroup.m10112e();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).m2511q(AccessibilityNodeInfoCompat.CollectionInfoCompat.m2518a(getRowCount(), this.f18301d ? getVisibleChipCount() : -1, false, this.f17864i.f18216d ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(@Dimension int i2) {
        if (this.f17861f != i2) {
            this.f17861f = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(@DimenRes int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(@Dimension int i2) {
        if (this.f17862g != i2) {
            this.f17862g = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                /* renamed from: a */
                public void mo9961a(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.f17864i.f18216d) {
                        onCheckedChangeListener.m9962a(chipGroup, chipGroup2.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.f17863h = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f17866k.f17870b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f17864i.f18217e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        CheckableGroup<Chip> checkableGroup = this.f17864i;
        if (checkableGroup.f18216d != z) {
            checkableGroup.f18216d = z;
            boolean z2 = !checkableGroup.f18214b.isEmpty();
            Iterator<Chip> it = checkableGroup.f18213a.values().iterator();
            while (it.hasNext()) {
                checkableGroup.m10113f(it.next(), false);
            }
            if (z2) {
                checkableGroup.m10112e();
            }
        }
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(@BoolRes int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
