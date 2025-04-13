package com.yandex.mobile.ads.embedded.guava.collect;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.yandex.mobile.ads.impl.tr0;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.n0 */
/* loaded from: classes2.dex */
final class C4695n0<E> extends AbstractC4702r<E> {

    /* renamed from: c */
    public final transient E f47895c;

    public C4695n0(E e2) {
        this.f47895c = (E) tr0.m28727a(e2);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: a */
    public final int mo22014a(int i2, Object[] objArr) {
        objArr[i2] = this.f47895c;
        return i2 + 1;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: b */
    public final AbstractC4698p<E> mo22031b() {
        return AbstractC4698p.m22048a(this.f47895c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f47895c.equals(obj);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
    /* renamed from: f */
    public final boolean mo22018f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final AbstractC4699p0<E> iterator() {
        return new C4704t(this.f47895c);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f47895c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder m2872a = C0321a.m2872a('[');
        m2872a.append(this.f47895c.toString());
        m2872a.append(']');
        return m2872a.toString();
    }
}
