package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* loaded from: classes.dex */
public final class DrawableDecoderCompat {

    /* renamed from: a */
    public static volatile boolean f8591a = true;

    /* renamed from: a */
    public static Drawable m5196a(Context context, Context context2, @DrawableRes int i2, @Nullable Resources.Theme theme) {
        try {
            if (f8591a) {
                return AppCompatResources.m497b(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i2);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.m1671d(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            f8591a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.m1733c(context2.getResources(), i2, theme);
    }
}
