package kotlin.script.experimental.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: errorHandling.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultWithDiagnostics;", "R", "", "Failure", "Success", "Lkotlin/script/experimental/api/ResultWithDiagnostics$Success;", "Lkotlin/script/experimental/api/ResultWithDiagnostics$Failure;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ResultWithDiagnostics<R> {

    /* compiled from: errorHandling.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultWithDiagnostics$Failure;", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Failure extends ResultWithDiagnostics {

        /* renamed from: a */
        @NotNull
        public final List<ScriptDiagnostic> f66590a;

        public Failure(@NotNull List<ScriptDiagnostic> list) {
            super(null);
            this.f66590a = list;
        }

        @Override // kotlin.script.experimental.api.ResultWithDiagnostics
        @NotNull
        /* renamed from: a */
        public List<ScriptDiagnostic> mo33814a() {
            return this.f66590a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof Failure) && Intrinsics.m32174c(this.f66590a, ((Failure) obj).f66590a);
            }
            return true;
        }

        public int hashCode() {
            List<ScriptDiagnostic> list = this.f66590a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Failure(reports=");
            m24u.append(this.f66590a);
            m24u.append(")");
            return m24u.toString();
        }
    }

    /* compiled from: errorHandling.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultWithDiagnostics$Success;", "R", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Success<R> extends ResultWithDiagnostics<R> {

        /* renamed from: a */
        public final R f66591a;

        /* renamed from: b */
        @NotNull
        public final List<ScriptDiagnostic> f66592b;

        public Success(R r, @NotNull List<ScriptDiagnostic> list) {
            super(null);
            this.f66591a = r;
            this.f66592b = list;
        }

        @Override // kotlin.script.experimental.api.ResultWithDiagnostics
        @NotNull
        /* renamed from: a */
        public List<ScriptDiagnostic> mo33814a() {
            return this.f66592b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.m32174c(this.f66591a, success.f66591a) && Intrinsics.m32174c(this.f66592b, success.f66592b);
        }

        public int hashCode() {
            R r = this.f66591a;
            int hashCode = (r != null ? r.hashCode() : 0) * 31;
            List<ScriptDiagnostic> list = this.f66592b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Success(value=");
            m24u.append(this.f66591a);
            m24u.append(", reports=");
            m24u.append(this.f66592b);
            m24u.append(")");
            return m24u.toString();
        }
    }

    public ResultWithDiagnostics() {
    }

    @NotNull
    /* renamed from: a */
    public abstract List<ScriptDiagnostic> mo33814a();

    public ResultWithDiagnostics(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
