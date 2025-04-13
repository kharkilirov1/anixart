package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    /* renamed from: D0 */
    boolean mo32430D0();

    @NotNull
    /* renamed from: F */
    Collection<ClassDescriptor> mo32431F();

    @NotNull
    /* renamed from: F0 */
    ReceiverParameterDescriptor mo32504F0();

    @Nullable
    /* renamed from: P */
    ClassConstructorDescriptor mo32434P();

    @NotNull
    /* renamed from: Q */
    MemberScope mo32435Q();

    @Nullable
    /* renamed from: S */
    ClassDescriptor mo32436S();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    ClassDescriptor mo32487a();

    @NotNull
    /* renamed from: a0 */
    MemberScope mo32505a0(@NotNull TypeSubstitution typeSubstitution);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    DeclarationDescriptor mo32437b();

    @NotNull
    /* renamed from: g */
    ClassKind mo32438g();

    @NotNull
    Visibility getVisibility();

    boolean isInline();

    @NotNull
    /* renamed from: k */
    Modality mo32441k();

    @NotNull
    /* renamed from: l */
    Collection<ClassConstructorDescriptor> mo32442l();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* renamed from: r */
    SimpleType mo32502r();

    @NotNull
    /* renamed from: t */
    List<TypeParameterDescriptor> mo32443t();

    @NotNull
    /* renamed from: u0 */
    MemberScope mo32506u0();

    @NotNull
    /* renamed from: x0 */
    MemberScope mo32445x0();

    /* renamed from: y */
    boolean mo32446y();
}
