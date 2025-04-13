package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectJavaMethod.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* renamed from: a */
    @NotNull
    public final Method f66570a;

    public ReflectJavaMethod(@NotNull Method method) {
        this.f66570a = method;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    /* renamed from: E */
    public boolean mo32826E() {
        return this.f66570a.getDefaultValue() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    @NotNull
    /* renamed from: f */
    public List<JavaValueParameter> mo32827f() {
        Type[] genericParameterTypes = this.f66570a.getGenericParameterTypes();
        Intrinsics.m32175d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.f66570a.getParameterAnnotations();
        Intrinsics.m32175d(parameterAnnotations, "member.parameterAnnotations");
        return m33810w(genericParameterTypes, parameterAnnotations, this.f66570a.isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public JavaType getReturnType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f66573a;
        Type genericReturnType = this.f66570a.getGenericReturnType();
        Intrinsics.m32175d(genericReturnType, "member.genericReturnType");
        return factory.m33812a(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f66570a.getTypeParameters();
        Intrinsics.m32175d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaMember
    /* renamed from: m */
    public Member mo33809m() {
        return this.f66570a;
    }
}
