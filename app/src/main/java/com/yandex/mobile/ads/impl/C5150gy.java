package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.gy */
/* loaded from: classes3.dex */
public final class C5150gy {

    /* renamed from: com.yandex.mobile.ads.impl.gy$a */
    public interface a<T> {
        @Nullable
        /* renamed from: a */
        T mo25002a(String str);
    }

    /* renamed from: a */
    public static boolean m24997a(@NonNull Map map, @NonNull int i2) {
        String str = (String) map.get(j00.m25754b(i2));
        if (str == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)I */
    /* renamed from: b */
    public static int m24998b(Map map, int i2) {
        String str = (String) map.get(j00.m25754b(i2));
        int i3 = C5427m6.f52583b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/Integer; */
    @Nullable
    /* renamed from: c */
    public static Integer m24999c(@NonNull Map map, @NonNull int i2) {
        String str = (String) map.get(j00.m25754b(i2));
        int i3 = C5427m6.f52583b;
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Object;)Ljava/lang/String; */
    @Nullable
    /* renamed from: d */
    public static String m25000d(@NonNull Map map, @NonNull int i2) {
        ArrayList m25001e = m25001e(map, i2);
        if (m25001e.isEmpty()) {
            return null;
        }
        return (String) m25001e.get(0);
    }

    @NonNull
    /* renamed from: e */
    public static ArrayList m25001e(Map map, int i2) {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(j00.m25754b(i2));
        if (str != null && !str.isEmpty()) {
            Object split = str.split(",");
            if (split == null) {
                split = new Object[0];
            }
            for (String str2 : (String[]) split) {
                try {
                    String decode = URLDecoder.decode(str2.trim(), "UTF-8");
                    if (decode != null) {
                        arrayList.add(decode);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public static ArrayList m24996a(Map map, int i2, a aVar) {
        ArrayList arrayList = new ArrayList();
        String str = (String) map.get(j00.m25754b(i2));
        if (str != null && !str.isEmpty()) {
            Object split = str.split(",");
            if (split == null) {
                split = new Object[0];
            }
            for (String str2 : (String[]) split) {
                try {
                    String decode = URLDecoder.decode(str2.trim(), "UTF-8");
                    if (aVar.mo25002a(decode) != null) {
                        arrayList.add(aVar.mo25002a(decode));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m24995a(@Nullable Map<String, String> map) {
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
}
