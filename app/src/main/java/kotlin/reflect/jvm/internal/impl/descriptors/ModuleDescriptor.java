package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModuleDescriptor.kt */
/* loaded from: classes3.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    /* compiled from: ModuleDescriptor.kt */
    public static final class Capability<T> {

        /* renamed from: a */
        @NotNull
        public final String f63961a;

        public Capability(@NotNull String str) {
            this.f63961a = str;
        }

        @NotNull
        public String toString() {
            return this.f63961a;
        }
    }

    /* compiled from: ModuleDescriptor.kt */
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: K */
    PackageViewDescriptor mo32545K(@NotNull FqName fqName);

    /* renamed from: e0 */
    boolean mo32546e0(@NotNull ModuleDescriptor moduleDescriptor);

    @NotNull
    /* renamed from: n */
    KotlinBuiltIns mo32547n();

    @NotNull
    /* renamed from: o */
    Collection<FqName> mo32548o(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);
}
