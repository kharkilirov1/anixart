package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.protobuf.ByteString;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class TargetData {

    /* renamed from: a */
    public final Target f22818a;

    /* renamed from: b */
    public final int f22819b;

    /* renamed from: c */
    public final long f22820c;

    /* renamed from: d */
    public final QueryPurpose f22821d;

    /* renamed from: e */
    public final SnapshotVersion f22822e;

    /* renamed from: f */
    public final SnapshotVersion f22823f;

    /* renamed from: g */
    public final ByteString f22824g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetData.class != obj.getClass()) {
            return false;
        }
        TargetData targetData = (TargetData) obj;
        return this.f22818a.equals(targetData.f22818a) && this.f22819b == targetData.f22819b && this.f22820c == targetData.f22820c && this.f22821d.equals(targetData.f22821d) && this.f22822e.equals(targetData.f22822e) && this.f22823f.equals(targetData.f22823f) && this.f22824g.equals(targetData.f22824g);
    }

    public int hashCode() {
        return this.f22824g.hashCode() + ((this.f22823f.hashCode() + ((this.f22822e.hashCode() + ((this.f22821d.hashCode() + (((((this.f22818a.hashCode() * 31) + this.f22819b) * 31) + ((int) this.f22820c)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("TargetData{target=");
        m24u.append(this.f22818a);
        m24u.append(", targetId=");
        m24u.append(this.f22819b);
        m24u.append(", sequenceNumber=");
        m24u.append(this.f22820c);
        m24u.append(", purpose=");
        m24u.append(this.f22821d);
        m24u.append(", snapshotVersion=");
        m24u.append(this.f22822e);
        m24u.append(", lastLimboFreeSnapshotVersion=");
        m24u.append(this.f22823f);
        m24u.append(", resumeToken=");
        m24u.append(this.f22824g);
        m24u.append('}');
        return m24u.toString();
    }
}
