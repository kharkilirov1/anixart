package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class mr0 {
    /* renamed from: a */
    public static void m26759a(@NonNull PopupMenu popupMenu) {
        if (Build.VERSION.SDK_INT >= 29) {
            popupMenu.setForceShowIcon(true);
            return;
        }
        Object obj = null;
        try {
            Field declaredField = popupMenu.getClass().getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            obj = declaredField.get(popupMenu);
            declaredField.setAccessible(false);
        } catch (Exception unused) {
            n60.m26813f("Field %s isn't found when using reflection", "mPopup");
        }
        if (obj != null) {
            try {
                obj.getClass().getMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
            } catch (Exception unused2) {
                n60.m26813f("Method setForceShowIcon isn't found when using reflection", new Object[0]);
            }
        }
    }
}
