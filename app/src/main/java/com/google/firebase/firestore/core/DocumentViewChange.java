package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class DocumentViewChange {

    /* renamed from: a */
    public final Type f22686a;

    /* renamed from: b */
    public final Document f22687b;

    public enum Type {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DocumentViewChange)) {
            return false;
        }
        DocumentViewChange documentViewChange = (DocumentViewChange) obj;
        return this.f22686a.equals(documentViewChange.f22686a) && this.f22687b.equals(documentViewChange.f22687b);
    }

    public int hashCode() {
        return this.f22687b.mo12437a().hashCode() + ((this.f22687b.getKey().hashCode() + ((this.f22686a.hashCode() + 1891) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DocumentViewChange(");
        m24u.append(this.f22687b);
        m24u.append(",");
        m24u.append(this.f22686a);
        m24u.append(")");
        return m24u.toString();
    }
}
