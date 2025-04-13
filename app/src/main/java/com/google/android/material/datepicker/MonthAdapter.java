package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
class MonthAdapter extends BaseAdapter {

    /* renamed from: h */
    public static final int f18018h = UtcDates.m10036i().getMaximum(4);

    /* renamed from: i */
    public static final int f18019i = (UtcDates.m10036i().getMaximum(7) + UtcDates.m10036i().getMaximum(5)) - 1;

    /* renamed from: b */
    public final Month f18020b;

    /* renamed from: c */
    public final DateSelector<?> f18021c;

    /* renamed from: d */
    public Collection<Long> f18022d;

    /* renamed from: e */
    public CalendarStyle f18023e;

    /* renamed from: f */
    public final CalendarConstraints f18024f;

    /* renamed from: g */
    @Nullable
    public final DayViewDecorator f18025g;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.f18020b = month;
        this.f18021c = dateSelector;
        this.f18024f = calendarConstraints;
        this.f18025g = dayViewDecorator;
        this.f18022d = dateSelector.mo9986d0();
    }

    /* renamed from: a */
    public int m10018a(int i2) {
        return m10019b() + (i2 - 1);
    }

    /* renamed from: b */
    public int m10019b() {
        Month month = this.f18020b;
        int i2 = this.f18024f.f17897f;
        int i3 = month.f18011b.get(7);
        if (i2 <= 0) {
            i2 = month.f18011b.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + month.f18014e : i4;
    }

    @Override // android.widget.Adapter
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < m10019b() || i2 > m10021d()) {
            return null;
        }
        return Long.valueOf(this.f18020b.m10014f((i2 - m10019b()) + 1));
    }

    /* renamed from: d */
    public int m10021d() {
        return (m10019b() + this.f18020b.f18015f) - 1;
    }

    /* renamed from: e */
    public final void m10022e(@Nullable TextView textView, long j2, int i2) {
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.f18024f.f17895d.mo9974j(j2)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f18021c.mo9986d0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (UtcDates.m10028a(j2) == UtcDates.m10028a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            calendarItemStyle = z ? this.f18023e.f17914b : UtcDates.m10035h().getTimeInMillis() == j2 ? this.f18023e.f17915c : this.f18023e.f17913a;
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.f18023e.f17919g;
        }
        if (this.f18025g == null || i2 == -1) {
            calendarItemStyle.m9976b(textView, null);
            return;
        }
        textView.getContext();
        int i3 = this.f18020b.f18013d;
        Objects.requireNonNull(this.f18025g);
        calendarItemStyle.m9976b(textView, null);
        Objects.requireNonNull(this.f18025g);
        Objects.requireNonNull(this.f18025g);
        Objects.requireNonNull(this.f18025g);
        Objects.requireNonNull(this.f18025g);
        textView.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: f */
    public final void m10023f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (Month.m10012d(j2).equals(this.f18020b)) {
            Calendar m10031d = UtcDates.m10031d(this.f18020b.f18011b);
            m10031d.setTimeInMillis(j2);
            int i2 = m10031d.get(5);
            m10022e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m10018a(i2) - materialCalendarGridView.getFirstVisiblePosition()), j2, i2);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f18019i;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f18020b.f18014e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00eb  */
    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r8, @androidx.annotation.Nullable android.view.View r9, @androidx.annotation.NonNull android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r0 = r10.getContext()
            com.google.android.material.datepicker.CalendarStyle r1 = r7.f18023e
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.CalendarStyle r1 = new com.google.android.material.datepicker.CalendarStyle
            r1.<init>(r0)
            r7.f18023e = r1
        Lf:
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r9 != 0) goto L27
            android.content.Context r9 = r10.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r0 = 2131558722(0x7f0d0142, float:1.8742768E38)
            android.view.View r9 = r9.inflate(r0, r10, r1)
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r9 = r7.m10019b()
            int r9 = r8 - r9
            r10 = -1
            if (r9 < 0) goto Ldc
            com.google.android.material.datepicker.Month r2 = r7.f18020b
            int r3 = r2.f18015f
            if (r9 < r3) goto L38
            goto Ldc
        L38:
            r10 = 1
            int r9 = r9 + r10
            r0.setTag(r2)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.util.Locale r2 = r2.locale
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r7.f18020b
            long r2 = r2.m10014f(r9)
            com.google.android.material.datepicker.Month r4 = r7.f18020b
            int r4 = r4.f18013d
            com.google.android.material.datepicker.Month r5 = new com.google.android.material.datepicker.Month
            java.util.Calendar r6 = com.google.android.material.datepicker.UtcDates.m10035h()
            r5.<init>(r6)
            int r5 = r5.f18013d
            r6 = 24
            if (r4 != r5) goto La3
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L89
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.m10030c(r5, r4)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.lang.String r2 = r4.format(r5)
            goto L9f
        L89:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> r5 = com.google.android.material.datepicker.UtcDates.f18055a
            java.text.DateFormat r4 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r5 = com.google.android.material.datepicker.UtcDates.m10034g()
            r4.setTimeZone(r5)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.lang.String r2 = r4.format(r5)
        L9f:
            r0.setContentDescription(r2)
            goto Ld4
        La3:
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto Lbb
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = com.google.android.material.datepicker.UtcDates.m10030c(r5, r4)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.lang.String r2 = r4.format(r5)
            goto Ld1
        Lbb:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> r5 = com.google.android.material.datepicker.UtcDates.f18055a
            java.text.DateFormat r4 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r5 = com.google.android.material.datepicker.UtcDates.m10034g()
            r4.setTimeZone(r5)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r2)
            java.lang.String r2 = r4.format(r5)
        Ld1:
            r0.setContentDescription(r2)
        Ld4:
            r0.setVisibility(r1)
            r0.setEnabled(r10)
            r10 = r9
            goto Le4
        Ldc:
            r9 = 8
            r0.setVisibility(r9)
            r0.setEnabled(r1)
        Le4:
            java.lang.Long r8 = r7.getItem(r8)
            if (r8 != 0) goto Leb
            goto Lf2
        Leb:
            long r8 = r8.longValue()
            r7.m10022e(r0, r8, r10)
        Lf2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
