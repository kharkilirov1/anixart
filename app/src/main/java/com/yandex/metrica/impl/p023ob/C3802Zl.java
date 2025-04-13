package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Zl */
/* loaded from: classes2.dex */
public class C3802Zl implements InterfaceC3403Jl {

    /* renamed from: a */
    @NonNull
    private final C4477zl f44698a;

    /* renamed from: b */
    @NonNull
    private final C4347ul f44699b;

    /* renamed from: c */
    @NonNull
    private final C3291F9 f44700c;

    /* renamed from: d */
    @NonNull
    private final C3827al f44701d;

    /* renamed from: e */
    @NonNull
    private final C4165nl f44702e;

    /* renamed from: f */
    @Nullable
    private Activity f44703f;

    /* renamed from: g */
    @Nullable
    private C3378Il f44704g;

    /* renamed from: com.yandex.metrica.impl.ob.Zl$a */
    public class a implements InterfaceC3678Um<Activity> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(Activity activity) {
            C3802Zl.this.f44698a.m21308a(activity);
        }
    }

    public C3802Zl(@NonNull Context context, @NonNull C3291F9 c3291f9, @NonNull InterfaceC4062jm interfaceC4062jm, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @Nullable C3378Il c3378Il) {
        this(context, c3291f9, interfaceC4062jm, interfaceExecutorC4297sn, c3378Il, new C3827al(c3378Il));
    }

    /* renamed from: b */
    public synchronized void m19533b(@NonNull Activity activity) {
        this.f44703f = activity;
        this.f44698a.m21308a(activity);
    }

    private C3802Zl(@NonNull Context context, @NonNull C3291F9 c3291f9, @NonNull InterfaceC4062jm interfaceC4062jm, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @Nullable C3378Il c3378Il, @NonNull C3827al c3827al) {
        this(c3291f9, interfaceC4062jm, c3378Il, c3827al, new C3452Lk(1, c3291f9), new C3984gm(interfaceExecutorC4297sn, new C3477Mk(c3291f9), c3827al), new C3377Ik(context));
    }

    /* renamed from: a */
    public synchronized void m19531a(@NonNull Activity activity) {
        this.f44702e.m20467a(activity);
        this.f44703f = null;
    }

    private C3802Zl(@NonNull C3291F9 c3291f9, @NonNull InterfaceC4062jm interfaceC4062jm, @Nullable C3378Il c3378Il, @NonNull C3827al c3827al, @NonNull C3452Lk c3452Lk, @NonNull C3984gm c3984gm, @NonNull C3377Ik c3377Ik) {
        this(c3291f9, c3378Il, interfaceC4062jm, c3984gm, c3827al, new C4477zl(c3378Il, c3452Lk, c3291f9, c3984gm, c3377Ik), new C4347ul(c3378Il, c3452Lk, c3291f9, c3984gm, c3377Ik), new C3502Nk());
    }

    @VisibleForTesting
    public C3802Zl(@NonNull C3291F9 c3291f9, @Nullable C3378Il c3378Il, @NonNull InterfaceC4062jm interfaceC4062jm, @NonNull C3984gm c3984gm, @NonNull C3827al c3827al, @NonNull C4477zl c4477zl, @NonNull C4347ul c4347ul, @NonNull C3502Nk c3502Nk) {
        this.f44700c = c3291f9;
        this.f44704g = c3378Il;
        this.f44701d = c3827al;
        this.f44698a = c4477zl;
        this.f44699b = c4347ul;
        C4165nl c4165nl = new C4165nl(new a(), interfaceC4062jm);
        this.f44702e = c4165nl;
        c3984gm.m19983a(c3502Nk, c4165nl);
    }

    /* renamed from: a */
    public synchronized void m19532a(@NonNull InterfaceC3528Ol interfaceC3528Ol, boolean z) {
        this.f44699b.m20903a(this.f44703f, interfaceC3528Ol, z);
        this.f44700c.m18051c(true);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3403Jl
    /* renamed from: a */
    public synchronized void mo18415a(@NonNull C3378Il c3378Il) {
        if (!c3378Il.equals(this.f44704g)) {
            this.f44701d.m19586a(c3378Il);
            this.f44699b.m20904a(c3378Il);
            this.f44698a.m21309a(c3378Il);
            this.f44704g = c3378Il;
            Activity activity = this.f44703f;
            if (activity != null) {
                this.f44698a.m21310b(activity);
            }
        }
    }
}
