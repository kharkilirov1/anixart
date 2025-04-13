package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public interface Check {

    /* compiled from: modifierChecks.kt */
    public static final class DefaultImpls {
        @Nullable
        /* renamed from: a */
        public static String m33762a(Check check, @NotNull FunctionDescriptor functionDescriptor) {
            if (check.mo33761b(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    @Nullable
    /* renamed from: a */
    String mo33760a(@NotNull FunctionDescriptor functionDescriptor);

    /* renamed from: b */
    boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor);

    @NotNull
    String getDescription();
}
