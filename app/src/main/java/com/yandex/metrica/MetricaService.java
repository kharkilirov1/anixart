package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.p023ob.AbstractC3179Am;
import com.yandex.metrica.impl.p023ob.C3183B1;
import com.yandex.metrica.impl.p023ob.C3259E2;
import com.yandex.metrica.impl.p023ob.C3532P0;
import com.yandex.metrica.impl.p023ob.C4457z1;
import com.yandex.metrica.impl.p023ob.InterfaceC4431y1;

/* loaded from: classes2.dex */
public class MetricaService extends Service {

    /* renamed from: d */
    public static InterfaceC4431y1 f42246d;

    /* renamed from: b */
    public final InterfaceC3085e f42247b = new C3081a();

    /* renamed from: c */
    public final IMetricaService.AbstractBinderC3080a f42248c = new BinderC3082b();

    /* renamed from: com.yandex.metrica.MetricaService$a */
    public class C3081a implements InterfaceC3085e {
        public C3081a() {
        }

        @Override // com.yandex.metrica.MetricaService.InterfaceC3085e
        /* renamed from: a */
        public void mo17769a(int i2) {
            MetricaService.this.stopSelfResult(i2);
        }
    }

    /* renamed from: com.yandex.metrica.MetricaService$c */
    public static class BinderC3083c extends Binder {
    }

    /* renamed from: com.yandex.metrica.MetricaService$d */
    public static class BinderC3084d extends Binder {
    }

    /* renamed from: com.yandex.metrica.MetricaService$e */
    public interface InterfaceC3085e {
        /* renamed from: a */
        void mo17769a(int i2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC3084d = "com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action) ? new BinderC3084d() : "com.yandex.metrica.ACTION_C_BG_L".equals(action) ? new BinderC3083c() : this.f42248c;
        f42246d.mo17864a(intent);
        return binderC3084d;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f42246d.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3532P0.m18695a(getApplicationContext());
        AbstractC3179Am.m17842a(getApplicationContext());
        InterfaceC4431y1 interfaceC4431y1 = f42246d;
        if (interfaceC4431y1 == null) {
            f42246d = new C4457z1(new C3183B1(getApplicationContext(), this.f42247b));
        } else {
            interfaceC4431y1.mo17868a(this.f42247b);
        }
        f42246d.mo17862a();
        C3532P0.m18696i().m18698a(new C3259E2(f42246d));
    }

    @Override // android.app.Service
    public void onDestroy() {
        f42246d.mo17871b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        f42246d.mo17874c(intent);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        f42246d.mo17865a(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        f42246d.mo17866a(intent, i2, i3);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        f42246d.mo17872b(intent);
        String action = intent.getAction();
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(action)) {
            return false;
        }
        if ("com.yandex.metrica.ACTION_C_BG_L".equals(action)) {
            return true;
        }
        return !(intent.getData() == null);
    }

    /* renamed from: com.yandex.metrica.MetricaService$b */
    public class BinderC3082b extends IMetricaService.AbstractBinderC3080a {
        @Override // com.yandex.metrica.IMetricaService
        /* renamed from: a */
        public void mo17765a(int i2, Bundle bundle) throws RemoteException {
            MetricaService.f42246d.mo17863a(i2, bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        /* renamed from: b */
        public void mo17767b(@NonNull Bundle bundle) throws RemoteException {
            MetricaService.f42246d.mo17873b(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        public void reportData(Bundle bundle) throws RemoteException {
            MetricaService.f42246d.reportData(bundle);
        }

        @Override // com.yandex.metrica.IMetricaService
        /* renamed from: a */
        public void mo17766a(@NonNull Bundle bundle) throws RemoteException {
            MetricaService.f42246d.mo17867a(bundle);
        }
    }
}
