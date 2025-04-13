package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class CursorWindowCompat {

    @RequiresApi
    public static class Api15Impl {
        @DoNotInline
        /* renamed from: a */
        public static CursorWindow m1758a(String str) {
            return new CursorWindow(str);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static CursorWindow m1759a(String str, long j2) {
            return new CursorWindow(str, j2);
        }
    }
}
