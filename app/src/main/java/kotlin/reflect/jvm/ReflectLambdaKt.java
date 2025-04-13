package kotlin.reflect.jvm;

import java.io.ByteArrayInputStream;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: reflectLambda.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectLambdaKt {
    @Nullable
    /* renamed from: a */
    public static final <R> KFunction<R> m32253a(@NotNull Function<? extends R> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Metadata metadata = (Metadata) receiver$0.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] m31883d1 = metadata.m31883d1();
            if (m31883d1.length == 0) {
                m31883d1 = null;
            }
            if (m31883d1 != null) {
                String[] strings = metadata.m31884d2();
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f65583a;
                Intrinsics.m32180i(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.m33170a(m31883d1));
                JvmNameResolver m33184g = JvmProtoBufUtil.f65584b.m33184g(byteArrayInputStream, strings);
                ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f65583a;
                AbstractParser abstractParser = (AbstractParser) ProtoBuf.Function.f65052t;
                MessageLite m33218d = abstractParser.m33218d(byteArrayInputStream, extensionRegistryLite2);
                abstractParser.m33217c(m33218d);
                ProtoBuf.Function function = (ProtoBuf.Function) m33218d;
                JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(metadata.m31886mv(), (metadata.m31888xi() & 8) != 0);
                Class<?> cls = receiver$0.getClass();
                ProtoBuf.TypeTable typeTable = function.f65064n;
                Intrinsics.m32175d(typeTable, "proto.typeTable");
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) UtilKt.m32320c(cls, function, m33184g, new TypeTable(typeTable), jvmMetadataVersion, ReflectLambdaKt$reflect$descriptor$1.f63440d);
                if (simpleFunctionDescriptor != null) {
                    return new KFunctionImpl(EmptyContainerForLocal.f63441d, simpleFunctionDescriptor);
                }
            }
        }
        return null;
    }
}
