package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3335H3;

/* renamed from: com.yandex.metrica.impl.ob.J3 */
/* loaded from: classes2.dex */
public class C3385J3<T extends C3335H3> {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3360I3<T> f43180a;

    /* renamed from: b */
    @Nullable
    private final InterfaceC3310G3<T> f43181b;

    /* renamed from: com.yandex.metrica.impl.ob.J3$b */
    public static final class b<T extends C3335H3> {

        /* renamed from: a */
        @NonNull
        public final InterfaceC3360I3<T> f43182a;

        /* renamed from: b */
        @Nullable
        public InterfaceC3310G3<T> f43183b;

        public b(@NonNull InterfaceC3360I3<T> interfaceC3360I3) {
            this.f43182a = interfaceC3360I3;
        }

        @NonNull
        /* renamed from: a */
        public b<T> m18381a(@NonNull InterfaceC3310G3<T> interfaceC3310G3) {
            this.f43183b = interfaceC3310G3;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C3385J3<T> m18382a() {
            return new C3385J3<>(this);
        }
    }

    /* renamed from: a */
    public final boolean m18379a(@NonNull C3335H3 c3335h3) {
        InterfaceC3310G3<T> interfaceC3310G3 = this.f43181b;
        if (interfaceC3310G3 == null) {
            return false;
        }
        return interfaceC3310G3.mo17915a(c3335h3);
    }

    /* renamed from: b */
    public void m18380b(@NonNull C3335H3 c3335h3) {
        this.f43180a.mo17946a(c3335h3);
    }

    private C3385J3(@NonNull b bVar) {
        this.f43180a = bVar.f43182a;
        this.f43181b = bVar.f43183b;
    }

    @NonNull
    /* renamed from: a */
    public static <T extends C3335H3> b<T> m18378a(@NonNull InterfaceC3360I3<T> interfaceC3360I3) {
        return new b<>(interfaceC3360I3);
    }
}
