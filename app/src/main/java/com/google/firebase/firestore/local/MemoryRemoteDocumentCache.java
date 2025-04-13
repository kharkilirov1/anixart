package com.google.firebase.firestore.local;

import androidx.annotation.NonNull;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class MemoryRemoteDocumentCache implements RemoteDocumentCache {

    /* renamed from: a */
    public ImmutableSortedMap<DocumentKey, Document> f22796a = DocumentCollections.f22847a;

    public class DocumentIterable implements Iterable<Document> {

        /* renamed from: com.google.firebase.firestore.local.MemoryRemoteDocumentCache$DocumentIterable$1 */
        public class C20981 implements Iterator<Document> {

            /* renamed from: b */
            public final /* synthetic */ Iterator f22797b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f22797b.hasNext();
            }

            @Override // java.util.Iterator
            public Document next() {
                return (Document) ((Map.Entry) this.f22797b.next()).getValue();
            }
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<Document> iterator() {
            throw null;
        }
    }
}
