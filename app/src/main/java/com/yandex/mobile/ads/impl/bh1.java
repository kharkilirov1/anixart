package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.aa1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bh1 {

    /* renamed from: a */
    @NonNull
    private final Map<aa1.EnumC4801a, String> f48882a = new C4866a();

    /* renamed from: com.yandex.mobile.ads.impl.bh1$a */
    public class C4866a extends HashMap<aa1.EnumC4801a, String> {
        public C4866a() {
            put(aa1.EnumC4801a.f48454c, "Screen is locked");
            put(aa1.EnumC4801a.f48455d, "Asset value %s doesn't match view value");
            put(aa1.EnumC4801a.f48456e, "No ad view");
            put(aa1.EnumC4801a.f48457f, "No valid ads in ad unit");
            put(aa1.EnumC4801a.f48458g, "No visible required assets");
            put(aa1.EnumC4801a.f48459h, "Ad view is not added to hierarchy");
            put(aa1.EnumC4801a.f48460i, "Ad is not visible for percent");
            put(aa1.EnumC4801a.f48461j, "Required asset %s is not visible in ad view");
            put(aa1.EnumC4801a.f48462k, "Required asset %s is not subview of ad view");
            put(aa1.EnumC4801a.f48453b, "Unknown error, that shouldn't happen");
            put(aa1.EnumC4801a.f48463l, "Ad view is hidden");
            put(aa1.EnumC4801a.f48464m, "View is too small");
            put(aa1.EnumC4801a.f48465n, "Visible area of an ad view is too small");
        }
    }

    @NonNull
    /* renamed from: a */
    public final String m22833a(@NonNull aa1 aa1Var) {
        String m22442a = aa1Var.m22442a();
        String str = (String) ((HashMap) this.f48882a).get(aa1Var.m22447e());
        return str != null ? String.format(str, m22442a) : "Visibility error";
    }
}
