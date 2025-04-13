package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ua1 {

    /* renamed from: a */
    @NotNull
    private final xn0 f55430a;

    /* renamed from: com.yandex.mobile.ads.impl.ua1$a */
    public final class C5851a implements vn0 {

        /* renamed from: a */
        @NotNull
        private final InterfaceC5852b f55431a;

        public C5851a(@NotNull ra1 listener) {
            Intrinsics.m32179h(listener, "listener");
            this.f55431a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.vn0
        /* renamed from: a */
        public final void mo22903a() {
            this.f55431a.mo27886a();
        }
    }

    @AnyThread
    /* renamed from: com.yandex.mobile.ads.impl.ua1$b */
    public interface InterfaceC5852b {
        /* renamed from: a */
        void mo27886a();
    }

    public ua1(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f55430a = new xn0(context);
    }

    /* renamed from: a */
    public final void m28927a(@NotNull List videoAds, @NotNull ra1 listener) {
        Intrinsics.m32179h(videoAds, "videoAds");
        Intrinsics.m32179h(listener, "listener");
        boolean z = true;
        if (!videoAds.isEmpty()) {
            Iterator it = videoAds.iterator();
            while (it.hasNext()) {
                Intrinsics.m32178g(((pb1) it.next()).m27265d(), "videoAd.adVerifications");
                if (!r0.isEmpty()) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            listener.mo27886a();
        } else {
            this.f55430a.m29777a(new C5851a(listener));
        }
    }
}
