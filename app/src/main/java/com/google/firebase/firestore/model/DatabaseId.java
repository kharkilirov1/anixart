package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class DatabaseId implements Comparable<DatabaseId> {

    /* renamed from: b */
    public final String f22844b;

    /* renamed from: c */
    public final String f22845c;

    @Override // java.lang.Comparable
    public int compareTo(@NonNull DatabaseId databaseId) {
        DatabaseId databaseId2 = databaseId;
        int compareTo = this.f22844b.compareTo(databaseId2.f22844b);
        return compareTo != 0 ? compareTo : this.f22845c.compareTo(databaseId2.f22845c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatabaseId.class != obj.getClass()) {
            return false;
        }
        DatabaseId databaseId = (DatabaseId) obj;
        return this.f22844b.equals(databaseId.f22844b) && this.f22845c.equals(databaseId.f22845c);
    }

    public int hashCode() {
        return this.f22845c.hashCode() + (this.f22844b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DatabaseId(");
        m24u.append(this.f22844b);
        m24u.append(", ");
        return C0000a.m20q(m24u, this.f22845c, ")");
    }
}
