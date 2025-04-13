package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.InterfaceC6125zi;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yi */
/* loaded from: classes3.dex */
public final class C6078yi {

    /* renamed from: a */
    @NotNull
    private final fw0 f56866a;

    public C6078yi(@NotNull fw0 requestHelper) {
        Intrinsics.m32179h(requestHelper, "requestHelper");
        this.f56866a = requestHelper;
    }

    /* renamed from: a */
    public final void m29944a(@NotNull Context context, @NotNull Uri.Builder builder) {
        Integer num;
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(builder, "builder");
        Objects.requireNonNull(InterfaceC6125zi.f57198a);
        InterfaceC6125zi m30191a = InterfaceC6125zi.a.m30191a(context);
        fw0 fw0Var = this.f56866a;
        C4871bj c4871bj = (C4871bj) m30191a;
        String m22845c = c4871bj.m22845c();
        Objects.requireNonNull(fw0Var);
        fw0.m24750a(builder, "gdpr", m22845c);
        fw0 fw0Var2 = this.f56866a;
        String m22844b = c4871bj.m22844b();
        Objects.requireNonNull(fw0Var2);
        fw0.m24750a(builder, "gdpr_consent", m22844b);
        fw0 fw0Var3 = this.f56866a;
        String m22846d = c4871bj.m22846d();
        Objects.requireNonNull(fw0Var3);
        fw0.m24750a(builder, "parsed_purpose_consents", m22846d);
        fw0 fw0Var4 = this.f56866a;
        String m22847e = c4871bj.m22847e();
        Objects.requireNonNull(fw0Var4);
        fw0.m24750a(builder, "parsed_vendor_consents", m22847e);
        fw0 fw0Var5 = this.f56866a;
        Boolean valueOf = Boolean.valueOf(c4871bj.m22843a());
        if (valueOf != null) {
            valueOf.booleanValue();
            num = Integer.valueOf(valueOf.booleanValue() ? 1 : 0);
        } else {
            num = null;
        }
        Objects.requireNonNull(fw0Var5);
        fw0.m24749a(builder, num);
    }
}
