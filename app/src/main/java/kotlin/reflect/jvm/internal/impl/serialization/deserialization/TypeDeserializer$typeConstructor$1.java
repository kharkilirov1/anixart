package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes3.dex */
final class TypeDeserializer$typeConstructor$1 extends Lambda implements Function1<Integer, ClassDescriptor> {

    /* renamed from: b */
    public final /* synthetic */ TypeDeserializer f66142b;

    /* renamed from: c */
    public final /* synthetic */ ProtoBuf.Type f66143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeConstructor$1(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        super(1);
        this.f66142b = typeDeserializer;
        this.f66143c = type;
    }

    @NotNull
    /* renamed from: a */
    public final ClassDescriptor m33597a(int i2) {
        ClassId m33584a = NameResolverUtilKt.m33584a(this.f66142b.f66133d.f66070d, i2);
        List<Integer> m33832B = SequencesKt.m33832B(SequencesKt.m33852t(SequencesKt.m33847o(this.f66143c, new Function1<ProtoBuf.Type, ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1$typeParametersCount$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ProtoBuf.Type invoke(ProtoBuf.Type type) {
                ProtoBuf.Type it = type;
                Intrinsics.m32180i(it, "it");
                return ProtoTypeTableUtilKt.m33124c(it, TypeDeserializer$typeConstructor$1.this.f66142b.f66133d.f66072f);
            }
        }), new Function1<ProtoBuf.Type, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$1$typeParametersCount$2
            @Override // kotlin.jvm.functions.Function1
            public Integer invoke(ProtoBuf.Type type) {
                ProtoBuf.Type it = type;
                Intrinsics.m32180i(it, "it");
                return Integer.valueOf(it.f65195e.size());
            }
        }));
        int m33837e = SequencesKt.m33837e(SequencesKt.m33847o(m33584a, TypeDeserializer$typeConstructor$1$classNestingLevel$1.f66144d));
        while (true) {
            ArrayList arrayList = (ArrayList) m33832B;
            if (arrayList.size() >= m33837e) {
                return this.f66142b.f66133d.f66069c.f66061m.m32549a(m33584a, m33832B);
            }
            arrayList.add(0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ClassDescriptor invoke(Integer num) {
        return m33597a(num.intValue());
    }
}
