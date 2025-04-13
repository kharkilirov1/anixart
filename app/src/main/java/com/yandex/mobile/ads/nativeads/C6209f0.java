package com.yandex.mobile.ads.nativeads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5841u4;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.tj0;
import com.yandex.mobile.ads.impl.tv0;
import com.yandex.mobile.ads.impl.xh0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.f0 */
/* loaded from: classes3.dex */
final class C6209f0 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f57692a;

    /* renamed from: b */
    @NonNull
    private final List<eh0> f57693b;

    /* renamed from: c */
    @NonNull
    private final xh0 f57694c = new xh0();

    /* renamed from: d */
    @NonNull
    private final C5841u4 f57695d = new C5841u4();

    /* renamed from: e */
    @Nullable
    private String f57696e;

    /* renamed from: f */
    @Nullable
    private int f57697f;

    /* renamed from: g */
    @Nullable
    private AdResponse f57698g;

    public C6209f0(@NonNull List<eh0> list, @NonNull C5101g2 c5101g2) {
        this.f57693b = list;
        this.f57692a = c5101g2;
    }

    /* renamed from: a */
    public final void m30543a(@NonNull int i2) {
        this.f57697f = i2;
    }

    /* renamed from: a */
    public final void m30545a(@NonNull String str) {
        this.f57696e = str;
    }

    /* renamed from: a */
    public final void m30544a(@NonNull AdResponse adResponse) {
        this.f57698g = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NonNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new HashMap());
        int i2 = this.f57697f;
        if (i2 != 0) {
            tv0Var.m28761b(tj0.m28669a(i2), "bind_type");
        }
        tv0Var.m28757a(this.f57696e, "native_ad_type");
        AdResponse adResponse = this.f57698g;
        if (adResponse != null) {
            tv0Var.m28759a(adResponse.m21813c());
            Map<String, Object> m21829s = this.f57698g.m21829s();
            if (m21829s != null) {
                tv0Var.m28760a(m21829s);
            }
            tv0Var.m28757a(this.f57698g.m21833w(), "design");
            tv0Var.m28761b(this.f57698g.m21823m(), "ad_source");
        }
        tv0Var.m28760a(this.f57695d.m28881a(this.f57692a.m24765a()));
        xh0 xh0Var = this.f57694c;
        List<eh0> list = this.f57693b;
        Objects.requireNonNull(xh0Var);
        HashSet hashSet = new HashSet();
        Iterator<eh0> it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(xh0Var.m29751a(it.next()));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (arrayList.size() > 0) {
            tv0Var.m28761b(arrayList.toArray(new String[arrayList.size()]), "image_sizes");
        }
        return tv0Var.m28756a();
    }
}
