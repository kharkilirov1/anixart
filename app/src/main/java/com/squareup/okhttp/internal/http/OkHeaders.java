package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.internal.Platform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class OkHeaders {

    /* renamed from: a */
    public static final Comparator<String> f25176a = new Comparator<String>() { // from class: com.squareup.okhttp.internal.http.OkHeaders.1
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == str4) {
                return 0;
            }
            if (str3 == null) {
                return -1;
            }
            if (str4 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str3, str4);
        }
    };

    /* renamed from: b */
    public static final String f25177b;

    /* renamed from: c */
    public static final String f25178c;

    static {
        Objects.requireNonNull(Platform.f24960a);
        f25177b = "OkHttp-Sent-Millis";
        f25178c = "OkHttp-Received-Millis";
    }

    /* renamed from: a */
    public static Map<String, List<String>> m14007a(Headers headers, String str) {
        TreeMap treeMap = new TreeMap(f25176a);
        int m13891b = headers.m13891b();
        for (int i2 = 0; i2 < m13891b; i2++) {
            String m13890a = headers.m13890a(i2);
            String m13892c = headers.m13892c(i2);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(m13890a);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(m13892c);
            treeMap.put(m13890a, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
