package com.yandex.metrica.push.core.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4594q;
import com.yandex.metrica.push.impl.InterfaceC4612z;

/* renamed from: com.yandex.metrica.push.core.notification.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4505h implements InterfaceC4612z {

    /* renamed from: a */
    @NonNull
    private final C4498a f47278a = new C4498a();

    /* renamed from: a */
    public void m21409a(@NonNull Context context, @NonNull C4594q c4594q) {
        Intent m21388a = this.f47278a.m21388a(context, c4594q.f47462c);
        if (m21388a == null) {
            PublicLogger.m21386w("Intent action for pushId = %s is null", c4594q.f47461b);
            TrackersHub.getInstance().reportError("Open action intent is null", null);
            return;
        }
        try {
            m21388a.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, c4594q.f47463d);
            Bundle bundle = c4594q.f47472m;
            if (bundle != null) {
                m21388a.putExtras(bundle);
            }
            if (c4594q.f47473n) {
                m21388a.setPackage(context.getPackageName());
            }
            context.startActivity(m21388a);
        } catch (Exception e2) {
            PublicLogger.m21384e(e2, "Smth wrong when starting activity for push message with pushId=%s", c4594q.f47461b);
            TrackersHub.getInstance().reportError("Error starting activity", e2);
        }
    }
}
