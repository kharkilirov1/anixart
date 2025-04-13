package com.yandex.metrica.push.common.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.TrackersHub;

/* renamed from: com.yandex.metrica.push.common.service.b */
/* loaded from: classes2.dex */
class C4496b implements PushServiceCommandLauncher {

    /* renamed from: a */
    @NonNull
    private final Context f47245a;

    public C4496b(@NonNull Context context) {
        this.f47245a = context;
    }

    @Override // com.yandex.metrica.push.common.service.PushServiceCommandLauncher
    public void launchService(@NonNull Bundle bundle) {
        try {
            this.f47245a.startService(new Intent().setComponent(new ComponentName(this.f47245a.getPackageName(), "com.yandex.metrica.push.service.PushService")).setAction("com.yandex.metrica.configuration.ACTION_SERVICE_START").putExtras(bundle));
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError(String.format("Launching service for command %s failed", bundle.getString(PushServiceFacade.EXTRA_COMMAND)), th);
        }
    }
}
