package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

/* loaded from: classes.dex */
public final class EnvironmentCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1952a(File file) {
            return Environment.getStorageState(file);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1953a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
