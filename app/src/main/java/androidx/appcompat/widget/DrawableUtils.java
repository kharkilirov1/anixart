package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public class DrawableUtils {

    /* renamed from: a */
    public static final int[] f1295a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f1296b = new int[0];

    /* renamed from: c */
    public static final Rect f1297c = new Rect();

    @RequiresApi
    public static class Api18Impl {

        /* renamed from: a */
        public static final boolean f1298a;

        /* renamed from: b */
        public static final Method f1299b;

        /* renamed from: c */
        public static final Field f1300c;

        /* renamed from: d */
        public static final Field f1301d;

        /* renamed from: e */
        public static final Field f1302e;

        /* renamed from: f */
        public static final Field f1303f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = 1
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r2
                r8 = 0
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1299b = r4
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1300c = r5
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1301d = r6
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1302e = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1303f = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1298a = r0
                goto L64
            L58:
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1299b = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1300c = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1301d = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1302e = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1303f = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.f1298a = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DrawableUtils.Api18Impl.<clinit>():void");
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static Insets m853a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static void m849a(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            m850b(drawable);
        } else {
            if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            m850b(drawable);
        }
    }

    /* renamed from: b */
    public static void m850b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1295a);
        } else {
            drawable.setState(f1296b);
        }
        drawable.setState(state);
    }

    @NonNull
    /* renamed from: c */
    public static Rect m851c(@NonNull Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Insets m853a = Api29Impl.m853a(drawable);
            return new Rect(m853a.left, m853a.top, m853a.right, m853a.bottom);
        }
        Drawable m1844p = DrawableCompat.m1844p(drawable);
        boolean z = Api18Impl.f1298a;
        if (i2 < 29 && Api18Impl.f1298a) {
            try {
                Object invoke = Api18Impl.f1299b.invoke(m1844p, new Object[0]);
                if (invoke != null) {
                    return new Rect(Api18Impl.f1300c.getInt(invoke), Api18Impl.f1301d.getInt(invoke), Api18Impl.f1302e.getInt(invoke), Api18Impl.f1303f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1297c;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m852d(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
