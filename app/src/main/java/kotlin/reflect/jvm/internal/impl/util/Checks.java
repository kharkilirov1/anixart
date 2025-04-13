package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public final class Checks {

    /* renamed from: a */
    @Nullable
    public final Name f66423a;

    /* renamed from: b */
    @Nullable
    public final Regex f66424b;

    /* renamed from: c */
    @Nullable
    public final Collection<Name> f66425c;

    /* renamed from: d */
    @NotNull
    public final Function1<FunctionDescriptor, String> f66426d;

    /* renamed from: e */
    @NotNull
    public final Check[] f66427e;

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.f66423a = null;
        this.f66424b = regex;
        this.f66425c = collection;
        this.f66426d = function1;
        this.f66427e = checkArr;
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i2) {
        this(name, checkArr, (i2 & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.2
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                FunctionDescriptor receiver$0 = (FunctionDescriptor) obj;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return null;
            }
        } : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Checks(@NotNull Name name, @NotNull Check[] checks, @NotNull Function1<? super FunctionDescriptor, String> additionalChecks) {
        Intrinsics.m32180i(name, "name");
        Intrinsics.m32180i(checks, "checks");
        Intrinsics.m32180i(additionalChecks, "additionalChecks");
        Check[] checkArr = (Check[]) Arrays.copyOf(checks, checks.length);
        this.f66423a = name;
        this.f66424b = null;
        this.f66425c = null;
        this.f66426d = additionalChecks;
        this.f66427e = checkArr;
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i2) {
        this((Collection<Name>) collection, checkArr, (i2 & 4) != 0 ? new Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.4
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                FunctionDescriptor receiver$0 = (FunctionDescriptor) obj;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return null;
            }
        } : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@NotNull Collection<Name> nameList, @NotNull Check[] checks, @NotNull Function1<? super FunctionDescriptor, String> additionalChecks) {
        this(null, null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.m32180i(nameList, "nameList");
        Intrinsics.m32180i(checks, "checks");
        Intrinsics.m32180i(additionalChecks, "additionalChecks");
    }
}
