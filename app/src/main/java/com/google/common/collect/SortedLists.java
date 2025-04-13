package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            /* renamed from: a */
            public int mo11897a(int i2) {
                return i2 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            /* renamed from: a */
            public int mo11897a(int i2) {
                return i2;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            /* renamed from: a */
            public int mo11897a(int i2) {
                return ~i2;
            }
        };

        KeyAbsentBehavior(C17631 c17631) {
        }

        /* renamed from: a */
        public abstract int mo11897a(int i2);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            /* renamed from: a */
            public <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return i2;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            /* renamed from: a */
            public <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                int size = list.size() - 1;
                while (i2 < size) {
                    int i3 = ((i2 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i3), e2) > 0) {
                        size = i3 - 1;
                    } else {
                        i2 = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            /* renamed from: a */
            public <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = (i3 + i2) >>> 1;
                    if (comparator.compare(list.get(i4), e2) < 0) {
                        i3 = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i3;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            /* renamed from: a */
            public <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return KeyPresentBehavior.LAST_PRESENT.mo11898a(comparator, e2, list, i2) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            /* renamed from: a */
            public <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return KeyPresentBehavior.FIRST_PRESENT.mo11898a(comparator, e2, list, i2) - 1;
            }
        };

        KeyPresentBehavior(C17631 c17631) {
        }

        /* renamed from: a */
        public abstract <E> int mo11898a(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2);
    }

    /* renamed from: a */
    public static <E, K> int m11896a(List<E> list, Function<? super E, K> function, @NullableDecl K k2, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        List m11739f = Lists.m11739f(list, function);
        Objects.requireNonNull(keyPresentBehavior);
        Objects.requireNonNull(keyAbsentBehavior);
        if (!(m11739f instanceof RandomAccess)) {
            m11739f = Lists.m11735b(m11739f);
        }
        int i2 = 0;
        int size = m11739f.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = comparator.compare(k2, (Object) m11739f.get(i3));
            if (compare < 0) {
                size = i3 - 1;
            } else {
                if (compare <= 0) {
                    return i2 + keyPresentBehavior.mo11898a(comparator, k2, m11739f.subList(i2, size + 1), i3 - i2);
                }
                i2 = i3 + 1;
            }
        }
        return keyAbsentBehavior.mo11897a(i2);
    }
}
