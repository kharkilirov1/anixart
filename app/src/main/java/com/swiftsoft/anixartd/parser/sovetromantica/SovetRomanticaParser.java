package com.swiftsoft.anixartd.parser.sovetromantica;

import com.swiftsoft.anixartd.parser.Parser;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: SovetRomanticaParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/sovetromantica/SovetRomanticaParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SovetRomanticaParser extends Parser {

    /* compiled from: SovetRomanticaParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/sovetromantica/SovetRomanticaParser$Companion;", "", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public SovetRomanticaParser(@NotNull String str) {
        super(str, false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.swiftsoft.anixartd.parser.Parser
    /* renamed from: i */
    public void mo14181i() {
        MatchResult m33870a = new Regex("\"file\":\"(.*?)\"").m33870a(Parser.m14174c(this, this.f25801a, false, null, null, null, 30, null), 0);
        if (m33870a != null) {
            String str = m33870a.mo33868b().get(1);
            MatchResult m33870a2 = new Regex("(.*/).*.m3u8").m33870a(str, 0);
            String str2 = m33870a2 != null ? m33870a2.mo33868b().get(1) : "";
            Sequence<MatchResult> m33869b = Regex.m33869b(new Regex("RESOLUTION=.*x(.*)\\n(.*)"), Parser.m14174c(this, str, false, null, null, m14180h(), 14, null), 0, 2);
            if (SequencesKt.m33854v(m33869b)) {
                return;
            }
            for (MatchResult matchResult : m33869b) {
                String str3 = matchResult.mo33868b().get(1);
                String str4 = matchResult.mo33868b().get(2);
                switch (str3.hashCode()) {
                    case 50733:
                        if (str3.equals("360")) {
                            Parser.m14173b(this, "360p", C0000a.m20q(new StringBuilder(), str2, str4), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 51756:
                        if (str3.equals("480")) {
                            Parser.m14173b(this, "480p", C0000a.m20q(new StringBuilder(), str2, str4), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 54453:
                        if (str3.equals("720")) {
                            Parser.m14173b(this, "720p", C0000a.m20q(new StringBuilder(), str2, str4), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 1507671:
                        if (str3.equals("1080")) {
                            Parser.m14173b(this, "1080p", C0000a.m20q(new StringBuilder(), str2, str4), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }
}
