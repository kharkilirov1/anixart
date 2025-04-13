package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public class ObjectsCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m2024a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m2025b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m2022a(@Nullable Object obj, @Nullable Object obj2) {
        return Api19Impl.m2024a(obj, obj2);
    }

    /* renamed from: b */
    public static int m2023b(@Nullable Object... objArr) {
        return Api19Impl.m2025b(objArr);
    }
}
