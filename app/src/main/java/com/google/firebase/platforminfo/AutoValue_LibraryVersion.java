package com.google.firebase.platforminfo;

import java.util.Objects;
import javax.annotation.Nonnull;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {

    /* renamed from: a */
    public final String f23452a;

    /* renamed from: b */
    public final String f23453b;

    public AutoValue_LibraryVersion(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f23452a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f23453b = str2;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    /* renamed from: a */
    public String mo12716a() {
        return this.f23452a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @Nonnull
    /* renamed from: b */
    public String mo12717b() {
        return this.f23453b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LibraryVersion)) {
            return false;
        }
        LibraryVersion libraryVersion = (LibraryVersion) obj;
        return this.f23452a.equals(libraryVersion.mo12716a()) && this.f23453b.equals(libraryVersion.mo12717b());
    }

    public int hashCode() {
        return ((this.f23452a.hashCode() ^ 1000003) * 1000003) ^ this.f23453b.hashCode();
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LibraryVersion{libraryName=");
        m24u.append(this.f23452a);
        m24u.append(", version=");
        return C0000a.m20q(m24u, this.f23453b, "}");
    }
}
