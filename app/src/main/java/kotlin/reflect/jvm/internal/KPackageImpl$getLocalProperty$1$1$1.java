package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* compiled from: KPackageImpl.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0015\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, m31884d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "Lkotlin/ParameterName;", "name", "proto", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class KPackageImpl$getLocalProperty$1$1$1 extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

    /* renamed from: d */
    public static final KPackageImpl$getLocalProperty$1$1$1 f63563d = new KPackageImpl$getLocalProperty$1$1$1();

    public KPackageImpl$getLocalProperty$1$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* renamed from: getName */
    public final String getF63590i() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public PropertyDescriptor invoke(MemberDeserializer memberDeserializer, ProtoBuf.Property property) {
        MemberDeserializer p1 = memberDeserializer;
        ProtoBuf.Property p2 = property;
        Intrinsics.m32180i(p1, "p1");
        Intrinsics.m32180i(p2, "p2");
        return p1.m33581j(p2);
    }
}
