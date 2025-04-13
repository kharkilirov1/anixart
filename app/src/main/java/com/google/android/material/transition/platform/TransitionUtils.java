package com.google.android.material.transition.platform;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.Transition;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;
import com.google.android.material.motion.MotionUtils;
import p000a.C0000a;

@RequiresApi
/* loaded from: classes.dex */
class TransitionUtils {

    /* renamed from: a */
    public static final RectF f19584a = new RectF();

    public interface CanvasOperation {
        /* renamed from: a */
        void mo10624a(Canvas canvas);
    }

    public interface CornerSizeBinaryOperator {
    }

    /* renamed from: a */
    public static View m10633a(View view, @IdRes int i2) {
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
    public static RectF m10634b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* renamed from: c */
    public static float m10635c(float f2, float f3, float f4) {
        return C0000a.m4a(f3, f2, f4, f2);
    }

    /* renamed from: d */
    public static float m10636d(float f2, float f3, @FloatRange float f4, @FloatRange float f5, @FloatRange float f6) {
        return m10637e(f2, f3, f4, f5, f6, false);
    }

    /* renamed from: e */
    public static float m10637e(float f2, float f3, @FloatRange float f4, @FloatRange float f5, @FloatRange float f6, boolean z) {
        return (!z || (f6 >= 0.0f && f6 <= 1.0f)) ? f6 < f4 ? f2 : f6 > f5 ? f3 : m10635c(f2, f3, (f6 - f4) / (f5 - f4)) : m10635c(f2, f3, f6);
    }

    /* renamed from: f */
    public static int m10638f(int i2, int i3, @FloatRange float f2, @FloatRange float f3, @FloatRange float f4) {
        return f4 < f2 ? i2 : f4 > f3 ? i3 : (int) m10635c(i2, i3, (f4 - f2) / (f3 - f2));
    }

    /* renamed from: g */
    public static boolean m10639g(Transition transition, Context context, @AttrRes int i2) {
        int m10184c;
        if (i2 == 0 || transition.getDuration() != -1 || (m10184c = MotionUtils.m10184c(context, i2, -1)) == -1) {
            return false;
        }
        transition.setDuration(m10184c);
        return true;
    }

    /* renamed from: h */
    public static boolean m10640h(Transition transition, Context context, @AttrRes int i2, TimeInterpolator timeInterpolator) {
        if (i2 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(MotionUtils.m10185d(context, i2, timeInterpolator));
        return true;
    }

    /* renamed from: i */
    public static void m10641i(Canvas canvas, Rect rect, float f2, float f3, float f4, int i2, CanvasOperation canvasOperation) {
        if (i2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f4, f4);
        if (i2 < 255) {
            RectF rectF = f19584a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i2);
        }
        canvasOperation.mo10624a(canvas);
        canvas.restoreToCount(save);
    }
}
