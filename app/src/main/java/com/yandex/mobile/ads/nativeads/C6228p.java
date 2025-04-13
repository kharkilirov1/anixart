package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.f90;
import com.yandex.mobile.ads.impl.h90;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.li0;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.oi0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@MainThread
/* renamed from: com.yandex.mobile.ads.nativeads.p */
/* loaded from: classes3.dex */
final class C6228p implements li0 {

    /* renamed from: a */
    @NonNull
    private final Context f57775a;

    /* renamed from: c */
    @NonNull
    private final h90 f57777c;

    /* renamed from: e */
    @Nullable
    private NativeAdLoadListener f57779e;

    /* renamed from: f */
    @Nullable
    private NativeBulkAdLoadListener f57780f;

    /* renamed from: g */
    @Nullable
    private SliderAdLoadListener f57781g;

    /* renamed from: b */
    @NonNull
    private final CopyOnWriteArrayList f57776b = new CopyOnWriteArrayList();

    /* renamed from: d */
    @NonNull
    private final f90 f57778d = new f90();

    public C6228p(@NonNull Context context) {
        this.f57775a = context;
        h90 h90Var = new h90(context);
        this.f57777c = h90Var;
        h90Var.m25094a();
    }

    @MainThread
    /* renamed from: a */
    public final void m30610a(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull oi0 oi0Var) {
        kk0 kk0Var = kk0.f51997b;
        mk0 mk0Var = mk0.f52695b;
        this.f57777c.m25094a();
        this.f57778d.m24373a(new RunnableC6237t0(this, nativeAdRequestConfiguration, kk0Var, mk0Var, oi0Var, 0));
    }

    @MainThread
    /* renamed from: b */
    public final void m30615b(@NonNull NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull oi0 oi0Var) {
        kk0 kk0Var = kk0.f51999d;
        mk0 mk0Var = mk0.f52695b;
        this.f57777c.m25094a();
        this.f57778d.m24373a(new RunnableC6237t0(this, nativeAdRequestConfiguration, kk0Var, mk0Var, oi0Var, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30605b(NativeAdRequestConfiguration nativeAdRequestConfiguration, kk0 kk0Var, mk0 mk0Var, jw0 jw0Var) {
        C6230q c6230q = new C6230q(this.f57775a, this);
        this.f57776b.add(c6230q);
        c6230q.m30623a(this.f57781g);
        c6230q.m30620a(nativeAdRequestConfiguration, kk0Var, mk0Var, jw0Var);
    }

    @MainThread
    /* renamed from: a */
    public final void m30611a(@NonNull final NativeAdRequestConfiguration nativeAdRequestConfiguration, @NonNull final oi0 oi0Var, final int i2) {
        final kk0 kk0Var = kk0.f51998c;
        final mk0 mk0Var = mk0.f52695b;
        this.f57777c.m25094a();
        this.f57778d.m24373a(new Runnable() { // from class: com.yandex.mobile.ads.nativeads.u0
            @Override // java.lang.Runnable
            public final void run() {
                C6228p.this.m30603a(nativeAdRequestConfiguration, kk0Var, mk0Var, oi0Var, i2);
            }
        });
    }

    @MainThread
    /* renamed from: a */
    public final void m30614a(@NonNull C6230q c6230q) {
        this.f57777c.m25094a();
        this.f57776b.remove(c6230q);
    }

    @MainThread
    /* renamed from: a */
    public final void m30609a(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f57777c.m25094a();
        this.f57779e = nativeAdLoadListener;
        Iterator it = this.f57776b.iterator();
        while (it.hasNext()) {
            ((C6230q) it.next()).m30619a(nativeAdLoadListener);
        }
    }

    @MainThread
    /* renamed from: a */
    public final void m30612a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f57777c.m25094a();
        this.f57780f = nativeBulkAdLoadListener;
        Iterator it = this.f57776b.iterator();
        while (it.hasNext()) {
            ((C6230q) it.next()).m30622a(nativeBulkAdLoadListener);
        }
    }

    @MainThread
    /* renamed from: a */
    public final void m30613a(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f57777c.m25094a();
        this.f57781g = sliderAdLoadListener;
        Iterator it = this.f57776b.iterator();
        while (it.hasNext()) {
            ((C6230q) it.next()).m30623a(sliderAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30602a(NativeAdRequestConfiguration nativeAdRequestConfiguration, kk0 kk0Var, mk0 mk0Var, jw0 jw0Var) {
        C6230q c6230q = new C6230q(this.f57775a, this);
        this.f57776b.add(c6230q);
        c6230q.m30619a(this.f57779e);
        c6230q.m30620a(nativeAdRequestConfiguration, kk0Var, mk0Var, jw0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30603a(NativeAdRequestConfiguration nativeAdRequestConfiguration, kk0 kk0Var, mk0 mk0Var, jw0 jw0Var, int i2) {
        C6230q c6230q = new C6230q(this.f57775a, this);
        this.f57776b.add(c6230q);
        c6230q.m30622a(this.f57780f);
        c6230q.m30621a(nativeAdRequestConfiguration, kk0Var, mk0Var, jw0Var, i2);
    }

    @MainThread
    /* renamed from: a */
    public final void m30608a() {
        this.f57777c.m25094a();
        this.f57778d.m24372a();
        Iterator it = this.f57776b.iterator();
        while (it.hasNext()) {
            ((C6230q) it.next()).m30618a();
        }
        this.f57776b.clear();
    }
}
