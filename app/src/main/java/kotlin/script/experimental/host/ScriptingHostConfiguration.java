package kotlin.script.experimental.host;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.script.experimental.util.PropertiesCollection;

/* compiled from: scriptingEnvironment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/script/experimental/host/ScriptingHostConfiguration;", "Lkotlin/script/experimental/util/PropertiesCollection;", "Builder", "Companion", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ScriptingHostConfiguration extends PropertiesCollection {

    /* compiled from: scriptingEnvironment.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/host/ScriptingHostConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
    /* renamed from: kotlin.script.experimental.host.ScriptingHostConfiguration$1 */
    final class C67691 extends Lambda implements Function1<Builder, Unit> {
        static {
            new C67691();
        }

        public C67691() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Builder builder) {
            Builder receiver$0 = builder;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            return Unit.f63088a;
        }
    }

    /* compiled from: scriptingEnvironment.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/host/ScriptingHostConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
    /* renamed from: kotlin.script.experimental.host.ScriptingHostConfiguration$2 */
    final class C67702 extends Lambda implements Function1<Builder, Unit> {
        static {
            new C67702();
        }

        public C67702() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Builder builder) {
            Builder receiver$0 = builder;
            Intrinsics.m32180i(receiver$0, "receiver$0");
            return Unit.f63088a;
        }
    }

    /* compiled from: scriptingEnvironment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/host/ScriptingHostConfiguration$Builder;", "Lkotlin/script/experimental/host/ScriptingHostConfigurationKeys;", "Lkotlin/script/experimental/util/PropertiesCollection$Builder;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder extends PropertiesCollection.Builder implements ScriptingHostConfigurationKeys {
    }

    /* compiled from: scriptingEnvironment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/host/ScriptingHostConfiguration$Companion;", "Lkotlin/script/experimental/host/ScriptingHostConfigurationKeys;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion implements ScriptingHostConfigurationKeys {
    }
}
