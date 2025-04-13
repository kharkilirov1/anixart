package kotlin.reflect.jvm.internal.structure;

import androidx.room.util.C0576a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* renamed from: a */
    @NotNull
    public final Annotation f66547a;

    public ReflectJavaAnnotation(@NotNull Annotation annotation) {
        Intrinsics.m32180i(annotation, "annotation");
        this.f66547a = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* renamed from: c */
    public Collection<JavaAnnotationArgument> mo32795c() {
        Method[] declaredMethods = JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(this.f66547a)).getDeclaredMethods();
        Intrinsics.m32175d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f66548b;
            Object invoke = method.invoke(this.f66547a, new Object[0]);
            Intrinsics.m32175d(invoke, "method.invoke(annotation)");
            arrayList.add(factory.m33802a(invoke, Name.m33211d(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && Intrinsics.m32174c(this.f66547a, ((ReflectJavaAnnotation) obj).f66547a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    @NotNull
    /* renamed from: g */
    public ClassId mo32796g() {
        return ReflectClassUtilKt.m33798b(JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(this.f66547a)));
    }

    public int hashCode() {
        return this.f66547a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* renamed from: t */
    public JavaClass mo32797t() {
        return new ReflectJavaClass(JvmClassMappingKt.m32147b(JvmClassMappingKt.m32146a(this.f66547a)));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectJavaAnnotation.class, sb, ": ");
        sb.append(this.f66547a);
        return sb.toString();
    }
}
