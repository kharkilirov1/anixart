package kotlin.reflect.jvm.internal.structure;

import androidx.room.util.C0576a;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReflectJavaClass.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "findInnerClass", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "fqName", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "lightClassOriginKind", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements JavaClass, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {

    /* renamed from: a */
    public final Class<?> f66554a;

    public ReflectJavaClass(@NotNull Class<?> cls) {
        this.f66554a = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: A */
    public boolean mo32803A() {
        return this.f66554a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    /* renamed from: B */
    public LightClassOriginKind mo32804B() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: D */
    public Collection mo32805D() {
        Class<?>[] declaredClasses = this.f66554a.getDeclaredClasses();
        Intrinsics.m32175d(declaredClasses, "klass.declaredClasses");
        return SequencesKt.m33831A(SequencesKt.m33853u(SequencesKt.m33842j(ArraysKt.m31958h(declaredClasses), new Function1<Class<?>, Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$innerClassNames$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Class<?> cls) {
                Class<?> it = cls;
                Intrinsics.m32175d(it, "it");
                return Boolean.valueOf(it.getSimpleName().length() == 0);
            }
        }), new Function1<Class<?>, Name>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$innerClassNames$2
            @Override // kotlin.jvm.functions.Function1
            public Name invoke(Class<?> cls) {
                Class<?> it = cls;
                Intrinsics.m32175d(it, "it");
                String simpleName = it.getSimpleName();
                if (!Name.m33212e(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return Name.m33211d(simpleName);
                }
                return null;
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: F */
    public Collection mo32806F() {
        Method[] declaredMethods = this.f66554a.getDeclaredMethods();
        Intrinsics.m32175d(declaredMethods, "klass.declaredMethods");
        return SequencesKt.m33831A(SequencesKt.m33852t(SequencesKt.m33841i(ArraysKt.m31958h(declaredMethods), new Function1<Method, Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
            
                if (r6 == false) goto L25;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Boolean invoke(java.lang.reflect.Method r6) {
                /*
                    r5 = this;
                    java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
                    boolean r0 = r6.isSynthetic()
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L10
                    goto L64
                L10:
                    kotlin.reflect.jvm.internal.structure.ReflectJavaClass r0 = kotlin.reflect.jvm.internal.structure.ReflectJavaClass.this
                    boolean r0 = r0.mo32812v()
                    if (r0 == 0) goto L63
                    kotlin.reflect.jvm.internal.structure.ReflectJavaClass r0 = kotlin.reflect.jvm.internal.structure.ReflectJavaClass.this
                    java.util.Objects.requireNonNull(r0)
                    java.lang.String r0 = r6.getName()
                    if (r0 != 0) goto L24
                    goto L60
                L24:
                    int r3 = r0.hashCode()
                    r4 = -823812830(0xffffffffcee59d22, float:-1.9261402E9)
                    if (r3 == r4) goto L4a
                    r4 = 231605032(0xdce0328, float:1.269649E-30)
                    if (r3 == r4) goto L33
                    goto L60
                L33:
                    java.lang.String r3 = "valueOf"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L60
                    java.lang.Class[] r6 = r6.getParameterTypes()
                    java.lang.Class[] r0 = new java.lang.Class[r2]
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    r0[r1] = r3
                    boolean r6 = java.util.Arrays.equals(r6, r0)
                    goto L61
                L4a:
                    java.lang.String r3 = "values"
                    boolean r0 = r0.equals(r3)
                    if (r0 == 0) goto L60
                    java.lang.Class[] r6 = r6.getParameterTypes()
                    java.lang.String r0 = "method.parameterTypes"
                    kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
                    int r6 = r6.length
                    if (r6 != 0) goto L60
                    r6 = 1
                    goto L61
                L60:
                    r6 = 0
                L61:
                    if (r6 != 0) goto L64
                L63:
                    r1 = 1
                L64:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$1.invoke(java.lang.Object):java.lang.Object");
            }
        }), ReflectJavaClass$methods$2.f66562d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* renamed from: a */
    public Collection<JavaClassifierType> mo32807a() {
        Class cls;
        cls = Object.class;
        if (Intrinsics.m32174c(this.f66554a, cls)) {
            return EmptyList.f63144b;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Object genericSuperclass = this.f66554a.getGenericSuperclass();
        spreadBuilder.f63354a.add(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f66554a.getGenericInterfaces();
        Intrinsics.m32175d(genericInterfaces, "klass.genericInterfaces");
        spreadBuilder.m32210a(genericInterfaces);
        List m31994G = CollectionsKt.m31994G((Type[]) spreadBuilder.f63354a.toArray(new Type[spreadBuilder.m32211b()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m31994G, 10));
        Iterator it = m31994G.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    /* renamed from: b */
    public AnnotatedElement mo33803b() {
        return this.f66554a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* renamed from: d */
    public FqName mo32808d() {
        FqName m33189a = ReflectClassUtilKt.m33798b(this.f66554a).m33189a();
        Intrinsics.m32175d(m33189a, "klass.classId.asSingleFqName()");
        return m33189a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.m32174c(this.f66554a, ((ReflectJavaClass) obj).f66554a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection getAnnotations() {
        return ReflectJavaAnnotationOwner.DefaultImpls.m33805b(this);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f66554a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        return Name.m33211d(this.f66554a.getSimpleName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f66554a.getTypeParameters();
        Intrinsics.m32175d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
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
        return this.f66554a.hashCode();
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: j */
    public JavaClass mo32809j() {
        Class<?> declaringClass = this.f66554a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* renamed from: k */
    public boolean mo32800k() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: l */
    public Collection mo32810l() {
        Constructor<?>[] declaredConstructors = this.f66554a.getDeclaredConstructors();
        Intrinsics.m32175d(declaredConstructors, "klass.declaredConstructors");
        return SequencesKt.m33831A(SequencesKt.m33852t(SequencesKt.m33841i(ArraysKt.m31958h(declaredConstructors), new Function1<Constructor<?>, Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$constructors$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Constructor<?> constructor) {
                Constructor<?> constructor2 = constructor;
                Intrinsics.m32175d(constructor2, "constructor");
                return Boolean.valueOf(!constructor2.isSynthetic());
            }
        }), ReflectJavaClass$constructors$2.f66556d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: p */
    public boolean mo32811p() {
        return this.f66554a.isAnnotation();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        C0576a.m4126y(ReflectJavaClass.class, sb, ": ");
        sb.append(this.f66554a);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: v */
    public boolean mo32812v() {
        return this.f66554a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* renamed from: x */
    public Collection mo32813x() {
        Field[] declaredFields = this.f66554a.getDeclaredFields();
        Intrinsics.m32175d(declaredFields, "klass.declaredFields");
        return SequencesKt.m33831A(SequencesKt.m33852t(SequencesKt.m33841i(ArraysKt.m31958h(declaredFields), new Function1<Field, Boolean>() { // from class: kotlin.reflect.jvm.internal.structure.ReflectJavaClass$fields$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Field field) {
                Field field2 = field;
                Intrinsics.m32175d(field2, "field");
                return Boolean.valueOf(!field2.isSynthetic());
            }
        }), ReflectJavaClass$fields$2.f66558d));
    }
}
