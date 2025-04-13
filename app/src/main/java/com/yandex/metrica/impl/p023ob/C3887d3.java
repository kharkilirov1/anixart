package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4040j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d3 */
/* loaded from: classes2.dex */
public class C3887d3 implements InterfaceC3284F2 {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3653Tm<Context, Intent, Void>> f44900a;

    /* renamed from: b */
    private boolean f44901b;

    /* renamed from: c */
    private boolean f44902c;

    /* renamed from: d */
    @NonNull
    private final Context f44903d;

    /* renamed from: e */
    @NonNull
    private final C4040j0 f44904e;

    /* renamed from: com.yandex.metrica.impl.ob.d3$a */
    public class a implements InterfaceC3628Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3628Sm
        /* renamed from: a */
        public void mo18423a(Context context, Intent intent) {
            C3887d3.m19702a(C3887d3.this, context, intent);
        }
    }

    public C3887d3(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, interfaceExecutorC4297sn, new C4040j0.a());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public synchronized void mo17988a() {
        this.f44902c = true;
        if (!this.f44900a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f44904e.m20073a(this.f44903d, intentFilter);
            this.f44901b = true;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public synchronized void mo17990b() {
        this.f44902c = false;
        if (this.f44901b) {
            this.f44904e.m20074a(this.f44903d);
            this.f44901b = false;
        }
    }

    @VisibleForTesting
    public C3887d3(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4040j0.a aVar) {
        this.f44900a = new ArrayList();
        this.f44901b = false;
        this.f44902c = false;
        this.f44903d = context;
        this.f44904e = aVar.m20075a(new C4218pm(new a(), interfaceExecutorC4297sn));
    }

    /* renamed from: b */
    public synchronized void m19704b(@NonNull InterfaceC3653Tm<Context, Intent, Void> interfaceC3653Tm) {
        this.f44900a.remove(interfaceC3653Tm);
        if (this.f44900a.isEmpty() && this.f44901b) {
            this.f44904e.m20074a(this.f44903d);
            this.f44901b = false;
        }
    }

    /* renamed from: a */
    public synchronized void m19703a(@NonNull InterfaceC3653Tm<Context, Intent, Void> interfaceC3653Tm) {
        this.f44900a.add(interfaceC3653Tm);
        if (this.f44902c && !this.f44901b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f44904e.m20073a(this.f44903d, intentFilter);
            this.f44901b = true;
        }
    }

    /* renamed from: a */
    public static void m19702a(C3887d3 c3887d3, Context context, Intent intent) {
        synchronized (c3887d3) {
            Iterator<InterfaceC3653Tm<Context, Intent, Void>> it = c3887d3.f44900a.iterator();
            while (it.hasNext()) {
                it.next().mo17948a(context, intent);
            }
        }
    }
}
