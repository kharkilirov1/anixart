package org.jsoup.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Token;

/* loaded from: classes3.dex */
enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHtml;
            if (HtmlTreeBuilderState.m34872a(token)) {
                return true;
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
            } else {
                if (!token.m34896c()) {
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                    htmlTreeBuilder.f69273g = token;
                    return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                }
                Token.Doctype doctype = (Token.Doctype) token;
                DocumentType documentType = new DocumentType(htmlTreeBuilder.f69274h.m34888c(doctype.m34904i()), doctype.f69150f.toString(), doctype.f69151g.toString());
                documentType.m34747H(doctype.f69149e);
                htmlTreeBuilder.f69270d.m34753F(documentType);
                if (doctype.f69152h) {
                    htmlTreeBuilder.f69270d.f68962m = Document.QuirksMode.quirks;
                }
                htmlTreeBuilder.f69038l = htmlTreeBuilderState;
            }
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34899f()) {
                Token.StartTag startTag = (Token.StartTag) token;
                if (startTag.f69154e.equals("html")) {
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.BeforeHead;
                    return true;
                }
            }
            if (token.m34898e() && StringUtil.m34701c(((Token.EndTag) token).f69154e, Constants.f69093e)) {
                return m34879d(token, htmlTreeBuilder);
            }
            if (!token.m34898e()) {
                return m34879d(token, htmlTreeBuilder);
            }
            htmlTreeBuilder.m34862q(this);
            return false;
        }

        /* renamed from: d */
        public final boolean m34879d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Objects.requireNonNull(htmlTreeBuilder);
            Element element = new Element(htmlTreeBuilder.m34957i("html", htmlTreeBuilder.f69274h), null, null);
            htmlTreeBuilder.m34839H(element, null);
            htmlTreeBuilder.f69271e.add(element);
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHead;
            htmlTreeBuilder.f69038l = htmlTreeBuilderState;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html")) {
                return HtmlTreeBuilderState.InBody.mo34874c(token, htmlTreeBuilder);
            }
            if (token.m34899f()) {
                Token.StartTag startTag = (Token.StartTag) token;
                if (startTag.f69154e.equals("head")) {
                    htmlTreeBuilder.f69041o = htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InHead;
                    return true;
                }
            }
            if (token.m34898e() && StringUtil.m34701c(((Token.EndTag) token).f69154e, Constants.f69093e)) {
                htmlTreeBuilder.m34956h("head");
                return htmlTreeBuilder.mo34854f(token);
            }
            if (token.m34898e()) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            htmlTreeBuilder.m34956h("head");
            return htmlTreeBuilder.mo34854f(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.Text;
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            int ordinal = token.f69141a.ordinal();
            if (ordinal == 0) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (ordinal == 1) {
                Token.StartTag startTag = (Token.StartTag) token;
                String str = startTag.f69154e;
                if (str.equals("html")) {
                    return HtmlTreeBuilderState.InBody.mo34874c(token, htmlTreeBuilder);
                }
                if (StringUtil.m34701c(str, Constants.f69089a)) {
                    Element m34835D = htmlTreeBuilder.m34835D(startTag);
                    if (str.equals("base") && m34835D.mo34785n("href") && !htmlTreeBuilder.f69040n) {
                        String mo34782a = m34835D.mo34782a("href");
                        if (mo34782a.length() != 0) {
                            htmlTreeBuilder.f69272f = mo34782a;
                            htmlTreeBuilder.f69040n = true;
                            Document document = htmlTreeBuilder.f69270d;
                            Objects.requireNonNull(document);
                            document.m34758N(mo34782a);
                        }
                    }
                } else if (str.equals("meta")) {
                    htmlTreeBuilder.m34835D(startTag);
                } else if (str.equals("title")) {
                    htmlTreeBuilder.f69269c.m34944m(TokeniserState.Rcdata);
                    htmlTreeBuilder.f69039m = htmlTreeBuilder.f69038l;
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                    htmlTreeBuilder.m34832A(startTag);
                } else if (StringUtil.m34701c(str, Constants.f69090b)) {
                    HtmlTreeBuilderState.m34873b(startTag, htmlTreeBuilder);
                } else if (str.equals("noscript")) {
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InHeadNoscript;
                } else if (str.equals("script")) {
                    htmlTreeBuilder.f69269c.m34944m(TokeniserState.ScriptData);
                    htmlTreeBuilder.f69039m = htmlTreeBuilder.f69038l;
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                    htmlTreeBuilder.m34832A(startTag);
                } else {
                    if (str.equals("head")) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        return m34880d(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.m34838G();
                    htmlTreeBuilder.f69047u = false;
                    HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InTemplate;
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState2;
                    htmlTreeBuilder.f69044r.add(htmlTreeBuilderState2);
                }
            } else if (ordinal == 2) {
                String str2 = ((Token.EndTag) token).f69154e;
                if (str2.equals("head")) {
                    htmlTreeBuilder.m34842L();
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.AfterHead;
                } else {
                    if (StringUtil.m34701c(str2, Constants.f69091c)) {
                        return m34880d(token, htmlTreeBuilder);
                    }
                    if (!str2.equals("template")) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    if (htmlTreeBuilder.m34866u(str2) != null) {
                        htmlTreeBuilder.m34864s(true);
                        if (!str2.equals(htmlTreeBuilder.m34952a().f68981e.f69133c)) {
                            htmlTreeBuilder.m34862q(this);
                        }
                        htmlTreeBuilder.m34843M(str2);
                        htmlTreeBuilder.m34857l();
                        htmlTreeBuilder.m34844N();
                        htmlTreeBuilder.m34851U();
                    } else {
                        htmlTreeBuilder.m34862q(this);
                    }
                }
            } else {
                if (ordinal != 3) {
                    return m34880d(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.m34834C((Token.Comment) token);
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m34880d(Token token, TreeBuilder treeBuilder) {
            treeBuilder.m34955g("head");
            HtmlTreeBuilder htmlTreeBuilder = (HtmlTreeBuilder) treeBuilder;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
            } else {
                if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html")) {
                    HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InBody;
                    htmlTreeBuilder.f69273g = token;
                    return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
                }
                if (!token.m34898e() || !((Token.EndTag) token).f69154e.equals("noscript")) {
                    if (HtmlTreeBuilderState.m34872a(token) || token.m34895b() || (token.m34899f() && StringUtil.m34701c(((Token.StartTag) token).f69154e, Constants.f69094f))) {
                        htmlTreeBuilder.f69273g = token;
                        return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                    }
                    if (token.m34898e() && ((Token.EndTag) token).f69154e.equals("br")) {
                        htmlTreeBuilder.m34862q(this);
                        Token.Character character = new Token.Character();
                        character.f69144d = token.toString();
                        htmlTreeBuilder.m34833B(character);
                        return true;
                    }
                    if ((token.m34899f() && StringUtil.m34701c(((Token.StartTag) token).f69154e, Constants.f69085I)) || token.m34898e()) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    htmlTreeBuilder.m34862q(this);
                    Token.Character character2 = new Token.Character();
                    character2.f69144d = token.toString();
                    htmlTreeBuilder.m34833B(character2);
                    return true;
                }
                htmlTreeBuilder.m34842L();
                htmlTreeBuilder.f69038l = htmlTreeBuilderState;
            }
            return true;
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
            HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InBody;
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
                return true;
            }
            if (!token.m34899f()) {
                if (!token.m34898e()) {
                    m34881d(token, htmlTreeBuilder);
                    return true;
                }
                String str = ((Token.EndTag) token).f69154e;
                if (StringUtil.m34701c(str, Constants.f69092d)) {
                    m34881d(token, htmlTreeBuilder);
                    return true;
                }
                if (str.equals("template")) {
                    htmlTreeBuilder.m34846P(token, htmlTreeBuilderState);
                    return true;
                }
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            Token.StartTag startTag = (Token.StartTag) token;
            String str2 = startTag.f69154e;
            if (str2.equals("html")) {
                return htmlTreeBuilder.m34846P(token, htmlTreeBuilderState2);
            }
            if (str2.equals("body")) {
                htmlTreeBuilder.m34832A(startTag);
                htmlTreeBuilder.f69047u = false;
                htmlTreeBuilder.f69038l = htmlTreeBuilderState2;
                return true;
            }
            if (str2.equals("frameset")) {
                htmlTreeBuilder.m34832A(startTag);
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InFrameset;
                return true;
            }
            if (!StringUtil.m34701c(str2, Constants.f69095g)) {
                if (str2.equals("head")) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                m34881d(token, htmlTreeBuilder);
                return true;
            }
            htmlTreeBuilder.m34862q(this);
            Element element = htmlTreeBuilder.f69041o;
            htmlTreeBuilder.f69271e.add(element);
            htmlTreeBuilder.m34846P(token, htmlTreeBuilderState);
            htmlTreeBuilder.m34849S(element);
            return true;
        }

        /* renamed from: d */
        public final boolean m34881d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.m34956h("body");
            htmlTreeBuilder.f69047u = true;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            char c2;
            HtmlTreeBuilderState htmlTreeBuilderState;
            Element m34866u;
            FormElement formElement;
            int ordinal = token.f69141a.ordinal();
            if (ordinal == 0) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return m34883e(token, htmlTreeBuilder);
                }
                if (ordinal == 3) {
                    htmlTreeBuilder.m34834C((Token.Comment) token);
                } else if (ordinal == 4) {
                    Token.Character character = (Token.Character) token;
                    if (character.f69144d.equals(HtmlTreeBuilderState.f69075z)) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    if (htmlTreeBuilder.f69047u && HtmlTreeBuilderState.m34872a(character)) {
                        htmlTreeBuilder.m34847Q();
                        htmlTreeBuilder.m34833B(character);
                    } else {
                        htmlTreeBuilder.m34847Q();
                        htmlTreeBuilder.m34833B(character);
                        htmlTreeBuilder.f69047u = false;
                    }
                } else if (ordinal == 5 && htmlTreeBuilder.f69044r.size() > 0) {
                    HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InTemplate;
                    htmlTreeBuilder.f69273g = token;
                    return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
                }
                return true;
            }
            HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTable;
            Token.StartTag startTag = (Token.StartTag) token;
            String str = startTag.f69154e;
            Objects.requireNonNull(str);
            int hashCode = str.hashCode();
            if (hashCode == 97) {
                if (str.equals("a")) {
                    c2 = '\n';
                }
                c2 = 65535;
            } else if (hashCode != 98) {
                switch (hashCode) {
                    case -1644953643:
                        if (str.equals("frameset")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1377687758:
                        if (str.equals("button")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1191214428:
                        if (str.equals("iframe")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1134665583:
                        if (str.equals("keygen")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1010136971:
                        if (str.equals("option")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1003243718:
                        if (str.equals("textarea")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -906021636:
                        if (str.equals("select")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -891985998:
                        if (str.equals("strike")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -891980137:
                        if (str.equals("strong")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -80773204:
                        if (str.equals("optgroup")) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                        if (str.equals("i")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case C4632R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        if (str.equals("s")) {
                            c2 = '\r';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case C4632R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                        if (str.equals("u")) {
                            c2 = 14;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3152:
                        if (str.equals("br")) {
                            c2 = 15;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3200:
                        if (str.equals("dd")) {
                            c2 = 16;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3216:
                        if (str.equals("dt")) {
                            c2 = 17;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3240:
                        if (str.equals("em")) {
                            c2 = 18;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3338:
                        if (str.equals("hr")) {
                            c2 = 25;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3453:
                        if (str.equals("li")) {
                            c2 = 26;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3646:
                        if (str.equals("rp")) {
                            c2 = 27;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3650:
                        if (str.equals("rt")) {
                            c2 = 28;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3712:
                        if (str.equals("tt")) {
                            c2 = 29;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 97536:
                        if (str.equals("big")) {
                            c2 = 30;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 104387:
                        if (str.equals("img")) {
                            c2 = 31;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 111267:
                        if (str.equals("pre")) {
                            c2 = ' ';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 114276:
                        if (str.equals("svg")) {
                            c2 = '!';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 117511:
                        if (str.equals("wbr")) {
                            c2 = JsonFactory.DEFAULT_QUOTE_CHAR;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 118811:
                        if (str.equals("xmp")) {
                            c2 = '#';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3002509:
                        if (str.equals("area")) {
                            c2 = '$';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3029410:
                        if (str.equals("body")) {
                            c2 = '%';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3059181:
                        if (str.equals("code")) {
                            c2 = '&';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3148879:
                        if (str.equals("font")) {
                            c2 = '\'';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3148996:
                        if (str.equals("form")) {
                            c2 = '(';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3213227:
                        if (str.equals("html")) {
                            c2 = ')';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3344136:
                        if (str.equals("math")) {
                            c2 = '*';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3386833:
                        if (str.equals("nobr")) {
                            c2 = '+';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3536714:
                        if (str.equals("span")) {
                            c2 = ',';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 96620249:
                        if (str.equals("embed")) {
                            c2 = '-';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 100313435:
                        if (str.equals("image")) {
                            c2 = '.';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 100358090:
                        if (str.equals("input")) {
                            c2 = JsonPointer.SEPARATOR;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 109548807:
                        if (str.equals("small")) {
                            c2 = '0';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110115790:
                        if (str.equals("table")) {
                            c2 = '1';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 181975684:
                        if (str.equals("listing")) {
                            c2 = '2';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1973234167:
                        if (str.equals("plaintext")) {
                            c2 = '3';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2091304424:
                        if (str.equals("isindex")) {
                            c2 = '4';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2115613112:
                        if (str.equals("noembed")) {
                            c2 = '5';
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        switch (hashCode) {
                            case 3273:
                                if (str.equals("h1")) {
                                    c2 = 19;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3274:
                                if (str.equals("h2")) {
                                    c2 = 20;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3275:
                                if (str.equals("h3")) {
                                    c2 = 21;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3276:
                                if (str.equals("h4")) {
                                    c2 = 22;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3277:
                                if (str.equals("h5")) {
                                    c2 = 23;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3278:
                                if (str.equals("h6")) {
                                    c2 = 24;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                }
            } else {
                if (str.equals("b")) {
                    c2 = 11;
                }
                c2 = 65535;
            }
            switch (c2) {
                case 0:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                    ArrayList<Element> arrayList = htmlTreeBuilder.f69271e;
                    if (arrayList.size() != 1 && ((arrayList.size() <= 2 || arrayList.get(1).f68981e.f69133c.equals("body")) && htmlTreeBuilder.f69047u)) {
                        Element element = arrayList.get(1);
                        if (((Element) element.f69005b) != null) {
                            element.m34794z();
                        }
                        while (arrayList.size() > 1) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        htmlTreeBuilder.m34832A(startTag);
                        htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InFrameset;
                        return true;
                    }
                    return false;
                case 1:
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("button")) {
                        htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                        htmlTreeBuilder.m34955g("button");
                        htmlTreeBuilder.f69273g = startTag;
                        htmlTreeBuilder.f69038l.mo34874c(startTag, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder.m34847Q();
                        htmlTreeBuilder.m34832A(startTag);
                        htmlTreeBuilder.f69047u = false;
                    }
                    return true;
                case 2:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.f69047u = false;
                    HtmlTreeBuilderState.m34873b(startTag, htmlTreeBuilder);
                    return true;
                case 3:
                case 15:
                case 31:
                case '\"':
                case '$':
                case '-':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34835D(startTag);
                    htmlTreeBuilder.f69047u = false;
                    return true;
                case 4:
                case '\t':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34953b("option")) {
                        htmlTreeBuilder.m34955g("option");
                    }
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case 5:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34832A(startTag);
                    if (!startTag.f69162m) {
                        htmlTreeBuilder.f69269c.m34944m(TokeniserState.Rcdata);
                        htmlTreeBuilder.f69039m = htmlTreeBuilder.f69038l;
                        htmlTreeBuilder.f69047u = false;
                        htmlTreeBuilder.f69038l = HtmlTreeBuilderState.Text;
                    }
                    return true;
                case 6:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69047u = false;
                    if (!startTag.f69162m) {
                        HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder.f69038l;
                        if (htmlTreeBuilderState4.equals(htmlTreeBuilderState3) || htmlTreeBuilderState4.equals(HtmlTreeBuilderState.InCaption) || htmlTreeBuilderState4.equals(HtmlTreeBuilderState.InTableBody) || htmlTreeBuilderState4.equals(HtmlTreeBuilderState.InRow) || htmlTreeBuilderState4.equals(HtmlTreeBuilderState.InCell)) {
                            htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InSelectInTable;
                        } else {
                            htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InSelect;
                        }
                    }
                    return true;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 29:
                case 30:
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case '\'':
                case '0':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    Element m34832A = htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.m34856k(m34832A);
                    htmlTreeBuilder.f69043q.add(m34832A);
                    return true;
                case '\n':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34865t("a") != null) {
                        htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                        htmlTreeBuilder.m34955g("a");
                        Element m34866u2 = htmlTreeBuilder.m34866u("a");
                        if (m34866u2 != null) {
                            htmlTreeBuilder.m34848R(m34866u2);
                            htmlTreeBuilder.m34849S(m34866u2);
                        }
                    }
                    htmlTreeBuilder.m34847Q();
                    Element m34832A2 = htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.m34856k(m34832A2);
                    htmlTreeBuilder.f69043q.add(m34832A2);
                    return true;
                case 16:
                case 17:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.f69047u = false;
                    ArrayList<Element> arrayList2 = htmlTreeBuilder.f69271e;
                    int size = arrayList2.size() - 1;
                    int i2 = size >= 24 ? size - 24 : 0;
                    while (true) {
                        if (size >= i2) {
                            Element element2 = arrayList2.get(size);
                            if (StringUtil.m34701c(element2.f68981e.f69133c, Constants.f69099k)) {
                                htmlTreeBuilder.m34955g(element2.f68981e.f69133c);
                            } else if (!htmlTreeBuilder.m34840I(element2) || StringUtil.m34701c(element2.f68981e.f69133c, Constants.f69098j)) {
                                size--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    if (StringUtil.m34701c(htmlTreeBuilder.m34952a().f68981e.f69133c, Constants.f69097i)) {
                        htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                        htmlTreeBuilder.m34842L();
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case 25:
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34835D(startTag);
                    htmlTreeBuilder.f69047u = false;
                    return true;
                case 26:
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.f69047u = false;
                    ArrayList<Element> arrayList3 = htmlTreeBuilder.f69271e;
                    int size2 = arrayList3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            Element element3 = arrayList3.get(size2);
                            if (element3.f68981e.f69133c.equals("li")) {
                                htmlTreeBuilder.m34955g("li");
                            } else if (!htmlTreeBuilder.m34840I(element3) || StringUtil.m34701c(element3.f68981e.f69133c, Constants.f69098j)) {
                                size2--;
                            }
                        }
                    }
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case 27:
                case 28:
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34868w("ruby")) {
                        htmlTreeBuilder.m34864s(false);
                        if (!htmlTreeBuilder.m34953b("ruby")) {
                            htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                            for (int size3 = htmlTreeBuilder.f69271e.size() - 1; size3 >= 0 && !htmlTreeBuilder.f69271e.get(size3).f68981e.f69133c.equals("ruby"); size3--) {
                                htmlTreeBuilder.f69271e.remove(size3);
                            }
                        }
                        htmlTreeBuilder.m34832A(startTag);
                    }
                    return true;
                case ' ':
                case '2':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69268b.m34825u("\n");
                    htmlTreeBuilder.f69047u = false;
                    return true;
                case '!':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case '#':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.f69047u = false;
                    HtmlTreeBuilderState.m34873b(startTag, htmlTreeBuilder);
                    return true;
                case '%':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                    ArrayList<Element> arrayList4 = htmlTreeBuilder.f69271e;
                    if (arrayList4.size() != 1 && (arrayList4.size() <= 2 || arrayList4.get(1).f68981e.f69133c.equals("body"))) {
                        if (!(htmlTreeBuilder.m34866u("template") != null)) {
                            htmlTreeBuilder.f69047u = false;
                            if (startTag.m34914q() && (m34866u = htmlTreeBuilder.m34866u("body")) != null) {
                                Iterator<Attribute> it = startTag.f69163n.iterator();
                                while (it.hasNext()) {
                                    Attribute next = it.next();
                                    if (!m34866u.mo34785n(next.f68949b)) {
                                        m34866u.mo34767e().m34716G(next);
                                    }
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                case '(':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.f69042p != null) {
                        if (!(htmlTreeBuilder.m34866u("template") != null)) {
                            htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                            return false;
                        }
                    }
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34863r("p");
                        if (!"p".equals(htmlTreeBuilder.m34952a().f68981e.f69133c)) {
                            htmlTreeBuilder.m34862q(htmlTreeBuilder.f69038l);
                        }
                        htmlTreeBuilder.m34843M("p");
                    }
                    htmlTreeBuilder.m34836E(startTag, true, true);
                    return true;
                case ')':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                    if (!(htmlTreeBuilder.m34866u("template") != null)) {
                        if (htmlTreeBuilder.f69271e.size() > 0) {
                            Element element4 = htmlTreeBuilder.f69271e.get(0);
                            if (startTag.m34914q()) {
                                Iterator<Attribute> it2 = startTag.f69163n.iterator();
                                while (it2.hasNext()) {
                                    Attribute next2 = it2.next();
                                    if (!element4.mo34785n(next2.f68949b)) {
                                        element4.mo34767e().m34716G(next2);
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                case '*':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case '+':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    if (htmlTreeBuilder.m34868w("nobr")) {
                        htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                        htmlTreeBuilder.m34955g("nobr");
                        htmlTreeBuilder.m34847Q();
                    }
                    Element m34832A3 = htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.m34856k(m34832A3);
                    htmlTreeBuilder.f69043q.add(m34832A3);
                    return true;
                case ',':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    htmlTreeBuilder.m34832A(startTag);
                    return true;
                case '.':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34866u("svg") != null) {
                        htmlTreeBuilder.m34832A(startTag);
                        return true;
                    }
                    startTag.f69153d = "img";
                    startTag.f69154e = Normalizer.m34697a("img");
                    htmlTreeBuilder.f69273g = startTag;
                    return htmlTreeBuilder.f69038l.mo34874c(startTag, htmlTreeBuilder);
                case '/':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34847Q();
                    if (!htmlTreeBuilder.m34835D(startTag).mo34783c("type").equalsIgnoreCase("hidden")) {
                        htmlTreeBuilder.f69047u = false;
                    }
                    return true;
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.f69270d.f68962m != Document.QuirksMode.quirks && htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69047u = false;
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState3;
                    return true;
                case '3':
                    htmlTreeBuilderState = this;
                    if (htmlTreeBuilder.m34867v("p")) {
                        htmlTreeBuilder.m34955g("p");
                    }
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69269c.m34944m(TokeniserState.PLAINTEXT);
                    return true;
                case '4':
                    htmlTreeBuilderState = this;
                    htmlTreeBuilder.m34862q(htmlTreeBuilderState);
                    if (htmlTreeBuilder.f69042p == null) {
                        htmlTreeBuilder.m34956h("form");
                        if (startTag.m34913p("action") && (formElement = htmlTreeBuilder.f69042p) != null && startTag.m34913p("action")) {
                            formElement.mo34767e().m34715F("action", startTag.f69163n.m34723r("action"));
                        }
                        htmlTreeBuilder.m34956h("hr");
                        htmlTreeBuilder.m34956h("label");
                        String m34723r = startTag.m34913p("prompt") ? startTag.f69163n.m34723r("prompt") : "This is a searchable index. Enter search keywords: ";
                        Token.Character character2 = new Token.Character();
                        character2.f69144d = m34723r;
                        htmlTreeBuilder.f69273g = character2;
                        htmlTreeBuilder.f69038l.mo34874c(character2, htmlTreeBuilder);
                        Attributes attributes = new Attributes();
                        if (startTag.m34914q()) {
                            Iterator<Attribute> it3 = startTag.f69163n.iterator();
                            while (it3.hasNext()) {
                                Attribute next3 = it3.next();
                                if (!StringUtil.m34701c(next3.f68949b, Constants.f69102n)) {
                                    attributes.m34716G(next3);
                                }
                            }
                        }
                        attributes.m34715F("name", "isindex");
                        Token.StartTag startTag2 = htmlTreeBuilder.f69276j;
                        if (htmlTreeBuilder.f69273g == startTag2) {
                            Token.StartTag startTag3 = new Token.StartTag();
                            startTag3.f69153d = "input";
                            startTag3.f69163n = attributes;
                            startTag3.f69154e = Normalizer.m34697a("input");
                            htmlTreeBuilder.f69273g = startTag3;
                            htmlTreeBuilder.f69038l.mo34874c(startTag3, htmlTreeBuilder);
                        } else {
                            startTag2.mo34900g();
                            startTag2.f69153d = "input";
                            startTag2.f69163n = attributes;
                            startTag2.f69154e = Normalizer.m34697a("input");
                            htmlTreeBuilder.f69273g = startTag2;
                            htmlTreeBuilder.f69038l.mo34874c(startTag2, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.m34955g("label");
                        htmlTreeBuilder.m34956h("hr");
                        htmlTreeBuilder.m34955g("form");
                        return true;
                    }
                    return false;
                case '5':
                    HtmlTreeBuilderState.m34873b(startTag, htmlTreeBuilder);
                    htmlTreeBuilderState = this;
                    return true;
                default:
                    if (!((HashMap) Tag.f69125k).containsKey(str)) {
                        htmlTreeBuilder.m34832A(startTag);
                    } else if (StringUtil.m34701c(str, Constants.f69096h)) {
                        if (htmlTreeBuilder.m34867v("p")) {
                            htmlTreeBuilder.m34955g("p");
                        }
                        htmlTreeBuilder.m34832A(startTag);
                    } else {
                        if (StringUtil.m34701c(str, Constants.f69095g)) {
                            HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InHead;
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilderState5.mo34874c(token, htmlTreeBuilder);
                        }
                        if (StringUtil.m34701c(str, Constants.f69100l)) {
                            htmlTreeBuilder.m34847Q();
                            htmlTreeBuilder.m34832A(startTag);
                            htmlTreeBuilder.m34838G();
                            htmlTreeBuilder.f69047u = false;
                        } else if (StringUtil.m34701c(str, Constants.f69101m)) {
                            htmlTreeBuilder.m34835D(startTag);
                        } else {
                            if (StringUtil.m34701c(str, Constants.f69103o)) {
                                htmlTreeBuilder.m34862q(this);
                                return false;
                            }
                            htmlTreeBuilder.m34847Q();
                            htmlTreeBuilder.m34832A(startTag);
                        }
                    }
                    return true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return true;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m34882d(org.jsoup.parser.Token r7, org.jsoup.parser.HtmlTreeBuilder r8) {
            /*
                r6 = this;
                org.jsoup.parser.Token$EndTag r7 = (org.jsoup.parser.Token.EndTag) r7
                java.lang.String r7 = r7.f69154e
                java.util.ArrayList<org.jsoup.nodes.Element> r0 = r8.f69271e
                org.jsoup.nodes.Element r1 = r8.m34866u(r7)
                r2 = 0
                if (r1 != 0) goto L11
                r8.m34862q(r6)
                return r2
            L11:
                int r1 = r0.size()
                r3 = 1
                int r1 = r1 - r3
            L17:
                if (r1 < 0) goto L46
                java.lang.Object r4 = r0.get(r1)
                org.jsoup.nodes.Element r4 = (org.jsoup.nodes.Element) r4
                org.jsoup.parser.Tag r5 = r4.f68981e
                java.lang.String r5 = r5.f69133c
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L39
                r8.m34863r(r7)
                boolean r0 = r8.m34953b(r7)
                if (r0 != 0) goto L35
                r8.m34862q(r6)
            L35:
                r8.m34843M(r7)
                goto L46
            L39:
                boolean r4 = r8.m34840I(r4)
                if (r4 == 0) goto L43
                r8.m34862q(r6)
                return r2
            L43:
                int r1 = r1 + (-1)
                goto L17
            L46:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C69007.m34882d(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't wrap try/catch for region: R(13:36|(5:38|(1:40)|41|(2:43|44)(1:(10:63|(2:65|(3:67|(1:69)|70)(3:71|(1:73)|74))|75|(1:91)(1:78)|79|80|81|82|(2:84|85)(2:87|88)|86)(10:47|(1:49)(1:62)|50|(1:52)(1:61)|53|(1:55)|56|(1:58)|59|60))|45)|92|(0)|75|(0)|91|79|80|81|82|(0)(0)|86) */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x038d, code lost:
        
            r21.f69043q.add(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x03b7, code lost:
        
            return true;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:36:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0316  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x039e  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0292 A[SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m34883e(org.jsoup.parser.Token r20, org.jsoup.parser.HtmlTreeBuilder r21) {
            /*
                Method dump skipped, instructions count: 1144
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C69007.m34883e(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34894a()) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34897d()) {
                htmlTreeBuilder.m34862q(this);
                htmlTreeBuilder.m34842L();
                htmlTreeBuilder.f69038l = htmlTreeBuilder.f69039m;
                return htmlTreeBuilder.mo34854f(token);
            }
            if (!token.m34898e()) {
                return true;
            }
            htmlTreeBuilder.m34842L();
            htmlTreeBuilder.f69038l = htmlTreeBuilder.f69039m;
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
            if (token.m34894a() && StringUtil.m34701c(htmlTreeBuilder.m34952a().f68981e.f69133c, Constants.f69077A)) {
                htmlTreeBuilder.f69045s = new ArrayList();
                htmlTreeBuilder.f69039m = htmlTreeBuilder.f69038l;
                HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InTableText;
                htmlTreeBuilder.f69038l = htmlTreeBuilderState2;
                htmlTreeBuilder.f69273g = token;
                return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (!token.m34899f()) {
                if (!token.m34898e()) {
                    if (!token.m34897d()) {
                        m34884d(token, htmlTreeBuilder);
                        return true;
                    }
                    if (htmlTreeBuilder.m34953b("html")) {
                        htmlTreeBuilder.m34862q(this);
                    }
                    return true;
                }
                String str = ((Token.EndTag) token).f69154e;
                if (str.equals("table")) {
                    if (!htmlTreeBuilder.m34871z(str)) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    htmlTreeBuilder.m34843M("table");
                    htmlTreeBuilder.m34851U();
                } else {
                    if (StringUtil.m34701c(str, Constants.f69114z)) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        m34884d(token, htmlTreeBuilder);
                        return true;
                    }
                    htmlTreeBuilder.f69273g = token;
                    htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                }
                return true;
            }
            Token.StartTag startTag = (Token.StartTag) token;
            String str2 = startTag.f69154e;
            if (str2.equals("caption")) {
                htmlTreeBuilder.m34860o();
                htmlTreeBuilder.m34838G();
                htmlTreeBuilder.m34832A(startTag);
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InCaption;
            } else if (str2.equals("colgroup")) {
                htmlTreeBuilder.m34860o();
                htmlTreeBuilder.m34832A(startTag);
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InColumnGroup;
            } else {
                if (str2.equals("col")) {
                    htmlTreeBuilder.m34860o();
                    htmlTreeBuilder.m34956h("colgroup");
                    htmlTreeBuilder.f69273g = token;
                    return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
                }
                if (StringUtil.m34701c(str2, Constants.f69107s)) {
                    htmlTreeBuilder.m34860o();
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InTableBody;
                } else {
                    if (StringUtil.m34701c(str2, Constants.f69108t)) {
                        htmlTreeBuilder.m34860o();
                        htmlTreeBuilder.m34956h("tbody");
                        htmlTreeBuilder.f69273g = token;
                        return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
                    }
                    if (str2.equals("table")) {
                        htmlTreeBuilder.m34862q(this);
                        if (!htmlTreeBuilder.m34871z(str2)) {
                            return false;
                        }
                        htmlTreeBuilder.m34843M(str2);
                        if (htmlTreeBuilder.m34851U()) {
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.m34832A(startTag);
                        return true;
                    }
                    if (StringUtil.m34701c(str2, Constants.f69109u)) {
                        htmlTreeBuilder.f69273g = token;
                        return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                    }
                    if (!str2.equals("input")) {
                        if (!str2.equals("form")) {
                            m34884d(token, htmlTreeBuilder);
                            return true;
                        }
                        htmlTreeBuilder.m34862q(this);
                        if (htmlTreeBuilder.f69042p == null) {
                            if (!(htmlTreeBuilder.m34866u("template") != null)) {
                                htmlTreeBuilder.m34836E(startTag, false, false);
                            }
                        }
                        return false;
                    }
                    if (!startTag.m34914q() || !startTag.f69163n.m34723r("type").equalsIgnoreCase("hidden")) {
                        m34884d(token, htmlTreeBuilder);
                        return true;
                    }
                    htmlTreeBuilder.m34835D(startTag);
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean m34884d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.m34862q(this);
            htmlTreeBuilder.f69048v = true;
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
            htmlTreeBuilder.f69273g = token;
            htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
            htmlTreeBuilder.f69048v = false;
            return true;
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
            if (token.f69141a == Token.TokenType.Character) {
                Token.Character character = (Token.Character) token;
                if (character.f69144d.equals(HtmlTreeBuilderState.f69075z)) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                htmlTreeBuilder.f69045s.add(character.f69144d);
                return true;
            }
            if (htmlTreeBuilder.f69045s.size() > 0) {
                for (String str : htmlTreeBuilder.f69045s) {
                    if (StringUtil.m34702d(str)) {
                        Token.Character character2 = new Token.Character();
                        character2.f69144d = str;
                        htmlTreeBuilder.m34833B(character2);
                    } else {
                        htmlTreeBuilder.m34862q(this);
                        if (StringUtil.m34701c(htmlTreeBuilder.m34952a().f68981e.f69133c, Constants.f69077A)) {
                            htmlTreeBuilder.f69048v = true;
                            Token.Character character3 = new Token.Character();
                            character3.f69144d = str;
                            htmlTreeBuilder.f69273g = character3;
                            htmlTreeBuilderState.mo34874c(character3, htmlTreeBuilder);
                            htmlTreeBuilder.f69048v = false;
                        } else {
                            Token.Character character4 = new Token.Character();
                            character4.f69144d = str;
                            htmlTreeBuilder.f69273g = character4;
                            htmlTreeBuilderState.mo34874c(character4, htmlTreeBuilder);
                        }
                    }
                }
                htmlTreeBuilder.f69045s = new ArrayList();
            }
            HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder.f69039m;
            htmlTreeBuilder.f69038l = htmlTreeBuilderState2;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34898e()) {
                Token.EndTag endTag = (Token.EndTag) token;
                if (endTag.f69154e.equals("caption")) {
                    if (!htmlTreeBuilder.m34871z(endTag.f69154e)) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    htmlTreeBuilder.m34864s(false);
                    if (!htmlTreeBuilder.m34953b("caption")) {
                        htmlTreeBuilder.m34862q(this);
                    }
                    htmlTreeBuilder.m34843M("caption");
                    htmlTreeBuilder.m34857l();
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InTable;
                    return true;
                }
            }
            if ((token.m34899f() && StringUtil.m34701c(((Token.StartTag) token).f69154e, Constants.f69113y)) || (token.m34898e() && ((Token.EndTag) token).f69154e.equals("table"))) {
                htmlTreeBuilder.m34862q(this);
                if (htmlTreeBuilder.m34955g("caption")) {
                    return htmlTreeBuilder.mo34854f(token);
                }
                return true;
            }
            if (!token.m34898e() || !StringUtil.m34701c(((Token.EndTag) token).f69154e, Constants.f69086J)) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InBody);
            }
            htmlTreeBuilder.m34862q(this);
            return false;
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
        
            if (r7.equals("template") == false) goto L37;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo34874c(org.jsoup.parser.Token r11, org.jsoup.parser.HtmlTreeBuilder r12) {
            /*
                r10 = this;
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InHead
                boolean r1 = org.jsoup.parser.HtmlTreeBuilderState.m34872a(r11)
                r2 = 1
                if (r1 == 0) goto Lf
                org.jsoup.parser.Token$Character r11 = (org.jsoup.parser.Token.Character) r11
                r12.m34833B(r11)
                return r2
            Lf:
                org.jsoup.parser.Token$TokenType r1 = r11.f69141a
                int r1 = r1.ordinal()
                if (r1 == 0) goto Lb4
                java.lang.String r3 = "html"
                r4 = 0
                java.lang.String r5 = "template"
                r6 = 2
                if (r1 == r2) goto L70
                if (r1 == r6) goto L3f
                r0 = 3
                if (r1 == r0) goto L38
                r0 = 5
                if (r1 == r0) goto L2c
                boolean r11 = r10.m34875d(r11, r12)
                return r11
            L2c:
                boolean r0 = r12.m34953b(r3)
                if (r0 == 0) goto L33
                return r2
            L33:
                boolean r11 = r10.m34875d(r11, r12)
                return r11
            L38:
                org.jsoup.parser.Token$Comment r11 = (org.jsoup.parser.Token.Comment) r11
                r12.m34834C(r11)
                goto Lb7
            L3f:
                r1 = r11
                org.jsoup.parser.Token$EndTag r1 = (org.jsoup.parser.Token.EndTag) r1
                java.lang.String r1 = r1.f69154e
                java.util.Objects.requireNonNull(r1)
                boolean r3 = r1.equals(r5)
                if (r3 != 0) goto L6c
                java.lang.String r0 = "colgroup"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L5a
                boolean r11 = r10.m34875d(r11, r12)
                return r11
            L5a:
                boolean r11 = r12.m34953b(r1)
                if (r11 != 0) goto L64
                r12.m34862q(r10)
                return r4
            L64:
                r12.m34842L()
                org.jsoup.parser.HtmlTreeBuilderState r11 = org.jsoup.parser.HtmlTreeBuilderState.InTable
                r12.f69038l = r11
                goto Lb7
            L6c:
                r12.m34846P(r11, r0)
                goto Lb7
            L70:
                r1 = r11
                org.jsoup.parser.Token$StartTag r1 = (org.jsoup.parser.Token.StartTag) r1
                java.lang.String r7 = r1.f69154e
                java.util.Objects.requireNonNull(r7)
                r8 = -1
                int r9 = r7.hashCode()
                switch(r9) {
                    case -1321546630: goto L96;
                    case 98688: goto L8b;
                    case 3213227: goto L82;
                    default: goto L80;
                }
            L80:
                r4 = -1
                goto L9d
            L82:
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L89
                goto L80
            L89:
                r4 = 2
                goto L9d
            L8b:
                java.lang.String r3 = "col"
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L94
                goto L80
            L94:
                r4 = 1
                goto L9d
            L96:
                boolean r3 = r7.equals(r5)
                if (r3 != 0) goto L9d
                goto L80
            L9d:
                switch(r4) {
                    case 0: goto Lb0;
                    case 1: goto Lac;
                    case 2: goto La5;
                    default: goto La0;
                }
            La0:
                boolean r11 = r10.m34875d(r11, r12)
                return r11
            La5:
                org.jsoup.parser.HtmlTreeBuilderState r0 = org.jsoup.parser.HtmlTreeBuilderState.InBody
                boolean r11 = r12.m34846P(r11, r0)
                return r11
            Lac:
                r12.m34835D(r1)
                goto Lb7
            Lb0:
                r12.m34846P(r11, r0)
                goto Lb7
            Lb4:
                r12.m34862q(r10)
            Lb7:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C688112.mo34874c(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        /* renamed from: d */
        public final boolean m34875d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.m34953b("colgroup")) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            htmlTreeBuilder.m34842L();
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            htmlTreeBuilder.f69038l = htmlTreeBuilderState;
            htmlTreeBuilder.f69273g = token;
            htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int ordinal = token.f69141a.ordinal();
            if (ordinal == 1) {
                Token.StartTag startTag = (Token.StartTag) token;
                String str = startTag.f69154e;
                if (!str.equals("tr")) {
                    if (!StringUtil.m34701c(str, Constants.f69110v)) {
                        return StringUtil.m34701c(str, Constants.f69078B) ? m34877e(token, htmlTreeBuilder) : m34876d(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.m34862q(this);
                    htmlTreeBuilder.m34956h("tr");
                    return htmlTreeBuilder.mo34854f(startTag);
                }
                htmlTreeBuilder.m34859n();
                htmlTreeBuilder.m34832A(startTag);
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InRow;
            } else {
                if (ordinal != 2) {
                    return m34876d(token, htmlTreeBuilder);
                }
                String str2 = ((Token.EndTag) token).f69154e;
                if (!StringUtil.m34701c(str2, Constants.f69084H)) {
                    if (str2.equals("table")) {
                        return m34877e(token, htmlTreeBuilder);
                    }
                    if (!StringUtil.m34701c(str2, Constants.f69079C)) {
                        return m34876d(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                if (!htmlTreeBuilder.m34871z(str2)) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                htmlTreeBuilder.m34859n();
                htmlTreeBuilder.m34842L();
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InTable;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m34876d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
        }

        /* renamed from: e */
        public final boolean m34877e(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.m34871z("tbody") && !htmlTreeBuilder.m34871z("thead") && !htmlTreeBuilder.m34868w("tfoot")) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            htmlTreeBuilder.m34859n();
            htmlTreeBuilder.m34955g(htmlTreeBuilder.m34952a().f68981e.f69133c);
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTableBody;
            if (token.m34899f()) {
                Token.StartTag startTag = (Token.StartTag) token;
                String str = startTag.f69154e;
                if (StringUtil.m34701c(str, Constants.f69110v)) {
                    htmlTreeBuilder.m34861p();
                    htmlTreeBuilder.m34832A(startTag);
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.InCell;
                    htmlTreeBuilder.m34838G();
                    return true;
                }
                if (!StringUtil.m34701c(str, Constants.f69080D)) {
                    return m34878d(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.m34955g("tr")) {
                    return false;
                }
                htmlTreeBuilder.f69273g = token;
                return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
            }
            if (!token.m34898e()) {
                return m34878d(token, htmlTreeBuilder);
            }
            String str2 = ((Token.EndTag) token).f69154e;
            if (str2.equals("tr")) {
                if (!htmlTreeBuilder.m34871z(str2)) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                htmlTreeBuilder.m34861p();
                htmlTreeBuilder.m34842L();
                htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                return true;
            }
            if (str2.equals("table")) {
                if (!htmlTreeBuilder.m34955g("tr")) {
                    return false;
                }
                htmlTreeBuilder.f69273g = token;
                return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
            }
            if (!StringUtil.m34701c(str2, Constants.f69107s)) {
                if (!StringUtil.m34701c(str2, Constants.f69081E)) {
                    return m34878d(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (!htmlTreeBuilder.m34871z(str2) || !htmlTreeBuilder.m34871z("tr")) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            htmlTreeBuilder.m34861p();
            htmlTreeBuilder.m34842L();
            htmlTreeBuilder.f69038l = htmlTreeBuilderState;
            return true;
        }

        /* renamed from: d */
        public final boolean m34878d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InRow;
            HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InBody;
            if (!token.m34898e()) {
                if (!token.m34899f() || !StringUtil.m34701c(((Token.StartTag) token).f69154e, Constants.f69113y)) {
                    htmlTreeBuilder.f69273g = token;
                    return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.m34871z("td") && !htmlTreeBuilder.m34871z("th")) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                if (htmlTreeBuilder.m34871z("td")) {
                    htmlTreeBuilder.m34955g("td");
                } else {
                    htmlTreeBuilder.m34955g("th");
                }
                htmlTreeBuilder.f69273g = token;
                return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
            }
            String str = ((Token.EndTag) token).f69154e;
            if (StringUtil.m34701c(str, Constants.f69110v)) {
                if (!htmlTreeBuilder.m34871z(str)) {
                    htmlTreeBuilder.m34862q(this);
                    htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                    return false;
                }
                htmlTreeBuilder.m34864s(false);
                if (!htmlTreeBuilder.m34953b(str)) {
                    htmlTreeBuilder.m34862q(this);
                }
                htmlTreeBuilder.m34843M(str);
                htmlTreeBuilder.m34857l();
                htmlTreeBuilder.f69038l = htmlTreeBuilderState;
                return true;
            }
            if (StringUtil.m34701c(str, Constants.f69111w)) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (!StringUtil.m34701c(str, Constants.f69112x)) {
                htmlTreeBuilder.f69273g = token;
                return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
            }
            if (!htmlTreeBuilder.m34871z(str)) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (htmlTreeBuilder.m34871z("td")) {
                htmlTreeBuilder.m34955g("td");
            } else {
                htmlTreeBuilder.m34955g("th");
            }
            htmlTreeBuilder.f69273g = token;
            return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0065, code lost:
        
            if (r1.equals("optgroup") == false) goto L26;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo34874c(org.jsoup.parser.Token r13, org.jsoup.parser.HtmlTreeBuilder r14) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C688516.mo34874c(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34899f() && StringUtil.m34701c(((Token.StartTag) token).f69154e, Constants.f69083G)) {
                htmlTreeBuilder.m34862q(this);
                htmlTreeBuilder.m34843M("select");
                htmlTreeBuilder.m34851U();
                return htmlTreeBuilder.mo34854f(token);
            }
            if (token.m34898e()) {
                Token.EndTag endTag = (Token.EndTag) token;
                if (StringUtil.m34701c(endTag.f69154e, Constants.f69083G)) {
                    htmlTreeBuilder.m34862q(this);
                    if (!htmlTreeBuilder.m34871z(endTag.f69154e)) {
                        return false;
                    }
                    htmlTreeBuilder.m34843M("select");
                    htmlTreeBuilder.m34851U();
                    return htmlTreeBuilder.mo34854f(token);
                }
            }
            return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InSelect);
        }
    },
    InTemplate { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
            HtmlTreeBuilderState htmlTreeBuilderState2 = HtmlTreeBuilderState.InBody;
            int ordinal = token.f69141a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3 && ordinal != 4) {
                            if (ordinal == 5) {
                                if (!(htmlTreeBuilder.m34866u("template") != null)) {
                                    return true;
                                }
                                htmlTreeBuilder.m34862q(this);
                                htmlTreeBuilder.m34843M("template");
                                htmlTreeBuilder.m34857l();
                                htmlTreeBuilder.m34844N();
                                htmlTreeBuilder.m34851U();
                                if (htmlTreeBuilder.f69038l == HtmlTreeBuilderState.InTemplate || htmlTreeBuilder.f69044r.size() >= 12) {
                                    return true;
                                }
                                htmlTreeBuilder.f69273g = token;
                                return htmlTreeBuilder.f69038l.mo34874c(token, htmlTreeBuilder);
                            }
                        }
                    } else {
                        if (!((Token.EndTag) token).f69154e.equals("template")) {
                            htmlTreeBuilder.m34862q(this);
                            return false;
                        }
                        htmlTreeBuilder.f69273g = token;
                        htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                    }
                } else {
                    String str = ((Token.StartTag) token).f69154e;
                    if (!StringUtil.m34701c(str, Constants.f69087K)) {
                        if (StringUtil.m34701c(str, Constants.f69088L)) {
                            htmlTreeBuilder.m34844N();
                            HtmlTreeBuilderState htmlTreeBuilderState3 = HtmlTreeBuilderState.InTable;
                            htmlTreeBuilder.f69044r.add(htmlTreeBuilderState3);
                            htmlTreeBuilder.f69038l = htmlTreeBuilderState3;
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilderState3.mo34874c(token, htmlTreeBuilder);
                        }
                        if (str.equals("col")) {
                            htmlTreeBuilder.m34844N();
                            HtmlTreeBuilderState htmlTreeBuilderState4 = HtmlTreeBuilderState.InColumnGroup;
                            htmlTreeBuilder.f69044r.add(htmlTreeBuilderState4);
                            htmlTreeBuilder.f69038l = htmlTreeBuilderState4;
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilderState4.mo34874c(token, htmlTreeBuilder);
                        }
                        if (str.equals("tr")) {
                            htmlTreeBuilder.m34844N();
                            HtmlTreeBuilderState htmlTreeBuilderState5 = HtmlTreeBuilderState.InTableBody;
                            htmlTreeBuilder.f69044r.add(htmlTreeBuilderState5);
                            htmlTreeBuilder.f69038l = htmlTreeBuilderState5;
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilderState5.mo34874c(token, htmlTreeBuilder);
                        }
                        if (!str.equals("td") && !str.equals("th")) {
                            htmlTreeBuilder.m34844N();
                            htmlTreeBuilder.f69044r.add(htmlTreeBuilderState2);
                            htmlTreeBuilder.f69038l = htmlTreeBuilderState2;
                            htmlTreeBuilder.f69273g = token;
                            return htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.m34844N();
                        HtmlTreeBuilderState htmlTreeBuilderState6 = HtmlTreeBuilderState.InRow;
                        htmlTreeBuilder.f69044r.add(htmlTreeBuilderState6);
                        htmlTreeBuilder.f69038l = htmlTreeBuilderState6;
                        htmlTreeBuilder.f69273g = token;
                        return htmlTreeBuilderState6.mo34874c(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.f69273g = token;
                    htmlTreeBuilderState.mo34874c(token, htmlTreeBuilder);
                }
                return true;
            }
            htmlTreeBuilder.f69273g = token;
            htmlTreeBuilderState2.mo34874c(token, htmlTreeBuilder);
            return true;
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
            } else if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
            } else {
                if (token.m34896c()) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html")) {
                    return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InBody);
                }
                if (token.m34898e() && ((Token.EndTag) token).f69154e.equals("html")) {
                    Objects.requireNonNull(htmlTreeBuilder);
                    if (htmlTreeBuilder.m34866u("html") != null) {
                        htmlTreeBuilder.m34843M("html");
                    }
                    htmlTreeBuilder.f69038l = HtmlTreeBuilderState.AfterAfterBody;
                } else if (!token.m34897d()) {
                    htmlTreeBuilder.m34862q(this);
                    htmlTreeBuilder.m34850T();
                    return htmlTreeBuilder.mo34854f(token);
                }
            }
            return true;
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            Token.StartTag startTag;
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
            } else if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
            } else {
                if (token.m34896c()) {
                    htmlTreeBuilder.m34862q(this);
                    return false;
                }
                if (token.m34899f()) {
                    startTag = (Token.StartTag) token;
                    String str = startTag.f69154e;
                    Objects.requireNonNull(str);
                    switch (str) {
                        case "frameset":
                            htmlTreeBuilder.m34832A(startTag);
                            break;
                        case "html":
                            return htmlTreeBuilder.m34846P(startTag, HtmlTreeBuilderState.InBody);
                        case "frame":
                            htmlTreeBuilder.m34835D(startTag);
                            break;
                        case "noframes":
                            return htmlTreeBuilder.m34846P(startTag, HtmlTreeBuilderState.InHead);
                        default:
                            htmlTreeBuilder.m34862q(this);
                            return false;
                    }
                } else if (token.m34898e() && ((Token.EndTag) token).f69154e.equals("frameset")) {
                    if (htmlTreeBuilder.m34953b("html")) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    htmlTreeBuilder.m34842L();
                    if (!htmlTreeBuilder.m34953b("frameset")) {
                        htmlTreeBuilder.f69038l = HtmlTreeBuilderState.AfterFrameset;
                    }
                } else {
                    if (!token.m34897d()) {
                        htmlTreeBuilder.m34862q(this);
                        return false;
                    }
                    if (!htmlTreeBuilder.m34953b("html")) {
                        htmlTreeBuilder.m34862q(this);
                    }
                }
            }
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c()) {
                htmlTreeBuilder.m34862q(this);
                return false;
            }
            if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html")) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InBody);
            }
            if (token.m34898e() && ((Token.EndTag) token).f69154e.equals("html")) {
                htmlTreeBuilder.f69038l = HtmlTreeBuilderState.AfterAfterFrameset;
                return true;
            }
            if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("noframes")) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InHead);
            }
            if (token.m34897d()) {
                return true;
            }
            htmlTreeBuilder.m34862q(this);
            return false;
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c() || (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html"))) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InBody);
            }
            if (HtmlTreeBuilderState.m34872a(token)) {
                htmlTreeBuilder.m34833B((Token.Character) token);
                return true;
            }
            if (token.m34897d()) {
                return true;
            }
            htmlTreeBuilder.m34862q(this);
            htmlTreeBuilder.m34850T();
            return htmlTreeBuilder.mo34854f(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.m34895b()) {
                htmlTreeBuilder.m34834C((Token.Comment) token);
                return true;
            }
            if (token.m34896c() || HtmlTreeBuilderState.m34872a(token) || (token.m34899f() && ((Token.StartTag) token).f69154e.equals("html"))) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InBody);
            }
            if (token.m34897d()) {
                return true;
            }
            if (token.m34899f() && ((Token.StartTag) token).f69154e.equals("noframes")) {
                return htmlTreeBuilder.m34846P(token, HtmlTreeBuilderState.InHead);
            }
            htmlTreeBuilder.m34862q(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.24
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /* renamed from: c */
        public boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return true;
        }
    };


    /* renamed from: z */
    public static final String f69075z = String.valueOf((char) 0);

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$25 */
    public static /* synthetic */ class C689525 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69076a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f69076a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69076a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69076a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69076a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69076a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f69076a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class Constants {

        /* renamed from: a */
        public static final String[] f69089a = {"base", "basefont", "bgsound", "command", "link"};

        /* renamed from: b */
        public static final String[] f69090b = {"noframes", "style"};

        /* renamed from: c */
        public static final String[] f69091c = {"body", "br", "html"};

        /* renamed from: d */
        public static final String[] f69092d = {"body", "br", "html"};

        /* renamed from: e */
        public static final String[] f69093e = {"body", "br", "head", "html"};

        /* renamed from: f */
        public static final String[] f69094f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* renamed from: g */
        public static final String[] f69095g = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* renamed from: h */
        public static final String[] f69096h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* renamed from: i */
        public static final String[] f69097i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: j */
        public static final String[] f69098j = {"address", "div", "p"};

        /* renamed from: k */
        public static final String[] f69099k = {"dd", "dt"};

        /* renamed from: l */
        public static final String[] f69100l = {"applet", "marquee", "object"};

        /* renamed from: m */
        public static final String[] f69101m = {"param", "source", "track"};

        /* renamed from: n */
        public static final String[] f69102n = {"action", "name", "prompt"};

        /* renamed from: o */
        public static final String[] f69103o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: p */
        public static final String[] f69104p = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* renamed from: q */
        public static final String[] f69105q = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: r */
        public static final String[] f69106r = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: s */
        public static final String[] f69107s = {"tbody", "tfoot", "thead"};

        /* renamed from: t */
        public static final String[] f69108t = {"td", "th", "tr"};

        /* renamed from: u */
        public static final String[] f69109u = {"script", "style", "template"};

        /* renamed from: v */
        public static final String[] f69110v = {"td", "th"};

        /* renamed from: w */
        public static final String[] f69111w = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: x */
        public static final String[] f69112x = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: y */
        public static final String[] f69113y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: z */
        public static final String[] f69114z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: A */
        public static final String[] f69077A = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: B */
        public static final String[] f69078B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};

        /* renamed from: C */
        public static final String[] f69079C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};

        /* renamed from: D */
        public static final String[] f69080D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: E */
        public static final String[] f69081E = {"body", "caption", "col", "colgroup", "html", "td", "th"};

        /* renamed from: F */
        public static final String[] f69082F = {"input", "keygen", "textarea"};

        /* renamed from: G */
        public static final String[] f69083G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: H */
        public static final String[] f69084H = {"tbody", "tfoot", "thead"};

        /* renamed from: I */
        public static final String[] f69085I = {"head", "noscript"};

        /* renamed from: J */
        public static final String[] f69086J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: K */
        public static final String[] f69087K = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};

        /* renamed from: L */
        public static final String[] f69088L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    HtmlTreeBuilderState(C68781 c68781) {
    }

    /* renamed from: a */
    public static boolean m34872a(Token token) {
        if (token.m34894a()) {
            return StringUtil.m34702d(((Token.Character) token).f69144d);
        }
        return false;
    }

    /* renamed from: b */
    public static void m34873b(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.f69269c.m34944m(TokeniserState.Rawtext);
        htmlTreeBuilder.f69039m = htmlTreeBuilder.f69038l;
        htmlTreeBuilder.f69038l = Text;
        htmlTreeBuilder.m34832A(startTag);
    }

    /* renamed from: c */
    public abstract boolean mo34874c(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
