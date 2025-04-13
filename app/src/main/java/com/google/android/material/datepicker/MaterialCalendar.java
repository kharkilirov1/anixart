package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: p */
    public static final /* synthetic */ int f17937p = 0;

    /* renamed from: c */
    @StyleRes
    public int f17938c;

    /* renamed from: d */
    @Nullable
    public DateSelector<S> f17939d;

    /* renamed from: e */
    @Nullable
    public CalendarConstraints f17940e;

    /* renamed from: f */
    @Nullable
    public DayViewDecorator f17941f;

    /* renamed from: g */
    @Nullable
    public Month f17942g;

    /* renamed from: h */
    public CalendarSelector f17943h;

    /* renamed from: i */
    public CalendarStyle f17944i;

    /* renamed from: j */
    public RecyclerView f17945j;

    /* renamed from: k */
    public RecyclerView f17946k;

    /* renamed from: l */
    public View f17947l;

    /* renamed from: m */
    public View f17948m;

    /* renamed from: n */
    public View f17949n;

    /* renamed from: o */
    public View f17950o;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public interface OnDayClickListener {
        /* renamed from: a */
        void mo9998a(long j2);
    }

    /* renamed from: A3 */
    public final void m9993A3(final int i2) {
        this.f17946k.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.f17946k.m3826w0(i2);
            }
        });
    }

    /* renamed from: c4 */
    public void m9994c4(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f17946k.getAdapter();
        int m10017k = monthsPagerAdapter.f18026a.f17893b.m10017k(month);
        int m10025l = m10017k - monthsPagerAdapter.m10025l(this.f17942g);
        boolean z = Math.abs(m10025l) > 3;
        boolean z2 = m10025l > 0;
        this.f17942g = month;
        if (z && z2) {
            this.f17946k.m3818s0(m10017k - 3);
            m9993A3(m10017k);
        } else if (!z) {
            m9993A3(m10017k);
        } else {
            this.f17946k.m3818s0(m10017k + 3);
            m9993A3(m10017k);
        }
    }

    /* renamed from: e4 */
    public void m9995e4(CalendarSelector calendarSelector) {
        this.f17943h = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f17945j.getLayoutManager().mo3680T0(((YearGridAdapter) this.f17945j.getAdapter()).m10038k(this.f17942g.f18013d));
            this.f17949n.setVisibility(0);
            this.f17950o.setVisibility(8);
            this.f17947l.setVisibility(8);
            this.f17948m.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f17949n.setVisibility(8);
            this.f17950o.setVisibility(0);
            this.f17947l.setVisibility(0);
            this.f17948m.setVisibility(0);
            m9994c4(this.f17942g);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    /* renamed from: n3 */
    public boolean mo9996n3(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.f18035b.add(onSelectionChangedListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17938c = bundle.getInt("THEME_RES_ID_KEY");
        this.f17939d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f17940e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f17941f = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f17942g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        final int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f17938c);
        this.f17944i = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f17940e.f17893b;
        if (MaterialDatePicker.m10001A3(contextThemeWrapper)) {
            i2 = C2507R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = C2507R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(C2507R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(C2507R.dimen.mtrl_calendar_days_of_week_height);
        int i4 = MonthAdapter.f18018h;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(C2507R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(C2507R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(C2507R.id.mtrl_calendar_days_of_week);
        ViewCompat.m2196e0(gridView, new AccessibilityDelegateCompat(this) { // from class: com.google.android.material.datepicker.MaterialCalendar.1
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
        int i5 = this.f17940e.f17897f;
        gridView.setAdapter((ListAdapter) (i5 > 0 ? new DaysOfWeekAdapter(i5) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(month.f18014e);
        gridView.setEnabled(false);
        this.f17946k = (RecyclerView) inflate.findViewById(C2507R.id.mtrl_calendar_months);
        this.f17946k.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i3, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            /* renamed from: g1 */
            public void mo3684g1(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                if (i3 == 0) {
                    iArr[0] = MaterialCalendar.this.f17946k.getWidth();
                    iArr[1] = MaterialCalendar.this.f17946k.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.f17946k.getHeight();
                    iArr[1] = MaterialCalendar.this.f17946k.getHeight();
                }
            }
        });
        this.f17946k.setTag("MONTHS_VIEW_GROUP_TAG");
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f17939d, this.f17940e, this.f17941f, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            /* renamed from: a */
            public void mo9998a(long j2) {
                if (MaterialCalendar.this.f17940e.f17895d.mo9974j(j2)) {
                    MaterialCalendar.this.f17939d.mo9981D0(j2);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.f18035b.iterator();
                    while (it.hasNext()) {
                        it.next().mo10009b(MaterialCalendar.this.f17939d.mo9988n0());
                    }
                    MaterialCalendar.this.f17946k.getAdapter().notifyDataSetChanged();
                    RecyclerView recyclerView = MaterialCalendar.this.f17945j;
                    if (recyclerView != null) {
                        recyclerView.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f17946k.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C2507R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C2507R.id.mtrl_calendar_year_selector_frame);
        this.f17945j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f17945j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f17945j.setAdapter(new YearGridAdapter(this));
            this.f17945j.mo3802k(new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.4

                /* renamed from: a */
                public final Calendar f17956a = UtcDates.m10036i();

                /* renamed from: b */
                public final Calendar f17957b = UtcDates.m10036i();

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                /* renamed from: g */
                public void mo3576g(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView.State state) {
                    if ((recyclerView2.getAdapter() instanceof YearGridAdapter) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        for (Pair<Long, Long> pair : MaterialCalendar.this.f17939d.mo9982N()) {
                            Long l2 = pair.f3552a;
                            if (l2 != null && pair.f3553b != null) {
                                this.f17956a.setTimeInMillis(l2.longValue());
                                this.f17957b.setTimeInMillis(pair.f3553b.longValue());
                                int m10038k = yearGridAdapter.m10038k(this.f17956a.get(1));
                                int m10038k2 = yearGridAdapter.m10038k(this.f17957b.get(1));
                                View mo3676L = gridLayoutManager.mo3676L(m10038k);
                                View mo3676L2 = gridLayoutManager.mo3676L(m10038k2);
                                int i6 = gridLayoutManager.f5327I;
                                int i7 = m10038k / i6;
                                int i8 = m10038k2 / i6;
                                for (int i9 = i7; i9 <= i8; i9++) {
                                    View mo3676L3 = gridLayoutManager.mo3676L(gridLayoutManager.f5327I * i9);
                                    if (mo3676L3 != null) {
                                        int top = mo3676L3.getTop() + MaterialCalendar.this.f17944i.f17916d.f17907a.top;
                                        int bottom = mo3676L3.getBottom() - MaterialCalendar.this.f17944i.f17916d.f17907a.bottom;
                                        canvas.drawRect(i9 == i7 ? (mo3676L.getWidth() / 2) + mo3676L.getLeft() : 0, top, i9 == i8 ? (mo3676L2.getWidth() / 2) + mo3676L2.getLeft() : recyclerView2.getWidth(), bottom, MaterialCalendar.this.f17944i.f17920h);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        if (inflate.findViewById(C2507R.id.month_navigation_fragment_toggle) != null) {
            final MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.m2196e0(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
                {
                    View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                /* renamed from: d */
                public void mo2044d(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                    accessibilityNodeInfoCompat.m2513s(MaterialCalendar.this.f17950o.getVisibility() == 0 ? MaterialCalendar.this.getString(C2507R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(C2507R.string.mtrl_picker_toggle_to_day_selection));
                }
            });
            View findViewById = inflate.findViewById(C2507R.id.month_navigation_previous);
            this.f17947l = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(C2507R.id.month_navigation_next);
            this.f17948m = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f17949n = inflate.findViewById(C2507R.id.mtrl_calendar_year_selector_frame);
            this.f17950o = inflate.findViewById(C2507R.id.mtrl_calendar_day_selector_frame);
            m9995e4(CalendarSelector.DAY);
            materialButton.setText(this.f17942g.m10015h());
            this.f17946k.m3806m(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                /* renamed from: a */
                public void mo3914a(@NonNull RecyclerView recyclerView2, int i6) {
                    if (i6 == 0) {
                        recyclerView2.announceForAccessibility(materialButton.getText());
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                /* renamed from: c */
                public void mo3586c(@NonNull RecyclerView recyclerView2, int i6, int i7) {
                    int m3695r1 = i6 < 0 ? MaterialCalendar.this.m9997u3().m3695r1() : MaterialCalendar.this.m9997u3().m3697s1();
                    MaterialCalendar.this.f17942g = monthsPagerAdapter.m10024k(m3695r1);
                    materialButton.setText(monthsPagerAdapter.f18026a.f17893b.m10016i(m3695r1).m10015h());
                }
            });
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    CalendarSelector calendarSelector = CalendarSelector.DAY;
                    CalendarSelector calendarSelector2 = materialCalendar.f17943h;
                    CalendarSelector calendarSelector3 = CalendarSelector.YEAR;
                    if (calendarSelector2 == calendarSelector3) {
                        materialCalendar.m9995e4(calendarSelector);
                    } else if (calendarSelector2 == calendarSelector) {
                        materialCalendar.m9995e4(calendarSelector3);
                    }
                }
            });
            this.f17948m.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int m3695r1 = MaterialCalendar.this.m9997u3().m3695r1() + 1;
                    if (m3695r1 < MaterialCalendar.this.f17946k.getAdapter().getItemCount()) {
                        MaterialCalendar.this.m9994c4(monthsPagerAdapter.m10024k(m3695r1));
                    }
                }
            });
            this.f17947l.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int m3697s1 = MaterialCalendar.this.m9997u3().m3697s1() - 1;
                    if (m3697s1 >= 0) {
                        MaterialCalendar.this.m9994c4(monthsPagerAdapter.m10024k(m3697s1));
                    }
                }
            });
        }
        if (!MaterialDatePicker.m10001A3(contextThemeWrapper)) {
            new PagerSnapHelper().m3952b(this.f17946k);
        }
        this.f17946k.m3818s0(monthsPagerAdapter.m10025l(this.f17942g));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f17938c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f17939d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f17940e);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f17941f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f17942g);
    }

    @NonNull
    /* renamed from: u3 */
    public LinearLayoutManager m9997u3() {
        return (LinearLayoutManager) this.f17946k.getLayoutManager();
    }
}
