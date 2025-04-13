package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.ur0;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.s */
/* loaded from: classes2.dex */
final class C4703s extends AbstractC4670b<Object> {

    /* renamed from: c */
    public final /* synthetic */ Iterator f47915c;

    /* renamed from: d */
    public final /* synthetic */ ur0 f47916d;

    public C4703s(Iterator it, ur0 ur0Var) {
        this.f47915c = it;
        this.f47916d = ur0Var;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4670b
    @CheckForNull
    /* renamed from: a */
    public final Object mo21980a() {
        while (this.f47915c.hasNext()) {
            Object next = this.f47915c.next();
            if (this.f47916d.apply(next)) {
                return next;
            }
        }
        m21981b();
        return null;
    }
}
