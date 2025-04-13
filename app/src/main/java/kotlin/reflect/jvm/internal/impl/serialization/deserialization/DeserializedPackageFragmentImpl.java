package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes3.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* renamed from: g */
    @NotNull
    public final NameResolverImpl f66078g;

    /* renamed from: h */
    @NotNull
    public final ProtoBasedClassDataFinder f66079h;

    /* renamed from: i */
    public ProtoBuf.PackageFragment f66080i;

    /* renamed from: j */
    public MemberScope f66081j;

    /* renamed from: k */
    public final BinaryVersion f66082k;

    /* renamed from: l */
    public final DeserializedContainerSource f66083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor module, @NotNull ProtoBuf.PackageFragment proto, @NotNull BinaryVersion metadataVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        Intrinsics.m32180i(fqName, "fqName");
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(module, "module");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        this.f66082k = metadataVersion;
        this.f66083l = null;
        ProtoBuf.StringTable stringTable = proto.f65115e;
        Intrinsics.m32175d(stringTable, "proto.strings");
        ProtoBuf.QualifiedNameTable qualifiedNameTable = proto.f65116f;
        Intrinsics.m32175d(qualifiedNameTable, "proto.qualifiedNames");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTable, qualifiedNameTable);
        this.f66078g = nameResolverImpl;
        this.f66079h = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new Function1<ClassId, SourceElement>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$classDataFinder$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public SourceElement invoke(ClassId classId) {
                ClassId it = classId;
                Intrinsics.m32180i(it, "it");
                DeserializedContainerSource deserializedContainerSource2 = DeserializedPackageFragmentImpl.this.f66083l;
                return deserializedContainerSource2 != null ? deserializedContainerSource2 : SourceElement.f63979a;
            }
        });
        this.f66080i = proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* renamed from: G */
    public ClassDataFinder mo33569G() {
        return this.f66079h;
    }

    /* renamed from: O */
    public void m33570O(@NotNull DeserializationComponents deserializationComponents) {
        ProtoBuf.PackageFragment packageFragment = this.f66080i;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f66080i = null;
        ProtoBuf.Package r4 = packageFragment.f65117g;
        Intrinsics.m32175d(r4, "proto.`package`");
        this.f66081j = new DeserializedPackageMemberScope(this, r4, this.f66078g, this.f66082k, this.f66083l, deserializationComponents, new Function0<List<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0013 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.List<? extends kotlin.reflect.jvm.internal.impl.name.Name> invoke() {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl.this
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoBasedClassDataFinder r0 = r0.f66079h
                    java.util.Map<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r0 = r0.f66115a
                    java.util.Set r0 = r0.keySet()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r0 = r0.iterator()
                L13:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L39
                    java.lang.Object r2 = r0.next()
                    r3 = r2
                    kotlin.reflect.jvm.internal.impl.name.ClassId r3 = (kotlin.reflect.jvm.internal.impl.name.ClassId) r3
                    boolean r4 = r3.m33194h()
                    if (r4 != 0) goto L32
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$Companion r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.f66040d
                    java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.f66039c
                    boolean r3 = r4.contains(r3)
                    if (r3 != 0) goto L32
                    r3 = 1
                    goto L33
                L32:
                    r3 = 0
                L33:
                    if (r3 == 0) goto L13
                    r1.add(r2)
                    goto L13
                L39:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r2 = 10
                    int r2 = kotlin.collections.CollectionsKt.m32032m(r1, r2)
                    r0.<init>(r2)
                    java.util.Iterator r1 = r1.iterator()
                L48:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L5c
                    java.lang.Object r2 = r1.next()
                    kotlin.reflect.jvm.internal.impl.name.ClassId r2 = (kotlin.reflect.jvm.internal.impl.name.ClassId) r2
                    kotlin.reflect.jvm.internal.impl.name.Name r2 = r2.m33193g()
                    r0.add(r2)
                    goto L48
                L5c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl$initialize$1.invoke():java.lang.Object");
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    /* renamed from: p */
    public MemberScope mo32415p() {
        MemberScope memberScope = this.f66081j;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.m32189r("_memberScope");
        throw null;
    }
}
