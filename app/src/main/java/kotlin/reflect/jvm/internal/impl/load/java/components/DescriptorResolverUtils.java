package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class DescriptorResolverUtils {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$1 */
    final class C65931 extends NonReportingOverrideStrategy {

        /* renamed from: a */
        public final /* synthetic */ ErrorReporter f64377a;

        /* renamed from: b */
        public final /* synthetic */ Set f64378b;

        /* renamed from: c */
        public final /* synthetic */ boolean f64379c;

        public C65931(ErrorReporter errorReporter, Set set, boolean z) {
            this.f64377a = errorReporter;
            this.f64378b = set;
            this.f64379c = z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        /* renamed from: a */
        public void mo32620a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            OverridingUtil.m33503q(callableMemberDescriptor, new Function1<CallableMemberDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1.1
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(CallableMemberDescriptor callableMemberDescriptor2) {
                    C65931.this.f64377a.mo32356a(callableMemberDescriptor2);
                    return Unit.f63088a;
                }
            });
            this.f64378b.add(callableMemberDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
        /* renamed from: d */
        public void mo32698d(@NotNull CallableMemberDescriptor member, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
            if (!this.f64379c || member.mo32493g() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                Intrinsics.m32180i(member, "member");
                member.mo32494t0(collection);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
        /* renamed from: e */
        public void mo32621e(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
        }
    }

    @Nullable
    /* renamed from: a */
    public static ValueParameterDescriptor m32695a(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        Collection<ClassConstructorDescriptor> mo32442l = classDescriptor.mo32442l();
        if (mo32442l.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : mo32442l.iterator().next().mo32489f()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: b */
    public static <D extends CallableMemberDescriptor> Collection<D> m32696b(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OverridingUtil.m33496g(collection, collection2, classDescriptor, new C65931(errorReporter, linkedHashSet, false));
        return linkedHashSet;
    }

    @NotNull
    /* renamed from: c */
    public static <D extends CallableMemberDescriptor> Collection<D> m32697c(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OverridingUtil.m33496g(collection, collection2, classDescriptor, new C65931(errorReporter, linkedHashSet, true));
        return linkedHashSet;
    }
}
