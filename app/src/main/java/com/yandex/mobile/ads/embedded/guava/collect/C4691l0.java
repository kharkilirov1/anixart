package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.l0 */
/* loaded from: classes2.dex */
final class C4691l0 extends C4693m0.d<Object> {

    /* renamed from: a */
    public final /* synthetic */ Set f47889a;

    /* renamed from: b */
    public final /* synthetic */ Set f47890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4691l0(AbstractC4702r abstractC4702r, AbstractC4702r abstractC4702r2) {
        super(0);
        this.f47889a = abstractC4702r;
        this.f47890b = abstractC4702r2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f47889a.contains(obj) && this.f47890b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f47889a.containsAll(collection) && this.f47890b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f47890b, this.f47889a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4689k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f47889a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f47890b.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }
}
