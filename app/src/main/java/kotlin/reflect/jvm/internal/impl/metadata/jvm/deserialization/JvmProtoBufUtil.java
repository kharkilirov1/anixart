package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JvmProtoBufUtil.kt */
/* loaded from: classes3.dex */
public final class JvmProtoBufUtil {

    /* renamed from: a */
    @NotNull
    public static final ExtensionRegistryLite f65583a;

    /* renamed from: b */
    public static final JvmProtoBufUtil f65584b = new JvmProtoBufUtil();

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        extensionRegistryLite.m33289a(JvmProtoBuf.f65480a);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65481b);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65482c);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65483d);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65484e);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65485f);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65486g);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65487h);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65488i);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65489j);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65490k);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65491l);
        extensionRegistryLite.m33289a(JvmProtoBuf.f65492m);
        f65583a = extensionRegistryLite;
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m33177d(@NotNull ProtoBuf.Property proto) {
        Intrinsics.m32180i(proto, "proto");
        JvmFlags jvmFlags = JvmFlags.f65572b;
        Flags.BooleanFlagField booleanFlagField = JvmFlags.f65571a;
        Object m33316k = proto.m33316k(JvmProtoBuf.f65484e);
        Intrinsics.m32175d(m33316k, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean mo33113b = booleanFlagField.mo33113b(((Number) m33316k).intValue());
        Intrinsics.m32175d(mo33113b, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return mo33113b.booleanValue();
    }

    @JvmStatic
    @NotNull
    /* renamed from: f */
    public static final Pair<JvmNameResolver, ProtoBuf.Class> m33178f(@NotNull String[] strArr, @NotNull String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.m33170a(strArr));
        JvmNameResolver m33184g = f65584b.m33184g(byteArrayInputStream, strArr2);
        ExtensionRegistryLite extensionRegistryLite = f65583a;
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Class.f64919A;
        MessageLite m33218d = abstractParser.m33218d(byteArrayInputStream, extensionRegistryLite);
        abstractParser.m33217c(m33218d);
        return new Pair<>(m33184g, (ProtoBuf.Class) m33218d);
    }

    @JvmStatic
    @NotNull
    /* renamed from: h */
    public static final Pair<JvmNameResolver, ProtoBuf.Package> m33179h(@NotNull String[] data, @NotNull String[] strings) {
        Intrinsics.m32180i(data, "data");
        Intrinsics.m32180i(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.m33170a(data));
        JvmNameResolver m33184g = f65584b.m33184g(byteArrayInputStream, strings);
        ExtensionRegistryLite extensionRegistryLite = f65583a;
        AbstractParser abstractParser = (AbstractParser) ProtoBuf.Package.f65095m;
        MessageLite m33218d = abstractParser.m33218d(byteArrayInputStream, extensionRegistryLite);
        abstractParser.m33217c(m33218d);
        return new Pair<>(m33184g, (ProtoBuf.Package) m33218d);
    }

    @Nullable
    /* renamed from: a */
    public final JvmMemberSignature.Method m33180a(@NotNull ProtoBuf.Constructor proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String m31989B;
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.f65480a;
        Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.m33120a(proto, generatedExtension);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.m33149j()) ? "<init>" : nameResolver.getString(jvmMethodSignature.f65508d);
        if (jvmMethodSignature == null || !jvmMethodSignature.m33148i()) {
            List<ProtoBuf.ValueParameter> list = proto.f64975f;
            Intrinsics.m32175d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            for (ProtoBuf.ValueParameter it : list) {
                JvmProtoBufUtil jvmProtoBufUtil = f65584b;
                Intrinsics.m32175d(it, "it");
                String m33183e = jvmProtoBufUtil.m33183e(ProtoTypeTableUtilKt.m33128g(it, typeTable), nameResolver);
                if (m33183e == null) {
                    return null;
                }
                arrayList.add(m33183e);
            }
            m31989B = CollectionsKt.m31989B(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            m31989B = nameResolver.getString(jvmMethodSignature.f65509e);
        }
        return new JvmMemberSignature.Method(string, m31989B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field m33181b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.m32180i(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.m32180i(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.m32180i(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f65483d
            java.lang.String r1 = "JvmProtoBuf.propertySignature"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.m33120a(r7, r0)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 == 0) goto L6c
            int r2 = r0.f65518c
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L2e
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.f65519d
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 != 0) goto L34
            if (r10 == 0) goto L34
            return r1
        L34:
            if (r0 == 0) goto L43
            int r10 = r0.f65496c
            r10 = r10 & r3
            if (r10 != r3) goto L3d
            r10 = 1
            goto L3e
        L3d:
            r10 = 0
        L3e:
            if (r10 == 0) goto L43
            int r10 = r0.f65497d
            goto L45
        L43:
            int r10 = r7.f65132g
        L45:
            if (r0 == 0) goto L58
            int r2 = r0.f65496c
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 == 0) goto L58
            int r7 = r0.f65498e
            java.lang.String r7 = r8.getString(r7)
            goto L62
        L58:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m33127f(r7, r9)
            java.lang.String r7 = r6.m33183e(r7, r8)
            if (r7 == 0) goto L6c
        L62:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r9 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r8 = r8.getString(r10)
            r9.<init>(r8, r7)
            return r9
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.m33181b(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    @Nullable
    /* renamed from: c */
    public final JvmMemberSignature.Method m33182c(@NotNull ProtoBuf.Function proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String m20q;
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.f65481b;
        Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.m33120a(proto, generatedExtension);
        int i2 = (jvmMethodSignature == null || !jvmMethodSignature.m33149j()) ? proto.f65057g : jvmMethodSignature.f65508d;
        if (jvmMethodSignature == null || !jvmMethodSignature.m33148i()) {
            List m31995H = CollectionsKt.m31995H(ProtoTypeTableUtilKt.m33125d(proto, typeTable));
            List<ProtoBuf.ValueParameter> list = proto.f65063m;
            Intrinsics.m32175d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            for (ProtoBuf.ValueParameter it : list) {
                Intrinsics.m32175d(it, "it");
                arrayList.add(ProtoTypeTableUtilKt.m33128g(it, typeTable));
            }
            List m32002O = CollectionsKt.m32002O(m31995H, arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(m32002O, 10));
            Iterator it2 = m32002O.iterator();
            while (it2.hasNext()) {
                String m33183e = f65584b.m33183e((ProtoBuf.Type) it2.next(), nameResolver);
                if (m33183e == null) {
                    return null;
                }
                arrayList2.add(m33183e);
            }
            String m33183e2 = m33183e(ProtoTypeTableUtilKt.m33126e(proto, typeTable), nameResolver);
            if (m33183e2 == null) {
                return null;
            }
            m20q = C0000a.m20q(new StringBuilder(), CollectionsKt.m31989B(arrayList2, "", "(", ")", 0, null, null, 56, null), m33183e2);
        } else {
            m20q = nameResolver.getString(jvmMethodSignature.f65509e);
        }
        return new JvmMemberSignature.Method(nameResolver.getString(i2), m20q);
    }

    /* renamed from: e */
    public final String m33183e(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.m33057t()) {
            return ClassMapperLite.m33171a(nameResolver.mo33117a(type.f65200j));
        }
        return null;
    }

    /* renamed from: g */
    public final JvmNameResolver m33184g(@NotNull InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((AbstractParser) JvmProtoBuf.StringTableTypes.f65531i).mo33216b(inputStream, f65583a);
        Intrinsics.m32175d(stringTableTypes, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new JvmNameResolver(stringTableTypes, strArr);
    }
}
