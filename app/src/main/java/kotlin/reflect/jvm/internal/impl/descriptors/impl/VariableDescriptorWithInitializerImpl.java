package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {

    /* renamed from: f */
    public final boolean f64269f;

    /* renamed from: g */
    public NullableLazyValue<ConstantValue<?>> f64270g;

    public VariableDescriptorWithInitializerImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Name name, @Nullable KotlinType kotlinType, boolean z, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, null, sourceElement);
        this.f64269f = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* renamed from: V */
    public ConstantValue<?> mo32574V() {
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.f64270g;
        if (nullableLazyValue != null) {
            return nullableLazyValue.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: i0 */
    public boolean mo32575i0() {
        return this.f64269f;
    }
}
