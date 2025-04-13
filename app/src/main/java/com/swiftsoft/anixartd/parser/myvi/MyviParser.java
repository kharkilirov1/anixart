package com.swiftsoft.anixartd.parser.myvi;

import com.swiftsoft.anixartd.parser.Parser;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: MyviParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/myvi/MyviParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MyviParser extends Parser {

    /* compiled from: MyviParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/myvi/MyviParser$Companion;", "", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public MyviParser(@NotNull String str) {
        super(str, false);
    }

    @Override // com.swiftsoft.anixartd.parser.Parser
    /* renamed from: i */
    public void mo14181i() {
        MatchResult m33870a = new Regex("CreatePlayer\\(\"v=(.*?)\\\\u0026").m33870a(Parser.m14174c(this, this.f25801a, false, null, null, m14180h(), 14, null), 0);
        if (m33870a != null) {
            String defaultQualityLink = URLDecoder.decode(m33870a.mo33868b().get(1));
            Intrinsics.m32178g(defaultQualityLink, "defaultQualityLink");
            Parser.m14173b(this, "Default", defaultQualityLink, false, 4, null);
        }
    }
}
