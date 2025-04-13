package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ViewUtils;
import com.swiftsoft.anixartd.C2507R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f17971b;

    /* renamed from: c */
    public final boolean f17972c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f17971b = UtcDates.m10036i();
        if (MaterialDatePicker.m10001A3(getContext())) {
            setNextFocusLeftId(C2507R.id.cancel_button);
            setNextFocusRightId(C2507R.id.confirm_button);
        }
        this.f17972c = MaterialDatePicker.m10002c4(getContext(), C2507R.attr.nestedScrollable);
        ViewCompat.m2196e0(this, new AccessibilityDelegateCompat(this) { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.m2511q(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonthAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }

    /* renamed from: b */
    public final View m10000b(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int m10018a;
        int width;
        int m10018a2;
        int width2;
        int width3;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f18021c;
        CalendarStyle calendarStyle = adapter.f18023e;
        int max = Math.max(adapter.m10019b(), getFirstVisiblePosition());
        int min = Math.min(adapter.m10021d(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<Pair<Long, Long>> it = dateSelector.mo9982N().iterator();
        while (it.hasNext()) {
            Pair<Long, Long> next = it.next();
            Long l2 = next.f3552a;
            if (l2 == null) {
                materialCalendarGridView = this;
            } else if (next.f3553b != null) {
                long longValue = l2.longValue();
                long longValue2 = next.f3553b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean m10171h = ViewUtils.m10171h(this);
                    if (longValue < item.longValue()) {
                        width = max % adapter.f18020b.f18014e == 0 ? 0 : !m10171h ? materialCalendarGridView.m10000b(max - 1).getRight() : materialCalendarGridView.m10000b(max - 1).getLeft();
                        m10018a = max;
                    } else {
                        materialCalendarGridView.f17971b.setTimeInMillis(longValue);
                        m10018a = adapter.m10018a(materialCalendarGridView.f17971b.get(5));
                        View m10000b = materialCalendarGridView.m10000b(m10018a);
                        width = (m10000b.getWidth() / 2) + m10000b.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % adapter.f18020b.f18014e == 0 ? getWidth() : !m10171h ? materialCalendarGridView.m10000b(min).getRight() : materialCalendarGridView.m10000b(min).getLeft();
                        m10018a2 = min;
                    } else {
                        materialCalendarGridView.f17971b.setTimeInMillis(longValue2);
                        m10018a2 = adapter.m10018a(materialCalendarGridView.f17971b.get(5));
                        View m10000b2 = materialCalendarGridView.m10000b(m10018a2);
                        width2 = (m10000b2.getWidth() / 2) + m10000b2.getLeft();
                    }
                    int itemId = (int) adapter.getItemId(m10018a);
                    int i3 = max;
                    int i4 = min;
                    int itemId2 = (int) adapter.getItemId(m10018a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View m10000b3 = materialCalendarGridView.m10000b(numColumns);
                        int top = m10000b3.getTop() + calendarStyle.f17913a.f17907a.top;
                        MonthAdapter monthAdapter = adapter;
                        int bottom = m10000b3.getBottom() - calendarStyle.f17913a.f17907a.bottom;
                        if (m10171h) {
                            int i5 = m10018a2 > numColumns2 ? 0 : width2;
                            width3 = numColumns > m10018a ? getWidth() : width;
                            i2 = i5;
                        } else {
                            i2 = numColumns > m10018a ? 0 : width;
                            width3 = m10018a2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i2, top, width3, bottom, calendarStyle.f17920h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = monthAdapter;
                    }
                    materialCalendarGridView = this;
                    max = i3;
                    min = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i2, rect);
            return;
        }
        if (i2 == 33) {
            setSelection(getAdapter().m10021d());
        } else if (i2 == 130) {
            setSelection(getAdapter().m10019b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m10019b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().m10019b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f17972c) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter().m10019b()) {
            super.setSelection(getAdapter().m10019b());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
