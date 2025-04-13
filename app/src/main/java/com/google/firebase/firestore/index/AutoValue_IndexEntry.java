package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_IndexEntry extends IndexEntry {

    /* renamed from: b */
    public final int f22764b;

    /* renamed from: c */
    public final DocumentKey f22765c;

    /* renamed from: d */
    public final byte[] f22766d;

    /* renamed from: e */
    public final byte[] f22767e;

    @Override // com.google.firebase.firestore.index.IndexEntry
    /* renamed from: a */
    public byte[] mo12400a() {
        return this.f22766d;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    /* renamed from: b */
    public byte[] mo12401b() {
        return this.f22767e;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    /* renamed from: c */
    public DocumentKey mo12402c() {
        return this.f22765c;
    }

    @Override // com.google.firebase.firestore.index.IndexEntry
    /* renamed from: d */
    public int mo12403d() {
        return this.f22764b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IndexEntry)) {
            return false;
        }
        IndexEntry indexEntry = (IndexEntry) obj;
        if (this.f22764b == indexEntry.mo12403d() && this.f22765c.equals(indexEntry.mo12402c())) {
            boolean z = indexEntry instanceof AutoValue_IndexEntry;
            if (Arrays.equals(this.f22766d, z ? ((AutoValue_IndexEntry) indexEntry).f22766d : indexEntry.mo12400a())) {
                if (Arrays.equals(this.f22767e, z ? ((AutoValue_IndexEntry) indexEntry).f22767e : indexEntry.mo12401b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f22764b ^ 1000003) * 1000003) ^ this.f22765c.hashCode()) * 1000003) ^ Arrays.hashCode(this.f22766d)) * 1000003) ^ Arrays.hashCode(this.f22767e);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("IndexEntry{indexId=");
        m24u.append(this.f22764b);
        m24u.append(", documentKey=");
        m24u.append(this.f22765c);
        m24u.append(", arrayValue=");
        m24u.append(Arrays.toString(this.f22766d));
        m24u.append(", directionalValue=");
        m24u.append(Arrays.toString(this.f22767e));
        m24u.append("}");
        return m24u.toString();
    }
}
