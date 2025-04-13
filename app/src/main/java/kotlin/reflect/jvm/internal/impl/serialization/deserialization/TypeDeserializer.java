package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes3.dex */
public final class TypeDeserializer {

    /* renamed from: a */
    public final Function1<Integer, ClassDescriptor> f66130a;

    /* renamed from: b */
    public final Function1<Integer, ClassifierDescriptor> f66131b;

    /* renamed from: c */
    public final Map<Integer, TypeParameterDescriptor> f66132c;

    /* renamed from: d */
    public final DeserializationContext f66133d;

    /* renamed from: e */
    public final TypeDeserializer f66134e;

    /* renamed from: f */
    public final String f66135f;

    /* renamed from: g */
    public boolean f66136g;

    public TypeDeserializer(DeserializationContext deserializationContext, TypeDeserializer typeDeserializer, List list, String debugName, boolean z, int i2) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        int i3 = 0;
        z = (i2 & 16) != 0 ? false : z;
        Intrinsics.m32180i(debugName, "debugName");
        this.f66133d = deserializationContext;
        this.f66134e = typeDeserializer;
        this.f66135f = debugName;
        this.f66136g = z;
        this.f66130a = deserializationContext.f66069c.f66050b.mo33627g(new Function1<Integer, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(Integer num) {
                int intValue = num.intValue();
                TypeDeserializer typeDeserializer2 = TypeDeserializer.this;
                ClassId m33584a = NameResolverUtilKt.m33584a(typeDeserializer2.f66133d.f66070d, intValue);
                return m33584a.f65595c ? typeDeserializer2.f66133d.f66069c.m33562b(m33584a) : FindClassInModuleKt.m32519a(typeDeserializer2.f66133d.f66069c.f66051c, m33584a);
            }
        });
        this.f66131b = deserializationContext.f66069c.f66050b.mo33627g(new Function1<Integer, ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ClassifierDescriptor invoke(Integer num) {
                int intValue = num.intValue();
                TypeDeserializer typeDeserializer2 = TypeDeserializer.this;
                ClassId m33584a = NameResolverUtilKt.m33584a(typeDeserializer2.f66133d.f66070d, intValue);
                if (m33584a.f65595c) {
                    return null;
                }
                ModuleDescriptor receiver$0 = typeDeserializer2.f66133d.f66069c.f66051c;
                NoLookupLocation noLookupLocation = NoLookupLocation.FROM_DESERIALIZATION;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                FqName fqName = m33584a.f65593a;
                Intrinsics.m32175d(fqName, "classId.packageFqName");
                PackageViewDescriptor mo32545K = receiver$0.mo32545K(fqName);
                List<Name> m33205e = m33584a.f65594b.f65597a.m33205e();
                Intrinsics.m32175d(m33205e, "classId.relativeClassName.pathSegments()");
                int size = m33205e.size() - 1;
                MemberScope mo32555p = mo32545K.mo32555p();
                Object m32044u = CollectionsKt.m32044u(m33205e);
                Intrinsics.m32175d(m32044u, "segments.first()");
                ClassifierDescriptor mo32732c = mo32555p.mo32732c((Name) m32044u, noLookupLocation);
                if (size == 0) {
                    return (TypeAliasDescriptor) (mo32732c instanceof TypeAliasDescriptor ? mo32732c : null);
                }
                if (!(mo32732c instanceof ClassDescriptor)) {
                    mo32732c = null;
                }
                ClassDescriptor classDescriptor = (ClassDescriptor) mo32732c;
                if (classDescriptor == null) {
                    return null;
                }
                for (Name name : m33205e.subList(1, size)) {
                    MemberScope mo32506u0 = classDescriptor.mo32506u0();
                    Intrinsics.m32175d(name, "name");
                    ClassifierDescriptor mo32732c2 = mo32506u0.mo32732c(name, noLookupLocation);
                    if (!(mo32732c2 instanceof ClassDescriptor)) {
                        mo32732c2 = null;
                    }
                    classDescriptor = (ClassDescriptor) mo32732c2;
                    if (classDescriptor == null) {
                        return null;
                    }
                }
                Name lastName = m33205e.get(size);
                MemberScope mo32445x0 = classDescriptor.mo32445x0();
                Intrinsics.m32175d(lastName, "lastName");
                ClassifierDescriptor mo32732c3 = mo32445x0.mo32732c(lastName, noLookupLocation);
                return (TypeAliasDescriptor) (mo32732c3 instanceof TypeAliasDescriptor ? mo32732c3 : null);
            }
        });
        if (list.isEmpty()) {
            linkedHashMap = EmptyMap.f63145b;
        } else {
            linkedHashMap = new LinkedHashMap<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProtoBuf.TypeParameter typeParameter = (ProtoBuf.TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(typeParameter.f65274e), new DeserializedTypeParameterDescriptor(this.f66133d, typeParameter, i3));
                i3++;
            }
        }
        this.f66132c = linkedHashMap;
    }

    /* renamed from: a */
    public final SimpleType m33590a(int i2) {
        if (NameResolverUtilKt.m33584a(this.f66133d.f66070d, i2).f65595c) {
            return this.f66133d.f66069c.f66056h.mo33571a();
        }
        return null;
    }

    /* renamed from: b */
    public final SimpleType m33591b(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns m33748c = TypeUtilsKt.m33748c(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType m32368d = FunctionTypesKt.m32368d(kotlinType);
        List m32040q = CollectionsKt.m32040q(FunctionTypesKt.m32370f(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m32040q, 10));
        Iterator it = m32040q.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.m32365a(m33748c, annotations, m32368d, arrayList, null, kotlinType2, true).mo32787K0(kotlinType.mo32838I0());
    }

    @NotNull
    /* renamed from: c */
    public final List<TypeParameterDescriptor> m33592c() {
        return CollectionsKt.m32027j0(this.f66132c.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0315  */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$1] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType m33593d(@org.jetbrains.annotations.NotNull final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r14) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer.m33593d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    @NotNull
    /* renamed from: e */
    public final KotlinType m33594e(@NotNull ProtoBuf.Type proto) {
        ProtoBuf.Type m33129a;
        Intrinsics.m32180i(proto, "proto");
        if (!((proto.f65194d & 2) == 2)) {
            return m33593d(proto);
        }
        String string = this.f66133d.f66070d.getString(proto.f65197g);
        SimpleType m33593d = m33593d(proto);
        TypeTable typeTable = this.f66133d.f66072f;
        Intrinsics.m32180i(typeTable, "typeTable");
        if (proto.m33058u()) {
            m33129a = proto.f65198h;
        } else {
            m33129a = (proto.f65194d & 8) == 8 ? typeTable.m33129a(proto.f65199i) : null;
        }
        if (m33129a != null) {
            return this.f66133d.f66069c.f66059k.mo32912a(proto, string, m33593d, m33593d(m33129a));
        }
        Intrinsics.m32188q();
        throw null;
    }

    /* renamed from: f */
    public final TypeConstructor m33595f(int i2) {
        TypeConstructor mo32440j;
        TypeParameterDescriptor typeParameterDescriptor = this.f66132c.get(Integer.valueOf(i2));
        if (typeParameterDescriptor != null && (mo32440j = typeParameterDescriptor.mo32440j()) != null) {
            return mo32440j;
        }
        TypeDeserializer typeDeserializer = this.f66134e;
        if (typeDeserializer != null) {
            return typeDeserializer.m33595f(i2);
        }
        return null;
    }

    @NotNull
    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f66135f);
        if (this.f66134e == null) {
            sb = "";
        } else {
            StringBuilder m24u = C0000a.m24u(". Child of ");
            m24u.append(this.f66134e.f66135f);
            sb = m24u.toString();
        }
        sb2.append(sb);
        return sb2.toString();
    }
}
