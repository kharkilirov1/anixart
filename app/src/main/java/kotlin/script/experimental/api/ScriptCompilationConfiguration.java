package kotlin.script.experimental.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.script.experimental.util.PropertiesCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: scriptCompilation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCompilationConfiguration;", "Lkotlin/script/experimental/util/PropertiesCollection;", "Builder", "Companion", "Default", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class ScriptCompilationConfiguration extends PropertiesCollection {

    /* compiled from: scriptCompilation.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
    /* renamed from: kotlin.script.experimental.api.ScriptCompilationConfiguration$1 */
    final class C67611 extends Lambda implements Function1<Builder, Unit> {

        /* renamed from: b */
        public static final C67611 f66593b = new C67611();

        public C67611() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Builder builder) {
            Builder receiver$0 = builder;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            return Unit.f63088a;
        }
    }

    /* compiled from: scriptCompilation.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
    /* renamed from: kotlin.script.experimental.api.ScriptCompilationConfiguration$2 */
    final class C67622 extends Lambda implements Function1<Builder, Unit> {
        static {
            new C67622();
        }

        public C67622() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Builder builder) {
            Builder receiver$0 = builder;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            return Unit.f63088a;
        }
    }

    /* compiled from: scriptCompilation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Builder;", "Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;", "Lkotlin/script/experimental/util/PropertiesCollection$Builder;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder extends PropertiesCollection.Builder implements ScriptCompilationConfigurationKeys {
        public Builder(@NotNull Iterable<? extends ScriptCompilationConfiguration> iterable) {
            super(iterable);
        }
    }

    /* compiled from: scriptCompilation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Companion;", "Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion implements ScriptCompilationConfigurationKeys {
    }

    /* compiled from: scriptCompilation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Default;", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Default extends ScriptCompilationConfiguration {
        static {
            new Default();
        }

        public Default() {
            super(null, 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ScriptCompilationConfiguration(kotlin.jvm.functions.Function1 r2, int r3) {
        /*
            r1 = this;
            r2 = r3 & 1
            if (r2 == 0) goto L7
            kotlin.script.experimental.api.ScriptCompilationConfiguration$1 r2 = kotlin.script.experimental.api.ScriptCompilationConfiguration.C67611.f66593b
            goto L8
        L7:
            r2 = 0
        L8:
            java.lang.String r3 = "body"
            kotlin.jvm.internal.Intrinsics.m32180i(r2, r3)
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.f63144b
            kotlin.script.experimental.api.ScriptCompilationConfiguration$Builder r0 = new kotlin.script.experimental.api.ScriptCompilationConfiguration$Builder
            r0.<init>(r3)
            r2.invoke(r0)
            java.util.Map<kotlin.script.experimental.util.PropertiesCollection$Key<?>, java.lang.Object> r2 = r0.f66671a
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.script.experimental.api.ScriptCompilationConfiguration.<init>(kotlin.jvm.functions.Function1, int):void");
    }
}
