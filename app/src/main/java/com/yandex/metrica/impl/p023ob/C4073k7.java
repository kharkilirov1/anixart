package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.InterfaceC3125f;
import com.yandex.metrica.impl.p023ob.AbstractC3969g7;

/* renamed from: com.yandex.metrica.impl.ob.k7 */
/* loaded from: classes2.dex */
public class C4073k7 extends AbstractC3969g7 {

    /* renamed from: d */
    @NonNull
    private C3608S2 f45604d;

    public C4073k7(@NonNull Context context, @NonNull C3608S2 c3608s2, @NonNull AbstractC3969g7.a aVar, @Nullable InterfaceC3125f interfaceC3125f) {
        this(c3608s2, aVar, interfaceC3125f, new C3407K0(context));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3969g7
    /* renamed from: a */
    public void mo19950a(@NonNull C4203p7 c4203p7) {
        this.f45604d.mo19074a().mo18346a(c4203p7);
    }

    @VisibleForTesting
    public C4073k7(@NonNull C3608S2 c3608s2, @NonNull AbstractC3969g7.a aVar, @Nullable InterfaceC3125f interfaceC3125f, @NonNull C3407K0 c3407k0) {
        super(aVar, interfaceC3125f, c3407k0);
        this.f45604d = c3608s2;
    }
}
