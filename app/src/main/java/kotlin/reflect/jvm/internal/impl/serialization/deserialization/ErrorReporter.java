package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface ErrorReporter {

    /* renamed from: a */
    public static final ErrorReporter f66086a = new ErrorReporter() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.1
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* renamed from: a */
        public void mo32356a(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        /* renamed from: b */
        public void mo32357b(@NotNull ClassDescriptor classDescriptor, @NotNull List<String> list) {
        }
    };

    /* renamed from: a */
    void mo32356a(@NotNull CallableMemberDescriptor callableMemberDescriptor);

    /* renamed from: b */
    void mo32357b(@NotNull ClassDescriptor classDescriptor, @NotNull List<String> list);
}
