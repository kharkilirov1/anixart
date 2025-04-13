package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class BundleCompat {

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static IBinder m1573a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1574b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint
    public static class BeforeApi18Impl {
    }

    @Nullable
    /* renamed from: a */
    public static IBinder m1571a(@NonNull Bundle bundle, @Nullable String str) {
        return Api18Impl.m1573a(bundle, str);
    }

    /* renamed from: b */
    public static void m1572b(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Api18Impl.m1574b(bundle, str, iBinder);
    }
}
