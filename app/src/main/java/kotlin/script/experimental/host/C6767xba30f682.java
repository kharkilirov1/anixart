package kotlin.script.experimental.host;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.script.experimental.api.ScriptCompilationConfiguration;
import p000a.C0000a;

/* compiled from: configurationFromTemplate.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"scriptConfigInstance", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration;", "kclass", "Lkotlin/reflect/KClass;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* renamed from: kotlin.script.experimental.host.ConfigurationFromTemplateKt$createCompilationConfigurationFromTemplate$2 */
/* loaded from: classes3.dex */
final class C6767xba30f682 extends Lambda implements Function1<KClass<? extends ScriptCompilationConfiguration>, ScriptCompilationConfiguration> {
    static {
        new C6767xba30f682();
    }

    public C6767xba30f682() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public ScriptCompilationConfiguration invoke(KClass<? extends ScriptCompilationConfiguration> kClass) {
        KClass<? extends ScriptCompilationConfiguration> kclass = kClass;
        Intrinsics.m32180i(kclass, "kclass");
        try {
            ScriptCompilationConfiguration mo32167f = kclass.mo32167f();
            return mo32167f != null ? mo32167f : (ScriptCompilationConfiguration) ConfigurationFromTemplateKt.m33815a(kclass);
        } catch (Throwable th) {
            StringBuilder m24u = C0000a.m24u("Illegal argument compilationConfiguration of the KotlinScript annotation: expecting an object or default-constructed class derived from ScriptCompilationConfiguration: ");
            m24u.append(th.getMessage());
            throw new IllegalArgumentException(m24u.toString(), th);
        }
    }
}
