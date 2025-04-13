package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
final class x20 {

    /* renamed from: a */
    @NonNull
    private final bh1 f56344a = new bh1();

    /* renamed from: b */
    @NonNull
    private final C5121gf f56345b = new C5121gf();

    /* renamed from: c */
    @NonNull
    private final C6084yo f56346c = new C6084yo();

    /* renamed from: d */
    @NonNull
    private final WeakHashMap<FrameLayout, WeakReference<C5075ff>> f56347d = new WeakHashMap<>();

    /* renamed from: e */
    @NonNull
    private final WeakHashMap<FrameLayout, WeakReference<y20>> f56348e = new WeakHashMap<>();

    /* renamed from: a */
    public final void m29658a(@NonNull FrameLayout frameLayout, @NonNull aa1 aa1Var, boolean z) {
        y20 y20Var;
        WeakReference<C5075ff> weakReference = this.f56347d.get(frameLayout);
        C5075ff c5075ff = weakReference != null ? weakReference.get() : null;
        if (c5075ff == null) {
            c5075ff = new C5075ff(frameLayout.getContext(), this.f56346c);
            this.f56347d.put(frameLayout, new WeakReference<>(c5075ff));
            frameLayout.addView(c5075ff);
        }
        Objects.requireNonNull(this.f56345b);
        c5075ff.setColor(z ? -65536 : -16711936);
        if (!z) {
            WeakReference<y20> weakReference2 = this.f56348e.get(frameLayout);
            y20Var = weakReference2 != null ? weakReference2.get() : null;
            if (y20Var != null) {
                this.f56348e.remove(frameLayout);
                frameLayout.removeView(y20Var);
                return;
            }
            return;
        }
        WeakReference<y20> weakReference3 = this.f56348e.get(frameLayout);
        y20Var = weakReference3 != null ? weakReference3.get() : null;
        if (y20Var == null) {
            y20Var = new y20(frameLayout.getContext());
            this.f56348e.put(frameLayout, new WeakReference<>(y20Var));
            frameLayout.addView(y20Var);
        }
        y20Var.setDescription(this.f56344a.m22833a(aa1Var));
    }

    /* renamed from: a */
    public final void m29657a(@NonNull FrameLayout frameLayout) {
        WeakReference<C5075ff> weakReference = this.f56347d.get(frameLayout);
        C5075ff c5075ff = weakReference != null ? weakReference.get() : null;
        if (c5075ff != null) {
            this.f56347d.remove(frameLayout);
            frameLayout.removeView(c5075ff);
        }
        WeakReference<y20> weakReference2 = this.f56348e.get(frameLayout);
        y20 y20Var = weakReference2 != null ? weakReference2.get() : null;
        if (y20Var != null) {
            this.f56348e.remove(frameLayout);
            frameLayout.removeView(y20Var);
        }
    }
}
