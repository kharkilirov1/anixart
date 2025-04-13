package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class AnnotationAndConstantLoaderImpl implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* renamed from: a */
    public final AnnotationDeserializer f66031a;

    /* renamed from: b */
    public final SerializerExtensionProtocol f66032b;

    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull SerializerExtensionProtocol protocol) {
        Intrinsics.m32180i(protocol, "protocol");
        this.f66032b = protocol;
        this.f66031a = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: a */
    public List<AnnotationDescriptor> mo32870a(@NotNull ProtoBuf.TypeParameter proto, @NotNull NameResolver nameResolver) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.m33316k(this.f66032b.f66025j);
        if (iterable == null) {
            iterable = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: b */
    public List<AnnotationDescriptor> mo32871b(@NotNull ProtoContainer container, @NotNull MessageLite callableProto, @NotNull AnnotatedCallableKind kind, int i2, @NotNull ProtoBuf.ValueParameter proto) {
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(callableProto, "callableProto");
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(proto, "proto");
        Iterable iterable = (List) proto.m33316k(this.f66032b.f66023h);
        if (iterable == null) {
            iterable = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), container.f66119a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: c */
    public List<AnnotationDescriptor> mo32872c(@NotNull ProtoContainer.Class container) {
        Intrinsics.m32180i(container, "container");
        Iterable iterable = (List) container.f66125g.m33316k(this.f66032b.f66018c);
        if (iterable == null) {
            iterable = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), container.f66119a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: d */
    public List<AnnotationDescriptor> mo32873d(@NotNull ProtoBuf.Type proto, @NotNull NameResolver nameResolver) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.m33316k(this.f66032b.f66024i);
        if (iterable == null) {
            iterable = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    /* renamed from: e */
    public ConstantValue<?> mo32874e(ProtoContainer container, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(proto, "proto");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.m33120a(proto, this.f66032b.f66022g);
        if (value != null) {
            return this.f66031a.m33557c(kotlinType, value, container.f66119a);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: f */
    public List<AnnotationDescriptor> mo32875f(@NotNull ProtoContainer container, @NotNull ProtoBuf.EnumEntry proto) {
        Intrinsics.m32180i(container, "container");
        Intrinsics.m32180i(proto, "proto");
        Iterable iterable = (List) proto.m33316k(this.f66032b.f66021f);
        if (iterable == null) {
            iterable = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), container.f66119a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: g */
    public List<AnnotationDescriptor> mo32876g(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property proto) {
        Intrinsics.m32180i(proto, "proto");
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: h */
    public List<AnnotationDescriptor> mo32877h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(kind, "kind");
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: i */
    public List<AnnotationDescriptor> mo32878i(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property proto) {
        Intrinsics.m32180i(proto, "proto");
        return EmptyList.f63144b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @NotNull
    /* renamed from: j */
    public List<AnnotationDescriptor> mo32879j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite proto, @NotNull AnnotatedCallableKind kind) {
        List list;
        Intrinsics.m32180i(proto, "proto");
        Intrinsics.m32180i(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            list = (List) ((ProtoBuf.Constructor) proto).m33316k(this.f66032b.f66017b);
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).m33316k(this.f66032b.f66019d);
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            list = (List) ((ProtoBuf.Property) proto).m33316k(this.f66032b.f66020e);
        }
        if (list == null) {
            list = EmptyList.f63144b;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f66031a.m33555a((ProtoBuf.Annotation) it.next(), protoContainer.f66119a));
        }
        return arrayList;
    }
}
