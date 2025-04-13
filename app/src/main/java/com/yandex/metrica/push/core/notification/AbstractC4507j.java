package com.yandex.metrica.push.core.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4520E0;
import com.yandex.metrica.push.impl.C4562a;
import com.yandex.metrica.push.impl.C4564b;
import com.yandex.metrica.push.impl.C4596r;
import com.yandex.metrica.push.impl.C4603u0;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.core.notification.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4507j {

    /* renamed from: a */
    @Nullable
    private String f47280a;

    @Nullable
    /* renamed from: a */
    public abstract NotificationCompat.Builder mo21392a(@NonNull Context context, @NonNull C4596r c4596r);

    /* renamed from: b */
    public void m21411b(@NonNull Context context, @NonNull C4596r c4596r) {
        Integer m21699s = c4596r.m21658c() == null ? null : c4596r.m21658c().m21699s();
        Integer valueOf = Integer.valueOf(m21699s == null ? 0 : m21699s.intValue());
        this.f47280a = c4596r.m21658c() == null ? null : c4596r.m21658c().m21700t();
        NotificationCompat.Builder mo21392a = mo21392a(context, c4596r);
        Notification m1608a = mo21392a != null ? mo21392a.m1608a() : null;
        if (m1608a != null) {
            String str = this.f47280a;
            int intValue = valueOf.intValue();
            String m21659d = c4596r.m21659d();
            String m21664i = c4596r.m21664i();
            String m21410a = new C4506i(context).m21410a(str, intValue);
            if (m21410a != null) {
                ((C4564b) C4562a.m21488a(context).m21503i()).m21520l().mo21639a(m21410a, m21659d, m21664i);
                C4562a.m21488a(context).m21501g().m21533a(m21410a, false);
            }
            int i2 = Build.VERSION.SDK_INT;
            if (!(i2 >= 26 ? C4520E0.m21430a(context, m1608a) : true)) {
                if (i2 >= 26) {
                    C4520E0.m21429a(c4596r, m1608a);
                    return;
                }
                return;
            }
            int intValue2 = valueOf.intValue();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                try {
                    notificationManager.notify(this.f47280a, intValue2, m1608a);
                } catch (Throwable th) {
                    TrackersHub.getInstance().reportError(String.format(Locale.US, "Failed show notification with tag %s and id %d", this.f47280a, Integer.valueOf(intValue2)), th);
                }
            }
            if (CoreUtils.isEmpty(c4596r.m21659d())) {
                return;
            }
            C4603u0.m21732a().mo21650f(c4596r.m21659d(), c4596r.m21660e(), c4596r.m21664i());
            C4562a.m21488a(context).m21501g().m21532a(c4596r.m21659d(), valueOf, this.f47280a, true);
            C4562a.m21488a(context).m21501g().m21535b(c4596r);
        }
    }
}
