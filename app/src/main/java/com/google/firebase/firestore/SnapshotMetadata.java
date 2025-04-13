package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class SnapshotMetadata {

    /* renamed from: a */
    public final boolean f22667a;

    /* renamed from: b */
    public final boolean f22668b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
        return this.f22667a == snapshotMetadata.f22667a && this.f22668b == snapshotMetadata.f22668b;
    }

    public int hashCode() {
        return ((this.f22667a ? 1 : 0) * 31) + (this.f22668b ? 1 : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SnapshotMetadata{hasPendingWrites=");
        m24u.append(this.f22667a);
        m24u.append(", isFromCache=");
        m24u.append(this.f22668b);
        m24u.append('}');
        return m24u.toString();
    }
}
