package com.yandex.mobile.ads.embedded.guava.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.C5782t5;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4670b<T> extends AbstractC4699p0<T> {

    /* renamed from: a */
    private int f47818a = 2;

    /* renamed from: b */
    @CheckForNull
    private T f47819b;

    @CheckForNull
    /* renamed from: a */
    public abstract T mo21980a();

    @CanIgnoreReturnValue
    @CheckForNull
    /* renamed from: b */
    public final void m21981b() {
        this.f47818a = 3;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        int i2 = this.f47818a;
        if (!(i2 != 4)) {
            throw new IllegalStateException();
        }
        int m28463a = C5782t5.m28463a(i2);
        if (m28463a == 0) {
            return true;
        }
        if (m28463a == 2) {
            return false;
        }
        this.f47818a = 4;
        this.f47819b = mo21980a();
        if (this.f47818a == 3) {
            return false;
        }
        this.f47818a = 1;
        return true;
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f47818a = 2;
        T t = this.f47819b;
        this.f47819b = null;
        return t;
    }
}
