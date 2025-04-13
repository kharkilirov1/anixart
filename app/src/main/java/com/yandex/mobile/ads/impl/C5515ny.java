package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ny */
/* loaded from: classes3.dex */
public final class C5515ny {

    /* renamed from: a */
    @NotNull
    private final C5609py f53099a;

    /* renamed from: b */
    @NotNull
    private final C5421m1 f53100b;

    /* renamed from: com.yandex.mobile.ads.impl.ny$a */
    public final class a implements InterfaceC5661qy {

        /* renamed from: a */
        @NotNull
        private final InterfaceC4999e1 f53101a;

        /* renamed from: b */
        public final /* synthetic */ C5515ny f53102b;

        public a(C5515ny c5515ny, @NotNull InterfaceC4999e1 adBlockerDetectorListener) {
            Intrinsics.m32179h(adBlockerDetectorListener, "adBlockerDetectorListener");
            this.f53102b = c5515ny;
            this.f53101a = adBlockerDetectorListener;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5661qy
        /* renamed from: a */
        public final void mo26963a(@Nullable Boolean bool) {
            this.f53102b.f53100b.m26555a(bool);
            this.f53101a.mo23757a();
        }
    }

    @JvmOverloads
    public C5515ny(@NotNull Context context, @NotNull C5609py hostAccessAdBlockerDetector, @NotNull C5421m1 adBlockerStateStorageManager) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(hostAccessAdBlockerDetector, "hostAccessAdBlockerDetector");
        Intrinsics.m32179h(adBlockerStateStorageManager, "adBlockerStateStorageManager");
        this.f53099a = hostAccessAdBlockerDetector;
        this.f53100b = adBlockerStateStorageManager;
    }

    /* renamed from: a */
    public final void m26962a(@NotNull InterfaceC4999e1 adBlockerDetectorListener) {
        Intrinsics.m32179h(adBlockerDetectorListener, "adBlockerDetectorListener");
        this.f53099a.m27581a(new a(this, adBlockerDetectorListener));
    }

    public /* synthetic */ C5515ny(Context context) {
        this(context, new C5609py(), new C5421m1(context));
    }
}
