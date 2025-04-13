package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedPackageMemberScope.kt */
/* loaded from: classes3.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    /* renamed from: m */
    public final FqName f66225m;

    /* renamed from: n */
    public final PackageFragmentDescriptor f66226n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeserializedPackageMemberScope(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r18, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>> r21) {
        /*
            r14 = this;
            r6 = r14
            r0 = r16
            java.lang.String r1 = "nameResolver"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.m32180i(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r18
            kotlin.jvm.internal.Intrinsics.m32180i(r3, r1)
            java.lang.String r1 = "components"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.m32180i(r4, r1)
            java.lang.String r1 = "classNames"
            r5 = r21
            kotlin.jvm.internal.Intrinsics.m32180i(r5, r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r10 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r1 = r0.f65101h
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.Intrinsics.m32175d(r1, r7)
            r10.<init>(r1)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable$Companion r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.f65438c
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r0.f65102i
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.m32175d(r7, r8)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r11 = r1.m33130a(r7)
            r7 = r20
            r8 = r15
            r9 = r17
            r12 = r18
            r13 = r19
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r7.m33561a(r8, r9, r10, r11, r12, r13)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r0.f65098e
            java.lang.String r3 = "proto.functionList"
            kotlin.jvm.internal.Intrinsics.m32175d(r2, r3)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r3 = r0.f65099f
            java.lang.String r4 = "proto.propertyList"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r4 = r0.f65100g
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.Intrinsics.m32175d(r4, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r15
            r6.f66226n = r0
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r15.mo32550d()
            r6.f66225m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope.<init>(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents, kotlin.jvm.functions.Function0):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* renamed from: c */
    public ClassifierDescriptor mo32732c(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(location, "location");
        UtilsKt.m32660b(this.f66212k.f66069c.f66058j, location, this.f66226n, name);
        return super.mo32732c(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: d */
    public Collection mo32616d(DescriptorKindFilter kindFilter, Function1 nameFilter) {
        Intrinsics.m32180i(kindFilter, "kindFilter");
        Intrinsics.m32180i(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> m33613h = m33613h(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> iterable = this.f66212k.f66069c.f66060l;
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.m32020g(arrayList, it.next().mo32425a(this.f66225m));
        }
        return CollectionsKt.m32002O(m33613h, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* renamed from: g */
    public void mo33605g(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* renamed from: k */
    public ClassId mo33608k(@NotNull Name name) {
        Intrinsics.m32180i(name, "name");
        return new ClassId(this.f66225m, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* renamed from: m */
    public Set<Name> mo33609m() {
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    @NotNull
    /* renamed from: n */
    public Set<Name> mo33610n() {
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* renamed from: o */
    public boolean mo33615o(@NotNull Name name) {
        boolean z;
        if (!m33614l().contains(name)) {
            Iterable<ClassDescriptorFactory> iterable = this.f66212k.f66069c.f66060l;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator<ClassDescriptorFactory> it = iterable.iterator();
                while (it.hasNext()) {
                    if (it.next().mo32426b(this.f66225m, name)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
