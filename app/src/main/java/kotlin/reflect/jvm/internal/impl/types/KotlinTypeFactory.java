package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: KotlinTypeFactory.kt */
/* loaded from: classes3.dex */
public final class KotlinTypeFactory {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final UnwrappedType m33663a(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        Intrinsics.m32180i(lowerBound, "lowerBound");
        Intrinsics.m32180i(upperBound, "upperBound");
        return Intrinsics.m32174c(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @JvmStatic
    @NotNull
    /* renamed from: b */
    public static final SimpleType m33664b(@NotNull Annotations annotations, @NotNull ClassDescriptor descriptor, @NotNull List<? extends TypeProjection> arguments) {
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(descriptor, "descriptor");
        Intrinsics.m32180i(arguments, "arguments");
        TypeConstructor mo32440j = descriptor.mo32440j();
        Intrinsics.m32175d(mo32440j, "descriptor.typeConstructor");
        return m33665c(annotations, mo32440j, arguments, false);
    }

    @JvmStatic
    @NotNull
    /* renamed from: c */
    public static final SimpleType m33665c(@NotNull Annotations annotations, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z) {
        MemberScope m33651b;
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(arguments, "arguments");
        if (annotations.isEmpty() && arguments.isEmpty() && !z && constructor.mo32449b() != null) {
            ClassifierDescriptor mo32449b = constructor.mo32449b();
            if (mo32449b == null) {
                Intrinsics.m32188q();
                throw null;
            }
            Intrinsics.m32175d(mo32449b, "constructor.declarationDescriptor!!");
            SimpleType mo32502r = mo32449b.mo32502r();
            Intrinsics.m32175d(mo32502r, "constructor.declarationDescriptor!!.defaultType");
            return mo32502r;
        }
        ClassifierDescriptor mo32449b2 = constructor.mo32449b();
        if (mo32449b2 instanceof TypeParameterDescriptor) {
            m33651b = mo32449b2.mo32502r().mo32791p();
        } else if (mo32449b2 instanceof ClassDescriptor) {
            if (arguments.isEmpty()) {
                m33651b = ((ClassDescriptor) mo32449b2).mo32502r().mo32791p();
            } else {
                m33651b = ((ClassDescriptor) mo32449b2).mo32505a0(TypeConstructorSubstitution.f66342b.m33677b(constructor, arguments));
                Intrinsics.m32175d(m33651b, "descriptor.getMemberScop…(constructor, arguments))");
            }
        } else {
            if (!(mo32449b2 instanceof TypeAliasDescriptor)) {
                throw new IllegalStateException("Unsupported classifier: " + mo32449b2 + " for constructor: " + constructor);
            }
            StringBuilder m24u = C0000a.m24u("Scope for abbreviation: ");
            m24u.append(((TypeAliasDescriptor) mo32449b2).getName());
            m33651b = ErrorUtils.m33651b(m24u.toString(), true);
        }
        return m33666d(annotations, constructor, arguments, z, m33651b);
    }

    @JvmStatic
    @NotNull
    /* renamed from: d */
    public static final SimpleType m33666d(@NotNull Annotations annotations, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z, @NotNull MemberScope memberScope) {
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(constructor, "constructor");
        Intrinsics.m32180i(arguments, "arguments");
        Intrinsics.m32180i(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z, memberScope);
        return annotations.isEmpty() ? simpleTypeImpl : new AnnotatedSimpleType(simpleTypeImpl, annotations);
    }
}
