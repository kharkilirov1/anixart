package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* renamed from: c */
    public final ClassDescriptor f66292c;

    /* renamed from: d */
    public final List<TypeParameterDescriptor> f66293d;

    /* renamed from: e */
    public final Collection<KotlinType> f66294e;

    public ClassTypeConstructorImpl(@NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull Collection<KotlinType> collection, @NotNull StorageManager storageManager) {
        super(storageManager);
        this.f66292c = classDescriptor;
        this.f66293d = Collections.unmodifiableList(new ArrayList(list));
        this.f66294e = Collections.unmodifiableCollection(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: b */
    public ClassifierDescriptor mo32449b() {
        return this.f66292c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: c */
    public boolean mo32450c() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* renamed from: e */
    public Collection<KotlinType> mo32451e() {
        return this.f66294e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return this.f66293d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    @NotNull
    /* renamed from: h */
    public SupertypeLoopChecker mo32452h() {
        return SupertypeLoopChecker.EMPTY.f63981a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
    @NotNull
    /* renamed from: k */
    public ClassDescriptor mo32449b() {
        return this.f66292c;
    }

    public String toString() {
        return DescriptorUtils.m33468d(this.f66292c).f65602a;
    }
}
