package com.swiftsoft.anixartd.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.google.gson.Gson;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.notification.SilentPush;
import com.swiftsoft.anixartd.database.entity.notification.silent.ApiSilentPush;
import com.yandex.metrica.push.YandexMetricaPush;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SilentPushReceiver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/notification/SilentPushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SilentPushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    @Inject
    public Prefs f25776a;

    @NotNull
    /* renamed from: a */
    public final Prefs m14171a() {
        Prefs prefs = this.f25776a;
        if (prefs != null) {
            return prefs;
        }
        Intrinsics.m32189r("prefs");
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(intent, "intent");
        App.f25340b.m14043a().mo14098N(this);
        String stringExtra = intent.getStringExtra(YandexMetricaPush.EXTRA_PAYLOAD);
        try {
            if (((SilentPush) new Gson().m12831b(stringExtra, SilentPush.class)).getType() == 1) {
                Object m12831b = new Gson().m12831b(stringExtra, ApiSilentPush.class);
                Intrinsics.m32178g(m12831b, "Gson().fromJson(payload,…piSilentPush::class.java)");
                ApiSilentPush apiSilentPush = (ApiSilentPush) m12831b;
                boolean z = URLUtil.isValidUrl(apiSilentPush.getApiUrl()) && Patterns.WEB_URL.matcher(apiSilentPush.getApiUrl()).matches();
                boolean z2 = URLUtil.isValidUrl(apiSilentPush.getApiAltUrl()) && Patterns.WEB_URL.matcher(apiSilentPush.getApiAltUrl()).matches();
                if (z) {
                    m14171a().m14052H(apiSilentPush.getApiUrl());
                    m14171a().m14049E(Intrinsics.m32174c(apiSilentPush.getApiUrl(), "https://api.anixart.tv/") ? false : true);
                }
                if (z2) {
                    m14171a().m14051G(apiSilentPush.getApiAltUrl());
                    if (Intrinsics.m32174c(apiSilentPush.getApiAltUrl(), "https://api-s2.anixart.tv/") || !m14171a().m14082y()) {
                        return;
                    }
                    m14171a().m14050F(true);
                }
            }
        } catch (Exception unused) {
        }
    }
}
