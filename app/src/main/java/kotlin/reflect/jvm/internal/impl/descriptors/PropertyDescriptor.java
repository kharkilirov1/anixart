package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    PropertyDescriptor mo32487a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: c */
    PropertyDescriptor mo32503c(@NotNull TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    Collection<? extends PropertyDescriptor> mo32488e();

    @Nullable
    PropertyGetterDescriptor getGetter();

    @Nullable
    PropertySetterDescriptor getSetter();

    @Nullable
    /* renamed from: l0 */
    FieldDescriptor mo32559l0();

    @Nullable
    /* renamed from: o0 */
    FieldDescriptor mo32560o0();

    @NotNull
    /* renamed from: v */
    List<PropertyAccessorDescriptor> mo32561v();
}
