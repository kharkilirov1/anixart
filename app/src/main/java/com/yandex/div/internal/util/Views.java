package com.yandex.div.internal.util;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class Views {

    public interface ViewProcessor {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewSideFlags {
    }

    @NonNull
    /* renamed from: a */
    public static <T extends View> T m17399a(@NonNull View view, @IdRes int i2) {
        T t = (T) view.findViewById(i2);
        if (t != null) {
            return t;
        }
        StringBuilder m24u = C0000a.m24u("View with id [");
        m24u.append(view.getResources().getResourceName(i2));
        m24u.append("] doesn't exist");
        throw new IllegalStateException(m24u.toString());
    }
}
