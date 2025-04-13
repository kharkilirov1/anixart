package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.C1195R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
final class CalendarStyle {

    /* renamed from: a */
    @NonNull
    public final CalendarItemStyle f17913a;

    /* renamed from: b */
    @NonNull
    public final CalendarItemStyle f17914b;

    /* renamed from: c */
    @NonNull
    public final CalendarItemStyle f17915c;

    /* renamed from: d */
    @NonNull
    public final CalendarItemStyle f17916d;

    /* renamed from: e */
    @NonNull
    public final CalendarItemStyle f17917e;

    /* renamed from: f */
    @NonNull
    public final CalendarItemStyle f17918f;

    /* renamed from: g */
    @NonNull
    public final CalendarItemStyle f17919g;

    /* renamed from: h */
    @NonNull
    public final Paint f17920h;

    public CalendarStyle(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.m10238c(context, C2507R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C1195R.styleable.f17337v);
        this.f17913a = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f17919g = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f17914b = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f17915c = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList m10240a = MaterialResources.m10240a(context, obtainStyledAttributes, 6);
        this.f17916d = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f17917e = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f17918f = CalendarItemStyle.m9975a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f17920h = paint;
        paint.setColor(m10240a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
