package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: AgentPremain.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "DebugProbesTransformer", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@SuppressLint
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class AgentPremain {

    /* compiled from: AgentPremain.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DebugProbesTransformer implements ClassFileTransformer {
    }

    static {
        Object m31891a;
        try {
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m31891a = property == null ? null : Boolean.valueOf(Boolean.parseBoolean(property));
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        Boolean bool = (Boolean) (m31891a instanceof Result.Failure ? null : m31891a);
        if (bool != null) {
            bool.booleanValue();
        } else {
            DebugProbesImpl debugProbesImpl = DebugProbesImpl.f67427a;
            boolean z = DebugProbesImpl.f67429c;
        }
    }
}
