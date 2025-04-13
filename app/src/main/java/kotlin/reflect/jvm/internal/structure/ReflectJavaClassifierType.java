package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ReflectJavaClassifierType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* renamed from: b */
    @NotNull
    public final JavaClassifier f66564b;

    /* renamed from: c */
    @NotNull
    public final Type f66565c;

    public ReflectJavaClassifierType(@NotNull Type reflectType) {
        JavaClassifier reflectJavaClass;
        Intrinsics.m32180i(reflectType, "reflectType");
        this.f66565c = reflectType;
        if (reflectType instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                StringBuilder m24u = C0000a.m24u("Not a classifier type (");
                m24u.append(reflectType.getClass());
                m24u.append("): ");
                m24u.append(reflectType);
                throw new IllegalStateException(m24u.toString());
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            if (rawType == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f66564b = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    @NotNull
    /* renamed from: I, reason: from getter */
    public Type getF66565c() {
        return this.f66565c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* renamed from: e, reason: from getter */
    public JavaClassifier getF66564b() {
        return this.f66564b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* renamed from: h */
    public JavaAnnotation mo32799h(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* renamed from: n */
    public String mo32816n() {
        return this.f66565c.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    /* renamed from: r */
    public boolean mo32817r() {
        Type type = this.f66565c;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        Intrinsics.m32175d(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* renamed from: s */
    public String mo32818s() {
        StringBuilder m24u = C0000a.m24u("Type not found: ");
        m24u.append(this.f66565c);
        throw new UnsupportedOperationException(m24u.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    @NotNull
    /* renamed from: y */
    public List<JavaType> mo32819y() {
        List<Type> m33800d = ReflectClassUtilKt.m33800d(this.f66565c);
        ReflectJavaType.Factory factory = ReflectJavaType.f66573a;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m33800d, 10));
        Iterator<T> it = m33800d.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.m33812a((Type) it.next()));
        }
        return arrayList;
    }
}
