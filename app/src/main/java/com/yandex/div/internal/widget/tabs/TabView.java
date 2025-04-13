package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* loaded from: classes2.dex */
public final class TabView extends AppCompatTextView {

    /* renamed from: r */
    public static final /* synthetic */ int f34281r = 0;

    /* renamed from: h */
    @Nullable
    public DivTypefaceProvider f34282h;

    /* renamed from: i */
    @StyleRes
    public int f34283i;

    /* renamed from: j */
    public boolean f34284j;

    /* renamed from: k */
    public boolean f34285k;

    /* renamed from: l */
    @NonNull
    public MaxWidthProvider f34286l;

    /* renamed from: m */
    @Nullable
    public OnUpdateListener f34287m;

    /* renamed from: n */
    @Nullable
    public BaseIndicatorTabLayout.Tab f34288n;

    /* renamed from: o */
    @Nullable
    public DivTypefaceType f34289o;

    /* renamed from: p */
    @Nullable
    public DivTypefaceType f34290p;

    /* renamed from: q */
    public boolean f34291q;

    public interface MaxWidthProvider {
        /* renamed from: b */
        int mo17512b();
    }

    public interface OnUpdateListener {
        /* renamed from: a */
        void mo17513a(@NonNull TabView tabView);
    }

    public TabView(@NonNull Context context) {
        super(context, null, 0);
        this.f34286l = new MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.h
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            /* renamed from: b */
            public final int mo17512b() {
                int i2 = TabView.f34281r;
                return Integer.MAX_VALUE;
            }
        };
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.tabs.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = TabView.f34281r;
            }
        });
    }

    @Nullable
    private Typeface getDefaultTypeface() {
        DivTypefaceProvider divTypefaceProvider = this.f34282h;
        if (divTypefaceProvider != null) {
            if (this.f34291q) {
                DivTypefaceType divTypefaceType = this.f34290p;
                if (divTypefaceType != null) {
                    return divTypefaceType.m16695a(divTypefaceProvider);
                }
            } else {
                DivTypefaceType divTypefaceType2 = this.f34289o;
                if (divTypefaceType2 != null) {
                    return divTypefaceType2.m16695a(divTypefaceProvider);
                }
            }
        }
        if (divTypefaceProvider != null) {
            return divTypefaceProvider.getMedium();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        BaseIndicatorTabLayout.Tab tab;
        CharSequence charSequence;
        TextPaint paint;
        Typeface defaultTypeface;
        TextPaint paint2 = getPaint();
        if (paint2 != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint2.setTypeface(defaultTypeface);
        }
        if (!this.f34285k) {
            super.onMeasure(i2, i3);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int mo17512b = this.f34286l.mo17512b();
        if (mo17512b > 0 && (mode == 0 || size > mo17512b)) {
            i2 = View.MeasureSpec.makeMeasureSpec(mo17512b, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (tab = this.f34288n) == null || (charSequence = tab.f34249a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        if (charSequence == null) {
            return;
        }
        setText(TextUtils.ellipsize(charSequence, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        BaseIndicatorTabLayout.Tab tab = this.f34288n;
        if (tab == null) {
            return performClick;
        }
        tab.m17501a();
        return true;
    }

    public void setActiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.f34290p = divTypefaceType;
    }

    public void setBoldTextOnSelection(boolean z) {
        this.f34284j = z;
    }

    public void setEllipsizeEnabled(boolean z) {
        this.f34285k = z;
        setEllipsize(z ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(@Nullable DivTypefaceType divTypefaceType) {
        this.f34289o = divTypefaceType;
    }

    public void setMaxWidthProvider(@NonNull MaxWidthProvider maxWidthProvider) {
        this.f34286l = maxWidthProvider;
    }

    public void setOnUpdateListener(@Nullable OnUpdateListener onUpdateListener) {
        this.f34287m = onUpdateListener;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        setTypefaceType(z);
        if (this.f34284j && z2 && !isSelected()) {
            setTextAppearance(getContext(), this.f34283i);
        }
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTab(@Nullable BaseIndicatorTabLayout.Tab tab) {
        if (tab != this.f34288n) {
            this.f34288n = tab;
            setText(tab == null ? null : tab.f34249a);
            OnUpdateListener onUpdateListener = this.f34287m;
            if (onUpdateListener != null) {
                onUpdateListener.mo17513a(this);
            }
        }
    }

    public void setTextColorList(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTypefaceType(boolean z) {
        boolean z2 = this.f34291q != z;
        this.f34291q = z;
        if (z2) {
            requestLayout();
        }
    }
}
