package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;

/* loaded from: classes3.dex */
public final class aa1 {

    /* renamed from: a */
    private final EnumC4801a f48450a;

    /* renamed from: b */
    private final uv0 f48451b;

    /* renamed from: c */
    private String f48452c;

    /* renamed from: com.yandex.mobile.ads.impl.aa1$a */
    public enum EnumC4801a {
        f48453b("success"),
        f48454c("application_inactive"),
        f48455d("inconsistent_asset_value"),
        f48456e("no_ad_view"),
        f48457f("no_visible_ads"),
        f48458g("no_visible_required_assets"),
        f48459h("not_added_to_hierarchy"),
        f48460i("not_visible_for_percent"),
        f48461j("required_asset_can_not_be_visible"),
        f48462k("required_asset_is_not_subview"),
        f48463l("superview_hidden"),
        f48464m("too_small"),
        f48465n("visible_area_too_small");


        /* renamed from: a */
        private final String f48467a;

        EnumC4801a(String str) {
            this.f48467a = str;
        }

        /* renamed from: a */
        public final String m22448a() {
            return this.f48467a;
        }
    }

    public aa1(@NonNull EnumC4801a enumC4801a, @NonNull uv0 uv0Var) {
        this.f48450a = enumC4801a;
        this.f48451b = uv0Var;
    }

    /* renamed from: a */
    public final String m22442a() {
        return this.f48452c;
    }

    @NonNull
    /* renamed from: b */
    public final sv0.EnumC5764b m22444b() {
        return this.f48451b.mo23793a();
    }

    @NonNull
    /* renamed from: c */
    public final sv0.EnumC5764b m22445c() {
        return this.f48451b.mo23794a(this.f48450a);
    }

    @NonNull
    /* renamed from: d */
    public final sv0.EnumC5764b m22446d() {
        return this.f48451b.mo23795b();
    }

    /* renamed from: e */
    public final EnumC4801a m22447e() {
        return this.f48450a;
    }

    /* renamed from: a */
    public final void m22443a(String str) {
        this.f48452c = str;
    }
}
