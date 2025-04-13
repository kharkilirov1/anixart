package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes3.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: j */
    @NotNull
    public final DeserializedAnnotations f66250j;

    /* renamed from: k */
    public final DeserializationContext f66251k;

    /* renamed from: l */
    public final ProtoBuf.TypeParameter f66252l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DeserializedTypeParameterDescriptor(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.m32180i(r11, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r0 = r11.f66069c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r2 = r0.f66050b
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r11.f66071e
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r0 = r11.f66070d
            int r1 = r12.f65275f
            kotlin.reflect.jvm.internal.impl.name.Name r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.m33585b(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r0 = r12.f65277h
            java.lang.String r1 = "proto.variance"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L32
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 != r1) goto L29
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            goto L34
        L29:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L2f:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L34
        L32:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
        L34:
            r5 = r0
            boolean r6 = r12.f65276g
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r8 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.f63979a
            kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker$EMPTY r9 = kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY.f63981a
            r1 = r10
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f66251k = r11
            r10.f66252l = r12
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations r12 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r11 = r11.f66069c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r11 = r11.f66050b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1 r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            r13.<init>()
            r12.<init>(r11, r13)
            r10.f66250j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: G */
    public void mo32604G(KotlinType type) {
        Intrinsics.m32180i(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* renamed from: O */
    public List<KotlinType> mo32605O() {
        ProtoBuf.TypeParameter receiver$0 = this.f66252l;
        TypeTable typeTable = this.f66251k.f66072f;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(typeTable, "typeTable");
        List<ProtoBuf.Type> list = receiver$0.f65278i;
        boolean z = !list.isEmpty();
        ?? r2 = list;
        if (!z) {
            r2 = 0;
        }
        if (r2 == 0) {
            List<Integer> upperBoundIdList = receiver$0.f65279j;
            Intrinsics.m32175d(upperBoundIdList, "upperBoundIdList");
            r2 = new ArrayList(CollectionsKt.m32032m(upperBoundIdList, 10));
            for (Integer it : upperBoundIdList) {
                Intrinsics.m32175d(it, "it");
                r2.add(typeTable.m33129a(it.intValue()));
            }
        }
        if (r2.isEmpty()) {
            return CollectionsKt.m31993F(DescriptorUtilsKt.m33534g(this).m32408r());
        }
        TypeDeserializer typeDeserializer = this.f66251k.f66067a;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(r2, 10));
        Iterator it2 = r2.iterator();
        while (it2.hasNext()) {
            arrayList.add(typeDeserializer.m33594e((ProtoBuf.Type) it2.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f66250j;
    }
}
