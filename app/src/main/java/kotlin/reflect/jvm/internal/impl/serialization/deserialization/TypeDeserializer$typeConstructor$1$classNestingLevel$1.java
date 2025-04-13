package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes3.dex */
public final class TypeDeserializer$typeConstructor$1$classNestingLevel$1 extends FunctionReference implements Function1<ClassId, ClassId> {

    /* renamed from: d */
    public static final TypeDeserializer$typeConstructor$1$classNestingLevel$1 f66144d = new TypeDeserializer$typeConstructor$1$classNestingLevel$1();

    public TypeDeserializer$typeConstructor$1$classNestingLevel$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(ClassId.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.functions.Function1
    public ClassId invoke(ClassId classId) {
        ClassId p1 = classId;
        Intrinsics.m32180i(p1, "p1");
        return p1.m33192f();
    }
}
