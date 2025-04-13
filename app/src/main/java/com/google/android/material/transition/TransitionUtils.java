package com.google.android.material.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.transition.Transition;
import com.google.android.material.motion.MotionUtils;
import p000a.C0000a;

/* loaded from: classes.dex */
class TransitionUtils {

    /* renamed from: a */
    public static final RectF f19453a = new RectF();

    public interface CanvasOperation {
        /* renamed from: a */
        void mo10592a(Canvas canvas);
    }

    public interface CornerSizeBinaryOperator {
    }

    /* renamed from: a */
    public static View m10599a(View view, @IdRes int i2) {
        String resourceName = view.getResources().getResourceName(i2);
        while (view != null) {
            if (view.getId() != i2) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(C0000a.m14k(resourceName, " is not a valid ancestor"));
    }

    /* renamed from: b */
    public static RectF m10600b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* renamed from: c */
    public static float m10601c(float f2, float f3, float f4) {
        return C0000a.m4a(f3, f2, f4, f2);
    }

    /* renamed from: d */
    public static float m10602d(float f2, float f3, @FloatRange float f4, @FloatRange float f5, @FloatRange float f6) {
        return m10603e(f2, f3, f4, f5, f6, false);
    }

    /* renamed from: e */
    public static float m10603e(float f2, float f3, @FloatRange float f4, @FloatRange float f5, @FloatRange float f6, boolean z) {
        return (!z || (f6 >= 0.0f && f6 <= 1.0f)) ? f6 < f4 ? f2 : f6 > f5 ? f3 : m10601c(f2, f3, (f6 - f4) / (f5 - f4)) : m10601c(f2, f3, f6);
    }

    /* renamed from: f */
    public static int m10604f(int i2, int i3, @FloatRange float f2, @FloatRange float f3, @FloatRange float f4) {
        return f4 < f2 ? i2 : f4 > f3 ? i3 : (int) m10601c(i2, i3, (f4 - f2) / (f3 - f2));
    }

    /* renamed from: g */
    public static boolean m10605g(Transition transition, Context context, @AttrRes int i2) {
        int m10184c;
        if (i2 == 0 || transition.f6267d != -1 || (m10184c = MotionUtils.m10184c(context, i2, -1)) == -1) {
            return false;
        }
        transition.mo4229G(m10184c);
        return true;
    }

    /* renamed from: h */
    public static void m10606h(Canvas canvas, Rect rect, float f2, float f3, float f4, int i2, CanvasOperation canvasOperation) {
        if (i2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f4, f4);
        if (i2 < 255) {
            RectF rectF = f19453a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i2);
        }
        canvasOperation.mo10592a(canvas);
        canvas.restoreToCount(save);
    }
}
