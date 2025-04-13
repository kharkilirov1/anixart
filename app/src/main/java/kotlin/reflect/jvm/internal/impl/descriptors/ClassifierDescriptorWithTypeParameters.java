package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface ClassifierDescriptorWithTypeParameters extends ClassifierDescriptor, DeclarationDescriptorWithVisibility, MemberDescriptor, Substitutable<ClassifierDescriptorWithTypeParameters> {
    /* renamed from: J */
    boolean mo32433J();

    @NotNull
    /* renamed from: t */
    List<TypeParameterDescriptor> mo32443t();
}
