package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class ViewGroupUtils {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f3093a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f3094b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1514a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m1514a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
