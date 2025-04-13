package kotlin.script.experimental.dependencies;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: resolvers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport;", "", "Position", "Severity", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class ScriptReport {

    /* renamed from: a */
    @NotNull
    public final String f66613a;

    /* renamed from: b */
    @NotNull
    public final Severity f66614b;

    /* renamed from: c */
    @Nullable
    public final Position f66615c;

    /* compiled from: resolvers.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport$Position;", "", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Position {

        /* renamed from: a */
        public final int f66616a;

        /* renamed from: b */
        public final int f66617b;

        /* renamed from: c */
        @Nullable
        public final Integer f66618c;

        /* renamed from: d */
        @Nullable
        public final Integer f66619d;

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof Position) {
                    Position position = (Position) obj;
                    if (this.f66616a == position.f66616a) {
                        if (!(this.f66617b == position.f66617b) || !Intrinsics.m32174c(this.f66618c, position.f66618c) || !Intrinsics.m32174c(this.f66619d, position.f66619d)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i2 = ((this.f66616a * 31) + this.f66617b) * 31;
            Integer num = this.f66618c;
            int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f66619d;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Position(startLine=");
            m24u.append(this.f66616a);
            m24u.append(", startColumn=");
            m24u.append(this.f66617b);
            m24u.append(", endLine=");
            m24u.append(this.f66618c);
            m24u.append(", endColumn=");
            m24u.append(this.f66619d);
            m24u.append(")");
            return m24u.toString();
        }
    }

    /* compiled from: resolvers.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/dependencies/ScriptReport$Severity;", "", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum Severity {
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    public ScriptReport(String message, Severity severity, Position position, int i2) {
        Severity severity2 = (i2 & 2) != 0 ? Severity.ERROR : null;
        Intrinsics.m32180i(message, "message");
        Intrinsics.m32180i(severity2, "severity");
        this.f66613a = message;
        this.f66614b = severity2;
        this.f66615c = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptReport)) {
            return false;
        }
        ScriptReport scriptReport = (ScriptReport) obj;
        return Intrinsics.m32174c(this.f66613a, scriptReport.f66613a) && Intrinsics.m32174c(this.f66614b, scriptReport.f66614b) && Intrinsics.m32174c(this.f66615c, scriptReport.f66615c);
    }

    public int hashCode() {
        String str = this.f66613a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Severity severity = this.f66614b;
        int hashCode2 = (hashCode + (severity != null ? severity.hashCode() : 0)) * 31;
        Position position = this.f66615c;
        return hashCode2 + (position != null ? position.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScriptReport(message=");
        m24u.append(this.f66613a);
        m24u.append(", severity=");
        m24u.append(this.f66614b);
        m24u.append(", position=");
        m24u.append(this.f66615c);
        m24u.append(")");
        return m24u.toString();
    }
}
