package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.oh */
/* loaded from: classes2.dex */
public class C4187oh extends AbstractC4213ph<C3545Pd> {

    /* renamed from: b */
    @NonNull
    private final C4109lh f46084b;

    /* renamed from: c */
    private long f46085c;

    public C4187oh() {
        this(new C4109lh());
    }

    /* renamed from: a */
    public void m20514a(@NonNull Uri.Builder builder, @NonNull C3545Pd c3545Pd) {
        m20557a(builder);
        builder.appendPath("location");
        builder.appendQueryParameter("deviceid", c3545Pd.m19751g());
        builder.appendQueryParameter("device_type", c3545Pd.m19754j());
        builder.appendQueryParameter("uuid", c3545Pd.m19768x());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", c3545Pd.m19755k());
        String m19755k = c3545Pd.m19755k();
        if (m19755k != null && m19755k.contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter("app_version_name", c3545Pd.m19750f());
        builder.appendQueryParameter("app_build_number", c3545Pd.m19742b());
        builder.appendQueryParameter("os_version", c3545Pd.m19760p());
        builder.appendQueryParameter("os_api_level", String.valueOf(c3545Pd.m19759o()));
        builder.appendQueryParameter("is_rooted", c3545Pd.m19753i());
        builder.appendQueryParameter("app_framework", c3545Pd.m19744c());
        builder.appendQueryParameter("app_id", c3545Pd.m19761q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("request_id", String.valueOf(this.f46085c));
        builder.appendQueryParameter("app_set_id", c3545Pd.m19746d());
        builder.appendQueryParameter("app_set_id_scope", c3545Pd.m19748e());
        this.f46084b.m20389a(builder, c3545Pd.m19735a());
    }

    @VisibleForTesting
    public C4187oh(@NonNull C4109lh c4109lh) {
        this.f46084b = c4109lh;
    }

    /* renamed from: a */
    public void m20513a(long j2) {
        this.f46085c = j2;
    }
}
