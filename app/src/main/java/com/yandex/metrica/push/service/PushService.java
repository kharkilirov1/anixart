package com.yandex.metrica.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.impl.C4530J0;
import com.yandex.metrica.push.impl.C4609x0;
import com.yandex.metrica.push.impl.InterfaceC4607w0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class PushService extends Service {

    /* renamed from: a */
    @NonNull
    private final C4609x0 f47595a = new C4609x0();

    /* renamed from: b */
    @NonNull
    private final Executor f47596b = Executors.newSingleThreadExecutor();

    /* renamed from: com.yandex.metrica.push.service.PushService$a */
    public class RunnableC4615a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4607w0 f47597a;

        /* renamed from: b */
        public final /* synthetic */ Intent f47598b;

        public RunnableC4615a(InterfaceC4607w0 interfaceC4607w0, Intent intent) {
            this.f47597a = interfaceC4607w0;
            this.f47598b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47597a.mo21417a(PushService.this, this.f47598b.getExtras());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        try {
            String stringExtra = intent.getStringExtra(PushServiceFacade.EXTRA_COMMAND);
            C4616a.m21746a(stringExtra, intent.getLongExtra(PushServiceFacade.EXTRA_COMMAND_RECEIVED_TIME, -1L), C4530J0.m21445a(intent.getExtras()), "PushService");
            InterfaceC4607w0 m21745a = this.f47595a.m21745a(stringExtra);
            if (m21745a == null) {
                return 2;
            }
            this.f47596b.execute(new RunnableC4615a(m21745a, intent));
            return 2;
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to handle command ", th);
            PublicLogger.m21384e(th, "An unexpected error occurred while running the AppMetreica Push SDK. You can report it via https://appmetrica.yandex.com/docs/troubleshooting/other.html", new Object[0]);
            return 2;
        }
    }
}
