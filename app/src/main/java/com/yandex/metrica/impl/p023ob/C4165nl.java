package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3906dm;
import com.yandex.metrica.uiaccessor.InterfaceC4631b;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.nl */
/* loaded from: classes2.dex */
class C4165nl implements InterfaceC3880cm {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4631b f46018a;

    /* renamed from: b */
    @NonNull
    private final C3906dm.a f46019b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4062jm f46020c;

    /* renamed from: d */
    @NonNull
    private final C4036im f46021d;

    public C4165nl(@NonNull InterfaceC3678Um<Activity> interfaceC3678Um, @NonNull InterfaceC4062jm interfaceC4062jm) {
        this(new C3906dm.a(), interfaceC3678Um, interfaceC4062jm, new C3957fl(), new C4036im());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3880cm
    /* renamed from: a */
    public void mo18640a(@NonNull Activity activity, long j2) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3880cm
    /* renamed from: a */
    public void mo18641a(@NonNull Activity activity, boolean z) {
        if (z) {
            return;
        }
        try {
            this.f46018a.subscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public boolean mo18239a(@NonNull C3378Il c3378Il) {
        return false;
    }

    @VisibleForTesting
    public C4165nl(@NonNull C3906dm.a aVar, @NonNull InterfaceC3678Um<Activity> interfaceC3678Um, @NonNull InterfaceC4062jm interfaceC4062jm, @NonNull C3957fl c3957fl, @NonNull C4036im c4036im) {
        this.f46019b = aVar;
        this.f46020c = interfaceC4062jm;
        this.f46018a = c3957fl.m19916a(interfaceC3678Um);
        this.f46021d = c4036im;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public void mo18237a(long j2, @NonNull Activity activity, @NonNull C3328Gl c3328Gl, @NonNull List<C3727Wl> list, @NonNull C3378Il c3378Il, @NonNull C3879cl c3879cl) {
        C3428Kl c3428Kl;
        C3428Kl c3428Kl2;
        if (c3378Il.f43142b && (c3428Kl2 = c3378Il.f43146f) != null) {
            this.f46020c.mo18461b(this.f46021d.m19107a(activity, c3328Gl, c3428Kl2, c3879cl.m19683b(), j2));
        }
        if (!c3378Il.f43144d || (c3428Kl = c3378Il.f43148h) == null) {
            return;
        }
        this.f46020c.mo18458a(this.f46021d.m19107a(activity, c3328Gl, c3428Kl, c3879cl.m19685d(), j2));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public void mo18238a(@NonNull Throwable th, @NonNull C3854bm c3854bm) {
        Objects.requireNonNull(this.f46019b);
        new C3906dm(c3854bm, C3524Oh.m18679a()).m19773a("ui_parsing", th);
    }

    /* renamed from: a */
    public void m20467a(@NonNull Activity activity) {
        try {
            this.f46018a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
