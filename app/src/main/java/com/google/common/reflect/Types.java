package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableListIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
final class Types {

    /* renamed from: a */
    public static final Function<Type, String> f22017a = new Function<Type, String>() { // from class: com.google.common.reflect.Types.1
        @Override // com.google.common.base.Function
        public String apply(Type type) {
            return JavaVersion.f22029f.mo12131b(type);
        }
    };

    /* renamed from: b */
    public static final Joiner f22018b = new Joiner(", ").mo11163e("null");

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class ClassOwnership {

        /* renamed from: b */
        public static final ClassOwnership f22020b;

        /* renamed from: c */
        public static final ClassOwnership f22021c;

        /* renamed from: d */
        public static final ClassOwnership f22022d;

        /* renamed from: e */
        public static final /* synthetic */ ClassOwnership[] f22023e;

        /* renamed from: com.google.common.reflect.Types$ClassOwnership$3 */
        class C19403 extends C1LocalClass<String> {
        }

        static {
            int i2 = 0;
            ClassOwnership classOwnership = new ClassOwnership("OWNED_BY_ENCLOSING_CLASS", i2) { // from class: com.google.common.reflect.Types.ClassOwnership.1
                @Override // com.google.common.reflect.Types.ClassOwnership
                @NullableDecl
                /* renamed from: a */
                public Class<?> mo12129a(Class<?> cls) {
                    return cls.getEnclosingClass();
                }
            };
            f22020b = classOwnership;
            ClassOwnership classOwnership2 = new ClassOwnership("LOCAL_CLASS_HAS_NO_OWNER", 1) { // from class: com.google.common.reflect.Types.ClassOwnership.2
                @Override // com.google.common.reflect.Types.ClassOwnership
                @NullableDecl
                /* renamed from: a */
                public Class<?> mo12129a(Class<?> cls) {
                    if (cls.isLocalClass()) {
                        return null;
                    }
                    return cls.getEnclosingClass();
                }
            };
            f22021c = classOwnership2;
            f22023e = new ClassOwnership[]{classOwnership, classOwnership2};
            ParameterizedType parameterizedType = (ParameterizedType) C19403.class.getGenericSuperclass();
            ClassOwnership[] values = values();
            int length = values.length;
            while (i2 < length) {
                ClassOwnership classOwnership3 = values[i2];
                if (classOwnership3.mo12129a(C1LocalClass.class) == parameterizedType.getOwnerType()) {
                    f22022d = classOwnership3;
                    return;
                }
                i2++;
            }
            throw new AssertionError();
        }

        public ClassOwnership(String str, int i2, C19361 c19361) {
        }

        public static ClassOwnership valueOf(String str) {
            return (ClassOwnership) Enum.valueOf(ClassOwnership.class, str);
        }

        public static ClassOwnership[] values() {
            return (ClassOwnership[]) f22023e.clone();
        }

        @NullableDecl
        /* renamed from: a */
        public abstract Class<?> mo12129a(Class<?> cls);
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        /* renamed from: b */
        public final Type f22024b;

        public GenericArrayTypeImpl(Type type) {
            this.f22024b = JavaVersion.f22029f.mo12133d(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return Objects.m11173a(this.f22024b, ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f22024b;
        }

        public int hashCode() {
            return this.f22024b.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.m12128h(this.f22024b)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    public enum JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: a */
            public Type mo12130a(Type type) {
                return new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: d */
            public Type mo12133d(Type type) {
                java.util.Objects.requireNonNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: a */
            public Type mo12130a(Type type) {
                if (!(type instanceof Class)) {
                    return new GenericArrayTypeImpl(type);
                }
                Function<Type, String> function = Types.f22017a;
                return Array.newInstance((Class<?>) type, 0).getClass();
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: d */
            public Type mo12133d(Type type) {
                java.util.Objects.requireNonNull(type);
                return type;
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: a */
            public Type mo12130a(Type type) {
                return JavaVersion.JAVA7.mo12130a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: b */
            public String mo12131b(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: d */
            public Type mo12133d(Type type) {
                java.util.Objects.requireNonNull(type);
                return type;
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: a */
            public Type mo12130a(Type type) {
                return JavaVersion.JAVA8.mo12130a(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: b */
            public String mo12131b(Type type) {
                return JavaVersion.JAVA8.mo12131b(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: d */
            public Type mo12133d(Type type) {
                return JavaVersion.JAVA8.mo12133d(type);
            }
        };


        /* renamed from: f */
        public static final JavaVersion f22029f;

        static {
            JavaVersion javaVersion = JAVA6;
            JavaVersion javaVersion2 = JAVA7;
            JavaVersion javaVersion3 = JAVA8;
            JavaVersion javaVersion4 = JAVA9;
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new TypeCapture<Map.Entry<String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.m12096a().toString().contains("java.util.Map.java.util.Map")) {
                    f22029f = javaVersion3;
                    return;
                } else {
                    f22029f = javaVersion4;
                    return;
                }
            }
            if (new TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.m12096a() instanceof Class) {
                f22029f = javaVersion2;
            } else {
                f22029f = javaVersion;
            }
        }

        JavaVersion(C19361 c19361) {
        }

        /* renamed from: a */
        public abstract Type mo12130a(Type type);

        /* renamed from: b */
        public String mo12131b(Type type) {
            return Types.m12128h(type);
        }

        /* renamed from: c */
        public final ImmutableList<Type> m12132c(Type[] typeArr) {
            UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (Type type : typeArr) {
                builder.m11640d(mo12133d(type));
            }
            return builder.m11641e();
        }

        /* renamed from: d */
        public abstract Type mo12133d(Type type);
    }

    public static final class NativeTypeVariableEquals<X> {

        /* renamed from: a */
        public static final boolean f22031a = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.m12126f(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        /* renamed from: b */
        @NullableDecl
        public final Type f22032b;

        /* renamed from: c */
        public final ImmutableList<Type> f22033c;

        /* renamed from: d */
        public final Class<?> f22034d;

        public ParameterizedTypeImpl(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
            java.util.Objects.requireNonNull(cls);
            Preconditions.m11178b(typeArr.length == cls.getTypeParameters().length);
            Types.m12122b(typeArr, "type parameter");
            this.f22032b = type;
            this.f22034d = cls;
            this.f22033c = JavaVersion.f22029f.m12132c(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return this.f22034d.equals(parameterizedType.getRawType()) && Objects.m11173a(this.f22032b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.m12123c(this.f22033c);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f22032b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f22034d;
        }

        public int hashCode() {
            Type type = this.f22032b;
            return ((type == null ? 0 : type.hashCode()) ^ this.f22033c.hashCode()) ^ this.f22034d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f22032b != null) {
                JavaVersion javaVersion = JavaVersion.f22029f;
                java.util.Objects.requireNonNull(javaVersion);
                if (!(javaVersion instanceof JavaVersion.C19444)) {
                    sb.append(javaVersion.mo12131b(this.f22032b));
                    sb.append('.');
                }
            }
            sb.append(this.f22034d.getName());
            sb.append('<');
            Joiner joiner = Types.f22018b;
            ImmutableList<Type> immutableList = this.f22033c;
            Function<Type, String> function = Types.f22017a;
            sb.append(joiner.m11161b(Iterables.m11705j(immutableList, Types.f22017a)));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* renamed from: a */
        public final D f22035a;

        /* renamed from: b */
        public final String f22036b;

        /* renamed from: c */
        public final ImmutableList<Type> f22037c;

        public TypeVariableImpl(D d, String str, Type[] typeArr) {
            Types.m12122b(typeArr, "bound for type variable");
            java.util.Objects.requireNonNull(d);
            this.f22035a = d;
            java.util.Objects.requireNonNull(str);
            this.f22036b = str;
            this.f22037c = ImmutableList.m11635z(typeArr);
        }

        public boolean equals(Object obj) {
            if (!NativeTypeVariableEquals.f22031a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f22036b.equals(typeVariable.getName()) && this.f22035a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                return false;
            }
            TypeVariableImpl<?> typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f22039a;
            return this.f22036b.equals(typeVariableImpl.f22036b) && this.f22035a.equals(typeVariableImpl.f22035a) && this.f22037c.equals(typeVariableImpl.f22037c);
        }

        public int hashCode() {
            return this.f22035a.hashCode() ^ this.f22036b.hashCode();
        }

        public String toString() {
            return this.f22036b;
        }
    }

    public static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* renamed from: b */
        public static final ImmutableMap<String, Method> f22038b;

        /* renamed from: a */
        public final TypeVariableImpl<?> f22039a;

        static {
            ImmutableMap.Builder m11648a = ImmutableMap.m11648a();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    m11648a.mo11614c(method.getName(), method);
                }
            }
            f22038b = m11648a.mo11613a();
        }

        public TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
            this.f22039a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f22038b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f22039a, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {

        /* renamed from: b */
        public final ImmutableList<Type> f22040b;

        /* renamed from: c */
        public final ImmutableList<Type> f22041c;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.m12122b(typeArr, "lower bound for wildcard");
            Types.m12122b(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.f22029f;
            this.f22040b = javaVersion.m12132c(typeArr);
            this.f22041c = javaVersion.m12132c(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f22040b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f22041c.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.m12123c(this.f22040b);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.m12123c(this.f22041c);
        }

        public int hashCode() {
            return this.f22040b.hashCode() ^ this.f22041c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableListIterator<Type> listIterator = this.f22040b.listIterator();
            while (listIterator.hasNext()) {
                Type next = listIterator.next();
                sb.append(" super ");
                sb.append(JavaVersion.f22029f.mo12131b(next));
            }
            ImmutableList<Type> immutableList = this.f22041c;
            Function<Type, String> function = Types.f22017a;
            for (Type type : Iterables.m11698c(immutableList, Predicates.m11203h(Predicates.m11200e(Object.class)))) {
                sb.append(" extends ");
                sb.append(JavaVersion.f22029f.mo12131b(type));
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Type m12121a(Type[] typeArr) {
        for (Type type : typeArr) {
            Type m12124d = m12124d(type);
            if (m12124d != null) {
                if (m12124d instanceof Class) {
                    Class cls = (Class) m12124d;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return new WildcardTypeImpl(new Type[0], new Type[]{m12124d});
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m12122b(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Preconditions.m11185i(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    /* renamed from: c */
    public static Type[] m12123c(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    @NullableDecl
    /* renamed from: d */
    public static Type m12124d(Type type) {
        java.util.Objects.requireNonNull(type);
        final AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() { // from class: com.google.common.reflect.Types.2
            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: b */
            public void mo12101b(Class<?> cls) {
                atomicReference.set(cls.getComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: c */
            public void mo12102c(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: e */
            public void mo12104e(TypeVariable<?> typeVariable) {
                atomicReference.set(Types.m12121a(typeVariable.getBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: f */
            public void mo12105f(WildcardType wildcardType) {
                atomicReference.set(Types.m12121a(wildcardType.getUpperBounds()));
            }
        }.m12120a(type);
        return (Type) atomicReference.get();
    }

    /* renamed from: e */
    public static Type m12125e(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.f22029f.mo12130a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.m11179c(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return new WildcardTypeImpl(new Type[]{m12125e(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.m11179c(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new WildcardTypeImpl(new Type[0], new Type[]{m12125e(upperBounds[0])});
    }

    /* renamed from: f */
    public static <D extends GenericDeclaration> TypeVariable<D> m12126f(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        TypeVariableInvocationHandler typeVariableInvocationHandler = new TypeVariableInvocationHandler(new TypeVariableImpl(d, str, typeArr));
        Preconditions.m11184h(TypeVariable.class.isInterface(), "%s is not an interface", TypeVariable.class);
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, typeVariableInvocationHandler));
    }

    /* renamed from: g */
    public static ParameterizedType m12127g(@NullableDecl Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return new ParameterizedTypeImpl(ClassOwnership.f22022d.mo12129a(cls), cls, typeArr);
        }
        Preconditions.m11184h(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    /* renamed from: h */
    public static String m12128h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
