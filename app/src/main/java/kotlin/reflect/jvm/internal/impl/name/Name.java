package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class Name implements Comparable<Name> {

    /* renamed from: b */
    @NotNull
    public final String f65606b;

    /* renamed from: c */
    public final boolean f65607c;

    public Name(@NotNull String str, boolean z) {
        this.f65606b = str;
        this.f65607c = z;
    }

    @NotNull
    /* renamed from: c */
    public static Name m33210c(@NotNull String str) {
        return str.startsWith("<") ? m33213f(str) : m33211d(str);
    }

    @NotNull
    /* renamed from: d */
    public static Name m33211d(@NotNull String str) {
        return new Name(str, false);
    }

    /* renamed from: e */
    public static boolean m33212e(@NotNull String str) {
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* renamed from: f */
    public static Name m33213f(@NotNull String str) {
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException(C0000a.m14k("special name must start with '<': ", str));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Name name) {
        return this.f65606b.compareTo(name.f65606b);
    }

    @NotNull
    /* renamed from: b */
    public String m33215b() {
        if (!this.f65607c) {
            return this.f65606b;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f65607c == name.f65607c && this.f65606b.equals(name.f65606b);
    }

    public int hashCode() {
        return (this.f65606b.hashCode() * 31) + (this.f65607c ? 1 : 0);
    }

    public String toString() {
        return this.f65606b;
    }
}
