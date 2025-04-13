package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.EnumC3124e;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.b2 */
/* loaded from: classes2.dex */
public final class C3834b2 {

    /* renamed from: a */
    private static final C3729Wn f44771a = new C3729Wn();

    /* renamed from: b */
    private static final C3304Fm<Integer, d> f44772b;

    /* renamed from: c */
    @TargetApi
    private static final C3304Fm<Integer, d> f44773c;

    /* renamed from: d */
    private static final C3304Fm<d, Integer> f44774d;

    /* renamed from: com.yandex.metrica.impl.ob.b2$a */
    public class a extends C3304Fm<Integer, d> {
        public a(d dVar) {
            super(dVar);
            m18115a(1, d.WIFI);
            m18115a(0, d.CELL);
            m18115a(7, d.BLUETOOTH);
            m18115a(9, d.ETHERNET);
            m18115a(4, d.MOBILE_DUN);
            m18115a(5, d.MOBILE_HIPRI);
            m18115a(2, d.MOBILE_MMS);
            m18115a(3, d.MOBILE_SUPL);
            m18115a(6, d.WIMAX);
            if (C3658U2.m19211a(21)) {
                m18115a(17, d.VPN);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$b */
    public class b extends C3304Fm<Integer, d> {
        public b(d dVar) {
            super(dVar);
            m18115a(1, d.WIFI);
            m18115a(0, d.CELL);
            m18115a(3, d.ETHERNET);
            m18115a(2, d.BLUETOOTH);
            m18115a(4, d.VPN);
            if (C3658U2.m19211a(27)) {
                m18115a(6, d.LOWPAN);
            }
            if (C3658U2.m19211a(26)) {
                m18115a(5, d.WIFI_AWARE);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$c */
    public class c extends C3304Fm<d, Integer> {
        public c(Integer num) {
            super(num);
            m18115a(d.CELL, 0);
            m18115a(d.WIFI, 1);
            m18115a(d.BLUETOOTH, 3);
            m18115a(d.ETHERNET, 4);
            m18115a(d.MOBILE_DUN, 5);
            m18115a(d.MOBILE_HIPRI, 6);
            m18115a(d.MOBILE_MMS, 7);
            m18115a(d.MOBILE_SUPL, 8);
            m18115a(d.VPN, 9);
            m18115a(d.WIMAX, 10);
            m18115a(d.LOWPAN, 11);
            m18115a(d.WIFI_AWARE, 12);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b2$d */
    public enum d {
        WIFI,
        CELL,
        ETHERNET,
        BLUETOOTH,
        VPN,
        LOWPAN,
        WIFI_AWARE,
        MOBILE_DUN,
        MOBILE_HIPRI,
        MOBILE_MMS,
        MOBILE_SUPL,
        WIMAX,
        OFFLINE,
        UNDEFINED
    }

    static {
        d dVar = d.UNDEFINED;
        f44772b = new a(dVar);
        f44773c = new b(dVar);
        f44774d = new c(2);
    }

    @NonNull
    /* renamed from: a */
    public static EnumC3124e m19629a(@NonNull Context context, @NonNull Point point) {
        float f2;
        EnumC3124e enumC3124e = EnumC3124e.PHONE;
        try {
            f2 = context.getResources().getDisplayMetrics().density;
        } catch (Throwable unused) {
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return enumC3124e;
        }
        float f3 = point.x;
        float f4 = point.y;
        float min = Math.min(f3 / f2, f4 / f2);
        float f5 = f2 * 160.0f;
        float f6 = f3 / f5;
        float f7 = f4 / f5;
        double sqrt = Math.sqrt((f7 * f7) + (f6 * f6));
        return (sqrt > 15.0d ? 1 : (sqrt == 15.0d ? 0 : -1)) >= 0 && !f44771a.m19372a(context, "android.hardware.touchscreen") ? EnumC3124e.TV : (sqrt >= 7.0d || min >= 600.0f) ? EnumC3124e.TABLET : enumC3124e;
    }

    /* renamed from: b */
    public static d m19635b(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? d.OFFLINE : f44772b.m18113a(Integer.valueOf(activeNetworkInfo.getType()));
    }

    /* renamed from: b */
    public static int m19634b(@NonNull Context context) {
        return f44774d.m18113a(m19630a(context)).intValue();
    }

    @NonNull
    /* renamed from: a */
    public static String m19632a(@NonNull Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (C3658U2.m19211a(21)) {
            String script = locale.getScript();
            if (!TextUtils.isEmpty(script)) {
                sb.append('-');
                sb.append(script);
            }
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.metrica.impl.p023ob.C3834b2.d m19630a(@androidx.annotation.NonNull android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            com.yandex.metrica.impl.ob.b2$d r0 = com.yandex.metrica.impl.p023ob.C3834b2.d.UNDEFINED
            if (r2 == 0) goto L1e
            r1 = 23
            boolean r1 = com.yandex.metrica.impl.p023ob.C3658U2.m19211a(r1)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L19
            com.yandex.metrica.impl.ob.b2$d r2 = m19631a(r2)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L19:
            com.yandex.metrica.impl.ob.b2$d r2 = m19635b(r2)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 != 0) goto L22
            goto L23
        L22:
            r0 = r2
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3834b2.m19630a(android.content.Context):com.yandex.metrica.impl.ob.b2$d");
    }

    /* renamed from: a */
    public static d m19631a(ConnectivityManager connectivityManager) {
        d dVar = d.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (m19633a(connectivityManager, activeNetwork)) {
            return d.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return dVar;
        }
        for (Integer num : f44773c.m18114a()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return f44773c.m18113a(num);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static boolean m19633a(@NonNull ConnectivityManager connectivityManager, @Nullable Network network) {
        if (C3658U2.m19211a(29)) {
            return network == null;
        }
        if (network == null) {
            return true;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
        return (networkInfo == null || networkInfo.isConnected()) ? false : true;
    }
}
