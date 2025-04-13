package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean m32496a() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* renamed from: a */
    CallableMemberDescriptor mo32487a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    /* renamed from: e */
    Collection<? extends CallableMemberDescriptor> mo32488e();

    @NotNull
    /* renamed from: g */
    Kind mo32493g();

    /* renamed from: t0 */
    void mo32494t0(@NotNull Collection<? extends CallableMemberDescriptor> collection);

    @NotNull
    /* renamed from: u */
    CallableMemberDescriptor mo32495u(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z);
}
