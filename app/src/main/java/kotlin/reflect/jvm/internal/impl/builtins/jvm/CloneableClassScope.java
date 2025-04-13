package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: CloneableClassScope.kt */
/* loaded from: classes3.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {

    /* renamed from: f */
    public static final Companion f63866f = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final Name f63865e = Name.m33211d("clone");

    /* compiled from: CloneableClassScope.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        super(storageManager, classDescriptor);
        Intrinsics.m32180i(storageManager, "storageManager");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    /* renamed from: g */
    public List<FunctionDescriptor> mo32457g() {
        ClassDescriptor classDescriptor = this.f65986c;
        int i2 = Annotations.f64023H1;
        SimpleFunctionDescriptorImpl m32646L0 = SimpleFunctionDescriptorImpl.m32646L0(classDescriptor, Annotations.Companion.f64024a, f63865e, CallableMemberDescriptor.Kind.DECLARATION, SourceElement.f63979a);
        ReceiverParameterDescriptor mo32504F0 = this.f65986c.mo32504F0();
        EmptyList emptyList = EmptyList.f63144b;
        m32646L0.mo32623C0(null, mo32504F0, emptyList, emptyList, DescriptorUtilsKt.m33534g(this.f65986c).m32397e(), Modality.OPEN, Visibilities.f63986c);
        return CollectionsKt.m31993F(m32646L0);
    }
}
