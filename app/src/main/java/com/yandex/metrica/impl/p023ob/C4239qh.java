package com.yandex.metrica.impl.p023ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.qh */
/* loaded from: classes2.dex */
public class C4239qh extends AbstractC4213ph<C4057jh> {

    /* renamed from: b */
    @NonNull
    private final C4109lh f46245b;

    /* renamed from: c */
    @Nullable
    private C4005hh f46246c;

    /* renamed from: d */
    private long f46247d;

    public C4239qh() {
        this(new C4109lh());
    }

    /* renamed from: a */
    public void m20598a(@NonNull C4005hh c4005hh) {
        this.f46246c = c4005hh;
    }

    @VisibleForTesting
    public C4239qh(@NonNull C4109lh c4109lh) {
        this.f46245b = c4109lh;
    }

    /* renamed from: a */
    public void m20596a(long j2) {
        this.f46247d = j2;
    }

    /* renamed from: a */
    public void m20597a(@NonNull Uri.Builder builder, @NonNull C4057jh c4057jh) {
        m20557a(builder);
        builder.path("report");
        C4005hh c4005hh = this.f46246c;
        if (c4005hh != null) {
            builder.appendQueryParameter("deviceid", C3509O2.m18655a(c4005hh.f45281a, c4057jh.m19751g()));
            builder.appendQueryParameter("uuid", C3509O2.m18655a(this.f46246c.f45282b, c4057jh.m19768x()));
            m20595a(builder, "analytics_sdk_version", this.f46246c.f45283c);
            m20595a(builder, "analytics_sdk_version_name", this.f46246c.f45284d);
            builder.appendQueryParameter("app_version_name", C3509O2.m18655a(this.f46246c.f45287g, c4057jh.m19750f()));
            builder.appendQueryParameter("app_build_number", C3509O2.m18655a(this.f46246c.f45289i, c4057jh.m19742b()));
            builder.appendQueryParameter("os_version", C3509O2.m18655a(this.f46246c.f45290j, c4057jh.m19760p()));
            m20595a(builder, "os_api_level", this.f46246c.f45291k);
            m20595a(builder, "analytics_sdk_build_number", this.f46246c.f45285e);
            m20595a(builder, "analytics_sdk_build_type", this.f46246c.f45286f);
            m20595a(builder, "app_debuggable", this.f46246c.f45288h);
            builder.appendQueryParameter("locale", C3509O2.m18655a(this.f46246c.f45292l, c4057jh.m19756l()));
            builder.appendQueryParameter("is_rooted", C3509O2.m18655a(this.f46246c.f45293m, c4057jh.m19753i()));
            builder.appendQueryParameter("app_framework", C3509O2.m18655a(this.f46246c.f45294n, c4057jh.m19744c()));
            m20595a(builder, "attribution_id", this.f46246c.f45295o);
            C4005hh c4005hh2 = this.f46246c;
            String str = c4005hh2.f45286f;
            String str2 = c4005hh2.f45296p;
            if (str != null && str.contains("source") && !TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter("commit_hash", str2);
            }
        }
        builder.appendQueryParameter("api_key_128", c4057jh.m20097C());
        builder.appendQueryParameter("app_id", c4057jh.m19761q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter("model", c4057jh.m19758n());
        builder.appendQueryParameter("manufacturer", c4057jh.m19757m());
        builder.appendQueryParameter("screen_width", String.valueOf(c4057jh.m19766v()));
        builder.appendQueryParameter("screen_height", String.valueOf(c4057jh.m19765u()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(c4057jh.m19764t()));
        builder.appendQueryParameter("scalefactor", String.valueOf(c4057jh.m19763s()));
        builder.appendQueryParameter("device_type", c4057jh.m19754j());
        m20595a(builder, "clids_set", c4057jh.m20100F());
        builder.appendQueryParameter("app_set_id", c4057jh.m19746d());
        builder.appendQueryParameter("app_set_id_scope", c4057jh.m19748e());
        this.f46245b.m20389a(builder, c4057jh.m19735a());
        builder.appendQueryParameter("request_id", String.valueOf(this.f46247d));
    }

    /* renamed from: a */
    private void m20595a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
