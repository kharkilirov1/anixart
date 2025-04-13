package com.yandex.metrica.push.core.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* renamed from: com.yandex.metrica.push.core.notification.a */
/* loaded from: classes2.dex */
public class C4498a {
    @Nullable
    /* renamed from: a */
    public Intent m21388a(@NonNull Context context, @Nullable String str) {
        Intent intent;
        if (CoreUtils.isEmpty(str)) {
            intent = null;
            try {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null && launchIntentForPackage.getComponent() != null) {
                    try {
                        intent = new Intent(context, Class.forName(launchIntentForPackage.getComponent().getClassName()));
                    } catch (ClassNotFoundException unused) {
                        intent = launchIntentForPackage;
                    }
                    intent.setAction(YandexMetricaPush.OPEN_DEFAULT_ACTIVITY_ACTION);
                }
            } catch (Exception unused2) {
            }
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        if (intent != null) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        return intent;
    }
}
