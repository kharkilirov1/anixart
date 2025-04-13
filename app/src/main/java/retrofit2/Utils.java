package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;
import okhttp3.ResponseBody;
import okio.Buffer;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class Utils {

    /* renamed from: a */
    public static final Type[] f69581a = new Type[0];

    public static final class GenericArrayTypeImpl implements GenericArrayType {

        /* renamed from: b */
        public final Type f69582b;

        public GenericArrayTypeImpl(Type type) {
            this.f69582b = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils.m35044c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f69582b;
        }

        public int hashCode() {
            return this.f69582b.hashCode();
        }

        public String toString() {
            return C0000a.m20q(new StringBuilder(), Utils.m35057p(this.f69582b), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType {

        /* renamed from: b */
        @Nullable
        public final Type f69583b;

        /* renamed from: c */
        public final Type f69584c;

        /* renamed from: d */
        public final Type[] f69585d;

        public ParameterizedTypeImpl(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                Utils.m35043b(type3);
            }
            this.f69583b = type;
            this.f69584c = type2;
            this.f69585d = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils.m35044c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f69585d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f69583b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f69584c;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f69585d) ^ this.f69584c.hashCode();
            Type type = this.f69583b;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f69585d;
            if (typeArr.length == 0) {
                return Utils.m35057p(this.f69584c);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils.m35057p(this.f69584c));
            sb.append("<");
            sb.append(Utils.m35057p(this.f69585d[0]));
            for (int i2 = 1; i2 < this.f69585d.length; i2++) {
                sb.append(", ");
                sb.append(Utils.m35057p(this.f69585d[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType {

        /* renamed from: b */
        public final Type f69586b;

        /* renamed from: c */
        @Nullable
        public final Type f69587c;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                Utils.m35043b(typeArr[0]);
                this.f69587c = null;
                this.f69586b = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            Utils.m35043b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f69587c = typeArr2[0];
            this.f69586b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils.m35044c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f69587c;
            return type != null ? new Type[]{type} : Utils.f69581a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f69586b};
        }

        public int hashCode() {
            Type type = this.f69587c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f69586b.hashCode() + 31);
        }

        public String toString() {
            if (this.f69587c != null) {
                StringBuilder m24u = C0000a.m24u("? super ");
                m24u.append(Utils.m35057p(this.f69587c));
                return m24u.toString();
            }
            if (this.f69586b == Object.class) {
                return "?";
            }
            StringBuilder m24u2 = C0000a.m24u("? extends ");
            m24u2.append(Utils.m35057p(this.f69586b));
            return m24u2.toString();
        }
    }

    /* renamed from: a */
    public static ResponseBody m35042a(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.source().mo34531X0(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    /* renamed from: b */
    public static void m35043b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static boolean m35044c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m35044c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: d */
    public static Type m35045d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return m35045d(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m35045d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Type m35046e(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder m25v = C0000a.m25v("Index ", i2, " not in range [0,");
        m25v.append(actualTypeArguments.length);
        m25v.append(") for ");
        m25v.append(parameterizedType);
        throw new IllegalArgumentException(m25v.toString());
    }

    /* renamed from: f */
    public static Class<?> m35047f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m35047f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m35047f(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* renamed from: g */
    public static Type m35048g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m35055n(type, cls, m35045d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static boolean m35049h(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m35049h(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m35049h(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: i */
    public static boolean m35050i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static RuntimeException m35051j(Method method, String str, Object... objArr) {
        return m35052k(method, null, str, objArr);
    }

    /* renamed from: k */
    public static RuntimeException m35052k(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder m27x = C0000a.m27x(String.format(str, objArr), "\n    for method ");
        m27x.append(method.getDeclaringClass().getSimpleName());
        m27x.append(".");
        m27x.append(method.getName());
        return new IllegalArgumentException(m27x.toString(), th);
    }

    /* renamed from: l */
    public static RuntimeException m35053l(Method method, int i2, String str, Object... objArr) {
        StringBuilder m27x = C0000a.m27x(str, " (parameter #");
        m27x.append(i2 + 1);
        m27x.append(")");
        return m35051j(method, m27x.toString(), objArr);
    }

    /* renamed from: m */
    public static RuntimeException m35054m(Method method, Throwable th, int i2, String str, Object... objArr) {
        StringBuilder m27x = C0000a.m27x(str, " (parameter #");
        m27x.append(i2 + 1);
        m27x.append(")");
        return m35052k(method, th, m27x.toString(), objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[LOOP:0: B:1:0x0000->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m35055n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.Utils.m35055n(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: o */
    public static void m35056o(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: p */
    public static String m35057p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
