package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class PointerIconCompat {

    /* renamed from: a */
    public final PointerIcon f3637a;

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static PointerIcon m2152a(Bitmap bitmap, float f2, float f3) {
            return PointerIcon.create(bitmap, f2, f3);
        }

        @DoNotInline
        /* renamed from: b */
        public static PointerIcon m2153b(Context context, int i2) {
            return PointerIcon.getSystemIcon(context, i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static PointerIcon m2154c(Resources resources, int i2) {
            return PointerIcon.load(resources, i2);
        }
    }

    public PointerIconCompat(PointerIcon pointerIcon) {
        this.f3637a = pointerIcon;
    }

    @NonNull
    /* renamed from: a */
    public static PointerIconCompat m2151a(@NonNull Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new PointerIconCompat(Api24Impl.m2153b(context, i2)) : new PointerIconCompat(null);
    }
}
