package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.C3033a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes3.dex */
public final class MemberDeserializer {

    /* renamed from: a */
    public final AnnotationDeserializer f66093a;

    /* renamed from: b */
    public final DeserializationContext f66094b;

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        this.f66094b = deserializationContext;
        DeserializationComponents deserializationComponents = deserializationContext.f66069c;
        this.f66093a = new AnnotationDeserializer(deserializationComponents.f66051c, deserializationComponents.f66061m);
    }

    /* renamed from: a */
    public final ProtoContainer m33572a(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName mo32550d = ((PackageFragmentDescriptor) declarationDescriptor).mo32550d();
            DeserializationContext deserializationContext = this.f66094b;
            return new ProtoContainer.Package(mo32550d, deserializationContext.f66070d, deserializationContext.f66072f, deserializationContext.f66075i);
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).f66171s;
        }
        return null;
    }

    /* renamed from: b */
    public final DeserializedMemberDescriptor.CoroutinesCompatibilityMode m33573b(@NotNull DeserializedMemberDescriptor deserializedMemberDescriptor, TypeDeserializer typeDeserializer) {
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        if (!m33583l(deserializedMemberDescriptor)) {
            return coroutinesCompatibilityMode;
        }
        Iterator<T> it = typeDeserializer.m33592c().iterator();
        while (it.hasNext()) {
            ((TypeParameterDescriptor) it.next()).getUpperBounds();
        }
        return typeDeserializer.f66136g ? DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE : coroutinesCompatibilityMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* renamed from: c */
    public final DeserializedMemberDescriptor.CoroutinesCompatibilityMode m33574c(@NotNull DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, Collection<? extends ValueParameterDescriptor> collection, Collection<? extends TypeParameterDescriptor> collection2, KotlinType kotlinType, boolean z) {
        boolean z2;
        boolean z3;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        boolean z4;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode2 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode3 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode4 = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE;
        if (!m33583l(deserializedCallableMemberDescriptor) || Intrinsics.m32174c(DescriptorUtilsKt.m33532e(deserializedCallableMemberDescriptor), SuspendFunctionTypeUtilKt.f66129a)) {
            return coroutinesCompatibilityMode4;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode5 = null;
        List<KotlinType> m32002O = CollectionsKt.m32002O(arrayList, CollectionsKt.m31995H(receiverParameterDescriptor != null ? receiverParameterDescriptor.getType() : null));
        if (kotlinType != null && m33575d(kotlinType)) {
            return coroutinesCompatibilityMode3;
        }
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) it2.next()).getUpperBounds();
                Intrinsics.m32175d(upperBounds, "typeParameter.upperBounds");
                if (!upperBounds.isEmpty()) {
                    for (KotlinType it3 : upperBounds) {
                        Intrinsics.m32175d(it3, "it");
                        if (m33575d(it3)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3) {
            return coroutinesCompatibilityMode3;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(m32002O, 10));
        for (KotlinType type : m32002O) {
            Intrinsics.m32175d(type, "type");
            if (!FunctionTypesKt.m32372h(type) || type.mo33514G0().size() > 3) {
                if (!m33575d(type)) {
                    coroutinesCompatibilityMode = coroutinesCompatibilityMode4;
                }
                coroutinesCompatibilityMode = coroutinesCompatibilityMode3;
            } else {
                List<TypeProjection> mo33514G0 = type.mo33514G0();
                if (!(mo33514G0 instanceof Collection) || !mo33514G0.isEmpty()) {
                    Iterator it4 = mo33514G0.iterator();
                    while (it4.hasNext()) {
                        KotlinType type2 = ((TypeProjection) it4.next()).getType();
                        Intrinsics.m32175d(type2, "it.type");
                        if (m33575d(type2)) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                if (!z4) {
                    coroutinesCompatibilityMode = coroutinesCompatibilityMode2;
                }
                coroutinesCompatibilityMode = coroutinesCompatibilityMode3;
            }
            arrayList2.add(coroutinesCompatibilityMode);
        }
        Iterator it5 = arrayList2.iterator();
        if (it5.hasNext()) {
            ?? r9 = (Comparable) it5.next();
            loop3: while (true) {
                coroutinesCompatibilityMode5 = r9;
                while (it5.hasNext()) {
                    r9 = (Comparable) it5.next();
                    if (coroutinesCompatibilityMode5.compareTo((DeserializedMemberDescriptor.CoroutinesCompatibilityMode) r9) < 0) {
                        break;
                    }
                }
            }
        }
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode coroutinesCompatibilityMode6 = coroutinesCompatibilityMode5;
        if (coroutinesCompatibilityMode6 == null) {
            coroutinesCompatibilityMode6 = coroutinesCompatibilityMode4;
        }
        if (!z) {
            coroutinesCompatibilityMode2 = coroutinesCompatibilityMode4;
        }
        return coroutinesCompatibilityMode2.compareTo(coroutinesCompatibilityMode6) >= 0 ? coroutinesCompatibilityMode2 : coroutinesCompatibilityMode6;
    }

    /* renamed from: d */
    public final boolean m33575d(@NotNull KotlinType kotlinType) {
        KProperty1 predicate = MemberDeserializer$containsSuspendFunctionType$1.f66102b;
        Intrinsics.m32180i(predicate, "predicate");
        return TypeUtils.m33692b(kotlinType, predicate);
    }

    /* renamed from: e */
    public final Annotations m33576e(final MessageLite messageLite, int i2, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f65397b.mo33113b(i2).booleanValue() ? Annotations.Companion.f64024a : new NonEmptyDeserializedAnnotations(this.f66094b.f66069c.f66050b, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends AnnotationDescriptor> invoke() {
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                ProtoContainer m33572a = memberDeserializer.m33572a(memberDeserializer.f66094b.f66071e);
                List<? extends AnnotationDescriptor> m32027j0 = m33572a != null ? CollectionsKt.m32027j0(MemberDeserializer.this.f66094b.f66069c.f66054f.mo32879j(m33572a, messageLite, annotatedCallableKind)) : null;
                return m32027j0 != null ? m32027j0 : EmptyList.f63144b;
            }
        });
    }

    /* renamed from: f */
    public final ReceiverParameterDescriptor m33577f() {
        DeclarationDescriptor declarationDescriptor = this.f66094b.f66071e;
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null) {
            return classDescriptor.mo32504F0();
        }
        return null;
    }

    /* renamed from: g */
    public final Annotations m33578g(final ProtoBuf.Property property, final boolean z) {
        return !Flags.f65397b.mo33113b(property.f65130e).booleanValue() ? Annotations.Companion.f64024a : new NonEmptyDeserializedAnnotations(this.f66094b.f66069c.f66050b, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends AnnotationDescriptor> invoke() {
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                ProtoContainer m33572a = memberDeserializer.m33572a(memberDeserializer.f66094b.f66071e);
                List<? extends AnnotationDescriptor> m32027j0 = m33572a != null ? z ? CollectionsKt.m32027j0(MemberDeserializer.this.f66094b.f66069c.f66054f.mo32878i(m33572a, property)) : CollectionsKt.m32027j0(MemberDeserializer.this.f66094b.f66069c.f66054f.mo32876g(m33572a, property)) : null;
                return m32027j0 != null ? m32027j0 : EmptyList.f63144b;
            }
        });
    }

    @NotNull
    /* renamed from: h */
    public final ClassConstructorDescriptor m33579h(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        DeserializationContext m33568a;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode m33574c;
        DeserializationContext deserializationContext;
        TypeDeserializer typeDeserializer;
        DeclarationDescriptor declarationDescriptor = this.f66094b.f66071e;
        if (declarationDescriptor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        int i2 = constructor.f64974e;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations m33576e = m33576e(constructor, i2, annotatedCallableKind);
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        DeserializationContext deserializationContext2 = this.f66094b;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor2 = new DeserializedClassConstructorDescriptor(classDescriptor, null, m33576e, z, kind, constructor, deserializationContext2.f66070d, deserializationContext2.f66072f, deserializationContext2.f66073g, deserializationContext2.f66075i, null);
        m33568a = r8.m33568a(deserializedClassConstructorDescriptor2, EmptyList.f63144b, (r14 & 4) != 0 ? r8.f66070d : null, (r14 & 8) != 0 ? r8.f66072f : null, (r14 & 16) != 0 ? r8.f66073g : null, (r14 & 32) != 0 ? this.f66094b.f66074h : null);
        MemberDeserializer memberDeserializer = m33568a.f66068b;
        List<ProtoBuf.ValueParameter> list = constructor.f64975f;
        Intrinsics.m32175d(list, "proto.valueParameterList");
        deserializedClassConstructorDescriptor2.m32611M0(memberDeserializer.m33582k(list, constructor, annotatedCallableKind), ProtoEnumFlags.f66128a.m33589c(Flags.f65398c.mo33113b(constructor.f64974e)), classDescriptor.mo32443t());
        deserializedClassConstructorDescriptor2.f64123g = classDescriptor.mo32502r();
        DeclarationDescriptor declarationDescriptor2 = this.f66094b.f66071e;
        if (!(declarationDescriptor2 instanceof DeserializedClassDescriptor)) {
            declarationDescriptor2 = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) declarationDescriptor2;
        if ((deserializedClassDescriptor == null || (deserializationContext = deserializedClassDescriptor.f66161i) == null || (typeDeserializer = deserializationContext.f66067a) == null || !typeDeserializer.f66136g || !m33583l(deserializedClassConstructorDescriptor2)) ? false : true) {
            m33574c = DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE;
            deserializedClassConstructorDescriptor = deserializedClassConstructorDescriptor2;
        } else {
            Collection<? extends ValueParameterDescriptor> collection = deserializedClassConstructorDescriptor2.f64122f;
            Intrinsics.m32175d(collection, "descriptor.valueParameters");
            Collection<? extends TypeParameterDescriptor> collection2 = deserializedClassConstructorDescriptor2.f64121e;
            Intrinsics.m32175d(collection2, "descriptor.typeParameters");
            deserializedClassConstructorDescriptor = deserializedClassConstructorDescriptor2;
            m33574c = m33574c(deserializedClassConstructorDescriptor2, null, collection, collection2, deserializedClassConstructorDescriptor2.f64123g, false);
        }
        deserializedClassConstructorDescriptor.f66151F = m33574c;
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    /* renamed from: i */
    public final SimpleFunctionDescriptor m33580i(@NotNull ProtoBuf.Function function) {
        int i2;
        VersionRequirementTable versionRequirementTable;
        DeserializationContext m33568a;
        Map<? extends CallableDescriptor.UserDataKey<?>, ?> map;
        KotlinType m33594e;
        if ((function.f65054d & 1) == 1) {
            i2 = function.f65055e;
        } else {
            int i3 = function.f65056f;
            i2 = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i2;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations m33576e = m33576e(function, i4, annotatedCallableKind);
        Annotations deserializedAnnotations = ProtoTypeTableUtilKt.m33122a(function) ? new DeserializedAnnotations(this.f66094b.f66069c.f66050b, new MemberDeserializer$getReceiverParameterAnnotations$1(this, function, annotatedCallableKind)) : Annotations.Companion.f64024a;
        FqName m33536i = DescriptorUtilsKt.m33536i(this.f66094b.f66071e);
        if (Intrinsics.m32174c(new FqName(m33536i.f65597a.m33201a(NameResolverUtilKt.m33585b(this.f66094b.f66070d, function.f65057g)), m33536i), SuspendFunctionTypeUtilKt.f66129a)) {
            VersionRequirementTable.Companion companion = VersionRequirementTable.f65438c;
            VersionRequirementTable versionRequirementTable2 = VersionRequirementTable.f65437b;
            versionRequirementTable = VersionRequirementTable.f65437b;
        } else {
            versionRequirementTable = this.f66094b.f66073g;
        }
        VersionRequirementTable versionRequirementTable3 = versionRequirementTable;
        DeserializationContext deserializationContext = this.f66094b;
        DeclarationDescriptor declarationDescriptor = deserializationContext.f66071e;
        Name m33585b = NameResolverUtilKt.m33585b(deserializationContext.f66070d, function.f65057g);
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f66128a;
        CallableMemberDescriptor.Kind m33587a = protoEnumFlags.m33587a(Flags.f65407l.mo33113b(i4));
        DeserializationContext deserializationContext2 = this.f66094b;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(declarationDescriptor, null, m33576e, m33585b, m33587a, function, deserializationContext2.f66070d, deserializationContext2.f66072f, versionRequirementTable3, deserializationContext2.f66075i, null);
        DeserializationContext deserializationContext3 = this.f66094b;
        List<ProtoBuf.TypeParameter> list = function.f65060j;
        Intrinsics.m32175d(list, "proto.typeParameterList");
        m33568a = deserializationContext3.m33568a(deserializedSimpleFunctionDescriptor, list, (r14 & 4) != 0 ? deserializationContext3.f66070d : null, (r14 & 8) != 0 ? deserializationContext3.f66072f : null, (r14 & 16) != 0 ? deserializationContext3.f66073g : null, (r14 & 32) != 0 ? deserializationContext3.f66074h : null);
        ProtoBuf.Type m33125d = ProtoTypeTableUtilKt.m33125d(function, this.f66094b.f66072f);
        ReceiverParameterDescriptor m33460e = (m33125d == null || (m33594e = m33568a.f66067a.m33594e(m33125d)) == null) ? null : DescriptorFactory.m33460e(deserializedSimpleFunctionDescriptor, m33594e, deserializedAnnotations);
        ReceiverParameterDescriptor m33577f = m33577f();
        List<TypeParameterDescriptor> m33592c = m33568a.f66067a.m33592c();
        MemberDeserializer memberDeserializer = m33568a.f66068b;
        List<ProtoBuf.ValueParameter> list2 = function.f65063m;
        Intrinsics.m32175d(list2, "proto.valueParameterList");
        List<ValueParameterDescriptor> m33582k = memberDeserializer.m33582k(list2, function, annotatedCallableKind);
        KotlinType m33594e2 = m33568a.f66067a.m33594e(ProtoTypeTableUtilKt.m33126e(function, this.f66094b.f66072f));
        Modality m33588b = protoEnumFlags.m33588b(Flags.f65399d.mo33113b(i4));
        Visibility m33589c = protoEnumFlags.m33589c(Flags.f65398c.mo33113b(i4));
        map = EmptyMap.f63145b;
        Flags.BooleanFlagField booleanFlagField = Flags.f65413r;
        DeserializedMemberDescriptor.CoroutinesCompatibilityMode m33574c = m33574c(deserializedSimpleFunctionDescriptor, m33460e, m33582k, m33592c, m33594e2, C3033a.m17751m(booleanFlagField, i4, "Flags.IS_SUSPEND.get(flags)"));
        deserializedSimpleFunctionDescriptor.mo32650O0(m33460e, m33577f, m33592c, m33582k, m33594e2, m33588b, m33589c, map);
        deserializedSimpleFunctionDescriptor.f66232D = m33574c;
        deserializedSimpleFunctionDescriptor.f64128l = C3033a.m17751m(Flags.f65408m, i4, "Flags.IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.f64129m = C3033a.m17751m(Flags.f65409n, i4, "Flags.IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.f64130n = C3033a.m17751m(Flags.f65412q, i4, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.f64131o = C3033a.m17751m(Flags.f65410o, i4, "Flags.IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.f64132p = C3033a.m17751m(Flags.f65411p, i4, "Flags.IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.f64137u = C3033a.m17751m(booleanFlagField, i4, "Flags.IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.f64133q = C3033a.m17751m(Flags.f65414s, i4, "Flags.IS_EXPECT_FUNCTION.get(flags)");
        DeserializationContext deserializationContext4 = this.f66094b;
        Pair<CallableDescriptor.UserDataKey<?>, Object> mo33560a = deserializationContext4.f66069c.f66062n.mo33560a(function, deserializedSimpleFunctionDescriptor, deserializationContext4.f66072f, deserializationContext4.f66067a);
        if (mo33560a != null) {
            deserializedSimpleFunctionDescriptor.m32625H0(mo33560a.f63055b, mo33560a.f63056c);
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    /* renamed from: j */
    public final PropertyDescriptor m33581j(@NotNull final ProtoBuf.Property property) {
        int i2;
        DeserializationContext m33568a;
        AnnotatedCallableKind annotatedCallableKind;
        Annotations annotations;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        ProtoEnumFlags protoEnumFlags;
        boolean z;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        DeserializationContext m33568a2;
        KotlinType m33594e;
        AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_GETTER;
        if ((property.f65129d & 1) == 1) {
            i2 = property.f65130e;
        } else {
            int i3 = property.f65131f;
            i2 = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i2;
        DeclarationDescriptor declarationDescriptor = this.f66094b.f66071e;
        Annotations m33576e = m33576e(property, i4, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.f66128a;
        Flags.FlagField<ProtoBuf.Modality> flagField = Flags.f65399d;
        Modality m33588b = protoEnumFlags2.m33588b(flagField.mo33113b(i4));
        Flags.FlagField<ProtoBuf.Visibility> flagField2 = Flags.f65398c;
        Visibility m33589c = protoEnumFlags2.m33589c(flagField2.mo33113b(i4));
        boolean m17751m = C3033a.m17751m(Flags.f65415t, i4, "Flags.IS_VAR.get(flags)");
        Name m33585b = NameResolverUtilKt.m33585b(this.f66094b.f66070d, property.f65132g);
        CallableMemberDescriptor.Kind m33587a = protoEnumFlags2.m33587a(Flags.f65407l.mo33113b(i4));
        boolean m17751m2 = C3033a.m17751m(Flags.f65419x, i4, "Flags.IS_LATEINIT.get(flags)");
        boolean m17751m3 = C3033a.m17751m(Flags.f65418w, i4, "Flags.IS_CONST.get(flags)");
        boolean m17751m4 = C3033a.m17751m(Flags.f65421z, i4, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
        boolean m17751m5 = C3033a.m17751m(Flags.f65387A, i4, "Flags.IS_DELEGATED.get(flags)");
        boolean m17751m6 = C3033a.m17751m(Flags.f65388B, i4, "Flags.IS_EXPECT_PROPERTY.get(flags)");
        DeserializationContext deserializationContext = this.f66094b;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = new DeserializedPropertyDescriptor(declarationDescriptor, null, m33576e, m33588b, m33589c, m17751m, m33585b, m33587a, m17751m2, m17751m3, m17751m4, m17751m5, m17751m6, property, deserializationContext.f66070d, deserializationContext.f66072f, deserializationContext.f66073g, deserializationContext.f66075i);
        DeserializationContext deserializationContext2 = this.f66094b;
        List<ProtoBuf.TypeParameter> list = property.f65135j;
        Intrinsics.m32175d(list, "proto.typeParameterList");
        m33568a = deserializationContext2.m33568a(deserializedPropertyDescriptor2, list, (r14 & 4) != 0 ? deserializationContext2.f66070d : null, (r14 & 8) != 0 ? deserializationContext2.f66072f : null, (r14 & 16) != 0 ? deserializationContext2.f66073g : null, (r14 & 32) != 0 ? deserializationContext2.f66074h : null);
        boolean m17751m7 = C3033a.m17751m(Flags.f65416u, i4, "Flags.HAS_GETTER.get(flags)");
        if (m17751m7 && ProtoTypeTableUtilKt.m33123b(property)) {
            annotatedCallableKind = annotatedCallableKind2;
            annotations = new DeserializedAnnotations(this.f66094b.f66069c.f66050b, new MemberDeserializer$getReceiverParameterAnnotations$1(this, property, annotatedCallableKind));
        } else {
            annotatedCallableKind = annotatedCallableKind2;
            annotations = Annotations.Companion.f64024a;
        }
        KotlinType m33594e2 = m33568a.f66067a.m33594e(ProtoTypeTableUtilKt.m33127f(property, this.f66094b.f66072f));
        List<TypeParameterDescriptor> m33592c = m33568a.f66067a.m33592c();
        ReceiverParameterDescriptor m33577f = m33577f();
        TypeTable typeTable = this.f66094b.f66072f;
        Intrinsics.m32180i(typeTable, "typeTable");
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
        ProtoBuf.Type m33129a = property.m33032s() ? property.f65136k : property.m33033t() ? typeTable.m33129a(property.f65137l) : null;
        if (m33129a == null || (m33594e = m33568a.f66067a.m33594e(m33129a)) == null) {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor2;
            receiverParameterDescriptor = null;
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor2;
            receiverParameterDescriptor = DescriptorFactory.m33460e(deserializedPropertyDescriptor, m33594e, annotations);
        }
        deserializedPropertyDescriptor.m32642z0(m33594e2, m33592c, m33577f, receiverParameterDescriptor);
        int m33112a = Flags.m33112a(C3033a.m17751m(Flags.f65397b, i4, "Flags.HAS_ANNOTATIONS.get(flags)"), flagField2.mo33113b(i4), flagField.mo33113b(i4), false, false, false);
        if (m17751m7) {
            int i5 = (property.f65129d & 256) == 256 ? property.f65139n : m33112a;
            boolean m17751m8 = C3033a.m17751m(Flags.f65392F, i5, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
            boolean m17751m9 = C3033a.m17751m(Flags.f65393G, i5, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean m17751m10 = C3033a.m17751m(Flags.f65394H, i5, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
            Annotations m33576e2 = m33576e(property, i5, annotatedCallableKind);
            if (m17751m8) {
                protoEnumFlags = protoEnumFlags2;
                Modality m33588b2 = protoEnumFlags.m33588b(flagField.mo33113b(i5));
                Visibility m33589c2 = protoEnumFlags.m33589c(flagField2.mo33113b(i5));
                z = true;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, m33576e2, m33588b2, m33589c2, !m17751m8, m17751m9, m17751m10, m33587a, null, SourceElement.f63979a);
            } else {
                protoEnumFlags = protoEnumFlags2;
                z = true;
                propertyGetterDescriptorImpl = DescriptorFactory.m33456a(deserializedPropertyDescriptor, m33576e2);
            }
            propertyGetterDescriptorImpl.m32644Z(deserializedPropertyDescriptor.f64268e);
        } else {
            protoEnumFlags = protoEnumFlags2;
            z = true;
            propertyGetterDescriptorImpl = null;
        }
        if (C3033a.m17751m(Flags.f65417v, i4, "Flags.HAS_SETTER.get(flags)")) {
            if ((property.f65129d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                m33112a = property.f65140o;
            }
            boolean m17751m11 = C3033a.m17751m(Flags.f65392F, m33112a, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
            boolean m17751m12 = C3033a.m17751m(Flags.f65393G, m33112a, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean m17751m13 = C3033a.m17751m(Flags.f65394H, m33112a, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
            AnnotatedCallableKind annotatedCallableKind3 = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations m33576e3 = m33576e(property, m33112a, annotatedCallableKind3);
            if (m17751m11) {
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, m33576e3, protoEnumFlags.m33588b(flagField.mo33113b(m33112a)), protoEnumFlags.m33589c(flagField2.mo33113b(m33112a)), !m17751m11, m17751m12, m17751m13, m33587a, null, SourceElement.f63979a);
                m33568a2 = m33568a.m33568a(propertySetterDescriptorImpl2, EmptyList.f63144b, (r14 & 4) != 0 ? m33568a.f66070d : null, (r14 & 8) != 0 ? m33568a.f66072f : null, (r14 & 16) != 0 ? m33568a.f66073g : null, (r14 & 32) != 0 ? m33568a.f66074h : null);
                propertySetterDescriptorImpl2.f64245m = (ValueParameterDescriptor) CollectionsKt.m32011X(m33568a2.f66068b.m33582k(CollectionsKt.m31993F(property.f65138m), property, annotatedCallableKind3));
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            } else {
                propertySetterDescriptorImpl = DescriptorFactory.m33457b(deserializedPropertyDescriptor, m33576e3, Annotations.Companion.f64024a);
            }
        }
        if (C3033a.m17751m(Flags.f65420y, i4, "Flags.HAS_CONSTANT.get(flags)")) {
            deserializedPropertyDescriptor.f64270g = this.f66094b.f66069c.f66050b.mo33624d(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public ConstantValue<?> invoke() {
                    MemberDeserializer memberDeserializer = MemberDeserializer.this;
                    ProtoContainer m33572a = memberDeserializer.m33572a(memberDeserializer.f66094b.f66071e);
                    if (m33572a == null) {
                        Intrinsics.m32188q();
                        throw null;
                    }
                    AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = MemberDeserializer.this.f66094b.f66069c.f66054f;
                    ProtoBuf.Property property2 = property;
                    KotlinType kotlinType = deserializedPropertyDescriptor.f64268e;
                    Intrinsics.m32175d(kotlinType, "property.returnType");
                    return annotationAndConstantLoader.mo32874e(m33572a, property2, kotlinType);
                }
            });
        }
        FieldDescriptorImpl fieldDescriptorImpl = new FieldDescriptorImpl(m33578g(property, false), deserializedPropertyDescriptor);
        FieldDescriptorImpl fieldDescriptorImpl2 = new FieldDescriptorImpl(m33578g(property, z), deserializedPropertyDescriptor);
        m33573b(deserializedPropertyDescriptor, m33568a.f66067a);
        deserializedPropertyDescriptor.f64228v = propertyGetterDescriptorImpl;
        deserializedPropertyDescriptor.f64229w = propertySetterDescriptorImpl;
        deserializedPropertyDescriptor.f64231y = fieldDescriptorImpl;
        deserializedPropertyDescriptor.f64232z = fieldDescriptorImpl2;
        return deserializedPropertyDescriptor;
    }

    /* renamed from: k */
    public final List<ValueParameterDescriptor> m33582k(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        Annotations annotations;
        DeclarationDescriptor declarationDescriptor = this.f66094b.f66071e;
        if (declarationDescriptor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        }
        final CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
        DeclarationDescriptor mo32437b = callableDescriptor.mo32437b();
        Intrinsics.m32175d(mo32437b, "callableDescriptor.containingDeclaration");
        final ProtoContainer m33572a = m33572a(mo32437b);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int i4 = (valueParameter.f65309d & 1) == 1 ? valueParameter.f65310e : 0;
            if (m33572a == null || !C3033a.m17751m(Flags.f65397b, i4, "Flags.HAS_ANNOTATIONS.get(flags)")) {
                annotations = Annotations.Companion.f64024a;
            } else {
                final int i5 = i2;
                annotations = new NonEmptyDeserializedAnnotations(this.f66094b.f66069c.f66050b, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public List<? extends AnnotationDescriptor> invoke() {
                        return CollectionsKt.m32027j0(this.f66094b.f66069c.f66054f.mo32871b(m33572a, messageLite, annotatedCallableKind, i5, valueParameter));
                    }
                });
            }
            Name m33585b = NameResolverUtilKt.m33585b(this.f66094b.f66070d, valueParameter.f65311f);
            DeserializationContext deserializationContext = this.f66094b;
            KotlinType m33594e = deserializationContext.f66067a.m33594e(ProtoTypeTableUtilKt.m33128g(valueParameter, deserializationContext.f66072f));
            boolean m17751m = C3033a.m17751m(Flags.f65389C, i4, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
            boolean m17751m2 = C3033a.m17751m(Flags.f65390D, i4, "Flags.IS_CROSSINLINE.get(flags)");
            boolean m17751m3 = C3033a.m17751m(Flags.f65391E, i4, "Flags.IS_NOINLINE.get(flags)");
            TypeTable typeTable = this.f66094b.f66072f;
            Intrinsics.m32180i(typeTable, "typeTable");
            ProtoBuf.Type m33129a = valueParameter.m33093t() ? valueParameter.f65314i : (valueParameter.f65309d & 32) == 32 ? typeTable.m33129a(valueParameter.f65315j) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i2, annotations, m33585b, m33594e, m17751m, m17751m2, m17751m3, m33129a != null ? this.f66094b.f66067a.m33594e(m33129a) : null, SourceElement.f63979a));
            arrayList = arrayList2;
            i2 = i3;
        }
        return CollectionsKt.m32027j0(arrayList);
    }

    /* renamed from: l */
    public final boolean m33583l(@NotNull DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        if (!this.f66094b.f66069c.f66052d.mo33566d()) {
            return false;
        }
        List<VersionRequirement> mo33598E0 = deserializedMemberDescriptor.mo33598E0();
        if (!(mo33598E0 instanceof Collection) || !mo33598E0.isEmpty()) {
            for (VersionRequirement versionRequirement : mo33598E0) {
                if (Intrinsics.m32174c(versionRequirement.f65428a, new VersionRequirement.Version(1, 3, 0, 4)) && versionRequirement.f65429b == ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return z;
    }
}
