package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4040j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.K */
/* loaded from: classes2.dex */
public class C3406K implements InterfaceC3284F2 {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3678Um<Intent>> f43254a;

    /* renamed from: b */
    @Nullable
    private Intent f43255b;

    /* renamed from: c */
    @NonNull
    private final Context f43256c;

    /* renamed from: d */
    @NonNull
    private final C4040j0 f43257d;

    /* renamed from: com.yandex.metrica.impl.ob.K$a */
    public class a implements InterfaceC3628Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3628Sm
        /* renamed from: a */
        public void mo18423a(Context context, Intent intent) {
            Intent intent2 = intent;
            synchronized (C3406K.this) {
                C3406K.this.f43255b = intent2;
                C3406K.this.m18420a(intent2);
            }
        }
    }

    public C3406K(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, interfaceExecutorC4297sn, new C4040j0.a());
    }

    @Nullable
    /* renamed from: c */
    public synchronized Intent m18422c(@NonNull InterfaceC3678Um<Intent> interfaceC3678Um) {
        this.f43254a.add(interfaceC3678Um);
        return this.f43255b;
    }

    @VisibleForTesting
    public C3406K(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4040j0.a aVar) {
        this.f43254a = new ArrayList();
        this.f43255b = null;
        this.f43256c = context;
        this.f43257d = aVar.m20075a(new C4218pm(new a(), interfaceExecutorC4297sn));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public synchronized void mo17988a() {
        Intent m20073a = this.f43257d.m20073a(this.f43256c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f43255b = m20073a;
        m18420a(m20073a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public synchronized void mo17990b() {
        this.f43255b = null;
        this.f43255b = null;
        this.f43257d.m20074a(this.f43256c);
        m18420a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m18420a(@Nullable Intent intent) {
        Iterator<InterfaceC3678Um<Intent>> it = this.f43254a.iterator();
        while (it.hasNext()) {
            it.next().mo17875b(intent);
        }
    }
}
