package com.swiftsoft.anixartd.parser.kodik;

import com.swiftsoft.anixartd.parser.Parser;
import com.yandex.metrica.YandexMetrica;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: KodikParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/kodik/KodikParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class KodikParser extends Parser {

    /* compiled from: KodikParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/kodik/KodikParser$Companion;", "", "", "KODIK_API_KEY", "Ljava/lang/String;", "KODIK_API_URL", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public KodikParser(@NotNull String str) {
        super(str, false);
    }

    @Override // com.swiftsoft.anixartd.parser.Parser
    /* renamed from: i */
    public void mo14181i() {
        List m33893S = StringsKt.m33893S(this.f25801a, new String[]{"d="}, false, 0, 6, null);
        String str = (String) m33893S.get(0);
        Intrinsics.m32179h(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        String m14174c = Parser.m14174c(this, "http://kodik.biz/api/video-links?p=56a768d08f43091901c44b54fe970049&link=" + StringsKt.m33891Q(StringsKt.m33907g0(str, length), "https://", "//", false, 4, null) + "&d=" + ((String) m33893S.get(1)), false, null, null, null, 30, null);
        if (m14174c.length() == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("error", "videoLinksContent is empty");
            YandexMetrica.reportEvent("Episode error", hashMap);
        }
        MatchResult m33870a = new Regex("\"360\":\\{\"[sS]rc\":\"(.*?)\"").m33870a(m14174c, 0);
        MatchResult m33870a2 = new Regex("\"480\":\\{\"[sS]rc\":\"(.*?)\"").m33870a(m14174c, 0);
        MatchResult m33870a3 = new Regex("\"720\":\\{\"[sS]rc\":\"(.*?)\"").m33870a(m14174c, 0);
        MatchResult m33870a4 = new Regex("\"1080\":\\{\"[sS]rc\":\"(.*?)\"").m33870a(m14174c, 0);
        Regex regex = new Regex("(https:\\/\\/|http:\\/\\/)");
        if (m33870a != null) {
            String str2 = m33870a.mo33868b().get(1);
            if (regex.m33870a(str2, 0) == null) {
                str2 = C0000a.m14k("https:", str2);
            }
            String str3 = str2;
            Parser.m14173b(this, "360p", m14184j(str3), false, 4, null);
            m14176a("360p", m14185k(str3));
        }
        if (m33870a2 != null) {
            String str4 = m33870a2.mo33868b().get(1);
            if (regex.m33870a(str4, 0) == null) {
                str4 = C0000a.m14k("https:", str4);
            }
            String str5 = str4;
            Parser.m14173b(this, "480p", m14184j(str5), false, 4, null);
            m14176a("480p", m14185k(str5));
        }
        if (m33870a3 != null) {
            String str6 = m33870a3.mo33868b().get(1);
            if (regex.m33870a(str6, 0) == null) {
                str6 = C0000a.m14k("https:", str6);
            }
            String str7 = str6;
            Parser.m14173b(this, "720p", m14184j(str7), false, 4, null);
            m14176a("720p", m14185k(str7));
        }
        if (m33870a4 != null) {
            String str8 = m33870a4.mo33868b().get(1);
            if (regex.m33870a(str8, 0) == null) {
                str8 = C0000a.m14k("https:", str8);
            }
            String str9 = str8;
            Parser.m14173b(this, "1080p", m14184j(str9), false, 4, null);
            m14176a("1080p", m14185k(str9));
        }
    }

    /* renamed from: j */
    public final String m14184j(String str) {
        return StringsKt.m33891Q(str, ":hls:hls.m3u8", ":hls:manifest.m3u8", false, 4, null);
    }

    /* renamed from: k */
    public final String m14185k(String str) {
        return StringsKt.m33891Q(StringsKt.m33891Q(str, ":hls:manifest.m3u8", "", false, 4, null), ":hls:hls.m3u8", "", false, 4, null);
    }
}
