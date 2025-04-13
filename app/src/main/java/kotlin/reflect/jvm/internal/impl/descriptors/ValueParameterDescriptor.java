package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ValueParameterDescriptor.kt */
/* loaded from: classes3.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    /* compiled from: ValueParameterDescriptor.kt */
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: A0 */
    ValueParameterDescriptor mo32568A0(@NotNull CallableDescriptor callableDescriptor, @NotNull Name name, int i2);

    /* renamed from: W */
    boolean mo32569W();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    ValueParameterDescriptor mo32487a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: b */
    CallableDescriptor mo32437b();

    /* renamed from: b0 */
    boolean mo32570b0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    Collection<ValueParameterDescriptor> mo32488e();

    /* renamed from: h */
    int mo32571h();

    @Nullable
    /* renamed from: j0 */
    KotlinType mo32572j0();

    /* renamed from: q0 */
    boolean mo32573q0();
}
