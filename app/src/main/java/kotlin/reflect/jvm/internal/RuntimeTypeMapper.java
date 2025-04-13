package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.structure.ReflectJavaMethod;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimeTypeMapper {

    /* renamed from: a */
    public static final ClassId f63638a;

    /* renamed from: b */
    public static final RuntimeTypeMapper f63639b = new RuntimeTypeMapper();

    static {
        FqName fqName = new FqName("java.lang.Void");
        f63638a = new ClassId(fqName.m33198c(), fqName.m33199d());
    }

    /* renamed from: a */
    public final PrimitiveType m32313a(@NotNull Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.m33544a(cls.getSimpleName()).f65954b;
        }
        return null;
    }

    /* renamed from: b */
    public final JvmFunctionSignature.KotlinFunction m32314b(FunctionDescriptor functionDescriptor) {
        String m32691d = SpecialBuiltinMembers.m32691d(functionDescriptor);
        if (m32691d == null) {
            m32691d = functionDescriptor instanceof PropertyGetterDescriptor ? JvmAbi.m32683a(DescriptorUtilsKt.m33538k(functionDescriptor).getName().f65606b) : functionDescriptor instanceof PropertySetterDescriptor ? JvmAbi.m32684b(DescriptorUtilsKt.m33538k(functionDescriptor).getName().f65606b) : functionDescriptor.getName().f65606b;
            Intrinsics.m32175d(m32691d, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(m32691d, MethodSignatureMappingKt.m32928a(functionDescriptor, false, false, 1)));
    }

    @NotNull
    /* renamed from: c */
    public final JvmPropertySignature m32315c(@NotNull PropertyDescriptor possiblyOverriddenProperty) {
        Intrinsics.m32180i(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor mo32487a = ((PropertyDescriptor) DescriptorUtils.m33485u(possiblyOverriddenProperty)).mo32487a();
        Intrinsics.m32175d(mo32487a, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        if (mo32487a instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) mo32487a;
            ProtoBuf.Property property = deserializedPropertyDescriptor.f66227A;
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f65483d;
            Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m33120a(property, generatedExtension);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(mo32487a, property, jvmPropertySignature, deserializedPropertyDescriptor.f66228B, deserializedPropertyDescriptor.f66229C);
            }
        } else if (mo32487a instanceof JavaPropertyDescriptor) {
            SourceElement sourceElement = ((JavaPropertyDescriptor) mo32487a).f64104d;
            if (!(sourceElement instanceof JavaSourceElement)) {
                sourceElement = null;
            }
            JavaSourceElement javaSourceElement = (JavaSourceElement) sourceElement;
            JavaElement mo32361b = javaSourceElement != null ? javaSourceElement.mo32361b() : null;
            if (mo32361b instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) mo32361b).f66568a);
            }
            if (!(mo32361b instanceof ReflectJavaMethod)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + mo32487a + " (source = " + mo32361b + ')');
            }
            Method method = ((ReflectJavaMethod) mo32361b).f66570a;
            PropertySetterDescriptor setter = mo32487a.getSetter();
            SourceElement mo32439i = setter != null ? setter.mo32439i() : null;
            if (!(mo32439i instanceof JavaSourceElement)) {
                mo32439i = null;
            }
            JavaSourceElement javaSourceElement2 = (JavaSourceElement) mo32439i;
            JavaElement mo32361b2 = javaSourceElement2 != null ? javaSourceElement2.mo32361b() : null;
            if (!(mo32361b2 instanceof ReflectJavaMethod)) {
                mo32361b2 = null;
            }
            ReflectJavaMethod reflectJavaMethod = (ReflectJavaMethod) mo32361b2;
            return new JvmPropertySignature.JavaMethodProperty(method, reflectJavaMethod != null ? reflectJavaMethod.f66570a : null);
        }
        PropertyGetterDescriptor getter = mo32487a.getGetter();
        if (getter == null) {
            Intrinsics.m32188q();
            throw null;
        }
        JvmFunctionSignature.KotlinFunction m32314b = m32314b(getter);
        PropertySetterDescriptor setter2 = mo32487a.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(m32314b, setter2 != null ? m32314b(setter2) : null);
    }

    @NotNull
    /* renamed from: d */
    public final JvmFunctionSignature m32316d(@NotNull FunctionDescriptor possiblySubstitutedFunction) {
        Method method;
        JvmMemberSignature.Method m33180a;
        JvmMemberSignature.Method m33182c;
        Intrinsics.m32180i(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor mo32487a = ((FunctionDescriptor) DescriptorUtils.m33485u(possiblySubstitutedFunction)).mo32487a();
        Intrinsics.m32175d(mo32487a, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (mo32487a instanceof DeserializedCallableMemberDescriptor) {
            DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor = (DeserializedCallableMemberDescriptor) mo32487a;
            MessageLite mo33604z = deserializedCallableMemberDescriptor.mo33604z();
            return (!(mo33604z instanceof ProtoBuf.Function) || (m33182c = JvmProtoBufUtil.f65584b.m33182c((ProtoBuf.Function) mo33604z, deserializedCallableMemberDescriptor.mo33602Y(), deserializedCallableMemberDescriptor.mo33600R())) == null) ? (!(mo33604z instanceof ProtoBuf.Constructor) || (m33180a = JvmProtoBufUtil.f65584b.m33180a((ProtoBuf.Constructor) mo33604z, deserializedCallableMemberDescriptor.mo33602Y(), deserializedCallableMemberDescriptor.mo33600R())) == null) ? m32314b(mo32487a) : new JvmFunctionSignature.KotlinConstructor(m33180a) : new JvmFunctionSignature.KotlinFunction(m33182c);
        }
        if (mo32487a instanceof JavaMethodDescriptor) {
            SourceElement sourceElement = ((JavaMethodDescriptor) mo32487a).f64104d;
            if (!(sourceElement instanceof JavaSourceElement)) {
                sourceElement = null;
            }
            JavaSourceElement javaSourceElement = (JavaSourceElement) sourceElement;
            JavaElement mo32361b = javaSourceElement != null ? javaSourceElement.mo32361b() : null;
            ReflectJavaMethod reflectJavaMethod = (ReflectJavaMethod) (mo32361b instanceof ReflectJavaMethod ? mo32361b : null);
            if (reflectJavaMethod != null && (method = reflectJavaMethod.f66570a) != null) {
                return new JvmFunctionSignature.JavaMethod(method);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + mo32487a);
        }
        if (!(mo32487a instanceof JavaClassConstructorDescriptor)) {
            boolean z = false;
            if (!(mo32487a.getName().equals(DescriptorUtils.f65876b) && DescriptorFactory.m33464i(mo32487a))) {
                if (mo32487a.getName().equals(DescriptorUtils.f65875a) && DescriptorFactory.m33464i(mo32487a)) {
                    z = true;
                }
                if (!z) {
                    throw new KotlinReflectionInternalError("Unknown origin of " + mo32487a + " (" + mo32487a.getClass() + ')');
                }
            }
            return m32314b(mo32487a);
        }
        SourceElement sourceElement2 = ((JavaClassConstructorDescriptor) mo32487a).f64104d;
        if (!(sourceElement2 instanceof JavaSourceElement)) {
            sourceElement2 = null;
        }
        JavaSourceElement javaSourceElement2 = (JavaSourceElement) sourceElement2;
        JavaElement mo32361b2 = javaSourceElement2 != null ? javaSourceElement2.mo32361b() : null;
        if (mo32361b2 instanceof ReflectJavaConstructor) {
            return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) mo32361b2).f66566a);
        }
        if (mo32361b2 instanceof ReflectJavaClass) {
            ReflectJavaClass reflectJavaClass = (ReflectJavaClass) mo32361b2;
            if (reflectJavaClass.mo32811p()) {
                return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.f66554a);
            }
        }
        throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + mo32487a + " (" + mo32361b2 + ')');
    }
}
