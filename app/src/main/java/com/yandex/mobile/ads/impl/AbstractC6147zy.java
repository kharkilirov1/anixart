package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zy */
/* loaded from: classes3.dex */
public abstract class AbstractC6147zy extends AbstractC5587pd<String> implements InterfaceC5315k2 {

    /* renamed from: d */
    @NotNull
    private final AdResultReceiver f57400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6147zy(@NotNull Context context, @NotNull AdResponse<String> adResponse, @NotNull AdResultReceiver adResultReceiver) {
        super(context, adResponse);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adResultReceiver, "adResultReceiver");
        this.f57400d = adResultReceiver;
        adResultReceiver.m21912a(this);
    }

    /* renamed from: g */
    public synchronized void mo24327g() {
        this.f57400d.m21912a(null);
    }

    @NotNull
    /* renamed from: h */
    public final AdResultReceiver m30346h() {
        return this.f57400d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC6147zy(@NotNull Context context, @NotNull AdResponse<String> adResponse) {
        this(context, adResponse, new AdResultReceiver(new Handler(Looper.getMainLooper())));
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
    }
}
