package kotlin.reflect.jvm.internal.structure;

import androidx.room.util.C0576a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaPackage.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPackage;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "fqName", "<init>", "(Lorg/jetbrains/kotlin/name/FqName;)V", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* renamed from: a */
    @NotNull
    public final FqName f66571a;

    public ReflectJavaPackage(@NotNull FqName fqName) {
        this.f66571a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* renamed from: d, reason: from getter */
    public FqName getF66571a() {
        return this.f66571a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.m32174c(this.f66571a, ((ReflectJavaPackage) obj).f66571a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: h */
    public JavaAnnotation mo32799h(FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return null;
    }

    public int hashCode() {
        return this.f66571a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* renamed from: o */
    public Collection<JavaClass> mo32830o(@NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.m32180i(nameFilter, "nameFilter");
        return EmptyList.f63144b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectJavaPackage.class, sb, ": ");
        sb.append(this.f66571a);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    @NotNull
    /* renamed from: u */
    public Collection<JavaPackage> mo32831u() {
        return EmptyList.f63144b;
    }
}
