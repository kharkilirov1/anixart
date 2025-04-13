package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yx0 extends AbstractC5462mw<tx0> {

    /* renamed from: D */
    @NotNull
    private final mx0 f56959D;

    public /* synthetic */ yx0(Context context, InterfaceC5513nw interfaceC5513nw, C5724s3 c5724s3, C5097fz c5097fz, qx0 qx0Var) {
        this(context, interfaceC5513nw, c5724s3, c5097fz, qx0Var, new mx0());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5462mw
    @NotNull
    /* renamed from: a */
    public final InterfaceC5148gw<tx0> mo23082a(@NotNull InterfaceC5202hw controllerFactory) {
        Intrinsics.m32179h(controllerFactory, "controllerFactory");
        InterfaceC5148gw<tx0> mo25122a = controllerFactory.mo25122a(this);
        Intrinsics.m32178g(mo25122a, "controllerFactory.createRewardedAdController(this)");
        return mo25122a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx0(@NotNull Context context, @NotNull InterfaceC5513nw<tx0> loadEventListener, @NotNull C5724s3 adLoadingPhasesManager, @NotNull C5097fz htmlAdResponseReportManager, @NotNull qx0 rewardedContentControllerFactory, @NotNull mx0 rewardDataValidator) {
        super(context, EnumC5007e6.f49818d, loadEventListener, adLoadingPhasesManager, rewardedContentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(loadEventListener, "loadEventListener");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(rewardedContentControllerFactory, "rewardedContentControllerFactory");
        Intrinsics.m32179h(rewardDataValidator, "rewardDataValidator");
        this.f56959D = rewardDataValidator;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4945cz, com.yandex.mobile.ads.impl.AbstractC5794td, com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
    /* renamed from: a */
    public final void mo22924a(@NotNull AdResponse<String> adResponse) {
        Intrinsics.m32179h(adResponse, "adResponse");
        RewardData m21802C = adResponse.m21802C();
        Objects.requireNonNull(this.f56959D);
        if (mx0.m26778a(m21802C)) {
            super.mo22924a(adResponse);
        } else {
            mo21797b(AbstractC5524o4.f53152d);
        }
    }
}
