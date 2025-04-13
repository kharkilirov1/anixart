package com.yandex.metrica.impl.p023ob;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.C4483l;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Oj */
/* loaded from: classes2.dex */
public class C3526Oj implements InterfaceC3859c1 {

    /* renamed from: a */
    @NonNull
    private final Handler f43578a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f43579b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f43580c;

    @VisibleForTesting
    public C3526Oj(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull Handler handler, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn2, @NonNull C3780Z c3780z) {
        this.f43579b = interfaceExecutorC4297sn;
        this.f43578a = handler;
        this.f43580c = interfaceExecutorC4297sn2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: a */
    public C3206C mo18687a() {
        return new C3206C(this.f43580c);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    /* renamed from: a */
    public void mo18688a(@NonNull C4483l c4483l, @NonNull InterfaceC3756Y0 interfaceC3756Y0) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    /* renamed from: a */
    public void mo18689a(@Nullable Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: b */
    public InterfaceExecutorC4297sn mo18690b() {
        return this.f43579b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: c */
    public Handler mo18691c() {
        return this.f43578a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3859c1
    @NonNull
    /* renamed from: d */
    public InterfaceC4104lc mo18692d() {
        return new C3948fc();
    }
}
