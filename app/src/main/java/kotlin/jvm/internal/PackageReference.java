package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PackageReference.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* renamed from: b */
    @NotNull
    public final Class<?> f63346b;

    public PackageReference(@NotNull Class<?> jClass, @NotNull String moduleName) {
        Intrinsics.m32179h(jClass, "jClass");
        Intrinsics.m32179h(moduleName, "moduleName");
        this.f63346b = jClass;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof PackageReference) && Intrinsics.m32174c(this.f63346b, ((PackageReference) obj).f63346b);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: h */
    public Class<?> mo32163h() {
        return this.f63346b;
    }

    public int hashCode() {
        return this.f63346b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f63346b.toString() + " (Kotlin reflection is not available)";
    }
}
