package com.yandex.metrica.impl.p023ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.M6 */
/* loaded from: classes2.dex */
public class C3463M6 {

    /* renamed from: a */
    @NonNull
    private Context f43398a;

    /* renamed from: b */
    @NonNull
    private ServiceConnection f43399b;

    /* renamed from: com.yandex.metrica.impl.ob.M6$a */
    public class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public C3463M6(@NonNull Context context) {
        this(context, new a());
    }

    /* renamed from: a */
    public void m18572a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context context = this.f43398a;
        Intent intent = null;
        try {
            ResolveInfo resolveService = context.getPackageManager().resolveService(C3334H2.m18185a(context).setPackage(str), 0);
            if (resolveService != null) {
                Intent intent2 = new Intent();
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                intent = intent2.setClassName(serviceInfo.packageName, serviceInfo.name).setAction("com.yandex.metrica.ACTION_C_BG_L");
            }
        } catch (Throwable unused) {
        }
        if (intent != null) {
            this.f43398a.bindService(intent, this.f43399b, 1);
        }
    }

    @VisibleForTesting
    public C3463M6(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        this.f43398a = context;
        this.f43399b = serviceConnection;
    }

    /* renamed from: a */
    public void m18571a() {
        this.f43398a.unbindService(this.f43399b);
    }
}
