package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        @Nullable
        /* renamed from: A */
        D mo32527A();

        @NotNull
        /* renamed from: a */
        CopyBuilder<D> mo32528a(@NotNull List<ValueParameterDescriptor> list);

        @NotNull
        /* renamed from: b */
        CopyBuilder<D> mo32529b(@NotNull Visibility visibility);

        @NotNull
        /* renamed from: c */
        CopyBuilder<D> mo32530c(@NotNull Modality modality);

        @NotNull
        /* renamed from: d */
        CopyBuilder<D> mo32531d(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @NotNull
        /* renamed from: e */
        CopyBuilder<D> mo32532e();

        @NotNull
        /* renamed from: f */
        CopyBuilder<D> mo32533f(@NotNull KotlinType kotlinType);

        @NotNull
        /* renamed from: g */
        CopyBuilder<D> mo32534g();

        @NotNull
        /* renamed from: h */
        CopyBuilder<D> mo32535h(boolean z);

        @NotNull
        /* renamed from: i */
        CopyBuilder<D> mo32536i(@NotNull TypeSubstitution typeSubstitution);

        @NotNull
        /* renamed from: j */
        CopyBuilder<D> mo32537j(@NotNull List<TypeParameterDescriptor> list);

        @NotNull
        /* renamed from: k */
        CopyBuilder<D> mo32538k(@NotNull DeclarationDescriptor declarationDescriptor);

        @NotNull
        /* renamed from: l */
        CopyBuilder<D> mo32539l();

        @NotNull
        /* renamed from: m */
        CopyBuilder<D> mo32540m(@NotNull CallableMemberDescriptor.Kind kind);

        @NotNull
        /* renamed from: n */
        CopyBuilder<D> mo32541n(@NotNull Annotations annotations);

        @NotNull
        /* renamed from: o */
        CopyBuilder<D> mo32542o(@NotNull Name name);

        @NotNull
        /* renamed from: p */
        CopyBuilder<D> mo32543p();
    }

    /* renamed from: B0 */
    boolean mo32521B0();

    /* renamed from: M */
    boolean mo32458M();

    /* renamed from: N */
    boolean mo32522N();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    FunctionDescriptor mo32487a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    DeclarationDescriptor mo32437b();

    @Nullable
    /* renamed from: c */
    FunctionDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor);

    @Nullable
    /* renamed from: d0 */
    FunctionDescriptor mo32523d0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    Collection<? extends FunctionDescriptor> mo32488e();

    boolean isInline();

    boolean isSuspend();

    @NotNull
    /* renamed from: s */
    CopyBuilder<? extends FunctionDescriptor> mo32524s();

    /* renamed from: s0 */
    boolean mo32525s0();

    /* renamed from: w0 */
    boolean mo32526w0();
}
