package com.google.firebase.firestore.model;

import com.google.firebase.Timestamp;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class SnapshotVersion implements Comparable<SnapshotVersion> {

    /* renamed from: c */
    public static final SnapshotVersion f22878c = new SnapshotVersion(new Timestamp(0, 0));

    /* renamed from: b */
    public final Timestamp f22879b;

    public SnapshotVersion(Timestamp timestamp) {
        this.f22879b = timestamp;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(SnapshotVersion snapshotVersion) {
        return this.f22879b.compareTo(snapshotVersion.f22879b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SnapshotVersion) && compareTo((SnapshotVersion) obj) == 0;
    }

    public int hashCode() {
        return this.f22879b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SnapshotVersion(seconds=");
        m24u.append(this.f22879b.f22284b);
        m24u.append(", nanos=");
        return C0000a.m18o(m24u, this.f22879b.f22285c, ")");
    }
}
