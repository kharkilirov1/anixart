package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.gpllibrary.C3127a;
import com.yandex.metrica.gpllibrary.InterfaceC3128b;

/* renamed from: com.yandex.metrica.impl.ob.Kc */
/* loaded from: classes2.dex */
public class C3419Kc extends AbstractC4105ld<C3394Jc> {

    /* renamed from: f */
    @NonNull
    private final InterfaceC3128b f43276f;

    public C3419Kc(@NonNull Context context, @NonNull C4417xd c4417xd, @NonNull C4271rn c4271rn, @NonNull C3950fe c3950fe) {
        this(context, c4417xd, c4271rn, c3950fe, new C3808a2());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    /* renamed from: a */
    public boolean mo17899a(@NonNull C3394Jc c3394Jc) {
        C3394Jc c3394Jc2 = c3394Jc;
        if (c3394Jc2.f43243b != null && this.f45880b.mo19401a(this.f45879a)) {
            try {
                this.f43276f.startLocationUpdates(c3394Jc2.f43243b.f43052a);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    /* renamed from: b */
    public void mo17900b() {
        if (this.f45880b.mo19401a(this.f45879a)) {
            try {
                this.f43276f.updateLastKnownLocation();
            } catch (Throwable unused) {
            }
        }
    }

    private C3419Kc(@NonNull Context context, @NonNull C4417xd c4417xd, @NonNull C4271rn c4271rn, @NonNull C3950fe c3950fe, @NonNull C3808a2 c3808a2) {
        this(context, c4271rn, new C4001hd(c4417xd), c3808a2.m19563a(c3950fe));
    }

    @VisibleForTesting
    public C3419Kc(@NonNull Context context, @NonNull C4271rn c4271rn, @NonNull LocationListener locationListener, @NonNull InterfaceC3976ge interfaceC3976ge) {
        this(context, c4271rn.m20675b(), locationListener, interfaceC3976ge, m18443a(context, locationListener, c4271rn));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    /* renamed from: a */
    public void mo17898a() {
        try {
            this.f43276f.stopLocationUpdates();
        } catch (Throwable unused) {
        }
    }

    @NonNull
    /* renamed from: a */
    private static InterfaceC3128b m18443a(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull C4271rn c4271rn) {
        if (C3184B2.m17879a("com.google.android.gms.location.LocationRequest")) {
            try {
                return new C3127a(context, locationListener, c4271rn.m20675b(), c4271rn, AbstractC4105ld.f45878e);
            } catch (Throwable unused) {
            }
        }
        return new C3169Ac();
    }

    @VisibleForTesting
    public C3419Kc(@NonNull Context context, @NonNull Looper looper, @NonNull LocationListener locationListener, @NonNull InterfaceC3976ge interfaceC3976ge, @NonNull InterfaceC3128b interfaceC3128b) {
        super(context, locationListener, interfaceC3976ge, looper);
        this.f43276f = interfaceC3128b;
    }
}
