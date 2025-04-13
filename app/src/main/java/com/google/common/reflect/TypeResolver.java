package com.google.common.reflect;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Beta
/* loaded from: classes2.dex */
public final class TypeResolver {

    /* renamed from: a */
    public final TypeTable f21990a;

    public static final class TypeMappingIntrospector extends TypeVisitor {

        /* renamed from: b */
        public final Map<TypeVariableKey, Type> f21993b = new HashMap();

        /* renamed from: g */
        public static ImmutableMap<TypeVariableKey, Type> m12106g(Type type) {
            Objects.requireNonNull(type);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.m12120a(type);
            return ImmutableMap.m11649b(typeMappingIntrospector.f21993b);
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: b */
        public void mo12101b(Class<?> cls) {
            m12120a(cls.getGenericSuperclass());
            m12120a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: d */
        public void mo12103d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.m11191o(typeParameters.length == actualTypeArguments.length);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                TypeVariableKey typeVariableKey = new TypeVariableKey(typeParameters[i2]);
                Type type = actualTypeArguments[i2];
                if (!this.f21993b.containsKey(typeVariableKey)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            this.f21993b.put(typeVariableKey, type);
                            break;
                        }
                        boolean z = type2 instanceof TypeVariable;
                        TypeVariableKey typeVariableKey2 = null;
                        if (z ? typeVariableKey.m12108a((TypeVariable) type2) : false) {
                            while (type != null) {
                                type = this.f21993b.remove(type instanceof TypeVariable ? new TypeVariableKey((TypeVariable) type) : null);
                            }
                        } else {
                            Map<TypeVariableKey, Type> map = this.f21993b;
                            if (z) {
                                typeVariableKey2 = new TypeVariableKey((TypeVariable) type2);
                            }
                            type2 = map.get(typeVariableKey2);
                        }
                    }
                }
            }
            m12120a(cls);
            m12120a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: e */
        public void mo12104e(TypeVariable<?> typeVariable) {
            m12120a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: f */
        public void mo12105f(WildcardType wildcardType) {
            m12120a(wildcardType.getUpperBounds());
        }
    }

    public static final class TypeVariableKey {

        /* renamed from: a */
        public final TypeVariable<?> f21997a;

        public TypeVariableKey(TypeVariable<?> typeVariable) {
            Objects.requireNonNull(typeVariable);
            this.f21997a = typeVariable;
        }

        /* renamed from: a */
        public final boolean m12108a(TypeVariable<?> typeVariable) {
            return this.f21997a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f21997a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof TypeVariableKey) {
                return m12108a(((TypeVariableKey) obj).f21997a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f21997a.getGenericDeclaration(), this.f21997a.getName()});
        }

