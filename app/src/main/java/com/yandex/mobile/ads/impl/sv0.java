package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sv0 {

    /* renamed from: a */
    @NonNull
    private final String f54811a;

    /* renamed from: b */
    @NonNull
    private final Map<String, Object> f54812b;

    /* renamed from: com.yandex.mobile.ads.impl.sv0$a */
    public interface InterfaceC5763a {
        @NonNull
        /* renamed from: a */
        Map<String, Object> mo22529a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.sv0$b */
    public enum EnumC5764b {
        f54834b("ad_loading_result"),
        f54835c("ad_rendering_result"),
        f54836d("adapter_auto_refresh"),
        f54837e("adapter_invalid"),
        f54838f("adapter_request"),
        f54839g("adapter_response"),
        f54840h("adapter_bidder_token_request"),
        f54841i("adtune"),
        f54842j("ad_request"),
        f54843k("ad_response"),
        f54844l("vast_request"),
        f54845m("vast_response"),
        f54846n("vast_wrapper_request"),
        f54847o("vast_wrapper_response"),
        f54848p("video_ad_start"),
        f54849q("video_ad_complete"),
        f54850r("video_ad_player_error"),
        f54851s("vmap_request"),
        f54852t("vmap_response"),
        f54853u("rendering_start"),
        f54854v("impression_tracking_start"),
        f54855w("impression_tracking_success"),
        f54856x("impression_tracking_failure"),
        f54857y("forced_impression_tracking_failure"),
        f54858z("adapter_action"),
        f54813A("click"),
        f54814B("close"),
        f54815C("feedback"),
        f54816D("deeplink"),
        f54817E("show_social_actions"),
        f54818F("bound_assets"),
        f54819G("rendered_assets"),
        f54820H("rebind"),
        f54821I("binding_failure"),
        f54822J("expected_view_missing"),
        f54823K("returned_to_app"),
        f54824L("reward"),
        /* JADX INFO: Fake field, exist only in values array */
        EF1("js_error"),
        f54825M("video_ad_rendering_result"),
        f54826N("multibanner_event"),
        f54827O("ad_view_size_info"),
        f54828P("ad_unit_impression_tracking_start"),
        f54829Q("ad_unit_impression_tracking_success"),
        f54830R("ad_unit_impression_tracking_failure"),
        f54831S("forced_ad_unit_impression_tracking_failure"),
        f54832T("log");


        /* renamed from: a */
        private final String f54859a;

        EnumC5764b(String str) {
            this.f54859a = str;
        }

        @NonNull
        /* renamed from: a */
        public final String m28361a() {
            return this.f54859a;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sv0$c */
    public enum EnumC5765c {
        f54860b("success"),
        f54861c("error"),
        f54862d("no_ads"),
        /* JADX INFO: Fake field, exist only in values array */
        EF43("filtered");


        /* renamed from: a */
        private final String f54864a;

        EnumC5765c(String str) {
            this.f54864a = str;
        }

        @NonNull
        /* renamed from: a */
        public final String m28362a() {
            return this.f54864a;
        }
    }

    public sv0(EnumC5764b enumC5764b, Map<String, Object> map) {
        this(enumC5764b.m28361a(), map);
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, Object> m28359a() {
        return this.f54812b;
    }

    @NonNull
    /* renamed from: b */
    public final String m28360b() {
        return this.f54811a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sv0.class != obj.getClass()) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        if (this.f54811a.equals(sv0Var.f54811a)) {
            return this.f54812b.equals(sv0Var.f54812b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54812b.hashCode() + (this.f54811a.hashCode() * 31);
    }

    public sv0(@NonNull String str, Map<String, Object> map) {
        map.put("sdk_version", BuildConfigFieldProvider.getVersion());
        this.f54812b = map;
        this.f54811a = str;
    }
}
