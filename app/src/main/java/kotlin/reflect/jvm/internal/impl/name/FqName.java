package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class FqName {

    /* renamed from: c */
    public static final FqName f65596c = new FqName("");

    /* renamed from: a */
    @NotNull
    public final FqNameUnsafe f65597a;

    /* renamed from: b */
    public transient FqName f65598b;

    public FqName(@NotNull String str) {
        this.f65597a = new FqNameUnsafe(str, this);
    }

    @NotNull
    /* renamed from: f */
    public static FqName m33195f(@NotNull Name name) {
        return new FqName(new FqNameUnsafe(name.f65606b, f65596c.f65597a, name));
    }

    @NotNull
    /* renamed from: a */
    public FqName m33196a(@NotNull Name name) {
        return new FqName(this.f65597a.m33201a(name), this);
    }

    /* renamed from: b */
    public boolean m33197b() {
        return this.f65597a.m33203c();
    }

    @NotNull
    /* renamed from: c */
    public FqName m33198c() {
        FqName fqName = this.f65598b;
        if (fqName != null) {
            return fqName;
        }
        if (m33197b()) {
            throw new IllegalStateException("root");
        }
        FqNameUnsafe fqNameUnsafe = this.f65597a;
        FqNameUnsafe fqNameUnsafe2 = fqNameUnsafe.f65604c;
        if (fqNameUnsafe2 == null) {
            if (fqNameUnsafe.m33203c()) {
                throw new IllegalStateException("root");
            }
            fqNameUnsafe.m33202b();
            fqNameUnsafe2 = fqNameUnsafe.f65604c;
        }
        FqName fqName2 = new FqName(fqNameUnsafe2);
        this.f65598b = fqName2;
        return fqName2;
    }

    @NotNull
    /* renamed from: d */
    public Name m33199d() {
        return this.f65597a.m33206f();
    }

    /* renamed from: e */
    public boolean m33200e(@NotNull Name name) {
        FqNameUnsafe fqNameUnsafe = this.f65597a;
        int indexOf = fqNameUnsafe.f65602a.indexOf(46);
        if (fqNameUnsafe.m33203c()) {
            return false;
        }
        String str = fqNameUnsafe.f65602a;
        String str2 = name.f65606b;
        if (indexOf == -1) {
            indexOf = str.length();
        }
        return str.regionMatches(0, str2, 0, indexOf);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.f65597a.equals(((FqName) obj).f65597a);
    }

    public int hashCode() {
        return this.f65597a.hashCode();
    }

    public String toString() {
        return this.f65597a.toString();
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        this.f65597a = fqNameUnsafe;
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f65597a = fqNameUnsafe;
        this.f65598b = fqName;
    }
}
