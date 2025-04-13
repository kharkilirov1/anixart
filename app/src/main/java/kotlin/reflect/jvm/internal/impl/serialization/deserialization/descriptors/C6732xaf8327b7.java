package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1 */
/* loaded from: classes3.dex */
public final class C6732xaf8327b7 extends Lambda implements Function1<Name, EnumEntrySyntheticClassDescriptor> {

    /* renamed from: b */
    public final /* synthetic */ DeserializedClassDescriptor.EnumEntryClassDescriptors f66191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6732xaf8327b7(DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors) {
        super(1);
        this.f66191b = enumEntryClassDescriptors;
    }

    @Override // kotlin.jvm.functions.Function1
    public EnumEntrySyntheticClassDescriptor invoke(Name name) {
        final Name name2 = name;
        Intrinsics.m32180i(name2, "name");
        final ProtoBuf.EnumEntry enumEntry = this.f66191b.f66187a.get(name2);
        if (enumEntry == null) {
            return null;
        }
        DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = this.f66191b;
        DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
        return EnumEntrySyntheticClassDescriptor.m32613D(deserializedClassDescriptor.f66161i.f66069c.f66050b, deserializedClassDescriptor, name2, enumEntryClassDescriptors.f66189c, new DeserializedAnnotations(DeserializedClassDescriptor.this.f66161i.f66069c.f66050b, new Function0<List<? extends AnnotationDescriptor>>(this, name2) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$$special$$inlined$let$lambda$1

            /* renamed from: c */
            public final /* synthetic */ C6732xaf8327b7 f66177c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends AnnotationDescriptor> invoke() {
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                return CollectionsKt.m32027j0(deserializedClassDescriptor2.f66161i.f66069c.f66054f.mo32875f(deserializedClassDescriptor2.f66171s, ProtoBuf.EnumEntry.this));
            }
        }), SourceElement.f63979a);
    }
}
