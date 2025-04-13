package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C4483l;
import com.yandex.metrica.InterfaceC3125f;
import com.yandex.metrica.impl.p023ob.C3922ec;
import com.yandex.metrica.impl.p023ob.C4041j1;
import com.yandex.metrica.rtm.wrapper.InterfaceC4621e;
import java.util.Arrays;
import java.util.Map;

@AnyThread
/* renamed from: com.yandex.metrica.impl.ob.j3 */
/* loaded from: classes2.dex */
public class C4043j3 implements InterfaceC3859c1 {

    /* renamed from: a */
    @NonNull
    private final Context f45387a;

    /* renamed from: b */
    @NonNull
    private final Handler f45388b;

    /* renamed from: c */
    @NonNull
    private final C3780Z f45389c;

    /* renamed from: d */
    @NonNull
    private final C3922ec f45390d;

    /* renamed from: e */
    @NonNull
    private final InterfaceExecutorC4297sn f45391e;

    /* renamed from: f */
    @NonNull
    private final C3206C f45392f;

    /* renamed from: g */
    @Nullable
    private volatile C3533P1 f45393g;

    /* renamed from: h */
    @Nullable
    private AbstractC3969g7 f45394h;

    /* renamed from: i */
    @NonNull
    private final InterfaceC4621e f45395i;

    /* renamed from: j */
    @NonNull
    private final C4223q1 f45396j;

    /* renamed from: k */
    private boolean f45397k;

    public C4043j3(@NonNull Context context, @NonNull C4245qn c4245qn) {
        this(context.getApplicationContext(), c4245qn.m20607b(), c4245qn.m20606a());
    }

    /* renamed from: e */
    private void m20081e() {
        if (!C4041j1.m20077a("com.yandex.metrica.CounterConfiguration")) {
            throw new C4041j1.a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
        }
        ((C4271rn) this.f45391e).execute(new RunnableC3279Em(this.f45387a));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    /* renamed from: a */
    public synchronized void mo18688a(@NonNull C4483l c4483l, @NonNull InterfaceC3756Y0 interfaceC3756Y0) {
        if (!this.f45397k) {
            Boolean bool = c4483l.crashReporting;
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue() && this.f45393g == null) {
                C4369vh c4369vh = new C4369vh(this.f45395i);
                C4073k7 c4073k7 = new C4073k7(this.f45387a, new C3608S2(interfaceC3756Y0, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3965g3(this), (InterfaceC3125f) null);
                C4073k7 c4073k72 = new C4073k7(this.f45387a, new C3608S2(interfaceC3756Y0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), new C3991h3(this), (InterfaceC3125f) null);
                if (this.f45394h == null) {
                    this.f45394h = new C4073k7(this.f45387a, new C4249r1(interfaceC3756Y0, c4483l), new C4017i3(this), c4483l.f47178l);
                }
                this.f45393g = new C3533P1(Thread.getDefaultUncaughtExceptionHandler(), Arrays.asList(c4369vh, c4073k7, c4073k72, this.f45394h), C3755Y.m19410g().m19419j(), new C3210C3(), new C3260E3());
                Thread.setDefaultUncaughtExceptionHandler(this.f45393g);
            }
            Boolean bool3 = c4483l.appOpenTrackingEnabled;
            if (bool3 != null) {
                bool2 = bool3;
            }
            if (bool2.booleanValue()) {
                this.f45392f.m17911a();
            }
            this.f45397k = true;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: b */
    public InterfaceExecutorC4297sn mo18690b() {
        return this.f45391e;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: c */
    public Handler mo18691c() {
        return this.f45388b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: d */
    public InterfaceC4104lc mo18692d() {
        return this.f45390d;
    }

    private C4043j3(@NonNull Context context, @NonNull C4271rn c4271rn, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, new C3922ec(new C3922ec.c(), new C3922ec.e(), new C3922ec.e(), c4271rn, "Client"), c4271rn, new C3780Z(), new C3206C(interfaceExecutorC4297sn), new C4421xh(), new C4223q1());
    }

    @VisibleForTesting
    public C4043j3(@NonNull Context context, @NonNull C3922ec c3922ec, @NonNull C4271rn c4271rn, @NonNull C3780Z c3780z, @NonNull C3206C c3206c, @NonNull C4421xh c4421xh, @NonNull C4223q1 c4223q1) {
        this.f45397k = false;
        this.f45387a = context;
        this.f45391e = c4271rn;
        this.f45392f = c3206c;
        this.f45396j = c4223q1;
        AbstractC3179Am.m17842a(context);
        C3184B2.m17882b();
        this.f45390d = c3922ec;
        c3922ec.m19812c(context);
        this.f45388b = c4271rn.m20670a();
        this.f45389c = c3780z;
        c3780z.m19490a();
        this.f45395i = c4421xh.m21154a(context);
        m20081e();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    /* renamed from: a */
    public void mo18689a(@Nullable Map<String, Object> map) {
        this.f45396j.m20567a(map);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: a */
    public C3206C mo18687a() {
        return this.f45392f;
    }
}
