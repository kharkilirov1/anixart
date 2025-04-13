package com.swiftsoft.anixartd.parser.allvideo;

import com.swiftsoft.anixartd.parser.Parser;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: AllvideoParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/allvideo/AllvideoParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AllvideoParser extends Parser {

    /* compiled from: AllvideoParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/allvideo/AllvideoParser$Companion;", "", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public AllvideoParser(@NotNull String str) {
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
        MatchResult m33870a = new Regex("file:\"(.*?)\"").m33870a(Parser.m14174c(this, this.f25801a, false, null, null, m14180h(), 14, null), 0);
        if (m33870a != null) {
            Sequence<MatchResult> m33869b = Regex.m33869b(new Regex("\\[([0-9]*p)](.*?)(,|$)"), m33870a.mo33868b().get(1), 0, 2);
            if (SequencesKt.m33854v(m33869b)) {
                Parser.m14173b(this, "Default", m33870a.mo33868b().get(1), false, 4, null);
                return;
            }
            for (MatchResult matchResult : m33869b) {
                String str = matchResult.mo33868b().get(1);
                String str2 = matchResult.mo33868b().get(2);
                switch (str.hashCode()) {
                    case 1572835:
                        if (str.equals("360p")) {
                            Parser.m14173b(this, "360p", str2, false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 1604548:
                        if (str.equals("480p")) {
                            Parser.m14173b(this, "480p", str2, false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 1688155:
                        if (str.equals("720p")) {
                            Parser.m14173b(this, "720p", str2, false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 46737913:
                        if (str.equals("1080p")) {
                            Parser.m14173b(this, "1080p", str2, false, 4, null);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }
}
