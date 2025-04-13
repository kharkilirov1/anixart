package com.swiftsoft.anixartd.parser.mailru;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swiftsoft.anixartd.parser.Parser;
import com.swiftsoft.anixartd.parser.mailru.entity.Meta;
import com.swiftsoft.anixartd.parser.mailru.entity.Video;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: MailRuParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/mailru/MailRuParser;", "Lcom/swiftsoft/anixartd/parser/Parser;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MailRuParser extends Parser {

    /* compiled from: MailRuParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/mailru/MailRuParser$Companion;", "", "", "MAILRU_API_URL", "Ljava/lang/String;", "", "PROXY_ENABLED", "Z", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public MailRuParser(@NotNull String str) {
        super(str, false);
    }

    @Override // com.swiftsoft.anixartd.parser.Parser
    /* renamed from: i */
    public void mo14181i() {
        Map<String, String> map;
        Map<String, String> map2;
        MatchResult m33870a = new Regex("embed\\/([0-9]*)").m33870a(this.f25801a, 0);
        if (m33870a != null) {
            String m14k = C0000a.m14k("https://my.mail.ru/+/video/meta/", m33870a.mo33868b().get(1));
            map = EmptyMap.f63145b;
            map2 = EmptyMap.f63145b;
            Response m14179g = m14179g(m14k, true, map, map2, "");
            String str = m14179g.headers().get("Set-Cookie");
            if (str == null) {
                str = "";
            }
            this.f25802b = str;
            ResponseBody body = m14179g.body();
            String string = body != null ? body.string() : null;
            Object readValue = new ObjectMapper().readValue(string != null ? string : "", (Class<Object>) Meta.class);
            Intrinsics.m32178g(readValue, "ObjectMapper().readValue…ontent, Meta::class.java)");
            for (Video video : ((Meta) readValue).getVideos()) {
                if (StringsKt.m33922t(video.getKey(), "1080", false, 2, null)) {
                    StringBuilder m24u = C0000a.m24u("https:");
                    m24u.append(video.getUrl());
                    Parser.m14173b(this, "1080p", m24u.toString(), false, 4, null);
                } else if (StringsKt.m33922t(video.getKey(), "720", false, 2, null)) {
                    StringBuilder m24u2 = C0000a.m24u("https:");
                    m24u2.append(video.getUrl());
                    Parser.m14173b(this, "720p", m24u2.toString(), false, 4, null);
                } else if (StringsKt.m33922t(video.getKey(), "480", false, 2, null)) {
                    StringBuilder m24u3 = C0000a.m24u("https:");
                    m24u3.append(video.getUrl());
                    Parser.m14173b(this, "480p", m24u3.toString(), false, 4, null);
                } else if (StringsKt.m33922t(video.getKey(), "360", false, 2, null)) {
                    StringBuilder m24u4 = C0000a.m24u("https:");
                    m24u4.append(video.getUrl());
                    Parser.m14173b(this, "360p", m24u4.toString(), false, 4, null);
                }
            }
        }
    }
}
