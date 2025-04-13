package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yf0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eg0 {

    /* renamed from: a */
    @NotNull
    private final f90 f49959a = new f90();

    /* renamed from: com.yandex.mobile.ads.impl.eg0$a */
    public interface InterfaceC5025a {
        /* renamed from: a */
        void mo23908a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.eg0$b */
    public static final class C5026b implements yf0.InterfaceC6075a {

        /* renamed from: a */
        @NotNull
        private final fg0 f49960a;

        /* renamed from: b */
        @NotNull
        private final InterfaceC5025a f49961b;

        /* renamed from: c */
        @NotNull
        private final ka0 f49962c;

        public C5026b(@NotNull fg0 mraidWebViewPool, @NotNull InterfaceC5025a listener, @NotNull ka0 media) {
            Intrinsics.m32179h(mraidWebViewPool, "mraidWebViewPool");
            Intrinsics.m32179h(listener, "listener");
            Intrinsics.m32179h(media, "media");
            this.f49960a = mraidWebViewPool;
            this.f49961b = listener;
            this.f49962c = media;
        }

        @Override // com.yandex.mobile.ads.impl.yf0.InterfaceC6075a
        /* renamed from: a */
        public final void mo24147a() {
            this.f49960a.m24593b(this.f49962c);
            this.f49961b.mo23908a();
        }

        @Override // com.yandex.mobile.ads.impl.yf0.InterfaceC6075a
        /* renamed from: b */
        public final void mo24148b() {
            this.f49961b.mo23908a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24144b(Context context, ka0 media, InterfaceC5025a listener) {
        yf0 yf0Var;
        Intrinsics.m32179h(context, "$context");
        Intrinsics.m32179h(media, "$media");
        Intrinsics.m32179h(listener, "$listener");
        fg0 m24595a = fg0.f50259c.m24595a(context);
        String m26093b = media.m26093b();
        if (m24595a.m24594b() || m24595a.m24592a(media) || m26093b == null) {
            listener.mo23908a();
            return;
        }
        C5026b c5026b = new C5026b(m24595a, listener, media);
        try {
            yf0Var = new yf0(context);
        } catch (Throwable unused) {
            listener.mo23908a();
            yf0Var = null;
        }
        if (yf0Var != null) {
            yf0Var.setPreloadListener(c5026b);
            m24595a.m24591a(yf0Var, media);
            yf0Var.m29936b(m26093b);
        }
    }

    /* renamed from: a */
    public final void m24146a(@NotNull Context context, @NotNull ka0 media, @NotNull InterfaceC5025a listener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(media, "media");
        Intrinsics.m32179h(listener, "listener");
        this.f49959a.m24373a(new sq1(context, media, listener, 2));
    }
}
