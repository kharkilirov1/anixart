package com.google.firebase.database.collection;

import java.lang.Comparable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class StandardComparator<A extends Comparable<A>> implements Comparator<A> {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
