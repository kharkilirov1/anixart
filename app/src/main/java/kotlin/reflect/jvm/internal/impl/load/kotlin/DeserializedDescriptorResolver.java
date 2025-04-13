package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedDescriptorResolver.kt */
/* loaded from: classes3.dex */
public final class DeserializedDescriptorResolver {

    /* renamed from: a */
    @NotNull
    public DeserializationComponents f64787a;

    /* renamed from: g */
    public static final Companion f64786g = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Set<KotlinClassHeader.Kind> f64781b = SetsKt.m32079f(KotlinClassHeader.Kind.CLASS);

    /* renamed from: c */
    public static final Set<KotlinClassHeader.Kind> f64782c = SetsKt.m32080g(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* renamed from: d */
    public static final JvmMetadataVersion f64783d = new JvmMetadataVersion(1, 1, 2);

    /* renamed from: e */
    public static final JvmMetadataVersion f64784e = new JvmMetadataVersion(1, 1, 11);

    /* renamed from: f */
    @NotNull
    public static final JvmMetadataVersion f64785f = new JvmMetadataVersion(1, 1, 13);

    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Nullable
    /* renamed from: a */
    public final MemberScope m32906a(@NotNull PackageFragmentDescriptor descriptor, @NotNull KotlinJvmBinaryClass kotlinClass) {
        Pair<JvmNameResolver, ProtoBuf.Package> pair;
        Intrinsics.m32180i(descriptor, "descriptor");
        Intrinsics.m32180i(kotlinClass, "kotlinClass");
        String[] m32910e = m32910e(kotlinClass, f64782c);
        if (m32910e != null) {
            String[] strArr = kotlinClass.mo32349b().f64823e;
            try {
            } catch (Throwable th) {
                DeserializationComponents deserializationComponents = this.f64787a;
                if (deserializationComponents == null) {
                    Intrinsics.m32189r("components");
                    throw null;
                }
                if (deserializationComponents.f66052d.mo33563a() || kotlinClass.mo32349b().f64820b.m33176b()) {
                    throw th;
                }
                pair = null;
            }
            if (strArr != null) {
                try {
                    pair = JvmProtoBufUtil.m33179h(m32910e, strArr);
                    if (pair == null) {
                        return null;
                    }
                    JvmNameResolver jvmNameResolver = pair.f63055b;
                    ProtoBuf.Package r1 = pair.f63056c;
                    JvmPackagePartSource jvmPackagePartSource = new JvmPackagePartSource(kotlinClass, r1, jvmNameResolver, m32907b(kotlinClass), m32908c(kotlinClass));
                    JvmMetadataVersion jvmMetadataVersion = kotlinClass.mo32349b().f64820b;
                    DeserializationComponents deserializationComponents2 = this.f64787a;
                    if (deserializationComponents2 != null) {
                        return new DeserializedPackageMemberScope(descriptor, r1, jvmNameResolver, jvmMetadataVersion, jvmPackagePartSource, deserializationComponents2, new Function0<List<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$createKotlinPackagePartScope$2
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ List<? extends Name> invoke() {
                                return EmptyList.f63144b;
                            }
                        });
                    }
                    Intrinsics.m32189r("components");
                    throw null;
                } catch (InvalidProtocolBufferException e2) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.mo32348a(), e2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final IncompatibleVersionErrorData<JvmMetadataVersion> m32907b(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.f64787a;
        if (deserializationComponents == null) {
            Intrinsics.m32189r("components");
            throw null;
        }
        if (deserializationComponents.f66052d.mo33563a() || kotlinJvmBinaryClass.mo32349b().f64820b.m33176b()) {
            return null;
        }
        return new IncompatibleVersionErrorData<>(kotlinJvmBinaryClass.mo32349b().f64820b, JvmMetadataVersion.f65577g, kotlinJvmBinaryClass.mo32348a(), kotlinJvmBinaryClass.mo32352g());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m32908c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r7) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r0 = r6.f64787a
            r1 = 0
            java.lang.String r2 = "components"
            if (r0 == 0) goto L63
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r0 = r0.f66052d
            boolean r0 = r0.mo33564b()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2e
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r7.mo32349b()
            int r0 = r0.f64825g
            r0 = r0 & 2
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L5e
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r7.mo32349b()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r0 = r0.f64820b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f64783d
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r0, r5)
            if (r0 != 0) goto L5e
        L2e:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r0 = r6.f64787a
            if (r0 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r0 = r0.f66052d
            boolean r0 = r0.mo33563a()
            if (r0 != 0) goto L59
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r7.mo32349b()
            int r0 = r0.f64825g
            r0 = r0 & 2
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            if (r0 == 0) goto L59
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r7 = r7.mo32349b()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r7 = r7.f64820b
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f64784e
            boolean r7 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r0)
            if (r7 == 0) goto L59
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r7 == 0) goto L5d
            goto L5e
        L5d:
            r3 = 0
        L5e:
            return r3
        L5f:
            kotlin.jvm.internal.Intrinsics.m32189r(r2)
            throw r1
        L63:
            kotlin.jvm.internal.Intrinsics.m32189r(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.m32908c(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass):boolean");
    }

    @Nullable
    /* renamed from: d */
    public final ClassData m32909d(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String[] strArr;
        Pair<JvmNameResolver, ProtoBuf.Class> pair;
        String[] m32910e = m32910e(kotlinJvmBinaryClass, f64781b);
        if (m32910e == null || (strArr = kotlinJvmBinaryClass.mo32349b().f64823e) == null) {
            return null;
        }
        try {
            try {
                pair = JvmProtoBufUtil.m33178f(m32910e, strArr);
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalStateException("Could not read data from " + kotlinJvmBinaryClass.mo32348a(), e2);
            }
        } catch (Throwable th) {
            DeserializationComponents deserializationComponents = this.f64787a;
            if (deserializationComponents == null) {
                Intrinsics.m32189r("components");
                throw null;
            }
            if (deserializationComponents.f66052d.mo33563a() || kotlinJvmBinaryClass.mo32349b().f64820b.m33176b()) {
                throw th;
            }
            pair = null;
        }
        if (pair != null) {
            return new ClassData(pair.f63055b, pair.f63056c, kotlinJvmBinaryClass.mo32349b().f64820b, new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, m32907b(kotlinJvmBinaryClass), m32908c(kotlinJvmBinaryClass)));
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final String[] m32910e(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull Set<? extends KotlinClassHeader.Kind> expectedKinds) {
        Intrinsics.m32180i(expectedKinds, "expectedKinds");
        KotlinClassHeader mo32349b = kotlinJvmBinaryClass.mo32349b();
        String[] strArr = mo32349b.f64821c;
        if (strArr == null) {
            strArr = mo32349b.f64822d;
        }
        if (strArr == null) {
            return null;
        }
        if (!expectedKinds.contains(mo32349b.f64819a)) {
            strArr = null;
        }
        return strArr;
    }
}
