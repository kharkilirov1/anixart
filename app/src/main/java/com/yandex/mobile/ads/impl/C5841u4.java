package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.u4 */
/* loaded from: classes3.dex */
public final class C5841u4 {

    /* renamed from: a */
    @NonNull
    private final C5904v6 f55385a = new C5904v6();

    /* renamed from: b */
    @NonNull
    private final kr0 f55386b = new kr0();

    @NonNull
    /* renamed from: a */
    public final Map<String, Object> m28881a(@Nullable AdRequest adRequest) {
        tv0 tv0Var = new tv0(new HashMap());
        if (adRequest != null) {
            Map<String, String> parameters = adRequest.getParameters();
            Objects.requireNonNull(this.f55385a);
            tv0 tv0Var2 = new tv0(new HashMap());
            if (parameters != null) {
                String str = parameters.get("adapter_network_name");
                String str2 = parameters.get("adapter_version");
                String str3 = parameters.get("adapter_network_sdk_version");
                tv0Var2.m28757a(str, "adapter_network_name");
                tv0Var2.m28757a(str2, "adapter_version");
                tv0Var2.m28757a(str3, "adapter_network_sdk_version");
            }
            Map<String, Object> m28756a = tv0Var2.m28756a();
            Objects.requireNonNull(this.f55386b);
            tv0 tv0Var3 = new tv0(new HashMap());
            if (parameters != null) {
                String str4 = parameters.get("plugin_type");
                String str5 = parameters.get("plugin_version");
                tv0Var3.m28757a(str4, "plugin_type");
                tv0Var3.m28757a(str5, "plugin_version");
            }
            Map<String, Object> m28756a2 = tv0Var3.m28756a();
            tv0Var.m28760a(m28756a);
            tv0Var.m28760a(m28756a2);
        }
        return tv0Var.m28756a();
    }
}
