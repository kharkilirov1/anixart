package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import okhttp3.HttpUrl;
import p000a.C0000a;

/* renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C$Gson$Types {

    /* renamed from: a */
    public static final Type[] f23676a = new Type[0];

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        /* renamed from: b */
        public final Type f23677b;

        public GenericArrayTypeImpl(Type type) {
            this.f23677b = C$Gson$Types.m12855a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.m12858d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f23677b;
        }

        public int hashCode() {
            return this.f23677b.hashCode();
        }

        public String toString() {
            return C$Gson$Types.m12864j(this.f23677b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        /* renamed from: b */
        public final Type f23678b;

        /* renamed from: c */
        public final Type f23679c;

        /* renamed from: d */
        public final Type[] f23680d;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C$Gson$Preconditions.m12854a(z);
            }
            this.f23678b = type == null ? null : C$Gson$Types.m12855a(type);
            this.f23679c = C$Gson$Types.m12855a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f23680d = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                Objects.requireNonNull(this.f23680d[i2]);
                C$Gson$Types.m12856b(this.f23680d[i2]);
                Type[] typeArr3 = this.f23680d;
                typeArr3[i2] = C$Gson$Types.m12855a(typeArr3[i2]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.m12858d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f23680d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f23678b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f23679c;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f23680d) ^ this.f23679c.hashCode();
            Type type = this.f23678b;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f23680d.length;
            if (length == 0) {
                return C$Gson$Types.m12864j(this.f23679c);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.m12864j(this.f23679c));
            sb.append("<");
            sb.append(C$Gson$Types.m12864j(this.f23680d[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(C$Gson$Types.m12864j(this.f23680d[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {

        /* renamed from: b */
        public final Type f23681b;

        /* renamed from: c */
        public final Type f23682c;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            C$Gson$Preconditions.m12854a(typeArr2.length <= 1);
            C$Gson$Preconditions.m12854a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C$Gson$Types.m12856b(typeArr[0]);
                this.f23682c = null;
                this.f23681b = C$Gson$Types.m12855a(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            C$Gson$Types.m12856b(typeArr2[0]);
            C$Gson$Preconditions.m12854a(typeArr[0] == Object.class);
            this.f23682c = C$Gson$Types.m12855a(typeArr2[0]);
            this.f23681b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.m12858d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f23682c;
            return type != null ? new Type[]{type} : C$Gson$Types.f23676a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f23681b};
        }

        public int hashCode() {
            Type type = this.f23682c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f23681b.hashCode() + 31);
        }

        public String toString() {
            if (this.f23682c != null) {
                StringBuilder m24u = C0000a.m24u("? super ");
                m24u.append(C$Gson$Types.m12864j(this.f23682c));
                return m24u.toString();
            }
            if (this.f23681b == Object.class) {
                return "?";
            }
            StringBuilder m24u2 = C0000a.m24u("? extends ");
            m24u2.append(C$Gson$Types.m12864j(this.f23681b));
            return m24u2.toString();
        }
    }

    public C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static Type m12855a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(m12855a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: b */
    public static void m12856b(Type type) {
        C$Gson$Preconditions.m12854a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: c */
    public static boolean m12857c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static boolean m12858d(Type type, Type type2) {
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
            return m12857c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m12858d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: e */
    public static Type m12859e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m12859e(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return m12859e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    public static Class<?> m12860f(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C$Gson$Preconditions.m12854a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m12860f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m12860f(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: g */
    public static Type m12861g(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C$Gson$Preconditions.m12854a(cls2.isAssignableFrom(cls));
        return m12862h(type, cls, m12859e(type, cls, cls2));
    }

    /* renamed from: h */
    public static Type m12862h(Type type, Class<?> cls, Type type2) {
        return m12863i(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0142, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0144, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0147, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0142 A[EDGE_INSN: B:24:0x0142->B:25:0x0142 BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.gson.internal.$Gson$Types$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.gson.internal.$Gson$Types$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m12863i(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.m12863i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: j */
    public static String m12864j(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