        public String toString() {
            return this.f21997a.toString();
        }
    }

    public static class WildcardCapturer {

        /* renamed from: b */
        public static final WildcardCapturer f21998b = new WildcardCapturer();

        /* renamed from: a */
        public final AtomicInteger f21999a = new AtomicInteger();

        /* renamed from: com.google.common.reflect.TypeResolver$WildcardCapturer$1 */
        class C19241 extends WildcardCapturer {
        }
    }

    public TypeResolver() {
        this.f21990a = new TypeTable();
    }

    /* renamed from: a */
    public static void m12097a(final Map map, Type type, final Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: b */
            public void mo12101b(Class<?> cls) {
                if (type2 instanceof WildcardType) {
                    return;
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(type2);
                throw new IllegalArgumentException(C1008a.m6437d(valueOf2.length() + valueOf.length() + 25, "No type mapping from ", valueOf, " to ", valueOf2));
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: c */
            public void mo12102c(GenericArrayType genericArrayType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                Type m12124d = Types.m12124d(type3);
                Preconditions.m11184h(m12124d != null, "%s is not an array type.", type2);
                TypeResolver.m12097a(map, genericArrayType.getGenericComponentType(), m12124d);
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: d */
            public void mo12103d(ParameterizedType parameterizedType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                try {
                    ParameterizedType parameterizedType2 = (ParameterizedType) ParameterizedType.class.cast(type3);
                    if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                        TypeResolver.m12097a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                    }
                    Preconditions.m11185i(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                    Preconditions.m11185i(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        TypeResolver.m12097a(map, actualTypeArguments[i2], actualTypeArguments2[i2]);
                    }
                } catch (ClassCastException unused) {
                    String valueOf = String.valueOf(type3);
                    String simpleName = ParameterizedType.class.getSimpleName();
                    throw new IllegalArgumentException(C0576a.m4115n(simpleName.length() + valueOf.length() + 10, valueOf, " is not a ", simpleName));
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: e */
            public void mo12104e(TypeVariable<?> typeVariable) {
                map.put(new TypeVariableKey(typeVariable), type2);
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: f */
            public void mo12105f(WildcardType wildcardType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    WildcardType wildcardType2 = (WildcardType) type3;
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Type[] upperBounds2 = wildcardType2.getUpperBounds();
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                    Preconditions.m11185i(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                    for (int i2 = 0; i2 < upperBounds.length; i2++) {
                        TypeResolver.m12097a(map, upperBounds[i2], upperBounds2[i2]);
                    }
                    for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                        TypeResolver.m12097a(map, lowerBounds[i3], lowerBounds2[i3]);
                    }
                }
            }
        }.m12120a(type);
    }

    /* renamed from: b */
    public Type m12098b(Type type) {
        Objects.requireNonNull(type);
        if (type instanceof TypeVariable) {
            final TypeTable typeTable = this.f21990a;
            final TypeVariable<?> typeVariable = (TypeVariable) type;
            Objects.requireNonNull(typeTable);
            return typeTable.mo12107a(typeVariable, new TypeTable() { // from class: com.google.common.reflect.TypeResolver.TypeTable.1
                @Override // com.google.common.reflect.TypeResolver.TypeTable
                /* renamed from: a */
                public Type mo12107a(TypeVariable<?> typeVariable2, TypeTable typeTable2) {
                    return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : typeTable.mo12107a(typeVariable2, typeTable2);
                }
            });
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            return Types.m12127g(ownerType == null ? null : m12098b(ownerType), (Class) m12098b(parameterizedType.getRawType()), m12099c(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return Types.m12125e(m12098b(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new Types.WildcardTypeImpl(m12099c(wildcardType.getLowerBounds()), m12099c(wildcardType.getUpperBounds()));
    }

    /* renamed from: c */
    public final Type[] m12099c(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr2[i2] = m12098b(typeArr[i2]);
        }
        return typeArr2;
    }

    /* renamed from: d */
    public TypeResolver m12100d(Map<TypeVariableKey, ? extends Type> map) {
        TypeTable typeTable = this.f21990a;
        Objects.requireNonNull(typeTable);
        ImmutableMap.Builder m11648a = ImmutableMap.m11648a();
        m11648a.mo11617f(typeTable.f21994a);
        for (Map.Entry<TypeVariableKey, ? extends Type> entry : map.entrySet()) {
            TypeVariableKey key = entry.getKey();
            Type value = entry.getValue();
            Objects.requireNonNull(key);
            Preconditions.m11184h(!(value instanceof TypeVariable ? key.m12108a((TypeVariable) value) : false), "Type variable %s bound to itself", key);
            m11648a.mo11614c(key, value);
        }
        return new TypeResolver(new TypeTable(m11648a.mo11613a()));
    }

    public static class TypeTable {

        /* renamed from: a */
        public final ImmutableMap<TypeVariableKey, Type> f21994a;

        public TypeTable() {
            this.f21994a = ImmutableMap.m11650l();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
        /* renamed from: a */
        public Type mo12107a(TypeVariable<?> typeVariable, TypeTable typeTable) {
            Type type = this.f21994a.get(new TypeVariableKey(typeVariable));
            if (type != null) {
                return new TypeResolver(typeTable, null).m12098b(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] m12099c = new TypeResolver(typeTable, null).m12099c(bounds);
            return (Types.NativeTypeVariableEquals.f22031a && Arrays.equals(bounds, m12099c)) ? typeVariable : Types.m12126f(typeVariable.getGenericDeclaration(), typeVariable.getName(), m12099c);
        }

        public TypeTable(ImmutableMap<TypeVariableKey, Type> immutableMap) {
            this.f21994a = immutableMap;
        }
    }

    public TypeResolver(TypeTable typeTable) {
        this.f21990a = typeTable;
    }

    public TypeResolver(TypeTable typeTable, C19221 c19221) {
        this.f21990a = typeTable;
    }
}
