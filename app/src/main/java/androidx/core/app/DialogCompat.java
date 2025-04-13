package androidx.core.app;

import android.app.Dialog;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class DialogCompat {

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m1577a(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }
}
