package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uc0 {

    /* renamed from: a */
    @NotNull
    private final C5101g2 f55474a;

    /* renamed from: b */
    @NotNull
    private final og1 f55475b;

    /* renamed from: c */
    @NotNull
    private final ng1 f55476c;

    /* renamed from: d */
    @NotNull
    private final Executor f55477d;

    public uc0(@NotNull C5101g2 adConfiguration, @NotNull og1 viewSizeInfoStorage, @NotNull ng1 viewSizeInfoReporter, @NotNull Executor executor) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(viewSizeInfoStorage, "viewSizeInfoStorage");
        Intrinsics.m32179h(viewSizeInfoReporter, "viewSizeInfoReporter");
        Intrinsics.m32179h(executor, "executor");
        this.f55474a = adConfiguration;
        this.f55475b = viewSizeInfoStorage;
        this.f55476c = viewSizeInfoReporter;
        this.f55477d = executor;
    }

    /* renamed from: a */
    public final void m28983a(@NotNull MediaView view, @NotNull String mediaType) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(mediaType, "mediaType");
        String m24779c = this.f55474a.m24779c();
        if (m24779c != null) {
            int m24790l = this.f55474a.m24790l();
            lg1 m27328a = pg1.m27328a(view, mediaType);
            this.f55477d.execute(new sq1(this, new qg1(m24790l, m24779c), m27328a, 10));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ uc0(com.yandex.mobile.ads.impl.C5101g2 r3, com.yandex.mobile.ads.impl.og1 r4, com.yandex.mobile.ads.impl.ng1 r5) {
        /*
            r2 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r1 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uc0.<init>(com.yandex.mobile.ads.impl.g2, com.yandex.mobile.ads.impl.og1, com.yandex.mobile.ads.impl.ng1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28981a(uc0 this$0, qg1 viewSizeKey, lg1 viewSizeInfo) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(viewSizeKey, "$viewSizeKey");
        Intrinsics.m32179h(viewSizeInfo, "$viewSizeInfo");
        this$0.f55475b.m27085a(viewSizeKey, viewSizeInfo);
        this$0.f55476c.m26906a(viewSizeInfo, this$0.f55474a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uc0(@NotNull Context context, @NotNull C5101g2 adConfiguration) {
        this(adConfiguration, new og1(context), new ng1(context));
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
    }
}
