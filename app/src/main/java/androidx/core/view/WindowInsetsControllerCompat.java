package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* renamed from: a */
    public final Impl f3731a;

    public static class Impl {
        /* renamed from: a */
        public void mo2475a(int i2) {
        }

        /* renamed from: b */
        public boolean mo2476b() {
            return false;
        }

        /* renamed from: c */
        public void mo2477c(boolean z) {
        }

        /* renamed from: d */
        public void mo2478d(boolean z) {
        }

        /* renamed from: e */
        public void mo2479e(int i2) {
        }

        /* renamed from: f */
        public void mo2480f(int i2) {
        }
    }

    @RequiresApi
    public static class Impl20 extends Impl {

        /* renamed from: a */
        @NonNull
        public final Window f3732a;

        /* renamed from: b */
        @NonNull
        public final View f3733b;

        public Impl20(@NonNull Window window, @NonNull View view) {
            this.f3732a = window;
            this.f3733b = view;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: a */
        public void mo2475a(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 == 1) {
                        m2481g(4);
                    } else if (i3 == 2) {
                        m2481g(2);
                    } else if (i3 == 8) {
                        ((InputMethodManager) this.f3732a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3732a.getDecorView().getWindowToken(), 0);
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: e */
        public void mo2479e(int i2) {
            if (i2 == 0) {
                m2482h(6144);
                return;
            }
            if (i2 == 1) {
                m2482h(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                m2481g(RecyclerView.ViewHolder.FLAG_MOVED);
            } else {
                if (i2 != 2) {
                    return;
                }
                m2482h(RecyclerView.ViewHolder.FLAG_MOVED);
                m2481g(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: f */
        public void mo2480f(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 == 1) {
                        m2482h(4);
                        this.f3732a.clearFlags(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
                    } else if (i3 == 2) {
                        m2482h(2);
                    } else if (i3 == 8) {
                        final View view = this.f3733b;
                        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                            view.requestFocus();
                        } else {
                            view = this.f3732a.getCurrentFocus();
                        }
                        if (view == null) {
                            view = this.f3732a.findViewById(R.id.content);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: androidx.core.view.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view2 = view;
                                    ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                                }
                            });
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        public void m2481g(int i2) {
            View decorView = this.f3732a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        /* renamed from: h */
        public void m2482h(int i2) {
            View decorView = this.f3732a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }
    }

    @RequiresApi
    public static class Impl23 extends Impl20 {
        public Impl23(@NonNull Window window, @Nullable View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: b */
        public boolean mo2476b() {
            return (this.f3732a.getDecorView().getSystemUiVisibility() & RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: d */
        public void mo2478d(boolean z) {
            if (!z) {
                m2482h(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
                return;
            }
            this.f3732a.clearFlags(67108864);
            this.f3732a.addFlags(Integer.MIN_VALUE);
            m2481g(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
        }
    }

    @RequiresApi
    public static class Impl26 extends Impl23 {
        public Impl26(@NonNull Window window, @Nullable View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: c */
        public void mo2477c(boolean z) {
            if (!z) {
                m2482h(16);
                return;
            }
            this.f3732a.clearFlags(134217728);
            this.f3732a.addFlags(Integer.MIN_VALUE);
            m2481g(16);
        }
    }

    public interface OnControllableInsetsChangedListener {
    }

    @RequiresApi
    @Deprecated
    public WindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.f3731a = new Impl30(windowInsetsController, this);
    }

    /* renamed from: a */
    public void m2469a(int i2) {
        this.f3731a.mo2475a(i2);
    }

    /* renamed from: b */
    public boolean m2470b() {
        return this.f3731a.mo2476b();
    }

    /* renamed from: c */
    public void m2471c(boolean z) {
        this.f3731a.mo2477c(z);
    }

    /* renamed from: d */
    public void m2472d(boolean z) {
        this.f3731a.mo2478d(z);
    }

    /* renamed from: e */
    public void m2473e(int i2) {
        this.f3731a.mo2479e(i2);
    }

    /* renamed from: f */
    public void m2474f(int i2) {
        this.f3731a.mo2480f(i2);
    }

    public WindowInsetsControllerCompat(@NonNull Window window, @NonNull View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3731a = new Impl30(window, this);
            return;
        }
        if (i2 >= 26) {
            this.f3731a = new Impl26(window, view);
        } else if (i2 >= 23) {
            this.f3731a = new Impl23(window, view);
        } else {
            this.f3731a = new Impl20(window, view);
        }
    }

    @RequiresApi
    public static class Impl30 extends Impl {

        /* renamed from: a */
        public final WindowInsetsController f3734a;

        /* renamed from: b */
        public Window f3735b;

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1 */
        class WindowInsetsAnimationControlListenerC02641 implements WindowInsetsAnimationControlListener {
            @Override // android.view.WindowInsetsAnimationControlListener
            public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                throw null;
            }
        }

        public Impl30(@NonNull Window window, @NonNull WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f3734a = window.getInsetsController();
            this.f3735b = window;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: a */
        public void mo2475a(int i2) {
            this.f3734a.hide(i2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: b */
        public boolean mo2476b() {
            return (this.f3734a.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: c */
        public void mo2477c(boolean z) {
            if (z) {
                Window window = this.f3735b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                this.f3734a.setSystemBarsAppearance(16, 16);
                return;
            }
            Window window2 = this.f3735b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            this.f3734a.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: d */
        public void mo2478d(boolean z) {
            if (z) {
                Window window = this.f3735b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
                }
                this.f3734a.setSystemBarsAppearance(8, 8);
                return;
            }
            Window window2 = this.f3735b;
            if (window2 != null) {
                View decorView2 = window2.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            this.f3734a.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: e */
        public void mo2479e(int i2) {
            this.f3734a.setSystemBarsBehavior(i2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        /* renamed from: f */
        public void mo2480f(int i2) {
            Window window = this.f3735b;
            if (window != null && (i2 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3734a.show(i2);
        }

        public Impl30(@NonNull WindowInsetsController windowInsetsController, @NonNull WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f3734a = windowInsetsController;
        }
    }
}
