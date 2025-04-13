package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeResolver;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes2.dex */
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {

    /* renamed from: b */
    public final Type f22000b;

    /* renamed from: c */
    @NullableDecl
    public transient TypeResolver f22001c;

    /* renamed from: d */
    @NullableDecl
    public transient TypeResolver f22002d;

    /* renamed from: com.google.common.reflect.TypeToken$1 */
    class C19251 extends Invokable.MethodInvokable<Object> {
        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        /* renamed from: a */
        public TypeToken<Object> mo12095a() {
            return null;
        }

        @Override // com.google.common.reflect.Element
        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$2 */
    class C19262 extends Invokable.ConstructorInvokable<Object> {
        @Override // com.google.common.reflect.Invokable, com.google.common.reflect.Element
        /* renamed from: a */
        public TypeToken<Object> mo12095a() {
            return null;
        }

        @Override // com.google.common.reflect.Element
        public String toString() {
            new Joiner(", ");
            throw null;
        }
    }

    /* renamed from: com.google.common.reflect.TypeToken$3 */
    class C19273 extends TypeVisitor {
        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: c */
        public void mo12102c(GenericArrayType genericArrayType) {
            m12120a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: d */
        public void mo12103d(ParameterizedType parameterizedType) {
            m12120a(parameterizedType.getActualTypeArguments());
            m12120a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: e */
        public void mo12104e(TypeVariable<?> typeVariable) {
            throw null;
        }

        @Override // com.google.common.reflect.TypeVisitor
        /* renamed from: f */
        public void mo12105f(WildcardType wildcardType) {
            m12120a(wildcardType.getLowerBounds());
            m12120a(wildcardType.getUpperBounds());
        }
    }

    public static class Bounds {
    }

    public final class ClassSet extends TypeToken<T>.TypeSet {

        /* renamed from: d */
        @NullableDecl
        public transient ImmutableSet<TypeToken<? super T>> f22004d;

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: K */
        public Set<TypeToken<? super T>> mo11329H() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f22004d;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable m11553b = FluentIterable.m11553b(new TypeCollector.ForwardingTypeCollector<Object>(TypeCollector.f22006a) { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.reflect.TypeToken.TypeCollector
                /* renamed from: b */
                public ImmutableList<Object> mo12116b(Iterable<Object> iterable) {
                    UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    for (Object obj : iterable) {
                        if (!mo12118d(obj).isInterface()) {
                            builder.m11640d(obj);
                        }
                    }
                    return super.mo12116b(builder.m11641e());
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
                /* renamed from: c */
                public Iterable<Object> mo12117c(Object obj) {
                    return ImmutableSet.m11671C();
                }
            }.mo12116b(ImmutableList.m11628E(null)));
            ImmutableSet<TypeToken<? super T>> m11556e = FluentIterable.m11553b(Iterables.m11698c(m11553b.m11555d(), TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD)).m11556e();
            this.f22004d = m11556e;
            return m11556e;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        /* renamed from: M */
        public Set<Class<? super T>> mo12114M() {
            throw null;
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {

        /* renamed from: d */
        @NullableDecl
        public transient ImmutableSet<TypeToken<? super T>> f22005d;

        /* renamed from: com.google.common.reflect.TypeToken$InterfaceSet$1 */
        public class C19291 implements Predicate<Class<?>> {
            @Override // com.google.common.base.Predicate
            public boolean apply(Class<?> cls) {
                return cls.isInterface();
            }
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: K */
        public Set<TypeToken<? super T>> mo11329H() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f22005d;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable m11553b = FluentIterable.m11553b(null);
            ImmutableSet<TypeToken<? super T>> m11556e = FluentIterable.m11553b(Iterables.m11698c(m11553b.m11555d(), TypeFilter.INTERFACE_ONLY)).m11556e();
            this.f22005d = m11556e;
            return m11556e;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        /* renamed from: M */
        public Set<Class<? super T>> mo12114M() {
            throw null;
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        public SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    public static abstract class TypeCollector<K> {

        /* renamed from: a */
        public static final TypeCollector<TypeToken<?>> f22006a = new TypeCollector<TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: c */
            public Iterable<? extends TypeToken<?>> mo12117c(TypeToken<?> typeToken) {
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f22000b;
                if (type instanceof TypeVariable) {
                    return typeToken2.m12110b(((TypeVariable) type).getBounds());
                }
                if (type instanceof WildcardType) {
                    return typeToken2.m12110b(((WildcardType) type).getUpperBounds());
                }
                UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (Type type2 : typeToken2.m12111c().getGenericInterfaces()) {
                    builder.m11640d(typeToken2.m12113f(type2));
                }
                return builder.m11641e();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: d */
            public Class mo12118d(TypeToken<?> typeToken) {
                return typeToken.m12111c();
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @NullableDecl
            /* renamed from: e */
            public TypeToken<?> mo12119e(TypeToken<?> typeToken) {
                SimpleTypeToken simpleTypeToken;
                TypeToken<?> typeToken2 = typeToken;
                Type type = typeToken2.f22000b;
                if (type instanceof TypeVariable) {
                    simpleTypeToken = new SimpleTypeToken(((TypeVariable) type).getBounds()[0]);
                    if (simpleTypeToken.m12111c().isInterface()) {
                        return null;
                    }
                } else {
                    if (!(type instanceof WildcardType)) {
                        Type genericSuperclass = typeToken2.m12111c().getGenericSuperclass();
                        if (genericSuperclass == null) {
                            return null;
                        }
                        return typeToken2.m12113f(genericSuperclass);
                    }
                    simpleTypeToken = new SimpleTypeToken(((WildcardType) type).getUpperBounds()[0]);
                    if (simpleTypeToken.m12111c().isInterface()) {
                        return null;
                    }
                }
                return simpleTypeToken;
            }
        };

        /* renamed from: b */
        public static final TypeCollector<Class<?>> f22007b = new TypeCollector<Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: c */
            public Iterable<? extends Class<?>> mo12117c(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: d */
            public Class mo12118d(Class<?> cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            @NullableDecl
            /* renamed from: e */
            public Class<?> mo12119e(Class<?> cls) {
                return cls.getSuperclass();
            }
        };

        public static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* renamed from: c */
            public final TypeCollector<K> f22010c;

            public ForwardingTypeCollector(TypeCollector<K> typeCollector) {
                super(null);
                this.f22010c = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: c */
            public Iterable<? extends K> mo12117c(K k2) {
                return this.f22010c.mo12117c(k2);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: d */
            public Class<?> mo12118d(K k2) {
                return this.f22010c.mo12118d(k2);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* renamed from: e */
            public K mo12119e(K k2) {
                return this.f22010c.mo12119e(k2);
            }
        }

        public TypeCollector() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: a */
        public final int m12115a(K k2, Map<? super K, Integer> map) {
            Integer num = map.get(k2);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = mo12118d(k2).isInterface();
            Iterator<? extends K> it = mo12117c(k2).iterator();
            int i2 = isInterface;
            while (it.hasNext()) {
                i2 = Math.max(i2, m12115a(it.next(), map));
            }
            K mo12119e = mo12119e(k2);
            int i3 = i2;
            if (mo12119e != null) {
                i3 = Math.max(i2, m12115a(mo12119e, map));
            }
            int i4 = i3 + 1;
            map.put(k2, Integer.valueOf(i4));
            return i4;
        }

        /* renamed from: b */
        public ImmutableList<K> mo12116b(Iterable<? extends K> iterable) {
            final HashMap hashMap = new HashMap();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                m12115a(it.next(), hashMap);
            }
            final Ordering mo11416h = Ordering.m11855d().mo11416h();
            return ImmutableList.m11630H(new Ordering<Object>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    return mo11416h.compare(hashMap.get(obj), hashMap.get(obj2));
                }
            }, hashMap.keySet());
        }

        /* renamed from: c */
        public abstract Iterable<? extends K> mo12117c(K k2);

        /* renamed from: d */
        public abstract Class<?> mo12118d(K k2);

        @NullableDecl
        /* renamed from: e */
        public abstract K mo12119e(K k2);

        public TypeCollector(C19251 c19251) {
        }
    }

    public enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                Type type = typeToken.f22000b;
                return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.m12111c().isInterface();
            }
        };

        TypeFilter(C19251 c19251) {
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

        /* renamed from: b */
        @NullableDecl
        public transient ImmutableSet<TypeToken<? super T>> f22014b;

        public TypeSet() {
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: K */
        public Set<TypeToken<? super T>> mo11329H() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f22014b;
            if (immutableSet != null) {
                return immutableSet;
            }
            FluentIterable m11553b = FluentIterable.m11553b(TypeCollector.f22006a.mo12116b(ImmutableList.m11628E(TypeToken.this)));
            ImmutableSet<TypeToken<? super T>> m11556e = FluentIterable.m11553b(Iterables.m11698c(m11553b.m11555d(), TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD)).m11556e();
            this.f22014b = m11556e;
            return m11556e;
        }

        /* renamed from: M */
        public Set<Class<? super T>> mo12114M() {
            return ImmutableSet.m11676x(TypeCollector.f22007b.mo12116b(TypeToken.this.m12112d()));
        }
    }

    public TypeToken() {
        Type m12096a = m12096a();
        this.f22000b = m12096a;
        Preconditions.m11194r(!(m12096a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", m12096a);
    }

    /* renamed from: e */
    public static <T> TypeToken<T> m12109e(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    /* renamed from: b */
    public final ImmutableList<TypeToken<? super T>> m12110b(Type[] typeArr) {
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (Type type : typeArr) {
            SimpleTypeToken simpleTypeToken = new SimpleTypeToken(type);
            if (simpleTypeToken.m12111c().isInterface()) {
                builder.m11640d(simpleTypeToken);
            }
        }
        return builder.m11641e();
    }

    /* renamed from: c */
    public final Class<? super T> m12111c() {
        return m12112d().iterator().next();
    }

    /* renamed from: d */
    public final ImmutableSet<Class<? super T>> m12112d() {
        int i2 = ImmutableSet.f21087d;
        final ImmutableSet.Builder builder = new ImmutableSet.Builder();
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.4
            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: b */
            public void mo12101b(Class<?> cls) {
                ImmutableSet.Builder.this.mo11678d(cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: c */
            public void mo12102c(GenericArrayType genericArrayType) {
                ImmutableSet.Builder builder2 = ImmutableSet.Builder.this;
                Class<? super T> m12111c = new SimpleTypeToken(genericArrayType.getGenericComponentType()).m12111c();
                Function<Type, String> function = Types.f22017a;
                builder2.mo11678d(Array.newInstance(m12111c, 0).getClass());
            }

            @Override // com.google.common.reflect.TypeVisitor
            /* renamed from: d */
            public void mo12103d(ParameterizedType parameterizedType) {
                ImmutableSet.Builder.this.mo11678d((Class) parameterizedType.getRawType());
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
        }.m12120a(this.f22000b);
        return builder.mo11680f();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof TypeToken) {
            return this.f22000b.equals(((TypeToken) obj).f22000b);
        }
        return false;
    }

    /* renamed from: f */
    public final TypeToken<?> m12113f(Type type) {
        TypeResolver typeResolver = this.f22002d;
        if (typeResolver == null) {
            typeResolver = new TypeResolver().m12100d(TypeResolver.TypeMappingIntrospector.m12106g(this.f22000b));
            this.f22002d = typeResolver;
        }
        SimpleTypeToken simpleTypeToken = new SimpleTypeToken(typeResolver.m12098b(type));
        simpleTypeToken.f22002d = this.f22002d;
        simpleTypeToken.f22001c = this.f22001c;
        return simpleTypeToken;
    }

    public int hashCode() {
        return this.f22000b.hashCode();
    }

    public String toString() {
        return Types.m12128h(this.f22000b);
    }

    public TypeToken(Type type, C19251 c19251) {
        Objects.requireNonNull(type);
        this.f22000b = type;
    }
}
