package com.yandex.metrica.push.core.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.impl.C4520E0;
import com.yandex.metrica.push.impl.C4530J0;

/* renamed from: com.yandex.metrica.push.core.notification.e */
/* loaded from: classes2.dex */
public class C4502e {

    /* renamed from: a */
    @NonNull
    private final NotificationManager f47258a;

    /* renamed from: b */
    @Nullable
    private final NotificationChannel f47259b;

    public C4502e(@NonNull Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f47258a = notificationManager;
        if (C4530J0.m21447a(26)) {
            this.f47259b = C4520E0.m21426a(notificationManager);
        } else {
            this.f47259b = null;
        }
    }

    /* renamed from: a */
    public void m21397a() {
        if (C4530J0.m21447a(26)) {
            C4520E0.m21428a(this.f47258a, this.f47259b);
        }
    }

    @Nullable
    /* renamed from: b */
    public NotificationChannel m21398b() {
        return this.f47259b;
    }

    /* renamed from: c */
    public void m21399c() {
        if (C4530J0.m21447a(26)) {
            C4520E0.m21432b(this.f47258a, this.f47259b);
        }
    }
}
