package kotlin.script.experimental.dependencies;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: dependencies.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/ScriptDependencies;", "", "Companion", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class ScriptDependencies {

    /* renamed from: a */
    @Nullable
    public final File f66608a;

    /* renamed from: b */
    @NotNull
    public final List<File> f66609b;

    /* renamed from: c */
    @NotNull
    public final List<String> f66610c;

    /* renamed from: d */
    @NotNull
    public final List<File> f66611d;

    /* renamed from: e */
    @NotNull
    public final List<File> f66612e;

    /* compiled from: dependencies.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/ScriptDependencies$Companion;", "", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    static {
        new ScriptDependencies(null, null, null, null, null, 31);
    }

    public ScriptDependencies() {
        this(null, null, null, null, null, 31);
    }

    public ScriptDependencies(File file, List list, List list2, List list3, List list4, int i2) {
        EmptyList classpath = (i2 & 2) != 0 ? EmptyList.f63144b : null;
        EmptyList imports = (i2 & 4) != 0 ? EmptyList.f63144b : null;
        EmptyList sources = (i2 & 8) != 0 ? EmptyList.f63144b : null;
        EmptyList scripts = (i2 & 16) != 0 ? EmptyList.f63144b : null;
        Intrinsics.m32180i(classpath, "classpath");
        Intrinsics.m32180i(imports, "imports");
        Intrinsics.m32180i(sources, "sources");
        Intrinsics.m32180i(scripts, "scripts");
        this.f66608a = null;
        this.f66609b = classpath;
        this.f66610c = imports;
        this.f66611d = sources;
        this.f66612e = scripts;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptDependencies)) {
            return false;
        }
        ScriptDependencies scriptDependencies = (ScriptDependencies) obj;
        return Intrinsics.m32174c(this.f66608a, scriptDependencies.f66608a) && Intrinsics.m32174c(this.f66609b, scriptDependencies.f66609b) && Intrinsics.m32174c(this.f66610c, scriptDependencies.f66610c) && Intrinsics.m32174c(this.f66611d, scriptDependencies.f66611d) && Intrinsics.m32174c(this.f66612e, scriptDependencies.f66612e);
    }

    public int hashCode() {
        File file = this.f66608a;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f66609b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f66610c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<File> list3 = this.f66611d;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<File> list4 = this.f66612e;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScriptDependencies(javaHome=");
        m24u.append(this.f66608a);
        m24u.append(", classpath=");
        m24u.append(this.f66609b);
        m24u.append(", imports=");
        m24u.append(this.f66610c);
        m24u.append(", sources=");
        m24u.append(this.f66611d);
        m24u.append(", scripts=");
        m24u.append(this.f66612e);
        m24u.append(")");
        return m24u.toString();
    }
}
