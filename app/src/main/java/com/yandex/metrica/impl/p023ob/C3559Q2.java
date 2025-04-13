package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC4044j4;

/* renamed from: com.yandex.metrica.impl.ob.Q2 */
/* loaded from: classes2.dex */
public class C3559Q2<C extends InterfaceC4044j4> implements InterfaceC3284F2 {

    /* renamed from: a */
    @NonNull
    private C f43659a;

    /* renamed from: b */
    public final Object f43660b = new Object();

    /* renamed from: c */
    public boolean f43661c = false;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3799Zi f43662d;

    public C3559Q2(@NonNull C c2, @NonNull InterfaceC3799Zi interfaceC3799Zi) {
        this.f43659a = c2;
        this.f43662d = interfaceC3799Zi;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: a */
    public void mo17988a() {
        synchronized (this.f43660b) {
            if (this.f43661c) {
                this.f43661c = false;
            }
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3284F2
    /* renamed from: b */
    public void mo17990b() {
        synchronized (this.f43660b) {
            if (!this.f43661c) {
                mo18776c();
                this.f43661c = true;
            }
        }
    }

    /* renamed from: c */
    public void mo18776c() {
    }

    /* renamed from: d */
    public void m18777d() {
        synchronized (this.f43660b) {
            if (!this.f43661c) {
                synchronized (this.f43660b) {
                    if (!this.f43661c) {
                        mo18779f();
                    }
                }
                mo18776c();
            }
        }
    }

    @NonNull
    /* renamed from: e */
    public C m18778e() {
        return this.f43659a;
    }

    /* renamed from: f */
    public void mo18779f() {
        this.f43662d.mo19483a();
    }
}
