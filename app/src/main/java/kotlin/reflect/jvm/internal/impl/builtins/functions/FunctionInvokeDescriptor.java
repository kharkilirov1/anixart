package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes3.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    /* renamed from: D */
    public static final Factory f63864D = new Factory(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class Factory {
        public Factory() {
        }

        @NotNull
        /* renamed from: a */
        public final FunctionInvokeDescriptor m32461a(@NotNull FunctionClassDescriptor functionClass, boolean z) {
            String str;
            Intrinsics.m32180i(functionClass, "functionClass");
            List<TypeParameterDescriptor> list = functionClass.f63846g;
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z);
            ReceiverParameterDescriptor mo32504F0 = functionClass.mo32504F0();
            EmptyList emptyList = EmptyList.f63144b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((TypeParameterDescriptor) obj).mo32500m() == Variance.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable m32037o0 = CollectionsKt.m32037o0(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(m32037o0, 10));
            Iterator it = ((IndexingIterable) m32037o0).iterator();
            while (it.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) it.next();
                int i2 = indexedValue.f63147a;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.f63148b;
                String str2 = typeParameterDescriptor.getName().f65606b;
                Intrinsics.m32175d(str2, "typeParameter.name.asString()");
                int hashCode = str2.hashCode();
                if (hashCode != 69) {
                    if (hashCode == 84 && str2.equals("T")) {
                        str = "instance";
                    }
                    str = str2.toLowerCase();
                    Intrinsics.m32175d(str, "(this as java.lang.String).toLowerCase()");
                } else {
                    if (str2.equals("E")) {
                        str = "receiver";
                    }
                    str = str2.toLowerCase();
                    Intrinsics.m32175d(str, "(this as java.lang.String).toLowerCase()");
                }
                int i3 = Annotations.f64023H1;
                Annotations annotations = Annotations.Companion.f64024a;
                Name m33211d = Name.m33211d(str);
                SimpleType mo32502r = typeParameterDescriptor.mo32502r();
                Intrinsics.m32175d(mo32502r, "typeParameter.defaultType");
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i2, annotations, m33211d, mo32502r, false, false, false, null, SourceElement.f63979a));
                arrayList2 = arrayList3;
            }
            functionInvokeDescriptor.mo32623C0(null, mo32504F0, emptyList, arrayList2, ((TypeParameterDescriptor) CollectionsKt.m31991D(list)).mo32502r(), Modality.ABSTRACT, Visibilities.f63988e);
            functionInvokeDescriptor.f64139w = true;
            return functionInvokeDescriptor;
        }

        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.f64024a, OperatorNameConventions.f66449g, kind, SourceElement.f63979a);
        int i2 = Annotations.f64023H1;
        this.f64128l = true;
        this.f64137u = z;
        this.f64138v = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    /* renamed from: M */
    public boolean mo32458M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(@NotNull DeclarationDescriptor newOwner, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement source) {
        Intrinsics.m32180i(newOwner, "newOwner");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(source, "source");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, this.f64137u);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    /* renamed from: Z */
    public FunctionDescriptor mo32460Z(@NotNull FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        boolean z;
        Name name;
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.mo32460Z(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> list = functionInvokeDescriptor.f64122f;
        Intrinsics.m32175d(list, "substituted.valueParameters");
        boolean z2 = true;
        if (!list.isEmpty()) {
            for (ValueParameterDescriptor it : list) {
                Intrinsics.m32175d(it, "it");
                KotlinType type = it.getType();
                Intrinsics.m32175d(type, "it.type");
                if (FunctionTypesKt.m32366b(type) != null) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return functionInvokeDescriptor;
        }
        List<ValueParameterDescriptor> list2 = functionInvokeDescriptor.f64122f;
        Intrinsics.m32175d(list2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list2, 10));
        for (ValueParameterDescriptor it2 : list2) {
            Intrinsics.m32175d(it2, "it");
            KotlinType type2 = it2.getType();
            Intrinsics.m32175d(type2, "it.type");
            arrayList.add(FunctionTypesKt.m32366b(type2));
        }
        int size = functionInvokeDescriptor.f64122f.size() - arrayList.size();
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.f64122f;
        Intrinsics.m32175d(valueParameters, "valueParameters");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(valueParameters, 10));
        for (ValueParameterDescriptor it3 : valueParameters) {
            Intrinsics.m32175d(it3, "it");
            Name name2 = it3.getName();
            Intrinsics.m32175d(name2, "it.name");
            int mo32571h = it3.mo32571h();
            int i2 = mo32571h - size;
            if (i2 >= 0 && (name = (Name) arrayList.get(i2)) != null) {
                name2 = name;
            }
            arrayList2.add(it3.mo32568A0(functionInvokeDescriptor, name2, mo32571h));
        }
        FunctionDescriptorImpl.CopyConfiguration m32624G0 = functionInvokeDescriptor.m32624G0(TypeSubstitutor.f66348b);
        if (!arrayList.isEmpty()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (((Name) it4.next()) == null) {
                    break;
                }
            }
        }
        z2 = false;
        m32624G0.f64165u = Boolean.valueOf(z2);
        m32624G0.f64151g = arrayList2;
        m32624G0.f64149e = functionInvokeDescriptor.mo32487a();
        FunctionDescriptor mo32460Z = super.mo32460Z(m32624G0);
        if (mo32460Z != null) {
            return mo32460Z;
        }
        Intrinsics.m32188q();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    /* renamed from: x */
    public boolean mo32444x() {
        return false;
    }
}
