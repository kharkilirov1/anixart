package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public final class OperatorChecks extends AbstractModifierChecks {

    /* renamed from: a */
    @NotNull
    public static final List<Checks> f66437a;

    /* renamed from: b */
    public static final OperatorChecks f66438b = new OperatorChecks();

    static {
        Name name = OperatorNameConventions.f66451i;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.f66434b;
        Check[] checkArr = {memberOrExtension, new ValueParameterCountCheck.AtLeast(1)};
        Name name2 = OperatorNameConventions.f66452j;
        Check[] checkArr2 = {memberOrExtension, new ValueParameterCountCheck.AtLeast(2)};
        Name name3 = OperatorNameConventions.f66443a;
        NoDefaultAndVarargsCheck noDefaultAndVarargsCheck = NoDefaultAndVarargsCheck.f66436a;
        IsKPropertyCheck isKPropertyCheck = IsKPropertyCheck.f66431a;
        Check[] checkArr3 = {memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(2), isKPropertyCheck};
        Name name4 = OperatorNameConventions.f66444b;
        Check[] checkArr4 = {memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.AtLeast(3), isKPropertyCheck};
        Name name5 = OperatorNameConventions.f66445c;
        Check[] checkArr5 = {memberOrExtension, noDefaultAndVarargsCheck, new ValueParameterCountCheck.Equals(2), isKPropertyCheck};
        Name name6 = OperatorNameConventions.f66449g;
        Check[] checkArr6 = {memberOrExtension};
        Name name7 = OperatorNameConventions.f66448f;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.f66474b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f66464c;
        Check[] checkArr7 = {memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck, returnsBoolean};
        Name name8 = OperatorNameConventions.f66450h;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.f66473b;
        Check[] checkArr8 = {memberOrExtension, noValueParameters};
        Name name9 = OperatorNameConventions.f66453k;
        Check[] checkArr9 = {memberOrExtension, noValueParameters};
        Name name10 = OperatorNameConventions.f66454l;
        Check[] checkArr10 = {memberOrExtension, noValueParameters, returnsBoolean};
        Name name11 = OperatorNameConventions.f66458p;
        Check[] checkArr11 = {memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck};
        Name name12 = OperatorNameConventions.f66446d;
        Check[] checkArr12 = {MemberKindCheck.Member.f66433b};
        Name name13 = OperatorNameConventions.f66447e;
        Check[] checkArr13 = {memberOrExtension, ReturnsCheck.ReturnsInt.f66466c, singleValueParameter, noDefaultAndVarargsCheck};
        Set<Name> set = OperatorNameConventions.f66460r;
        Check[] checkArr14 = {memberOrExtension, singleValueParameter, noDefaultAndVarargsCheck};
        Set<Name> set2 = OperatorNameConventions.f66459q;
        Check[] checkArr15 = {memberOrExtension, noValueParameters};
        List m31994G = CollectionsKt.m31994G(OperatorNameConventions.f66456n, OperatorNameConventions.f66457o);
        Check[] checkArr16 = {memberOrExtension};
        Set<Name> set3 = OperatorNameConventions.f66461s;
        Check[] checkArr17 = {memberOrExtension, ReturnsCheck.ReturnsUnit.f66468c, singleValueParameter, noDefaultAndVarargsCheck};
        Regex regex = OperatorNameConventions.f66455m;
        Check[] checkArr18 = {memberOrExtension, noValueParameters};
        Checks.C67523 additionalChecks = Checks.C67523.f66429b;
        Intrinsics.m32180i(regex, "regex");
        Intrinsics.m32180i(additionalChecks, "additionalChecks");
        f66437a = CollectionsKt.m31994G(new Checks(name, checkArr, (Function1) null, 4), new Checks(name2, checkArr2, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$1
            @Override // kotlin.jvm.functions.Function1
            public String invoke(FunctionDescriptor functionDescriptor) {
                FunctionDescriptor receiver$0 = functionDescriptor;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                List<ValueParameterDescriptor> valueParameters = receiver$0.mo32489f();
                Intrinsics.m32175d(valueParameters, "valueParameters");
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.m31992E(valueParameters);
                boolean z = false;
                if (valueParameterDescriptor != null) {
                    if (!DescriptorUtilsKt.m33529b(valueParameterDescriptor) && valueParameterDescriptor.mo32572j0() == null) {
                        z = true;
                    }
                }
                OperatorChecks operatorChecks = OperatorChecks.f66438b;
                if (z) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            }
        }), new Checks(name3, checkArr3, (Function1) null, 4), new Checks(name4, checkArr4, (Function1) null, 4), new Checks(name5, checkArr5, (Function1) null, 4), new Checks(name6, checkArr6, (Function1) null, 4), new Checks(name7, checkArr7, (Function1) null, 4), new Checks(name8, checkArr8, (Function1) null, 4), new Checks(name9, checkArr9, (Function1) null, 4), new Checks(name10, checkArr10, (Function1) null, 4), new Checks(name11, checkArr11, (Function1) null, 4), new Checks(name12, checkArr12, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2

            /* compiled from: modifierChecks.kt */
            /* renamed from: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 */
            final class C67541 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {

                /* renamed from: b */
                public static final C67541 f66441b = new C67541();

                public C67541() {
                    super(1);
                }

                /* renamed from: a */
                public final boolean m33765a(@NotNull DeclarationDescriptor receiver$0) {
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    return (receiver$0 instanceof ClassDescriptor) && KotlinBuiltIns.m32389b((ClassDescriptor) receiver$0, KotlinBuiltIns.f63730l.f63768a);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(DeclarationDescriptor declarationDescriptor) {
                    return Boolean.valueOf(m33765a(declarationDescriptor));
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
            
                if (r6 != false) goto L15;
             */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6) {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r6
                    java.lang.String r0 = "receiver$0"
                    kotlin.jvm.internal.Intrinsics.m32180i(r6, r0)
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.C67541.f66441b
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks r1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f66438b
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r6.mo32437b()
                    java.lang.String r2 = "containingDeclaration"
                    kotlin.jvm.internal.Intrinsics.m32175d(r1, r2)
                    boolean r0 = r0.m33765a(r1)
                    r1 = 0
                    r2 = 1
                    if (r0 != 0) goto L57
                    java.util.Collection r6 = r6.mo32488e()
                    java.lang.String r0 = "overriddenDescriptors"
                    kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
                    boolean r0 = r6.isEmpty()
                    if (r0 == 0) goto L2c
                    goto L54
                L2c:
                    java.util.Iterator r6 = r6.iterator()
                L30:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L54
                    java.lang.Object r0 = r6.next()
                    kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
                    kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 r3 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.C67541.f66441b
                    java.lang.String r4 = "it"
                    kotlin.jvm.internal.Intrinsics.m32175d(r0, r4)
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.mo32437b()
                    java.lang.String r4 = "it.containingDeclaration"
                    kotlin.jvm.internal.Intrinsics.m32175d(r0, r4)
                    boolean r0 = r3.m33765a(r0)
                    if (r0 == 0) goto L30
                    r6 = 1
                    goto L55
                L54:
                    r6 = 0
                L55:
                    if (r6 == 0) goto L58
                L57:
                    r1 = 1
                L58:
                    if (r1 != 0) goto L5d
                    java.lang.String r6 = "must override ''equals()'' in Any"
                    goto L5e
                L5d:
                    r6 = 0
                L5e:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.invoke(java.lang.Object):java.lang.Object");
            }
        }), new Checks(name13, checkArr13, (Function1) null, 4), new Checks(set, checkArr14, (Function1) null, 4), new Checks(set2, checkArr15, (Function1) null, 4), new Checks(m31994G, checkArr16, new Function1<FunctionDescriptor, String>() { // from class: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$3
            @Override // kotlin.jvm.functions.Function1
            public String invoke(FunctionDescriptor functionDescriptor) {
                boolean z;
                FunctionDescriptor receiver$0 = functionDescriptor;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                ReceiverParameterDescriptor mo32490f0 = receiver$0.mo32490f0();
                if (mo32490f0 == null) {
                    mo32490f0 = receiver$0.mo32492k0();
                }
                OperatorChecks operatorChecks = OperatorChecks.f66438b;
                boolean z2 = false;
                if (mo32490f0 != null) {
                    KotlinType returnType = receiver$0.getReturnType();
                    if (returnType != null) {
                        KotlinType type = mo32490f0.getType();
                        Intrinsics.m32175d(type, "receiver.type");
                        z = TypeUtilsKt.m33749d(returnType, type);
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            }
        }), new Checks(set3, checkArr17, (Function1) null, 4), new Checks(null, regex, null, additionalChecks, (Check[]) Arrays.copyOf(checkArr18, 2)));
    }

    @NotNull
    /* renamed from: a */
    public List<Checks> m33764a() {
        return f66437a;
    }
}
