package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.swiftsoft.anixartd.C2507R;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Common;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Common {
    @NotNull
    /* renamed from: a */
    public final String m16296a(@NotNull String url) {
        Intrinsics.m32179h(url, "url");
        try {
            String host = new URL(url).getHost();
            Intrinsics.m32178g(host, "URL(url).host");
            return host;
        } catch (Exception unused) {
            return url;
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m16297b(@NotNull String str, boolean z) {
        if (!z) {
            return str;
        }
        String m16296a = m16296a(str);
        StringBuilder m24u = C0000a.m24u("mirror.");
        m24u.append(m16296a(str));
        return StringsKt.m33891Q(str, m16296a, m24u.toString(), false, 4, null);
    }

    @Nullable
    /* renamed from: c */
    public final String m16298c(@Nullable String str, boolean z) {
        boolean z2 = true;
        if (str == null || StringsKt.m33879E(str)) {
            return str;
        }
        if (!StringsKt.m33922t(m16296a(str), "anixstatic.com", false, 2, null) && !StringsKt.m33922t(m16296a(str), "static.anixart.tv", false, 2, null)) {
            z2 = false;
        }
        if (!z || !z2) {
            return str;
        }
        String m16296a = m16296a(str);
        StringBuilder m24u = C0000a.m24u("mirror.");
        m24u.append(m16296a(str));
        return StringsKt.m33891Q(str, m16296a, m24u.toString(), false, 4, null);
    }

    /* renamed from: d */
    public final boolean m16299d(@NotNull Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        Integer valueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode & 48);
        if (valueOf != null && valueOf.intValue() == 32) {
            return true;
        }
        if (valueOf == null) {
            return false;
        }
        valueOf.intValue();
        return false;
    }

    /* renamed from: e */
    public final void m16300e(@NotNull Context context, @NotNull String url) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(url, "url");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.f1735a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        int color = context.getResources().getColor(C2507R.color.screen_background);
        builder.f1736b.f1727a = Integer.valueOf(color | (-16777216));
        CustomTabsIntent m1024a = builder.m1024a();
        m1024a.f1733a.setData(Uri.parse(url));
        ContextCompat.m1676i(context, m1024a.f1733a, m1024a.f1734b);
    }
}
