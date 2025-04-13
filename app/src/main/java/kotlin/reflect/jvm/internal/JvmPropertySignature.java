package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class JvmPropertySignature {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class JavaField extends JvmPropertySignature {

        /* renamed from: a */
        @NotNull
        public final Field f63451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaField(@NotNull Field field) {
            super(null);
            Intrinsics.m32180i(field, "field");
            this.f63451a = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* renamed from: a */
        public String getF63454a() {
            StringBuilder sb = new StringBuilder();
            sb.append(JvmAbi.m32683a(this.f63451a.getName()));
            sb.append("()");
            Class<?> type = this.f63451a.getType();
            Intrinsics.m32175d(type, "field.type");
            sb.append(ReflectClassUtilKt.m33799c(type));
            return sb.toString();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* renamed from: a */
        @NotNull
        public final Method f63452a;

        /* renamed from: b */
        @Nullable
        public final Method f63453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethodProperty(@NotNull Method getterMethod, @Nullable Method method) {
            super(null);
            Intrinsics.m32180i(getterMethod, "getterMethod");
            this.f63452a = getterMethod;
            this.f63453b = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* renamed from: a */
        public String getF63454a() {
            return RuntimeTypeMapperKt.m32317a(this.f63452a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class KotlinProperty extends JvmPropertySignature {

        /* renamed from: a */
        public final String f63454a;

        /* renamed from: b */
        @NotNull
        public final PropertyDescriptor f63455b;

        /* renamed from: c */
        @NotNull
        public final ProtoBuf.Property f63456c;

        /* renamed from: d */
        @NotNull
        public final JvmProtoBuf.JvmPropertySignature f63457d;

        /* renamed from: e */
        @NotNull
        public final NameResolver f63458e;

        /* renamed from: f */
        @NotNull
        public final TypeTable f63459f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinProperty(@NotNull PropertyDescriptor propertyDescriptor, @NotNull ProtoBuf.Property proto, @NotNull JvmProtoBuf.JvmPropertySignature jvmPropertySignature, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
            super(null);
            String str;
            String m21r;
            Intrinsics.m32180i(proto, "proto");
            Intrinsics.m32180i(nameResolver, "nameResolver");
            Intrinsics.m32180i(typeTable, "typeTable");
            this.f63455b = propertyDescriptor;
            this.f63456c = proto;
            this.f63457d = jvmPropertySignature;
            this.f63458e = nameResolver;
            this.f63459f = typeTable;
            if (jvmPropertySignature.m33154i()) {
                StringBuilder sb = new StringBuilder();
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f65521f;
                Intrinsics.m32175d(jvmMethodSignature, "signature.getter");
                sb.append(nameResolver.getString(jvmMethodSignature.f65508d));
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.f65521f;
                Intrinsics.m32175d(jvmMethodSignature2, "signature.getter");
                sb.append(nameResolver.getString(jvmMethodSignature2.f65509e));
                m21r = sb.toString();
            } else {
                JvmMemberSignature.Field m33181b = JvmProtoBufUtil.f65584b.m33181b(proto, nameResolver, typeTable, true);
                if (m33181b == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + propertyDescriptor);
                }
                String str2 = m33181b.f65573a;
                String str3 = m33181b.f65574b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(JvmAbi.m32683a(str2));
                DeclarationDescriptor mo32437b = propertyDescriptor.mo32437b();
                Intrinsics.m32175d(mo32437b, "descriptor.containingDeclaration");
                if (Intrinsics.m32174c(propertyDescriptor.getVisibility(), Visibilities.f63987d) && (mo32437b instanceof DeserializedClassDescriptor)) {
                    ProtoBuf.Class r3 = ((DeserializedClassDescriptor) mo32437b).f66173u;
                    GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension = JvmProtoBuf.f65488i;
                    Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.classModuleName");
                    Integer num = (Integer) ProtoBufUtilKt.m33120a(r3, generatedExtension);
                    String str4 = (num == null || (str4 = nameResolver.getString(num.intValue())) == null) ? "main" : str4;
                    StringBuilder m24u = C0000a.m24u("$");
                    Regex regex = NameUtils.f65608a;
                    m24u.append(NameUtils.f65608a.m33873e(str4, "_"));
                    str = m24u.toString();
                } else {
                    if (Intrinsics.m32174c(propertyDescriptor.getVisibility(), Visibilities.f63984a) && (mo32437b instanceof PackageFragmentDescriptor)) {
                        DeserializedContainerSource deserializedContainerSource = ((DeserializedPropertyDescriptor) propertyDescriptor).f66231E;
                        if (deserializedContainerSource instanceof JvmPackagePartSource) {
                            JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) deserializedContainerSource;
                            if (jvmPackagePartSource.f64794c != null) {
                                StringBuilder m24u2 = C0000a.m24u("$");
                                m24u2.append(jvmPackagePartSource.m32914c().f65606b);
                                str = m24u2.toString();
                            }
                        }
                    }
                    str = "";
                }
                m21r = C0000a.m21r(sb2, str, "()", str3);
            }
            this.f63454a = m21r;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF63454a() {
            return this.f63454a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* renamed from: a */
        @NotNull
        public final JvmFunctionSignature.KotlinFunction f63460a;

        /* renamed from: b */
        @Nullable
        public final JvmFunctionSignature.KotlinFunction f63461b;

        public MappedKotlinProperty(@NotNull JvmFunctionSignature.KotlinFunction kotlinFunction, @Nullable JvmFunctionSignature.KotlinFunction kotlinFunction2) {
            super(null);
            this.f63460a = kotlinFunction;
            this.f63461b = kotlinFunction2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* renamed from: a */
        public String getF63454a() {
            return this.f63460a.f63449a;
        }
    }

    public JvmPropertySignature() {
    }

    @NotNull
    /* renamed from: a */
    public abstract String getF63454a();

    public JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
