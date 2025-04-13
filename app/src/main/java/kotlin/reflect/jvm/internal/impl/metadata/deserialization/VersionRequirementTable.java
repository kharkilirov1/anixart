package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes3.dex */
public final class VersionRequirementTable {

    /* renamed from: a */
    public final List<ProtoBuf.VersionRequirement> f65439a;

    /* renamed from: c */
    public static final Companion f65438c = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final VersionRequirementTable f65437b = new VersionRequirementTable(EmptyList.f63144b);

    /* compiled from: VersionRequirement.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final VersionRequirementTable m33130a(@NotNull ProtoBuf.VersionRequirementTable versionRequirementTable) {
            if (versionRequirementTable.f65357c.size() == 0) {
                VersionRequirementTable versionRequirementTable2 = VersionRequirementTable.f65437b;
                return VersionRequirementTable.f65437b;
            }
            List<ProtoBuf.VersionRequirement> list = versionRequirementTable.f65357c;
            Intrinsics.m32175d(list, "table.requirementList");
            return new VersionRequirementTable(list, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public VersionRequirementTable(List<ProtoBuf.VersionRequirement> list) {
        this.f65439a = list;
    }

    public VersionRequirementTable(@NotNull List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.f65439a = list;
    }
}
