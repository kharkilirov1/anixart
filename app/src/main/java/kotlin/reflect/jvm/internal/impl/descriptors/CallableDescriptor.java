package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface CallableDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility, Substitutable<CallableDescriptor> {

    public interface UserDataKey<V> {
    }

    /* renamed from: B */
    boolean mo32486B();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    CallableDescriptor mo32487a();

    @NotNull
    /* renamed from: e */
    Collection<? extends CallableDescriptor> mo32488e();

    @NotNull
    /* renamed from: f */
    List<ValueParameterDescriptor> mo32489f();

    @Nullable
    /* renamed from: f0 */
    ReceiverParameterDescriptor mo32490f0();

    @Nullable
    KotlinType getReturnType();

    @NotNull
    List<TypeParameterDescriptor> getTypeParameters();

    @Nullable
    /* renamed from: h0 */
    <V> V mo32491h0(UserDataKey<V> userDataKey);

    @Nullable
    /* renamed from: k0 */
    ReceiverParameterDescriptor mo32492k0();
}
