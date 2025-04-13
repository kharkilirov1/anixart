package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface VariableDescriptor extends ValueDescriptor {
    @Nullable
    /* renamed from: V */
    ConstantValue<?> mo32574V();

    /* renamed from: i0 */
    boolean mo32575i0();

    boolean isConst();

    /* renamed from: p0 */
    boolean mo32576p0();
}
