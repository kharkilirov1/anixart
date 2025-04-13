package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.k0 */
/* loaded from: classes2.dex */
final class C4689k0 extends AbstractC4670b<Object> {

    /* renamed from: c */
    public final Iterator<Object> f47887c;

    /* renamed from: d */
    public final /* synthetic */ C4691l0 f47888d;

    public C4689k0(C4691l0 c4691l0) {
        this.f47888d = c4691l0;
        this.f47887c = c4691l0.f47889a.iterator();
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4670b
    @CheckForNull
    /* renamed from: a */
    public final Object mo21980a() {
        while (this.f47887c.hasNext()) {
            Object next = this.f47887c.next();
            if (this.f47888d.f47890b.contains(next)) {
                return next;
            }
        }
        m21981b();
        return null;
    }
}
