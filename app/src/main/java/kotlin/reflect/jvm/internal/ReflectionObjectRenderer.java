package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: b */
    public static final ReflectionObjectRenderer f63635b = new ReflectionObjectRenderer();

    /* renamed from: a */
    public static final DescriptorRenderer f63634a = DescriptorRenderer.f65766a;

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            int[] iArr2 = new int[Variance.values().length];
            iArr2[Variance.INVARIANT.ordinal()] = 1;
            iArr2[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr2[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    /* renamed from: a */
    public final void m32308a(@NotNull StringBuilder sb, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.m32175d(type, "receiver.type");
            sb.append(m32312e(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    public final void m32309b(@NotNull StringBuilder sb, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor m32321d = UtilKt.m32321d(callableDescriptor);
        ReceiverParameterDescriptor mo32492k0 = callableDescriptor.mo32492k0();
        m32308a(sb, m32321d);
        boolean z = (m32321d == null || mo32492k0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m32308a(sb, mo32492k0);
        if (z) {
            sb.append(")");
        }
    }

    @NotNull
    /* renamed from: c */
    public final String m32310c(@NotNull FunctionDescriptor descriptor) {
        Intrinsics.m32180i(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f63635b;
        reflectionObjectRenderer.m32309b(sb, descriptor);
        DescriptorRenderer descriptorRenderer = f63634a;
        Name name = descriptor.getName();
        Intrinsics.m32175d(name, "descriptor.name");
        sb.append(descriptorRenderer.mo33367w(name, true));
        List<ValueParameterDescriptor> mo32489f = descriptor.mo32489f();
        Intrinsics.m32175d(mo32489f, "descriptor.valueParameters");
        CollectionsKt.m32049z(mo32489f, sb, ", ", "(", ")", 0, null, new Function1<ValueParameterDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(ValueParameterDescriptor valueParameterDescriptor) {
                ValueParameterDescriptor it = valueParameterDescriptor;
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f63635b;
                Intrinsics.m32175d(it, "it");
                KotlinType type = it.getType();
                Intrinsics.m32175d(type, "it.type");
                return reflectionObjectRenderer2.m32312e(type);
            }
        }, 48, null);
        sb.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        if (returnType == null) {
            Intrinsics.m32188q();
            throw null;
        }
        Intrinsics.m32175d(returnType, "descriptor.returnType!!");
        sb.append(reflectionObjectRenderer.m32312e(returnType));
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: d */
    public final String m32311d(@NotNull PropertyDescriptor descriptor) {
        Intrinsics.m32180i(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.mo32575i0() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f63635b;
        reflectionObjectRenderer.m32309b(sb, descriptor);
        DescriptorRenderer descriptorRenderer = f63634a;
        Name name = descriptor.getName();
        Intrinsics.m32175d(name, "descriptor.name");
        sb.append(descriptorRenderer.mo33367w(name, true));
        sb.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.m32175d(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.m32312e(type));
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: e */
    public final String m32312e(@NotNull KotlinType type) {
        Intrinsics.m32180i(type, "type");
        return f63634a.mo33368x(type);
    }
}
