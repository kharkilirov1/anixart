package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.Document;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class QuerySnapshot implements Iterable<QueryDocumentSnapshot> {

    public class QuerySnapshotIterator implements Iterator<QueryDocumentSnapshot> {

        /* renamed from: b */
        public final Iterator<Document> f22663b;

        /* renamed from: c */
        public final /* synthetic */ QuerySnapshot f22664c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22663b.hasNext();
        }

        @Override // java.util.Iterator
        public QueryDocumentSnapshot next() {
            QuerySnapshot querySnapshot = this.f22664c;
            this.f22663b.next();
            Objects.requireNonNull(querySnapshot);
            throw null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuerySnapshot)) {
            return false;
        }
        Objects.requireNonNull((QuerySnapshot) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<QueryDocumentSnapshot> iterator() {
        throw null;
    }
}
