package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: b */
    @NotNull
    public Collection<?> f63204b = EmptyList.f63144b;

    /* renamed from: c */
    public final int f63205c = 0;

    /* compiled from: ListBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        List list;
        Intrinsics.m32179h(input, "input");
        byte readByte = input.readByte();
        int i2 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i3 = 0;
        if (i2 == 0) {
            ListBuilder listBuilder = new ListBuilder(readInt);
            while (i3 < readInt) {
                listBuilder.add(input.readObject());
                i3++;
            }
            list = CollectionsKt.m32030l(listBuilder);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            SetBuilder setBuilder = new SetBuilder(readInt);
            while (i3 < readInt) {
                setBuilder.add(input.readObject());
                i3++;
            }
            MapBuilder<E, ?> mapBuilder = setBuilder.f63207b;
            mapBuilder.m32097c();
            mapBuilder.f63195m = true;
            list = setBuilder;
        }
        this.f63204b = list;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) {
        Intrinsics.m32179h(output, "output");
        output.writeByte(this.f63205c);
        output.writeInt(this.f63204b.size());
        Iterator<?> it = this.f63204b.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
