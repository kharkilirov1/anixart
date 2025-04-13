package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ak */
/* loaded from: classes2.dex */
public final class C3177Ak {

    /* renamed from: a */
    @NonNull
    private final List<C4346uk> f42564a;

    /* renamed from: b */
    @Nullable
    private final C3700Vj f42565b;

    /* renamed from: c */
    private final int f42566c;

    public C3177Ak(@NonNull InterfaceC4476zk<C3700Vj> interfaceC4476zk, @NonNull InterfaceC4476zk<List<C4346uk>> interfaceC4476zk2, @NonNull InterfaceC4476zk<Integer> interfaceC4476zk3) {
        this.f42565b = (C3700Vj) ((C3750Xj) interfaceC4476zk).m19400b();
        this.f42564a = (List) ((C4372vk) interfaceC4476zk2).m21066b();
        this.f42566c = ((Integer) ((C3625Sj) interfaceC4476zk3).m19105a()).intValue();
    }

    @NonNull
    /* renamed from: a */
    public int m17839a() {
        return this.f42566c;
    }

    @Nullable
    /* renamed from: b */
    public C3700Vj m17840b() {
        return this.f42565b;
    }

    @NonNull
    /* renamed from: c */
    public List<C4346uk> m17841c() {
        return this.f42564a;
    }
}
