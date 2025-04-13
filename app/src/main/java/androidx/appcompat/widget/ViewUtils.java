package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public class ViewUtils {

    /* renamed from: a */
    public static Method f1683a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1683a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1683a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m1006a(View view, Rect rect, Rect rect2) {
        Method method = f1683a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    /* renamed from: b */
    public static boolean m1007b(View view) {
        return ViewCompat.m2231w(view) == 1;
    }
}
