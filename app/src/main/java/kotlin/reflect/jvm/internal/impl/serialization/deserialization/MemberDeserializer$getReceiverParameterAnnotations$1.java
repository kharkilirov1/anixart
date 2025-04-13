package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes3.dex */
final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

    /* renamed from: b */
    public final /* synthetic */ MemberDeserializer f66109b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f66110c;

    /* renamed from: d */
    public final /* synthetic */ AnnotatedCallableKind f66111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f66109b = memberDeserializer;
        this.f66110c = messageLite;
        this.f66111d = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public List<? extends AnnotationDescriptor> invoke() {
        MemberDeserializer memberDeserializer = this.f66109b;
        ProtoContainer m33572a = memberDeserializer.m33572a(memberDeserializer.f66094b.f66071e);
        List<AnnotationDescriptor> mo32877h = m33572a != null ? this.f66109b.f66094b.f66069c.f66054f.mo32877h(m33572a, this.f66110c, this.f66111d) : null;
        return mo32877h != null ? mo32877h : EmptyList.f63144b;
    }
}
