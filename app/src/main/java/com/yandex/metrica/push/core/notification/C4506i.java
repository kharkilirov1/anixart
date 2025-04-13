package com.yandex.metrica.push.core.notification;

import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4530J0;
import com.yandex.metrica.push.impl.C4538N0;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4568d;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.push.core.notification.i */
/* loaded from: classes2.dex */
public class C4506i {

    /* renamed from: a */
    @NonNull
    private final Context f47279a;

    public C4506i(@NonNull Context context) {
        this.f47279a = context;
    }

    @Nullable
    /* renamed from: a */
    public String m21410a(@Nullable String str, int i2) {
        C4568d.a aVar;
        boolean m21462a;
        Iterator<C4568d.a> it = C4562a.m21488a(this.f47279a).m21501g().m21536c().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (C4530J0.m21448a(aVar.f47368c, str) && C4530J0.m21448a(aVar.f47367b, Integer.valueOf(i2))) {
                break;
            }
        }
        String str2 = aVar == null ? null : aVar.f47366a;
        boolean z = aVar != null && Boolean.TRUE.equals(aVar.f47369d);
        if (C4530J0.m21447a(23) && (m21462a = C4538N0.m21462a((NotificationManager) this.f47279a.getSystemService("notification"), str, i2)) != z) {
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = str2;
            objArr[3] = z ? "" : "not ";
            objArr[4] = m21462a ? "" : "not ";
            String format = String.format("Failed get active status for notification [%s, %s]. Preferences has pushId %s (%sactive), but notification in status bar is %sactive", objArr);
            TrackersHub.getInstance().reportError(format, null);
            InternalLogger.m21368e(format, new Object[0]);
            z = m21462a;
        }
        if (z) {
            return str2;
        }
        return null;
    }
}
