package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class tg1 {

    /* renamed from: a */
    private static final eh1 f55119a = new eh1();

    /* renamed from: b */
    public static final /* synthetic */ int f55120b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.tg1$a */
    public class ViewTreeObserverOnPreDrawListenerC5802a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f55121a;

        /* renamed from: b */
        public final /* synthetic */ View f55122b;

        public ViewTreeObserverOnPreDrawListenerC5802a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f55121a = onPreDrawListener;
            this.f55122b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f55121a.onPreDraw();
            this.f55122b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m28652a(@NonNull Context context, float f2) {
        return n11.m26789a(context, 1, f2);
    }

    /* renamed from: b */
    public static int m28656b(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().heightPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m28658c(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().widthPixels + 0.0f) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    public static boolean m28660d(@NonNull View view) {
        if (view.isShown()) {
            if (view.getAlpha() != 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m28661e(@NonNull View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    /* renamed from: a */
    public static int m28651a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: a */
    public static int m28650a(int i2, float f2) {
        return Color.argb(Math.max(0, Math.min(KotlinVersion.MAX_COMPONENT_VALUE, (int) (((100.0f - f2) * 255.0f) / 100.0f))), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    /* renamed from: b */
    public static int m28657b(@NonNull View view) {
        if (view.isShown()) {
            return f55119a.m24176a(view);
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m28659c(@Nullable View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int width = view.getWidth() + i2;
        int i3 = iArr[1];
        Rect rect = new Rect(i2, i3, width, view.getHeight() + i3);
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    /* renamed from: a */
    public static void m28654a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5802a(view, onPreDrawListener));
    }

    /* renamed from: a */
    public static boolean m28655a(@Nullable View view, int i2) {
        return m28653a(view) >= i2;
    }

    /* renamed from: a */
    public static int m28653a(@Nullable View view) {
        int width;
        int height;
        if (view != null && view.isShown()) {
            int m24176a = view.isShown() ? f55119a.m24176a(view) : 0;
            if (m24176a > 0) {
                if (view.getLayoutParams().width > 0) {
                    width = view.getLayoutParams().width;
                } else {
                    width = view.getWidth();
                }
                if (view.getLayoutParams().height > 0) {
                    height = view.getLayoutParams().height;
                } else {
                    height = view.getHeight();
                }
                if (height > 0 && width > 0) {
                    return (m24176a * 100) / (height * width);
                }
            }
        }
        return 0;
    }
}
