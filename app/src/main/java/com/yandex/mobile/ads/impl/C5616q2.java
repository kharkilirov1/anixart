package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.q2 */
/* loaded from: classes3.dex */
public final class C5616q2 implements InterfaceC5538oh {

    /* renamed from: a */
    private final iw0 f53911a = iw0.m25739a();

    /* renamed from: b */
    private final WeakReference<AbstractC5794td<?>> f53912b;

    public C5616q2(AbstractC5794td<?> abstractC5794td) {
        this.f53912b = new WeakReference<>(abstractC5794td);
    }

    /* renamed from: a */
    public static C5563p2 m27602a(@Nullable C5101g2 c5101g2, int i2) {
        switch (i2) {
            case 2:
                return AbstractC5524o4.f53155g;
            case 3:
            default:
                return AbstractC5524o4.f53167s;
            case 4:
            case 10:
                return AbstractC5524o4.m26997b(c5101g2 != null ? c5101g2.m24779c() : null);
            case 5:
                return AbstractC5524o4.f53152d;
            case 6:
                return AbstractC5524o4.f53160l;
            case 7:
                return AbstractC5524o4.f53161m;
            case 8:
                return AbstractC5524o4.f53154f;
            case 9:
                return AbstractC5524o4.f53156h;
            case 11:
                return AbstractC5524o4.f53163o;
            case 12:
                return AbstractC5524o4.f53166r;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5538oh
    /* renamed from: a */
    public final boolean mo27086a() {
        return false;
    }

    /* renamed from: b */
    public final void m27604b() {
        AbstractC5794td<?> abstractC5794td = this.f53912b.get();
        if (abstractC5794td != null) {
            iw0 iw0Var = this.f53911a;
            Context context = abstractC5794td.f55053b;
            int i2 = C5427m6.f52583b;
            String obj = abstractC5794td.toString();
            Objects.requireNonNull(iw0Var);
            iw0.m25740a(context, obj);
        }
    }

    /* renamed from: c */
    public final void m27605c() {
        m27604b();
        this.f53912b.clear();
    }

    /* renamed from: a */
    public final void m27603a(@NonNull AbstractC5630qd abstractC5630qd) {
        AbstractC5794td<?> abstractC5794td = this.f53912b.get();
        if (abstractC5794td != null) {
            iw0 iw0Var = this.f53911a;
            Context context = abstractC5794td.f55053b;
            synchronized (iw0Var) {
                um0.m29048a(context).m26292a(abstractC5630qd);
            }
        }
    }
}
