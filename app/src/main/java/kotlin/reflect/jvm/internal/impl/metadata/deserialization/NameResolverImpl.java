package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: NameResolverImpl.kt */
/* loaded from: classes3.dex */
public final class NameResolverImpl implements NameResolver {

    /* renamed from: a */
    public final ProtoBuf.StringTable f65425a;

    /* renamed from: b */
    public final ProtoBuf.QualifiedNameTable f65426b;

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable stringTable, @NotNull ProtoBuf.QualifiedNameTable qualifiedNameTable) {
        this.f65425a = stringTable;
        this.f65426b = qualifiedNameTable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    /* renamed from: a */
    public String mo33117a(int i2) {
        Triple<List<String>, List<String>, Boolean> m33119c = m33119c(i2);
        List<String> list = m33119c.f63068b;
        String m31989B = CollectionsKt.m31989B(m33119c.f63069c, ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return m31989B;
        }
        return CollectionsKt.m31989B(list, "/", null, null, 0, null, null, 62, null) + JsonPointer.SEPARATOR + m31989B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    /* renamed from: b */
    public boolean mo33118b(int i2) {
        return m33119c(i2).f63070d.booleanValue();
    }

    /* renamed from: c */
    public final Triple<List<String>, List<String>, Boolean> m33119c(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i2 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName proto = this.f65426b.f65160c.get(i2);
            ProtoBuf.StringTable stringTable = this.f65425a;
            Intrinsics.m32175d(proto, "proto");
            String str = stringTable.f65186c.get(proto.f65170e);
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = proto.f65171f;
            if (kind == null) {
                Intrinsics.m32188q();
                throw null;
            }
            int ordinal = kind.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i2 = proto.f65169d;
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i2) {
        String str = this.f65425a.f65186c.get(i2);
        Intrinsics.m32175d(str, "strings.getString(index)");
        return str;
    }
}
