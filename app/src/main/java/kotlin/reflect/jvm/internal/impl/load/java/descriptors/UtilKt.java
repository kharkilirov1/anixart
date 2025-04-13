package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: util.kt */
/* loaded from: classes3.dex */
public final class UtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final List<ValueParameterDescriptor> m32714a(@NotNull Collection<ValueParameterData> newValueParametersTypes, @NotNull Collection<? extends ValueParameterDescriptor> oldValueParameters, @NotNull CallableDescriptor callableDescriptor) {
        KotlinType kotlinType;
        Intrinsics.m32180i(newValueParametersTypes, "newValueParametersTypes");
        Intrinsics.m32180i(oldValueParameters, "oldValueParameters");
        newValueParametersTypes.size();
        oldValueParameters.size();
        List m32039p0 = CollectionsKt.m32039p0(newValueParametersTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32039p0, 10));
        Iterator it = ((ArrayList) m32039p0).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ValueParameterData valueParameterData = (ValueParameterData) pair.f63055b;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.f63056c;
            int mo32571h = valueParameterDescriptor.mo32571h();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            Intrinsics.m32175d(name, "oldParameter.name");
            KotlinType kotlinType2 = valueParameterData.f64440a;
            boolean z = valueParameterData.f64441b;
            boolean mo32570b0 = valueParameterDescriptor.mo32570b0();
            boolean mo32569W = valueParameterDescriptor.mo32569W();
            if (valueParameterDescriptor.mo32572j0() != null) {
                ModuleDescriptor m33466b = DescriptorUtils.m33466b(callableDescriptor);
                Intrinsics.m32175d(m33466b, "DescriptorUtils.getContainingModule(this)");
                kotlinType = m33466b.mo32547n().m32398f(valueParameterData.f64440a);
            } else {
                kotlinType = null;
            }
            SourceElement mo32439i = valueParameterDescriptor.mo32439i();
            Intrinsics.m32175d(mo32439i, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor, null, mo32571h, annotations, name, kotlinType2, z, mo32570b0, mo32569W, kotlinType, mo32439i));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: b */
    public static final LazyJavaStaticClassScope m32715b(@NotNull ClassDescriptor receiver$0) {
        ClassDescriptor classDescriptor;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Iterator<KotlinType> it = receiver$0.mo32502r().mo33515H0().mo32602a().iterator();
        while (true) {
            if (!it.hasNext()) {
                classDescriptor = null;
                break;
            }
            KotlinType next = it.next();
            if (!KotlinBuiltIns.m32374B(next)) {
                ClassifierDescriptor mo32449b = next.mo33515H0().mo32449b();
                if (DescriptorUtils.m33475k(mo32449b)) {
                    if (mo32449b == null) {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    classDescriptor = (ClassDescriptor) mo32449b;
                }
            }
        }
        if (classDescriptor == null) {
            return null;
        }
        MemberScope mo32435Q = classDescriptor.mo32435Q();
        Intrinsics.m32175d(mo32435Q, "superClassDescriptor.staticScope");
        return !(mo32435Q instanceof LazyJavaStaticClassScope) ? m32715b(classDescriptor) : (LazyJavaStaticClassScope) mo32435Q;
    }
}
