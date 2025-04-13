package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SignaturePropagator {

    /* renamed from: a */
    public static final SignaturePropagator f64415a = new SignaturePropagator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.1
        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        @NotNull
        /* renamed from: a */
        public PropagatedSignature mo32708a(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
            return new PropagatedSignature(kotlinType, null, list, list2, Collections.emptyList(), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        /* renamed from: b */
        public void mo32709b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list) {
            throw new UnsupportedOperationException("Should not be called");
        }
    };

    public static class PropagatedSignature {

        /* renamed from: a */
        public final KotlinType f64416a;

        /* renamed from: b */
        public final KotlinType f64417b;

        /* renamed from: c */
        public final List<ValueParameterDescriptor> f64418c;

        /* renamed from: d */
        public final List<TypeParameterDescriptor> f64419d;

        /* renamed from: e */
        public final List<String> f64420e;

        /* renamed from: f */
        public final boolean f64421f;

        public PropagatedSignature(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2, @NotNull List<String> list3, boolean z) {
            this.f64416a = kotlinType;
            this.f64417b = kotlinType2;
            this.f64418c = list;
            this.f64419d = list2;
            this.f64420e = list3;
            this.f64421f = z;
        }
    }

    @NotNull
    /* renamed from: a */
    PropagatedSignature mo32708a(@NotNull JavaMethod javaMethod, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<ValueParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2);

    /* renamed from: b */
    void mo32709b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull List<String> list);
}
