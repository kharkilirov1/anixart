package androidx.appcompat.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

@SuppressLint
/* loaded from: classes.dex */
public final class AppCompatResources {
    /* renamed from: a */
    public static ColorStateList m496a(@NonNull Context context, @ColorRes int i2) {
        Object obj = ContextCompat.f3288a;
        return ResourcesCompat.m1732b(context.getResources(), i2, context.getTheme());
    }

    @Nullable
    /* renamed from: b */
    public static Drawable m497b(@NonNull Context context, @DrawableRes int i2) {
        return ResourceManagerInternal.m883d().m890f(context, i2);
    }
}
