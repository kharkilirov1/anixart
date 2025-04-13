package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    /* renamed from: H */
    <R, D> R mo32498H(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d);

    @NotNull
    /* renamed from: a */
    DeclarationDescriptor mo32487a();

    @Nullable
    /* renamed from: b */
    DeclarationDescriptor mo32437b();
}
