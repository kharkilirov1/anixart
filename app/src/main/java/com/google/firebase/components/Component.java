package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Component<T> {

    /* renamed from: a */
    public final Set<Class<? super T>> f22469a;

    /* renamed from: b */
    public final Set<Dependency> f22470b;

    /* renamed from: c */
    public final int f22471c;

    /* renamed from: d */
    public final int f22472d;

    /* renamed from: e */
    public final ComponentFactory<T> f22473e;

    /* renamed from: f */
    public final Set<Class<?>> f22474f;

    public static class Builder<T> {

        /* renamed from: a */
        public final Set<Class<? super T>> f22475a;

        /* renamed from: b */
        public final Set<Dependency> f22476b;

        /* renamed from: c */
        public int f22477c;

        /* renamed from: d */
        public int f22478d;

        /* renamed from: e */
        public ComponentFactory<T> f22479e;

        /* renamed from: f */
        public Set<Class<?>> f22480f;

        public Builder(Class cls, Class[] clsArr, C20551 c20551) {
            HashSet hashSet = new HashSet();
            this.f22475a = hashSet;
            this.f22476b = new HashSet();
            this.f22477c = 0;
            this.f22478d = 0;
            this.f22480f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f22475a, clsArr);
        }

        /* renamed from: a */
        public Builder<T> m12333a(Dependency dependency) {
            if (!(!this.f22475a.contains(dependency.f22499a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f22476b.add(dependency);
            return this;
        }

        /* renamed from: b */
        public Component<T> m12334b() {
            if (this.f22479e != null) {
                return new Component<>(new HashSet(this.f22475a), new HashSet(this.f22476b), this.f22477c, this.f22478d, this.f22479e, this.f22480f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: c */
        public Builder<T> m12335c(ComponentFactory<T> componentFactory) {
            this.f22479e = componentFactory;
            return this;
        }

        /* renamed from: d */
        public final Builder<T> m12336d(int i2) {
            if (!(this.f22477c == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f22477c = i2;
            return this;
        }
    }

    public Component(Set set, Set set2, int i2, int i3, ComponentFactory componentFactory, Set set3, C20551 c20551) {
        this.f22469a = Collections.unmodifiableSet(set);
        this.f22470b = Collections.unmodifiableSet(set2);
        this.f22471c = i2;
        this.f22472d = i3;
        this.f22473e = componentFactory;
        this.f22474f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> Builder<T> m12328a(Class<T> cls) {
        return new Builder<>(cls, new Class[0], null);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> Builder<T> m12329b(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr, null);
    }

    /* renamed from: c */
    public static <T> Component<T> m12330c(T t, Class<T> cls) {
        Builder m12328a = m12328a(cls);
        m12328a.f22478d = 1;
        m12328a.f22479e = new C2060a(t, 0);
        return m12328a.m12334b();
    }

    @SafeVarargs
    /* renamed from: e */
    public static <T> Component<T> m12331e(T t, Class<T> cls, Class<? super T>... clsArr) {
        Builder m12329b = m12329b(cls, clsArr);
        m12329b.f22479e = new C2060a(t, 1);
        return m12329b.m12334b();
    }

    /* renamed from: d */
    public boolean m12332d() {
        return this.f22472d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f22469a.toArray()) + ">{" + this.f22471c + ", type=" + this.f22472d + ", deps=" + Arrays.toString(this.f22470b.toArray()) + "}";
    }
}
