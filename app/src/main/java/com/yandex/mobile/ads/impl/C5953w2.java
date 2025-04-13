package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.w2 */
/* loaded from: classes3.dex */
public final class C5953w2 {

    /* renamed from: d */
    @Deprecated
    private static final long f55992d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    @NotNull
    private final C5723s2 f55993a;

    /* renamed from: b */
    private final e50 f55994b;

    /* renamed from: c */
    @NotNull
    private final Handler f55995c;

    public C5953w2(@NotNull C5723s2 adGroupController) {
        Intrinsics.m32179h(adGroupController, "adGroupController");
        this.f55993a = adGroupController;
        this.f55994b = e50.m24007a();
        this.f55995c = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29361a(C5953w2 this$0, C4790a3 nextAd) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(nextAd, "$nextAd");
        if (Intrinsics.m32174c(this$0.f55993a.m28046e(), nextAd)) {
            sd1 m22367b = nextAd.m22367b();
            i50 m22366a = nextAd.m22366a();
            if (m22367b.m28207a().ordinal() != 0) {
                return;
            }
            m22366a.m25446d();
        }
    }

    /* renamed from: b */
    public final void m29364b() {
        C4790a3 m28046e;
        if (!this.f55994b.m24010b() || (m28046e = this.f55993a.m28046e()) == null) {
            return;
        }
        this.f55995c.postDelayed(new hn1(this, m28046e, 29), f55992d);
    }

    /* renamed from: c */
    public final void m29365c() {
        C4790a3 m28046e = this.f55993a.m28046e();
        if (m28046e != null) {
            sd1 m22367b = m28046e.m22367b();
            i50 m22366a = m28046e.m22366a();
            int ordinal = m22367b.m28207a().ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 6 || ordinal == 7) {
                m22366a.m25449g();
            }
        }
        this.f55995c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m29363a() {
        i50 m22366a;
        C4790a3 m28046e = this.f55993a.m28046e();
        if (m28046e != null && (m22366a = m28046e.m22366a()) != null) {
            m22366a.m25443a();
        }
        this.f55995c.removeCallbacksAndMessages(null);
    }
}
