package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vk1<T> {

    /* renamed from: a */
    @NotNull
    private final C5101g2 f55829a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC5903v5 f55830b;

    /* renamed from: c */
    @NotNull
    private final uk1<T> f55831c;

    public vk1(@NotNull C5101g2 adConfiguration, @NotNull InterfaceC5903v5 sizeValidator, @NotNull uk1<T> yandexHtmlAdCreateController) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(sizeValidator, "sizeValidator");
        Intrinsics.m32179h(yandexHtmlAdCreateController, "yandexHtmlAdCreateController");
        this.f55829a = adConfiguration;
        this.f55830b = sizeValidator;
        this.f55831c = yandexHtmlAdCreateController;
    }

    /* renamed from: a */
    public final void m29233a(@NotNull Context context, @NotNull AdResponse<String> adResponse, @NotNull wk1<T> creationListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(creationListener, "creationListener");
        String m21801B = adResponse.m21801B();
        SizeInfo m21805F = adResponse.m21805F();
        Intrinsics.m32178g(m21805F, "adResponse.sizeInfo");
        boolean mo22650a = this.f55830b.mo22650a(context, m21805F);
        SizeInfo m24792n = this.f55829a.m24792n();
        if (!mo22650a) {
            C5563p2 INVALID_SERVER_RESPONSE_DATA = AbstractC5524o4.f53152d;
            Intrinsics.m32178g(INVALID_SERVER_RESPONSE_DATA, "INVALID_SERVER_RESPONSE_DATA");
            creationListener.mo24188a(INVALID_SERVER_RESPONSE_DATA);
            return;
        }
        if (m24792n == null) {
            C5563p2 MISCONFIGURED_INTERNAL_STATE = AbstractC5524o4.f53151c;
            Intrinsics.m32178g(MISCONFIGURED_INTERNAL_STATE, "MISCONFIGURED_INTERNAL_STATE");
            creationListener.mo24188a(MISCONFIGURED_INTERNAL_STATE);
            return;
        }
        if (!r11.m27822a(context, adResponse, m21805F, this.f55830b, m24792n)) {
            C5563p2 m26995a = AbstractC5524o4.m26995a(m24792n.m21916c(context), m24792n.m21913a(context), m21805F.m21919e(), m21805F.m21915c(), tg1.m28658c(context), tg1.m28656b(context));
            Intrinsics.m32178g(m26995a, "createNotEnoughSpaceErro…h, screenHeight\n        )");
            creationListener.mo24188a(m26995a);
            return;
        }
        if (m21801B == null || StringsKt.m33879E(m21801B)) {
            C5563p2 INVALID_SERVER_RESPONSE_DATA2 = AbstractC5524o4.f53152d;
            Intrinsics.m32178g(INVALID_SERVER_RESPONSE_DATA2, "INVALID_SERVER_RESPONSE_DATA");
            creationListener.mo24188a(INVALID_SERVER_RESPONSE_DATA2);
        } else if (!C5427m6.m26578a(context)) {
            C5563p2 WEB_VIEW_DATABASE_INOPERABLE = AbstractC5524o4.f53150b;
            Intrinsics.m32178g(WEB_VIEW_DATABASE_INOPERABLE, "WEB_VIEW_DATABASE_INOPERABLE");
            creationListener.mo24188a(WEB_VIEW_DATABASE_INOPERABLE);
        } else {
            try {
                this.f55831c.mo25233a(adResponse, m24792n, m21801B, creationListener);
            } catch (mi1 unused) {
                C5563p2 WEB_VIEW_CREATION_FAILED = AbstractC5524o4.f53153e;
                Intrinsics.m32178g(WEB_VIEW_CREATION_FAILED, "WEB_VIEW_CREATION_FAILED");
                creationListener.mo24188a(WEB_VIEW_CREATION_FAILED);
            }
        }
    }

    /* renamed from: a */
    public final void m29232a() {
        this.f55831c.mo25232a();
    }
}
