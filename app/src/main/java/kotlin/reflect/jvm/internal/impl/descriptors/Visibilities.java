package kotlin.reflect.jvm.internal.impl.descriptors;

import com.yandex.metrica.push.common.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class Visibilities {

    /* renamed from: a */
    @NotNull
    public static final Visibility f63984a;

    /* renamed from: b */
    @NotNull
    public static final Visibility f63985b;

    /* renamed from: c */
    @NotNull
    public static final Visibility f63986c;

    /* renamed from: d */
    @NotNull
    public static final Visibility f63987d;

    /* renamed from: e */
    @NotNull
    public static final Visibility f63988e;

    /* renamed from: f */
    @NotNull
    public static final Visibility f63989f;

    /* renamed from: g */
    @NotNull
    public static final Visibility f63990g;

    /* renamed from: h */
    @NotNull
    public static final Visibility f63991h;

    /* renamed from: i */
    @NotNull
    public static final Visibility f63992i;

    /* renamed from: j */
    public static final Map<Visibility, Integer> f63993j;

    /* renamed from: k */
    public static final Visibility f63994k;

    /* renamed from: l */
    public static final ReceiverValue f63995l;

    /* renamed from: m */
    public static final ReceiverValue f63996m;

    /* renamed from: n */
    @Deprecated
    public static final ReceiverValue f63997n;

    /* renamed from: o */
    @NotNull
    public static final ModuleVisibilityHelper f63998o;

    static {
        boolean z = false;
        Visibility visibility = new Visibility("private", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                if (DescriptorUtils.m33484t(declarationDescriptorWithVisibility)) {
                    if (DescriptorUtils.m33467c(declarationDescriptor) != SourceFile.f63980a) {
                        return Visibilities.m32580c(declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                }
                if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                    ClassifierDescriptorWithTypeParameters mo32437b = ((ConstructorDescriptor) declarationDescriptorWithVisibility).mo32437b();
                    if (DescriptorUtils.m33482r(mo32437b) && DescriptorUtils.m33484t(mo32437b) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.m33484t(declarationDescriptor.mo32437b()) && Visibilities.m32580c(declarationDescriptorWithVisibility, declarationDescriptor)) {
                        return true;
                    }
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.mo32437b();
                    if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.m33476l(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                        break;
                    }
                }
                if (declarationDescriptorWithVisibility == 0) {
                    return false;
                }
                while (declarationDescriptor != null) {
                    if (declarationDescriptorWithVisibility == declarationDescriptor) {
                        return true;
                    }
                    if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                        return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.mo32550d().equals(((PackageFragmentDescriptor) declarationDescriptor).mo32550d()) && DescriptorUtils.m33466b(declarationDescriptor).equals(DescriptorUtils.m33466b(declarationDescriptorWithVisibility));
                    }
                    declarationDescriptor = declarationDescriptor.mo32437b();
                }
                return false;
            }
        };
        f63984a = visibility;
        Visibility visibility2 = new Visibility("private_to_this", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.2
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            @NotNull
            /* renamed from: b */
            public String mo32583b() {
                return "private/*private to this*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                DeclarationDescriptor m33470f;
                if (Visibilities.f63984a.mo32582c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                    if (receiverValue == Visibilities.f63996m) {
                        return true;
                    }
                    if (receiverValue != Visibilities.f63995l && (m33470f = DescriptorUtils.m33470f(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                        return ((ThisClassReceiver) receiverValue).mo33553q().mo32487a().equals(m33470f.mo32487a());
                    }
                }
                return false;
            }
        };
        f63985b = visibility2;
        boolean z2 = true;
        Visibility visibility3 = new Visibility("protected", z2) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.3
            /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
            
                if ((r0.mo33662J0() instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType) == false) goto L48;
             */
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean mo32582c(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8) {
                /*
                    r5 = this;
                    java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33470f(r7, r0)
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1
                    r2 = 0
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33471g(r8, r0, r2)
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r8
                    if (r8 != 0) goto L12
                    return r2
                L12:
                    r3 = 1
                    if (r1 == 0) goto L32
                    boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33476l(r1)
                    if (r4 == 0) goto L32
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33470f(r1, r0)
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1
                    if (r1 == 0) goto L32
                    kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r8.mo32502r()
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r1.mo32487a()
                    boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33483s(r4, r1)
                    if (r1 == 0) goto L32
                    return r3
                L32:
                    boolean r1 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                    if (r1 == 0) goto L3e
                    r1 = r7
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33485u(r1)
                    goto L3f
                L3e:
                    r1 = r7
                L3f:
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33470f(r1, r0)
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                    if (r0 != 0) goto L48
                    return r2
                L48:
                    kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r8.mo32502r()
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = r0.mo32487a()
                    boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33483s(r4, r0)
                    if (r0 == 0) goto L93
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63997n
                    if (r6 != r0) goto L5b
                    goto L90
                L5b:
                    boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                    if (r0 != 0) goto L60
                    goto L8f
                L60:
                    boolean r0 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                    if (r0 == 0) goto L65
                    goto L8f
                L65:
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63996m
                    if (r6 != r0) goto L6a
                    goto L8f
                L6a:
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r0 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63995l
                    if (r6 == r0) goto L90
                    if (r6 != 0) goto L71
                    goto L90
                L71:
                    boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue
                    if (r0 == 0) goto L7d
                    r0 = r6
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) r0
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.m33554a()
                    goto L81
                L7d:
                    kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r6.getType()
                L81:
                    boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.m33483s(r0, r8)
                    if (r1 != 0) goto L8f
                    kotlin.reflect.jvm.internal.impl.types.UnwrappedType r0 = r0.mo33662J0()
                    boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType
                    if (r0 == 0) goto L90
                L8f:
                    r2 = 1
                L90:
                    if (r2 == 0) goto L93
                    return r3
                L93:
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8 = r8.mo32437b()
                    boolean r6 = r5.mo32582c(r6, r7, r8)
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.C65663.mo32582c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):boolean");
            }
        };
        f63986c = visibility3;
        Visibility visibility4 = new Visibility("internal", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.4
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                if (DescriptorUtils.m33466b(declarationDescriptor).mo32546e0(DescriptorUtils.m33466b(declarationDescriptorWithVisibility))) {
                    return Visibilities.f63998o.mo33763a(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                return false;
            }
        };
        f63987d = visibility4;
        Visibility visibility5 = new Visibility("public", z2) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.5
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                return true;
            }
        };
        f63988e = visibility5;
        Visibility visibility6 = new Visibility("local", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.6
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        };
        f63989f = visibility6;
        f63990g = new Visibility("inherited", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.7
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                throw new IllegalStateException("Visibility is unknown yet");
            }
        };
        f63991h = new Visibility("invisible_fake", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.8
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                return false;
            }
        };
        f63992i = new Visibility(CoreConstants.Transport.UNKNOWN, z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.9
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            /* renamed from: c */
            public boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
                return false;
            }
        };
        Collections.unmodifiableSet(SetsKt.m32080g(visibility, visibility2, visibility4, visibility6));
        HashMap m33773c = CollectionsKt.m33773c(4);
        m33773c.put(visibility2, 0);
        m33773c.put(visibility, 0);
        m33773c.put(visibility4, 1);
        m33773c.put(visibility3, 1);
        m33773c.put(visibility5, 2);
        f63993j = Collections.unmodifiableMap(m33773c);
        f63994k = visibility5;
        f63995l = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.10
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            @NotNull
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        f63996m = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.11
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            @NotNull
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        f63997n = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.12
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            @NotNull
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f63998o = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.f66435a;
    }

    @Nullable
    /* renamed from: a */
    public static Integer m32578a(@NotNull Visibility visibility, @NotNull Visibility visibility2) {
        Integer mo32584a = visibility.mo32584a(visibility2);
        if (mo32584a != null) {
            return mo32584a;
        }
        Integer mo32584a2 = visibility2.mo32584a(visibility);
        if (mo32584a2 != null) {
            return Integer.valueOf(-mo32584a2.intValue());
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static DeclarationDescriptorWithVisibility m32579b(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptorWithVisibility m32579b;
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.mo32487a(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != f63989f; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.m33470f(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().mo32582c(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (m32579b = m32579b(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).mo32651n0(), declarationDescriptor)) == null) {
            return null;
        }
        return m32579b;
    }

    /* renamed from: c */
    public static boolean m32580c(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
        SourceFile m33467c = DescriptorUtils.m33467c(declarationDescriptor2);
        if (m33467c != SourceFile.f63980a) {
            return m33467c.equals(DescriptorUtils.m33467c(declarationDescriptor));
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m32581d(@NotNull Visibility visibility) {
        return visibility == f63984a || visibility == f63985b;
    }
}
