package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmBuiltIns.kt */
/* loaded from: classes3.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* renamed from: q */
    public static final /* synthetic */ KProperty[] f63897q = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(JvmBuiltIns.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};

    /* renamed from: n */
    public ModuleDescriptor f63898n;

    /* renamed from: o */
    public boolean f63899o;

    /* renamed from: p */
    @NotNull
    public final NotNullLazyValue f63900p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JvmBuiltIns(final StorageManager storageManager, boolean z, int i2) {
        super(storageManager);
        z = (i2 & 2) != 0 ? true : z;
        this.f63899o = true;
        this.f63900p = ((LockBasedStorageManager) storageManager).mo33623c(new Function0<JvmBuiltInsSettings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public JvmBuiltInsSettings invoke() {
                ModuleDescriptorImpl builtInsModule = JvmBuiltIns.this.f63732a;
                Intrinsics.m32175d(builtInsModule, "builtInsModule");
                return new JvmBuiltInsSettings(builtInsModule, storageManager, new Function0<ModuleDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.1
                    @Override // kotlin.jvm.functions.Function0
                    public ModuleDescriptor invoke() {
                        ModuleDescriptor moduleDescriptor = JvmBuiltIns.this.f63898n;
                        if (moduleDescriptor != null) {
                            return moduleDescriptor;
                        }
                        throw new AssertionError("JvmBuiltins has not been initialized properly");
                    }
                }, new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2.2
                    @Override // kotlin.jvm.functions.Function0
                    public Boolean invoke() {
                        JvmBuiltIns jvmBuiltIns = JvmBuiltIns.this;
                        if (jvmBuiltIns.f63898n != null) {
                            return Boolean.valueOf(jvmBuiltIns.f63899o);
                        }
                        throw new AssertionError("JvmBuiltins has not been initialized properly");
                    }
                });
            }
        });
        if (z) {
            m32395c();
        }
    }

    @NotNull
    /* renamed from: P */
    public final JvmBuiltInsSettings m32474P() {
        return (JvmBuiltInsSettings) StorageKt.m33635a(this.f63900p, f63897q[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* renamed from: d */
    public AdditionalClassPartsProvider mo32396d() {
        return m32474P();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* renamed from: l */
    public Iterable mo32403l() {
        List singletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f63736e, this.f63732a));
        Intrinsics.m32175d(singletonList, "super.getClassDescriptorFactories()");
        StorageManager storageManager = this.f63736e;
        Intrinsics.m32175d(storageManager, "storageManager");
        ModuleDescriptorImpl builtInsModule = this.f63732a;
        Intrinsics.m32175d(builtInsModule, "builtInsModule");
        return CollectionsKt.m32001N(singletonList, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    /* renamed from: s */
    public PlatformDependentDeclarationFilter mo32409s() {
        return m32474P();
    }
}
