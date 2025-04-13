package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements Function1<Name, ClassDescriptorBase> {

    /* renamed from: b */
    public final /* synthetic */ LazyJavaClassMemberScope f64547b;

    /* renamed from: c */
    public final /* synthetic */ LazyJavaResolverContext f64548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.f64547b = lazyJavaClassMemberScope;
        this.f64548c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public ClassDescriptorBase invoke(Name name) {
        Name name2 = name;
        Intrinsics.m32180i(name2, "name");
        if (!this.f64547b.f64533l.invoke().contains(name2)) {
            JavaField javaField = this.f64547b.f64534m.invoke().get(name2);
            if (javaField == null) {
                return null;
            }
            NotNullLazyValue mo33623c = this.f64548c.f64479c.f64446a.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Set<? extends Name> invoke() {
                    return SetsKt.m32077d(LazyJavaClassMemberScope$nestedClasses$1.this.f64547b.mo32615b(), LazyJavaClassMemberScope$nestedClasses$1.this.f64547b.mo32618f());
                }
            });
            LazyJavaResolverContext lazyJavaResolverContext = this.f64548c;
            return EnumEntrySyntheticClassDescriptor.m32613D(lazyJavaResolverContext.f64479c.f64446a, this.f64547b.f64536o, name2, mo33623c, LazyJavaAnnotationsKt.m32722a(lazyJavaResolverContext, javaField), this.f64548c.f64479c.f64455j.mo32360a(javaField));
        }
        JavaClassFinder javaClassFinder = this.f64548c.f64479c.f64447b;
        ClassId m33535h = DescriptorUtilsKt.m33535h(this.f64547b.f64536o);
        if (m33535h == null) {
            Intrinsics.m32188q();
            throw null;
        }
        JavaClass mo32344a = javaClassFinder.mo32344a(m33535h.m33191c(name2));
        if (mo32344a == null) {
            return null;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f64548c, this.f64547b.f64536o, mo32344a, null);
        this.f64548c.f64479c.f64464s.mo32678a(lazyJavaClassDescriptor);
        return lazyJavaClassDescriptor;
    }
}
