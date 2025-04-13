package com.yandex.mobile.ads.mediation.banner;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.impl.hg1;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.mediation.banner.C6155a;
import com.yandex.mobile.ads.mediation.banner.C6162h;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.mediation.banner.g */
/* loaded from: classes3.dex */
final class ViewTreeObserverOnPreDrawListenerC6161g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ View f57478a;

    /* renamed from: b */
    public final /* synthetic */ C6162h.a f57479b;

    /* renamed from: c */
    public final /* synthetic */ C6162h f57480c;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference weakReference;
            weakReference = ViewTreeObserverOnPreDrawListenerC6161g.this.f57480c.f57483b;
            hg1.m25195a((ViewGroup) weakReference.get(), false);
        }
    }

    public ViewTreeObserverOnPreDrawListenerC6161g(C6162h c6162h, View view, C6162h.a aVar) {
        this.f57480c = c6162h;
        this.f57478a = view;
        this.f57479b = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        WeakReference weakReference;
        wc0 wc0Var;
        Handler handler;
        wc0 wc0Var2;
        n60.m26811d("onPreDraw(), clazz = " + this, new Object[0]);
        if (!this.f57478a.isShown()) {
            return true;
        }
        this.f57478a.getViewTreeObserver().removeOnPreDrawListener(this);
        C6155a.a aVar = (C6155a.a) this.f57479b;
        weakReference = C6155a.this.f57466a;
        C4637e c4637e = (C4637e) weakReference.get();
        if (c4637e != null) {
            wc0Var2 = C6155a.this.f57468c;
            wc0Var2.m29468c(c4637e.m28621i());
        }
        wc0Var = C6155a.this.f57468c;
        if (wc0Var.m29467b()) {
            C6155a.m30413c(C6155a.this);
        }
        handler = this.f57480c.f57482a;
        handler.postDelayed(new a(), 50L);
        return true;
    }
}
