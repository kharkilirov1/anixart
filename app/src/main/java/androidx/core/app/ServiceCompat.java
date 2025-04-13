package androidx.core.app;

import android.app.Service;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ServiceCompat {

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1658a(Service service, int i2) {
            service.stopForeground(i2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface StopForegroundFlags {
    }
}
