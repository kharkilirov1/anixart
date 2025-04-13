package kotlin.reflect.jvm.internal.impl.types;

import com.yandex.mobile.ads.C4632R;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinType.kt */
/* loaded from: classes3.dex */
public abstract class SimpleType extends UnwrappedType {
    public SimpleType() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public abstract SimpleType mo32787K0(boolean z);

    @NotNull
    /* renamed from: N0 */
    public abstract SimpleType mo32840N0(@NotNull Annotations annotations);

    @NotNull
    public String toString() {
        String mo33364s;
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            mo33364s = DescriptorRenderer.f65767b.mo33364s(it.next(), null);
            String[] strArr = {"[", mo33364s, "] "};
            for (int i2 = 0; i2 < 3; i2++) {
                sb.append(strArr[i2]);
            }
        }
        sb.append(mo33515H0());
        if (!mo33514G0().isEmpty()) {
            CollectionsKt.m32049z(mo33514G0(), sb, ", ", "<", ">", 0, null, null, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, null);
        }
        if (mo32838I0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
