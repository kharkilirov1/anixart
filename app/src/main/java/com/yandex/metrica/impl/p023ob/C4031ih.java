package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ih */
/* loaded from: classes2.dex */
public class C4031ih {

    /* renamed from: a */
    private final Map<String, String> f45348a;

    public C4031ih() {
        HashMap hashMap = new HashMap();
        this.f45348a = hashMap;
        hashMap.put("wakeup", "wu");
        hashMap.put("easy_collecting", "ec");
        hashMap.put("cells_around", "ca");
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("throttling", "tht");
        hashMap.put("wifi_around", "wa");
        hashMap.put("wifi_connected", "wc");
        hashMap.put("features_collecting", "fc");
        hashMap.put("cell_additional_info", "cai");
        hashMap.put("cell_additional_info_connected_only", "caico");
        hashMap.put("location_collecting", "lc");
        hashMap.put("lbs_collecting", "lbs");
        hashMap.put("package_info", "pi");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("sdk_list", "sl");
        hashMap.put("socket", "s");
        hashMap.put("identity_light_collecting", "ilc");
        hashMap.put("gpl_collecting", "gplc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("ui_parsing", "up");
        hashMap.put("ui_collecting_for_bridge", "ucfb");
        hashMap.put("ui_event_sending", "ues");
        hashMap.put("ui_raw_event_sending", "ures");
        hashMap.put("cache_control", "cc");
        hashMap.put("mediascope_api_keys", "mak");
        hashMap.put("diagnostics", "d");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", "at");
        hashMap.put("egress", "eg");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
    }

    @NonNull
    /* renamed from: a */
    public String m20060a(@NonNull String str) {
        return this.f45348a.containsKey(str) ? this.f45348a.get(str) : str;
    }
}
