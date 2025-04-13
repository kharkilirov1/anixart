package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.billing_interface.EnumC3116b;
import com.yandex.metrica.impl.p023ob.C3256E;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.y3 */
/* loaded from: classes2.dex */
public class C4433y3 {

    /* renamed from: a */
    @Nullable
    private InterfaceC4247r f46979a;

    /* renamed from: b */
    @NonNull
    private final Context f46980b;

    /* renamed from: c */
    @NonNull
    private final Executor f46981c;

    /* renamed from: d */
    @NonNull
    private final Executor f46982d;

    /* renamed from: e */
    @NonNull
    private final EnumC3116b f46983e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC4325u f46984f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC4299t f46985g;

    /* renamed from: h */
    @NonNull
    private final C3256E f46986h;

    /* renamed from: i */
    @NonNull
    private final C4407x3 f46987i;

    /* renamed from: com.yandex.metrica.impl.ob.y3$a */
    public class a implements C3256E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3256E.b
        /* renamed from: a */
        public void mo17994a(@NonNull C3256E.a aVar) {
            C4433y3.m21179a(C4433y3.this, aVar);
        }
    }

    public C4433y3(@NonNull Context context, @NonNull Executor executor, @NonNull Executor executor2, @NonNull EnumC3116b enumC3116b, @NonNull InterfaceC4325u interfaceC4325u, @NonNull InterfaceC4299t interfaceC4299t, @NonNull C3256E c3256e, @NonNull C4407x3 c4407x3) {
        this.f46980b = context;
        this.f46981c = executor;
        this.f46982d = executor2;
        this.f46983e = enumC3116b;
        this.f46984f = interfaceC4325u;
        this.f46985g = interfaceC4299t;
        this.f46986h = c3256e;
        this.f46987i = c4407x3;
    }

    /* renamed from: a */
    public static void m21179a(C4433y3 c4433y3, C3256E.a aVar) {
        Objects.requireNonNull(c4433y3);
        if (aVar == C3256E.a.VISIBLE) {
            try {
                InterfaceC4247r interfaceC4247r = c4433y3.f46979a;
                if (interfaceC4247r != null) {
                    interfaceC4247r.mo17783b();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m21181a(@NonNull C3575Qi c3575Qi, @Nullable Boolean bool) {
        InterfaceC4247r m21139a;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            synchronized (this) {
                m21139a = this.f46987i.m21139a(this.f46980b, this.f46981c, this.f46982d, this.f46983e, this.f46984f, this.f46985g);
                this.f46979a = m21139a;
            }
            m21139a.mo17782a(c3575Qi.m18845c());
            if (this.f46986h.m17987a(new a()) == C3256E.a.VISIBLE) {
                try {
                    InterfaceC4247r interfaceC4247r = this.f46979a;
                    if (interfaceC4247r != null) {
                        interfaceC4247r.mo17783b();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m21180a(@NonNull C3575Qi c3575Qi) {
        InterfaceC4247r interfaceC4247r;
        synchronized (this) {
            interfaceC4247r = this.f46979a;
        }
        if (interfaceC4247r != null) {
            interfaceC4247r.mo17782a(c3575Qi.m18845c());
        }
    }
}
