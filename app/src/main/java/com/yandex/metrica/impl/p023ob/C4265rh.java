package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3535P3;

/* renamed from: com.yandex.metrica.impl.ob.rh */
/* loaded from: classes2.dex */
public class C4265rh implements InterfaceC4161nh<C4083kh> {

    /* renamed from: a */
    @NonNull
    private final C4031ih f46311a;

    public C4265rh(@NonNull C4031ih c4031ih) {
        this.f46311a = c4031ih;
    }

    /* renamed from: a */
    public void m20664a(@NonNull Uri.Builder builder, @NonNull C4083kh c4083kh) {
        C3298Fg m19245a;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f46311a.m20060a("deviceid"), c4083kh.m19751g());
        builder.appendQueryParameter(this.f46311a.m20060a("deviceid2"), c4083kh.m19752h());
        C3459M2 m18719v = C3532P0.m18696i().m18719v();
        C3974gc m19735a = c4083kh.m19735a();
        if (m18719v.m18565c()) {
            builder.appendQueryParameter(this.f46311a.m20060a("adv_id"), "");
            builder.appendQueryParameter(this.f46311a.m20060a("oaid"), "");
            builder.appendQueryParameter(this.f46311a.m20060a("yandex_adv_id"), "");
        } else {
            m20663a(builder, m19735a.m19958a(), "adv_id");
            m20663a(builder, m19735a.m19959b(), "oaid");
            m20663a(builder, m19735a.m19960c(), "yandex_adv_id");
        }
        builder.appendQueryParameter(this.f46311a.m20060a("app_set_id"), c4083kh.m19746d());
        builder.appendQueryParameter(this.f46311a.m20060a("app_set_id_scope"), c4083kh.m19748e());
        builder.appendQueryParameter(this.f46311a.m20060a("app_platform"), "android");
        builder.appendQueryParameter(this.f46311a.m20060a("protocol_version"), "2");
        builder.appendQueryParameter(this.f46311a.m20060a("analytics_sdk_version_name"), "5.0.0");
        builder.appendQueryParameter(this.f46311a.m20060a("model"), c4083kh.m19758n());
        builder.appendQueryParameter(this.f46311a.m20060a("manufacturer"), c4083kh.m19757m());
        builder.appendQueryParameter(this.f46311a.m20060a("os_version"), c4083kh.m19760p());
        builder.appendQueryParameter(this.f46311a.m20060a("screen_width"), String.valueOf(c4083kh.m19766v()));
        builder.appendQueryParameter(this.f46311a.m20060a("screen_height"), String.valueOf(c4083kh.m19765u()));
        builder.appendQueryParameter(this.f46311a.m20060a("screen_dpi"), String.valueOf(c4083kh.m19764t()));
        builder.appendQueryParameter(this.f46311a.m20060a("scalefactor"), String.valueOf(c4083kh.m19763s()));
        builder.appendQueryParameter(this.f46311a.m20060a("locale"), c4083kh.m19756l());
        builder.appendQueryParameter(this.f46311a.m20060a("device_type"), c4083kh.m19754j());
        builder.appendQueryParameter(this.f46311a.m20060a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("query_hosts"), String.valueOf(2));
        String m20060a = this.f46311a.m20060a("features");
        String[] strArr = {this.f46311a.m20060a("easy_collecting"), this.f46311a.m20060a("egress"), this.f46311a.m20060a("package_info"), this.f46311a.m20060a("socket"), this.f46311a.m20060a("permissions_collecting"), this.f46311a.m20060a("features_collecting"), this.f46311a.m20060a("location_collecting"), this.f46311a.m20060a("wakeup"), this.f46311a.m20060a("lbs_collecting"), this.f46311a.m20060a("google_aid"), this.f46311a.m20060a("huawei_oaid"), this.f46311a.m20060a("throttling"), this.f46311a.m20060a("wifi_around"), this.f46311a.m20060a("wifi_connected"), this.f46311a.m20060a("cells_around"), this.f46311a.m20060a("sim_info"), this.f46311a.m20060a("sdk_list"), this.f46311a.m20060a("identity_light_collecting"), this.f46311a.m20060a("gpl_collecting"), this.f46311a.m20060a("ui_parsing"), this.f46311a.m20060a("ui_collecting_for_bridge"), this.f46311a.m20060a("ui_event_sending"), this.f46311a.m20060a("ui_raw_event_sending"), this.f46311a.m20060a("cell_additional_info"), this.f46311a.m20060a("cell_additional_info_connected_only"), this.f46311a.m20060a("ssl_pinning")};
        int i2 = C3509O2.f43529a;
        builder.appendQueryParameter(m20060a, TextUtils.join(",", strArr));
        builder.appendQueryParameter(this.f46311a.m20060a("socket"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("app_id"), c4083kh.m19761q());
        builder.appendQueryParameter(this.f46311a.m20060a("location_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("app_debuggable"), c4083kh.m19968A());
        builder.appendQueryParameter(this.f46311a.m20060a("sdk_list"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("wakeup"), String.valueOf(1));
        if (c4083kh.m20292M()) {
            String m20284E = c4083kh.m20284E();
            if (!TextUtils.isEmpty(m20284E)) {
                builder.appendQueryParameter(this.f46311a.m20060a("country_init"), m20284E);
            }
        } else {
            builder.appendQueryParameter(this.f46311a.m20060a("detect_locale"), String.valueOf(1));
        }
        C3535P3.a m20282C = c4083kh.m20282C();
        if (!C3658U2.m19218b(m20282C.m18729b())) {
            builder.appendQueryParameter(this.f46311a.m20060a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f46311a.m20060a("clids_set"), C4452ym.m21262c(m20282C.m18729b()));
            int ordinal = m20282C.mo18022a().ordinal();
            builder.appendQueryParameter(this.f46311a.m20060a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String m20285F = c4083kh.m20285F();
            String m20286G = c4083kh.m20286G();
            if (TextUtils.isEmpty(m20285F) && (m19245a = c4083kh.m20288I().m19245a()) != null) {
                m20285F = m19245a.f42909a;
                m20286G = m19245a.f42912d.f42917a;
            }
            if (!TextUtils.isEmpty(m20285F)) {
                builder.appendQueryParameter(this.f46311a.m20060a("install_referrer"), m20285F);
                if (m20286G == null) {
                    m20286G = "null";
                }
                builder.appendQueryParameter(this.f46311a.m20060a("install_referrer_source"), m20286G);
            }
        }
        String m19768x = c4083kh.m19768x();
        if (!TextUtils.isEmpty(m19768x)) {
            builder.appendQueryParameter(this.f46311a.m20060a("uuid"), m19768x);
        }
        builder.appendQueryParameter(this.f46311a.m20060a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("requests"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("permissions"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("identity_light_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("ui_parsing"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("ui_collecting_for_bridge"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("ui_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("ui_raw_event_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("throttling"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("mediascope_api_keys"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("diagnostics"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("app_system_flag"), c4083kh.m19969B());
        builder.appendQueryParameter(this.f46311a.m20060a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("easy_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("egress"), String.valueOf(1));
        builder.appendQueryParameter(this.f46311a.m20060a("startup_update"), String.valueOf(1));
    }

    /* renamed from: a */
    private void m20663a(@NonNull Uri.Builder builder, @NonNull C3844bc c3844bc, @NonNull String str) {
        if (!c3844bc.m19650a()) {
            builder.appendQueryParameter(this.f46311a.m20060a(str), "");
        } else {
            builder.appendQueryParameter(this.f46311a.m20060a(str), c3844bc.f44822a.f44734b);
        }
    }
}
