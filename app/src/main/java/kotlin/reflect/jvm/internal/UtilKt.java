package kotlin.reflect.jvm.internal;

import com.fasterxml.jackson.core.JsonPointer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaElement;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: util.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001ap\u0010\u0011\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u001d*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31884d2 = {"Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "Ljava/lang/Class;", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "isPublicInBytecode", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Z", "kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class UtilKt {

    /* renamed from: a */
    @NotNull
    public static final FqName f63641a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            KotlinClassHeader.Kind kind = KotlinClassHeader.Kind.FILE_FACADE;
            iArr[2] = 1;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
            iArr[5] = 2;
            KotlinClassHeader.Kind kind3 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            iArr[4] = 3;
        }
    }

    @Nullable
    /* renamed from: a */
    public static final KFunctionImpl m32318a(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = (KFunctionImpl) (!(obj instanceof KFunctionImpl) ? null : obj);
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (!(obj instanceof FunctionReference)) {
            obj = null;
        }
        FunctionReference functionReference = (FunctionReference) obj;
        KCallable compute = functionReference != null ? functionReference.compute() : null;
        return (KFunctionImpl) (compute instanceof KFunctionImpl ? compute : null);
    }

    @NotNull
    /* renamed from: b */
    public static final List<Annotation> m32319b(@NotNull Annotated receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Annotations annotations = receiver$0.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement mo32588i = annotationDescriptor.mo32588i();
            Annotation annotation = null;
            if (mo32588i instanceof ReflectAnnotationSource) {
                annotation = ((ReflectAnnotationSource) mo32588i).f63693b;
            } else if (mo32588i instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) mo32588i).f63710b;
                if (!(reflectJavaElement instanceof ReflectJavaAnnotation)) {
                    reflectJavaElement = null;
                }
                ReflectJavaAnnotation reflectJavaAnnotation = (ReflectJavaAnnotation) reflectJavaElement;
                if (reflectJavaAnnotation != null) {
                    annotation = reflectJavaAnnotation.f66547a;
                }
            } else {
                annotation = m32325h(annotationDescriptor);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: c */
    public static final <M extends MessageLite, D extends CallableDescriptor> D m32320c(@NotNull Class<?> moduleAnchor, @NotNull M proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion metadataVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> list;
        Intrinsics.m32180i(moduleAnchor, "moduleAnchor");
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(typeTable, "typeTable");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        Intrinsics.m32180i(createDescriptor, "createDescriptor");
        RuntimeModuleData m32303a = ModuleByClassLoaderKt.m32303a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            list = ((ProtoBuf.Function) proto).f65060j;
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((ProtoBuf.Property) proto).f65135j;
        }
        List<ProtoBuf.TypeParameter> typeParameters = list;
        DeserializationComponents deserializationComponents = m32303a.f63702a;
        ModuleDescriptor moduleDescriptor = deserializationComponents.f66051c;
        VersionRequirementTable.Companion companion = VersionRequirementTable.f65438c;
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.f65437b;
        VersionRequirementTable versionRequirementTable2 = VersionRequirementTable.f65437b;
        Intrinsics.m32175d(typeParameters, "typeParameters");
        return createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponents, nameResolver, moduleDescriptor, typeTable, versionRequirementTable2, metadataVersion, null, null, typeParameters)), proto);
    }

    @Nullable
    /* renamed from: d */
    public static final ReceiverParameterDescriptor m32321d(@NotNull CallableDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        if (receiver$0.mo32490f0() == null) {
            return null;
        }
        DeclarationDescriptor mo32437b = receiver$0.mo32437b();
        if (mo32437b != null) {
            return ((ClassDescriptor) mo32437b).mo32504F0();
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    @Nullable
    /* renamed from: e */
    public static final String m32322e(@NotNull ReflectKotlinClass reflectKotlinClass) {
        KotlinClassHeader kotlinClassHeader = reflectKotlinClass.f63698b;
        if (!kotlinClassHeader.f64820b.m33176b()) {
            return null;
        }
        int ordinal = kotlinClassHeader.f64819a.ordinal();
        if (ordinal != 2) {
            if (ordinal == 4) {
                String[] strArr = kotlinClassHeader.f64821c;
                if (!(kotlinClassHeader.f64819a == KotlinClassHeader.Kind.MULTIFILE_CLASS)) {
                    strArr = null;
                }
                List m31957g = strArr != null ? ArraysKt.m31957g(strArr) : null;
                if (m31957g == null) {
                    m31957g = EmptyList.f63144b;
                }
                String str = (String) CollectionsKt.m32046w(m31957g);
                if (str == null) {
                    return null;
                }
                ReflectKotlinClass.Factory factory = ReflectKotlinClass.f63696c;
                Class<?> loadClass = reflectKotlinClass.f63697a.getClassLoader().loadClass(StringsKt.m33890P(str, JsonPointer.SEPARATOR, '.', false, 4, null));
                Intrinsics.m32175d(loadClass, "klass.classLoader.loadCl…rtName.replace('/', '.'))");
                ReflectKotlinClass m32353a = factory.m32353a(loadClass);
                if (m32353a != null) {
                    return m32322e(m32353a);
                }
                return null;
            }
            if (ordinal != 5) {
                return null;
            }
        }
        String[] strArr2 = kotlinClassHeader.f64821c;
        if (strArr2 == null) {
            Intrinsics.m32188q();
            throw null;
        }
        String[] strArr3 = kotlinClassHeader.f64823e;
        if (strArr3 == null) {
            Intrinsics.m32188q();
            throw null;
        }
        Pair<JvmNameResolver, ProtoBuf.Package> m33179h = JvmProtoBufUtil.m33179h(strArr2, strArr3);
        JvmNameResolver jvmNameResolver = m33179h.f63055b;
        ProtoBuf.Package r9 = m33179h.f63056c;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> generatedExtension = JvmProtoBuf.f65491l;
        Intrinsics.m32175d(generatedExtension, "JvmProtoBuf.packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.m33120a(r9, generatedExtension);
        return num != null ? jvmNameResolver.getString(num.intValue()) : "main";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r0.getAnnotations().mo32592R0(r5) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r6.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63984a) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m32323f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6) {
        /*
            java.lang.String r0 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.m32180i(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r0 = r6.getVisibility()
            java.lang.String r1 = "visibility"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r1 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63988e
            boolean r1 = kotlin.jvm.internal.Intrinsics.m32174c(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L20
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r1 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63987d
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r0, r1)
            if (r0 == 0) goto Lcc
        L20:
            kotlin.reflect.jvm.internal.impl.name.Name r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.f64016a
            boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.m32591b(r6)
            if (r0 != 0) goto L79
            kotlin.reflect.jvm.internal.impl.name.Name r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.f65875a
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
            if (r0 == 0) goto L36
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = r1.mo32558v0()
            goto L37
        L36:
            r1 = r6
        L37:
            java.lang.String r4 = "DescriptorUtils.getDirectMember(this)"
            kotlin.jvm.internal.Intrinsics.m32175d(r1, r4)
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.m32591b(r1)
            if (r1 != 0) goto L79
            boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r1 == 0) goto L73
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r6.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.FqName r5 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.f64021f
            boolean r1 = r1.mo32592R0(r5)
            if (r1 != 0) goto L6b
            if (r0 == 0) goto L5c
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = r0.mo32558v0()
            goto L5d
        L5c:
            r0 = r6
        L5d:
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r0.getAnnotations()
            boolean r0 = r0.mo32592R0(r5)
            if (r0 != 0) goto L6b
            goto L73
        L6b:
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            r0.isInline()
            r0 = 1
            goto L74
        L73:
            r0 = 0
        L74:
            if (r0 == 0) goto L77
            goto L79
        L77:
            r0 = 0
            goto L7a
        L79:
            r0 = 1
        L7a:
            if (r0 != 0) goto Lc8
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 == 0) goto Lc6
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r6
            boolean r0 = r6.isSuspend()
            if (r0 == 0) goto Lc6
            boolean r0 = r6.isInline()
            if (r0 == 0) goto Lc6
            java.util.List r0 = r6.mo32489f()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9e
            goto Lb6
        L9e:
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            boolean r1 = r1.mo32570b0()
            if (r1 == 0) goto La2
            r0 = 1
            goto Lb7
        Lb6:
            r0 = 0
        Lb7:
            if (r0 != 0) goto Lc8
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r6 = r6.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63984a
            boolean r6 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r0)
            if (r6 == 0) goto Lc6
            goto Lc8
        Lc6:
            r6 = 0
            goto Lc9
        Lc8:
            r6 = 1
        Lc9:
            if (r6 != 0) goto Lcc
            goto Lcd
        Lcc:
            r2 = 0
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.UtilKt.m32323f(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Nullable
    /* renamed from: g */
    public static final Class<?> m32324g(@NotNull ClassLoader classLoader, @NotNull String str, @NotNull String str2) {
        Intrinsics.m32180i(classLoader, "classLoader");
        if (Intrinsics.m32174c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        return ReflectJavaClassFinderKt.m32347a(classLoader, str + '.' + StringsKt.m33890P(str2, '.', '$', false, 4, null));
    }

    /* renamed from: h */
    public static final Annotation m32325h(@NotNull AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor m33533f = DescriptorUtilsKt.m33533f(annotationDescriptor);
        Class<?> m32326i = m33533f != null ? m32326i(m33533f) : null;
        if (!(m32326i instanceof Class)) {
            m32326i = null;
        }
        if (m32326i == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> entrySet = annotationDescriptor.mo32586a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = m32326i.getClassLoader();
            Intrinsics.m32175d(classLoader, "annotationClass.classLoader");
            Object m32327j = m32327j(constantValue, classLoader);
            Pair pair = m32327j != null ? new Pair(name.f65606b, m32327j) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map m32067l = MapsKt.m32067l(arrayList);
        KProperty[] kPropertyArr = AnnotationConstructorCallerKt.f63657a;
        Set keySet = m32067l.keySet();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m32326i.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return (Annotation) AnnotationConstructorCallerKt.m32329a(m32326i, m32067l, arrayList2);
    }

    @Nullable
    /* renamed from: i */
    public static final Class<?> m32326i(@NotNull ClassDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        SourceElement source = receiver$0.mo32439i();
        Intrinsics.m32175d(source, "source");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass kotlinJvmBinaryClass = ((KotlinJvmBinarySourceElement) source).f64803b;
            if (kotlinJvmBinaryClass != null) {
                return ((ReflectKotlinClass) kotlinJvmBinaryClass).f63697a;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).f63710b;
            if (reflectJavaElement != null) {
                return ((ReflectJavaClass) reflectJavaElement).f66554a;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.structure.ReflectJavaClass");
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f63882m;
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(receiver$0);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        ClassId m32473l = javaToKotlinClassMap.m32473l(m33468d);
        if (m32473l == null) {
            m32473l = DescriptorUtilsKt.m33535h(receiver$0);
        }
        if (m32473l == null) {
            return null;
        }
        String str = m32473l.f65593a.f65597a.f65602a;
        Intrinsics.m32175d(str, "classId.packageFqName.asString()");
        String str2 = m32473l.f65594b.f65597a.f65602a;
        Intrinsics.m32175d(str2, "classId.relativeClassName.asString()");
        return m32324g(ReflectClassUtilKt.m33801e(receiver$0.getClass()), str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static final Object m32327j(@NotNull ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return m32325h((AnnotationDescriptor) ((AnnotationValue) constantValue).f65921a);
        }
        if (constantValue instanceof ArrayValue) {
            Iterable iterable = (Iterable) ((ArrayValue) constantValue).f65921a;
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m32327j((ConstantValue) it.next(), classLoader));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        if (constantValue instanceof EnumValue) {
            Pair pair = (Pair) ((EnumValue) constantValue).f65921a;
            ClassId classId = (ClassId) pair.f63055b;
            Name name = (Name) pair.f63056c;
            String str = classId.f65593a.f65597a.f65602a;
            Intrinsics.m32175d(str, "enumClassId.packageFqName.asString()");
            String str2 = classId.f65594b.f65597a.f65602a;
            Intrinsics.m32175d(str2, "enumClassId.relativeClassName.asString()");
            Class<?> m32324g = m32324g(classLoader, str, str2);
            if (m32324g != null) {
                return Enum.valueOf(m32324g, name.f65606b);
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.mo33522b();
        }
        ClassifierDescriptor mo32449b = ((KClassValue) constantValue).mo33522b().mo33515H0().mo32449b();
        if (!(mo32449b instanceof ClassDescriptor)) {
            mo32449b = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
        if (classDescriptor != null) {
            return m32326i(classDescriptor);
        }
        return null;
    }
}
