package com.yandex.metrica.impl.p023ob;

import java.io.File;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Q7 */
/* loaded from: classes2.dex */
public final class C3564Q7 implements InterfaceC3703Vm<File, String> {

    /* renamed from: a */
    @NotNull
    private final C3414K7 f43664a;

    /* renamed from: b */
    private final C3539P7 f43665b;

    public C3564Q7(@NotNull C3414K7 c3414k7, @NotNull C3539P7 c3539p7) {
        this.f43664a = c3414k7;
        this.f43665b = c3539p7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
    /* renamed from: a */
    public String mo17917a(File file) {
        return this.f43665b.mo17948a(file, this.f43664a);
    }
}
