package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public interface MemberScope extends ResolutionScope {

    /* renamed from: a */
    public static final Companion f65992a = Companion.f65994b;

    /* compiled from: MemberScope.kt */
    public static final class Companion {

        /* renamed from: b */
        public static final /* synthetic */ Companion f65994b = new Companion();

        /* renamed from: a */
        @NotNull
        public static final Function1<Name, Boolean> f65993a = new Function1<Name, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Name name) {
                Name it = name;
                Intrinsics.m32180i(it, "it");
                return Boolean.TRUE;
            }
        };
    }

    /* compiled from: MemberScope.kt */
    public static final class DefaultImpls {
    }

    /* compiled from: MemberScope.kt */
    public static final class Empty extends MemberScopeImpl {

        /* renamed from: b */
        public static final Empty f65996b = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: b */
        public Set<Name> mo32615b() {
            return EmptySet.f63146b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        /* renamed from: f */
        public Set<Name> mo32618f() {
            return EmptySet.f63146b;
        }
    }

    @NotNull
    /* renamed from: a */
    Collection<SimpleFunctionDescriptor> mo32614a(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* renamed from: b */
    Set<Name> mo32615b();

    @NotNull
    /* renamed from: e */
    Collection<PropertyDescriptor> mo32617e(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    /* renamed from: f */
    Set<Name> mo32618f();
}
