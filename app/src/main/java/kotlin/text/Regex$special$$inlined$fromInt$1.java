package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Regex.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "kotlin/text/RegexKt$fromInt$1$1"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class Regex$special$$inlined$fromInt$1 extends Lambda implements Function1<RegexOption, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(RegexOption regexOption) {
        RegexOption regexOption2 = regexOption;
        return Boolean.valueOf((regexOption2.getF66898c() & 0) == regexOption2.getF66897b());
    }
}
