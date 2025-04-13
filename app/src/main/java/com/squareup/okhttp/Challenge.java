package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Challenge {

    /* renamed from: a */
    public final String f24809a;

    /* renamed from: b */
    public final String f24810b;

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Util.m13938f(this.f24809a, challenge.f24809a) && Util.m13938f(this.f24810b, challenge.f24810b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24810b;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24809a;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24809a);
        sb.append(" realm=\"");
        return C0000a.m20q(sb, this.f24810b, "\"");
    }
}
