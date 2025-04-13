package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes3.dex */
public interface DeclaredMemberIndex {

    /* compiled from: DeclaredMemberIndex.kt */
    public static final class Empty implements DeclaredMemberIndex {

        /* renamed from: a */
        public static final Empty f64498a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* renamed from: a */
        public Set<Name> mo32727a() {
            return EmptySet.f63146b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        /* renamed from: b */
        public JavaField mo32728b(@NotNull Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* renamed from: c */
        public Set<Name> mo32729c() {
            return EmptySet.f63146b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* renamed from: d */
        public Collection mo32730d(Name name) {
            Intrinsics.m32180i(name, "name");
            return EmptyList.f63144b;
        }
    }

    @NotNull
    /* renamed from: a */
    Set<Name> mo32727a();

    @Nullable
    /* renamed from: b */
    JavaField mo32728b(@NotNull Name name);

    @NotNull
    /* renamed from: c */
    Set<Name> mo32729c();

    @NotNull
    /* renamed from: d */
    Collection<JavaMethod> mo32730d(@NotNull Name name);
}
