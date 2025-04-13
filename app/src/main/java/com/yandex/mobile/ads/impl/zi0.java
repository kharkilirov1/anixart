package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.r71;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class zi0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    @NonNull
    private final WeakReference<View> f57202a;

    /* renamed from: b */
    @NonNull
    private final r71.InterfaceC5677a f57203b;

    /* renamed from: c */
    @Nullable
    private Integer f57204c;

    public zi0(@NonNull View view, @NonNull r71.InterfaceC5677a interfaceC5677a) {
        this.f57202a = new WeakReference<>(view);
        this.f57203b = interfaceC5677a;
    }

    /* renamed from: a */
    public final void m30192a() {
        View view = this.f57202a.get();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f57202a.get();
        if (view != null) {
            Integer valueOf = Integer.valueOf(view.getVisibility());
            if (valueOf.equals(this.f57204c)) {
                return;
            }
            this.f57204c = valueOf;
            if (this.f57203b != null) {
                if (valueOf.intValue() == 0) {
                    this.f57203b.mo27860a();
                } else {
                    this.f57203b.mo27861b();
                }
            }
        }
    }
}
