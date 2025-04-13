package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4292si;
import com.yandex.metrica.impl.p023ob.C4452ym;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ij */
/* loaded from: classes2.dex */
public class C4033ij {
    /* renamed from: a */
    public void m20067a(@NonNull C4371vj c4371vj, @NonNull C4452ym.a aVar) {
        C4082kg.i iVar = new C4082kg.i();
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("features");
            } catch (Throwable unused) {
            }
            JSONObject optJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (optJSONObject != null) {
                C4292si c4292si = new C4292si(new C4292si.a().m20745d(m20066a(optJSONObject, "easy_collecting", iVar.f45691b)).m20746e(m20066a(optJSONObject, "egress", iVar.f45714y)).m20754m(m20066a(optJSONObject, "package_info", iVar.f45692c)).m20755n(m20066a(optJSONObject, "permissions_collecting", iVar.f45693d)).m20747f(m20066a(optJSONObject, "features_collecting", iVar.f45694e)).m20756o(m20066a(optJSONObject, "sdk_list", iVar.f45700k)).m20748g(m20066a(optJSONObject, "google_aid", iVar.f45695f)).m20758q(m20066a(optJSONObject, "throttling", iVar.f45709t)).m20764w(m20066a(optJSONObject, "wifi_around", iVar.f45696g)).m20765x(m20066a(optJSONObject, "wifi_connected", iVar.f45697h)).m20744c(m20066a(optJSONObject, "cells_around", iVar.f45698i)).m20757p(m20066a(optJSONObject, "sim_info", iVar.f45699j)).m20751j(m20066a(optJSONObject, "identity_light_collecting", iVar.f45701l)).m20753l(m20066a(optJSONObject, "location_collecting", iVar.f45702m)).m20752k(m20066a(optJSONObject, "lbs_collecting", iVar.f45703n)).m20749h(m20066a(optJSONObject, "gpl_collecting", iVar.f45705p)).m20763v(m20066a(optJSONObject, "wakeup", iVar.f45704o)).m20761t(m20066a(optJSONObject, "ui_parsing", iVar.f45706q)).m20760s(m20066a(optJSONObject, "ui_event_sending", iVar.f45707r)).m20762u(m20066a(optJSONObject, "ui_raw_event_sending", iVar.f45707r)).m20759r(m20066a(optJSONObject, "ui_collecting_for_bridge", iVar.f45708s)).m20741a(m20066a(optJSONObject, "cell_additional_info", iVar.f45710u)).m20743b(m20066a(optJSONObject, "cell_additional_info_connected_only", iVar.f45711v)).m20750i(m20066a(optJSONObject, "huawei_oaid", iVar.f45713x)).m20740a(optJSONObject.has("ssl_pinning") ? Boolean.valueOf(optJSONObject.getJSONObject("ssl_pinning").getBoolean("enabled")) : null));
                c4371vj.m21021a(m20066a(optJSONObject, "socket", false));
                c4371vj.m21012a(c4292si);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private boolean m20066a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean valueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean valueOf2 = Boolean.valueOf(z);
        if (valueOf == null) {
            valueOf = valueOf2;
        }
        return valueOf.booleanValue();
    }
}
