package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public abstract class DescriptorKindExclude {

    /* compiled from: MemberScope.kt */
    public static final class NonExtensions extends DescriptorKindExclude {

        /* renamed from: a */
        public static final int f65960a;

        /* renamed from: b */
        public static final NonExtensions f65961b = new NonExtensions();

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.f65979s;
            Objects.requireNonNull(companion);
            int i2 = DescriptorKindFilter.f65970j;
            Objects.requireNonNull(companion);
            int i3 = DescriptorKindFilter.f65968h;
            Objects.requireNonNull(companion);
            f65960a = (~(DescriptorKindFilter.f65969i | i3)) & i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* renamed from: a */
        public int mo33546a() {
            return f65960a;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* renamed from: a */
        public static final TopLevelPackages f65962a = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* renamed from: a */
        public int mo33546a() {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract int mo33546a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
