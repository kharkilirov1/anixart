package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.C4489a;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.core.notification.AbstractC4505h;

/* renamed from: com.yandex.metrica.push.impl.v */
/* loaded from: classes2.dex */
public class C4604v extends AbstractC4505h {
    @Override // com.yandex.metrica.push.impl.InterfaceC4612z
    /* renamed from: a */
    public void mo21418a(@NonNull Context context, @NonNull Intent intent) {
        C4594q c4594q = (C4594q) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (c4594q == null) {
            TrackersHub.getInstance().reportEvent("No action info for AdditionalActionProcessingStrategy");
            return;
        }
        C4489a m21509a = ((C4564b) C4562a.m21488a(context).m21503i()).m21509a();
        boolean z = m21509a.f47230d && !m21509a.f47232f.contains(c4594q.f47465f);
        String str = c4594q.f47461b;
        if (!CoreUtils.isEmpty(str) && z) {
            C4603u0.m21732a().mo21644b(str, c4594q.f47465f, c4594q.f47463d, c4594q.f47460a);
        }
        if (!c4594q.f47474o) {
            m21409a(context, c4594q);
        }
        if (!C4530J0.m21447a(31) && c4594q.f47470k) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        if (c4594q.f47471l) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                TrackersHub.getInstance().reportEvent("No notificationManager to clear notification by button", new C4602u(this, c4594q));
                return;
            }
            notificationManager.cancel(c4594q.f47466g, c4594q.f47467h);
            C4562a.m21488a(context).m21501g().m21533a(c4594q.f47461b, false);
            TrackersHub.getInstance().reportEvent("Clear notification by button", new C4600t(this, c4594q));
        }
    }
}
