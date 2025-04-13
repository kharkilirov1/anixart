package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes3.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* renamed from: m */
    public static final /* synthetic */ KProperty[] f64550m = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: f */
    public final LazyJavaResolverContext f64551f;

    /* renamed from: g */
    @NotNull
    public final NotNullLazyValue f64552g;

    /* renamed from: h */
    public final JvmPackageScope f64553h;

    /* renamed from: i */
    public final NotNullLazyValue<List<FqName>> f64554i;

    /* renamed from: j */
    @NotNull
    public final Annotations f64555j;

    /* renamed from: k */
    public final NotNullLazyValue f64556k;

    /* renamed from: l */
    public final JavaPackage f64557l;

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            KotlinClassHeader.Kind kind = KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
            iArr[5] = 1;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.FILE_FACADE;
            iArr[2] = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext outerContext, @NotNull JavaPackage jPackage) {
        super(outerContext.f64479c.f64460o, jPackage.mo32829d());
        Intrinsics.m32180i(outerContext, "outerContext");
        Intrinsics.m32180i(jPackage, "jPackage");
        this.f64557l = jPackage;
        LazyJavaResolverContext m32716a = ContextKt.m32716a(outerContext, this, null, 0, 6);
        this.f64551f = m32716a;
        this.f64552g = m32716a.f64479c.f64446a.mo33623c(new Function0<Map<String, ? extends KotlinJvmBinaryClass>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Map<String, ? extends KotlinJvmBinaryClass> invoke() {
                LazyJavaPackageFragment lazyJavaPackageFragment = LazyJavaPackageFragment.this;
                PackagePartProvider packagePartProvider = lazyJavaPackageFragment.f64551f.f64479c.f64457l;
                String str = lazyJavaPackageFragment.f64205e.f65597a.f65602a;
                Intrinsics.m32175d(str, "fqName.asString()");
                List<String> mo32358a = packagePartProvider.mo32358a(str);
                ArrayList arrayList = new ArrayList();
                for (String str2 : mo32358a) {
                    FqName fqName = new FqName(str2.replace(JsonPointer.SEPARATOR, '.'));
                    KotlinJvmBinaryClass mo32355b = LazyJavaPackageFragment.this.f64551f.f64479c.f64448c.mo32355b(new ClassId(fqName.m33198c(), fqName.m33199d()));
                    Pair pair = mo32355b != null ? new Pair(str2, mo32355b) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.m32067l(arrayList);
            }
        });
        this.f64553h = new JvmPackageScope(m32716a, jPackage, this);
        this.f64554i = m32716a.f64479c.f64446a.mo33622b(new Function0<List<? extends FqName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends FqName> invoke() {
                Collection<JavaPackage> mo32831u = LazyJavaPackageFragment.this.f64557l.mo32831u();
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo32831u, 10));
                Iterator<T> it = mo32831u.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JavaPackage) it.next()).mo32829d());
                }
                return arrayList;
            }
        }, EmptyList.f63144b);
        this.f64555j = m32716a.f64479c.f64462q.f64289b ? Annotations.Companion.f64024a : new LazyJavaAnnotations(m32716a, jPackage);
        this.f64556k = m32716a.f64479c.f64446a.mo33623c(new Function0<HashMap<JvmClassName, JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public HashMap<JvmClassName, JvmClassName> invoke() {
                String m32954a;
                HashMap<JvmClassName, JvmClassName> hashMap = new HashMap<>();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : LazyJavaPackageFragment.this.m32766G().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassName = new JvmClassName(key);
                    KotlinClassHeader mo32349b = value.mo32349b();
                    int ordinal = mo32349b.f64819a.ordinal();
                    if (ordinal == 2) {
                        hashMap.put(jvmClassName, jvmClassName);
                    } else if (ordinal == 5 && (m32954a = mo32349b.m32954a()) != null) {
                        hashMap.put(jvmClassName, new JvmClassName(m32954a));
                    }
                }
                return hashMap;
            }
        });
    }

    @NotNull
    /* renamed from: G */
    public final Map<String, KotlinJvmBinaryClass> m32766G() {
        return (Map) StorageKt.m33635a(this.f64552g, f64550m[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f64555j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    /* renamed from: i */
    public SourceElement mo32439i() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* renamed from: p */
    public MemberScope mo32415p() {
        return this.f64553h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Lazy Java package fragment: ");
        m24u.append(this.f64205e);
        return m24u.toString();
    }
}
