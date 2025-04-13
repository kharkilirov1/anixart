package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class ViewGroupUtils {

    /* renamed from: a */
    public static boolean f6334a = true;

    /* renamed from: b */
    public static Method f6335b;

    /* renamed from: c */
    public static boolean f6336c;

    /* renamed from: a */
    public static void m4271a(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f6334a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f6334a = false;
            }
        }
    }
}
