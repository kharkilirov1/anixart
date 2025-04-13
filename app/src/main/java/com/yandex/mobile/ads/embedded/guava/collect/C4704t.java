package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.t */
/* loaded from: classes2.dex */
final class C4704t extends AbstractC4699p0<Object> {

    /* renamed from: a */
    public boolean f47917a;

    /* renamed from: b */
    public final /* synthetic */ Object f47918b;

    public C4704t(Object obj) {
        this.f47918b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f47917a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f47917a) {
            throw new NoSuchElementException();
        }
        this.f47917a = true;
        return this.f47918b;
    }
}
