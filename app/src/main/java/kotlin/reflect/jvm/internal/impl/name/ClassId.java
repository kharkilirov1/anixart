package kotlin.reflect.jvm.internal.impl.name;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ClassId {

    /* renamed from: a */
    public final FqName f65593a;

    /* renamed from: b */
    public final FqName f65594b;

    /* renamed from: c */
    public final boolean f65595c;

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        this.f65593a = fqName;
        this.f65594b = fqName2;
        this.f65595c = z;
    }

    @NotNull
    /* renamed from: d */
    public static ClassId m33186d(@NotNull String str) {
        return m33187e(str, false);
    }

    @NotNull
    /* renamed from: e */
    public static ClassId m33187e(@NotNull String str, boolean z) {
        String substring;
        Intrinsics.m32179h(str, "<this>");
        int m33880F = StringsKt.m33880F(str, JsonPointer.SEPARATOR, 0, false, 6, null);
        if (m33880F == -1) {
            substring = "";
        } else {
            substring = str.substring(0, m33880F);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        return new ClassId(new FqName(substring.replace(JsonPointer.SEPARATOR, '.')), new FqName(StringsKt.m33902b0(str, JsonPointer.SEPARATOR, str)), z);
    }

    @NotNull
    /* renamed from: i */
    public static ClassId m33188i(@NotNull FqName fqName) {
        return new ClassId(fqName.m33198c(), fqName.m33199d());
    }

    @NotNull
    /* renamed from: a */
    public FqName m33189a() {
        if (this.f65593a.m33197b()) {
            return this.f65594b;
        }
        return new FqName(this.f65593a.f65597a.f65602a + "." + this.f65594b.f65597a.f65602a);
    }

    @NotNull
    /* renamed from: b */
    public String m33190b() {
        if (this.f65593a.m33197b()) {
            return this.f65594b.f65597a.f65602a;
        }
        return this.f65593a.f65597a.f65602a.replace('.', JsonPointer.SEPARATOR) + "/" + this.f65594b.f65597a.f65602a;
    }

    @NotNull
    /* renamed from: c */
    public ClassId m33191c(@NotNull Name name) {
        FqName fqName = this.f65593a;
        FqName fqName2 = this.f65594b;
        return new ClassId(fqName, new FqName(fqName2.f65597a.m33201a(name), fqName2), this.f65595c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClassId.class != obj.getClass()) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return this.f65593a.equals(classId.f65593a) && this.f65594b.equals(classId.f65594b) && this.f65595c == classId.f65595c;
    }

    @Nullable
    /* renamed from: f */
    public ClassId m33192f() {
        FqName m33198c = this.f65594b.m33198c();
        if (m33198c.m33197b()) {
            return null;
        }
        return new ClassId(this.f65593a, m33198c, this.f65595c);
    }

    @NotNull
    /* renamed from: g */
    public Name m33193g() {
        return this.f65594b.m33199d();
    }

    /* renamed from: h */
    public boolean m33194h() {
        return !this.f65594b.m33198c().m33197b();
    }

    public int hashCode() {
        return Boolean.valueOf(this.f65595c).hashCode() + ((this.f65594b.hashCode() + (this.f65593a.hashCode() * 31)) * 31);
    }

    public String toString() {
        if (!this.f65593a.m33197b()) {
            return m33190b();
        }
        StringBuilder m24u = C0000a.m24u("/");
        m24u.append(m33190b());
        return m24u.toString();
    }

    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        FqName m33195f = FqName.m33195f(name);
        this.f65593a = fqName;
        this.f65594b = m33195f;
        this.f65595c = false;
    }
}
