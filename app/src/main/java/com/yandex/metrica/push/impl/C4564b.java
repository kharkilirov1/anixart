package com.yandex.metrica.push.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.C4489a;
import com.yandex.metrica.push.core.notification.C4500c;
import com.yandex.metrica.push.core.notification.C4502e;
import com.yandex.metrica.push.core.notification.C4504g;

/* renamed from: com.yandex.metrica.push.impl.b */
/* loaded from: classes2.dex */
public class C4564b implements InterfaceC4572f {

    /* renamed from: a */
    private final Object f47344a = new Object();

    /* renamed from: b */
    @Nullable
    private volatile C4515C f47345b;

    /* renamed from: c */
    @Nullable
    private volatile InterfaceC4519E f47346c;

    /* renamed from: d */
    @Nullable
    private volatile C4500c f47347d;

    /* renamed from: e */
    @Nullable
    private volatile InterfaceC4511A f47348e;

    /* renamed from: f */
    @Nullable
    private volatile InterfaceC4601t0 f47349f;

    /* renamed from: g */
    @Nullable
    private volatile C4489a f47350g;

    /* renamed from: h */
    @Nullable
    private volatile C4566c f47351h;

    /* renamed from: i */
    @Nullable
    private volatile C4568d f47352i;

    /* renamed from: j */
    @Nullable
    private volatile C4504g f47353j;

    /* renamed from: k */
    @Nullable
    private volatile C4599s0 f47354k;

    /* renamed from: l */
    @Nullable
    private volatile C4502e f47355l;

    /* renamed from: m */
    @Nullable
    private volatile C4526H0 f47356m;

    /* renamed from: n */
    @Nullable
    private volatile C4565b0 f47357n;

    /* renamed from: o */
    @Nullable
    private volatile C4560Z f47358o;

    /* renamed from: p */
    @NonNull
    private final Context f47359p;

    /* renamed from: q */
    @NonNull
    private final C4562a f47360q;

    public C4564b(@NonNull Context context, @NonNull C4562a c4562a) {
        this.f47359p = context;
        this.f47360q = c4562a;
    }

    @NonNull
    /* renamed from: a */
    public C4489a m21509a() {
        if (this.f47350g == null) {
            synchronized (this.f47344a) {
                if (this.f47350g == null) {
                    this.f47350g = C4489a.m21350a().m21357a();
                }
            }
        }
        return this.f47350g;
    }

    @NonNull
    /* renamed from: b */
    public C4526H0 m21510b() {
        if (this.f47356m == null) {
            synchronized (this.f47344a) {
                if (this.f47356m == null) {
                    this.f47356m = new C4526H0();
                }
            }
        }
        return this.f47356m;
    }

    @NonNull
    /* renamed from: c */
    public C4599s0 m21511c() {
        if (this.f47354k == null) {
            synchronized (this.f47344a) {
                if (this.f47354k == null) {
                    this.f47354k = new C4599s0();
                }
            }
        }
        return this.f47354k;
    }

    @NonNull
    /* renamed from: d */
    public C4500c m21512d() {
        if (this.f47347d == null) {
            synchronized (this.f47344a) {
                if (this.f47347d == null) {
                    this.f47347d = new C4500c();
                }
            }
        }
        return this.f47347d;
    }

    @NonNull
    /* renamed from: e */
    public InterfaceC4511A m21513e() {
        if (this.f47348e == null) {
            synchronized (this.f47344a) {
                if (this.f47348e == null) {
                    this.f47348e = new C4608x();
                    ((C4608x) this.f47348e).m21742b(new C4606w());
                    ((C4608x) this.f47348e).m21744d(new C4513B());
                    ((C4608x) this.f47348e).m21741a(new C4604v());
                    ((C4608x) this.f47348e).m21743c(new C4610y());
                }
            }
        }
        return this.f47348e;
    }

    @NonNull
    /* renamed from: f */
    public C4502e m21514f() {
        if (this.f47355l == null) {
            synchronized (this.f47344a) {
                if (this.f47355l == null) {
                    this.f47355l = new C4502e(this.f47359p);
                }
            }
        }
        return this.f47355l;
    }

    @NonNull
    /* renamed from: g */
    public C4504g m21515g() {
        if (this.f47353j == null) {
            synchronized (this.f47344a) {
                if (this.f47353j == null) {
                    this.f47353j = new C4504g(this.f47359p);
                }
            }
        }
        return this.f47353j;
    }

    @NonNull
    /* renamed from: h */
    public C4560Z m21516h() {
        if (this.f47358o == null) {
            synchronized (this.f47344a) {
                if (this.f47358o == null) {
                    this.f47358o = new C4560Z(this.f47359p, this.f47360q);
                }
            }
        }
        return this.f47358o;
    }

    @NonNull
    /* renamed from: i */
    public C4566c m21517i() {
        if (this.f47351h == null) {
            synchronized (this.f47344a) {
                if (this.f47351h == null) {
                    this.f47351h = new C4566c(this.f47359p, ".STORAGE");
                }
            }
        }
        return this.f47351h;
    }

    @NonNull
    /* renamed from: j */
    public C4565b0 m21518j() {
        if (this.f47357n == null) {
            synchronized (this.f47344a) {
                if (this.f47357n == null) {
                    this.f47357n = new C4565b0(this.f47359p, this.f47360q);
                }
            }
        }
        return this.f47357n;
    }

    @NonNull
    /* renamed from: k */
    public C4568d m21519k() {
        if (this.f47352i == null) {
            C4566c m21517i = m21517i();
            synchronized (this.f47344a) {
                if (this.f47352i == null) {
                    this.f47352i = new C4568d(m21517i);
                }
            }
        }
        return this.f47352i;
    }

    @NonNull
    /* renamed from: l */
    public InterfaceC4601t0 m21520l() {
        if (this.f47349f == null) {
            synchronized (this.f47344a) {
                if (this.f47349f == null) {
                    this.f47349f = new C4595q0();
                }
            }
        }
        return this.f47349f;
    }

    @NonNull
    /* renamed from: m */
    public C4515C m21521m() {
        if (this.f47345b == null) {
            synchronized (this.f47344a) {
                if (this.f47345b == null) {
                    this.f47345b = new C4515C();
                }
            }
        }
        return this.f47345b;
    }

    @NonNull
    /* renamed from: n */
    public InterfaceC4519E m21522n() {
        if (this.f47346c == null) {
            synchronized (this.f47344a) {
                if (this.f47346c == null) {
                    this.f47346c = new C4517D();
                }
            }
        }
        return this.f47346c;
    }
}
