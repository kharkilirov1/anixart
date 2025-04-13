package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lx0 {

    /* renamed from: a */
    @NotNull
    private final C5435md f52547a;

    @JvmOverloads
    public lx0() {
        this(0);
    }

    public /* synthetic */ lx0(int i2) {
        this(new C5435md());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.base.model.reward.RewardData m26542a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.sw0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "networkResponse"
            kotlin.jvm.internal.Intrinsics.m32179h(r7, r0)
            java.util.Map r7 = r7.m28365b()
            r0 = 25
            java.lang.Integer r0 = com.yandex.mobile.ads.impl.C5150gy.m24999c(r7, r0)
            r1 = 27
            java.lang.String r1 = com.yandex.mobile.ads.impl.j00.m25753a(r1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            if (r1 == 0) goto L2c
            com.yandex.mobile.ads.impl.md r3 = r6.f52547a
            java.util.Objects.requireNonNull(r3)
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = com.yandex.mobile.ads.impl.C5435md.m26616a(r1)
            goto L2d
        L2c:
            r1 = r2
        L2d:
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L48
            if (r1 == 0) goto L48
            int r5 = r1.length()
            if (r5 <= 0) goto L3b
            r5 = 1
            goto L3c
        L3b:
            r5 = 0
        L3c:
            if (r5 == 0) goto L48
            com.yandex.mobile.ads.base.model.reward.ClientSideReward r5 = new com.yandex.mobile.ads.base.model.reward.ClientSideReward
            int r0 = r0.intValue()
            r5.<init>(r0, r1)
            goto L49
        L48:
            r5 = r2
        L49:
            r0 = 28
            java.lang.String r0 = com.yandex.mobile.ads.impl.C5150gy.m25000d(r7, r0)
            if (r0 == 0) goto L60
            int r1 = r0.length()
            if (r1 <= 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            if (r3 == 0) goto L60
            com.yandex.mobile.ads.base.model.reward.ServerSideReward r2 = new com.yandex.mobile.ads.base.model.reward.ServerSideReward
            r2.<init>(r0)
        L60:
            r0 = 33
            boolean r7 = com.yandex.mobile.ads.impl.C5150gy.m24997a(r7, r0)
            com.yandex.mobile.ads.base.model.reward.RewardData$b r0 = new com.yandex.mobile.ads.base.model.reward.RewardData$b
            r0.<init>()
            com.yandex.mobile.ads.base.model.reward.RewardData$b r0 = r0.m21934a(r5)
            com.yandex.mobile.ads.base.model.reward.RewardData$b r0 = r0.m21935a(r2)
            com.yandex.mobile.ads.base.model.reward.RewardData$b r7 = r0.m21936a(r7)
            com.yandex.mobile.ads.base.model.reward.RewardData r7 = r7.m21937a()
            java.lang.String r0 = "Builder()\n            .s…ype)\n            .build()"
            kotlin.jvm.internal.Intrinsics.m32178g(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lx0.m26542a(com.yandex.mobile.ads.impl.sw0):com.yandex.mobile.ads.base.model.reward.RewardData");
    }

    @JvmOverloads
    public lx0(@NotNull C5435md mBase64Decoder) {
        Intrinsics.m32179h(mBase64Decoder, "mBase64Decoder");
        this.f52547a = mBase64Decoder;
    }
}
