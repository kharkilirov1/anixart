package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes3.dex */
public final class NewKotlinTypeCheckerKt {
    /* renamed from: a */
    public static final boolean m33717a(@NotNull SimpleType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.mo33515H0().mo32449b() instanceof ClassDescriptor;
    }

    /* renamed from: b */
    public static final boolean m33718b(@NotNull SimpleType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return (KotlinTypeKt.m33667a(receiver$0) || (receiver$0.mo33515H0().mo32449b() instanceof TypeAliasDescriptor) || (receiver$0.mo33515H0().mo32449b() == null && !(receiver$0 instanceof CapturedType) && !(receiver$0 instanceof NewCapturedType) && !(receiver$0 instanceof DefinitelyNotNullType))) ? false : true;
    }
}
