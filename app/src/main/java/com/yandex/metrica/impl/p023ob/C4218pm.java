package com.yandex.metrica.impl.p023ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.pm */
/* loaded from: classes2.dex */
public class C4218pm extends BroadcastReceiver {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3628Sm<Context, Intent> f46208a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f46209b;

    /* renamed from: com.yandex.metrica.impl.ob.pm$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f46210a;

        /* renamed from: b */
        public final /* synthetic */ Intent f46211b;

        public a(Context context, Intent intent) {
            this.f46210a = context;
            this.f46211b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4218pm.this.f46208a.mo18423a(this.f46210a, this.f46211b);
        }
    }

    public C4218pm(@NonNull InterfaceC3628Sm<Context, Intent> interfaceC3628Sm, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this.f46208a = interfaceC3628Sm;
        this.f46209b = interfaceExecutorC4297sn;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ((C4271rn) this.f46209b).execute(new a(context, intent));
    }
}
