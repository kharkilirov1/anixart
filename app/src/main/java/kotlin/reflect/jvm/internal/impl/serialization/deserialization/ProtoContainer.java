package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.yandex.div2.C3033a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes3.dex */
public abstract class ProtoContainer {

    /* renamed from: a */
    @NotNull
    public final NameResolver f66119a;

    /* renamed from: b */
    @NotNull
    public final TypeTable f66120b;

    /* renamed from: c */
    @Nullable
    public final SourceElement f66121c;

    /* compiled from: ProtoContainer.kt */
    public static final class Class extends ProtoContainer {

        /* renamed from: d */
        @NotNull
        public final ClassId f66122d;

        /* renamed from: e */
        @NotNull
        public final ProtoBuf.Class.Kind f66123e;

        /* renamed from: f */
        public final boolean f66124f;

        /* renamed from: g */
        @NotNull
        public final ProtoBuf.Class f66125g;

        /* renamed from: h */
        @Nullable
        public final Class f66126h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class r2, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.m32180i(nameResolver, "nameResolver");
            Intrinsics.m32180i(typeTable, "typeTable");
            this.f66125g = r2;
            this.f66126h = r6;
            this.f66122d = NameResolverUtilKt.m33584a(nameResolver, r2.f64924f);
            ProtoBuf.Class.Kind mo33113b = Flags.f65400e.mo33113b(r2.f64923e);
            this.f66123e = mo33113b == null ? ProtoBuf.Class.Kind.CLASS : mo33113b;
            this.f66124f = C3033a.m17751m(Flags.f65401f, r2.f64923e, "Flags.IS_INNER.get(classProto.flags)");
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* renamed from: a */
        public FqName mo33586a() {
            FqName m33189a = this.f66122d.m33189a();
            Intrinsics.m32175d(m33189a, "classId.asSingleFqName()");
            return m33189a;
        }
    }

    /* compiled from: ProtoContainer.kt */
    public static final class Package extends ProtoContainer {

        /* renamed from: d */
        @NotNull
        public final FqName f66127d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.m32180i(fqName, "fqName");
            Intrinsics.m32180i(nameResolver, "nameResolver");
            Intrinsics.m32180i(typeTable, "typeTable");
            this.f66127d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        /* renamed from: a */
        public FqName mo33586a() {
            return this.f66127d;
        }
    }

    public ProtoContainer(@NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66119a = nameResolver;
        this.f66120b = typeTable;
        this.f66121c = sourceElement;
    }

    @NotNull
    /* renamed from: a */
    public abstract FqName mo33586a();

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + ": " + mo33586a();
    }
}
