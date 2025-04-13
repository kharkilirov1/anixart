package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* compiled from: reflectLambda.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, m31884d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/SimpleFunctionDescriptor;", "R", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Function;", "Lkotlin/ParameterName;", "name", "proto", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {

    /* renamed from: d */
    public static final ReflectLambdaKt$reflect$descriptor$1 f63440d = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* renamed from: getName */
    public final String getF63590i() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public SimpleFunctionDescriptor invoke(MemberDeserializer memberDeserializer, ProtoBuf.Function function) {
        MemberDeserializer p1 = memberDeserializer;
        ProtoBuf.Function p2 = function;
        Intrinsics.m32180i(p1, "p1");
        Intrinsics.m32180i(p2, "p2");
        return p1.m33580i(p2);
    }
}
