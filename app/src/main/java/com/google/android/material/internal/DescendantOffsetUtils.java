package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class DescendantOffsetUtils {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f18297a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f18298b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m10143a(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m10145c(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m10144b(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m10144b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    public static void m10145c(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        ThreadLocal<Matrix> threadLocal = f18297a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m10144b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f18298b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
