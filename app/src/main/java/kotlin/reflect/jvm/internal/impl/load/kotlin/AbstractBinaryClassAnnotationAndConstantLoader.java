package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.div2.C3033a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes3.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements AnnotationAndConstantLoader<A, C> {

    /* renamed from: c */
    @NotNull
    public static final Set<ClassId> f64745c;

    /* renamed from: a */
    public final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, Storage<A, C>> f64746a;

    /* renamed from: b */
    public final KotlinClassFinder f64747b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class Companion {
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class Storage<A, C> {

        /* renamed from: a */
        @NotNull
        public final Map<MemberSignature, List<A>> f64752a;

        /* renamed from: b */
        @NotNull
        public final Map<MemberSignature, C> f64753b;

        /* JADX WARN: Multi-variable type inference failed */
        public Storage(@NotNull Map<MemberSignature, ? extends List<? extends A>> map, @NotNull Map<MemberSignature, ? extends C> map2) {
            this.f64752a = map;
            this.f64753b = map2;
        }
    }

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[2] = 1;
            iArr[3] = 2;
            iArr[1] = 3;
        }
    }

    static {
        List m31994G = CollectionsKt.m31994G(JvmAnnotationNames.f64348a, JvmAnnotationNames.f64350c, JvmAnnotationNames.f64351d, new FqName("java.lang.annotation.Target"), new FqName("java.lang.annotation.Retention"), new FqName("java.lang.annotation.Documented"));
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m31994G, 10));
        Iterator it = m31994G.iterator();
        while (it.hasNext()) {
            arrayList.add(ClassId.m33188i((FqName) it.next()));
        }
        f64745c = CollectionsKt.m32035n0(arrayList);
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        this.f64747b = kotlinClassFinder;
        this.f64746a = storageManager.mo33626f(new Function1<KotlinJvmBinaryClass, Storage<? extends A, ? extends C>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$storage$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
                KotlinJvmBinaryClass kotlinClass = kotlinJvmBinaryClass;
                Intrinsics.m32180i(kotlinClass, "kotlinClass");
                AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader = AbstractBinaryClassAnnotationAndConstantLoader.this;
                Set<ClassId> set = AbstractBinaryClassAnnotationAndConstantLoader.f64745c;
                Objects.requireNonNull(abstractBinaryClassAnnotationAndConstantLoader);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                kotlinClass.mo32351d(new C6635x2cf49cf1(abstractBinaryClassAnnotationAndConstantLoader, hashMap, hashMap2), null);
                return new AbstractBinaryClassAnnotationAndConstantLoader.Storage(hashMap, hashMap2);
            }
        });
    }

    @Nullable
    /* renamed from: k */
    public static final KotlinJvmBinaryClass.AnnotationArgumentVisitor m32866k(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, @NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List list) {
        Objects.requireNonNull(abstractBinaryClassAnnotationAndConstantLoader);
        if (f64745c.contains(classId)) {
            return null;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.mo32884s(classId, sourceElement, list);
    }

    /* renamed from: m */
    public static /* synthetic */ List m32867m(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3, int i2, Object obj) {
        return abstractBinaryClassAnnotationAndConstantLoader.m32880l(protoContainer, memberSignature, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? false : z3);
    }

    /* renamed from: o */
    public static /* synthetic */ MemberSignature m32868o(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z, int i2, Object obj) {
        return abstractBinaryClassAnnotationAndConstantLoader.m32881n(messageLite, nameResolver, typeTable, annotatedCallableKind, (i2 & 16) != 0 ? false : z);
    }

    /* renamed from: q */
    public static /* synthetic */ MemberSignature m32869q(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        return abstractBinaryClassAnnotationAndConstantLoader.m32882p(property, nameResolver, typeTable, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? true : z3);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: a */
    public List<A> mo32870a(@NotNull ProtoBuf.TypeParameter proto, @NotNull NameResolver nameResolver) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Object m33316k = proto.m33316k(JvmProtoBuf.f65487h);
        Intrinsics.m32175d(m33316k, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) m33316k;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(mo32886u(it, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m33123b((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r11) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r11.f66124f != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m33122a((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r11) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        r0 = 0;
     */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<A> mo32871b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, int r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter r14) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.m32180i(r10, r0)
            java.lang.String r0 = "callableProto"
            kotlin.jvm.internal.Intrinsics.m32180i(r11, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.m32180i(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.m32180i(r14, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r3 = r10.f66119a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r4 = r10.f66120b
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r11
            r5 = r12
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r12 = m32868o(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L81
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function
            r0 = 1
            if (r14 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r11
            boolean r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m33122a(r11)
            if (r11 == 0) goto L54
            goto L55
        L33:
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property
            if (r14 == 0) goto L40
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r11 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r11
            boolean r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.m33123b(r11)
            if (r11 == 0) goto L54
            goto L55
        L40:
            boolean r14 = r11 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor
            if (r14 == 0) goto L6a
            r11 = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r11 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r11
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r14 = r11.f66123e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS
            if (r14 != r1) goto L4f
            r0 = 2
            goto L55
        L4f:
            boolean r11 = r11.f66124f
            if (r11 == 0) goto L54
            goto L55
        L54:
            r0 = 0
        L55:
            int r13 = r13 + r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature$Companion r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.f64804b
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r2 = r11.m32927e(r12, r13)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r0 = r9
            r1 = r10
            java.util.List r10 = m32867m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L6a:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "Unsupported message: "
            java.lang.StringBuilder r12 = p000a.C0000a.m24u(r12)
            java.lang.Class r11 = r11.getClass()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L81:
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.f63144b
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.mo32871b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, int, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter):java.util.List");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: c */
    public List<A> mo32872c(@NotNull ProtoContainer.Class container) {
        Intrinsics.m32180i(container, "container");
        KotlinJvmBinaryClass m32887v = m32887v(container);
        if (m32887v != null) {
            final ArrayList arrayList = new ArrayList(1);
            m32887v.mo32350c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadClassAnnotations$1
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                /* renamed from: a */
                public void mo32892a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                @Nullable
                /* renamed from: b */
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32893b(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
                    return AbstractBinaryClassAnnotationAndConstantLoader.m32866k(AbstractBinaryClassAnnotationAndConstantLoader.this, classId, sourceElement, arrayList);
                }
            }, null);
            return arrayList;
        }
        StringBuilder m24u = C0000a.m24u("Class for loading annotations is not found: ");
        FqName m33189a = container.f66122d.m33189a();
        Intrinsics.m32175d(m33189a, "classId.asSingleFqName()");
        m24u.append(m33189a);
        throw new IllegalStateException(m24u.toString().toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: d */
    public List<A> mo32873d(@NotNull ProtoBuf.Type proto, @NotNull NameResolver nameResolver) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Object m33316k = proto.m33316k(JvmProtoBuf.f65485f);
        Intrinsics.m32175d(m33316k, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) m33316k;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        for (ProtoBuf.Annotation it : iterable) {
            Intrinsics.m32175d(it, "it");
            arrayList.add(mo32886u(it, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @org.jetbrains.annotations.Nullable
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C mo32874e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r11) {
        /*
            r8 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.m32180i(r9, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.m32180i(r10, r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.f65418w
            int r1 = r10.f65130e
            java.lang.Boolean r4 = r0.mo33113b(r1)
            boolean r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.m33177d(r10)
            r2 = 1
            r3 = 1
            r0 = r8
            r1 = r9
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r0 = r0.m32883r(r1, r2, r3, r4, r5)
            r6 = 0
            if (r0 == 0) goto L22
            goto L2d
        L22:
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
            if (r0 == 0) goto L2f
            r0 = r9
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r0
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r0 = r8.m32887v(r0)
        L2d:
            r7 = r0
            goto L30
        L2f:
            r7 = r6
        L30:
            if (r7 == 0) goto L8d
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r7.mo32349b()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r0 = r0.f64820b
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$Companion r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f64786g
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f64785f
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "version"
            kotlin.jvm.internal.Intrinsics.m32180i(r1, r2)
            int r2 = r1.f65382a
            int r3 = r1.f65383b
            int r1 = r1.f65384c
            int r4 = r0.f65382a
            r5 = 1
            if (r4 <= r2) goto L50
            goto L62
        L50:
            if (r4 >= r2) goto L53
            goto L60
        L53:
            int r2 = r0.f65383b
            if (r2 <= r3) goto L58
            goto L62
        L58:
            if (r2 >= r3) goto L5b
            goto L60
        L5b:
            int r0 = r0.f65384c
            if (r0 < r1) goto L60
            goto L62
        L60:
            r0 = 0
            r5 = 0
        L62:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r2 = r9.f66119a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r3 = r9.f66120b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            r0 = r8
            r1 = r10
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r0 = r0.m32881n(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L8d
            kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$Storage<A, C>> r1 = r8.f64746a
            java.lang.Object r1 = r1.invoke(r7)
            kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$Storage r1 = (kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage) r1
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> r1 = r1.f64753b
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L8d
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes r1 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.f63838e
            boolean r1 = r1.m32424a(r11)
            if (r1 == 0) goto L8c
            java.lang.Object r0 = r8.mo32888w(r0)
        L8c:
            return r0
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.mo32874e(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.types.KotlinType):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: f */
    public List<A> mo32875f(@NotNull ProtoContainer container, @NotNull ProtoBuf.EnumEntry proto) {
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(proto, "proto");
        MemberSignature.Companion companion = MemberSignature.f64804b;
        String string = container.f66119a.getString(proto.f65020e);
        String m33190b = ((ProtoContainer.Class) container).f66122d.m33190b();
        Intrinsics.m32175d(m33190b, "(container as ProtoConta…Class).classId.asString()");
        return m32867m(this, container, companion.m32923a(string, ClassMapperLite.m33171a(m33190b)), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: g */
    public List<A> mo32876g(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property proto) {
        Intrinsics.m32180i(proto, "proto");
        return m32885t(protoContainer, proto, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: h */
    public List<A> mo32877h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(kind, "kind");
        MemberSignature m32868o = m32868o(this, proto, protoContainer.f66119a, protoContainer.f66120b, kind, false, 16, null);
        return m32868o != null ? m32867m(this, protoContainer, MemberSignature.f64804b.m32927e(m32868o, 0), false, false, null, false, 60, null) : EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: i */
    public List<A> mo32878i(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property proto) {
        Intrinsics.m32180i(proto, "proto");
        return m32885t(protoContainer, proto, PropertyRelatedElement.DELEGATE_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: j */
    public List<A> mo32879j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return m32885t(protoContainer, (ProtoBuf.Property) proto, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature m32868o = m32868o(this, proto, protoContainer.f66119a, protoContainer.f66120b, kind, false, 16, null);
        return m32868o != null ? m32867m(this, protoContainer, m32868o, false, false, null, false, 60, null) : EmptyList.f63144b;
    }

    /* renamed from: l */
    public final List<A> m32880l(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3) {
        KotlinJvmBinaryClass m32883r = m32883r(protoContainer, z, z2, bool, z3);
        if (m32883r == null) {
            m32883r = protoContainer instanceof ProtoContainer.Class ? m32887v((ProtoContainer.Class) protoContainer) : null;
        }
        if (m32883r == null) {
            return EmptyList.f63144b;
        }
        List<A> list = this.f64746a.invoke(m32883r).f64752a.get(memberSignature);
        return list != null ? list : EmptyList.f63144b;
    }

    /* renamed from: n */
    public final MemberSignature m32881n(MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        if (messageLite instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.f64804b;
            JvmMemberSignature.Method m33180a = JvmProtoBufUtil.f65584b.m33180a((ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (m33180a != null) {
                return companion.m32924b(m33180a);
            }
            return null;
        }
        if (messageLite instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.f64804b;
            JvmMemberSignature.Method m33182c = JvmProtoBufUtil.f65584b.m33182c((ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (m33182c != null) {
                return companion2.m32924b(m33182c);
            }
            return null;
        }
        if (!(messageLite instanceof ProtoBuf.Property)) {
            return null;
        }
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f65483d;
        Intrinsics.m32175d(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m33120a((GeneratedMessageLite.ExtendableMessage) messageLite, propertySignature);
        if (jvmPropertySignature == null) {
            return null;
        }
        int ordinal = annotatedCallableKind.ordinal();
        if (ordinal == 1) {
            return m32882p((ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
        }
        if (ordinal == 2) {
            if (!jvmPropertySignature.m33154i()) {
                return null;
            }
            MemberSignature.Companion companion3 = MemberSignature.f64804b;
            JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f65521f;
            Intrinsics.m32175d(jvmMethodSignature, "signature.getter");
            return companion3.m32925c(nameResolver, jvmMethodSignature);
        }
        if (ordinal != 3 || !jvmPropertySignature.m33155j()) {
            return null;
        }
        MemberSignature.Companion companion4 = MemberSignature.f64804b;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature2 = jvmPropertySignature.f65522g;
        Intrinsics.m32175d(jvmMethodSignature2, "signature.setter");
        return companion4.m32925c(nameResolver, jvmMethodSignature2);
    }

    /* renamed from: p */
    public final MemberSignature m32882p(ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f65483d;
        Intrinsics.m32175d(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m33120a(property, propertySignature);
        if (jvmPropertySignature != null) {
            if (z) {
                JvmMemberSignature.Field m33181b = JvmProtoBufUtil.f65584b.m33181b(property, nameResolver, typeTable, z3);
                if (m33181b != null) {
                    return MemberSignature.f64804b.m32924b(m33181b);
                }
                return null;
            }
            if (z2) {
                if ((jvmPropertySignature.f65518c & 2) == 2) {
                    MemberSignature.Companion companion = MemberSignature.f64804b;
                    JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f65520e;
                    Intrinsics.m32175d(jvmMethodSignature, "signature.syntheticMethod");
                    return companion.m32925c(nameResolver, jvmMethodSignature);
                }
            }
        }
        return null;
    }

    /* renamed from: r */
    public final KotlinJvmBinaryClass m32883r(ProtoContainer protoContainer, boolean z, boolean z2, Boolean bool, boolean z3) {
        ProtoContainer.Class r8;
        ProtoBuf.Class.Kind kind;
        ProtoBuf.Class.Kind kind2 = ProtoBuf.Class.Kind.INTERFACE;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + protoContainer + ')').toString());
            }
            if (protoContainer instanceof ProtoContainer.Class) {
                ProtoContainer.Class r82 = (ProtoContainer.Class) protoContainer;
                if (r82.f66123e == kind2) {
                    return this.f64747b.mo32355b(r82.f66122d.m33191c(Name.m33211d("DefaultImpls")));
                }
            }
            if (bool.booleanValue() && (protoContainer instanceof ProtoContainer.Package)) {
                SourceElement sourceElement = protoContainer.f66121c;
                if (!(sourceElement instanceof JvmPackagePartSource)) {
                    sourceElement = null;
                }
                JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) sourceElement;
                JvmClassName jvmClassName = jvmPackagePartSource != null ? jvmPackagePartSource.f64794c : null;
                if (jvmClassName != null) {
                    KotlinClassFinder kotlinClassFinder = this.f64747b;
                    String str = jvmClassName.f65940a;
                    Intrinsics.m32175d(str, "facadeClassName.internalName");
                    FqName fqName = new FqName(StringsKt.m33890P(str, JsonPointer.SEPARATOR, '.', false, 4, null));
                    return kotlinClassFinder.mo32355b(new ClassId(fqName.m33198c(), fqName.m33199d()));
                }
            }
        }
        if (z2 && (protoContainer instanceof ProtoContainer.Class)) {
            ProtoContainer.Class r83 = (ProtoContainer.Class) protoContainer;
            if (r83.f66123e == ProtoBuf.Class.Kind.COMPANION_OBJECT && (r8 = r83.f66126h) != null && ((kind = r8.f66123e) == ProtoBuf.Class.Kind.CLASS || kind == ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (kind == kind2 || kind == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                return m32887v(r8);
            }
        }
        if (protoContainer instanceof ProtoContainer.Package) {
            SourceElement sourceElement2 = protoContainer.f66121c;
            if (sourceElement2 instanceof JvmPackagePartSource) {
                if (sourceElement2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
                }
                JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) sourceElement2;
                KotlinJvmBinaryClass kotlinJvmBinaryClass = jvmPackagePartSource2.f64795d;
                if (kotlinJvmBinaryClass != null) {
                    return kotlinJvmBinaryClass;
                }
                KotlinClassFinder kotlinClassFinder2 = this.f64747b;
                JvmClassName jvmClassName2 = jvmPackagePartSource2.f64793b;
                int lastIndexOf = jvmClassName2.f65940a.lastIndexOf("/");
                return kotlinClassFinder2.mo32355b(new ClassId(lastIndexOf == -1 ? FqName.f65596c : new FqName(jvmClassName2.f65940a.substring(0, lastIndexOf).replace(JsonPointer.SEPARATOR, '.')), jvmPackagePartSource2.m32914c()));
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: s */
    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor mo32884s(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list);

    /* renamed from: t */
    public final List<A> m32885t(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        boolean m17751m = C3033a.m17751m(Flags.f65418w, property.f65130e, "Flags.IS_CONST.get(proto.flags)");
        boolean m33177d = JvmProtoBufUtil.m33177d(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature m32869q = m32869q(this, property, protoContainer.f66119a, protoContainer.f66120b, false, true, false, 40, null);
            return m32869q != null ? m32867m(this, protoContainer, m32869q, true, false, Boolean.valueOf(m17751m), m33177d, 8, null) : EmptyList.f63144b;
        }
        MemberSignature m32869q2 = m32869q(this, property, protoContainer.f66119a, protoContainer.f66120b, true, false, false, 48, null);
        if (m32869q2 != null) {
            return StringsKt.m33922t(m32869q2.f64805a, "$delegate", false, 2, null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? EmptyList.f63144b : m32880l(protoContainer, m32869q2, true, true, Boolean.valueOf(m17751m), m33177d);
        }
        return EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: u */
    public abstract A mo32886u(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    /* renamed from: v */
    public final KotlinJvmBinaryClass m32887v(@NotNull ProtoContainer.Class r3) {
        SourceElement sourceElement = r3.f66121c;
        if (!(sourceElement instanceof KotlinJvmBinarySourceElement)) {
            sourceElement = null;
        }
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = (KotlinJvmBinarySourceElement) sourceElement;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.f64803b;
        }
        return null;
    }

    @Nullable
    /* renamed from: w */
    public abstract C mo32888w(@NotNull C c2);
}
