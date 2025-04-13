package com.swiftsoft.anixartd.parser.sibnet;

import com.swiftsoft.anixartd.parser.Parser;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: SibnetParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/sibnet/SibnetParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SibnetParser extends Parser {

    /* compiled from: SibnetParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/sibnet/SibnetParser$Companion;", "", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public SibnetParser(@NotNull String str) {
        super(str, false);
    }

    @Override // com.swiftsoft.anixartd.parser.Parser
    /* renamed from: i */
    public void mo14181i() {
        MatchResult m33870a = new Regex("src: \"(.*?)\"").m33870a(Parser.m14174c(this, this.f25801a, false, null, null, m14180h(), 14, null), 0);
        if (m33870a != null) {
            String m14k = C0000a.m14k("https://video.sibnet.ru", m33870a.mo33868b().get(1));
            String m14175e = Parser.m14175e(this, m14k, MapsKt.m32063h(new Pair("Referer", this.f25801a)), null, m14180h(), 4, null);
            if (m14175e != null) {
                String m14175e2 = Parser.m14175e(this, C0000a.m14k("https:", m14175e), null, null, m14180h(), 6, null);
                String m33891Q = m14175e2 != null ? StringsKt.m33891Q(m14175e2, ":443", "", false, 4, null) : null;
                m14k = m33891Q == null ? C0000a.m14k("https:", m14175e) : m33891Q;
            }
            Parser.m14173b(this, "Default", m14k, false, 4, null);
        }
    }
}
