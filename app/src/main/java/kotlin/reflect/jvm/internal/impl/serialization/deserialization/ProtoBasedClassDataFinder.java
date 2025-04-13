package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes3.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* renamed from: a */
    public final Map<ClassId, ProtoBuf.Class> f66115a;

    /* renamed from: b */
    public final NameResolver f66116b;

    /* renamed from: c */
    public final BinaryVersion f66117c;

    /* renamed from: d */
    public final Function1<ClassId, SourceElement> f66118d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment packageFragment, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull Function1<? super ClassId, ? extends SourceElement> function1) {
        this.f66116b = nameResolver;
        this.f66117c = binaryVersion;
        this.f66118d = function1;
        List<ProtoBuf.Class> list = packageFragment.f65118h;
        Intrinsics.m32175d(list, "proto.class_List");
        int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g < 16 ? 16 : m32062g);
        for (Object obj : list) {
            ProtoBuf.Class klass = (ProtoBuf.Class) obj;
            NameResolver nameResolver2 = this.f66116b;
            Intrinsics.m32175d(klass, "klass");
            linkedHashMap.put(NameResolverUtilKt.m33584a(nameResolver2, klass.f64924f), obj);
        }
        this.f66115a = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    /* renamed from: a */
    public ClassData mo32911a(@NotNull ClassId classId) {
        Intrinsics.m32180i(classId, "classId");
        ProtoBuf.Class r0 = this.f66115a.get(classId);
        if (r0 != null) {
            return new ClassData(this.f66116b, r0, this.f66117c, this.f66118d.invoke(classId));
        }
        return null;
    }
}
