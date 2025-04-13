package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes3.dex */
public interface ResolutionScope {

    /* compiled from: ResolutionScope.kt */
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: a */
        public static Collection m33549a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i2, Object obj) {
            Function1<Name, Boolean> function12;
            if ((i2 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.f65972l;
            }
            if ((i2 & 2) != 0) {
                Objects.requireNonNull(MemberScope.f65992a);
                function12 = MemberScope.Companion.f65993a;
            } else {
                function12 = null;
            }
            return resolutionScope.mo32616d(descriptorKindFilter, function12);
        }
    }

    @Nullable
    /* renamed from: c */
    ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* renamed from: d */
    Collection<DeclarationDescriptor> mo32616d(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1);
}
