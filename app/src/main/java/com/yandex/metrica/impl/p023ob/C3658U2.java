package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.U2 */
/* loaded from: classes2.dex */
public final class C3658U2 {

    /* renamed from: a */
    private static final C3729Wn f44127a = new C3729Wn();

    /* renamed from: a */
    public static String m19198a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo == null ? "0.0" : packageInfo.versionName;
    }

    /* renamed from: a */
    public static boolean m19212a(Object obj) {
        return obj != null;
    }

    /* renamed from: b */
    public static int m19216b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    @Nullable
    /* renamed from: c */
    public static <K, V> Map<K, V> m19219c(@Nullable Map<K, V> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: a */
    public static boolean m19211a(int i2) {
        return Build.VERSION.SDK_INT >= i2;
    }

    /* renamed from: b */
    public static boolean m19218b(Map map) {
        return map == null || map.size() == 0;
    }

    /* renamed from: a */
    public static void m19209a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m19217b(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static void m19210a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19207a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m19213a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m19208a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> boolean m19215a(@Nullable T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    /* renamed from: a */
    public static boolean m19214a(@Nullable byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    @NonNull
    /* renamed from: a */
    public static String m19199a(@Nullable String str) {
        if (TextUtils.isEmpty(str) || str.length() != 36) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
        return sb.toString();
    }

    @NonNull
    /* renamed from: a */
    public static Set<Integer> m19206a(@NonNull int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int i2 : iArr) {
            hashSet.add(Integer.valueOf(i2));
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: a */
    public static String m19200a(@Nullable String str, int i2) {
        if (str == null) {
            return null;
        }
        return str.length() > i2 ? str.substring(0, i2) : str;
    }

    @NonNull
    /* renamed from: a */
    public static List<String> m19204a(@NonNull String... strArr) {
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, strArr);
        return Collections.unmodifiableList(new ArrayList(treeSet));
    }

    @Nullable
    /* renamed from: a */
    public static Object m19197a(@NonNull InterfaceC3728Wm interfaceC3728Wm, @Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return interfaceC3728Wm.mo18117a(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static <T, S> S m19196a(@NonNull InterfaceC3728Wm<T, S> interfaceC3728Wm, @NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        try {
            return (S) m19197a((InterfaceC3728Wm) interfaceC3728Wm, context.getSystemService(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static <K, V> List<Map.Entry<K, V>> m19203a(@Nullable Map<K, V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public static <K, V> Map<K, V> m19205a(@Nullable List<Map.Entry<K, V>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Map.Entry<K, V> entry : list) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Nullable
    /* renamed from: a */
    public static <T> List<T> m19202a(@Nullable Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    @NonNull
    /* renamed from: a */
    public static BigDecimal m19201a(long j2) {
        return new BigDecimal(j2).divide(new BigDecimal(1000000), 6, 6);
    }

    /* renamed from: a */
    public static double m19195a(double d, double d2) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d2 : d;
    }
}
