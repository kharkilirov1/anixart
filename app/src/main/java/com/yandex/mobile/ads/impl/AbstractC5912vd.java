package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* renamed from: com.yandex.mobile.ads.impl.vd */
/* loaded from: classes3.dex */
public abstract class AbstractC5912vd<T> implements mw0<C5101g2, AdResponse<T>> {

    /* renamed from: a */
    @NonNull
    private final C5841u4 f55804a = new C5841u4();

    /* renamed from: b */
    @NonNull
    private final C5213i5 f55805b = new C5213i5();

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26777a(@NonNull C5101g2 c5101g2) {
        return new sv0(sv0.EnumC5764b.f54842j.m28361a(), mo27333a(c5101g2));
    }

    @Override // com.yandex.mobile.ads.impl.mw0
    /* renamed from: a */
    public final sv0 mo26776a(@Nullable tw0 tw0Var, int i2, @NonNull C5101g2 c5101g2) {
        return new sv0(sv0.EnumC5764b.f54843k.m28361a(), mo27332a(i2, c5101g2, tw0Var));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @NonNull
    /* renamed from: a */
    public HashMap mo27333a(@NonNull C5101g2 c5101g2) {
        HashMap hashMap = new HashMap();
        AdRequest m24765a = c5101g2.m24765a();
        if (m24765a != null) {
            hashMap.putAll(this.f55804a.m28881a(m24765a));
        }
        hashMap.put("block_id", c5101g2.m24779c());
        hashMap.put("ad_unit_id", c5101g2.m24779c());
        hashMap.put("ad_type", c5101g2.m24775b().m24033a());
        hashMap.put("is_passback", Boolean.valueOf(c5101g2.m24794p() == 2));
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap mo27332a(int r5, @androidx.annotation.NonNull com.yandex.mobile.ads.impl.C5101g2 r6, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.tw0 r7) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.yandex.mobile.ads.impl.i5 r1 = r4.f55805b
            java.util.Objects.requireNonNull(r1)
            com.yandex.mobile.ads.impl.tv0 r1 = new com.yandex.mobile.ads.impl.tv0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.<init>(r2)
            java.lang.String r2 = r6.m24779c()
            java.lang.String r3 = "block_id"
            r1.m28761b(r2, r3)
            java.lang.String r2 = r6.m24779c()
            java.lang.String r3 = "ad_unit_id"
            r1.m28761b(r2, r3)
            com.yandex.mobile.ads.impl.e6 r2 = r6.m24775b()
            java.lang.String r2 = r2.m24033a()
            java.lang.String r3 = "ad_type"
            r1.m28761b(r2, r3)
            if (r7 == 0) goto L80
            T r2 = r7.f55247a
            if (r2 == 0) goto L80
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            com.yandex.mobile.ads.base.model.MediationData r2 = r2.m21836z()
            if (r2 != 0) goto L80
            T r2 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.m21825o()
            java.lang.String r3 = "ad_type_format"
            r1.m28761b(r2, r3)
            T r2 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.m21800A()
            java.lang.String r3 = "product_type"
            r1.m28761b(r2, r3)
            T r2 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.m21833w()
            java.lang.String r3 = "design"
            r1.m28757a(r2, r3)
            T r2 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.util.List r2 = r2.m21813c()
            r1.m28759a(r2)
            T r2 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.util.Map r2 = r2.m21829s()
            if (r2 == 0) goto L80
            r1.m28760a(r2)
        L80:
            r2 = -1
            if (r5 != r2) goto L86
            java.lang.String r2 = "error_code"
            goto L88
        L86:
            java.lang.String r2 = "code"
        L88:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.m28761b(r5, r2)
            if (r7 == 0) goto Lad
            T r5 = r7.f55247a
            if (r5 == 0) goto Lad
            com.yandex.mobile.ads.base.AdResponse r5 = (com.yandex.mobile.ads.base.AdResponse) r5
            com.yandex.mobile.ads.base.model.MediationData r5 = r5.m21836z()
            if (r5 == 0) goto La0
            java.lang.String r5 = "mediation"
            goto Laf
        La0:
            T r5 = r7.f55247a
            com.yandex.mobile.ads.base.AdResponse r5 = (com.yandex.mobile.ads.base.AdResponse) r5
            java.lang.Object r5 = r5.m21801B()
            if (r5 == 0) goto Lad
            java.lang.String r5 = "ad"
            goto Laf
        Lad:
            java.lang.String r5 = "empty"
        Laf:
            java.lang.String r7 = "response_type"
            r1.m28761b(r5, r7)
            java.util.Map r5 = r1.m28756a()
            r0.putAll(r5)
            com.yandex.mobile.ads.common.AdRequest r5 = r6.m24765a()
            if (r5 == 0) goto Lca
            com.yandex.mobile.ads.impl.u4 r6 = r4.f55804a
            java.util.Map r5 = r6.m28881a(r5)
            r0.putAll(r5)
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC5912vd.mo27332a(int, com.yandex.mobile.ads.impl.g2, com.yandex.mobile.ads.impl.tw0):java.util.HashMap");
    }
}
