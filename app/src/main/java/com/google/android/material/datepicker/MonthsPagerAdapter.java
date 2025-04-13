package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;

/* loaded from: classes.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    @NonNull
    public final CalendarConstraints f18026a;

    /* renamed from: b */
    public final DateSelector<?> f18027b;

    /* renamed from: c */
    @Nullable
    public final DayViewDecorator f18028c;

    /* renamed from: d */
    public final MaterialCalendar.OnDayClickListener f18029d;

    /* renamed from: e */
    public final int f18030e;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f18033a;

        /* renamed from: b */
        public final MaterialCalendarGridView f18034b;

        public ViewHolder(@NonNull LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C2507R.id.month_title);
            this.f18033a = textView;
            ViewCompat.m2198f0(textView, true);
            this.f18034b = (MaterialCalendarGridView) linearLayout.findViewById(C2507R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(@NonNull Context context, DateSelector<?> dateSelector, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month month = calendarConstraints.f17893b;
        Month month2 = calendarConstraints.f17894c;
        Month month3 = calendarConstraints.f17896e;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i2 = MonthAdapter.f18018h;
        int i3 = MaterialCalendar.f17937p;
        this.f18030e = (i2 * context.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_calendar_day_height)) + (MaterialDatePicker.m10001A3(context) ? context.getResources().getDimensionPixelSize(C2507R.dimen.mtrl_calendar_day_height) : 0);
        this.f18026a = calendarConstraints;
        this.f18027b = dateSelector;
        this.f18028c = dayViewDecorator;
        this.f18029d = onDayClickListener;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f18026a.f17899h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return this.f18026a.f17893b.m10016i(i2).f18011b.getTimeInMillis();
    }

    @NonNull
    /* renamed from: k */
    public Month m10024k(int i2) {
        return this.f18026a.f17893b.m10016i(i2);
    }

    /* renamed from: l */
    public int m10025l(@NonNull Month month) {
        return this.f18026a.f17893b.m10017k(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = viewHolder;
        Month m10016i = this.f18026a.f17893b.m10016i(i2);
        viewHolder2.f18033a.setText(m10016i.m10015h());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder2.f18034b.findViewById(C2507R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m10016i.equals(materialCalendarGridView.getAdapter().f18020b)) {
            MonthAdapter monthAdapter = new MonthAdapter(m10016i, this.f18027b, this.f18026a, this.f18028c);
            materialCalendarGridView.setNumColumns(m10016i.f18014e);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter adapter = materialCalendarGridView.getAdapter();
            Iterator<Long> it = adapter.f18022d.iterator();
            while (it.hasNext()) {
                adapter.m10023f(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = adapter.f18021c;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.mo9986d0().iterator();
                while (it2.hasNext()) {
                    adapter.m10023f(materialCalendarGridView, it2.next().longValue());
                }
                adapter.f18022d = adapter.f18021c.mo9986d0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                MonthAdapter adapter2 = materialCalendarGridView.getAdapter();
                if (i3 >= adapter2.m10019b() && i3 <= adapter2.m10021d()) {
                    MonthsPagerAdapter.this.f18029d.mo9998a(materialCalendarGridView.getAdapter().getItem(i3).longValue());
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C2507R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m10001A3(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f18030e));
        return new ViewHolder(linearLayout, true);
    }
}
