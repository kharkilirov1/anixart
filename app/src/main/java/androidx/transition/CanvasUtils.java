package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class CanvasUtils {

    /* renamed from: a */
    public static Method f6133a;

    /* renamed from: b */
    public static Method f6134b;

    /* renamed from: c */
    public static boolean f6135c;

    @SuppressLint
    /* renamed from: a */
    public static void m4185a(@NonNull Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i2 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f6135c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f6133a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f6134b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6135c = true;
        }
        if (z) {
            try {
                Method method2 = f6133a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        if (z || (method = f6134b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
