package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes3.dex */
public class DeserializedAnnotations implements Annotations {

    /* renamed from: c */
    public static final /* synthetic */ KProperty[] f66149c = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: b */
    public final NotNullLazyValue f66150b;

    public DeserializedAnnotations(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<? extends AnnotationDescriptor>> function0) {
        Intrinsics.m32180i(storageManager, "storageManager");
        this.f66150b = storageManager.mo33623c(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* renamed from: R0 */
    public boolean mo32592R0(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32596b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* renamed from: h */
    public AnnotationDescriptor mo32593h(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return Annotations.DefaultImpls.m32595a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return ((List) StorageKt.m33635a(this.f66150b, f66149c[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return ((List) StorageKt.m33635a(this.f66150b, f66149c[0])).iterator();
    }
}
