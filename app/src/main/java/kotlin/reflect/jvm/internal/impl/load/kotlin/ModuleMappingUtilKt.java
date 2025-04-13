package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmModuleProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BinaryModuleData;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ModuleMapping;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ModuleMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.PackageParts;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModuleMappingUtil.kt */
/* loaded from: classes3.dex */
public final class ModuleMappingUtilKt {
    @NotNull
    /* renamed from: a */
    public static final ModuleMapping m32931a(@NotNull ModuleMapping.Companion companion, @Nullable byte[] bArr, @NotNull String debugName, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull Function1<? super JvmMetadataVersion, Unit> reportIncompatibleVersionError) {
        String str;
        Intrinsics.m32180i(debugName, "debugName");
        Intrinsics.m32180i(reportIncompatibleVersionError, "reportIncompatibleVersionError");
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int readInt = dataInputStream.readInt();
            int[] iArr = new int[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                iArr[i2] = dataInputStream.readInt();
            }
            JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(Arrays.copyOf(iArr, readInt));
            if (!jvmMetadataVersion.m33176b()) {
                reportIncompatibleVersionError.invoke(jvmMetadataVersion);
                throw null;
            }
            int i3 = 1;
            JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(iArr, ((VersionSpecificBehaviorKt.m33131a(jvmMetadataVersion) ? dataInputStream.readInt() : 0) & 1) != 0);
            if (!jvmMetadataVersion2.m33176b()) {
                reportIncompatibleVersionError.invoke(jvmMetadataVersion2);
                throw null;
            }
            AbstractParser abstractParser = (AbstractParser) JvmModuleProtoBuf.Module.f65441m;
            MessageLite m33218d = abstractParser.m33218d(dataInputStream, AbstractParser.f65617a);
            abstractParser.m33217c(m33218d);
            JvmModuleProtoBuf.Module module = (JvmModuleProtoBuf.Module) m33218d;
            if (module == null) {
                return ModuleMapping.f65585c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (JvmModuleProtoBuf.PackageParts proto : module.f65444d) {
                Intrinsics.m32175d(proto, "proto");
                String packageFqName = proto.m33137i();
                Intrinsics.m32175d(packageFqName, "packageFqName");
                Object obj = linkedHashMap.get(packageFqName);
                if (obj == null) {
                    obj = new PackageParts(packageFqName);
                    linkedHashMap.put(packageFqName, obj);
                }
                PackageParts packageParts = (PackageParts) obj;
                LazyStringList lazyStringList = proto.f65464e;
                Intrinsics.m32175d(lazyStringList, "proto.shortClassNameList");
                int i4 = 0;
                for (String partShortName : lazyStringList) {
                    List<Integer> list = proto.f65465f;
                    Intrinsics.m32175d(list, "proto.multifileFacadeShortNameIdList");
                    Integer num = (Integer) CollectionsKt.m32048y(list, i4);
                    Integer valueOf = num != null ? Integer.valueOf(num.intValue() - i3) : null;
                    if (valueOf != null) {
                        LazyStringList lazyStringList2 = proto.f65467h;
                        Intrinsics.m32175d(lazyStringList2, "proto.multifileFacadeShortNameList");
                        str = (String) CollectionsKt.m32048y(lazyStringList2, valueOf.intValue());
                    } else {
                        str = null;
                    }
                    String m33185a = str != null ? ModuleMappingKt.m33185a(packageFqName, str) : null;
                    Intrinsics.m32175d(partShortName, "partShortName");
                    String partInternalName = ModuleMappingKt.m33185a(packageFqName, partShortName);
                    Intrinsics.m32180i(partInternalName, "partInternalName");
                    packageParts.f65590a.put(partInternalName, m33185a);
                    i4++;
                    i3 = 1;
                }
                LazyStringList lazyStringList3 = proto.f65468i;
                Intrinsics.m32175d(lazyStringList3, "proto.classWithJvmPackageNameShortNameList");
                int i5 = 0;
                for (String partShortName2 : lazyStringList3) {
                    List<Integer> list2 = proto.f65469j;
                    Intrinsics.m32175d(list2, "proto.classWithJvmPackageNamePackageIdList");
                    Integer num2 = (Integer) CollectionsKt.m32048y(list2, i5);
                    if (num2 == null) {
                        List<Integer> list3 = proto.f65469j;
                        Intrinsics.m32175d(list3, "proto.classWithJvmPackageNamePackageIdList");
                        num2 = (Integer) CollectionsKt.m31992E(list3);
                    }
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        LazyStringList lazyStringList4 = module.f65446f;
                        Intrinsics.m32175d(lazyStringList4, "moduleProto.jvmPackageNameList");
                        String str2 = (String) CollectionsKt.m32048y(lazyStringList4, intValue);
                        if (str2 != null) {
                            Intrinsics.m32175d(partShortName2, "partShortName");
                            String partInternalName2 = ModuleMappingKt.m33185a(str2, partShortName2);
                            Intrinsics.m32180i(partInternalName2, "partInternalName");
                            packageParts.f65590a.put(partInternalName2, null);
                        }
                    }
                    i5++;
                }
                i3 = 1;
            }
            for (JvmModuleProtoBuf.PackageParts proto2 : module.f65445e) {
                Intrinsics.m32175d(proto2, "proto");
                String m33137i = proto2.m33137i();
                Intrinsics.m32175d(m33137i, "proto.packageFqName");
                Object obj2 = linkedHashMap.get(m33137i);
                if (obj2 == null) {
                    String m33137i2 = proto2.m33137i();
                    Intrinsics.m32175d(m33137i2, "proto.packageFqName");
                    obj2 = new PackageParts(m33137i2);
                    linkedHashMap.put(m33137i, obj2);
                }
                PackageParts packageParts2 = (PackageParts) obj2;
                LazyStringList lazyStringList5 = proto2.f65464e;
                Intrinsics.m32175d(lazyStringList5, "proto.shortClassNameList");
                for (String shortName : lazyStringList5) {
                    Intrinsics.m32180i(shortName, "shortName");
                    Set<String> set = packageParts2.f65591b;
                    if (set == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
                    }
                    TypeIntrinsics.m32214c(set).add(shortName);
                }
            }
            ProtoBuf.StringTable stringTable = module.f65447g;
            Intrinsics.m32175d(stringTable, "moduleProto.stringTable");
            ProtoBuf.QualifiedNameTable qualifiedNameTable = module.f65448h;
            Intrinsics.m32175d(qualifiedNameTable, "moduleProto.qualifiedNameTable");
            NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTable, qualifiedNameTable);
            List<ProtoBuf.Annotation> list4 = module.f65449i;
            Intrinsics.m32175d(list4, "moduleProto.annotationList");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list4, 10));
            for (ProtoBuf.Annotation proto3 : list4) {
                Intrinsics.m32175d(proto3, "proto");
                arrayList.add(nameResolverImpl.mo33117a(proto3.f64857d));
            }
            return new ModuleMapping(linkedHashMap, new BinaryModuleData(arrayList), debugName, null);
        } catch (IOException unused) {
            return ModuleMapping.f65586d;
        }
    }
}
