package com.google.firebase.components;

import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Dependency {

    /* renamed from: a */
    public final Class<?> f22499a;

    /* renamed from: b */
    public final int f22500b;

    /* renamed from: c */
    public final int f22501c;

    public Dependency(Class<?> cls, int i2, int i3) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.f22499a = cls;
        this.f22500b = i2;
        this.f22501c = i3;
    }

    /* renamed from: a */
    public boolean m12349a() {
        return this.f22500b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return this.f22499a == dependency.f22499a && this.f22500b == dependency.f22500b && this.f22501c == dependency.f22501c;
    }

    public int hashCode() {
        return ((((this.f22499a.hashCode() ^ 1000003) * 1000003) ^ this.f22500b) * 1000003) ^ this.f22501c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f22499a);
        sb.append(", type=");
        int i2 = this.f22500b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.f22501c;
        if (i3 == 0) {
            str = "direct";
        } else if (i3 == 1) {
            str = "provider";
        } else {
            if (i3 != 2) {
                throw new AssertionError(C0000a.m7d("Unsupported injection: ", i3));
            }
            str = "deferred";
        }
        return C0000a.m20q(sb, str, "}");
    }
}
