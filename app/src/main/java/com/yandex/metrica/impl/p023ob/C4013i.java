package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.C4482k;
import com.yandex.metrica.billing_interface.EnumC3119e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.i */
/* loaded from: classes2.dex */
public class C4013i {
    /* renamed from: a */
    public static boolean m20036a(@Nullable String str, @Nullable String str2) {
        int i2 = C3509O2.f43529a;
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    @Nullable
    /* renamed from: b */
    public static Integer m20039b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: c */
    public static EnumC3119e m20040c(@NonNull String str) {
        return "inapp".equals(str) ? EnumC3119e.INAPP : "subs".equals(str) ? EnumC3119e.SUBS : EnumC3119e.UNKNOWN;
    }

    /* renamed from: a */
    public static boolean m20035a(@Nullable Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: a */
    public static String m20031a(@NonNull Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    /* renamed from: a */
    public static SharedPreferences m20029a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    /* renamed from: a */
    public static boolean m20037a(@Nullable Collection<?> collection, @Nullable Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m20034a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            int type = cursor.getType(i2);
            if (type == 0) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else if (type == 1) {
                contentValues.put(columnNames[i2], Long.valueOf(cursor.getLong(i2)));
            } else if (type == 2) {
                contentValues.put(columnNames[i2], Double.valueOf(cursor.getDouble(i2)));
            } else if (type == 3) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else if (type != 4) {
                contentValues.put(columnNames[i2], cursor.getString(i2));
            } else {
                contentValues.put(columnNames[i2], cursor.getBlob(i2));
            }
        }
    }

    /* renamed from: a */
    public static long m20027a() {
        return C3454Lm.m18520c().mo18321a();
    }

    /* renamed from: a */
    public static int m20026a(long j2) {
        return ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j2 * 1000) / 1000;
    }

    @NonNull
    /* renamed from: a */
    public static List<Integer> m20032a(@NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m20033a(SharedPreferences sharedPreferences, String str, int i2) {
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).putLong(str, sharedPreferences.getInt(str, i2)).apply();
        } catch (ClassCastException unused) {
        }
    }

    /* renamed from: a */
    public static long m20028a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0L;
        } finally {
            C3658U2.m19207a(cursor);
        }
    }

    @NonNull
    /* renamed from: a */
    public static int[] m20038a(@NonNull List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static C4482k m20030a(String str) {
        C4482k c4482k = new C4482k();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c4482k.f47164a = jSONObject.optString("UserInfo.UserId", null);
                c4482k.f47165b = jSONObject.optString("UserInfo.Type", null);
                c4482k.f47166c = C4452ym.m21254b(jSONObject.optJSONObject("UserInfo.Options"));
            } catch (Throwable unused) {
            }
        }
        return c4482k;
    }
}
