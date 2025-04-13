package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class DaysOfWeekAdapter extends BaseAdapter {

    /* renamed from: e */
    public static final int f17933e;

    /* renamed from: b */
    @NonNull
    public final Calendar f17934b;

    /* renamed from: c */
    public final int f17935c;

    /* renamed from: d */
    public final int f17936d;

    static {
        f17933e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DaysOfWeekAdapter() {
        Calendar m10036i = UtcDates.m10036i();
        this.f17934b = m10036i;
        this.f17935c = m10036i.getMaximum(7);
        this.f17936d = m10036i.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f17935c;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Object getItem(int i2) {
        int i3 = this.f17935c;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f17936d;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint
    public View getView(int i2, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2507R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f17934b;
        int i3 = i2 + this.f17936d;
        int i4 = this.f17935c;
        if (i3 > i4) {
            i3 -= i4;
        }
        calendar.set(7, i3);
        textView.setText(this.f17934b.getDisplayName(7, f17933e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C2507R.string.mtrl_picker_day_of_week_column_header), this.f17934b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public DaysOfWeekAdapter(int i2) {
        Calendar m10036i = UtcDates.m10036i();
        this.f17934b = m10036i;
        this.f17935c = m10036i.getMaximum(7);
        this.f17936d = i2;
    }
}
