package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes.dex */
public final class MenuCompat {

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m2103a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m2102a(@NonNull Menu menu, boolean z) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.m2103a(menu, z);
        }
    }
}
