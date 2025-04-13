package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public class Joiner {

    /* renamed from: a */
    public final String f20522a;

    /* renamed from: com.google.common.base.Joiner$2 */
    class C15622 extends Joiner {
        @Override // com.google.common.base.Joiner
        /* renamed from: a */
        public <A extends Appendable> A mo11160a(A a2, Iterator<?> it) throws IOException {
            Preconditions.m11187k(a2, "appendable");
            Preconditions.m11187k(it, "parts");
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw null;
                }
            }
            return a2;
        }

        @Override // com.google.common.base.Joiner
        /* renamed from: e */
        public Joiner mo11163e(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }
    }

    /* renamed from: com.google.common.base.Joiner$3 */
    class C15633 extends AbstractList<Object> {
        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            if (i2 == 0 || i2 == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static final class MapJoiner {

        /* renamed from: a */
        public final Joiner f20525a;

        /* renamed from: b */
        public final String f20526b;

        public MapJoiner(Joiner joiner, String str, C15611 c15611) {
            this.f20525a = joiner;
            java.util.Objects.requireNonNull(str);
            this.f20526b = str;
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: a */
        public <A extends Appendable> A m11164a(A a2, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            java.util.Objects.requireNonNull(a2);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a2.append(this.f20525a.mo11162d(next.getKey()));
                a2.append(this.f20526b);
                a2.append(this.f20525a.mo11162d(next.getValue()));
                while (it.hasNext()) {
                    a2.append(this.f20525a.f20522a);
                    Map.Entry<?, ?> next2 = it.next();
                    a2.append(this.f20525a.mo11162d(next2.getKey()));
                    a2.append(this.f20526b);
                    a2.append(this.f20525a.mo11162d(next2.getValue()));
                }
            }
            return a2;
        }
    }

    public Joiner(String str) {
        java.util.Objects.requireNonNull(str);
        this.f20522a = str;
    }

    /* renamed from: c */
    public static Joiner m11159c(char c2) {
        return new Joiner(String.valueOf(c2));
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public <A extends Appendable> A mo11160a(A a2, Iterator<?> it) throws IOException {
        java.util.Objects.requireNonNull(a2);
        if (it.hasNext()) {
            a2.append(mo11162d(it.next()));
            while (it.hasNext()) {
                a2.append(this.f20522a);
                a2.append(mo11162d(it.next()));
            }
        }
        return a2;
    }

    /* renamed from: b */
    public final String m11161b(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            mo11160a(sb, it);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public CharSequence mo11162d(Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: e */
    public Joiner mo11163e(final String str) {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            /* renamed from: d */
            public CharSequence mo11162d(@NullableDecl Object obj) {
                return obj == null ? str : Joiner.this.mo11162d(obj);
            }

            @Override // com.google.common.base.Joiner
            /* renamed from: e */
            public Joiner mo11163e(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public Joiner(Joiner joiner, C15611 c15611) {
        this.f20522a = joiner.f20522a;
    }
}
