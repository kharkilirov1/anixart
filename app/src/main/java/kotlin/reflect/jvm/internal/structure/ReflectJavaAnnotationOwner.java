package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaAnnotationOwner.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "fqName", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "findAnnotation", "", "getAnnotations", "()Ljava/util/List;", "annotations", "", "isDeprecatedInJavaDoc", "()Z", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public static final class DefaultImpls {
        @Nullable
        /* renamed from: a */
        public static ReflectJavaAnnotation m33804a(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner, @NotNull FqName fqName) {
            Annotation[] declaredAnnotations;
            AnnotatedElement mo33803b = reflectJavaAnnotationOwner.mo33803b();
            if (mo33803b == null || (declaredAnnotations = mo33803b.getDeclaredAnnotations()) == null) {
                return null;
            }
            return ReflectJavaAnnotationOwnerKt.m33806a(declaredAnnotations, fqName);
        }

        @NotNull
        /* renamed from: b */
        public static List<ReflectJavaAnnotation> m33805b(ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            Annotation[] declaredAnnotations;
            AnnotatedElement mo33803b = reflectJavaAnnotationOwner.mo33803b();
            return (mo33803b == null || (declaredAnnotations = mo33803b.getDeclaredAnnotations()) == null) ? EmptyList.f63144b : ReflectJavaAnnotationOwnerKt.m33807b(declaredAnnotations);
        }
    }

    @Nullable
    /* renamed from: b */
    AnnotatedElement mo33803b();
}
