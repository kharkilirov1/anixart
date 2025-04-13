package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: LazyJavaClassMemberScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1, lazyJavaClassMemberScope);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* renamed from: getName */
    public final String getF63590i() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(LazyJavaClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // kotlin.jvm.functions.Function1
    public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
        Name p1 = name;
        Intrinsics.m32180i(p1, "p1");
        return LazyJavaClassMemberScope.m32736u((LazyJavaClassMemberScope) this.receiver, p1);
    }
}
