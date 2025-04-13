package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.swiftsoft.anixartd.C2507R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final MaterialCalendar<?> f18056a;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f18059a;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f18059a = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.f18056a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f18056a.f17940e.f17898g;
    }

    /* renamed from: k */
    public int m10038k(int i2) {
        return i2 - this.f18056a.f17940e.f17893b.f18013d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = viewHolder;
        final int i3 = this.f18056a.f17940e.f17893b.f18013d + i2;
        String string = viewHolder2.f18059a.getContext().getString(C2507R.string.mtrl_picker_navigate_to_year_description);
        viewHolder2.f18059a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
        viewHolder2.f18059a.setContentDescription(String.format(string, Integer.valueOf(i3)));
        CalendarStyle calendarStyle = this.f18056a.f17944i;
        Calendar m10035h = UtcDates.m10035h();
        CalendarItemStyle calendarItemStyle = m10035h.get(1) == i3 ? calendarStyle.f17918f : calendarStyle.f17916d;
        Iterator<Long> it = this.f18056a.f17939d.mo9986d0().iterator();
        while (it.hasNext()) {
            m10035h.setTimeInMillis(it.next().longValue());
            if (m10035h.get(1) == i3) {
                calendarItemStyle = calendarStyle.f17917e;
            }
        }
        calendarItemStyle.m9976b(viewHolder2.f18059a, null);
        viewHolder2.f18059a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Month m10011c = Month.m10011c(i3, YearGridAdapter.this.f18056a.f17942g.f18012c);
                CalendarConstraints calendarConstraints = YearGridAdapter.this.f18056a.f17940e;
                if (m10011c.compareTo(calendarConstraints.f17893b) < 0) {
                    m10011c = calendarConstraints.f17893b;
                } else if (m10011c.compareTo(calendarConstraints.f17894c) > 0) {
                    m10011c = calendarConstraints.f17894c;
                }
                YearGridAdapter.this.f18056a.m9994c4(m10011c);
                YearGridAdapter.this.f18056a.m9995e4(MaterialCalendar.CalendarSelector.DAY);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2507R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
