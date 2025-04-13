package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class DocumentSnapshot {

    /* renamed from: a */
    public final FirebaseFirestore f22621a;

    /* renamed from: b */
    public final DocumentKey f22622b;

    /* renamed from: c */
    @Nullable
    public final Document f22623c;

    /* renamed from: d */
    public final SnapshotMetadata f22624d;

    public enum ServerTimestampBehavior {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        ESTIMATE,
        /* JADX INFO: Fake field, exist only in values array */
        PREVIOUS
    }

    public boolean equals(@Nullable Object obj) {
        Document document;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentSnapshot)) {
            return false;
        }
        DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj;
        return this.f22621a.equals(documentSnapshot.f22621a) && this.f22622b.equals(documentSnapshot.f22622b) && ((document = this.f22623c) != null ? document.equals(documentSnapshot.f22623c) : documentSnapshot.f22623c == null) && this.f22624d.equals(documentSnapshot.f22624d);
    }

    public int hashCode() {
        int hashCode = (this.f22622b.hashCode() + (this.f22621a.hashCode() * 31)) * 31;
        Document document = this.f22623c;
        int hashCode2 = (hashCode + (document != null ? document.getKey().hashCode() : 0)) * 31;
        Document document2 = this.f22623c;
        return this.f22624d.hashCode() + ((hashCode2 + (document2 != null ? document2.mo12437a().hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DocumentSnapshot{key=");
        m24u.append(this.f22622b);
        m24u.append(", metadata=");
        m24u.append(this.f22624d);
        m24u.append(", doc=");
        m24u.append(this.f22623c);
        m24u.append('}');
        return m24u.toString();
    }
}
