package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class BottomSheetDialog extends AppCompatDialog {

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> f17659f;

    /* renamed from: g */
    public FrameLayout f17660g;

    /* renamed from: h */
    public CoordinatorLayout f17661h;

    /* renamed from: i */
    public FrameLayout f17662i;

    /* renamed from: j */
    public boolean f17663j;

    /* renamed from: k */
    public boolean f17664k;

    /* renamed from: l */
    public boolean f17665l;

    /* renamed from: m */
    public EdgeToEdgeCallback f17666m;

    /* renamed from: n */
    public boolean f17667n;

    /* renamed from: o */
    @NonNull
    public BottomSheetBehavior.BottomSheetCallback f17668o;

    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        @Nullable
        public final Boolean f17673a;

        /* renamed from: b */
        @NonNull
        public final WindowInsetsCompat f17674b;

        /* renamed from: c */
        @Nullable
        public Window f17675c;

        /* renamed from: d */
        public boolean f17676d;

        public EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat, C12331 c12331) {
            this.f17674b = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.m9838x(view).f17622i;
            ColorStateList m10290m = materialShapeDrawable != null ? materialShapeDrawable.m10290m() : ViewCompat.m2213n(view);
            if (m10290m != null) {
                this.f17673a = Boolean.valueOf(MaterialColors.m9972e(m10290m.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f17673a = Boolean.valueOf(MaterialColors.m9972e(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f17673a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: a */
        public void mo9858a(@NonNull View view) {
            m9864d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: b */
        public void mo9859b(@NonNull View view, float f2) {
            m9864d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: c */
        public void mo9860c(@NonNull View view, int i2) {
            m9864d(view);
        }

        /* renamed from: d */
        public final void m9864d(View view) {
            if (view.getTop() < this.f17674b.m2428i()) {
                Window window = this.f17675c;
                if (window != null) {
                    Boolean bool = this.f17673a;
                    EdgeToEdgeUtils.m10146a(window, bool == null ? this.f17676d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f17674b.m2428i() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f17675c;
                if (window2 != null) {
                    EdgeToEdgeUtils.m10146a(window2, this.f17676d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: e */
        public void m9865e(@Nullable Window window) {
            if (this.f17675c == window) {
                return;
            }
            this.f17675c = window;
            if (window != null) {
                this.f17676d = new WindowInsetsControllerCompat(window, window.getDecorView()).m2470b();
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.f17667n = getContext().getTheme().obtainStyledAttributes(new int[]{C2507R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f17659f == null) {
            m9862g();
        }
        super.cancel();
    }

    /* renamed from: g */
    public final FrameLayout m9862g() {
        if (this.f17660g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C2507R.layout.design_bottom_sheet_dialog, null);
            this.f17660g = frameLayout;
            this.f17661h = (CoordinatorLayout) frameLayout.findViewById(C2507R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f17660g.findViewById(C2507R.id.design_bottom_sheet);
            this.f17662i = frameLayout2;
            BottomSheetBehavior<FrameLayout> m9838x = BottomSheetBehavior.m9838x(frameLayout2);
            this.f17659f = m9838x;
            m9838x.m9851s(this.f17668o);
            this.f17659f.m9841C(this.f17663j);
        }
        return this.f17660g;
    }

    /* renamed from: h */
    public final View m9863h(int i2, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        m9862g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f17660g.findViewById(C2507R.id.coordinator);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f17667n) {
            ViewCompat.m2224s0(this.f17662i, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                /* renamed from: a */
                public WindowInsetsCompat mo433a(View view2, WindowInsetsCompat windowInsetsCompat) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    EdgeToEdgeCallback edgeToEdgeCallback = bottomSheetDialog.f17666m;
                    if (edgeToEdgeCallback != null) {
                        bottomSheetDialog.f17659f.f17606V.remove(edgeToEdgeCallback);
                    }
                    BottomSheetDialog bottomSheetDialog2 = BottomSheetDialog.this;
                    bottomSheetDialog2.f17666m = new EdgeToEdgeCallback(bottomSheetDialog2.f17662i, windowInsetsCompat, null);
                    BottomSheetDialog bottomSheetDialog3 = BottomSheetDialog.this;
                    bottomSheetDialog3.f17666m.m9865e(bottomSheetDialog3.getWindow());
                    BottomSheetDialog bottomSheetDialog4 = BottomSheetDialog.this;
                    bottomSheetDialog4.f17659f.m9851s(bottomSheetDialog4.f17666m);
                    return windowInsetsCompat;
                }
            });
        }
        this.f17662i.removeAllViews();
        if (layoutParams == null) {
            this.f17662i.addView(view);
        } else {
            this.f17662i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C2507R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f17663j && bottomSheetDialog.isShowing()) {
                    BottomSheetDialog bottomSheetDialog2 = BottomSheetDialog.this;
                    if (!bottomSheetDialog2.f17665l) {
                        TypedArray obtainStyledAttributes = bottomSheetDialog2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        bottomSheetDialog2.f17664k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        bottomSheetDialog2.f17665l = true;
                    }
                    if (bottomSheetDialog2.f17664k) {
                        BottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        ViewCompat.m2196e0(this.f17662i, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            {
                View.AccessibilityDelegate accessibilityDelegate = AccessibilityDelegateCompat.f3569c;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f3743a);
                if (!BottomSheetDialog.this.f17663j) {
                    accessibilityNodeInfoCompat.f3743a.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.f3743a.addAction(1048576);
                    accessibilityNodeInfoCompat.f3743a.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: g */
            public boolean mo2047g(View view2, int i3, Bundle bundle) {
                if (i3 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.f17663j) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.mo2047g(view2, i3, bundle);
            }
        });
        this.f17662i.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.f17660g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f17667n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f17660g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f17661h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            WindowCompat.m2404a(window, !z);
            EdgeToEdgeCallback edgeToEdgeCallback = this.f17666m;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.m9865e(window);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i2 = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i2 < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.f17666m;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.m9865e(null);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f17659f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f17595K != 5) {
            return;
        }
        bottomSheetBehavior.m9843E(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f17663j != z) {
            this.f17663j = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f17659f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m9841C(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f17663j) {
            this.f17663j = true;
        }
        this.f17664k = z;
        this.f17665l = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i2) {
        super.setContentView(m9863h(i2, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m9863h(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m9863h(0, view, layoutParams));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomSheetDialog(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.StyleRes int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968702(0x7f04007e, float:1.7546065E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017801(0x7f140289, float:1.967389E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f17663j = r0
            r3.f17664k = r0
            com.google.android.material.bottomsheet.BottomSheetDialog$5 r4 = new com.google.android.material.bottomsheet.BottomSheetDialog$5
            r4.<init>()
            r3.f17668o = r4
            r3.m456f(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969041(0x7f0401d1, float:1.7546753E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f17667n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDialog.<init>(android.content.Context, int):void");
    }
}
