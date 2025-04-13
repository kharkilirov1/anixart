package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class TreeBuilder {

    /* renamed from: a */
    public Parser f69267a;

    /* renamed from: b */
    public CharacterReader f69268b;

    /* renamed from: c */
    public Tokeniser f69269c;

    /* renamed from: d */
    public Document f69270d;

    /* renamed from: e */
    public ArrayList<Element> f69271e;

    /* renamed from: f */
    public String f69272f;

    /* renamed from: g */
    public Token f69273g;

    /* renamed from: h */
    public ParseSettings f69274h;

    /* renamed from: i */
    public Map<String, Tag> f69275i;

    /* renamed from: j */
    public Token.StartTag f69276j = new Token.StartTag();

    /* renamed from: k */
    public Token.EndTag f69277k = new Token.EndTag();

    /* renamed from: a */
    public Element m34952a() {
        int size = this.f69271e.size();
        return size > 0 ? this.f69271e.get(size - 1) : this.f69270d;
    }

    /* renamed from: b */
    public boolean m34953b(String str) {
        Element m34952a;
        return (this.f69271e.size() == 0 || (m34952a = m34952a()) == null || !m34952a.f68981e.f69133c.equals(str)) ? false : true;
    }

    /* renamed from: c */
    public abstract ParseSettings mo34852c();

    @ParametersAreNonnullByDefault
    /* renamed from: d */
    public void mo34853d(Reader reader, String str, Parser parser) {
        Validate.m34695h(reader, "String input must not be null");
        Validate.m34695h(str, "BaseURI must not be null");
        Validate.m34694g(parser);
        Document document = new Document(str);
        this.f69270d = document;
        document.f68961l = parser;
        this.f69267a = parser;
        this.f69274h = parser.f69124c;
        CharacterReader characterReader = new CharacterReader(reader, 32768);
        this.f69268b = characterReader;
        boolean z = parser.f69123b.f69117b > 0;
        if (z && characterReader.f69025i == null) {
            characterReader.f69025i = new ArrayList<>(409);
            characterReader.m34804D();
        } else if (!z) {
            characterReader.f69025i = null;
        }
        this.f69273g = null;
        this.f69269c = new Tokeniser(this.f69268b, parser.f69123b);
        this.f69271e = new ArrayList<>(32);
        this.f69275i = new HashMap();
        this.f69272f = str;
    }

    @ParametersAreNonnullByDefault
    /* renamed from: e */
    public Document m34954e(Reader reader, String str, Parser parser) {
        Token token;
        mo34853d(reader, str, parser);
        Tokeniser tokeniser = this.f69269c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        while (true) {
            if (tokeniser.f69179e) {
                StringBuilder sb = tokeniser.f69181g;
                if (sb.length() != 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    Token.Character character = tokeniser.f69186l;
                    character.f69144d = sb2;
                    tokeniser.f69180f = null;
                    token = character;
                } else {
                    String str2 = tokeniser.f69180f;
                    if (str2 != null) {
                        Token.Character character2 = tokeniser.f69186l;
                        character2.f69144d = str2;
                        tokeniser.f69180f = null;
                        token = character2;
                    } else {
                        tokeniser.f69179e = false;
                        token = tokeniser.f69178d;
                    }
                }
                mo34854f(token);
                token.mo34900g();
                if (token.f69141a == tokenType) {
                    this.f69268b.m34808d();
                    this.f69268b = null;
                    this.f69269c = null;
                    this.f69271e = null;
                    this.f69275i = null;
                    return this.f69270d;
                }
            } else {
                tokeniser.f69177c.mo34950f(tokeniser, tokeniser.f69175a);
            }
        }
    }

    /* renamed from: f */
    public abstract boolean mo34854f(Token token);

    /* renamed from: g */
    public boolean m34955g(String str) {
        Token token = this.f69273g;
        Token.EndTag endTag = this.f69277k;
        if (token == endTag) {
            Token.EndTag endTag2 = new Token.EndTag();
            endTag2.f69153d = str;
            endTag2.f69154e = ParseSettings.m34886a(str);
            return mo34854f(endTag2);
        }
        endTag.mo34900g();
        endTag.f69153d = str;
        endTag.f69154e = ParseSettings.m34886a(str);
        return mo34854f(endTag);
    }

    /* renamed from: h */
    public boolean m34956h(String str) {
        Token.StartTag startTag = this.f69276j;
        if (this.f69273g == startTag) {
            Token.StartTag startTag2 = new Token.StartTag();
            startTag2.f69153d = str;
            startTag2.f69154e = Normalizer.m34697a(str.trim());
            return mo34854f(startTag2);
        }
        startTag.mo34900g();
        startTag.f69153d = str;
        startTag.f69154e = Normalizer.m34697a(str.trim());
        return mo34854f(startTag);
    }

    /* renamed from: i */
    public Tag m34957i(String str, ParseSettings parseSettings) {
        Tag tag = this.f69275i.get(str);
        if (tag != null) {
            return tag;
        }
        Tag m34892a = Tag.m34892a(str, parseSettings);
        this.f69275i.put(str, m34892a);
        return m34892a;
    }
}
