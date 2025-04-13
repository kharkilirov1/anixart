package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.InterfaceC3125f;

/* renamed from: com.yandex.metrica.impl.ob.g7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3969g7 implements InterfaceC4021i7 {

    /* renamed from: a */
    @NonNull
    private final a f45179a;

    /* renamed from: b */
    @Nullable
    private final InterfaceC3125f f45180b;

    /* renamed from: c */
    @NonNull
    private final C3407K0 f45181c;

    /* renamed from: com.yandex.metrica.impl.ob.g7$a */
    public interface a {
        /* renamed from: a */
        boolean mo19925a(Throwable th);
    }

    public AbstractC3969g7(@NonNull a aVar, @Nullable InterfaceC3125f interfaceC3125f, @NonNull C3407K0 c3407k0) {
        this.f45179a = aVar;
        this.f45180b = interfaceC3125f;
        this.f45181c = c3407k0;
    }

    /* renamed from: a */
    public abstract void mo19950a(@NonNull C4203p7 c4203p7);

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4021i7
    /* renamed from: a */
    public void mo19951a(@Nullable Throwable th, @NonNull C3917e7 c3917e7) {
        if (this.f45179a.mo19925a(th)) {
            InterfaceC3125f interfaceC3125f = this.f45180b;
            if (interfaceC3125f == null || th == null || (th = interfaceC3125f.m17791a(th)) != null) {
                mo19950a(C4229q7.m20571a(th, c3917e7, null, this.f45181c.m18424a(), this.f45181c.m18425b()));
            }
        }
    }
}
