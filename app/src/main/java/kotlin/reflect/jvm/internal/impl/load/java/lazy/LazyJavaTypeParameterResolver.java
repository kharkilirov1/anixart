package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: resolvers.kt */
/* loaded from: classes3.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* renamed from: a */
    public final Map<JavaTypeParameter, Integer> f64482a;

    /* renamed from: b */
    public final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> f64483b;

    /* renamed from: c */
    public final LazyJavaResolverContext f64484c;

    /* renamed from: d */
    public final DeclarationDescriptor f64485d;

    /* renamed from: e */
    public final int f64486e;

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i2) {
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        this.f64484c = lazyJavaResolverContext;
        this.f64485d = containingDeclaration;
        this.f64486e = i2;
        List<JavaTypeParameter> receiver$0 = javaTypeParameterListOwner.getTypeParameters();
        Intrinsics.m32180i(receiver$0, "receiver$0");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = receiver$0.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i3));
            i3++;
        }
        this.f64482a = linkedHashMap;
        this.f64483b = this.f64484c.f64479c.f64446a.mo33627g(new Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public LazyJavaTypeParameterDescriptor invoke(JavaTypeParameter javaTypeParameter) {
                JavaTypeParameter typeParameter = javaTypeParameter;
                Intrinsics.m32180i(typeParameter, "typeParameter");
                Integer num = LazyJavaTypeParameterResolver.this.f64482a.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = LazyJavaTypeParameterResolver.this;
                LazyJavaResolverContext receiver$02 = lazyJavaTypeParameterResolver.f64484c;
                Intrinsics.m32180i(receiver$02, "receiver$0");
                LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(receiver$02.f64479c, lazyJavaTypeParameterResolver, receiver$02.f64481e);
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver2 = LazyJavaTypeParameterResolver.this;
                return new LazyJavaTypeParameterDescriptor(lazyJavaResolverContext2, typeParameter, lazyJavaTypeParameterResolver2.f64486e + intValue, lazyJavaTypeParameterResolver2.f64485d);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    /* renamed from: a */
    public TypeParameterDescriptor mo32725a(@NotNull JavaTypeParameter javaTypeParameter) {
        Intrinsics.m32180i(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor invoke = this.f64483b.invoke(javaTypeParameter);
        return invoke != null ? invoke : this.f64484c.f64480d.mo32725a(javaTypeParameter);
    }
}
