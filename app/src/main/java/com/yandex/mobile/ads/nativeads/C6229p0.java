package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.d21;
import com.yandex.mobile.ads.impl.ok0;
import com.yandex.mobile.ads.impl.v01;
import com.yandex.mobile.ads.impl.xz0;
import com.yandex.mobile.ads.impl.zl0;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.nativeads.p0 */
/* loaded from: classes3.dex */
final class C6229p0 extends C6258v {

    /* renamed from: f */
    @NonNull
    private final C6217j0 f57782f;

    /* renamed from: g */
    @NonNull
    private final xz0 f57783g;

    public C6229p0(@NonNull C6217j0 c6217j0, @NonNull C6225n0 c6225n0, @NonNull xz0 xz0Var, @NonNull AdResponse adResponse) {
        super(c6225n0, adResponse);
        this.f57782f = c6217j0;
        this.f57783g = xz0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.C6258v
    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final Pair<aa1.EnumC4801a, String> mo30616a(@NonNull Context context, int i2, boolean z, boolean z2) {
        cz0 m29824a = this.f57783g.m29824a(context);
        return !(m29824a == null || m29824a.m23571J()) ? new Pair<>(aa1.EnumC4801a.f48453b, null) : super.mo30616a(context, i2, z, z2);
    }

    @Override // com.yandex.mobile.ads.nativeads.C6258v
    /* renamed from: a */
    public final aa1 mo30617a(@NonNull Context context, aa1.EnumC4801a enumC4801a, boolean z, int i2) {
        boolean z2;
        aa1 mo27089a;
        if (enumC4801a == aa1.EnumC4801a.f48453b) {
            Iterator<InterfaceC6256u> it = this.f57782f.m30564d().iterator();
            while (true) {
                z2 = true;
                boolean z3 = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Object obj = (InterfaceC6256u) it.next();
                if (obj instanceof AbstractC6221l0) {
                    AbstractC6221l0 abstractC6221l0 = (AbstractC6221l0) obj;
                    ok0 m30584d = abstractC6221l0.m30584d();
                    zl0 m30585e = abstractC6221l0.m30585e();
                    cz0 m29824a = this.f57783g.m29824a(context);
                    boolean z4 = m29824a == null || m29824a.m23571J();
                    Iterator<v01> it2 = m30585e.m30215e().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z3 = true;
                            break;
                        }
                        int m29163c = z4 ? it2.next().m29163c() : i2;
                        if (z) {
                            mo27089a = ((C6258v) m30584d).m30742b(context, m29163c);
                        } else {
                            mo27089a = ((C6258v) m30584d).mo27089a(context, m29163c);
                        }
                        if (mo27089a.m22447e() != aa1.EnumC4801a.f48453b) {
                            break;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            if (!z2) {
                enumC4801a = aa1.EnumC4801a.f48457f;
            }
        }
        return new aa1(enumC4801a, new d21());
    }
}
