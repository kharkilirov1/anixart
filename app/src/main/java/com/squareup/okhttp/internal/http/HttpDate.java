package com.squareup.okhttp.internal.http;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class HttpDate {

    /* renamed from: a */
    public static final TimeZone f25165a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    public static final ThreadLocal<DateFormat> f25166b = new ThreadLocal<DateFormat>() { // from class: com.squareup.okhttp.internal.http.HttpDate.1
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(HttpDate.f25165a);
            return simpleDateFormat;
        }
    };

    /* renamed from: c */
    public static final String[] f25167c;

    /* renamed from: d */
    public static final DateFormat[] f25168d;

    static {
        String[] strArr = {StdDateFormat.DATE_FORMAT_STR_RFC1123, "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f25167c = strArr;
        f25168d = new DateFormat[strArr.length];
    }
}
