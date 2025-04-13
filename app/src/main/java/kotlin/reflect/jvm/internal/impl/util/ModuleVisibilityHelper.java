package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModuleVisibilityHelper.kt */
/* loaded from: classes3.dex */
public interface ModuleVisibilityHelper {

    /* compiled from: ModuleVisibilityHelper.kt */
    public static final class EMPTY implements ModuleVisibilityHelper {

        /* renamed from: a */
        public static final EMPTY f66435a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        /* renamed from: a */
        public boolean mo33763a(@NotNull DeclarationDescriptor what, @NotNull DeclarationDescriptor from) {
            Intrinsics.m32180i(what, "what");
            Intrinsics.m32180i(from, "from");
            return true;
        }
    }

    /* renamed from: a */
    boolean mo33763a(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);
}
