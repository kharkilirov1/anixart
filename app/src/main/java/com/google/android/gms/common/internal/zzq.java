package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.yandex.metrica.push.common.CoreConstants;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
final class zzq implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ zzr f15821b;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f15821b.f15822d) {
                zzn zznVar = (zzn) message.obj;
                zzo zzoVar = this.f15821b.f15822d.get(zznVar);
                if (zzoVar != null && zzoVar.f15814b.isEmpty()) {
                    if (zzoVar.f15816d) {
                        zzoVar.f15820h.f15824f.removeMessages(1, zzoVar.f15818f);
                        zzr zzrVar = zzoVar.f15820h;
                        zzrVar.f15825g.m8226c(zzrVar.f15823e, zzoVar);
                        zzoVar.f15816d = false;
                        zzoVar.f15815c = 2;
                    }
                    this.f15821b.f15822d.remove(zznVar);
                }
            }
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        synchronized (this.f15821b.f15822d) {
            zzn zznVar2 = (zzn) message.obj;
            zzo zzoVar2 = this.f15821b.f15822d.get(zznVar2);
            if (zzoVar2 != null && zzoVar2.f15815c == 3) {
                String valueOf = String.valueOf(zznVar2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentName = zzoVar2.f15819g;
                if (componentName == null) {
                    java.util.Objects.requireNonNull(zznVar2);
                    componentName = null;
                }
                if (componentName == null) {
                    String str = zznVar2.f15811b;
                    java.util.Objects.requireNonNull(str, "null reference");
                    componentName = new ComponentName(str, CoreConstants.Transport.UNKNOWN);
                }
                zzoVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
