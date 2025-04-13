package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public final class ExcludedTypeAnnotations {

    /* renamed from: b */
    public static final ExcludedTypeAnnotations f65853b = new ExcludedTypeAnnotations();

    /* renamed from: a */
    @NotNull
    public static final Set<FqName> f65852a = SetsKt.m32080g(new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact"));
}
