package kotlin.script.dependencies;

import kotlin.Metadata;

/* compiled from: resolvers_deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/dependencies/ScriptDependenciesResolver;", "", "ReportSeverity", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface ScriptDependenciesResolver {

    /* compiled from: resolvers_deprecated.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public static final class DefaultImpls {
    }

    /* compiled from: resolvers_deprecated.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/dependencies/ScriptDependenciesResolver$ReportSeverity;", "", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum ReportSeverity {
        /* JADX INFO: Fake field, exist only in values array */
        FATAL,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR,
        /* JADX INFO: Fake field, exist only in values array */
        WARNING,
        /* JADX INFO: Fake field, exist only in values array */
        INFO,
        /* JADX INFO: Fake field, exist only in values array */
        DEBUG
    }
}
