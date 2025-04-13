package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClassDeserializer.kt */
/* loaded from: classes3.dex */
public final class ClassDeserializer {

    /* renamed from: a */
    public final Function1<ClassKey, ClassDescriptor> f66041a;

    /* renamed from: b */
    public final DeserializationComponents f66042b;

    /* renamed from: d */
    public static final Companion f66040d = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final Set<ClassId> f66039c = SetsKt.m32079f(ClassId.m33188i(KotlinBuiltIns.f63730l.f63772c.m33207g()));

    /* compiled from: ClassDeserializer.kt */
    public static final class ClassKey {

        /* renamed from: a */
        @NotNull
        public final ClassId f66043a;

        /* renamed from: b */
        @Nullable
        public final ClassData f66044b;

        public ClassKey(@NotNull ClassId classId, @Nullable ClassData classData) {
            this.f66043a = classId;
            this.f66044b = classData;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof ClassKey) && Intrinsics.m32174c(this.f66043a, ((ClassKey) obj).f66043a);
        }

        public int hashCode() {
            return this.f66043a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents) {
        this.f66042b = deserializationComponents;
        this.f66041a = deserializationComponents.f66050b.mo33627g(new Function1<ClassKey, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ClassDescriptor invoke(ClassDeserializer.ClassKey classKey) {
                Object obj;
                DeserializationContext m33561a;
                ClassDeserializer.ClassKey key = classKey;
                Intrinsics.m32180i(key, "key");
                ClassDeserializer classDeserializer = ClassDeserializer.this;
                Set<ClassId> set = ClassDeserializer.f66039c;
                Objects.requireNonNull(classDeserializer);
                ClassId classId = key.f66043a;
                Iterator<ClassDescriptorFactory> it = classDeserializer.f66042b.f66060l.iterator();
                while (it.hasNext()) {
                    ClassDescriptor mo32427c = it.next().mo32427c(classId);
                    if (mo32427c != null) {
                        return mo32427c;
                    }
                }
                if (ClassDeserializer.f66039c.contains(classId)) {
                    return null;
                }
                ClassData classData = key.f66044b;
                if (classData == null) {
                    classData = classDeserializer.f66042b.f66053e.mo32911a(classId);
                }
                if (classData == null) {
                    return null;
                }
                NameResolver nameResolver = classData.f66035a;
                ProtoBuf.Class r11 = classData.f66036b;
                BinaryVersion binaryVersion = classData.f66037c;
                SourceElement sourceElement = classData.f66038d;
                ClassId m33192f = classId.m33192f();
                if (m33192f != null) {
                    ClassDescriptor m33558b = ClassDeserializer.m33558b(classDeserializer, m33192f, null, 2);
                    if (!(m33558b instanceof DeserializedClassDescriptor)) {
                        m33558b = null;
                    }
                    DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) m33558b;
                    if (deserializedClassDescriptor == null) {
                        return null;
                    }
                    Name m33193g = classId.m33193g();
                    Intrinsics.m32175d(m33193g, "classId.shortClassName");
                    if (!deserializedClassDescriptor.f66164l.m33614l().contains(m33193g)) {
                        return null;
                    }
                    m33561a = deserializedClassDescriptor.f66161i;
                } else {
                    PackageFragmentProvider packageFragmentProvider = classDeserializer.f66042b.f66055g;
                    FqName fqName = classId.f65593a;
                    Intrinsics.m32175d(fqName, "classId.packageFqName");
                    Iterator<T> it2 = packageFragmentProvider.mo32551a(fqName).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) obj;
                        boolean z = true;
                        if (packageFragmentDescriptor instanceof DeserializedPackageFragment) {
                            DeserializedPackageFragment deserializedPackageFragment = (DeserializedPackageFragment) packageFragmentDescriptor;
                            Name m33193g2 = classId.m33193g();
                            Intrinsics.m32175d(m33193g2, "classId.shortClassName");
                            Objects.requireNonNull(deserializedPackageFragment);
                            MemberScope mo32415p = ((DeserializedPackageFragmentImpl) deserializedPackageFragment).mo32415p();
                            if (!((mo32415p instanceof DeserializedMemberScope) && ((DeserializedMemberScope) mo32415p).m33614l().contains(m33193g2))) {
                                z = false;
                            }
                        }
                        if (z) {
                            break;
                        }
                    }
                    PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) obj;
                    if (packageFragmentDescriptor2 == null) {
                        return null;
                    }
                    DeserializationComponents deserializationComponents2 = classDeserializer.f66042b;
                    ProtoBuf.TypeTable typeTable = r11.f64939u;
                    Intrinsics.m32175d(typeTable, "classProto.typeTable");
                    TypeTable typeTable2 = new TypeTable(typeTable);
                    VersionRequirementTable.Companion companion = VersionRequirementTable.f65438c;
                    ProtoBuf.VersionRequirementTable versionRequirementTable = r11.f64941w;
                    Intrinsics.m32175d(versionRequirementTable, "classProto.versionRequirementTable");
                    m33561a = deserializationComponents2.m33561a(packageFragmentDescriptor2, nameResolver, typeTable2, companion.m33130a(versionRequirementTable), binaryVersion, null);
                }
                return new DeserializedClassDescriptor(m33561a, r11, nameResolver, binaryVersion, sourceElement);
            }
        });
    }

    @Nullable
    /* renamed from: b */
    public static ClassDescriptor m33558b(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i2) {
        Objects.requireNonNull(classDeserializer);
        return classDeserializer.f66041a.invoke(new ClassKey(classId, null));
    }

    @Nullable
    /* renamed from: a */
    public final ClassDescriptor m33559a(@NotNull ClassId classId, @Nullable ClassData classData) {
        Intrinsics.m32180i(classId, "classId");
        return this.f66041a.invoke(new ClassKey(classId, classData));
    }
}
