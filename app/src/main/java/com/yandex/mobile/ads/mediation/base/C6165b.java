package com.yandex.mobile.ads.mediation.base;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.n60;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.mediation.base.b */
/* loaded from: classes3.dex */
public final class C6165b {
    @NonNull
    /* renamed from: a */
    public static HashMap m30417a(@NonNull C6164a c6164a) {
        HashMap hashMap = new HashMap();
        try {
            MediatedAdapterInfo adapterInfo = c6164a.getAdapterInfo();
            String adapterVersion = adapterInfo.getAdapterVersion();
            String str = "null";
            if (adapterVersion == null) {
                adapterVersion = "null";
            }
            hashMap.put("mediation_adapter_version", adapterVersion);
            String networkName = adapterInfo.getNetworkName();
            if (networkName == null) {
                networkName = "null";
            }
            hashMap.put("mediation_network_name", networkName);
            String networkSdkVersion = adapterInfo.getNetworkSdkVersion();
            if (networkSdkVersion != null) {
                str = networkSdkVersion;
            }
            hashMap.put("mediation_network_sdk_version", str);
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
        }
        return hashMap;
    }
}
