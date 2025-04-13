package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import androidx.room.util.C0576a;
import com.google.android.gms.tasks.TaskCompletionSource;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
abstract class zzp<T> {

    /* renamed from: a */
    public final int f15290a;

    /* renamed from: b */
    public final TaskCompletionSource<T> f15291b = new TaskCompletionSource<>();

    /* renamed from: c */
    public final int f15292c;

    /* renamed from: d */
    public final Bundle f15293d;

    public zzp(int i2, int i3, Bundle bundle) {
        this.f15290a = i2;
        this.f15292c = i3;
        this.f15293d = bundle;
    }

    /* renamed from: a */
    public abstract void mo7903a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo7904b();

    /* renamed from: c */
    public final void m7905c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            Log.d("MessengerIpcClient", C0000a.m22s(new StringBuilder(valueOf.length() + 14 + valueOf2.length()), "Failing ", valueOf, " with ", valueOf2));
        }
        this.f15291b.m9715a(zzqVar);
    }

    /* renamed from: d */
    public final void m7906d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            Log.d("MessengerIpcClient", C0000a.m22s(new StringBuilder(valueOf.length() + 16 + valueOf2.length()), "Finishing ", valueOf, " with ", valueOf2));
        }
        this.f15291b.m9716b(t);
    }

    public final String toString() {
        StringBuilder m4120s = C0576a.m4120s(55, "Request { what=", this.f15292c, " id=", this.f15290a);
        m4120s.append(" oneWay=");
        m4120s.append(mo7904b());
        m4120s.append("}");
        return m4120s.toString();
    }
}
