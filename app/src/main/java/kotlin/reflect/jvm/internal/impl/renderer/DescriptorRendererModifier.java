package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true);


    /* renamed from: n */
    @JvmField
    @NotNull
    public static final Set<DescriptorRendererModifier> f65802n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public static final Set<DescriptorRendererModifier> f65803o;

    /* renamed from: b */
    public final boolean f65804b;

    /* compiled from: DescriptorRenderer.kt */
    public static final class Companion {
    }

    static {
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : values) {
            if (descriptorRendererModifier.f65804b) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        f65802n = CollectionsKt.m32035n0(arrayList);
        f65803o = ArraysKt.m31955e0(values());
    }

    DescriptorRendererModifier(boolean z) {
        this.f65804b = z;
    }
}
