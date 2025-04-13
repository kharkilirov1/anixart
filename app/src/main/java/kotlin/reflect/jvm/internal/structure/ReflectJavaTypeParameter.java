package kotlin.reflect.jvm.internal.structure;

import androidx.room.util.C0576a;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaTypeParameter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "name", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements JavaTypeParameter, ReflectJavaAnnotationOwner {

    /* renamed from: a */
    @NotNull
    public final TypeVariable<?> f66574a;

    public ReflectJavaTypeParameter(@NotNull TypeVariable<?> typeVariable) {
        Intrinsics.m32180i(typeVariable, "typeVariable");
        this.f66574a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    @Nullable
    /* renamed from: b */
    public AnnotatedElement mo33803b() {
        TypeVariable<?> typeVariable = this.f66574a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaTypeParameter) && Intrinsics.m32174c(this.f66574a, ((ReflectJavaTypeParameter) obj).f66574a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.m33805b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        return Name.m33211d(this.f66574a.getName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public Collection getUpperBounds() {
        Type[] bounds = this.f66574a.getBounds();
        Intrinsics.m32175d(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type));
        }
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.m32013Z(arrayList);
        return Intrinsics.m32174c(reflectJavaClassifierType != null ? reflectJavaClassifierType.f66565c : null, Object.class) ? EmptyList.f63144b : arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: h */
    public JavaAnnotation mo32799h(FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return ReflectJavaAnnotationOwner.DefaultImpls.m33804a(this, fqName);
    }

    public int hashCode() {
        return this.f66574a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectJavaTypeParameter.class, sb, ": ");
        sb.append(this.f66574a);
        return sb.toString();
    }
}
