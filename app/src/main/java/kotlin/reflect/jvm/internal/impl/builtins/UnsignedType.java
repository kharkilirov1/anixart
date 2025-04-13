package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnsignedType.kt */
/* loaded from: classes3.dex */
public enum UnsignedType {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(ClassId.m33186d("kotlin/UByte")),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(ClassId.m33186d("kotlin/UShort")),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(ClassId.m33186d("kotlin/UInt")),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(ClassId.m33186d("kotlin/ULong"));


    /* renamed from: b */
    @NotNull
    public final Name f63831b;

    /* renamed from: c */
    @NotNull
    public final ClassId f63832c;

    /* renamed from: d */
    @NotNull
    public final ClassId f63833d;

    UnsignedType(ClassId classId) {
        this.f63833d = classId;
        Name m33193g = classId.m33193g();
        Intrinsics.m32175d(m33193g, "classId.shortClassName");
        this.f63831b = m33193g;
        this.f63832c = new ClassId(classId.f65593a, Name.m33211d(m33193g.f65606b + "Array"));
    }
}
