package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class ResourcesFlusher {

    /* renamed from: a */
    public static Field f534a;

    /* renamed from: b */
    public static boolean f535b;

    /* renamed from: c */
    public static Class<?> f536c;

    /* renamed from: d */
    public static boolean f537d;

    /* renamed from: e */
    public static Field f538e;

    /* renamed from: f */
    public static boolean f539f;

    /* renamed from: g */
    public static Field f540g;

    /* renamed from: h */
    public static boolean f541h;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m465a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    @RequiresApi
    /* renamed from: a */
    public static void m464a(@NonNull Object obj) {
        if (!f537d) {
            try {
                f536c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f537d = true;
        }
        Class<?> cls = f536c;
        if (cls == null) {
            return;
        }
        if (!f539f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f538e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f539f = true;
        }
        Field field = f538e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            Api16Impl.m465a(longSparseArray);
        }
    }
}
