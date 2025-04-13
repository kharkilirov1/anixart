package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class FqNameUnsafe {

    /* renamed from: e */
    public static final Name f65599e = Name.m33213f("<root>");

    /* renamed from: f */
    public static final Pattern f65600f = Pattern.compile("\\.");

    /* renamed from: g */
    public static final Function1<String, Name> f65601g = new C66931();

    /* renamed from: a */
    @NotNull
    public final String f65602a;

    /* renamed from: b */
    public transient FqName f65603b;

    /* renamed from: c */
    public transient FqNameUnsafe f65604c;

    /* renamed from: d */
    public transient Name f65605d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe$1 */
    public static class C66931 implements Function1<String, Name> {
        @Override // kotlin.jvm.functions.Function1
        public Name invoke(String str) {
            return Name.m33210c(str);
        }
    }

    public FqNameUnsafe(@NotNull String str, @NotNull FqName fqName) {
        this.f65602a = str;
        this.f65603b = fqName;
    }

    @NotNull
    /* renamed from: a */
    public FqNameUnsafe m33201a(@NotNull Name name) {
        String str;
        if (m33203c()) {
            str = name.f65606b;
        } else {
            str = this.f65602a + "." + name.f65606b;
        }
        return new FqNameUnsafe(str, this, name);
    }

    /* renamed from: b */
    public final void m33202b() {
        int lastIndexOf = this.f65602a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f65605d = Name.m33210c(this.f65602a.substring(lastIndexOf + 1));
            this.f65604c = new FqNameUnsafe(this.f65602a.substring(0, lastIndexOf));
        } else {
            this.f65605d = Name.m33210c(this.f65602a);
            this.f65604c = FqName.f65596c.f65597a;
        }
    }

    /* renamed from: c */
    public boolean m33203c() {
        return this.f65602a.isEmpty();
    }

    /* renamed from: d */
    public boolean m33204d() {
        return this.f65603b != null || this.f65602a.indexOf(60) < 0;
    }

    @NotNull
    /* renamed from: e */
    public List<Name> m33205e() {
        if (m33203c()) {
            return Collections.emptyList();
        }
        String[] split = f65600f.split(this.f65602a);
        Function1<String, Name> transform = f65601g;
        Intrinsics.m32179h(split, "<this>");
        Intrinsics.m32179h(transform, "transform");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            arrayList.add(((C66931) transform).invoke(str));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.f65602a.equals(((FqNameUnsafe) obj).f65602a);
    }

    @NotNull
    /* renamed from: f */
    public Name m33206f() {
        Name name = this.f65605d;
        if (name != null) {
            return name;
        }
        if (m33203c()) {
            throw new IllegalStateException("root");
        }
        m33202b();
        return this.f65605d;
    }

    @NotNull
    /* renamed from: g */
    public FqName m33207g() {
        FqName fqName = this.f65603b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f65603b = fqName2;
        return fqName2;
    }

    public int hashCode() {
        return this.f65602a.hashCode();
    }

    @NotNull
    public String toString() {
        return m33203c() ? f65599e.f65606b : this.f65602a;
    }

    public FqNameUnsafe(@NotNull String str) {
        this.f65602a = str;
    }

    public FqNameUnsafe(@NotNull String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f65602a = str;
        this.f65604c = fqNameUnsafe;
        this.f65605d = name;
    }
}
