package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ReflectJavaConstructor.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* renamed from: a */
    @NotNull
    public final Constructor<?> f66566a;

    public ReflectJavaConstructor(@NotNull Constructor<?> constructor) {
        this.f66566a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    @NotNull
    /* renamed from: f */
    public List<JavaValueParameter> mo32820f() {
        Type[] types = this.f66566a.getGenericParameterTypes();
        Intrinsics.m32175d(types, "types");
        if (types.length == 0) {
            return EmptyList.f63144b;
        }
        Class<?> klass = this.f66566a.getDeclaringClass();
        Intrinsics.m32175d(klass, "klass");
        if (klass.getDeclaringClass() != null && !Modifier.isStatic(klass.getModifiers())) {
            types = (Type[]) ArraysKt.m31972v(types, 1, types.length);
        }
        Annotation[][] realAnnotations = this.f66566a.getParameterAnnotations();
        if (realAnnotations.length < types.length) {
            StringBuilder m24u = C0000a.m24u("Illegal generic signature: ");
            m24u.append(this.f66566a);
            throw new IllegalStateException(m24u.toString());
        }
        if (realAnnotations.length > types.length) {
            Intrinsics.m32175d(realAnnotations, "annotations");
            realAnnotations = (Annotation[][]) ArraysKt.m31972v(realAnnotations, realAnnotations.length - types.length, realAnnotations.length);
        }
        Intrinsics.m32175d(realAnnotations, "realAnnotations");
        return m33810w(types, realAnnotations, this.f66566a.isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f66566a.getTypeParameters();
        Intrinsics.m32175d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaMember
    /* renamed from: m */
    public Member mo33809m() {
        return this.f66566a;
    }
}
