package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdLoader;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class n80 {

    /* renamed from: a */
    @NonNull
    private final Context f52874a;

    /* renamed from: b */
    @NonNull
    private final InstreamAdLoader f52875b;

    /* renamed from: c */
    @NonNull
    private final InstreamAdRequestConfiguration f52876c;

    /* renamed from: com.yandex.mobile.ads.impl.n80$a */
    public static class C5477a implements InstreamAdLoadListener {

        /* renamed from: a */
        @NonNull
        private final WeakReference<ViewGroup> f52877a;

        /* renamed from: b */
        @NonNull
        private final WeakReference<List<fc1>> f52878b;

        /* renamed from: c */
        @NonNull
        private final InterfaceC5478b f52879c;

        public C5477a(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InterfaceC5478b interfaceC5478b) {
            this.f52879c = interfaceC5478b;
            this.f52877a = new WeakReference<>(viewGroup);
            this.f52878b = new WeakReference<>(list);
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdFailedToLoad(@NonNull String str) {
            this.f52879c.mo25789a();
        }

        @Override // com.yandex.mobile.ads.instream.InstreamAdLoadListener
        public final void onInstreamAdLoaded(@NonNull InstreamAd instreamAd) {
            ViewGroup viewGroup = this.f52877a.get();
            List<fc1> list = this.f52878b.get();
            if (list == null) {
                list = Collections.emptyList();
            }
            if (viewGroup != null) {
                this.f52879c.mo25790a(viewGroup, list, instreamAd);
            } else {
                this.f52879c.mo25789a();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n80$b */
    public interface InterfaceC5478b {
        /* renamed from: a */
        void mo25789a();

        /* renamed from: a */
        void mo25790a(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InstreamAd instreamAd);
    }

    public n80(@NonNull Context context, @NonNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.f52874a = context.getApplicationContext();
        this.f52876c = instreamAdRequestConfiguration;
        this.f52875b = new InstreamAdLoader(context);
    }

    /* renamed from: a */
    public final void m26817a(@NonNull ViewGroup viewGroup, @NonNull List<fc1> list, @NonNull InterfaceC5478b interfaceC5478b) {
        this.f52875b.setInstreamAdLoadListener(new C5477a(viewGroup, list, interfaceC5478b));
        this.f52875b.loadInstreamAd(this.f52874a, this.f52876c);
    }

    /* renamed from: a */
    public final void m26816a() {
        this.f52875b.setInstreamAdLoadListener(null);
    }
}
