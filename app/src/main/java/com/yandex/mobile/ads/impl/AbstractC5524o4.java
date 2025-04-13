package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.o4 */
/* loaded from: classes3.dex */
public abstract class AbstractC5524o4 {

    /* renamed from: a */
    public static final C5563p2 f53149a = new C5563p2(1, "Received unsupported ad type. We are already working on this issue.");

    /* renamed from: b */
    public static final C5563p2 f53150b = new C5563p2(5, "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.");

    /* renamed from: c */
    public static final C5563p2 f53151c = new C5563p2(1, "Internal state wasn't completely configured. Please try again later.");

    /* renamed from: d */
    public static final C5563p2 f53152d = new C5563p2(1, "Failed to parse server's response. We are already working on this issue.");

    /* renamed from: e */
    public static final C5563p2 f53153e = new C5563p2(5, "android.webkit.WebView creation failed. Try using another device for testing.");

    /* renamed from: f */
    public static final C5563p2 f53154f = new C5563p2(1, "Unexpected server response code. We are already working on this issue.");

    /* renamed from: g */
    public static final C5563p2 f53155g = new C5563p2(1, "Ad request failed with unexpected exception");

    /* renamed from: h */
    public static final C5563p2 f53156h = new C5563p2(1, "Service temporarily unavailable. Please try again later.");

    /* renamed from: i */
    public static final C5563p2 f53157i = new C5563p2(1, "The loaded banner can't fit in the container.");

    /* renamed from: j */
    public static final C5563p2 f53158j = new C5563p2(1, "Banner rendering failed with timeout. Please try again.");

    /* renamed from: k */
    public static final C5563p2 f53159k = new C5563p2(1, "Invalid SDK state.");

    /* renamed from: l */
    public static final C5563p2 f53160l = new C5563p2(4, "Ad request completed successfully, but there are no ads available.");

    /* renamed from: m */
    public static final C5563p2 f53161m = new C5563p2(3, "Ad request failed with network error. Please try again later.");

    /* renamed from: n */
    public static final C5563p2 f53162n = new C5563p2(2, "Ad request configured incorrectly");

    /* renamed from: o */
    public static final C5563p2 f53163o = new C5563p2(2, "Invalid request parameters");

    /* renamed from: p */
    public static final C5563p2 f53164p = new C5563p2(2, "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");

    /* renamed from: q */
    public static final C5563p2 f53165q = new C5563p2(2, "Invalid ad size. Set the ad size using the 'setAdSize' method.");

    /* renamed from: r */
    public static final C5563p2 f53166r = new C5563p2(1, "Invalid sdk configuration. Please request another ad.");

    /* renamed from: s */
    public static final C5563p2 f53167s = new C5563p2(0, "Unknown error");

    /* renamed from: a */
    public static C5563p2 m26995a(int i2, int i3, int i4, int i5, int i6, int i7) {
        return new C5563p2(1, String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
    }

    /* renamed from: b */
    public static C5563p2 m26997b(@Nullable String str) {
        return new C5563p2(2, String.format(Locale.US, (str == null || str.isEmpty()) ? "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface." : "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", str));
    }

    /* renamed from: a */
    public static C5563p2 m26996a(@NonNull String str) {
        return new C5563p2(1, str);
    }
}
