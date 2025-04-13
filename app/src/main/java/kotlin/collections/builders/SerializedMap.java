package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: MapBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: b */
    @NotNull
    public Map<?, ?> f63206b;

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public SerializedMap() {
        Map<?, ?> map;
        map = EmptyMap.f63145b;
        this.f63206b = map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Intrinsics.m32179h(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException(C0000a.m7d("Unsupported flags value: ", readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        MapBuilder mapBuilder = new MapBuilder(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        mapBuilder.m32097c();
        mapBuilder.f63195m = true;
        this.f63206b = mapBuilder;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.m32179h(output, "output");
        output.writeByte(0);
        output.writeInt(this.f63206b.size());
        for (Map.Entry<?, ?> entry : this.f63206b.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
