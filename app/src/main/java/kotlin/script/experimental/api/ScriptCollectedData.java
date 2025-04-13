package kotlin.script.experimental.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.script.experimental.util.PropertiesCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: scriptData.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCollectedData;", "Lkotlin/script/experimental/util/PropertiesCollection;", "Companion", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ScriptCollectedData extends PropertiesCollection {

    /* compiled from: scriptData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptCollectedData$Companion;", "Lkotlin/script/experimental/api/ScriptCollectedDataKeys;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion implements ScriptCollectedDataKeys {
    }

    public ScriptCollectedData(@NotNull Map<PropertiesCollection.Key<?>, ? extends Object> map) {
        super(map);
    }
}
