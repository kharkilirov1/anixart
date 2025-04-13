package com.google.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class TypeVisitor {

    /* renamed from: a */
    public final Set<Type> f22016a = new HashSet();

    /* renamed from: a */
    public final void m12120a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f22016a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo12104e((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo12105f((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo12103d((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo12101b((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            String valueOf = String.valueOf(type);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
                            sb.append("Unknown type: ");
                            sb.append(valueOf);
                            throw new AssertionError(sb.toString());
                        }
                        mo12102c((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f22016a.remove(type);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo12101b(Class<?> cls) {
    }

    /* renamed from: c */
    public void mo12102c(GenericArrayType genericArrayType) {
    }

    /* renamed from: d */
    public void mo12103d(ParameterizedType parameterizedType) {
    }

    /* renamed from: e */
    public void mo12104e(TypeVariable<?> typeVariable) {
    }

    /* renamed from: f */
    public void mo12105f(WildcardType wildcardType) {
    }
}
