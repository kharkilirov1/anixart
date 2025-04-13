package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* loaded from: classes3.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* renamed from: c */
    public static final Companion f63839c = new Companion(null);

    /* renamed from: a */
    public final StorageManager f63840a;

    /* renamed from: b */
    public final ModuleDescriptor f63841b;

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @Nullable
        /* renamed from: a */
        public final FunctionClassDescriptor.Kind m32428a(@NotNull String str, @NotNull FqName fqName) {
            KindWithArity m32429b = m32429b(str, fqName);
            if (m32429b != null) {
                return m32429b.f63842a;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.KindWithArity m32429b(java.lang.String r10, kotlin.reflect.jvm.internal.impl.name.FqName r11) {
            /*
                r9 = this;
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$Kind$Companion r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.f63861i
                java.util.Objects.requireNonNull(r0)
                java.lang.String r0 = "packageFqName"
                kotlin.jvm.internal.Intrinsics.m32180i(r11, r0)
                java.lang.String r0 = "className"
                kotlin.jvm.internal.Intrinsics.m32180i(r10, r0)
                kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$Kind[] r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.values()
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L16:
                r4 = 1
                r5 = 0
                if (r3 >= r1) goto L36
                r6 = r0[r3]
                kotlin.reflect.jvm.internal.impl.name.FqName r7 = r6.f63862b
                boolean r7 = kotlin.jvm.internal.Intrinsics.m32174c(r7, r11)
                if (r7 == 0) goto L2f
                java.lang.String r7 = r6.f63863c
                r8 = 2
                boolean r7 = kotlin.text.StringsKt.m33898X(r10, r7, r2, r8, r5)
                if (r7 == 0) goto L2f
                r7 = 1
                goto L30
            L2f:
                r7 = 0
            L30:
                if (r7 == 0) goto L33
                goto L37
            L33:
                int r3 = r3 + 1
                goto L16
            L36:
                r6 = r5
            L37:
                if (r6 == 0) goto L7e
                java.lang.String r11 = r6.f63863c
                int r11 = r11.length()
                java.lang.String r10 = r10.substring(r11)
                java.lang.String r11 = "(this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.m32175d(r10, r11)
                int r11 = r10.length()
                if (r11 != 0) goto L4f
                goto L50
            L4f:
                r4 = 0
            L50:
                if (r4 == 0) goto L54
            L52:
                r10 = r5
                goto L72
            L54:
                int r11 = r10.length()
                r0 = 0
            L59:
                if (r2 >= r11) goto L6e
                char r1 = r10.charAt(r2)
                int r1 = r1 + (-48)
                r3 = 9
                if (r1 < 0) goto L52
                if (r3 >= r1) goto L68
                goto L52
            L68:
                int r0 = r0 * 10
                int r0 = r0 + r1
                int r2 = r2 + 1
                goto L59
            L6e:
                java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            L72:
                if (r10 == 0) goto L7e
                int r10 = r10.intValue()
                kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory$KindWithArity r11 = new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory$KindWithArity
                r11.<init>(r6, r10)
                return r11
            L7e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory.Companion.m32429b(java.lang.String, kotlin.reflect.jvm.internal.impl.name.FqName):kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory$KindWithArity");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class KindWithArity {

        /* renamed from: a */
        @NotNull
        public final FunctionClassDescriptor.Kind f63842a;

        /* renamed from: b */
        public final int f63843b;

        public KindWithArity(@NotNull FunctionClassDescriptor.Kind kind, int i2) {
            this.f63842a = kind;
            this.f63843b = i2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof KindWithArity) {
                    KindWithArity kindWithArity = (KindWithArity) obj;
                    if (Intrinsics.m32174c(this.f63842a, kindWithArity.f63842a)) {
                        if (this.f63843b == kindWithArity.f63843b) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            FunctionClassDescriptor.Kind kind = this.f63842a;
            return ((kind != null ? kind.hashCode() : 0) * 31) + this.f63843b;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("KindWithArity(kind=");
            m24u.append(this.f63842a);
            m24u.append(", arity=");
            return C0000a.m18o(m24u, this.f63843b, ")");
        }
    }

    public BuiltInFictitiousFunctionClassFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        Intrinsics.m32180i(storageManager, "storageManager");
        Intrinsics.m32180i(module, "module");
        this.f63840a = storageManager;
        this.f63841b = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    /* renamed from: a */
    public Collection<ClassDescriptor> mo32425a(@NotNull FqName packageFqName) {
        Intrinsics.m32180i(packageFqName, "packageFqName");
        return EmptySet.f63146b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    /* renamed from: b */
    public boolean mo32426b(@NotNull FqName packageFqName, @NotNull Name name) {
        Intrinsics.m32180i(packageFqName, "packageFqName");
        String str = name.f65606b;
        Intrinsics.m32175d(str, "name.asString()");
        return (StringsKt.m33898X(str, "Function", false, 2, null) || StringsKt.m33898X(str, "KFunction", false, 2, null) || StringsKt.m33898X(str, "SuspendFunction", false, 2, null) || StringsKt.m33898X(str, "KSuspendFunction", false, 2, null)) && f63839c.m32429b(str, packageFqName) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    /* renamed from: c */
    public ClassDescriptor mo32427c(@NotNull ClassId classId) {
        Intrinsics.m32180i(classId, "classId");
        if (!classId.f65595c && !classId.m33194h()) {
            String str = classId.f65594b.f65597a.f65602a;
            Intrinsics.m32175d(str, "classId.relativeClassName.asString()");
            if (!StringsKt.m33922t(str, "Function", false, 2, null)) {
                return null;
            }
            FqName fqName = classId.f65593a;
            Intrinsics.m32175d(fqName, "classId.packageFqName");
            KindWithArity m32429b = f63839c.m32429b(str, fqName);
            if (m32429b != null) {
                FunctionClassDescriptor.Kind kind = m32429b.f63842a;
                int i2 = m32429b.f63843b;
                List<PackageFragmentDescriptor> mo32553E = this.f63841b.mo32545K(fqName).mo32553E();
                ArrayList arrayList = new ArrayList();
                for (Object obj : mo32553E) {
                    if (obj instanceof BuiltInsPackageFragment) {
                        arrayList.add(obj);
                    }
                }
                return new FunctionClassDescriptor(this.f63840a, (BuiltInsPackageFragment) CollectionsKt.m32044u(arrayList), kind, i2);
            }
        }
        return null;
    }
}
