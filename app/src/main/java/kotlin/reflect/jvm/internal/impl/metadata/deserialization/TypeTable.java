package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeTable.kt */
/* loaded from: classes3.dex */
public final class TypeTable {

    /* renamed from: a */
    @NotNull
    public final List<ProtoBuf.Type> f65427a;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        List<ProtoBuf.Type> originalTypes = typeTable.f65299d;
        int i2 = 0;
        if ((typeTable.f65298c & 1) == 1) {
            int i3 = typeTable.f65300e;
            Intrinsics.m32175d(originalTypes, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(originalTypes, 10));
            for (Object obj : originalTypes) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                ProtoBuf.Type type = (ProtoBuf.Type) obj;
                if (i2 >= i3) {
                    Objects.requireNonNull(type);
                    ProtoBuf.Type.Builder m33055y = ProtoBuf.Type.m33055y(type);
                    m33055y.f65230e |= 2;
                    m33055y.f65232g = true;
                    type = m33055y.m33069m();
                    if (!type.mo32959e()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(type);
                i2 = i4;
            }
            originalTypes = arrayList;
        } else {
            Intrinsics.m32175d(originalTypes, "originalTypes");
        }
        this.f65427a = originalTypes;
    }

    @NotNull
    /* renamed from: a */
    public final ProtoBuf.Type m33129a(int i2) {
        return this.f65427a.get(i2);
    }
}
