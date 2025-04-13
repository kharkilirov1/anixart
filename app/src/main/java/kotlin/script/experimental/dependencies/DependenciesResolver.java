package kotlin.script.experimental.dependencies;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.script.dependencies.ScriptDependenciesResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: resolvers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver;", "Lkotlin/script/dependencies/ScriptDependenciesResolver;", "NoDependencies", "ResolveResult", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface DependenciesResolver extends ScriptDependenciesResolver {

    /* compiled from: resolvers.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public static final class DefaultImpls {
    }

    /* compiled from: resolvers.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$NoDependencies;", "Lkotlin/script/experimental/dependencies/DependenciesResolver;", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class NoDependencies implements DependenciesResolver {
    }

    /* compiled from: resolvers.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "", "Failure", "Success", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Success;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Failure;", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static abstract class ResolveResult {

        /* compiled from: resolvers.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Failure;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final /* data */ class Failure extends ResolveResult {

            /* renamed from: a */
            @NotNull
            public final List<ScriptReport> f66605a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull ScriptReport... scriptReportArr) {
                super(null);
                List<ScriptReport> m31957g = ArraysKt.m31957g(scriptReportArr);
                this.f66605a = m31957g;
            }

            public boolean equals(@Nullable Object obj) {
                if (this != obj) {
                    return (obj instanceof Failure) && Intrinsics.m32174c(this.f66605a, ((Failure) obj).f66605a);
                }
                return true;
            }

            public int hashCode() {
                List<ScriptReport> list = this.f66605a;
                if (list != null) {
                    return list.hashCode();
                }
                return 0;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Failure(reports=");
                m24u.append(this.f66605a);
                m24u.append(")");
                return m24u.toString();
            }
        }

        /* compiled from: resolvers.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult$Success;", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final /* data */ class Success extends ResolveResult {

            /* renamed from: a */
            @NotNull
            public final ScriptDependencies f66606a;

            /* renamed from: b */
            @NotNull
            public final List<ScriptReport> f66607b;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.m32174c(this.f66606a, success.f66606a) && Intrinsics.m32174c(this.f66607b, success.f66607b);
            }

            public int hashCode() {
                ScriptDependencies scriptDependencies = this.f66606a;
                int hashCode = (scriptDependencies != null ? scriptDependencies.hashCode() : 0) * 31;
                List<ScriptReport> list = this.f66607b;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Success(dependencies=");
                m24u.append(this.f66606a);
                m24u.append(", reports=");
                m24u.append(this.f66607b);
                m24u.append(")");
                return m24u.toString();
            }
        }

        public ResolveResult() {
        }

        public ResolveResult(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
