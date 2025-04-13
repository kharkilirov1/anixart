package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.InterfaceC4508d;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.metrica.push.impl.D */
/* loaded from: classes2.dex */
public class C4517D implements InterfaceC4519E {
    /* renamed from: a */
    public void m21424a(@NonNull Context context, @Nullable Bundle bundle) {
        if (bundle == null) {
            PublicLogger.m21386w("Received push message with empty data bundle", new Object[0]);
            TrackersHub.getInstance().reportError("Receive push message with empty bundle", null);
        } else {
            if (CoreUtils.extractRootElement(bundle) == null) {
                PublicLogger.m21385i("Receive not recognized push message", new Object[0]);
                return;
            }
            C4596r c4596r = new C4596r(context, bundle);
            try {
                m21422a(context, c4596r);
            } catch (Throwable th) {
                m21423a(c4596r, "Failed to process push", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m21422a(@NonNull Context context, @NonNull C4596r c4596r) {
        InterfaceC4523G c4521f;
        PublicLogger.m21385i(String.format("Process push with notificationId = %s", c4596r.m21659d()), new Object[0]);
        String m21659d = c4596r.m21659d();
        HashMap hashMap = new HashMap();
        hashMap.put("notification_Id", m21659d);
        TrackersHub.getInstance().reportEvent("Process push", hashMap);
        InterfaceC4572f m21503i = C4562a.m21488a(context).m21503i();
        String m21659d2 = c4596r.m21659d();
        if (CoreUtils.isNotEmpty(m21659d2) && ((C4564b) m21503i).m21509a().f47227a) {
            C4603u0.m21732a().mo21643b(m21659d2, c4596r.m21660e(), c4596r.m21664i());
        }
        C4541P mo21440a = new C4535M(context).mo21440a(c4596r);
        if (mo21440a.m21469a()) {
            C4596r c4596r2 = mo21440a.f47307b;
            Objects.requireNonNull(((C4564b) C4562a.m21488a(context).m21503i()).m21521m());
            if (c4596r2.m21665j()) {
                if (CoreUtils.isEmpty(c4596r2.m21661f())) {
                    c4521f = new C4527I();
                } else {
                    c4521f = new C4525H();
                }
            } else {
                c4521f = c4596r2.m21658c() != null ? new C4521F() : null;
            }
            if (c4521f != null) {
                c4521f.mo21433a(context, c4596r2);
            } else {
                String m21659d3 = c4596r2.m21659d();
                PublicLogger.m21386w("%s with pushId = %s", "Receive push with wrong format", m21659d3);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("notification_Id", m21659d3);
                TrackersHub.getInstance().reportEvent("Receive push with wrong format", hashMap2);
                m21423a(c4596r2, "Push data format is invalid", "Receive push with wrong format");
            }
        } else {
            C4596r c4596r3 = mo21440a.f47307b;
            InterfaceC4508d.a aVar = mo21440a.f47306a;
            m21423a(c4596r3, aVar.f47283b, aVar.f47284c);
        }
        C4562a.m21488a(context).m21501g().m21531a(mo21440a.f47307b);
    }

    /* renamed from: a */
    private void m21423a(@NonNull C4596r c4596r, @Nullable String str, @Nullable String str2) {
        InternalLogger.m21370i("Push filtered out. Category: %s. Details: %s", str, str2);
        String m21659d = c4596r.m21659d();
        if (CoreUtils.isNotEmpty(m21659d)) {
            C4603u0.m21732a().mo21645b(m21659d, str, str2, c4596r.m21660e(), c4596r.m21664i());
        }
    }
}
