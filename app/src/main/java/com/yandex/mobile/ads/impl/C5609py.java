package com.yandex.mobile.ads.impl;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.py */
/* loaded from: classes3.dex */
public final class C5609py {

    /* renamed from: a */
    @NotNull
    private final C5718ry f53873a;

    /* renamed from: b */
    @NotNull
    private final C5558oy f53874b;

    /* renamed from: c */
    @NotNull
    private final Executor f53875c;

    /* renamed from: com.yandex.mobile.ads.impl.py$a */
    public final class a implements Runnable {

        /* renamed from: b */
        @NotNull
        private final InterfaceC5661qy f53876b;

        /* renamed from: c */
        public final /* synthetic */ C5609py f53877c;

        public a(C5609py c5609py, @NotNull InterfaceC5661qy mHostAccessAdBlockerDetectorListener) {
            Intrinsics.m32179h(mHostAccessAdBlockerDetectorListener, "mHostAccessAdBlockerDetectorListener");
            this.f53877c = c5609py;
            this.f53876b = mHostAccessAdBlockerDetectorListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Boolean bool;
            try {
                bool = C5609py.m27580a(this.f53877c);
            } catch (Throwable th) {
                n60.m26808a(th, th.getMessage(), new Object[0]);
                bool = null;
            }
            this.f53876b.mo26963a(bool);
        }
    }

    public C5609py(@NotNull C5718ry hostAccessCheckRequester, @NotNull C5558oy hostAccessAdBlockerDetectionValidator, @NotNull Executor singleThreadExecutor) {
        Intrinsics.m32179h(hostAccessCheckRequester, "hostAccessCheckRequester");
        Intrinsics.m32179h(hostAccessAdBlockerDetectionValidator, "hostAccessAdBlockerDetectionValidator");
        Intrinsics.m32179h(singleThreadExecutor, "singleThreadExecutor");
        this.f53873a = hostAccessCheckRequester;
        this.f53874b = hostAccessAdBlockerDetectionValidator;
        this.f53875c = singleThreadExecutor;
    }

    /* renamed from: a */
    public static final Boolean m27580a(C5609py c5609py) {
        Objects.requireNonNull(c5609py.f53873a);
        FutureTask m28030a = C5718ry.m28030a("yandex.ru");
        Objects.requireNonNull(c5609py.f53873a);
        FutureTask m28030a2 = C5718ry.m28030a("mobile.yandexadexchange.net");
        boolean m28370a = ((C5771sy) m28030a.get()).m28370a();
        boolean m28370a2 = ((C5771sy) m28030a2.get()).m28370a();
        Objects.requireNonNull(c5609py.f53874b);
        if (!m28370a2 && m28370a) {
            return Boolean.TRUE;
        }
        if (m28370a2 || m28370a) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5609py() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.ry r0 = new com.yandex.mobile.ads.impl.ry
            r0.<init>()
            com.yandex.mobile.ads.impl.oy r1 = new com.yandex.mobile.ads.impl.oy
            r1.<init>()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r3 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r3)
            r4.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5609py.<init>():void");
    }

    /* renamed from: a */
    public final void m27581a(@NotNull InterfaceC5661qy listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f53875c.execute(new a(this, listener));
    }
}
