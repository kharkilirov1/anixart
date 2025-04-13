package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
class ViewUtils {

    /* renamed from: a */
    public static final ViewUtilsBase f6341a;

    /* renamed from: b */
    public static final Property<View, Float> f6342b;

    /* renamed from: c */
    public static final Property<View, Rect> f6343c;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f6341a = new ViewUtilsApi29();
        } else if (i2 >= 23) {
            f6341a = new ViewUtilsApi23();
        } else if (i2 >= 22) {
            f6341a = new ViewUtilsApi22();
        } else {
            f6341a = new ViewUtilsApi21();
        }
        f6342b = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(ViewUtils.m4272a(view));
            }

            @Override // android.util.Property
            public void set(View view, Float f2) {
                float floatValue = f2.floatValue();
                ViewUtils.f6341a.mo4277f(view, floatValue);
            }
        };
        f6343c = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            public Rect get(View view) {
                return ViewCompat.m2217p(view);
            }

            @Override // android.util.Property
            public void set(View view, Rect rect) {
                ViewCompat.m2210l0(view, rect);
            }
        };
    }

    /* renamed from: a */
    public static float m4272a(@NonNull View view) {
        return f6341a.mo4275b(view);
    }

    /* renamed from: b */
    public static void m4273b(@NonNull View view, int i2, int i3, int i4, int i5) {
        f6341a.mo4281e(view, i2, i3, i4, i5);
    }
}
