package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes3.dex */
public interface AdditionalClassPartsProvider {

    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class None implements AdditionalClassPartsProvider {

        /* renamed from: a */
        public static final None f64059a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* renamed from: a */
        public Collection<ClassConstructorDescriptor> mo32475a(@NotNull ClassDescriptor classDescriptor) {
            return EmptyList.f63144b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* renamed from: b */
        public Collection<SimpleFunctionDescriptor> mo32476b(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
            Intrinsics.m32180i(classDescriptor, "classDescriptor");
            return EmptyList.f63144b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* renamed from: d */
        public Collection<KotlinType> mo32478d(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.m32180i(classDescriptor, "classDescriptor");
            return EmptyList.f63144b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        /* renamed from: e */
        public Collection<Name> mo32479e(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.m32180i(classDescriptor, "classDescriptor");
            return EmptyList.f63144b;
        }
    }

    @NotNull
    /* renamed from: a */
    Collection<ClassConstructorDescriptor> mo32475a(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* renamed from: b */
    Collection<SimpleFunctionDescriptor> mo32476b(@NotNull Name name, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* renamed from: d */
    Collection<KotlinType> mo32478d(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    /* renamed from: e */
    Collection<Name> mo32479e(@NotNull ClassDescriptor classDescriptor);
}
