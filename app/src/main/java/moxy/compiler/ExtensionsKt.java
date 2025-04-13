package moxy.compiler;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import com.squareup.javapoet.WildcardTypeName;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Extensions.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u0082\u0002\n\n\b\b\u0000\u001a\u0004\u0010\u0000(\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b\u001a\u001e\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a$\u0010\u000e\u001a\u0004\u0018\u00010\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0011*\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\b\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0005\u001a\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0017\u001a\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005*\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0017\u001a\u001a\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u001c\u001a\u0018\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b\u001a\u000e\u0010\u001f\u001a\u00020 *\u0006\u0012\u0002\b\u00030\b\u001a\n\u0010!\u001a\u00020 *\u00020\u0007\u001a\u000e\u0010!\u001a\u00020 *\u0006\u0012\u0002\b\u00030\b\u001a\u0012\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010%\u001a\u00020\u0014ò\u0001\u0004\n\u00020\u0001¨\u0006&"}, m31884d2 = {"asDeclaredType", "Ljavax/lang/model/type/DeclaredType;", "Ljavax/lang/model/element/Element;", "asTypeElement", "Ljavax/lang/model/element/TypeElement;", "Ljavax/lang/model/type/TypeMirror;", "className", "Lcom/squareup/javapoet/ClassName;", "Lkotlin/reflect/KClass;", "equalsByType", "", "", "Lcom/squareup/javapoet/ParameterSpec;", "other", "getAnnotationMirror", "Ljavax/lang/model/element/AnnotationMirror;", "T", "", "type", "getFullClassName", "", "getValueAsString", "property", "Lkotlin/reflect/KProperty1;", "getValueAsTypeMirror", "parametrizedWith", "Lcom/squareup/javapoet/ParameterizedTypeName;", "kotlin.jvm.PlatformType", "Lcom/squareup/javapoet/TypeName;", "types", "Lcom/squareup/javapoet/TypeVariableName;", "subtypeWildcard", "Lcom/squareup/javapoet/WildcardTypeName;", "supertypeWildcard", "toJavaFile", "Lcom/squareup/javapoet/JavaFile;", "Lcom/squareup/javapoet/TypeSpec;", "packageName", "moxy-compiler"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ExtensionsKt {
    @NotNull
    public static final DeclaredType asDeclaredType(@NotNull Element asDeclaredType) {
        Intrinsics.m32179h(asDeclaredType, "$this$asDeclaredType");
        DeclaredType asType = asDeclaredType.asType();
        Objects.requireNonNull(asType, "null cannot be cast to non-null type javax.lang.model.type.DeclaredType");
        return asType;
    }

    @NotNull
    public static final TypeElement asTypeElement(@NotNull TypeMirror asTypeElement) {
        Intrinsics.m32179h(asTypeElement, "$this$asTypeElement");
        TypeElement asElement = ((DeclaredType) asTypeElement).asElement();
        Objects.requireNonNull(asElement, "null cannot be cast to non-null type javax.lang.model.element.TypeElement");
        return asElement;
    }

    @NotNull
    public static final ClassName className(@NotNull KClass<?> className) {
        Intrinsics.m32179h(className, "$this$className");
        ClassName className2 = ClassName.get(JvmClassMappingKt.m32147b(className));
        Intrinsics.m32178g(className2, "ClassName.get(java)");
        return className2;
    }

    public static final boolean equalsByType(@NotNull List<ParameterSpec> equalsByType, @NotNull List<ParameterSpec> other) {
        Intrinsics.m32179h(equalsByType, "$this$equalsByType");
        Intrinsics.m32179h(other, "other");
        return Util.equalsBy(equalsByType, other, new BiFunction<ParameterSpec, ParameterSpec, Boolean>() { // from class: moxy.compiler.ExtensionsKt$equalsByType$1
            @Override // java.util.function.BiFunction
            public final Boolean apply(ParameterSpec parameterSpec, ParameterSpec parameterSpec2) {
                return Boolean.valueOf(Intrinsics.m32174c(parameterSpec.type, parameterSpec2.type));
            }
        });
    }

    @Nullable
    public static final <T extends Annotation> AnnotationMirror getAnnotationMirror(@NotNull Element getAnnotationMirror, @NotNull KClass<T> type) {
        Intrinsics.m32179h(getAnnotationMirror, "$this$getAnnotationMirror");
        Intrinsics.m32179h(type, "type");
        return Util.getAnnotation(getAnnotationMirror, JvmClassMappingKt.m32147b(type).getName());
    }

    @NotNull
    public static final String getFullClassName(@NotNull TypeMirror getFullClassName) {
        Intrinsics.m32179h(getFullClassName, "$this$getFullClassName");
        String fullClassName = Util.getFullClassName(getFullClassName);
        Intrinsics.m32178g(fullClassName, "Util.getFullClassName(this)");
        return fullClassName;
    }

    @Nullable
    public static final String getValueAsString(@NotNull AnnotationMirror getValueAsString, @NotNull KProperty1<?, ?> property) {
        Intrinsics.m32179h(getValueAsString, "$this$getValueAsString");
        Intrinsics.m32179h(property, "property");
        return Util.getAnnotationValueAsString(getValueAsString, property.getName());
    }

    @Nullable
    public static final TypeMirror getValueAsTypeMirror(@NotNull AnnotationMirror getValueAsTypeMirror, @NotNull KProperty1<?, ?> property) {
        Intrinsics.m32179h(getValueAsTypeMirror, "$this$getValueAsTypeMirror");
        Intrinsics.m32179h(property, "property");
        return Util.getAnnotationValueAsTypeMirror(getValueAsTypeMirror, property.getName());
    }

    public static final ParameterizedTypeName parametrizedWith(@NotNull ClassName parametrizedWith, @NotNull TypeName type) {
        Intrinsics.m32179h(parametrizedWith, "$this$parametrizedWith");
        Intrinsics.m32179h(type, "type");
        return ParameterizedTypeName.get(parametrizedWith, new TypeName[]{type});
    }

    @NotNull
    public static final WildcardTypeName subtypeWildcard(@NotNull KClass<?> subtypeWildcard) {
        Intrinsics.m32179h(subtypeWildcard, "$this$subtypeWildcard");
        WildcardTypeName subtypeOf = WildcardTypeName.subtypeOf(JvmClassMappingKt.m32147b(subtypeWildcard));
        Intrinsics.m32178g(subtypeOf, "WildcardTypeName.subtypeOf(java)");
        return subtypeOf;
    }

    @NotNull
    public static final WildcardTypeName supertypeWildcard(@NotNull KClass<?> supertypeWildcard) {
        Intrinsics.m32179h(supertypeWildcard, "$this$supertypeWildcard");
        WildcardTypeName supertypeOf = WildcardTypeName.supertypeOf(JvmClassMappingKt.m32147b(supertypeWildcard));
        Intrinsics.m32178g(supertypeOf, "WildcardTypeName.supertypeOf(java)");
        return supertypeOf;
    }

    @NotNull
    public static final JavaFile toJavaFile(@NotNull TypeSpec toJavaFile, @NotNull ClassName className) {
        Intrinsics.m32179h(toJavaFile, "$this$toJavaFile");
        Intrinsics.m32179h(className, "className");
        String packageName = className.packageName();
        Intrinsics.m32178g(packageName, "className.packageName()");
        return toJavaFile(toJavaFile, packageName);
    }

    @NotNull
    public static final TypeElement asTypeElement(@NotNull Element asTypeElement) {
        Intrinsics.m32179h(asTypeElement, "$this$asTypeElement");
        return (TypeElement) asTypeElement;
    }

    @NotNull
    public static final ParameterizedTypeName parametrizedWith(@NotNull ClassName parametrizedWith, @NotNull List<TypeVariableName> types) {
        Intrinsics.m32179h(parametrizedWith, "$this$parametrizedWith");
        Intrinsics.m32179h(types, "types");
        Object[] array = types.toArray(new TypeVariableName[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        TypeName[] typeNameArr = (TypeName[]) array;
        ParameterizedTypeName parameterizedTypeName = ParameterizedTypeName.get(parametrizedWith, (TypeName[]) Arrays.copyOf(typeNameArr, typeNameArr.length));
        Intrinsics.m32178g(parameterizedTypeName, "ParameterizedTypeName.ge…s, *types.toTypedArray())");
        return parameterizedTypeName;
    }

    @NotNull
    public static final WildcardTypeName supertypeWildcard(@NotNull ClassName supertypeWildcard) {
        Intrinsics.m32179h(supertypeWildcard, "$this$supertypeWildcard");
        WildcardTypeName supertypeOf = WildcardTypeName.supertypeOf((TypeName) supertypeWildcard);
        Intrinsics.m32178g(supertypeOf, "WildcardTypeName.supertypeOf(this)");
        return supertypeOf;
    }

    @NotNull
    public static final JavaFile toJavaFile(@NotNull TypeSpec toJavaFile, @NotNull String packageName) {
        Intrinsics.m32179h(toJavaFile, "$this$toJavaFile");
        Intrinsics.m32179h(packageName, "packageName");
        JavaFile build = JavaFile.builder(packageName, toJavaFile).indent("\t").build();
        Intrinsics.m32178g(build, "JavaFile.builder(package…nt(\"\\t\")\n        .build()");
        return build;
    }
}
