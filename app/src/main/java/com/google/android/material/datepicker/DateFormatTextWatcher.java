package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {

    /* renamed from: b */
    @NonNull
    public final TextInputLayout f17925b;

    /* renamed from: c */
    public final DateFormat f17926c;

    /* renamed from: d */
    public final CalendarConstraints f17927d;

    /* renamed from: e */
    public final String f17928e;

    /* renamed from: f */
    public final Runnable f17929f;

    /* renamed from: g */
    public Runnable f17930g;

    public DateFormatTextWatcher(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f17926c = dateFormat;
        this.f17925b = textInputLayout;
        this.f17927d = calendarConstraints;
        this.f17928e = textInputLayout.getContext().getString(C2507R.string.mtrl_picker_out_of_range);
        this.f17929f = new Runnable() { // from class: com.google.android.material.datepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                DateFormatTextWatcher dateFormatTextWatcher = DateFormatTextWatcher.this;
                String str2 = str;
                TextInputLayout textInputLayout2 = dateFormatTextWatcher.f17925b;
                DateFormat dateFormat2 = dateFormatTextWatcher.f17926c;
                Context context = textInputLayout2.getContext();
                textInputLayout2.setError(context.getString(C2507R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(C2507R.string.mtrl_picker_invalid_format_use), dateFormatTextWatcher.m9980c(str2)) + "\n" + String.format(context.getString(C2507R.string.mtrl_picker_invalid_format_example), dateFormatTextWatcher.m9980c(dateFormat2.format(new Date(UtcDates.m10035h().getTimeInMillis())))));
                dateFormatTextWatcher.mo9978a();
            }
        };
    }

    /* renamed from: a */
    public void mo9978a() {
    }

    /* renamed from: b */
    public abstract void mo9979b(@Nullable Long l2);

    /* renamed from: c */
    public final String m9980c(String str) {
        return str.replace(' ', (char) 160);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: ParseException -> 0x0073, TryCatch #0 {ParseException -> 0x0073, blocks: (B:7:0x0020, B:9:0x003d, B:11:0x004a, B:15:0x005a, B:18:0x0066), top: B:6:0x0020 }] */
    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTextChanged(@androidx.annotation.NonNull java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            com.google.android.material.textfield.TextInputLayout r8 = r6.f17925b
            java.lang.Runnable r9 = r6.f17929f
            r8.removeCallbacks(r9)
            com.google.android.material.textfield.TextInputLayout r8 = r6.f17925b
            java.lang.Runnable r9 = r6.f17930g
            r8.removeCallbacks(r9)
            com.google.android.material.textfield.TextInputLayout r8 = r6.f17925b
            r9 = 0
            r8.setError(r9)
            r6.mo9979b(r9)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L1e
            return
        L1e:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.text.DateFormat r8 = r6.f17926c     // Catch: java.text.ParseException -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.text.ParseException -> L73
            java.util.Date r7 = r8.parse(r7)     // Catch: java.text.ParseException -> L73
            com.google.android.material.textfield.TextInputLayout r8 = r6.f17925b     // Catch: java.text.ParseException -> L73
            r8.setError(r9)     // Catch: java.text.ParseException -> L73
            long r8 = r7.getTime()     // Catch: java.text.ParseException -> L73
            com.google.android.material.datepicker.CalendarConstraints r10 = r6.f17927d     // Catch: java.text.ParseException -> L73
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r10 = r10.f17895d     // Catch: java.text.ParseException -> L73
            boolean r10 = r10.mo9974j(r8)     // Catch: java.text.ParseException -> L73
            if (r10 == 0) goto L66
            com.google.android.material.datepicker.CalendarConstraints r10 = r6.f17927d     // Catch: java.text.ParseException -> L73
            com.google.android.material.datepicker.Month r2 = r10.f17893b     // Catch: java.text.ParseException -> L73
            r3 = 1
            long r4 = r2.m10014f(r3)     // Catch: java.text.ParseException -> L73
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 > 0) goto L57
            com.google.android.material.datepicker.Month r10 = r10.f17894c     // Catch: java.text.ParseException -> L73
            int r2 = r10.f18015f     // Catch: java.text.ParseException -> L73
            long r4 = r10.m10014f(r2)     // Catch: java.text.ParseException -> L73
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 > 0) goto L57
            goto L58
        L57:
            r3 = 0
        L58:
            if (r3 == 0) goto L66
            long r7 = r7.getTime()     // Catch: java.text.ParseException -> L73
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.text.ParseException -> L73
            r6.mo9979b(r7)     // Catch: java.text.ParseException -> L73
            return
        L66:
            com.google.android.material.datepicker.a r7 = new com.google.android.material.datepicker.a     // Catch: java.text.ParseException -> L73
            r7.<init>()     // Catch: java.text.ParseException -> L73
            r6.f17930g = r7     // Catch: java.text.ParseException -> L73
            com.google.android.material.textfield.TextInputLayout r8 = r6.f17925b     // Catch: java.text.ParseException -> L73
            r8.postDelayed(r7, r0)     // Catch: java.text.ParseException -> L73
            goto L7a
        L73:
            com.google.android.material.textfield.TextInputLayout r7 = r6.f17925b
            java.lang.Runnable r8 = r6.f17929f
            r7.postDelayed(r8, r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.DateFormatTextWatcher.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
