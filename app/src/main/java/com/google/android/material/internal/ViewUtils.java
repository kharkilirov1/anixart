package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

@RestrictTo
/* loaded from: classes.dex */
public class ViewUtils {

    /* renamed from: com.google.android.material.internal.ViewUtils$2 */
    class C13312 implements OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo9833a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
            ViewUtils.m10171h(view);
            ViewCompat.m2226t0(view, relativePadding.f18372a, relativePadding.f18373b, relativePadding.f18374c, relativePadding.f18375d);
            return windowInsetsCompat;
        }
    }

    public interface OnApplyWindowInsetsListener {
        /* renamed from: a */
        WindowInsetsCompat mo9833a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    /* renamed from: a */
    public static void m10164a(@NonNull View view, @NonNull final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(ViewCompat.m2159B(view), view.getPaddingTop(), ViewCompat.m2157A(view), view.getPaddingBottom());
        ViewCompat.m2224s0(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            /* renamed from: a */
            public WindowInsetsCompat mo433a(View view2, WindowInsetsCompat windowInsetsCompat) {
                return OnApplyWindowInsetsListener.this.mo9833a(view2, windowInsetsCompat, new RelativePadding(relativePadding));
            }
        });
        if (ViewCompat.m2173M(view)) {
            ViewCompat.m2192c0(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewCompat.m2192c0(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    /* renamed from: b */
    public static float m10165b(@NonNull Context context, @Dimension int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    @Nullable
    /* renamed from: c */
    public static ViewGroup m10166c(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    /* renamed from: d */
    public static ViewOverlayImpl m10167d(@NonNull View view) {
        return m10168e(m10166c(view));
    }

    @Nullable
    /* renamed from: e */
    public static ViewOverlayImpl m10168e(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    /* renamed from: f */
    public static float m10169f(@NonNull View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += ViewCompat.m2221r((View) parent);
        }
        return f2;
    }

    /* renamed from: g */
    public static void m10170g(@NonNull View view) {
        WindowInsetsControllerCompat m2167G = ViewCompat.m2167G(view);
        if (m2167G != null) {
            m2167G.m2469a(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.m1674g(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: h */
    public static boolean m10171h(View view) {
        return ViewCompat.m2231w(view) == 1;
    }

    /* renamed from: i */
    public static PorterDuff.Mode m10172i(int i2, PorterDuff.Mode mode) {
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

    /* renamed from: j */
    public static void m10173j(@NonNull final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static class RelativePadding {

        /* renamed from: a */
        public int f18372a;

        /* renamed from: b */
        public int f18373b;

        /* renamed from: c */
        public int f18374c;

        /* renamed from: d */
        public int f18375d;

        public RelativePadding(int i2, int i3, int i4, int i5) {
            this.f18372a = i2;
            this.f18373b = i3;
            this.f18374c = i4;
            this.f18375d = i5;
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.f18372a = relativePadding.f18372a;
            this.f18373b = relativePadding.f18373b;
            this.f18374c = relativePadding.f18374c;
            this.f18375d = relativePadding.f18375d;
        }
    }
}
