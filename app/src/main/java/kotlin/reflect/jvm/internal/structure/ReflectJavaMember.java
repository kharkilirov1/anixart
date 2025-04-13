package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaMember.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "name", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ReflectJavaMember extends ReflectJavaElement implements JavaMember, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    /* renamed from: H */
    public JavaClass mo32825H() {
        Class<?> declaringClass = mo33809m().getDeclaringClass();
        Intrinsics.m32175d(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    @NotNull
    /* renamed from: b */
    public AnnotatedElement mo33803b() {
        Member mo33809m = mo33809m();
        if (mo33809m != null) {
            return (AnnotatedElement) mo33809m;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.m32174c(mo33809m(), ((ReflectJavaMember) obj).mo33809m());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.m33805b(this);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return mo33809m().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        String name = mo33809m().getName();
        if (name != null) {
            return Name.m33211d(name);
        }
        Name name2 = SpecialNames.f65609a;
        Intrinsics.m32175d(name2, "SpecialNames.NO_NAME_PROVIDED");
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        return ReflectJavaModifierListOwner.DefaultImpls.m33811a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: h */
    public JavaAnnotation mo32799h(FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return ReflectJavaAnnotationOwner.DefaultImpls.m33804a(this, fqName);
    }

    public int hashCode() {
        return mo33809m().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    /* renamed from: i */
    public boolean mo32828i() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @NotNull
    /* renamed from: m */
    public abstract Member mo33809m();

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + mo33809m();
    }

    @NotNull
    /* renamed from: w */
    public final List<JavaValueParameter> m33810w(@NotNull Type[] typeArr, @NotNull Annotation[][] annotationArr, boolean z) {
        ArrayList arrayList;
        String str;
        Method method;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        Member member = mo33809m();
        Intrinsics.m32180i(member, "member");
        Java8ParameterNamesLoader.Cache cache = Java8ParameterNamesLoader.f66538a;
        if (cache == null) {
            Class<?> cls = member.getClass();
            try {
                cache = new Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.m33801e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
            } catch (NoSuchMethodException unused) {
                cache = new Java8ParameterNamesLoader.Cache(null, null);
            }
            Java8ParameterNamesLoader.f66538a = cache;
        }
        Method method2 = cache.f66539a;
        if (method2 == null || (method = cache.f66540b) == null) {
            arrayList = null;
        } else {
            Object invoke = method2.invoke(member, new Object[0]);
            if (invoke == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
            }
            Object[] objArr = (Object[]) invoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = method.invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                arrayList.add((String) invoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i2 = 0;
        while (i2 < length) {
            ReflectJavaType m33812a = ReflectJavaType.f66573a.m33812a(typeArr[i2]);
            if (arrayList != null) {
                str = (String) CollectionsKt.m32048y(arrayList, i2 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + getName() + " type=" + m33812a + ") in " + arrayList + "@ReflectJavaMember").toString());
                }
            } else {
                str = null;
            }
            arrayList2.add(new ReflectJavaValueParameter(m33812a, annotationArr[i2], str, z && i2 == ArraysKt.m31929E(typeArr)));
            i2++;
        }
        return arrayList2;
    }
}
