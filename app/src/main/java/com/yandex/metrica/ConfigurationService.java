package com.yandex.metrica;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.AbstractC3538P6;
import com.yandex.metrica.impl.p023ob.C3288F6;
import com.yandex.metrica.impl.p023ob.C3388J6;
import com.yandex.metrica.impl.p023ob.C3488N6;
import com.yandex.metrica.impl.p023ob.C3532P0;
import com.yandex.metrica.impl.p023ob.C3563Q6;
import com.yandex.metrica.impl.p023ob.C3587R6;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConfigurationService extends Service {

    /* renamed from: b */
    @NonNull
    public Map<String, AbstractC3538P6> f42232b = new HashMap();

    /* renamed from: c */
    public C3388J6 f42233c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3532P0.m18695a(getApplicationContext());
        String.format("[ConfigurationService:%s]", getPackageName());
        this.f42233c = new C3388J6();
        Context applicationContext = getApplicationContext();
        C3488N6 c3488n6 = new C3488N6(applicationContext, this.f42233c.m18387a(), new C3288F6(applicationContext));
        this.f42232b.put("com.yandex.metrica.configuration.ACTION_INIT", new C3587R6(getApplicationContext(), c3488n6));
        this.f42232b.put("com.yandex.metrica.configuration.ACTION_SCHEDULED_START", new C3563Q6(getApplicationContext(), c3488n6));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        AbstractC3538P6 abstractC3538P6 = this.f42232b.get(intent == null ? null : intent.getAction());
        if (abstractC3538P6 == null) {
            return 2;
        }
        this.f42233c.m18388a(abstractC3538P6, intent != null ? intent.getExtras() : null);
        return 2;
    }
}
