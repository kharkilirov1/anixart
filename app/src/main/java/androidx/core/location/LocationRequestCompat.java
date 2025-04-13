package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LocationRequestCompat {

    @RequiresApi
    public static class Api19Impl {

        /* renamed from: a */
        public static Class<?> f3440a;

        /* renamed from: b */
        public static Method f3441b;

        /* renamed from: c */
        public static Method f3442c;

        /* renamed from: d */
        public static Method f3443d;

        /* renamed from: e */
        public static Method f3444e;

        /* renamed from: f */
        public static Method f3445f;
    }

    @RequiresApi
    public static class Api31Impl {
        @DoNotInline
        /* renamed from: a */
        public static LocationRequest m1932a(LocationRequestCompat locationRequestCompat) {
            Objects.requireNonNull(locationRequestCompat);
            return new LocationRequest.Builder(0L).setQuality(0).setMinUpdateIntervalMillis(0L).setDurationMillis(0L).setMaxUpdates(0).setMinUpdateDistanceMeters(0.0f).setMaxUpdateDelayMillis(0L).build();
        }
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Quality {
    }

    @Nullable
    @RequiresApi
    @SuppressLint
    /* renamed from: a */
    public LocationRequest m1931a(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m1932a(this);
        }
        Object obj = null;
        try {
            if (Api19Impl.f3440a == null) {
                Api19Impl.f3440a = Class.forName("android.location.LocationRequest");
            }
            if (Api19Impl.f3441b == null) {
                Method declaredMethod = Api19Impl.f3440a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                Api19Impl.f3441b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object invoke = Api19Impl.f3441b.invoke(null, str, 0L, Float.valueOf(0.0f), Boolean.FALSE);
            if (invoke != null) {
                if (Api19Impl.f3442c == null) {
                    Method declaredMethod2 = Api19Impl.f3440a.getDeclaredMethod("setQuality", Integer.TYPE);
                    Api19Impl.f3442c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Api19Impl.f3442c.invoke(invoke, 0);
                if (Api19Impl.f3443d == null) {
                    Method declaredMethod3 = Api19Impl.f3440a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    Api19Impl.f3443d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Api19Impl.f3443d.invoke(invoke, 0L);
                if (Api19Impl.f3444e == null) {
                    Method declaredMethod4 = Api19Impl.f3440a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                    Api19Impl.f3444e = declaredMethod4;
                    declaredMethod4.setAccessible(true);
                }
                Api19Impl.f3444e.invoke(invoke, 0);
                if (Api19Impl.f3445f == null) {
                    Method declaredMethod5 = Api19Impl.f3440a.getDeclaredMethod("setExpireIn", Long.TYPE);
                    Api19Impl.f3445f = declaredMethod5;
                    declaredMethod5.setAccessible(true);
                }
                Api19Impl.f3445f.invoke(invoke, 0L);
                obj = invoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return (LocationRequest) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        Objects.requireNonNull((LocationRequestCompat) obj);
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public int hashCode() {
        int i2 = (int) 0;
        return ((0 + i2) * 31) + i2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        sb.append("@");
        TimeUtils.m2038b(0L, sb);
        sb.append(", duration=");
        TimeUtils.m2038b(0L, sb);
        sb.append(", maxUpdates=");
        sb.append(0);
        if (0.0f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(0.0f);
        }
        sb.append(']');
        return sb.toString();
    }
}
