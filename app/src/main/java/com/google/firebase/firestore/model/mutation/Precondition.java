package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Precondition {

    /* renamed from: c */
    public static final Precondition f22902c = new Precondition(null, null);

    /* renamed from: a */
    @Nullable
    public final SnapshotVersion f22903a;

    /* renamed from: b */
    @Nullable
    public final Boolean f22904b;

    public Precondition(@Nullable SnapshotVersion snapshotVersion, @Nullable Boolean bool) {
        Assert.m12490b(snapshotVersion == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f22903a = snapshotVersion;
        this.f22904b = bool;
    }

    /* renamed from: a */
    public boolean m12470a() {
        return this.f22903a == null && this.f22904b == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Precondition.class != obj.getClass()) {
            return false;
        }
        Precondition precondition = (Precondition) obj;
        SnapshotVersion snapshotVersion = this.f22903a;
        if (snapshotVersion == null ? precondition.f22903a != null : !snapshotVersion.equals(precondition.f22903a)) {
            return false;
        }
        Boolean bool = this.f22904b;
        Boolean bool2 = precondition.f22904b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public int hashCode() {
        SnapshotVersion snapshotVersion = this.f22903a;
        int hashCode = (snapshotVersion != null ? snapshotVersion.hashCode() : 0) * 31;
        Boolean bool = this.f22904b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        if (m12470a()) {
            return "Precondition{<none>}";
        }
        if (this.f22903a != null) {
            StringBuilder m24u = C0000a.m24u("Precondition{updateTime=");
            m24u.append(this.f22903a);
            m24u.append("}");
            return m24u.toString();
        }
        if (this.f22904b == null) {
            Assert.m12489a("Invalid Precondition", new Object[0]);
            throw null;
        }
        StringBuilder m24u2 = C0000a.m24u("Precondition{exists=");
        m24u2.append(this.f22904b);
        m24u2.append("}");
        return m24u2.toString();
    }
}
