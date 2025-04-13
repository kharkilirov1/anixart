package com.google.firebase.firestore.auth;

import androidx.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class User {

    /* renamed from: a */
    @Nullable
    public final String f22673a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        String str = this.f22673a;
        String str2 = ((User) obj).f22673a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f22673a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0000a.m20q(C0000a.m24u("User(uid:"), this.f22673a, ")");
    }
}
