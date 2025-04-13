package com.yandex.div;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class DivDataTag {

    /* renamed from: b */
    public static final DivDataTag f30858b = new DivDataTag("");

    /* renamed from: a */
    @NonNull
    public final String f30859a;

    public DivDataTag(@NonNull String str) {
        this.f30859a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f30859a.equals(((DivDataTag) obj).f30859a);
    }

    public int hashCode() {
        return this.f30859a.hashCode();
    }
}
