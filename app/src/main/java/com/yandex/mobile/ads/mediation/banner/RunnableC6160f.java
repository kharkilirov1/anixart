package com.yandex.mobile.ads.mediation.banner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.mediation.banner.C6155a;
import com.yandex.mobile.ads.mediation.banner.C6162h;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.banner.f */
/* loaded from: classes3.dex */
final class RunnableC6160f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f57475b;

    /* renamed from: c */
    public final /* synthetic */ C6162h.a f57476c;

    /* renamed from: d */
    public final /* synthetic */ C6162h f57477d;

    public RunnableC6160f(C6162h c6162h, View view, C6155a.a aVar) {
        this.f57477d = c6162h;
        this.f57475b = view;
        this.f57476c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        weakReference = this.f57477d.f57483b;
        ViewGroup viewGroup = (ViewGroup) weakReference.get();
        if (viewGroup != null && viewGroup.indexOfChild(this.f57475b) == -1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            viewGroup.addView(this.f57475b, layoutParams);
            viewGroup.setVisibility(0);
            this.f57475b.setVisibility(0);
        }
        C6162h c6162h = this.f57477d;
        View view = this.f57475b;
        C6162h.a aVar = this.f57476c;
        Objects.requireNonNull(c6162h);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6161g(c6162h, view, aVar));
    }
}
