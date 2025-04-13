package kotlin.reflect.jvm.internal.components;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IteratorsJVMKt$iterator$1;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p033io.ByteStreamsKt;
import kotlin.p033io.CloseableKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.ModuleMappingUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ModuleMapping;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.PackageParts;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimePackagePartProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "", "moduleName", "", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getAnnotationsOnBinaryModule", "EmptyEnumeration", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimePackagePartProvider implements PackagePartProvider {

    /* renamed from: a */
    public final HashSet<String> f63704a = new HashSet<>();

    /* renamed from: b */
    public final HashMap<String, LinkedHashSet<String>> f63705b = new HashMap<>();

    /* renamed from: c */
    public final ClassLoader f63706c;

    /* compiled from: RuntimePackagePartProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;", "Ljava/util/Enumeration;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class EmptyEnumeration implements Enumeration {

        /* renamed from: a */
        public static final EmptyEnumeration f63707a = new EmptyEnumeration();

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException();
        }
    }

    public RuntimePackagePartProvider(@NotNull ClassLoader classLoader) {
        this.f63706c = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
    @NotNull
    /* renamed from: a */
    public synchronized List<String> mo32358a(@NotNull String str) {
        List<String> m32027j0;
        LinkedHashSet<String> linkedHashSet = this.f63705b.get(str);
        m32027j0 = linkedHashSet != null ? CollectionsKt.m32027j0(linkedHashSet) : null;
        if (m32027j0 == null) {
            m32027j0 = EmptyList.f63144b;
        }
        return m32027j0;
    }

    /* renamed from: b */
    public final synchronized void m32359b(@NotNull String str) {
        Enumeration<URL> resources;
        if (this.f63704a.add(str)) {
            String str2 = "META-INF/" + str + ".kotlin_module";
            try {
                resources = this.f63706c.getResources(str2);
            } catch (IOException unused) {
                resources = EmptyEnumeration.f63707a;
            }
            Intrinsics.m32175d(resources, "resources");
            CollectionsKt__IteratorsJVMKt$iterator$1 collectionsKt__IteratorsJVMKt$iterator$1 = new CollectionsKt__IteratorsJVMKt$iterator$1(resources);
            while (collectionsKt__IteratorsJVMKt$iterator$1.hasNext()) {
                try {
                    InputStream openStream = ((URL) collectionsKt__IteratorsJVMKt$iterator$1.next()).openStream();
                    if (openStream != null) {
                        try {
                            for (Map.Entry<String, PackageParts> entry : ModuleMappingUtilKt.m32931a(ModuleMapping.f65587e, ByteStreamsKt.m32137a(openStream), str2, DeserializationConfiguration.Default.f66066a, new Function1<JvmMetadataVersion, Unit>() { // from class: kotlin.reflect.jvm.internal.components.RuntimePackagePartProvider$registerModule$1$mapping$1
                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(JvmMetadataVersion jvmMetadataVersion) {
                                    JvmMetadataVersion version = jvmMetadataVersion;
                                    Intrinsics.m32180i(version, "version");
                                    throw new UnsupportedOperationException("Module was compiled with an incompatible version of Kotlin. The binary version of its metadata is " + version + ", expected version is " + JvmMetadataVersion.f65577g + ". Please update Kotlin to the latest version");
                                }
                            }).f65588a.entrySet()) {
                                String key = entry.getKey();
                                PackageParts value = entry.getValue();
                                HashMap<String, LinkedHashSet<String>> hashMap = this.f63705b;
                                LinkedHashSet<String> linkedHashSet = hashMap.get(key);
                                if (linkedHashSet == null) {
                                    linkedHashSet = new LinkedHashSet<>();
                                    hashMap.put(key, linkedHashSet);
                                }
                                Set<String> keySet = value.f65590a.keySet();
                                Intrinsics.m32175d(keySet, "packageParts.keys");
                                linkedHashSet.addAll(keySet);
                            }
                            CloseableKt.m32138a(openStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.m32138a(openStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (UnsupportedOperationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
            }
        }
    }
}
