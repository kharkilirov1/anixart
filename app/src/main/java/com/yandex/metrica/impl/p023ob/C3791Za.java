package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Za */
/* loaded from: classes2.dex */
public class C3791Za<T> {

    /* renamed from: a */
    @NonNull
    private final Context f44634a;

    /* renamed from: b */
    @NonNull
    private final String f44635b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3766Ya<T> f44636c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3703Vm<C3741Xa, C3716Wa> f44637d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3869cb f44638e;

    /* renamed from: f */
    @NonNull
    private final C3843bb f44639f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3706W0 f44640g;

    /* renamed from: h */
    @NonNull
    private final InterfaceC3529Om f44641h;

    public C3791Za(@NonNull Context context, @NonNull InterfaceC3807a1 interfaceC3807a1, @NonNull String str, @NonNull InterfaceC3766Ya<T> interfaceC3766Ya, @NonNull InterfaceC3703Vm<C3741Xa, C3716Wa> interfaceC3703Vm, @NonNull InterfaceC3869cb interfaceC3869cb) {
        this(context, str, interfaceC3766Ya, interfaceC3703Vm, interfaceC3869cb, new C3843bb(context, str, interfaceC3869cb, interfaceC3807a1), C3524Oh.m18679a(), new C3504Nm());
    }

    /* renamed from: a */
    public synchronized void m19506a(@Nullable T t, @NonNull C3741Xa c3741Xa) {
        if (this.f44639f.m19649a(this.f44637d.mo17917a(c3741Xa))) {
            this.f44640g.mo18348a(this.f44635b, this.f44636c.mo19144a(t));
            this.f44638e.mo19239a(new C3241D9(C3567Qa.m18783a(this.f44634a).m18799g()), this.f44641h.mo18644b());
        }
    }

    public C3791Za(@NonNull Context context, @NonNull String str, @NonNull InterfaceC3766Ya<T> interfaceC3766Ya, @NonNull InterfaceC3703Vm<C3741Xa, C3716Wa> interfaceC3703Vm, @NonNull InterfaceC3869cb interfaceC3869cb, @NonNull C3843bb c3843bb, @NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f44634a = context;
        this.f44635b = str;
        this.f44636c = interfaceC3766Ya;
        this.f44637d = interfaceC3703Vm;
        this.f44638e = interfaceC3869cb;
        this.f44639f = c3843bb;
        this.f44640g = interfaceC3706W0;
        this.f44641h = interfaceC3529Om;
    }
}
