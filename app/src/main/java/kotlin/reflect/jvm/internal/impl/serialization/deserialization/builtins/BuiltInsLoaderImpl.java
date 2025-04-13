package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.CloseableKt;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* renamed from: b */
    public final BuiltInsResourceLoader f66148b = new BuiltInsResourceLoader();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    @NotNull
    /* renamed from: a */
    public PackageFragmentProvider mo32363a(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor builtInsModule, @NotNull Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider) {
        String str;
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(builtInsModule, "builtInsModule");
        Intrinsics.m32180i(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.m32180i(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.m32180i(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<FqName> set = KotlinBuiltIns.f63729k;
        Intrinsics.m32175d(set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        BuiltInsLoaderImpl$createPackageFragmentProvider$1 builtInsLoaderImpl$createPackageFragmentProvider$1 = new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f66148b);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(set, 10));
        for (FqName fqName : set) {
            BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.f66147k;
            Objects.requireNonNull(builtInSerializerProtocol);
            Intrinsics.m32180i(fqName, "fqName");
            StringBuilder sb = new StringBuilder();
            String str2 = fqName.f65597a.f65602a;
            Intrinsics.m32175d(str2, "fqName.asString()");
            sb.append(StringsKt.m33890P(str2, '.', JsonPointer.SEPARATOR, false, 4, null));
            sb.append("/");
            StringBuilder sb2 = new StringBuilder();
            if (fqName.m33197b()) {
                str = "default-package";
            } else {
                str = fqName.m33199d().f65606b;
                Intrinsics.m32175d(str, "fqName.shortName().asString()");
            }
            sb2.append(str);
            sb2.append(".");
            sb2.append("kotlin_builtins");
            sb.append(sb2.toString());
            String sb3 = sb.toString();
            InputStream inputStream = (InputStream) builtInsLoaderImpl$createPackageFragmentProvider$1.invoke(sb3);
            if (inputStream == null) {
                throw new IllegalStateException(C0000a.m14k("Resource not found in classpath: ", sb3));
            }
            try {
                BuiltInsBinaryVersion m33110a = BuiltInsBinaryVersion.f65371g.m33110a(inputStream);
                BuiltInsBinaryVersion builtInsBinaryVersion = BuiltInsBinaryVersion.f65370f;
                if (!m33110a.m33111a(builtInsBinaryVersion)) {
                    throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + builtInsBinaryVersion + ", actual " + m33110a + ". Please update Kotlin");
                }
                ExtensionRegistryLite extensionRegistryLite = builtInSerializerProtocol.f66016a;
                AbstractParser abstractParser = (AbstractParser) ProtoBuf.PackageFragment.f65112l;
                MessageLite m33218d = abstractParser.m33218d(inputStream, extensionRegistryLite);
                abstractParser.m33217c(m33218d);
                ProtoBuf.PackageFragment proto = (ProtoBuf.PackageFragment) m33218d;
                CloseableKt.m32138a(inputStream, null);
                Intrinsics.m32175d(proto, "proto");
                arrayList.add(new BuiltInsPackageFragmentImpl(fqName, storageManager, builtInsModule, proto, m33110a, null));
                builtInsLoaderImpl$createPackageFragmentProvider$1 = builtInsLoaderImpl$createPackageFragmentProvider$1;
            } finally {
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, builtInsModule);
        DeserializationConfiguration.Default r4 = DeserializationConfiguration.Default.f66066a;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol2 = BuiltInSerializerProtocol.f66147k;
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager, builtInsModule, r4, deserializedClassDataFinder, new AnnotationAndConstantLoaderImpl(builtInsModule, notFoundClasses, builtInSerializerProtocol2), packageFragmentProviderImpl, LocalClassifierTypeSettings.Default.f66092a, ErrorReporter.f66086a, LookupTracker.DO_NOTHING.f64271a, FlexibleTypeDeserializer.ThrowException.f66087a, classDescriptorFactories, notFoundClasses, ContractDeserializer.Companion.f66047a, additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol2.f66016a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).m33570O(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }
}
