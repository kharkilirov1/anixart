package com.yandex.metrica.impl.p023ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.ConfigurationService;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.F6 */
/* loaded from: classes2.dex */
public class C3288F6 implements InterfaceC3338H6, InterfaceC3263E6 {

    /* renamed from: a */
    @NonNull
    private final Context f42866a;

    /* renamed from: b */
    @Nullable
    private final AlarmManager f42867b;

    /* renamed from: c */
    @NonNull
    private InterfaceC3529Om f42868c;

    public C3288F6(@NonNull Context context) {
        this(context, (AlarmManager) context.getSystemService("alarm"), new C3504Nm());
    }

    /* renamed from: a */
    public static PendingIntent m18032a(C3288F6 c3288f6, Context context) {
        Objects.requireNonNull(c3288f6);
        try {
            return PendingIntent.getService(context, 7695435, new Intent(context, (Class<?>) ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START"), C3658U2.m19211a(23) ? 201326592 : 134217728);
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C3288F6(@NonNull Context context, @Nullable AlarmManager alarmManager, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f42866a = context;
        this.f42867b = alarmManager;
        this.f42868c = interfaceC3529Om;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3338H6
    /* renamed from: a */
    public void mo17952a(long j2, boolean z) {
        AlarmManager alarmManager = this.f42867b;
        if (alarmManager != null) {
            try {
                PendingIntent m18032a = m18032a(this, this.f42866a);
                if (m18032a != null) {
                    alarmManager.set(3, this.f42868c.mo18645c() + j2, m18032a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3338H6
    /* renamed from: a */
    public void mo17951a() {
        AlarmManager alarmManager = this.f42867b;
        if (alarmManager != null) {
            try {
                PendingIntent m18032a = m18032a(this, this.f42866a);
                if (m18032a != null) {
                    alarmManager.cancel(m18032a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3263E6
    /* renamed from: a */
    public void mo17953a(@NonNull Bundle bundle) {
        try {
            this.f42866a.startService(new Intent().setComponent(new ComponentName(this.f42866a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }
}
