package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.pr */
/* loaded from: classes3.dex */
final class C5602pr {

    /* renamed from: a */
    @NonNull
    private final C5961w7 f53626a;

    /* renamed from: b */
    @NonNull
    private final C5507nr f53627b;

    /* renamed from: f */
    @NonNull
    private final w80 f53631f;

    /* renamed from: c */
    @NonNull
    private final zz0 f53628c = new zz0();

    /* renamed from: d */
    @NonNull
    private final l01 f53629d = new l01();

    /* renamed from: e */
    @NonNull
    private final C5932vo f53630e = new C5932vo();

    /* renamed from: g */
    @NonNull
    private final C6009x7 f53632g = new C6009x7();

    /* renamed from: h */
    @NonNull
    private final C5654qr f53633h = new C5654qr();

    public C5602pr(@NonNull Context context, @NonNull C5101g2 c5101g2) {
        this.f53626a = c5101g2.m24783e();
        this.f53627b = c5101g2.m24788j();
        this.f53631f = w80.m29404a(context);
    }

    /* renamed from: a */
    public final void m27368a(@NonNull Context context, @NonNull Uri.Builder builder) {
        String str;
        Location m29405a;
        m27367a(builder, "app_id", context.getPackageName());
        String str2 = null;
        boolean z = false;
        try {
            str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
            str = null;
        }
        m27367a(builder, "app_version_code", str);
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e3) {
            n60.m26808a(e3, e3.getMessage(), new Object[0]);
        }
        m27367a(builder, "app_version_name", str2);
        m27367a(builder, "sdk_version", this.f53628c.m30347a());
        m27367a(builder, "sdk_version_name", this.f53628c.m30348b());
        m27367a(builder, this.f53633h.m27779b(), this.f53630e.m29244a(context));
        m27367a(builder, "locale", this.f53630e.m29245b(context));
        String m27780c = this.f53633h.m27780c();
        Objects.requireNonNull(this.f53630e);
        m27367a(builder, m27780c, C5932vo.m29243a());
        String m27781d = this.f53633h.m27781d();
        Objects.requireNonNull(this.f53630e);
        m27367a(builder, m27781d, Build.MODEL);
        String m27782e = this.f53633h.m27782e();
        Objects.requireNonNull(this.f53630e);
        m27367a(builder, m27782e, "android");
        String m27783f = this.f53633h.m27783f();
        Objects.requireNonNull(this.f53630e);
        m27367a(builder, m27783f, Build.VERSION.RELEASE);
        Objects.requireNonNull(this.f53629d);
        if (l01.m26310b(context) && (m29405a = this.f53631f.m29405a()) != null) {
            m27367a(builder, "location_timestamp", String.valueOf(m29405a.getTime()));
            m27367a(builder, "lat", String.valueOf(m29405a.getLatitude()));
            m27367a(builder, "lon", String.valueOf(m29405a.getLongitude()));
            m27367a(builder, "precision", String.valueOf(Math.round(m29405a.getAccuracy())));
        }
        Objects.requireNonNull(this.f53629d);
        if (l01.m26310b(context)) {
            m27367a(builder, this.f53633h.m27778a(), this.f53627b.m26943b());
            C6061y7 m29394a = this.f53626a.m29394a();
            if (m29394a != null) {
                boolean m29867b = m29394a.m29867b();
                String m29866a = m29394a.m29866a();
                Objects.requireNonNull(this.f53632g);
                boolean z2 = (TextUtils.isEmpty(m29866a) || "00000000-0000-0000-0000-000000000000".equals(m29866a)) ? false : true;
                if (!m29867b && z2) {
                    m27367a(builder, "google_aid", m29866a);
                }
            }
            C6061y7 m29397b = this.f53626a.m29397b();
            if (m29397b != null) {
                boolean m29867b2 = m29397b.m29867b();
                String m29866a2 = m29397b.m29866a();
                Objects.requireNonNull(this.f53632g);
                if (!TextUtils.isEmpty(m29866a2) && !"00000000-0000-0000-0000-000000000000".equals(m29866a2)) {
                    z = true;
                }
                if (m29867b2 || !z) {
                    return;
                }
                m27367a(builder, "huawei_oaid", m29866a2);
            }
        }
    }

    /* renamed from: a */
    private static void m27367a(@NonNull Uri.Builder builder, @NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
