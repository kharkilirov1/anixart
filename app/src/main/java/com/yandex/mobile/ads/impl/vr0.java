package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class vr0 {

    /* renamed from: com.yandex.mobile.ads.impl.vr0$a */
    public static class C5938a<T> implements ur0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final List<? extends ur0<? super T>> f55872a;

        public /* synthetic */ C5938a(List list, int i2) {
            this(list);
        }

        @Override // com.yandex.mobile.ads.impl.ur0
        public final boolean apply(T t) {
            for (int i2 = 0; i2 < this.f55872a.size(); i2++) {
                if (!this.f55872a.get(i2).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof C5938a) {
                return this.f55872a.equals(((C5938a) obj).f55872a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f55872a.hashCode() + 306654252;
        }

        public final String toString() {
            List<? extends ur0<? super T>> list = this.f55872a;
            StringBuilder sb = new StringBuilder("Predicates.");
            sb.append("and");
            sb.append('(');
            boolean z = true;
            for (T t : list) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(t);
                z = false;
            }
            sb.append(')');
            return sb.toString();
        }

        private C5938a(List<? extends ur0<? super T>> list) {
            this.f55872a = list;
        }
    }

    /* renamed from: a */
    public static <T> ur0<T> m29260a(ur0<? super T> ur0Var, ur0<? super T> ur0Var2) {
        Objects.requireNonNull(ur0Var);
        Objects.requireNonNull(ur0Var2);
        return new C5938a(Arrays.asList(ur0Var, ur0Var2), 0);
    }
}
