package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.Nullable;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes3.dex */
final class MemberDeserializer$containsSuspendFunctionType$1 extends PropertyReference1 {

    /* renamed from: b */
    public static final KProperty1 f66102b = new MemberDeserializer$containsSuspendFunctionType$1();

    @Override // kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        return Boolean.valueOf(FunctionTypesKt.m32372h((UnwrappedType) obj));
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "isSuspendFunctionType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.m32194b(FunctionTypesKt.class, "deserialization");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
