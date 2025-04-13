package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: protoTypeTableUtil.kt */
/* loaded from: classes3.dex */
public final class ProtoTypeTableUtilKt {
    /* renamed from: a */
    public static final boolean m33122a(@NotNull ProtoBuf.Function receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.m33015s() || receiver$0.m33016t();
    }

    /* renamed from: b */
    public static final boolean m33123b(@NotNull ProtoBuf.Property receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.m33032s() || receiver$0.m33033t();
    }

    @Nullable
    /* renamed from: c */
    public static final ProtoBuf.Type m33124c(@NotNull ProtoBuf.Type type, @NotNull TypeTable typeTable) {
        Intrinsics.m32180i(typeTable, "typeTable");
        if (type.m33059v()) {
            return type.f65204n;
        }
        if ((type.f65194d & RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            return typeTable.m33129a(type.f65205o);
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static final ProtoBuf.Type m33125d(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        Intrinsics.m32180i(typeTable, "typeTable");
        if (function.m33015s()) {
            return function.f65061k;
        }
        if (function.m33016t()) {
            return typeTable.m33129a(function.f65062l);
        }
        return null;
    }

    @NotNull
    /* renamed from: e */
    public static final ProtoBuf.Type m33126e(@NotNull ProtoBuf.Function function, @NotNull TypeTable typeTable) {
        Intrinsics.m32180i(typeTable, "typeTable");
        if (function.m33017u()) {
            ProtoBuf.Type returnType = function.f65058h;
            Intrinsics.m32175d(returnType, "returnType");
            return returnType;
        }
        if ((function.f65054d & 16) == 16) {
            return typeTable.m33129a(function.f65059i);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    @NotNull
    /* renamed from: f */
    public static final ProtoBuf.Type m33127f(@NotNull ProtoBuf.Property property, @NotNull TypeTable typeTable) {
        Intrinsics.m32180i(typeTable, "typeTable");
        if (property.m33034u()) {
            ProtoBuf.Type returnType = property.f65133h;
            Intrinsics.m32175d(returnType, "returnType");
            return returnType;
        }
        if ((property.f65129d & 16) == 16) {
            return typeTable.m33129a(property.f65134i);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    @NotNull
    /* renamed from: g */
    public static final ProtoBuf.Type m33128g(@NotNull ProtoBuf.ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        Intrinsics.m32180i(typeTable, "typeTable");
        if (valueParameter.m33092s()) {
            ProtoBuf.Type type = valueParameter.f65312g;
            Intrinsics.m32175d(type, "type");
            return type;
        }
        if ((valueParameter.f65309d & 8) == 8) {
            return typeTable.m33129a(valueParameter.f65313h);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
