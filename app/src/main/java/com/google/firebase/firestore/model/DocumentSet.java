package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class DocumentSet implements Iterable<Document> {

    /* renamed from: b */
    public final ImmutableSortedMap<DocumentKey, Document> f22850b;

    /* renamed from: c */
    public final ImmutableSortedSet<Document> f22851c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentSet.class != obj.getClass()) {
            return false;
        }
        DocumentSet documentSet = (DocumentSet) obj;
        if (size() != documentSet.size()) {
            return false;
        }
        Iterator<Document> it = iterator();
        Iterator<Document> it2 = documentSet.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<Document> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Document next = it.next();
            i2 = next.mo12437a().hashCode() + ((next.getKey().hashCode() + (i2 * 31)) * 31);
        }
        return i2;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Document> iterator() {
        return this.f22851c.iterator();
    }

    public int size() {
        return this.f22850b.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Document> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Document next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append("]");
        return sb.toString();
    }
}
