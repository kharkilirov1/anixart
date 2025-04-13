package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class k00 {
    @Nullable
    /* renamed from: a */
    public static InterfaceC6025xf.a m26002a(km0 km0Var) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = km0Var.f52034c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long m26001a = str != null ? m26001a(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < split.length) {
                String trim = split[i2].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long m26001a2 = str3 != null ? m26001a(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long m26001a3 = str4 != null ? m26001a(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j5 = currentTimeMillis + (j2 * 1000);
            if (i2 == 0) {
                Long.signum(j3);
                j4 = j5;
                j5 = (j3 * 1000) + j5;
                InterfaceC6025xf.a aVar = new InterfaceC6025xf.a();
                aVar.f56462a = km0Var.f52033b;
                aVar.f56463b = str5;
                aVar.f56467f = j4;
                aVar.f56466e = j5;
                aVar.f56464c = m26001a;
                aVar.f56465d = m26001a3;
                aVar.f56468g = map;
                aVar.f56469h = km0Var.f52035d;
                return aVar;
            }
            j4 = j5;
            InterfaceC6025xf.a aVar2 = new InterfaceC6025xf.a();
            aVar2.f56462a = km0Var.f52033b;
            aVar2.f56463b = str5;
            aVar2.f56467f = j4;
            aVar2.f56466e = j5;
            aVar2.f56464c = m26001a;
            aVar2.f56465d = m26001a3;
            aVar2.f56468g = map;
            aVar2.f56469h = km0Var.f52035d;
            return aVar2;
        }
        j4 = 0;
        if (m26001a <= 0 || m26001a2 < m26001a) {
            j5 = 0;
            InterfaceC6025xf.a aVar22 = new InterfaceC6025xf.a();
            aVar22.f56462a = km0Var.f52033b;
            aVar22.f56463b = str5;
            aVar22.f56467f = j4;
            aVar22.f56466e = j5;
            aVar22.f56464c = m26001a;
            aVar22.f56465d = m26001a3;
            aVar22.f56468g = map;
            aVar22.f56469h = km0Var.f52035d;
            return aVar22;
        }
        j5 = currentTimeMillis + (m26001a2 - m26001a);
        j4 = j5;
        InterfaceC6025xf.a aVar222 = new InterfaceC6025xf.a();
        aVar222.f56462a = km0Var.f52033b;
        aVar222.f56463b = str5;
        aVar222.f56467f = j4;
        aVar222.f56466e = j5;
        aVar222.f56464c = m26001a;
        aVar222.f56465d = m26001a3;
        aVar222.f56468g = map;
        aVar222.f56469h = km0Var.f52035d;
        return aVar222;
    }

    /* renamed from: a */
    public static long m26001a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_RFC1123, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                Object[] objArr = {str};
                boolean z = rh1.f54313a;
                n60.m26808a(e2, "Unable to parse dateStr: %s, falling back to 0", objArr);
                return 0L;
            }
            Object[] objArr2 = {str};
            boolean z2 = rh1.f54313a;
            n60.m26812e("Unable to parse dateStr: %s, falling back to 0", objArr2);
            return 0L;
        }
    }

    /* renamed from: a */
    public static String m26003a(@Nullable Map<String, String> map) {
        String str;
        if (map != null && (str = map.get("Content-Type")) != null) {
            String[] split = str.split(";", 0);
            for (int i2 = 1; i2 < split.length; i2++) {
                String[] split2 = split[i2].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }

    /* renamed from: a */
    public static Map<String, String> m26004a(InterfaceC6025xf.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f56463b;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j2 = aVar.f56465d;
        if (j2 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j2)));
        }
        return hashMap;
    }
}
