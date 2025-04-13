package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes3.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: j */
    @NotNull
    public final LazyJavaAnnotations f64611j;

    /* renamed from: k */
    public final LazyJavaResolverContext f64612k;

    /* renamed from: l */
    @NotNull
    public final JavaTypeParameter f64613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaTypeParameter javaTypeParameter, int i2, @NotNull DeclarationDescriptor containingDeclaration) {
        super(lazyJavaResolverContext.f64479c.f64446a, containingDeclaration, javaTypeParameter.getName(), Variance.INVARIANT, false, i2, SourceElement.f63979a, lazyJavaResolverContext.f64479c.f64458m);
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        this.f64612k = lazyJavaResolverContext;
        this.f64613l = javaTypeParameter;
        this.f64611j = new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: G */
    public void mo32604G(@NotNull KotlinType type) {
        Intrinsics.m32180i(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* renamed from: O */
    public List<KotlinType> mo32605O() {
        Collection<JavaClassifierType> upperBounds = this.f64613l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType m32397e = this.f64612k.f64479c.f64460o.mo32547n().m32397e();
            Intrinsics.m32175d(m32397e, "c.module.builtIns.anyType");
            SimpleType m32408r = this.f64612k.f64479c.f64460o.mo32547n().m32408r();
            Intrinsics.m32175d(m32408r, "c.module.builtIns.nullableAnyType");
            return CollectionsKt.m31993F(KotlinTypeFactory.m33663a(m32397e, m32408r));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f64612k.f64478b.m32777d((JavaClassifierType) it.next(), JavaTypeResolverKt.m32782c(TypeUsage.COMMON, false, this, 1)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f64611j;
    }
}
