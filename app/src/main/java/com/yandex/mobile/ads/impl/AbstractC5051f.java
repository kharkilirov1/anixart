package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o31;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.impl.f */
/* loaded from: classes3.dex */
abstract class AbstractC5051f<T> implements Iterator<T> {

    /* renamed from: a */
    private int f50079a = 2;

    /* renamed from: b */
    @CheckForNull
    private String f50080b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int mo25536a;
        int i2 = this.f50079a;
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
        this.f50079a = 4;
        o31.AbstractC5522a abstractC5522a = (o31.AbstractC5522a) this;
        int i3 = abstractC5522a.f53147f;
        while (true) {
            int i4 = abstractC5522a.f53147f;
            if (i4 == -1) {
                abstractC5522a.f50079a = 3;
                str = null;
                break;
            }
            m31 m31Var = (m31) abstractC5522a;
            mo25536a = m31Var.f52571h.f52843a.mo25536a(m31Var.f53144c, i4);
            if (mo25536a == -1) {
                mo25536a = abstractC5522a.f53144c.length();
                abstractC5522a.f53147f = -1;
            } else {
                abstractC5522a.f53147f = mo25536a + 1;
            }
            int i5 = abstractC5522a.f53147f;
            if (i5 == i3) {
                int i6 = i5 + 1;
                abstractC5522a.f53147f = i6;
                if (i6 > abstractC5522a.f53144c.length()) {
                    abstractC5522a.f53147f = -1;
                }
            } else {
                while (i3 < mo25536a && abstractC5522a.f53145d.mo25537a(abstractC5522a.f53144c.charAt(i3))) {
                    i3++;
                }
                while (mo25536a > i3 && abstractC5522a.f53145d.mo25537a(abstractC5522a.f53144c.charAt(mo25536a - 1))) {
                    mo25536a--;
                }
                if (!abstractC5522a.f53146e || i3 != mo25536a) {
                    break;
                }
                i3 = abstractC5522a.f53147f;
            }
        }
        int i7 = abstractC5522a.f53148g;
        if (i7 == 1) {
            mo25536a = abstractC5522a.f53144c.length();
            abstractC5522a.f53147f = -1;
            while (mo25536a > i3 && abstractC5522a.f53145d.mo25537a(abstractC5522a.f53144c.charAt(mo25536a - 1))) {
                mo25536a--;
            }
        } else {
            abstractC5522a.f53148g = i7 - 1;
        }
        str = abstractC5522a.f53144c.subSequence(i3, mo25536a).toString();
        this.f50080b = str;
        if (this.f50079a == 3) {
            return false;
        }
        this.f50079a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f50079a = 2;
        T t = (T) this.f50080b;
        this.f50080b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
