package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes3.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* renamed from: l */
    public static final /* synthetic */ KProperty[] f66202l = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DeserializedMemberScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DeserializedMemberScope.class), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};

    /* renamed from: b */
    public final Map<Name, byte[]> f66203b;

    /* renamed from: c */
    public final Map<Name, byte[]> f66204c;

    /* renamed from: d */
    public final Map<Name, byte[]> f66205d;

    /* renamed from: e */
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f66206e;

    /* renamed from: f */
    public final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f66207f;

    /* renamed from: g */
    public final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f66208g;

    /* renamed from: h */
    public final NotNullLazyValue f66209h;

    /* renamed from: i */
    public final NotNullLazyValue f66210i;

    /* renamed from: j */
    @NotNull
    public final NotNullLazyValue f66211j;

    /* renamed from: k */
    @NotNull
    public final DeserializationContext f66212k;

    public DeserializedMemberScope(@NotNull DeserializationContext c2, @NotNull Collection<ProtoBuf.Function> collection, @NotNull Collection<ProtoBuf.Property> collection2, @NotNull Collection<ProtoBuf.TypeAlias> collection3, @NotNull final Function0<? extends Collection<Name>> function0) {
        Map<Name, byte[]> map;
        Intrinsics.m32180i(c2, "c");
        this.f66212k = c2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : collection) {
            Name m33585b = NameResolverUtilKt.m33585b(this.f66212k.f66070d, ((ProtoBuf.Function) ((MessageLite) obj)).f65057g);
            Object obj2 = linkedHashMap.get(m33585b);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(m33585b, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f66203b = m33616p(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : collection2) {
            Name m33585b2 = NameResolverUtilKt.m33585b(this.f66212k.f66070d, ((ProtoBuf.Property) ((MessageLite) obj3)).f65132g);
            Object obj4 = linkedHashMap2.get(m33585b2);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(m33585b2, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.f66204c = m33616p(linkedHashMap2);
        if (this.f66212k.f66069c.f66052d.mo33565c()) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : collection3) {
                Name m33585b3 = NameResolverUtilKt.m33585b(this.f66212k.f66070d, ((ProtoBuf.TypeAlias) ((MessageLite) obj5)).f65250f);
                Object obj6 = linkedHashMap3.get(m33585b3);
                if (obj6 == null) {
                    obj6 = new ArrayList();
                    linkedHashMap3.put(m33585b3, obj6);
                }
                ((List) obj6).add(obj5);
            }
            map = m33616p(linkedHashMap3);
        } else {
            map = EmptyMap.f63145b;
        }
        this.f66205d = map;
        this.f66206e = this.f66212k.f66069c.f66050b.mo33626f(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                Iterable<ProtoBuf.Function> iterable;
                Name it = name;
                Intrinsics.m32180i(it, "it");
                final DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
                Map<Name, byte[]> map2 = deserializedMemberScope.f66203b;
                final Parser<ProtoBuf.Function> parser = ProtoBuf.Function.f65052t;
                Intrinsics.m32175d(parser, "ProtoBuf.Function.PARSER");
                byte[] bArr = map2.get(it);
                if (bArr != null) {
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    iterable = SequencesKt.m33831A(SequencesKt.m33848p(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            return (MessageLite) parser.mo33216b(byteArrayInputStream, deserializedMemberScope.f66212k.f66069c.f66065q);
                        }
                    }));
                } else {
                    iterable = EmptyList.f63144b;
                }
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Function it2 : iterable) {
                    MemberDeserializer memberDeserializer = deserializedMemberScope.f66212k.f66068b;
                    Intrinsics.m32175d(it2, "it");
                    arrayList.add(memberDeserializer.m33580i(it2));
                }
                deserializedMemberScope.mo33606i(it, arrayList);
                return CollectionsKt.m33772b(arrayList);
            }
        });
        this.f66207f = this.f66212k.f66069c.f66050b.mo33626f(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$properties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends PropertyDescriptor> invoke(Name name) {
                Iterable<ProtoBuf.Property> iterable;
                Name it = name;
                Intrinsics.m32180i(it, "it");
                final DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
                Map<Name, byte[]> map2 = deserializedMemberScope.f66204c;
                final Parser<ProtoBuf.Property> parser = ProtoBuf.Property.f65127t;
                Intrinsics.m32175d(parser, "ProtoBuf.Property.PARSER");
                byte[] bArr = map2.get(it);
                if (bArr != null) {
                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    iterable = SequencesKt.m33831A(SequencesKt.m33848p(new Function0() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            return (MessageLite) parser.mo33216b(byteArrayInputStream, deserializedMemberScope.f66212k.f66069c.f66065q);
                        }
                    }));
                } else {
                    iterable = EmptyList.f63144b;
                }
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Property it2 : iterable) {
                    MemberDeserializer memberDeserializer = deserializedMemberScope.f66212k.f66068b;
                    Intrinsics.m32175d(it2, "it");
                    arrayList.add(memberDeserializer.m33581j(it2));
                }
                deserializedMemberScope.mo33607j(it, arrayList);
                return CollectionsKt.m33772b(arrayList);
            }
        });
        this.f66208g = this.f66212k.f66069c.f66050b.mo33627g(new Function1<Name, TypeAliasDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$typeAliasByName$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public TypeAliasDescriptor invoke(Name name) {
                DeserializationContext m33568a;
                ProtoBuf.Type underlyingType;
                ProtoBuf.Type expandedType;
                Name it = name;
                Intrinsics.m32180i(it, "it");
                DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
                byte[] bArr = deserializedMemberScope.f66205d.get(it);
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = null;
                if (bArr != null) {
                    ProtoBuf.TypeAlias typeAlias = (ProtoBuf.TypeAlias) ((AbstractParser) ProtoBuf.TypeAlias.f65246q).mo33216b(new ByteArrayInputStream(bArr), deserializedMemberScope.f66212k.f66069c.f66065q);
                    if (typeAlias != null) {
                        MemberDeserializer memberDeserializer = deserializedMemberScope.f66212k.f66068b;
                        Objects.requireNonNull(memberDeserializer);
                        int i2 = Annotations.f64023H1;
                        Annotations.Companion companion = Annotations.Companion.f64025b;
                        List<ProtoBuf.Annotation> list = typeAlias.f65256l;
                        Intrinsics.m32175d(list, "proto.annotationList");
                        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.m32032m(list, 10));
                        for (ProtoBuf.Annotation it2 : list) {
                            AnnotationDeserializer annotationDeserializer = memberDeserializer.f66093a;
                            Intrinsics.m32175d(it2, "it");
                            arrayList.add(annotationDeserializer.m33555a(it2, memberDeserializer.f66094b.f66070d));
                        }
                        Annotations m32594a = companion.m32594a(arrayList);
                        Visibility m33589c = ProtoEnumFlags.f66128a.m33589c(Flags.f65398c.mo33113b(typeAlias.f65249e));
                        DeserializationContext deserializationContext = memberDeserializer.f66094b;
                        StorageManager storageManager = deserializationContext.f66069c.f66050b;
                        DeclarationDescriptor declarationDescriptor = deserializationContext.f66071e;
                        Name m33585b4 = NameResolverUtilKt.m33585b(deserializationContext.f66070d, typeAlias.f65250f);
                        DeserializationContext deserializationContext2 = memberDeserializer.f66094b;
                        deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager, declarationDescriptor, m32594a, m33585b4, m33589c, typeAlias, deserializationContext2.f66070d, deserializationContext2.f66072f, deserializationContext2.f66073g, deserializationContext2.f66075i);
                        DeserializationContext deserializationContext3 = memberDeserializer.f66094b;
                        List<ProtoBuf.TypeParameter> list2 = typeAlias.f65251g;
                        Intrinsics.m32175d(list2, "proto.typeParameterList");
                        m33568a = deserializationContext3.m33568a(deserializedTypeAliasDescriptor, list2, (r14 & 4) != 0 ? deserializationContext3.f66070d : null, (r14 & 8) != 0 ? deserializationContext3.f66072f : null, (r14 & 16) != 0 ? deserializationContext3.f66073g : null, (r14 & 32) != 0 ? deserializationContext3.f66074h : null);
                        List<TypeParameterDescriptor> m33592c = m33568a.f66067a.m33592c();
                        TypeDeserializer typeDeserializer = m33568a.f66067a;
                        TypeTable typeTable = memberDeserializer.f66094b.f66072f;
                        Intrinsics.m32180i(typeTable, "typeTable");
                        if (typeAlias.m33074t()) {
                            underlyingType = typeAlias.f65252h;
                            Intrinsics.m32175d(underlyingType, "underlyingType");
                        } else {
                            if (!((typeAlias.f65248d & 8) == 8)) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
                            }
                            underlyingType = typeTable.m33129a(typeAlias.f65253i);
                        }
                        SimpleType m33593d = typeDeserializer.m33593d(underlyingType);
                        TypeDeserializer typeDeserializer2 = m33568a.f66067a;
                        TypeTable typeTable2 = memberDeserializer.f66094b.f66072f;
                        Intrinsics.m32180i(typeTable2, "typeTable");
                        if (typeAlias.m33073s()) {
                            expandedType = typeAlias.f65254j;
                            Intrinsics.m32175d(expandedType, "expandedType");
                        } else {
                            if (!((typeAlias.f65248d & 32) == 32)) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
                            }
                            expandedType = typeTable2.m33129a(typeAlias.f65255k);
                        }
                        deserializedTypeAliasDescriptor.m33617O(m33592c, m33593d, typeDeserializer2.m33593d(expandedType), memberDeserializer.m33573b(deserializedTypeAliasDescriptor, m33568a.f66067a));
                    }
                }
                return deserializedTypeAliasDescriptor;
            }
        });
        this.f66209h = this.f66212k.f66069c.f66050b.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return SetsKt.m32077d(DeserializedMemberScope.this.f66203b.keySet(), DeserializedMemberScope.this.mo33609m());
            }
        });
        this.f66210i = this.f66212k.f66069c.f66050b.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$variableNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return SetsKt.m32077d(DeserializedMemberScope.this.f66204c.keySet(), DeserializedMemberScope.this.mo33610n());
            }
        });
        this.f66211j = this.f66212k.f66069c.f66050b.mo33623c(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$classNames$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Set<? extends Name> invoke() {
                return kotlin.collections.CollectionsKt.m32035n0((Iterable) Function0.this.invoke());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: a */
    public Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return !mo32615b().contains(name) ? EmptyList.f63144b : this.f66206e.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: b */
    public Set<Name> mo32615b() {
        return (Set) StorageKt.m33635a(this.f66209h, f66202l[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        if (mo33615o(name)) {
            return this.f66212k.f66069c.m33562b(mo33608k(name));
        }
        if (this.f66205d.keySet().contains(name)) {
            return this.f66208g.invoke(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: e */
    public Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        return !mo32618f().contains(name) ? EmptyList.f63144b : this.f66207f.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    /* renamed from: f */
    public Set<Name> mo32618f() {
        return (Set) StorageKt.m33635a(this.f66210i, f66202l[1]);
    }

    /* renamed from: g */
    public abstract void mo33605g(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    /* renamed from: h */
    public final Collection<DeclarationDescriptor> m33613h(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation lookupLocation) {
        TypeAliasDescriptor invoke;
        ClassDescriptor m33562b;
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65965e)) {
            mo33605g(arrayList, nameFilter);
        }
        if (kindFilter.m33547a(DescriptorKindFilter.f65969i)) {
            Set<Name> mo32618f = mo32618f();
            ArrayList arrayList2 = new ArrayList();
            for (Name name : mo32618f) {
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList2.addAll(mo32617e(name, lookupLocation));
                }
            }
            kotlin.collections.CollectionsKt.m32015b0(arrayList2, MemberComparator.NameAndTypeMemberComparator.f65890b);
            arrayList.addAll(arrayList2);
        }
        DescriptorKindFilter.Companion companion2 = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65968h)) {
            Set<Name> mo32615b = mo32615b();
            ArrayList arrayList3 = new ArrayList();
            for (Name name2 : mo32615b) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    arrayList3.addAll(mo32614a(name2, lookupLocation));
                }
            }
            kotlin.collections.CollectionsKt.m32015b0(arrayList3, MemberComparator.NameAndTypeMemberComparator.f65890b);
            arrayList.addAll(arrayList3);
        }
        DescriptorKindFilter.Companion companion3 = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65971k)) {
            for (Name name3 : m33614l()) {
                if (nameFilter.invoke(name3).booleanValue() && (m33562b = this.f66212k.f66069c.m33562b(mo33608k(name3))) != null) {
                    arrayList.add(m33562b);
                }
            }
        }
        DescriptorKindFilter.Companion companion4 = DescriptorKindFilter.f65979s;
        if (kindFilter.m33547a(DescriptorKindFilter.f65966f)) {
            for (Name name4 : this.f66205d.keySet()) {
                if (nameFilter.invoke(name4).booleanValue() && (invoke = this.f66208g.invoke(name4)) != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return CollectionsKt.m33772b(arrayList);
    }

    /* renamed from: i */
    public void mo33606i(@NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
        Intrinsics.m32180i(name, "name");
    }

    /* renamed from: j */
    public void mo33607j(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        Intrinsics.m32180i(name, "name");
    }

    @NotNull
    /* renamed from: k */
    public abstract ClassId mo33608k(@NotNull Name name);

    @NotNull
    /* renamed from: l */
    public final Set<Name> m33614l() {
        return (Set) StorageKt.m33635a(this.f66211j, f66202l[2]);
    }

    @NotNull
    /* renamed from: m */
    public abstract Set<Name> mo33609m();

    @NotNull
    /* renamed from: n */
    public abstract Set<Name> mo33610n();

    /* renamed from: o */
    public boolean mo33615o(@NotNull Name name) {
        return m33614l().contains(name);
    }

    /* renamed from: p */
    public final Map<Name, byte[]> m33616p(@NotNull Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.m32062g(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.m32032m(iterable, 10));
            for (AbstractMessageLite abstractMessageLite : iterable) {
                int mo32957c = abstractMessageLite.mo32957c();
                int m33267g = CodedOutputStream.m33267g(mo32957c) + mo32957c;
                if (m33267g > 4096) {
                    m33267g = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                CodedOutputStream m33270k = CodedOutputStream.m33270k(byteArrayOutputStream, m33267g);
                m33270k.m33288z(mo32957c);
                abstractMessageLite.mo32960f(m33270k);
                m33270k.m33273j();
                arrayList.add(Unit.f63088a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }
}
