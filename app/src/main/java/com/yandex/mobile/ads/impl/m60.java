package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m60 {

    /* renamed from: a */
    @NotNull
    private final og1 f52584a;

    /* renamed from: b */
    @NotNull
    private final ng1 f52585b;

    /* renamed from: c */
    @NotNull
    private final Executor f52586c;

    @VisibleForTesting
    public m60(@NotNull og1 viewSizeInfoStorage, @NotNull ng1 viewSizeInfoReporter, @NotNull Executor executor) {
        Intrinsics.m32179h(viewSizeInfoStorage, "viewSizeInfoStorage");
        Intrinsics.m32179h(viewSizeInfoReporter, "viewSizeInfoReporter");
        Intrinsics.m32179h(executor, "executor");
        this.f52584a = viewSizeInfoStorage;
        this.f52585b = viewSizeInfoReporter;
        this.f52586c = executor;
    }

    /* renamed from: a */
    public final void m26582a(@NotNull C5101g2 adConfiguration, @Nullable AbstractC4639g abstractC4639g) {
        String m24779c;
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        if (abstractC4639g == null || (m24779c = adConfiguration.m24779c()) == null) {
            return;
        }
        int m24790l = adConfiguration.m24790l();
        this.f52586c.execute(new lq1(this, new qg1(m24790l, m24779c), pg1.m27327a(abstractC4639g), adConfiguration, 3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ m60(com.yandex.mobile.ads.impl.og1 r3, com.yandex.mobile.ads.impl.ng1 r4) {
        /*
            r2 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r1 = "newSingleThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.m32178g(r0, r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.m60.<init>(com.yandex.mobile.ads.impl.og1, com.yandex.mobile.ads.impl.ng1):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m26580a(m60 this$0, qg1 viewSizeKey, lg1 viewSizeInfo, C5101g2 adConfiguration) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(viewSizeKey, "$viewSizeKey");
        Intrinsics.m32179h(viewSizeInfo, "$viewSizeInfo");
        Intrinsics.m32179h(adConfiguration, "$adConfiguration");
        this$0.f52584a.m27085a(viewSizeKey, viewSizeInfo);
        this$0.f52585b.m26906a(viewSizeInfo, adConfiguration);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m60(@NotNull Context context) {
        this(new og1(context), new ng1(context));
        Intrinsics.m32179h(context, "context");
    }
}
